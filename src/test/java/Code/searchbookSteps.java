package Code;

import Code.book;
import Code.library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import io.cucumber.datatable.DataTable;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class searchbookSteps {
    Admin user =new Admin();
    library lib = new library();
    ArrayList<book> title = new ArrayList<>();
    ArrayList<book> author = new ArrayList<>();
    ArrayList<book> isbn = new ArrayList<>();
    boolean Assert_title = false;
    boolean Assert_author = false;
    boolean Assert_isbn = false;
    List<String> data;

    @Given("those books are contained in the library")
    public void thoseBooksAreContainedInTheLibrary(DataTable table) {
        data=table.column(0);
        for(int i =0;i<data.size();i++){
            String[] specs=data.get(i).split("-");
            lib.addbook(specs[0],specs[1],specs[2],specs[3]);
        }
//        for(int i=0;i<lib.books.size();i++){
//            System.out.println(lib.books.get(i).getTitle()+lib.books.get(i).getAuthor()+lib.books.get(i).getISBN()+lib.books.get(i).getSignature());
//        }
    }


    @When("the user search for a book by title {string}")
    public void the_user_search_for_a_book_by_title(String string) {
        title = lib.searchByTitle(string);
    }

    @Then("a list of all books that have the title should be printed on the console")
    public void a_list_of_all_books_that_have_the_title_should_be_printed_on_the_console() {
        if (title.isEmpty()) {
            System.out.println("library is empty");
            Assert_title = false;
        } else {
            System.out.println("title\tauthor\tISBN\tsignature\n");
            for (int i = 0; i < title.size(); i++)
                title.get(i).print();
            Assert_title = true;
        }
        assertTrue(Assert_title);
    }

    @Given("the user entered a {string} for author")
    public void the_user_entered_a_for_author(String string) {

    }

    @When("the user search for a book by author {string}")
    public void the_user_search_for_a_book_by_author(String string) {
        author = lib.searchByAuthor(string);
        if (author.isEmpty()) {
            System.out.println("library is empty");
            Assert_author = false;
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

    }

    @When("the user search for a book by ISBN {string}")
    public void the_user_search_for_a_book_by_isbn(String string) {
        isbn = lib.searchByISBN(string);
        if (isbn.isEmpty()) {
            System.out.println("library is empty");
            Assert_isbn = false;
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

    @Given("the user entered a substring for book")
    public void theUserEnteredASubstringForBook() {

    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
        user.setLogged(true);
    }

    @Then("the searched books should be empty and show a message saying so")
    public void theSearchedBooksShouldBeEmptyAndShowAMessageSayingSo() {
        System.out.println("there is no such book with this info");
        assertTrue(isbn.isEmpty());
    }
}
