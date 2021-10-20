package com.bridgelabz.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
        driver.findElement(By.id("email")).sendKeys("Dhanashree");
        driver.findElement(By.name("pass")).sendKeys("lastname");
    }
}