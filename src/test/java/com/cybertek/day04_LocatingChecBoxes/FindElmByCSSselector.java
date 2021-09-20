package com.cybertek.day04_LocatingChecBoxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElmByCSSselector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://search.yahoo.com/");
        //  <input type="text" class="sbq" id="yschsp" name="p" value="" role="combobox" >
        //WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        //WebElement searchBox = driver.findElement(By.cssSelector("input[name='p']"));
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='yschsp']"));
        //WebElement searchBox = driver.findElement(By.cssSelector("input[name='p'][type='text']"));
        searchBox.sendKeys("CSS selector");
        //<button id="sbq-clear" type="button" class="sbq-x">
        // <span class="sprite"></span>
        // </button>
        Thread.sleep(3000);
        WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearIcon.click();
        Thread.sleep(3000);
        searchBox.sendKeys("Xpath");

        WebElement searchIcon = driver.findElement(By.cssSelector("span[title='Search']"));
        Thread.sleep(3000);
        searchIcon.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
