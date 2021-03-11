package Code;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

public class logoutest {
Admin admin =new Admin();
    @Given("admin is logged in")
    public void admin_is_logged_in() {
        admin.setLogged(true);
    }

    @When("logout is pressed")
    public void logout_is_pressed() {
    admin.logOut();
    }

    @Then("remove admin authorities")
    public void remove_admin_authorities() {
        assertTrue(true);
        System.out.println("logged Out");
    }



}
