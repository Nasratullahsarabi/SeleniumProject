package com.cybertek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WebOrderUtility2 {

    public static void login(WebDriver driverParameter){

        driverParameter.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driverParameter.findElement(By.id("ctl00_MainContent_password")).sendKeys("test"+ Keys.ENTER);
    }
    public static void login2(WebDriver driverPram, String user, String pass){
        driverPram.findElement(By.id("ctl00_MainContent_username")).sendKeys(user);
        driverPram.findElement(By.id("ctl00_MainContent_password")).sendKeys(pass+Keys.ENTER);
    }
}
