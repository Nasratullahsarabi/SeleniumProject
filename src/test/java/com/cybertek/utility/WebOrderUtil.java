package com.cybertek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.cybertek.utility.Driver.getDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderUtil {

    public static void openWebOrderApp(){
     //   getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        getDriver().get(ConfigReader.read("weborder_url"));
    }

    public static void login(){

        getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test"+ Keys.ENTER);
        //getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(String userName, String password){
        getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password+ Keys.ENTER);
        //getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void logout(){

        getDriver().findElement(By.id("ctl00_logout")).click();
    }

    public static void isAtOrderPage(){

        WebDriverWait wait = new WebDriverWait(getDriver(),2);
        try {
           // wait.until(ExpectedConditions.urlToBe("http://securTTe.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space(.)='List of All Orders']")));
            System.out.println("You are at the right page");
        }catch (TimeoutException e){
            System.out.println("page was not found");
            System.out.println("You are not at the right page");
        }


    }

    public static void invalidCredential(){

        WebDriverWait wait = new WebDriverWait(getDriver(),2);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Invalid Login or Password.']")));
        }catch (TimeoutException e){
            System.out.println("This is the error message " + e.getMessage());
        }
    }

    public static boolean loginErrorMsgVisible(){

        boolean elementfound = BrowserUtil.checkVisibilityOfElement(By.xpath("//span[.='Invalid Login or Password.']"),2);
        return elementfound;
    }

}
