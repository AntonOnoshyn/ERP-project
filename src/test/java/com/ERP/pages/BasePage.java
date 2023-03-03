package com.ERP.pages;

public abstract class BasePage {
   public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
