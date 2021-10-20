package com.bridgelabz.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("myText")).sendKeys("Teju@gmail.com");
        TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
        File src=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File dest =  new File("C:\\Users\\tkharma\\IdeaProjects\\SeleniumIntro\\ScreenShot\\"+System.currentTimeMillis()+".jpg");
        FileHandler.copy(src,dest);
        System.out.println("SS taken");




    }
}
