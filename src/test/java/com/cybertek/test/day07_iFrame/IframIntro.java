package com.cybertek.test.day07_iFrame;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframIntro extends TestBase {

    @Test
    public void testSimpleIrame() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.switchTo().frame(0);
        WebElement pTagInsideFrame = driver.findElement(By.tagName("p"));
        System.out.println("pTagInsideFrame.getText() = " + pTagInsideFrame.getText());
        driver.switchTo().parentFrame();
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(3000);
    }
}
