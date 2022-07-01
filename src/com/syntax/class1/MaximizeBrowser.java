package com.syntax.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//launch the browser
        driver.navigate().to("http://www.amazon.com");
        driver.manage().window().maximize();
       // driver.manage().window().fullscreen();//we can use also fullscreen not only maximize

    }
}
