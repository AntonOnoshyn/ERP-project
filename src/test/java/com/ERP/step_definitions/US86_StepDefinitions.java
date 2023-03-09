package com.ERP.step_definitions;

import com.ERP.pages.US86_ModuleAccess;
import com.ERP.utilities.BrowserUtils;
import com.ERP.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US86_StepDefinitions {

    US86_ModuleAccess us86_moduleAccess = new US86_ModuleAccess();

    @Given("user is on the logg in page")
    public void user_is_on_the_logg_in_page() {


    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {

        us86_moduleAccess.txt_username.sendKeys(ConfigurationReader.getProperty("CRM_Manager_username"));
        us86_moduleAccess.txt_password.sendKeys(ConfigurationReader.getProperty("CRM_Manager_password"));
        us86_moduleAccess.btn_log_in.click();
    }

    @Then("user can access to {int} different modules")
    public void user_can_access_to_different_modules(Integer int1) {


        for (WebElement each : us86_moduleAccess.DisplayBlock) {
            each.click();
            Assert.assertTrue(each.isDisplayed());
        }
    }

}