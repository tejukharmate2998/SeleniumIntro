package com.bridgelabz.seleniumintro;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
//scroll down on the webpage
            javascriptExecutor.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        for (int i = 1; i < 10; i++) {
//scroll down on the webpage
            javascriptExecutor.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }
        }


    }
