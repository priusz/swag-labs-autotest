package bdd.step_definitions;

import com.codecool.pages.*;
import com.codecool.utils.Util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class HookTest {

    private static HookTest instance;
    private WebDriver driver;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;
    private HomePage homePage;
    private ItemPage itemPage;
    private LoginPage loginPage;

    private HookTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-first-run");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--disable-default-apps");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        cartPage = new CartPage(driver);
        checkOutPage = new CheckOutPage(driver);
        homePage = new HomePage(driver);
        itemPage = new ItemPage(driver);
        loginPage = new LoginPage(driver);
    }

    public static HookTest getInstance() {
        if (instance == null) {
            instance = new HookTest();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public CartPage getCartPage() {
        return cartPage;
    }

    public CheckOutPage getCheckOutPage() {
        return checkOutPage;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public ItemPage getItemPage() {
        return itemPage;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
            instance = null;
        }
    }
}
