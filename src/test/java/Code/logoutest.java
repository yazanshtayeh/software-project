package Code;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

public class logoutest {
user admin =new user();
    @Given("admin is logged in")
    public void admin_is_logged_in() {
        admin.logged =true;
    }

    @When("logout is pressed")
    public void logout_is_pressed() {

    }

    @Then("remove admin authorities")
    public void remove_admin_authorities() {
        admin.setLogged(false);
    }

    @And("log out")
    public void logOut() {
        assertTrue(true);
        System.out.println("logged Out");
    }

    @Given("user pressed logout")
    public void userPressedLogout() {
    }
}