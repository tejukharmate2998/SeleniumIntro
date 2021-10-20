package com.bridgelabz.seleniumintro;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBottomofthePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
       WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
        System.out.println(element);
        int xCord = element.getLocation().getX();
        int yCord = element.getLocation().getY();
        System.out.println("X Co-coordinate value is : " + xCord);
        System.out.println("Y Co-coordinate value is : " + yCord);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(" + xCord + "," + yCord + ")");


    }
}







