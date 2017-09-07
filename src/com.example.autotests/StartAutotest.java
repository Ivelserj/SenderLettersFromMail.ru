package com.example.autotests;

/**
 * @author Sergey Khizhnyak
 */

import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class StartAutotest extends Assert {

    private static ChromeDriver driver;

    private String login = "TestMan05092017";
    private String pass = "Test20170905";
    private String email = "testman06092017@mail.ru";
    private String theme = "Test letter88";
    private String letters_body = "1.Good morning. My name is TestMan05092017. Nice to meet you!";

    @BeforeClass
    public static void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");
    }

    @Test
    public void StartAutotest() throws InterruptedException {

        LoginPageMailRu.LoginToTheSite(driver, login, pass);

        System.out.println("||||| User is logged in mail.ru! |||||");
        Thread.sleep(1000);

        HomePage.CreateLetter(driver, email, theme, letters_body);
        System.out.println("||||| Letter is sent! |||||");
    }

    @AfterClass
    public static void CloseBrowser(){
        driver.quit();
    }
}

