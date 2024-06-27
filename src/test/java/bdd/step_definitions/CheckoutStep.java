package bdd.step_definitions;

import com.codecool.CartPage;
import com.codecool.CheckOutPage;
import com.codecool.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutStep {

    private WebDriver driver;
    private CheckOutPage checkOutPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        checkOutPage = new CheckOutPage(driver);
    }

    @Then("I can checkout and finish my order with {string} {string} {string}")
    public void i_see_the_selected_items_in_the_cart(String firstname, String lastname, String postalCode) {
        checkOutPage.handleAddInformations(firstname, lastname, postalCode);
        String actualMessage = checkOutPage.getCompleteText();
        String expectedMessage = "Thank you for your order!";
        Assertions.assertEquals(expectedMessage, actualMessage);
        System.out.println("I finish and checkout my order.");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
