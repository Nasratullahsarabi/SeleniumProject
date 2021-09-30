package com.cybertek.utility;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class WebOrderUtility {

    public static void openWebOrderApp(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    }

    public static void login(){

        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void login(String userName, String password){
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void logout(){
        Driver.getDriver().findElement(By.id("ctl00_logout")).click();

    }

    public static boolean isAtOrderPage(){
        boolean result = false;

        try {
            WebElement header = Driver.getDriver().findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));
            System.out.println("Element was identified");
            System.out.println("header.isDisplayed() = " + header.isDisplayed());
            result = true;
        }catch (NoSuchElementException e){
            System.out.println("Element was not identified");

        }

      //  System.out.println("header.isDisplayed() = " + header.isDisplayed());
        return result;
    }

    public static boolean isatAllOrderPage(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
        boolean result = false;
        try {
          //  wait.until(ExpectedConditions.urlToBe("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space(.)='List of All Orders']")));
            System.out.println("print of header = " + Driver.getDriver()
                    .findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']")).getText());
            result = true;
            System.out.println("You are at the right page");
        }catch (TimeoutException e){
            System.out.println("You are Not at Order page "+e.getMessage());
        }
        return result;
    }

    public static boolean verifyUserName(String userName){

        WebElement welcomMsg = Driver.getDriver().findElement(By.xpath("//div[@class='login_info']"));
        System.out.println("welcomMsg.getText().contains(\"Tester\") = " + welcomMsg.getText().contains("Tester"));
        System.out.println("welcomMsg.getText() = " + welcomMsg.getText());
        return welcomMsg.getText().contains(userName);
    }

    public static String getUserNameFromWelcomeMsg() {

        WebElement welcomMsg = Driver.getDriver().findElement(By.xpath("//div[@class='login_info']"));
        String welcomeMessage = welcomMsg.getText();

        return welcomeMessage.replace("Welcome, ", "").replace("! | Logout","");

    }

    public static void selectSidebarTab(String tabName){
        List<String> allTabs = Arrays.asList("View all orders", "View all products", "Order");
        if(allTabs.contains(tabName)){
            Driver.getDriver().findElement(By.linkText(tabName)).click();
        }else {
            Driver.getDriver().findElement(By.linkText("View all orders")).click();
        }

    }

    public static int getUnitPriceFromForm(String productName){
        int price = 0;

        WebElement productDropDown = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(productDropDown);
        select.selectByVisibleText(productName);
        WebElement pricePerUnit = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice"));
        return Integer.parseInt(pricePerUnit.getAttribute("value"));


    }
}
