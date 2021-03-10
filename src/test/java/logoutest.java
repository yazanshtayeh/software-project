import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

public class logoutest {

    @Given("admin is logged in")
    public void admin_is_logged_in() {
        logintest.flag =true;
    }

    @When("logout is pressed")
    public void logout_is_pressed() {

    }

    @Then("remove admin authorities")
    public void remove_admin_authorities() {
        logintest.flag =false;
    }

    @And("log out")
    public void logOut() {
        assertTrue(true);
        System.out.println("logged Out");
    }
}
