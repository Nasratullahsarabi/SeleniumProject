package com.cybertek.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver2 {

private static WebDriver obj;
    private Driver2() { }

    public static WebDriver getDriver2(){

        if (obj == null){
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            return obj;
        }
        return obj;

    }
}