package com.syntax.reviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
       driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
     WebElement text= driver.findElement(By.id("user-message"));
text.sendKeys("Hello Pavlo");
Thread.sleep(2000);
        WebElement showMessage = driver.findElement(By.cssSelector("button[onclick *= 'show']"));
        showMessage.click();
       // driver.get("https://syntaxprojects.com/index.php");

       // WebElement button=driver.findElement(By.id("btn_basic_example"));
       // button.click();
      //  Thread.sleep(2000);
      //  WebElement button1=driver.findElement(By.partialLinkText("Proceed Next"));
     //   Thread.sleep(2000);
      //  button1.click();





    }
}
