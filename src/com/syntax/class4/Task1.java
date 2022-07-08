package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       WebElement username= driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
       username.sendKeys("Admin");
       WebElement password=driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
       password.sendKeys("Hum@nhrm123");
       driver.findElement(By.xpath("//input[@id = 'btnLogin']")).click();
WebElement logo=driver.findElement(By.xpath("//img[@alt ='OrangeHRM']"));
boolean isLogoDisplayed=logo.isDisplayed();
      if(isLogoDisplayed){
          System.out.println(isLogoDisplayed+ " :You can see Syntax logo on the webpage");
      }else{
          System.out.println(isLogoDisplayed+" :check if you find element correctly");

      }
      driver.quit();
    }
}
