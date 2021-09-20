package com.cybertek.practice07;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class HoverOver extends TestBase {
//    @Test
//    public void hoverOver(){
//        driver.get("http://practice.cybertekschool.com/hovers");
//
//        WebElement firstImage = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
//
//        WebElement firstImageText = driver.findElement(By.xpath("//h5[.='name: user1']"));
//        System.out.println(firstImageText.getText());
//        System.out.println(firstImageText.isDisplayed());
//        Assertions.assertFalse(firstImage.isDisplayed());
//        Actions actions = new Actions(driver);
//        actions.moveToElement(firstImage).perform();
//        System.out.println(firstImageText.isDisplayed());
//        Assertions.assertTrue(firstImage.isDisplayed());
//    }
    @Test
    public void dragAndDropTest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        Thread.sleep(3000);
        WebElement smallDrop = driver.findElement(By.id("draggable"));
        WebElement bigDrop = driver.findElement(By.id("droptarget"));

        System.out.println("bigDrop.getText() = " + bigDrop.getText());
        Actions actions = new Actions(driver);

        //actions.dragAndDrop(smallDrop,bigDrop).perform();
        actions.moveToElement(smallDrop).clickAndHold().moveToElement(bigDrop).release().perform();

        System.out.println("bigDrop.getText() = " + bigDrop.getText());
        Thread.sleep(3000);


    }
}
