package bdd.step_definitions;

import com.codecool.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStep {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        System.out.println("test");
    }

    @Given("I am a registered user")
    public void i_am_a_registered_user() {
        driver.get("https://www.saucedemo.com/");
        System.out.println("Registered user");
    }

    @When("I try to login with {string} {string}")
    public void i_try_to_login_with_username_password(String username, String password) {
        loginPage.handleLogin(username, password);
        System.out.println("Type in the username and the password");
    }

    @Then("I see the products text")
    public void i_see_the_products_text() {
        System.out.println("I see the Product text");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}