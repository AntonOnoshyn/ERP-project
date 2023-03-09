package com.ERP.pages;

import com.ERP.utilities.Driver;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage {

    public DocumentationPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]")
    public WebElement tab;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/ul/li[1]/a")
    public WebElement doc;

    @FindBy(xpath = "//*[@id=\"o_content\"]/section[1]/h1")
    public WebElement header;

}
