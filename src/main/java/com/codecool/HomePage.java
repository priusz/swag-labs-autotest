package com.codecool;

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
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
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

    @FindBy(linkText = "Name (A to Z)")
    private WebElement sortByNameAscButton;

    @FindBy(linkText = "Name (Z to A)")
    private WebElement sortByNameDescButton;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> productsInActualOrder;

    private void clickOnMenuButton(){
        menuButton.click();
    }

    private void clickOnLogoutButton() {
        wait.until(ExpectedConditions.visibilityOf(logoutButton)).click();
    }

    private void clickOnFirstHeader() {
        wait.until(ExpectedConditions.visibilityOf(backPackHeader)).click();
    }

    private void clickOnSecondHeader() {
        wait.until(ExpectedConditions.visibilityOf(bikeLightHeader)).click();
    }

    private void clickOnThirdHeader() {
        wait.until(ExpectedConditions.visibilityOf(blackShirtHeader)).click();
    }

    private void clickOnFourthHeader() {
        wait.until(ExpectedConditions.visibilityOf(jacketHeader)).click();
    }

    private void clickOnFifthHeader() {
        wait.until(ExpectedConditions.visibilityOf(onesieHeader)).click();
    }

    private void clickOnSixthHeader() {
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

}
