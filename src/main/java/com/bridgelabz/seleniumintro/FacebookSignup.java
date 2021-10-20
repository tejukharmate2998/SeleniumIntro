package com.bridgelabz.seleniumintro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class FacebookSignup{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("Teju@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("password");

        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Teju");
        driver.findElement(By.name("login")).sendKeys("Kharmate");
        driver.findElement(By.name("reg_email__")).sendKeys("Teju@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("253652");

       /*Thread.sleep(1000);
       driver.findElement(By.id("day")).sendKeys("30");
       Thread.sleep(500);
       driver.findElement(By.id("month")).sendKeys("Feb");
       Thread.sleep(1000);
       driver.findElement(By.id("year")).sendKeys("2010");*/

        Thread.sleep(1000);
        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByIndex(5);

        Thread.sleep(1000);
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("1");

        Thread.sleep(1000);
        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("2010");


        List<WebElement> gender = driver.findElements(By.name("sex"));
        gender.get(2).click();

    }
}

