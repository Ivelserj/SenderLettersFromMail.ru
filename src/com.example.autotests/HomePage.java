package com.example.autotests;

/**
 * @author Sergey Khizhnyak
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage {

    public static void CreateLetter( ChromeDriver driver, String email, String theme, String letters_body) {

        WebElement NewLetter = driver.findElement((By.xpath(".//span[contains(text(),'Написать письмо')] ")));
        NewLetter.click();

        WebElement LettersEmail = driver.findElement(By.xpath(".//*[@data-original-name='To']"));
        LettersEmail.sendKeys(email);

        WebElement LettersTheme = driver.findElement(By.name("Subject"));
        LettersTheme.sendKeys(theme);
        LettersTheme.sendKeys(Keys.TAB + letters_body);

        WebElement Send = driver.findElement(By.xpath(".//span[contains(text(),'Отправить')] "));
        Send.click();
    }
}
