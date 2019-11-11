package com.employees.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//D:\JavaScript\SirmaS\selenium-test\src\test\java\com\employees

public class SiteLoadingTest {
    @Test
    public void StartWebDriver() {
        String URL = "http://localhost:3000";

        System.setProperty("webdriver.chrome.driver","D:\\JavaScript\\SirmaS\\selenium-test\\src\\test\\java\\com\\employees\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to(URL);

        Assert.assertTrue("Title should start differently", driver.getTitle().startsWith("Employees"));

        driver.close();
    }
}
