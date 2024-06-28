package bdd.step_definitions;

import com.codecool.HomePage;
import com.codecool.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStep {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private final String password = System.getenv("password");
    private final String url = System.getenv("base_url");

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Given("I am a registered user")
    public void i_am_a_registered_user() {
        driver.get(url);
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
        driver.quit();
    }
}