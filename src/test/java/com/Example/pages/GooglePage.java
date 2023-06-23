package com.Example.pages;

import com.Example.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath =" //button[@id='L2AGLb']")
    public WebElement acceptAll;

    @FindBy(xpath="//textarea[@class='gLFyf']")
            public WebElement searchBar;

    @FindBy(css = "h3[class='LC20lb MBeuO DKV0Md']")
    public WebElement cderLink;

    @FindBy(id = "mega-menu-item-1556")
        public WebElement careers;

    @FindBy(xpath = "(//div[@class='container']/div/div/h4)[1]")
    public WebElement careersPage;


}
