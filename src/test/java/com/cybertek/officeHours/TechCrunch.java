package com.cybertek.officeHours;

import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TechCrunch extends TestBase {

    @Test
    public void testCru(){

        driver.get(ConfigReader.read("tech_crunch"));

        // latesNews xpath:  //article[@class='post-block post-block--image post-block--unread']
        // Author xpath: //article[@class='post-block post-block--image post-block--unread'][1]//a[contains(@aria-label,'Posts by')]
        // images xpath //article[@class='post-block post-block--image post-block--unread'][1]//img

        List<WebElement> latestNews = driver.findElements(By.xpath("//article[@class='post-block post-block--image post-block--unread']"));
        System.out.println("latestNews.size() = " + latestNews.size());

        for (int i = 1; i < latestNews.size(); i++) {
            String authorLocator = "//article[@class='post-block post-block--image post-block--unread']["+i+"]//a[contains(@aria-label,'Posts by')]";
            WebElement author = driver.findElement(By.xpath(authorLocator));
            Assertions.assertTrue(author.isDisplayed());
            System.out.println("author.getText() = " + author.getText());

            String imgLocator = "//article[@class='post-block post-block--image post-block--unread']["+i+"]//img";
            WebElement img = driver.findElement(By.xpath(imgLocator));
            Assertions.assertTrue(img.isDisplayed());
        }

        latestNews.get(2).click();

        // random title xpath = //h1[@class='article__title']
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = driver.findElement(By.xpath("//h1[@class='article__title']")).getText();
        System.out.println("expectedTitle = " + expectedTitle);

        Assertions.assertTrue(actualTitle.contains(expectedTitle));

        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='article-content']//a"));
        
        Assertions.assertTrue(allLinks.size()>0);

        for (WebElement eachLink : allLinks) {
            System.out.println("eachLink.getAttribute(\"href\") = " + eachLink.getAttribute("href"));
        }
        



    }
}
