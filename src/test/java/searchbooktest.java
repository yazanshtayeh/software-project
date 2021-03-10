import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class searchbooktest {

    library books=new library();
    ArrayList<book>title =new ArrayList<>();
    ArrayList<book>author =new ArrayList<>();
    ArrayList<book>isbn =new ArrayList<>();


    @Given("the user enterd a {string} for title")
    public void the_user_enterd_a_for_title(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user sareach for a book by title {string}")
    public void the_user_sareach_for_a_book_by_title(String string) {
        title=books.searchByTitle(string);
    }

    @Then("a list of all books that have the title should be printed on the console")
    public void a_list_of_all_books_that_have_the_title_should_be_printed_on_the_console() {

        if(title.isEmpty()){
            System.out.println("library is empty");
            assertFalse(true);

        }
        else{
            System.out.println("title\tauthor\tISBN\tsignture\n");
            for(int i=0;i<title.size();i++)
                title.get(i).print();}
            assertTrue(false);

    }

    @Given("the user enterd a {string} for author")
    public void the_user_enterd_a_for_author(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user sareach for a book by author {string}")
    public void the_user_sareach_for_a_book_by_author(String string) {
       author=books.searchByAuthor(string);
    }

    @Then("a list of all books that have the author should be printed on the console")
    public void a_list_of_all_books_that_have_the_author_should_be_printed_on_the_console() {
        if(author.isEmpty()){
            System.out.println("library is empty");
            assertFalse(true);

        }
        else{
            System.out.println("title\tauthor\tISBN\tsignture\n");
            for(int i=0;i<author.size();i++)
                author.get(i).print();
        }
        assertTrue(false);
    }

    @Given("the user enterd a {string} for ISBN")
    public void the_user_enterd_a_for_isbn(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user sareach for a book by ISBN {string}")
    public void the_user_sareach_for_a_book_by_isbn(String string) {
        isbn=books.searchByISBN(string);
    }

    @Then("a list of all books that have the ISBN should be printed on the console")
    public void a_list_of_all_books_that_have_the_isbn_should_be_printed_on_the_console() {
        if(isbn.isEmpty()){
            System.out.println("library is empty");
            assertFalse(true);

        }
        else{
            System.out.println("title\tauthor\tISBN\tsignture\n");
            for(int i=0;i<isbn.size();i++)
                isbn.get(i).print();}
        assertTrue(false);
    }


}
