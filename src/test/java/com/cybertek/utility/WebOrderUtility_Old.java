package com.cybertek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtility_Old {

    public static void login(WebDriver driverParam){


        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void login(WebDriver driverParam, String userName, String password){
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void logout(WebDriver driverPram){
        driverPram.findElement(By.id("ctl00_logout")).click();

    }

    public static boolean isAtOrderPage(WebDriver driverPram){
        boolean result = false;

        try {
            WebElement header = driverPram.findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));
            System.out.println("Element was identified");
            System.out.println("header.isDisplayed() = " + header.isDisplayed());
            result = true;
        }catch (NoSuchElementException e){
            System.out.println("Element was not identified");

        }

      //  System.out.println("header.isDisplayed() = " + header.isDisplayed());
        return result;
    }


}
