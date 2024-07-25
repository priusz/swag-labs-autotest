package bdd.step_definitions;

import com.codecool.pages.CartPage;
import com.codecool.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class CartStep {

    private HookTest hookTest;

    @When("I add to the cart some {string}")
    public void i_add_to_the_cart_some_items(String items) throws MalformedURLException, URISyntaxException {
        hookTest = HookTest.getInstance(null);
        if (items.contains("backpack")) hookTest.getHomePage().clickOnBackPackAddToCartButton();
        else if (items.contains("bike light")) hookTest.getHomePage().clickOnBikeLightAddToCartButton();
        else if (items.contains("black shirt")) hookTest.getHomePage().clickOnBlackShirtAddToCartButton();
        else if (items.contains("jacket")) hookTest.getHomePage().clickOnJacketAddToCartButton();
        else if (items.contains("onesie")) hookTest.getHomePage().clickOnOnesieAddToCartButton();
        else if (items.contains("orange pulover")) hookTest.getHomePage().clickOnOrangePuloverAddToCartButton();
        System.out.println("I add items to the cart: " + items);
    }

    @Then("I see the selected {string} in the cart, using {string}")
    public void i_see_the_selected_items_in_the_cart(String items, String browser) {
        try {
            boolean isAllItemsPresent = true;
            if (items.contains("backpack")) {
                if (!hookTest.getCartPage().isSauceLabsBackpackPresent()) isAllItemsPresent = false;
            }
            else if (items.contains("bike light")) {
                if (!hookTest.getCartPage().isSauceLabsBikeLightPresent()) isAllItemsPresent = false;
            }
            else if (items.contains("black shirt")) {
                if (!hookTest.getCartPage().isSauceLabsBlackShirtPresent()) isAllItemsPresent = false;
            }
            else if (items.contains("jacket")) {
                if (!hookTest.getCartPage().isSauceLabsJacketPresent()) isAllItemsPresent = false;
            }
            else if (items.contains("onesie")) {
                if (!hookTest.getCartPage().isSauceLabsOnesiePresent()) isAllItemsPresent = false;
            }
            else if (items.contains("orange pulover")) {
                if (!hookTest.getCartPage().isSauceLabsOrangePuloverPresent()) isAllItemsPresent = false;
            }
            Assertions.assertTrue(isAllItemsPresent);
            System.out.println("I see the selected item's in the cart: " + items);
        }
        catch (Exception e) {
            System.out.println("Failed to see the selected item's in the cart using " + browser + ", because " + e.getMessage());
        }
    }

}
