package com.cybertek.test.day08_fileUpload_Actions;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class YahooPractice extends TestBase {
    @Test
    public void yahooSearch(){
        driver.get("https://search.yahoo.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement help = driver.findElement(By.xpath("(//a[.='Help'])[2]"));
        WebElement logo = driver.findElement(By.cssSelector(".spl > .wrap > .image > .thmb > .s-img.s-img-ll"));
        BrowserUtil.waitFor(2);

        jse.executeScript("arguments[0].scrollIntoView(true)",help);
        BrowserUtil.waitFor(3);

        jse.executeScript("arguments[0].scrollIntoView(true)",logo);

        BrowserUtil.waitFor(5);

    }
}
