package com.employees.webdriver;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class NotTextFileChosenTest {
    @Test
    public void CheckIfFileIsValid() throws NoAlertPresentException, InterruptedException {
        String URL = "http://localhost:3000";

        System.setProperty("webdriver.chrome.driver","D:\\JavaScript\\SirmaS\\selenium-test\\src\\test\\java\\com\\employees\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // find the input element
        driver.navigate().to(URL);

        WebElement elem = driver.findElement(By.xpath("//input[@type='file']"));

//        elem.sendKeys("D:\\JavaScript\\SirmaS\\selenium-test\\src\\test\\java\\com\\employees\\employees.txt");
        elem.sendKeys("D:\\JavaScript\\SirmaS\\selenium-test\\src\\test\\java\\com\\employees\\AYJuRke.png");

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
        alert.accept();

        driver.close();
    }

}
