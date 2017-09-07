package com.example.autotests;

/**
 * @author Sergey Khizhnyak
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageMailRu {

    public static void LoginToTheSite(ChromeDriver driver, String login, String pass) {

        WebElement Log_field = driver.findElement(By.id("mailbox__login"));
        Log_field.sendKeys(login);

        WebElement Pass_field = driver.findElement(By.id("mailbox__password"));
        Pass_field.sendKeys(pass);
        Pass_field.submit();
    }

}