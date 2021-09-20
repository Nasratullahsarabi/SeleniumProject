package com.cybertek.practice07;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOver2 extends TestBase {
    @Test
    public void user2() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");


        WebElement smallDrop = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement bigDrop = driver.findElement(By.id("droptarget"));

        System.out.println("bigDrop.getText() = " + bigDrop.getText());
        Actions actions = new Actions(driver);

        //actions.dragAndDrop(smallDrop,bigDrop).perform();
        actions.moveToElement(smallDrop).clickAndHold().moveToElement(bigDrop).release().perform();

        System.out.println("bigDrop.getText() = " + bigDrop.getText());

        Thread.sleep(10000);

    }
}
