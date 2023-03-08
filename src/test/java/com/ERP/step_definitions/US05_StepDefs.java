package com.ERP.step_definitions;

import com.ERP.pages.POS_Manager_PointOfSale;
import com.ERP.utilities.ConfigurationReader;
import com.ERP.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US05_StepDefs {


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
    }



    @Given("POS manager is on the Point Of Sale page")
    public void pos_manager_is_on_the_point_of_sale_page() {
       pos_manager_pointOfSale.PointOfSale_Button.click();
    }
    @When("POS manager checking Order Reference")
    public void pos_manager_checking_order_reference() {
        pos_manager_pointOfSale.orderRef.click();
    }
    @Then("All orders should be checked")
    public void all_orders_should_be_checked() {

       List<WebElement> checkBoxes = Driver.getDriver().findElements(By.xpath("//table//div[@class='o_checkbox']"));

        for (WebElement eachCheckBox : checkBoxes) {
            if(eachCheckBox.isEnabled()){



            }
        }

        
        
    }
    @Then("Action drop down should have {int} options: Import, Export, Delete")
    public void action_drop_down_should_have_options_import_export_delete(Integer int1) {

    }






}
