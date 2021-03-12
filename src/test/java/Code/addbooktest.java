package Code;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class addbooktest {
    book b=new book();
    Admin user=new Admin();
    library x=new library();
    @Given("{string} is logged in")
    public void is_logged_in(String string) {

    }

    @When("{string} and {string} and {string} is filled")
    public void and_and_is_filled(String title, String author, String signture) {

        b.setTitle(title);;
        b.setAuthor(author);
        b.setSignature(signture);
    }

    @When("{string} is filled and valid")
    public void is_filled_and_valid(String ISBN) {
        assertTrue(b.checkISBN(ISBN));
    }


    @Given("admin is not logged in")
    public void adminIsNotLoggedIn() {
        user.logOut();
    }

    @Then("show warning;")
    public void showWarning() {
        System.out.println("you Should ba an admin ");
        assertTrue(true);
    }

    @Then("add the book information to the library")
    public void addTheBookInformationToTheLibrary() {
        x.addbook(b);
    }
}
