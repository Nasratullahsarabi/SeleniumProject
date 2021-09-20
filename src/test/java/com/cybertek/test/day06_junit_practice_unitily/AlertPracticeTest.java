package com.cybertek.test.day06_junit_practice_unitily;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPracticeTest extends TestBase {
    @Test
    public void testJavaScriptAlert() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        //Thread.sleep(3000);

//        Alert alertObj = driver.switchTo().alert();
//        alertObj.accept();
//
 //       driver.switchTo().alert().accept();
 //         driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().sendKeys();
       // System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());

        driver.findElement(By.xpath("//button[@class='btn btn-primary'][3]")).click();
        driver.switchTo().alert().sendKeys("Nasratullah");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);


    }
}
