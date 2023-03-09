package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US86_ModuleAccess extends BasePage {


    public US86_ModuleAccess() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> DisplayBlock;

}