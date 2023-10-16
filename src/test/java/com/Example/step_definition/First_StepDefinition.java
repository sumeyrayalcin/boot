package com.Example.step_definition;

import com.Example.pages.EaappPage;
import com.Example.pages.EaappPage;
import com.Example.utilities.BrowserUtils;
import com.Example.utilities.ConfigurationReader;

import com.Example.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class First_StepDefinition {
    EaappPage careersPage=new EaappPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("user is on the eaapp web page")
    public void user_is_on_the_eaapp_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user should see title is eaapp")
    public void user_should_see_title_is_eaapp() {
        Assert.assertEquals("Home - Execute Automation Employee App",Driver.getDriver().getTitle());
    }

    @Given("The user clicks on the login and lands on the login page")
    public void the_user_clicks_on_the_login_and_lands_on_the_login_page() {
         careersPage.loginLink.click();
    }

    @When("The user enters valid credentials into  the field")
    public void the_user_enters_valid_credentials_into_the_field() {
        careersPage.UserName.sendKeys("admin");
        careersPage.password.sendKeys("password");
        BrowserUtils.sleep(3);
    }

    @Then("The user clicks on login button")
    public void the_user_clicks_on_login_button() {
        careersPage.loginForm.click();
        BrowserUtils.sleep(3);
    }

    @Then("The user lands on dashboard")
    public void the_user_lands_on_dashboard() {
       Assert.assertEquals("Home - Execute Automation Employee App",Driver.getDriver().getTitle());
    }

    @Given("The user clicks on employee list on the dashboard")
    public void the_user_clicks_on_employee_list_on_the_dashboard() {
        careersPage.EmployeeList.click();
    }

    @When("The user clicks create new button")
    public void the_user_clicks_create_new_button() {
       careersPage.CreateNew.click();
    }

    @Then("The user writes the all information about new employee into provided fields.")
    public void the_user_writes_the_all_information_about_new_employee_into_provided_fields() {
        careersPage.CreateName.sendKeys("NewName");
        careersPage.CreateSalary.sendKeys("60000");
        careersPage.CreateDurationWorked.sendKeys("2000");
        careersPage.CreateGrade.sendKeys("1");
        careersPage.CreateEmail.sendKeys("email@example.com");
        BrowserUtils.sleep(1);
    }

    @Then("The user clicks create button")
    public void the_user_clicks_create_button() {
      careersPage.Create.click();
    }

    @Then("The user should see new employee on the employee list page")
    public void the_user_should_see_new_employee_on_the_employee_list_page() {
        careersPage.SearchTerm.sendKeys("NewName");
        careersPage.searchToDefault.click();

        boolean dataExists1 =careersPage.isNamed.getText().contains("NewName");
        if (dataExists1) {
            System.out.println("new employee created on the employee list");
        } else {
            System.out.println("new employee did not create on the employee list");
        }
    }

    @Given("The user selects the new employee clicks delete button.")
    public void the_user_selects_the_new_employee_clicks_delete_button() {
        careersPage.delete.click();
        careersPage.confirmDelete.click();
    }

    @Then("Verify that the new employee deleted from the employee list")
    public void verify_that_the_new_employee_deleted_from_the_employee_list() {
        careersPage.SearchTerm.sendKeys("NewName");
        careersPage.searchToDefault.click();

        boolean dataExists2 =careersPage.tableId.getText().contains("NewName");
        if (!dataExists2) {
            System.out.println("new employee deleted");
        } else {
            System.out.println("new employee can not delete");
        }
    }



}


