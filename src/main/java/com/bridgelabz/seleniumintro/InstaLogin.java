package com.bridgelabz.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InstaLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.findElement(By.name("username")).sendKeys("Teju");
        driver.findElement(By.name("password")).sendKeys("123");
        boolean loginBtnEnable =driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).isEnabled();
        System.out.println("Is login button enable:"+loginBtnEnable);
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.xpath("//span[@class='_7UhW9   xLCgt       qyrsm      gtFbE      se6yk        ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("emailOrPhone")).sendKeys("Teju");
        Thread.sleep(2000);
        driver.findElement(By.name("fullName")).sendKeys("Teju Kharmate");
        driver.findElement(By.name("username")).sendKeys("Teju123");
        driver.findElement(By.name("password")).sendKeys("123@563223");
       driver.findElement(By.xpath("//button[@class ='sqdOP  L3NKy   y3zKF     ']")).click();
       driver.findElement(By.name("email")).sendKeys("Teju");
       Thread.sleep(2000);
       driver.findElement(By.name("pass")).sendKeys("522852");
       driver.findElement(By.id("loginbutton")).click();
       driver.findElement(By.xpath("//a[@class =_97w4']")).click();
        //Select select = new Select(driver.findElement(By.xpath("//select[@class='h144Z']")));
        //select.selectByValue("9");




    }
}
