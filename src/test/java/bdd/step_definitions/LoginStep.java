package bdd.step_definitions;

import com.codecool.pages.HomePage;
import com.codecool.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URISyntaxException;


public class LoginStep {

    private HookTest hookTest;
    private final String password = System.getenv("password");
    private final String url = System.getenv("base_url");

    @Before
    public void before() throws MalformedURLException, URISyntaxException {

    }

    @Given("I am a registered user, using {string}")
    public void i_am_a_registered_user(String browser) throws MalformedURLException, URISyntaxException {
        hookTest = HookTest.getInstance(browser);
        hookTest.getDriver().get(url);
        hookTest.getDriver().manage().window().maximize();
        System.out.println("Registered user");
    }

    @When("I try to login with {string}")
    public void i_try_to_login_with_username_password(String username) {
        hookTest.getLoginPage().handleLogin(username, password);
        System.out.println("Type in the username and the password");
    }

    @Then("I see the products text")
    public void i_see_the_products_text() {
        try {
            String actual = hookTest.getHomePage().getProductTextField();
            String expected = "Products";
            Assertions.assertEquals(expected, actual);
            System.out.println("I see the Product text");
        }
        catch (Exception e) {
            System.out.println("Failed to see the Product text, because " + e.getMessage());
        }

    }
    @After
    public void after() {
        hookTest.tearDown();
    }
}