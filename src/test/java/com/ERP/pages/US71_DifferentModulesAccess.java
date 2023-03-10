package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.prefs.BackingStoreException;

public class US71_DifferentModulesAccess extends BasePage{

    public US71_DifferentModulesAccess(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//li[@style='display: block;']")

    public List<WebElement> access12modules;

}
