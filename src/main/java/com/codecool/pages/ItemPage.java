package com.codecool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ItemPage extends BasePage {

    WebDriverWait wait;

    public ItemPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    @FindBy(css = "[data-test='inventory-item-desc']")
    private WebElement itemDescriptionField;

    public String getItemDescriptionText() {
        return wait.until(ExpectedConditions.visibilityOf(itemDescriptionField)).getText();
    }

}
