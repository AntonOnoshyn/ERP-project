package com.ERP.step_definitions;

import com.ERP.pages.US67_MainModuleAccess;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
        mainModuleAccess.Discuss.click();
        String expectedTitle= "Discuss";
        String actualTitle= mainModuleAccess.Discuss.getText();

        Assert.assertEquals(expectedTitle,actualTitle);

        mainModuleAccess.Calendar.click();
        String expectedTitleCalendar="Calendar";
        String actualTitleCalendar= mainModuleAccess.Calendar.getText();
        Assert.assertEquals(expectedTitleCalendar,actualTitleCalendar);

        mainModuleAccess.Notes.click();
        String expectedTitleNotes="Notes";
        String actualTitleNotes= mainModuleAccess.Notes.getText();
        Assert.assertEquals(expectedTitleNotes,actualTitleNotes);

        mainModuleAccess.Contacts.click();
        String expectedTitleContacts="Contacts";
        String actualTitleContacts= mainModuleAccess.Contacts.getText();
        Assert.assertEquals(expectedTitleContacts,actualTitleContacts);

        mainModuleAccess.Website.click();
        String expectedTitleWebsite="Website";
        String actualTitleWebsite= mainModuleAccess.Website.getText();
        Assert.assertEquals(expectedTitleWebsite,actualTitleWebsite);

        //error here
        mainModuleAccess.Inventory.click();
        String expectedTitleInventory="Inventory";
        String actualTitleInventory= mainModuleAccess.Inventory.getText();
        Assert.assertEquals(expectedTitleInventory,actualTitleInventory);

        mainModuleAccess.Manufacturing.click();
        String expectedTitleManufacturing="Manufacturing";
        String actualTitleManufacturing= mainModuleAccess.Manufacturing.getText();
        Assert.assertEquals(expectedTitleManufacturing,actualTitleManufacturing);

        mainModuleAccess.repairsButton.click();
        String expectedTitleRepairs="Repairs";
        String actualTitleRepairs= mainModuleAccess.repairsButton.getText();
        Assert.assertEquals(expectedTitleManufacturing,actualTitleManufacturing);

        mainModuleAccess.invoicingButton.click();
        String expectedTitleInvoicing="Invoicing";
        String actualTitleInvoicing= mainModuleAccess.invoicingButton.getText();
        Assert.assertEquals(expectedTitleInvoicing,actualTitleInvoicing);

        mainModuleAccess.emailMarketing.click();
        String expectedTitleEmailMarketing="Email Marketing";
        String actualTitleEmailMarketing=mainModuleAccess.emailMarketing.getText();
        Assert.assertEquals(expectedTitleEmailMarketing,actualTitleEmailMarketing);

        mainModuleAccess.Employees.click();
        String expectedTitleEmployees="Employees";
        String actualTitleEmployees=mainModuleAccess.Employees.getText();
        Assert.assertEquals(expectedTitleEmployees,actualTitleEmployees);

        mainModuleAccess.Leaves.click();
        String expectedTitleLeaves="Leaves";
        String actualTitleLeaves=mainModuleAccess.Leaves.getText();
        Assert.assertEquals(expectedTitleLeaves,actualTitleLeaves);

        mainModuleAccess.MenuButton.click();
        String expectedTitleMenuButton="More";
        String actualTitleMenuButton=mainModuleAccess.MenuButton.getText();
        Assert.assertEquals(expectedTitleMenuButton,actualTitleMenuButton);

        mainModuleAccess.Expenses.click();
        String expectedTitleExpenses="Expenses";
        String actualTitleExpenses=mainModuleAccess.Expenses.getText();
        Assert.assertEquals(expectedTitleExpenses,actualTitleExpenses);

        mainModuleAccess.Lunch.click();
        String expectedTitleLunch="Lunch";
        String actualTitleLunch=mainModuleAccess.Lunch.getText();
        Assert.assertEquals(expectedTitleLunch,actualTitleLunch);

        mainModuleAccess.Maintenance.click();
        String expectedTitleMaintenance="Maintenance";
        String actualTitleMaintenance=mainModuleAccess.Maintenance.getText();
        Assert.assertEquals(expectedTitleMaintenance,actualTitleMaintenance);

        mainModuleAccess.Dashboards.click();
        String expectedTitleDashboards="Dashboards";
        String actualTitleDashboards=mainModuleAccess.Dashboards.getText();
        Assert.assertEquals(expectedTitleDashboards,actualTitleDashboards);

    }

    }

