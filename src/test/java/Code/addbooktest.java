package Code;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class addbooktest {
    book b=new book();

    @Given("{string} is logged in")
    public void is_logged_in(String string) {
        logintest.admin.isLogged() = true;
    }

    @When("{string} and {string} and {string} is filled")
    public void and_and_is_filled(String title, String author, String signture) {
        book.setTitle(title);;
        book.setAuthor(author);
        book.setSignture(signture);
    }

    @When("{string} is filled and valid")
    public void is_filled_and_valid(String ISBN) {
        assertTrue(b.checkISBN(ISBN));
    }

    @When("{string} is pressed")
    public void is_pressed(String string) {

    }




    @Given("admin is not logged in")
    public void adminIsNotLoggedIn() {
        logintest.flag=false;
    }

    @Then("show warning;")
    public void showWarning() {
        System.out.println("you Should ba an admin ");
        assertTrue(true);
    }

    @Then("add the book information to the library")
    public void addTheBookInformationToTheLibrary() {
        library.addbook(b);
    }
}
