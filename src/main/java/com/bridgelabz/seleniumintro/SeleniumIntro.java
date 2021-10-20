package com.bridgelabz.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumIntro {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
       driver.findElement(By.name("pass")).sendKeys("Teju@123");
       boolean loginBtnEnable= driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
        System.out.println("Is login button enabled:"+loginBtnEnable);
        //boolean createBtnEnable = driver.findElement(By.xpath("//[a@clas='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).isEnabled();
        //System.out.println("Is Create button enabled:"+createBtnEnable);

        /*driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
        driver.findElement(By.name("firstname")).sendKeys("Teju");
        driver.findElement(By.name("lastname")).sendKeys("Kharmate");
        driver.findElement(By.name("reg_email__")).sendKeys("Teju@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("25268");*/




        //driver.quit();
        //System.out.println(driver.getTitle());
    }
}
