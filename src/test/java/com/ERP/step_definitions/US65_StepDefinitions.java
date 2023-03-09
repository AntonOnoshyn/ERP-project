package com.ERP.step_definitions;

import com.ERP.pages.RepairsOrderPage;
import com.ERP.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class US65_StepDefinitions {

    RepairsOrderPage repairsOrderPage = new RepairsOrderPage();

    @When("user clicks on Repairs tab and lands on Repairs page")
    public void user_clicks_on_repairs_tab_and_lands_on_repairs_page() {
        repairsOrderPage.RepairsButton.click();
    }

    @Then("POS manager should see the below columns")
    public void pos_manager_should_see_the_below_columns(List<String> RepairsPageColumnNames) {


       List<String> ActualRepairsColumns = new ArrayList<>
              (Arrays.asList(repairsOrderPage.RepairReference.getText(),
               repairsOrderPage.ProductToRepair.getText(),
               repairsOrderPage.Customer.getText(),
               repairsOrderPage.DeliveryAddress.getText(),
               repairsOrderPage.WarrantyExpiration.getText(),
               repairsOrderPage.Status.getText()));

       Assert.assertEquals(ActualRepairsColumns , RepairsPageColumnNames);

    };
}
