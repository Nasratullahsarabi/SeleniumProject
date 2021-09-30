package com.webOrderWebPage.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver obj;

    private Driver (){ }

    public static WebDriver getDriver(){
        String browser = ConfigReader.read("browser");

        if (obj==null){
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;
                default:
                    obj = null;
                    System.out.println("UNKNOWN BROWSER TYPE!");
            }
            return obj;

        }else {
            System.out.println("You already have the driver use it");
            return obj;
        }
    }

    public static void closeBrowser(){
        if (obj!=null){
            obj.quit();
            obj = null;
        }
    }
}
