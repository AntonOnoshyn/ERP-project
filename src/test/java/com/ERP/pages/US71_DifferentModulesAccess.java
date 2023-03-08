package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class US71_DifferentModulesAccess extends BasePage{

    public US71_DifferentModulesAccess(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

}
