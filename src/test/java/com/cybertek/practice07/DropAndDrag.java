package com.cybertek.practice07;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DropAndDrag {
    @Test
    public void dropDrag() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));
        System.out.println("before = " + bigCircle.getText());

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        //actions.dragAndDrop(smallCircle,bigCircle).perform(); one way
        actions.clickAndHold(smallCircle).pause(2000).moveToElement(bigCircle).pause(2000).release().perform(); // other way
        System.out.println("After = " + bigCircle.getText());

        Thread.sleep(3000);
        driver.quit();
    }
}
