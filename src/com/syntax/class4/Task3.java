package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username= driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Pavlo");
        WebElement button=driver.findElement(By.cssSelector("input#btnLogin"));
        button.click();
        WebElement msg= driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        boolean thisMsg=msg.isDisplayed();
        if(thisMsg){
            System.out.println("Password cannot be empty");
        }
        else{
            System.out.println("Should first enter valid password");
        }
driver.quit();
    }
}
