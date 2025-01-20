package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.click();
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys("admin123");
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(3000);
        WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        System.out.println(dashboard.getText() + " is visible");
        driver.quit();
    }
}
