package com.ERP.step_definitions;

import com.ERP.pages.BasePage;
import com.ERP.pages.US66_MainModulesAccess;
import com.ERP.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

public class US66_MainModules_Step_Definitions {
    US66_MainModulesAccess mainModulesAccess = new US66_MainModulesAccess();
    @Given("user put valid username")
    public void user_put_valid_username() {
        mainModulesAccess.txt_username.sendKeys("posmanager5@info.com");


    }
    @When("user put valid password")
    public void user_put_valid_password() {
        mainModulesAccess.txt_password.sendKeys("posmanager");
    }
    @And("user login on the page")
    public void userLoginOnThePage() {
        mainModulesAccess.txt_login.click();
    }
    @Then("user should be able to access to the {int} modules")
    public void user_should_be_able_to_access_to_the_modules(List<Integer>expectedModules) {

        List<Boolean> actualModules = Collections.singletonList(mainModulesAccess.access22Modules.isEnabled());
        Assert.assertTrue(actualModules.contains(expectedModules));








    }


}
