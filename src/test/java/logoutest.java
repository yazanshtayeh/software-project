import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutest {
    boolean flag;
    @Given("admin is logged in")
    public void admin_is_logged_in() {
        flag =true;
    }

    @When("logout is pressed")
    public void logout_is_pressed() {

    }

    @Then("remove admin authorities")
    public void remove_admin_authorities() {
       flag =false;
    }

    @And("log out")
    public void logOut() {
        System.out.println("logged Out");
    }
}
