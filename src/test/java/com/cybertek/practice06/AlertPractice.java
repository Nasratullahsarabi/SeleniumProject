package com.cybertek.practice06;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AlertPractice extends TestBase {

    @Test
    public void jsAlert() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        Thread.sleep(2000);
        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary'][3]")).click();
        driver.switchTo().alert().sendKeys("Test test");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);


    }
}
