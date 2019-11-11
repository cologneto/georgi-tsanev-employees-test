package com.employees.webdriver;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextFileChosenTest {
    @Test
    public void CheckIfFileIsValid() throws NoAlertPresentException, InterruptedException {
        String URL = "http://localhost:3000";

        System.setProperty("webdriver.chrome.driver","D:\\JavaScript\\SirmaS\\selenium-test\\src\\test\\java\\com\\employees\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // find the input element
        driver.navigate().to(URL);

        WebElement elem = driver.findElement(By.xpath("//input[@type='file']"));

        // 'type' the file location to it as it were a usual <input type='text' /> element
        elem.sendKeys("D:\\JavaScript\\SirmaS\\selenium-test\\src\\test\\java\\com\\employees\\employees.txt");

        driver.close();
    }

}
