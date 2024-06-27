package bdd.step_definitions;

import com.codecool.HomePage;
import com.codecool.LoginPage;
import com.codecool.config.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class LoginStep {

    private static final Logger logger = Logger.getLogger(LoginStep.class.getName());

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private final String password = System.getenv("password");

    @Before
    public void setUp() throws MalformedURLException {
        logger.info("Starting setup...");
        String browser = System.getProperty("browser", "chrome"); // Default to chrome if not specified
        logger.info("Browser: " + browser);
        driver = WebDriverFactory.createWebDriver(browser);
        logger.info("WebDriver initialized");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        logger.info("Setup completed");
    }

    @Given("I am a registered user")
    public void i_am_a_registered_user() {
        driver.get("https://www.saucedemo.com/");
        System.out.println("Registered user");
    }

    @When("I try to login with {string}")
    public void i_try_to_login_with_username_password(String username) {
        loginPage.handleLogin(username, password);
        System.out.println("Type in the username and the password");
    }

    @Then("I see the products text")
    public void i_see_the_products_text() {
        String actual = homePage.getProductTextField();
        String expected = "Products";
        Assertions.assertEquals(expected, actual);
        System.out.println("I see the Product text");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
