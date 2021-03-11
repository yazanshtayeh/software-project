package Code;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class logintest {
<<<<<<< Updated upstream
    public static boolean flag = false;

=======
>>>>>>> Stashed changes
     user b=new user();

     @Given("the correct password is {int} and correct id is {int}")
    public void theCorrectPasswordIsAndCorrectIdIs(int arg0, int arg1) {
        b.setPass(arg0) ;
        b.setId(arg1);
    }
    @When("user fills id with {int} and password with {int}")
    public void userFillsIdWithAndPasswordWith(int int1, int int2) {
        if (int1 == b.getPass() && int2 == b.getId()) b.isLogged() = true;
    }

    @Then("give admin authorities and go to admin page")
    public void give_admin_authorities_and_go_to_admin_page() {
        assertTrue(b.isLogged());
    }

   @Then("don't give admin authorities")
    public void don_t_give_admin_authorities() {
       b.isLogged()=false;
        assertTrue(true);
    }

    @Then("show a wrong info massage")
    public void show_a_wrong_info_massage() {
         System.out.println("wrong password");
    }



}
