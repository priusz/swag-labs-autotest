package bdd.step_definitions;

import com.codecool.pages.CheckOutPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class CheckoutStep {

    private HookTest hookTest;

    @When("I add to the cart some {string} and click on checkout")
    public void i_add_to_the_cart_some_items(String items) throws MalformedURLException, URISyntaxException {
        hookTest = HookTest.getInstance(null);
        if (items.contains("backpack")) hookTest.getHomePage().clickOnBackPackAddToCartButton();
        else if (items.contains("bike light")) hookTest.getHomePage().clickOnBikeLightAddToCartButton();
        else if (items.contains("black shirt")) hookTest.getHomePage().clickOnBlackShirtAddToCartButton();
        else if (items.contains("jacket")) hookTest.getHomePage().clickOnJacketAddToCartButton();
        else if (items.contains("onesie")) hookTest.getHomePage().clickOnOnesieAddToCartButton();
        else if (items.contains("orange pulover")) hookTest.getHomePage().clickOnOrangePuloverAddToCartButton();
        hookTest.getHomePage().clickOnShopToCartButton();
        hookTest.getCartPage().clickCheckoutButton();
        System.out.println("I add items to the cart: " + items);
    }

    @Then("I can checkout and finish my order with {string} {string} {string}")
    public void i_see_the_selected_items_in_the_cart(String firstname, String lastname, String postalCode) {
        try {
            hookTest.getCheckOutPage().handleAddInformations(firstname, lastname, postalCode);
            String actualMessage = hookTest.getCheckOutPage().getCompleteText();
            String expectedMessage = "Thank you for your order!";
            Assertions.assertEquals(expectedMessage, actualMessage);
            System.out.println("I finish and checkout my order.");
        }
        catch (Exception e) {
            System.out.println("Failed to finish and checkout my order because " + e.getMessage());
        }
    }

    @After
    public void after() {
        hookTest.tearDown();
    }
}
