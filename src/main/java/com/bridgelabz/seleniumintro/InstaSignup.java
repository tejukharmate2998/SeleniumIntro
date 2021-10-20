package com.bridgelabz.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaSignup {
     public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.instagram.com/?hl=en");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//span[@class='_7UhW9   xLCgt       qyrsm      gtFbE      se6yk        ']")).click();
          driver.findElement(By.name("emailOrPhone")).sendKeys("Teju");
          driver.findElement(By.name("fullName")).sendKeys("Teju Kharmate");
          driver.findElement(By.name("username")).sendKeys("Teju123");
          driver.findElement(By.name("password")).sendKeys("123");




     }
}
