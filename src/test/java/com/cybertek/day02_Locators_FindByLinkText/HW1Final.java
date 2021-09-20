package com.cybertek.day02_Locators_FindByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW1Final {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        1. navigate to https://google.com
        driver.get("https://google.com");
//        2. search for `selenium`
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
//        3. click google search button
        searchBox.submit();
//        4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
        WebElement result = driver.findElement(By.id("result-stats"));
//        5. get the text of that element
        System.out.println("result.getText() = " + result.getText());
//        6. extract the number of result and save it into long variable OPTIONALLy
        String resultNum = result.getText().substring(6,result.getText().indexOf(" result"));
        String removeComma = resultNum.replaceAll(",","");
        long number = Long.parseLong(removeComma);
        System.out.println("number = " + number);
        String resultTime = result.getText().substring(result.getText().indexOf("("),result.getText().indexOf(")")+1);
        System.out.println("resultTime = " + resultTime);
//        7. get all the link that contain text `selenium` into a List<WebElement>
       List<WebElement> allSelenium = driver.findElements(By.partialLinkText("Selenium"));
//        8. get the count
        System.out.println("allSelenium.size() = " + allSelenium.size());
//        9. get the first one text
        System.out.println("allSelenium.get(0) = " + allSelenium.get(0));
//        10. get the last one text
        System.out.println("allSelenium.get(allSelenium.size()-1) = " + allSelenium.get(allSelenium.size() - 1));
//        11. iterate over the list and print the text of each link
        for (WebElement eachLink : allSelenium) {
            System.out.println("eachLink.getText() = " + eachLink.getText());
        }
        driver.quit();
    }
}
