import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class logintest {
    @When("user fills id with {int} and password with {int}")
    public void userFillsIdWithAndPasswordWith(int int1, int int2) {
        boolean flag = false;
        if(int1==222 && int2==222)flag= true;

        assertTrue(flag);
    }
    @Then("give admin authorities and go to admin page")
    public void give_admin_authorities_and_go_to_admin_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("don't give admin authorities")
    public void don_t_give_admin_authorities() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("show a wrong info massage")
    public void show_a_wrong_info_massage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user fills id with int and password with int")
    public void userFillsIdWithIntAndPasswordWithInt() {

    }
}
