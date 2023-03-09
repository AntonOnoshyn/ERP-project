package com.ERP.step_definitions;

import com.ERP.pages.US71_DifferentModulesAccess;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US71_StepDefinitions {

    US71_DifferentModulesAccess us71DifferentModulesAccess = new US71_DifferentModulesAccess();

    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {

        us71DifferentModulesAccess.txt_username.sendKeys("expensesmanager100@info.com");
    }

    @When("user enter the valid credentials")
    public void user_enter_the_valid_credentials() {

        us71DifferentModulesAccess.txt_password.sendKeys("expensesmanager");
    }
    @And("user click log in")
    public void user_click_log_in(){
        us71DifferentModulesAccess.btn_log_in.click();
    }

    @Then("user will have access to the {int} different modules")
    public void user_will_have_access_to_the_different_modules(Integer int1) {

        Assert.assertEquals(us71DifferentModulesAccess.access12modules.size(),12);

        for (WebElement each : us71DifferentModulesAccess.access12modules ) {
            Assert.assertTrue(each.isEnabled());
        }


    }


}
