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

public class LogoutStep {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private final String password = System.getenv("password");

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Given("I am a logged in user as {string}")
    public void i_am_a_logged_in_user(String username) {
        driver.get("https://www.saucedemo.com/");
        loginPage.handleLogin(username, password);
        System.out.println("I am logging in user as " + username);
    }

    @When("I try to log out")
    public void i_try_to_log_out() {
        homePage.handleLogout();
        System.out.println("I click on the logout button");
    }

    @Then("I see the login button")
    public void i_see_the_login_button() {
        boolean isLoginButtonPresent = loginPage.isLoginButtonPresent();
        Assertions.assertTrue(isLoginButtonPresent);
        System.out.println("I see the login button");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
