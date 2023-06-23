package com.Example.step_definition;

import com.Example.pages.GooglePage;
import com.Example.utilities.BrowserUtils;
import com.Example.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchCder_StepDefinition {

  GooglePage googlePage;
    @Given("user is on the google search page")
    public void user_is_on_the_google_search_page() {
        googlePage= new GooglePage();
        Driver.getDriver().get("https://www.google.com");
        googlePage.acceptAll.click();
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() throws InterruptedException {
        Thread.sleep(5);
        BrowserUtils.verifyTitle(Driver.getDriver(),"Google");

        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
    }

    @And("user write cder group search bar")
    public void user_write_search_bar() throws InterruptedException {
        Actions actions= new Actions(Driver.getDriver());

        String str = "cder group";
            googlePage= new GooglePage();
            Thread.sleep(10);

            googlePage.searchBar.click();
            Thread.sleep(10);
            googlePage.searchBar.sendKeys(str);
            Thread.sleep(20);
             googlePage.searchBar.sendKeys(Keys.ENTER);
             Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Then("user should see cder on the page")
    public void user_should_see_cder_on_the_page() {
            String cder= "cder";
            Assert.assertTrue(Driver.getDriver().getTitle().contains(cder));
    }


    @And("user navigates to Cder Website")
    public void user_navigates_to_cder_website() {
        googlePage=new GooglePage();
        googlePage.cderLink.click();
    }
    @And("user sees cder {string} on tab")
    public void user_sees_cder_on_tab(String string) {
       Assert.assertEquals(string,Driver.getDriver().getTitle());
    }

    @And("user clicks careers")
    public void user_clicks_careers() throws InterruptedException {

        BrowserUtils.sleep(5);
        googlePage=new GooglePage();
        googlePage.careers.click();
        Thread.sleep(10);
    }


    @Then("user sees {string}")
        public void user_sees(String string) throws InterruptedException {
        Thread.sleep(5);
        googlePage=new GooglePage();
        Assert.assertTrue(googlePage.careersPage.getText().contains(string));

        Thread.sleep(5);
        Driver.getDriver().navigate().back();
        }

}
