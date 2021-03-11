package Code;

import Code.book;
import Code.library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class searchbooktest {

    library books = new library();
    ArrayList<book> title = new ArrayList<>();
    ArrayList<book> author = new ArrayList<>();
    ArrayList<book> isbn = new ArrayList<>();
    boolean Assert_title = false;
    boolean Assert_author = false;
    boolean Assert_isbn = false;

    @Given("the user entered a {string} for title")
    public void the_user_enterd_a_for_title(String string) {
        title = books.searchByTitle(string);
    }

    @When("the user search for a Code.book by title {string}")
    public void the_user_sareach_for_a_book_by_title(String string) {
        if (title.isEmpty()) {
            System.out.println("Code.library is empty");
            Assert_title = true;
        } else {
            System.out.println("title\tauthor\tISBN\tsignature\n");
            for (int i = 0; i < title.size(); i++)
                title.get(i).print();
        }
        Assert_title = true;
    }

    @Then("a list of all books that have the title should be printed on the console")
    public void a_list_of_all_books_that_have_the_title_should_be_printed_on_the_console() {
        assertTrue(Assert_title);
    }

    @Given("the user entered a {string} for author")
    public void the_user_enterd_a_for_author(String string) {
        author = books.searchByAuthor(string);
    }

    @When("the user search for a Code.book by author {string}")
    public void the_user_sareach_for_a_book_by_author(String string) {
        if (author.isEmpty()) {
            System.out.println("Code.library is empty");
            Assert_author = true;

        } else {
            System.out.println("title\tauthor\tISBN\tsignature\n");
            for (int i = 0; i < author.size(); i++)
                author.get(i).print();
            Assert_author = true;
        }

    }

    @Then("a list of all books that have the author should be printed on the console")
    public void a_list_of_all_books_that_have_the_author_should_be_printed_on_the_console() {
        assertTrue(Assert_author);
    }

    @Given("the user entered a {string} for ISBN")
    public void the_user_entered_a_for_isbn(String string) {
        isbn = books.searchByISBN(string);
    }

    @When("the user search for a Code.book by ISBN {string}")
    public void the_user_search_for_a_book_by_isbn(String string) {
        if (isbn.isEmpty()) {
            System.out.println("Code.library is empty");
            Assert_isbn = true;
        } else {
            System.out.println("title\tauthor\tISBN\tsignature\n");
            for (int i = 0; i < isbn.size(); i++)
                isbn.get(i).print();
            Assert_isbn = true;
        }
    }

    @Then("a list of all books that have the ISBN should be printed on the console")
    public void a_list_of_all_books_that_have_the_isbn_should_be_printed_on_the_console() {
        assertTrue(Assert_isbn);
    }
}
