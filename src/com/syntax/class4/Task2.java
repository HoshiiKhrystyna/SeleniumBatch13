package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println(allLinks);
        System.out.println(allLinks.size());
        for(WebElement links:allLinks){
            String text= links.getText();
            String fullLinks=links.getAttribute("href");
            if (!text.isEmpty()){
                System.out.println(fullLinks);
            }

        }
    }
}
