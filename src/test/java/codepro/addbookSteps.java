package codepro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class addbookSteps {
    book b=new book();
    Admin user=new Admin();
    library x=new library();
    boolean correct;


    @Given("the admin is logged in")
    public void theAdminIsLoggedIn() {
        user.login(123,123);
    }


    @When("{string} and {string} and {string} is filled")
    public void and_and_is_filled(String title, String author, String signture) {
        b.setTitle(title);;
        b.setAuthor(author);
        b.setSignature(signture);
    }
    @When("{string} is filled and valid")
    public void is_filled_and_valid(String ISBN) {
        if(b.checkISBN(ISBN)){
            b.setISBN(ISBN);
            correct=true;
        }
        else correct=false;
    }
    @Then("add the book information to the library")
    public void addTheBookInformationToTheLibrary() {
        if(correct){
            x.addbook(b,user);
            x.books.get(0).print();
            assertFalse(x.books.isEmpty());
        }
        else
            assertTrue(false);
    }

    @Given("admin is not logged in")
    public void adminIsNotLoggedIn() {
        user.logOut();
    }
    @Then("show warning;")
    public void showWarning() {
        x.addbook(b,user);
        assertTrue(x.books.isEmpty());
    }
}
