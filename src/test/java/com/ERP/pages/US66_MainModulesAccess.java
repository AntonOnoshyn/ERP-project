package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US66_MainModulesAccess extends BasePage {
    public US66_MainModulesAccess(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement txt_login;

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> access22Modules;




}
