package code;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class logoutSteps {
Admin admin =new Admin();
    @Given("admin is logged in")
    public void admin_is_logged_in() {
        admin.setLogged(true);
    }

    @When("admin logs out")
    public void admin_logs_out() {
        admin.logOut();
    }

    @Then("remove admin authorities")
    public void remove_admin_authorities() {
        assertFalse(admin.isLogged());
        System.out.println("logged Out");
    }
}
