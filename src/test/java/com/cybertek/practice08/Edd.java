package com.cybertek.practice08;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Edd extends TestBase {
    @Test
    public void edd(){
        driver.get("https://portal.edd.ca.gov/WebApp/Login?resource_url=https%3A%2F%2Fuio.edd.ca.gov%252FUIO%252FPages%252FPublic%252FExternalUser%252FUIOnlineLandingPage.aspx");
        driver.findElement(By.id("username")).sendKeys("nasratullah_sarabi@yahoo.com");
        BrowserUtil.waitFor(1);
        WebElement iFramElm = driver.findElement(By.cssSelector("iframe[title^='reCAPTCHA']"));
        driver.switchTo().frame(iFramElm);
        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
        BrowserUtil.waitFor(2);
        driver.findElement(By.id("submitButton")).click();
        BrowserUtil.waitFor(1);
        driver.findElement(By.id("password")).sendKeys("Asadullah1@");
        BrowserUtil.waitFor(2);
    }
}
