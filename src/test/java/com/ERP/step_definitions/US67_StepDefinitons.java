package com.ERP.step_definitions;

import com.ERP.pages.US67_MainModuleAccess;
import com.ERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US67_StepDefinitons {
    US67_MainModuleAccess mainModuleAccess = new US67_MainModuleAccess();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

    }

    @When("user uses valid credentials")
    public void user_uses_valid_credentials() {
        mainModuleAccess.txt_username.sendKeys("imm44@info.com");
        mainModuleAccess.txt_password.sendKeys("inventorymanager");
        mainModuleAccess.btn_log_in.click();
    }

    @Then("user will have access to the {int} modules")
    public void user_will_have_access_to_the_modules(Integer int1) {


       /* for (int i = 0; i <= mainModuleAccess.allModules.size(); i++) {
            module = mainModuleAccess.allModules.get(i);
            module.click();

        */

        for (WebElement eachElement : mainModuleAccess.allModules) {
            eachElement.click();
            if (eachElement.isDisplayed()) {
                Assert.assertTrue(eachElement.isDisplayed());
            }

        }

    }
}

