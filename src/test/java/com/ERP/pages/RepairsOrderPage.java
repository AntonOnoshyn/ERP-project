package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairsOrderPage extends BasePage {


    public RepairsOrderPage() {

        PageFactory.initElements(Driver.getDriver(),this);}

    //@FindBy(xpath = "//table/thead/tr/th[1]")
   // public WebElement RepairsTableColumn1;

    @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement RepairsButton;



    @FindBy(xpath = "//th[normalize-space()='Repair Reference']")
    public WebElement RepairReference;
    @FindBy(xpath = "//th[normalize-space()='Product to Repair']")
    public WebElement ProductToRepair;

    @FindBy(xpath = "//th[normalize-space()='Customer']")
    public WebElement Customer;

    @FindBy(xpath = "//th[normalize-space()='Delivery Address']")
    public WebElement DeliveryAddress;


    @FindBy(xpath = "//th[normalize-space()='Warranty Expiration']")
    public WebElement WarrantyExpiration;

    @FindBy(xpath = "//th[normalize-space()='Status']")
    public WebElement Status;



}
