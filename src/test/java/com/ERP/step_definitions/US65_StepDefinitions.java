package com.ERP.step_definitions;

import com.ERP.pages.RepairsOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class US65_StepDefinitions {

    RepairsOrderPage repairsOrderPage = new RepairsOrderPage();

    @When("user clicks on Repairs tab and lands on Repairs page")
    public void user_clicks_on_repairs_tab_and_lands_on_repairs_page() {
        repairsOrderPage.RepairsButton.click();
    }
    @Then("POS manager should see the below columns")
    public void pos_manager_should_see_the_below_columns(List<String>RepairsPageColumnNames) {


     String ActualRepairsColumns= repairsOrderPage.RepairReference.getText()+
             ", "+repairsOrderPage.ProductToRepair.getText()+
             ", "+repairsOrderPage.Customer.getText()+
             ", "+repairsOrderPage.DeliveryAddress.getText()+
             ", "+repairsOrderPage.WarrantyExpiration.getText()+
             ", "+repairsOrderPage.Status.getText() +" ";

        String RepairsPageColumn= (Arrays.asList(RepairsPageColumnNames).toString());
        System.out.println(RepairsPageColumnNames + " Array List");
        System.out.println(RepairsPageColumn + " EXPECTED");
        System.out.println(ActualRepairsColumns+ "  ACTUAL ");

       Assert.assertTrue(RepairsPageColumn.contains(ActualRepairsColumns));


       // Assert.assertTrue(ActualRepairsColumns.contains(RepairsPageColumn));


    }


}
