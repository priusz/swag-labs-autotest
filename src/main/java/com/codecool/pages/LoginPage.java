package com.codecool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    private void fillUsernameField(String username) {
        usernameField.sendKeys(username);
    }

    private void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    private void clickLoginButton() {
        loginButton.click();
    }

    public void handleLogin(String username, String password) {
        fillUsernameField(username);
        fillPasswordField(password);
        clickLoginButton();
    }

    public boolean isLoginButtonPresent() {
        return loginButton.isDisplayed();
    }
}
