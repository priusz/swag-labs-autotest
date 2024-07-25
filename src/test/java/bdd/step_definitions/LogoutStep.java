package bdd.step_definitions;

import com.codecool.pages.HomePage;
import com.codecool.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class LogoutStep {

    private HookTest hookTest;
    private final String password = System.getenv("password");
    private final String url = System.getenv("base_url");


    @Given("I am a logged in user as {string}, using {string}")
    public void i_am_a_logged_in_user(String username, String browser) throws MalformedURLException, URISyntaxException {
        hookTest = HookTest.getInstance(browser);
        hookTest.getDriver().get(url);
        hookTest.getLoginPage().handleLogin(username, password);
        System.out.println("I am logging in user as " + username);
    }

    @When("I try to log out")
    public void i_try_to_log_out() {
        hookTest.getHomePage().handleLogout();
        System.out.println("I click on the logout button");
    }

    @Then("I see the login button, using {string}")
    public void i_see_the_login_button(String browser) {
        try {
            boolean isLoginButtonPresent = hookTest.getLoginPage().isLoginButtonPresent();
            Assertions.assertTrue(isLoginButtonPresent);
            System.out.println("I see the login button");
        }
        catch (Exception e) {
            System.out.println("Failed to see the login button using " + browser + ", because " + e.getMessage());
        }

    }
}
