package com.Example.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EaappPage {
  public EaappPage(){ PageFactory.initElements(com.Example.utilities.Driver.getDriver(), this);}
    @FindBy(id = "loginLink")
    public WebElement loginLink;

  @FindBy(xpath = "//*[@id='UserName']")
  public WebElement UserName;

  @FindBy(xpath = "//*[@id=\"Password\"]")
  public WebElement password;

  @FindBy(xpath = "//*[@id=\"loginForm\"]/form/div[4]/div/input")
  public WebElement loginForm;

  @FindBy(xpath = "/html/body/div[1]/div/div[2]/ul/li[3]/a")
  public WebElement EmployeeList;

  @FindBy(xpath ="/html/body/div[2]/form/a")
  public WebElement CreateNew;

  @FindBy(xpath = "//*[@id=\"Name\"]")
  public WebElement CreateName;
  @FindBy(xpath = "//*[@id=\"Salary\"]")
  public WebElement CreateSalary;
  @FindBy(xpath = "//*[@id=\"DurationWorked\"]")
  public WebElement CreateDurationWorked;
  @FindBy(xpath = "//*[@id=\"Grade\"]")
  public WebElement CreateGrade;
  @FindBy(xpath = "//*[@id=\"Email\"]")
  public WebElement CreateEmail;
  @FindBy(xpath = "//*[@class=\"btn btn-default\"]")
  public WebElement Create;

  @FindBy(xpath = "//*[@name=\"searchTerm\"]")
  public WebElement SearchTerm;

  @FindBy(xpath = "//*[@class=\"btn btn-default\"]")
  public WebElement searchToDefault;

  @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[2]/td[1]")
  public WebElement isNamed;

  @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[2]/td[6]/a[3]")
  public WebElement delete;

  @FindBy(xpath = "//*[@class=\"btn btn-default\"]")
  public WebElement confirmDelete;

  @FindBy (xpath ="/html/body/div[2]/table/tbody/tr")
  public WebElement tableId;



}
