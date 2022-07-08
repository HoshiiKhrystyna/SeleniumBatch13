package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
     WebElement startPracticing= driver.findElement(By.cssSelector("a#btn_basic_example"));
     startPracticing.click();
     Thread.sleep(2000);
     WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
     simpleFormDemo.click();
    WebElement textBox = driver.findElement(By.cssSelector("input[placeholder ^= 'Please enter']"));
    textBox.sendKeys("Angry");
    Thread.sleep(2000);
WebElement showMessage = driver.findElement(By.cssSelector("button[onclick *= 'show']"));
showMessage.click();
Thread.sleep(2000);
driver.quit();



    }
}
