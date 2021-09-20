package com.cybertek.test.day06_junit_practice_unitily;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IsDisplayedTest extends TestBase {

    @Test
    public void isDisplayed(){
        driver.get("http://practice.cybertekschool.com/registration_form");

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("1");

        String xpathErrorMsg = "//small[.='first name must be more than 2 and less than 64 characters long']";
        WebElement errorMsg = driver.findElement(By.xpath(xpathErrorMsg));
        System.out.println("errorMsg.isDisplayed() = " + errorMsg.isDisplayed());
        System.out.println("errorMsg.getText() = " + errorMsg.getText());
        WebElement secondErrorMsg = driver.findElement(By.xpath("//small[.='first name can only consist of alphabetical letters']"));
        System.out.println("secondErrorMsg.getText() = " + secondErrorMsg.getText());
    }
}
