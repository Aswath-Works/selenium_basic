package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
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
        cartLink.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.findElement(By.id("checkout")).click();
        WebElement checkout = driver.findElement(By.className("title"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        System.out.println(checkout.getText() + " is visible");
        driver.quit();
    }
}

