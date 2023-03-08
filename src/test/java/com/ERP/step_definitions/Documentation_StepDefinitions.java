package com.ERP.step_definitions;

import com.ERP.pages.DocumentationPage;
import com.ERP.utilities.BrowserUtils;
import com.ERP.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.sql.rowset.BaseRowSet;

public class Documentation_StepDefinitions {


    DocumentationPage doc = new DocumentationPage();

    @When("user is able to click username tab and select Documentation from dropdown")
    public void user_is_able_to_click_username_tab_and_select_documentation_from_dropdown() {


        doc.tab.click();

        doc.doc.click();


    }
    @Then("user is on the Documentation page and user sees {string} displayed in header")
    public void user_is_on_the_documentation_page_and_user_sees_displayed_in_header(String expected) {


        Driver.getDriver().get("https://www.odoo.com/documentation/16.0/");

        String actualDisplay = doc.header.getText();

        Assert.assertEquals(actualDisplay,expected);

    }

}
