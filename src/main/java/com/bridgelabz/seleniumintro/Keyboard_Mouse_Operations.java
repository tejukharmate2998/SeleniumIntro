package com.bridgelabz.seleniumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard_Mouse_Operations {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);

        Robot r = new Robot();

        r.mouseMove(300, 500);

        r.keyPress(KeyEvent.VK_ALT);

        r.keyPress(KeyEvent.VK_F);

        r.keyRelease(KeyEvent.VK_F);

        r.keyRelease(KeyEvent.VK_ALT);
        Thread.sleep(3000);

        r.keyPress(KeyEvent.VK_W);

        r.keyRelease(KeyEvent.VK_W);
        Thread.sleep(3000);

        driver.quit();
    }
}



