package com.webOrderWebPage.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setWebDriver(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser(){
        driver.close();
    }
}
