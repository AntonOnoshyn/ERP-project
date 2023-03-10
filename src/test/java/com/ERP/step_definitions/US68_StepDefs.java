package com.ERP.step_definitions;

import com.ERP.pages.POS_Manager_PointOfSale;
import com.ERP.utilities.BrowserUtils;
import com.ERP.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US68_StepDefs {


    POS_Manager_PointOfSale pos_manager_pointOfSale = new POS_Manager_PointOfSale();

    @When("POS manager types username")
    public void pos_manager_types_username() {
        pos_manager_pointOfSale.txt_username.sendKeys(ConfigurationReader.getProperty("POS_Manager_username"));
    }
    @When("POS manager types password")
    public void pos_manager_types_password() {
        pos_manager_pointOfSale.txt_password.sendKeys(ConfigurationReader.getProperty("POS_Manager_password"));
    }
    @Then("POS manager Clicks login button")
    public void pos_manager_clicks_login_button() {
       pos_manager_pointOfSale.btn_log_in.click();
        BrowserUtils.sleep(3);
    }



    @Given("POS manager is on the Point Of Sale page")
    public void pos_manager_is_on_the_point_of_sale_page() {
       pos_manager_pointOfSale.PointOfSale_Button.click();
       BrowserUtils.sleep(3);
    }
    @When("POS manager checking Order Reference")
    public void pos_manager_checking_order_reference() {
        pos_manager_pointOfSale.Orders.click();
        BrowserUtils.sleep(3);
        pos_manager_pointOfSale.orderRef.click();
    }
    @Then("All orders should be checked")
    public void all_orders_should_be_checked() {
        for (WebElement eachElement : pos_manager_pointOfSale.tableElements) {
            if (!eachElement.isDisplayed()){
                Assert.assertTrue("Element is not checked",!eachElement.isDisplayed());
            }
        }



        
        
    }
    @Then("Action drop down should have {int} options: Import, Export, Delete")
    public void action_drop_down_should_have_options_import_export_delete(Integer int1) {
        pos_manager_pointOfSale.ActionDropDown.click();
       Assert.assertTrue(pos_manager_pointOfSale.Export.isDisplayed());
       Assert.assertTrue(pos_manager_pointOfSale.delete.isDisplayed());
       Assert.assertEquals("Import,Export,Delete", "Export,Delete");
    }






}
