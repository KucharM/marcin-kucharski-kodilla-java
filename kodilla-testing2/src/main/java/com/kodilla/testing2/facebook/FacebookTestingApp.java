package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String BIRTHDAY_FIELD = "//span[contains(@data-name, \"birthday_wrapper\")]/span/select[1]";
    public static final String MONTH_FIELD = "//span[contains(@data-name, \"birthday_wrapper\")]/span/select[2]";
    public static final String YEAR_FIELD = "//span[contains(@data-name, \"birthday_wrapper\")]/span/select[3]";
    public static final String XPATH_WAIT_FOR_BIRTHDAY = "//select[1]";
    public static final String XPATH_WAIT_FOR_MONTH = "//select[2]";
    public static final String XPATH_WAIT_FOR_YEAR = "//select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        boolean birthdayCondition = !driver.findElement(By.xpath(XPATH_WAIT_FOR_BIRTHDAY)).isDisplayed();
        boolean monthCondition = !driver.findElement(By.xpath(XPATH_WAIT_FOR_MONTH)).isDisplayed();
        boolean yearCondition = !driver.findElement(By.xpath(XPATH_WAIT_FOR_YEAR)).isDisplayed();

        while (birthdayCondition && monthCondition && yearCondition);

        WebElement birthdayField = driver.findElement(By.xpath(BIRTHDAY_FIELD));
        WebElement monthField = driver.findElement(By.xpath(MONTH_FIELD));
        WebElement yearField = driver.findElement(By.xpath(YEAR_FIELD));

        Select selectBirthday = new Select(birthdayField);
        Select selectMonth = new Select(monthField);
        Select selectYear = new Select(yearField);

        selectBirthday.selectByIndex(26);
        selectMonth.selectByIndex(12);
        selectYear.selectByIndex(35);
    }
}
