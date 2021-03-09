import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class logintest {
     boolean flag = false;

    @When("user fills id with {int} and password with {int}")
    public void userFillsIdWithAndPasswordWith(int int1, int int2) {
        if (int1 == 222 && int2 == 222) flag = true;
    }

    @Then("give admin authorities and go to admin page")
    public void give_admin_authorities_and_go_to_admin_page() {
        assertTrue(flag);
    }

   @Then("don't give admin authorities")
    public void don_t_give_admin_authorities() {
        flag=false;
    }

    @Then("show a wrong info massage")
    public void show_a_wrong_info_massage() {
    System.out.println("you're not an admin");
    }

}
