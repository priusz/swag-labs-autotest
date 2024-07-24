package bdd.step_definitions;

import com.codecool.pages.CheckOutPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutStep {

    private HookTest hookTest;

    @Before
    public void before() {
        hookTest = new HookTest();
        hookTest.getDriver().manage().window().maximize();
    }

    @Then("I can checkout and finish my order with {string} {string} {string}")
    public void i_see_the_selected_items_in_the_cart(String firstname, String lastname, String postalCode) {
        hookTest.getCheckOutPage().handleAddInformations(firstname, lastname, postalCode);
        String actualMessage = hookTest.getCheckOutPage().getCompleteText();
        String expectedMessage = "Thank you for your order!";
        Assertions.assertEquals(expectedMessage, actualMessage);
        System.out.println("I finish and checkout my order.");
    }

    @After
    public void after() {
        hookTest.tearDown();
    }
}
