package com.cybertek.practice08;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PracticeHoverOver extends TestBase {
    @Test
    public void hoverOver(){
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement firstImg = driver.findElement(By.xpath("//div[@class='figure'][1]"));
        WebElement secondImg = driver.findElement(By.xpath("//div[@class='figure'][2]"));
        WebElement thirdImg = driver.findElement(By.xpath("//div[@class='figure'][3]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(firstImg).pause(2000).moveToElement(secondImg).pause(2000)
                .moveToElement(thirdImg).pause(2000).moveToElement(secondImg).pause(2000)
                .moveToElement(thirdImg).pause(2000).moveToElement(firstImg).pause(2000).perform();

        System.out.println(driver.findElement(By.xpath("//h5[.='name: user1']")).getText());
        System.out.println(driver.findElement(By.xpath("//h5[.='name: user2']")).getText());
        System.out.println(driver.findElement(By.xpath("//h5[.='name: user3']")).getText());
        BrowserUtil.waitFor(3);


    }

    @Test
    public void doubleClick(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        BrowserUtil.waitFor(3);
        driver.switchTo().frame("iframeResult");
        WebElement doubleClick = driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        BrowserUtil.waitFor(1);
        System.out.println("driver.findElement(By.id(\"demo\")).getText() = " + driver.findElement(By.id("demo")).getText());
        Assertions.assertEquals("Hello World", driver.findElement(By.id("demo")).getText());
    }

    @Test
    public void righClick(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");
        driver.switchTo().frame("iframeResult");
        WebElement righClick = driver.findElement(By.xpath("//div[@oncontextmenu='myFunction()']"));
        Actions actions = new Actions(driver);
        actions.contextClick(righClick).perform();
        BrowserUtil.waitFor(1);
        driver.switchTo().alert().accept();
        BrowserUtil.waitFor(3);
    }
}
