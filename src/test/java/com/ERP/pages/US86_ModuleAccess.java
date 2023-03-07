package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class US86_ModuleAccess extends BasePage{



    public US86_ModuleAccess(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
}
