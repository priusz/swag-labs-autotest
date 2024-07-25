package bdd.step_definitions;

import com.codecool.pages.*;
import com.codecool.utils.Util;
import org.openqa.selenium.WebDriver;

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
    private Util util;

    private HookTest(String browser) throws MalformedURLException, URISyntaxException {
        util = new Util();
        driver = util.createBrowserDriver(browser);
        cartPage = new CartPage(driver);
        checkOutPage = new CheckOutPage(driver);
        homePage = new HomePage(driver);
        itemPage = new ItemPage(driver);
        loginPage = new LoginPage(driver);
    }

    public static HookTest getInstance(String browser) throws MalformedURLException, URISyntaxException {
        if (instance == null) {
            instance = new HookTest(browser);
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
