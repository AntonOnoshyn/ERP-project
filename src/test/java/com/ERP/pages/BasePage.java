package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement txt_username;

    @FindBy(id = "password")
    public WebElement txt_password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement txt_login;

}
