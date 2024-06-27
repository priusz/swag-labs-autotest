package com.codecool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{

    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    @FindBy(css = "[data-test='title']")
    private WebElement productTextField;

    @FindBy(css = "#react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(css = "[data-test='logout-sidebar-link']")
    private WebElement logoutButton;

    private void clickOnMenuButton(){
        menuButton.click();
    }

    private void clickOnLogoutButton() {
        wait.until(ExpectedConditions.visibilityOf(logoutButton)).click();
    }

    public String getProductTextField() {
        return productTextField.getText();
    }

    public void handleLogout(){
        clickOnMenuButton();
        clickOnLogoutButton();
    }
}
