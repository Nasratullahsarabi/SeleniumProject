package com.cybertek.practice06;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframPractice extends TestBase {

    @Test
    public void iFram(){
        driver.get("http://practice.cybertekschool.com/iframe");

//        driver.switchTo().frame(0);
//        driver.switchTo().frame("mce_0_ifr");
        WebElement iFrame = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iFrame);
        System.out.println("driver.findElement(By.tagName(\"p\")).getText() = " + driver.findElement(By.tagName("p")).getText());

        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Home")).click();


    }
}
