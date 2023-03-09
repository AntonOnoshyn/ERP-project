package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US67_MainModuleAccess extends BasePage {

    public US67_MainModuleAccess(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

     @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> allModules;



  /*  @FindBy(xpath = "//span[normalize-space()='Calendar']")
    public WebElement Calendar;

    @FindBy(xpath = "//span[normalize-space()='Notes']")
    public WebElement Notes;

    @FindBy(xpath = "//span[normalize-space()='Contacts']")
    public WebElement Contacts;

    @FindBy(xpath = "//span[normalize-space()='Website']")
    public WebElement Website;

    @FindBy(xpath = "//span[normalize-space()='Inventory']")
    public WebElement Inventory;

    @FindBy(xpath = "//span[normalize-space()='Manufacturing']")
    public WebElement Manufacturing;

    @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement repairsButton;

    @FindBy(xpath = "//span[normalize-space()='Invoicing']")
    public WebElement invoicingButton;

    @FindBy(xpath ="//ul[@id='menu_more']" )
    public WebElement MenuButton;

    @FindBy(xpath = "//span[normalize-space()='Email Marketing']")
    public WebElement emailMarketing;

    @FindBy(xpath = "//span[normalize-space()='Employees']")
    public WebElement Employees;

    @FindBy(xpath = "//span[normalize-space()='Leaves']")
    public WebElement Leaves;

    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement Expenses;

    @FindBy(xpath = "//span[normalize-space()='Lunch']")
    public WebElement Lunch;

    @FindBy(xpath = "//span[normalize-space()=' Maintenance']")
    public WebElement  Maintenance;

    @FindBy(xpath = "//span[normalize-space()=' Dashboards']")
    public WebElement Dashboards;

     */










}
