package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
WebElement firstName=driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Khrystyna");
     WebElement lastName= driver.findElement(By.id("customer.lastName"));
     lastName.sendKeys("Hoshii");
        WebElement address = driver.findElement(By.id("customer.address.street"));
        address.sendKeys("123 Streeet ");
        WebElement city=driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Schaumburg");
        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys("IL");
        WebElement zipCode =driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("60193");
        WebElement phone =driver.findElement(By.id("customer.phoneNumber"));
        phone.sendKeys("2i47628352935");
        WebElement SSN =driver.findElement(By.id("customer.ssn"));
        SSN.sendKeys("4873983452");
       WebElement userName=driver.findElement(By.id ("customer.username"));
       userName.sendKeys("Pavlo123");
        WebElement password =driver.findElement(By.id ("customer.password"));
        password.sendKeys("pass123");
        WebElement confirmPassword =driver.findElement(By.id ("repeatedPassword"));
        confirmPassword.sendKeys("pass123");
        driver.findElement(By.className("button")).click();
        String title=driver.getTitle();
        String expectedTitle="ParaBank | About Us";
        if(title.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is not correct");
        }

    }
}
