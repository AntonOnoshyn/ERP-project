package com.ERP.step_definitions;

import com.ERP.pages.US70_ModuleAccess;
import com.ERP.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US70_StepDefinitions {

    US70_ModuleAccess us70_moduleAccess = new US70_ModuleAccess();

    @Given("user is on the logg in page")
    public void user_is_on_the_logg_in_page() {


    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {

        us70_moduleAccess.txt_username.sendKeys(ConfigurationReader.getProperty("CRM_Manager_username"));
        us70_moduleAccess.txt_password.sendKeys(ConfigurationReader.getProperty("CRM_Manager_password"));
        us70_moduleAccess.btn_log_in.click();
    }

    @Then("user can access to {int} different modules")
    public void user_can_access_to_different_modules(Integer int1) {


        for (WebElement each : us70_moduleAccess.DisplayBlock) {
            each.click();
            Assert.assertTrue(each.isDisplayed());
        }
    }

}