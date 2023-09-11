package com.Example.step_definition;

import com.Example.pages.AboutPage;
import com.Example.utilities.BrowserUtils;
import com.Example.utilities.ConfigurationReader;

import com.Example.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class First_StepDefinition {
    AboutPage careersPage=new AboutPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("user is on the Arkksolutions web page")
    public void user_is_on_the_arkksolutions_web_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Thread.sleep(3000);
        careersPage.cookies.click();

    }
    @Then("user should see title is Arkksolutions")
    public void user_should_see_title_is_arkksolutions() {
        Assert.assertEquals("ARKK | Tax automation, Regulatory and Statutory reporting",Driver.getDriver().getTitle());
    BrowserUtils.sleep(2);

    }
    @When("user clicks on the about button")
    public void user_clicks_on_the_about_button() {
        careersPage.about.click();
        BrowserUtils.sleep(2);


    }
    @When("user scrolls down and scrolls up on the page")
    public void user_scrolls_down_and_scrolls_up_on_the_page() {
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,1250)");
        }

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-1250)");
        }


    }
    @When("user navigates back to the home page")
    public void user_navigates_back_to_the_home_page() {
        Driver.getDriver().navigate().back();
    }





    }


