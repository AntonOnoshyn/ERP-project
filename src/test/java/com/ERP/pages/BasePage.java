package com.ERP.pages;

import com.ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class BasePage {
   public  BasePage() {PageFactory.initElements(Driver.getDriver(),this);}

  @FindBy(id = "login")
  public WebElement txt_username;

  @FindBy(id= "password")
  public WebElement txt_password;

  @FindBy(xpath = "//button[@type='submit']")
  public WebElement btn_log_in;

  @FindBy(xpath = "//span[normalize-space()='Repairs']")
  public WebElement repairsButton;

 @FindBy(xpath = "(//span[contains(text(),'Point of Sale')])[1]")
  public WebElement PointOfSale_Button;


//@FindBy(xpath = "//div[@class='table-responsive']")
//int columnCount = element.findElement(by.tagName(“th”)).size();
}
