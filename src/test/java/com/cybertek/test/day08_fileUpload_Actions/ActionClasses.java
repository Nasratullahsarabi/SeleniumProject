package com.cybertek.test.day08_fileUpload_Actions;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActionClasses extends TestBase {

    @Test
    public void testHoverAction(){
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1Elm = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img1Elm).perform();
        WebElement firstProfileElm = driver.findElement(By.xpath("//h5[.='name: user1']"));
        System.out.println(firstProfileElm.getText());
        BrowserUtil.waitFor(2);
        WebElement img2Elm = driver.findElement(By.xpath("(//div[@class='figure']/img)[2]"));
        actions.moveToElement(img2Elm).perform();
        WebElement secondProfileElm = driver.findElement(By.xpath("//h5[.='name: user2']"));
        System.out.println("secondProfileElm.getText() = " + secondProfileElm.getText());
        BrowserUtil.waitFor(2);
        WebElement img3Elm = driver.findElement(By.xpath("(//div[@class='figure']/img)[3]"));
        actions.moveToElement(img3Elm).perform();
        WebElement thirdProfileElm = driver.findElement(By.xpath("//h5[.='name: user3']"));
        System.out.println("thirdProfileElm.getText() = " + thirdProfileElm.getText());
        BrowserUtil.waitFor(2);

    }

        @Test
    public void dragAndDrp() {

            driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
            BrowserUtil.waitFor(2);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
            WebElement smallCircle = driver.findElement(By.id("draggable"));
            WebElement bigCircle = driver.findElement(By.id("droptarget"));
            System.out.println(bigCircle.getText());

            Actions actions = new Actions(driver);

            BrowserUtil.waitFor(2);
            actions.dragAndDrop(smallCircle,bigCircle).perform();
            System.out.println(bigCircle.getText());

            assertEquals("You did great!",bigCircle.getText());

        }

        @Test
    public void keyBoardAction(){
        driver.get("https://google.com");

       WebElement searchBox = driver.findElement(By.name("q"));
       Actions actions = new Actions(driver);
       actions.keyDown(Keys.SHIFT).sendKeys("i love selenium")
               .pause(2000).keyUp(Keys.SHIFT)
               .sendKeys("i love selenim").pause(2000)
               .keyDown(Keys.CONTROL).sendKeys("A")
               .keyUp(Keys.CONTROL).pause(2000)
               .sendKeys(Keys.BACK_SPACE)
               .perform();
    }

    @Test
    public void doubleClick(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        BrowserUtil.waitFor(2);
        driver.switchTo().frame("iframeResult");
        WebElement pElm1 = driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(pElm1).perform();

        BrowserUtil.waitFor(3);
        String expectedResult = driver.findElement(By.id("demo")).getText();
        String actualResult = "Hello World2";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void rightClick()  {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");

        driver.switchTo().frame("iframeResult");
        WebElement yellowArea = driver.findElement(By.cssSelector("div[contextmenu='mymenu']"));
        Actions actions = new Actions(driver);
        actions.contextClick(yellowArea).perform();

        driver.switchTo().alert().accept();
        BrowserUtil.waitFor(2);

    }

//    @Test
//    public void tab(){
//        driver.get();
//    }
}
