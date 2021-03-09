import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class addbooktest {
    book b=new book();
    ArrayList<book> lib = new ArrayList<>();
    boolean  flag = false;

    @Given("{string} is logged in")
    public void is_logged_in(String string) {
        flag = true;
    }

    @When("{string} and {string} and {string} is filled")
    public void and_and_is_filled(String title, String author, String signture) {
        book.title = title;
        book.author = author;
        book.signture = signture;
    }

    @When("{string} is filled and valid")
    public void is_filled_and_valid(String ISBN) {
        assertTrue(b.checkISBN(ISBN));
    }

    @When("{string} is pressed")
    public void is_pressed(String string) {

    }

    @Then("add the {string} information to the library")
    public void add_the_information_to_the_library(String string) {


        lib.add(b);
    }


    @Given("admin is not logged in")
    public void adminIsNotLoggedIn() {
    }

    @Then("show warning;")
    public void showWarning() {
        System.out.println("you Should ba an admin ");
    }
}
