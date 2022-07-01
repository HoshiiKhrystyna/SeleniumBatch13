package com.syntax.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//launch the browser
        driver.get("http://www.facebook.com");
       // WebDriver driver1=new ChromeDriver();//if we want open two url
        driver.navigate().to("http://www.google.com");
driver.navigate().back();
driver.navigate().forward();
Thread.sleep(2000);//pause the execution for 2 second
driver.navigate().refresh();
//driver.close();//close the current single tab
driver.quit();//close the whole browser
    }
}
