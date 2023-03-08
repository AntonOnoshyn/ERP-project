package com.ERP.step_definitions;

import com.ERP.pages.BasePage;
import com.ERP.pages.SalesPage;
import com.ERP.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Quotations_StepDefinitions {

    SalesPage salesPage = new SalesPage();

    @Given("user enters POS manager or Sales manager {string} and {string}")
    public void user_enters_pos_manager_or_sales_manager_and(String username, String password) {

        salesPage.txt_username.sendKeys(username);

        salesPage.txt_password.sendKeys(password);

        salesPage.btn_log_in.click();

        BrowserUtils.sleep(3);


    }
    @When("user clicks on sales tab and lands on quotation page")
    public void user_clicks_on_sales_tab_and_lands_on_quotation_page() {

        salesPage.salesTab.click();

        BrowserUtils.sleep(3);

    }
    @Then("user sees column one named {string}")
    public void user_sees_column_one_named(String expected) {

        String actual = salesPage.boxOne.getText();

        Assert.assertEquals(actual, expected);



    }
    @Then("user sees column two named {string}")
    public void user_sees_column_two_named(String expected) {
        String actual2 = salesPage.boxTwo.getText();
        Assert.assertEquals(actual2,expected);

    }
    @Then("user sees column three named {string}")
    public void user_sees_column_three_named(String expected) {

        String actual3 = salesPage.boxThree.getText();

        Assert.assertEquals(actual3, expected);

    }
    @Then("user sees column four named {string}")
    public void user_sees_column_four_named(String expected) {
       String actual4 = salesPage.boxFour.getText();

       Assert.assertEquals(actual4,expected);

    }
    @Then("user sees column five named {string}")
    public void user_sees_column_five_named(String expected) {

        String actual5 = salesPage.boxFive.getText();

        Assert.assertEquals(actual5,expected);

    }
    @Then("user sees column six named {string}")
    public void user_sees_column_six_named(String expected) {

        String actual6 = salesPage.boxSix.getText();

        Assert.assertEquals(actual6,expected);

    }


}
