package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Swag_Labs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("user-name"));
        username.click();
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();
        WebElement cartLink = driver.findElement(By.id("shopping_cart_container"));
        //Thread.sleep(2000);
        cartLink.click();
        driver.navigate().back();
        //Thread.sleep(2000);
        driver.navigate().forward();
        //Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        //Thread.sleep(2000);
        WebElement checkout = driver.findElement(By.className("title"));
        System.out.println(checkout.getText() + " is visible");
        //Thread.sleep(3000);
        driver.quit();
    }
}
