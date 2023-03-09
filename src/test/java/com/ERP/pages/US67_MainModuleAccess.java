package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US67_MainModuleAccess extends BasePage {

    public US67_MainModuleAccess(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//li[@style='display: block;']" )
    public List<WebElement> allModules;











}
