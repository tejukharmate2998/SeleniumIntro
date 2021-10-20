package com.bridgelabz.seleniumintro;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enterText_intoDisabledTextbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\tkharma\\IdeaProjects\\SeleniumIntro\\src\\main\\resources\\DisabledTextBox.html");
        JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
        Thread.sleep(2000);
        javascriptExecutor.executeScript("document.getElementById('t1').value='admin'");
        Thread.sleep(2000);
        javascriptExecutor.executeScript("document.getElementById('t2').value=''");
        javascriptExecutor.executeScript("document.getElementById('t2').value='manager'");
        javascriptExecutor.executeScript("document.getElementById('t2').type='button'");





    }
}
