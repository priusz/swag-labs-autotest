package com.codecool.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{

    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //for login
    @FindBy(css = "[data-test='title']")
    private WebElement productTextField;

    //for logout
    @FindBy(css = "#react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(css = "[data-test='logout-sidebar-link']")
    private WebElement logoutButton;

    @FindBy(css = "[data-test='item-4-title-link'] [data-test]")
    private WebElement backPackHeader;

    @FindBy(css = "[data-test='item-0-title-link'] [data-test]")
    private WebElement bikeLightHeader;

    @FindBy(css = "[data-test='item-1-title-link'] [data-test]")
    private WebElement blackShirtHeader;

    @FindBy(css = "[data-test='item-5-title-link'] [data-test]")
    private WebElement jacketHeader;

    @FindBy(css = "[data-test='item-2-title-link'] [data-test]")
    private WebElement onesieHeader;

    @FindBy(css = "[data-test='item-3-title-link'] [data-test]")
    private WebElement orangePuloverHeader;

    @FindBy(css = ".product_sort_container")
    private WebElement productSortButton;

    @FindBy(css = "option[value='az']")
    private WebElement sortByNameAscButton;

    @FindBy(css = "option[value='za']")
    private WebElement sortByNameDescButton;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> productsInActualOrder;

    //for addToCart
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backPackAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement bikeLightAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement blackShirtAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement jacketAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement onesieAddToCartButton;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement orangePuloverAddToCartButton;

    @FindBy(css = "[data-test='shopping-cart-link']")
    private WebElement addToCartButton;

    @FindBy(css = "[data-test='shopping-cart-badge']")
    private WebElement shoppingCartButton;

    private void clickOnMenuButton(){
        menuButton.click();
    }

    private void clickOnLogoutButton() {
        wait.until(ExpectedConditions.visibilityOf(logoutButton)).click();
    }

    public void clickOnBackpackHeader() {
        wait.until(ExpectedConditions.visibilityOf(backPackHeader)).click();
    }

    public void clickOnBikeLightHeader() {
        wait.until(ExpectedConditions.visibilityOf(bikeLightHeader)).click();
    }

    public void clickOnBlackShirtHeader() {
        wait.until(ExpectedConditions.visibilityOf(blackShirtHeader)).click();
    }

    public void clickOnJacketHeader() {
        wait.until(ExpectedConditions.visibilityOf(jacketHeader)).click();
    }

    public void clickOnOnesieHeader() {
        wait.until(ExpectedConditions.visibilityOf(onesieHeader)).click();
    }

    public void clickOnOrangePuloverHeader() {
        wait.until(ExpectedConditions.visibilityOf(orangePuloverHeader)).click();
    }

    public String getProductTextField() {
        return productTextField.getText();
    }

    public void handleLogout(){
        clickOnMenuButton();
        clickOnLogoutButton();
    }

    public void sortItemsByNamesAsc(){
        wait.until(ExpectedConditions.visibilityOf(productSortButton)).click();
        wait.until(ExpectedConditions.visibilityOf(sortByNameAscButton)).click();
    }

    public void sortItemsByNamesDesc(){
        wait.until(ExpectedConditions.visibilityOf(productSortButton)).click();
        wait.until(ExpectedConditions.visibilityOf(sortByNameDescButton)).click();
    }

    public List<String> getProductNamesInActualOrder(){
        List<String> productNamesInActualOrder = new ArrayList<>();
        for (WebElement item : productsInActualOrder) {
            productNamesInActualOrder.add(item.getText());
        }
        return productNamesInActualOrder;
    }

    public void clickOnBackPackAddToCartButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", backPackAddToCartButton);
        wait.until(ExpectedConditions.visibilityOf(backPackAddToCartButton)).click();
    }

    public void clickOnBikeLightAddToCartButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bikeLightAddToCartButton);
        wait.until(ExpectedConditions.visibilityOf(bikeLightAddToCartButton)).click();
    }

    public void clickOnBlackShirtAddToCartButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blackShirtAddToCartButton);
        wait.until(ExpectedConditions.visibilityOf(blackShirtAddToCartButton)).click();
    }

    public void clickOnJacketAddToCartButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", jacketAddToCartButton);
        wait.until(ExpectedConditions.visibilityOf(jacketAddToCartButton)).click();
    }

    public void clickOnOnesieAddToCartButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", onesieAddToCartButton);
        wait.until(ExpectedConditions.visibilityOf(onesieAddToCartButton)).click();
    }

    public void clickOnOrangePuloverAddToCartButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orangePuloverAddToCartButton);
        wait.until(ExpectedConditions.visibilityOf(orangePuloverAddToCartButton)).click();
    }

    public void clickOnAddToCartButton() {
        wait.until(ExpectedConditions.visibilityOf(addToCartButton)).click();
    }

    public void clickOnShopToCartButton() {
        wait.until(ExpectedConditions.visibilityOf(addToCartButton)).click();
    }

}
