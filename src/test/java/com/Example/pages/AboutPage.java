package com.Example.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
  public AboutPage(){
      PageFactory.initElements(com.Example.utilities.Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[.='About'])[1]")
    public WebElement about;


    @FindBy(xpath = "//a[@id='hs-eu-decline-button']")
    public WebElement cookies;


}
