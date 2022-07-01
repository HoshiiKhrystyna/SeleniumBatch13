package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(3000);
       driver.findElement(By.name("firstname")).sendKeys("Khrystyna");
       driver.findElement(By.name("lastname")).sendKeys("hoshii");
       driver.findElement(By.name("reg_email__")).sendKeys("jdhgcsjh@gmail.com");
       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jdhgcsjh@gmail.com");
       driver.findElement(By.id("password_step_input")).sendKeys("123pass");
       driver.findElement(By.name("birthday_month")).sendKeys("Jan");
       driver.findElement(By.id("day")).sendKeys("01");
       driver.findElement(By.id("year")).sendKeys("1992");
       Thread.sleep(2000);
       driver.findElement(By.name("sex")).click();
       Thread.sleep(2000);
       //driver.findElement(By.name("websubmit")).click();
    }
}
