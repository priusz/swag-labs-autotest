package bdd.step_definitions;

import com.codecool.pages.*;
import com.codecool.utils.Util;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class HookTest {

    private final WebDriver driver = new ChromeDriver();
    private final CartPage cartPage = new CartPage(driver);
    private final CheckOutPage checkOutPage = new CheckOutPage(driver);
    private final HomePage homePage = new HomePage(driver);
    private final ItemPage itemPage = new ItemPage(driver);
    private final LoginPage loginPage = new LoginPage(driver);


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

        driver.quit();
    }
}
