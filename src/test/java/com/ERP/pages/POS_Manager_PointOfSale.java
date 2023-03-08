package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class POS_Manager_PointOfSale extends BasePage{

    public POS_Manager_PointOfSale(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@data-action-id='663']")
    public WebElement Orders;

    @FindBy (xpath = "(//table//div[@class='o_checkbox'])[1]")
    public WebElement orderRef;

    @FindBy(xpath = "(//table//div[@class='o_checkbox'])[2]")

    public WebElement secondEl;


    @FindBy(xpath = "//button[normalize-space(text())='Action'] ")
    public WebElement ActionDropDown;

    @FindBy(xpath = "//a[normalize-space(text())='Export']")
    public WebElement Export;

    @FindBy(xpath = "//a[normalize-space(text())='Delete']")
    public WebElement delete;



}
