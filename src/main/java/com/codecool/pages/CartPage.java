package com.codecool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Sauce Labs Backpack")
    private WebElement sauceLabsBackpack;

    @FindBy(linkText = "Sauce Labs Bike Light")
    private WebElement sauceLabsBikeLight;

    @FindBy(linkText = "Sauce Labs Bolt T-Shirt")
    private WebElement sauceLabsBlackShirt;

    @FindBy(linkText = "Sauce Labs Fleece Jacket")
    private WebElement sauceLabsJacket;

    @FindBy(linkText = "Sauce Labs Onesie")
    private WebElement sauceLabsOnesie;

    @FindBy(linkText = "Test.allTheThings() T-Shirt (Red)")
    private WebElement sauceLabsOrangePulover;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public boolean isSauceLabsBackpackPresent() {
        return sauceLabsBackpack.isDisplayed();
    }

    public boolean isSauceLabsBikeLightPresent() {
        return sauceLabsBikeLight.isDisplayed();
    }

    public boolean isSauceLabsBlackShirtPresent() {
        return sauceLabsBlackShirt.isDisplayed();
    }

    public boolean isSauceLabsJacketPresent() {
        return sauceLabsJacket.isDisplayed();
    }

    public boolean isSauceLabsOnesiePresent() {
        return sauceLabsOnesie.isDisplayed();
    }

    public boolean isSauceLabsOrangePuloverPresent() {
        return sauceLabsOrangePulover.isDisplayed();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }
}
