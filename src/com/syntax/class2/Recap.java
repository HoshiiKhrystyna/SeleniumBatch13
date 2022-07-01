package com.syntax.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Recap {
    public static void main(String[] args) {
       // System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
       // WebDriver driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://www.fb.com");
         driver.manage().window().maximize();
         String title=driver.getTitle();
         String expectedTitle="Facebook - log in or sign up";
         if(title.equals(expectedTitle)){
             System.out.println("Title is correct");
         }else{
             System.out.println("Title is not correct");
         }
driver.quit();
    }
}
