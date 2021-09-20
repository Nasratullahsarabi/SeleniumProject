package com.cybertek.practice06;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeWork extends TestBase {
    @Test
    public void findIframe() throws InterruptedException {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default_default");

        WebElement heading = driver.findElement(By.xpath("//div//iframe[@id='iframeResult']"));
        driver.switchTo().frame(heading);
        System.out.println(driver.findElement(By.xpath("//h1[.='This is a Heading']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[.='This is a paragraph.']")).getText());

        System.out.println(driver.findElement(By.xpath("//h1[.='This is a Heading']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//p[.='This is a paragraph.']")).isDisplayed());

        driver.switchTo().defaultContent();

        driver.findElement(By.id("runbtn")).click();
        Thread.sleep(3000);
    }
}
