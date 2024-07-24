package com.codecool.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage extends BasePage {

    private WebDriverWait wait;

    public CheckOutPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));;
    }

    @FindBy(id = "first-name")
    private WebElement firstNameField;

    @FindBy(id = "last-name")
    private WebElement lastNameField;

    @FindBy(id = "postal-code")
    private WebElement postalCodeField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(css = "[data-test='complete-header']")
    private WebElement completeText;

    private void fillFirstNameField(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(firstNameField)).clear();
        firstNameField.sendKeys(firstName);
    }

    private void fillLastNameField(String lastName) {
        wait.until(ExpectedConditions.visibilityOf(lastNameField)).clear();
        lastNameField.sendKeys(lastName);
    }

    private void fillPostalCodeField(String postalCode) {
        wait.until(ExpectedConditions.visibilityOf(postalCodeField)).clear();
        postalCodeField.sendKeys(postalCode);
    }

    public void handleAddInformations(String firstName, String lastName, String postalCode) {
        fillFirstNameField(firstName);
        fillLastNameField(lastName);
        fillPostalCodeField(postalCode);
        continueButton.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", finishButton);
        finishButton.click();
    }

    public String getCompleteText() {
        return completeText.getText();
    }
}
