package com.Example.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /*
      Creating a private constructor
      so we are closing access to the
      object of this class from outside the class

       */
    private Driver(){}
    //we make webdriver private, because we want to close access from outside of the class
    //  we make it static because we will use it  in static method
    // private static WebDriver driver;

    private static InheritableThreadLocal<WebDriver> driverPool= new InheritableThreadLocal<>();
    /*
        Create re-usable utility method which will return same driver instance when we call it
         */
    public static WebDriver getDriver(){
        if(driverPool.get()==null){
            String browserType= ConfigurationReader.getProperty("browser");
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driverPool.get();
    }

    //this method will make sure our driver value is always null after using quit() method
    public static void closeDriver(){
        if(driverPool.get() != null){
            driverPool.get().quit(); // this line will terminate the existing session. value will not even be null
            driverPool.remove();
        }
    }
}
