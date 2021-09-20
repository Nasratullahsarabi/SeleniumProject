package com.cybertek.practice05;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframe extends TestBase {

    @Test
    public void test_iFrame(){
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.switchTo().frame(0);
       // driver.switchTo().frame("mce_0_ifr");

        WebElement findElementByTagName = driver.findElement(By.tagName("p"));
        System.out.println("findElementByTagName.getText() = " + findElementByTagName.getText());
        driver.findElement(By.linkText("Home")).click();

    }

}
