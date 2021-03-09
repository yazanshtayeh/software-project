import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
public class addbooktest {
    book b;
    ArrayList <book>lib;
    @Given("{string} is logged in")
    public void is_logged_in(String string) {

    }
    @Given("admin is not logged in")
    public void admin_is_not_logged_in() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("{string} and {string} and {string} is filled")
    public void and_and_is_filled(String title, String author, String signture) {
        book.title=title;
        book.author=author;
        book.signture=signture;
    }

    @When("{string} is filled and valid")
    public void is_filled_and_valid(String ISBN) {
        int sum=0;
        char ar[]=ISBN.toCharArray();
        assertFalse( ar.length!=10);
        for(int i = 0; i<10; i++){
            sum+=ar[10-i]*i;
        }
        double avg =sum/11;
        assertTrue(avg==(int) avg);
    }

    @When("{string} is pressed")
    public void is_pressed(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("add the {string} information to the library")
    public void add_the_information_to_the_library(String string) {
        lib.add(b);
    }

}
