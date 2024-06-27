package bdd.step_definitions;

import com.codecool.CartPage;
import com.codecool.HomePage;
import com.codecool.ItemPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartSteps {

    private WebDriver driver;
    private HomePage homePage;
    private CartPage cartPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
    }

    @When("I add to the cart some {string}")
    public void i_add_to_the_cart_some_items(String items) {
        if (items.contains("backpack")) homePage.clickOnBackPackAddToCartButton();
        else if (items.contains("bike light")) homePage.clickOnBikeLightAddToCartButton();
        else if (items.contains("black shirt")) homePage.clickOnBlackShirtAddToCartButton();
        else if (items.contains("jacket")) homePage.clickOnJacketAddToCartButton();
        else if (items.contains("onesie")) homePage.clickOnOnesieAddToCartButton();
        else if (items.contains("orange pulover")) homePage.clickOnOrangePuloverAddToCartButton();
        System.out.println("I add items to the cart: " + items);
    }

    @Then("I see the selected {string} in the cart")
    public void i_see_the_selected_items_in_the_cart(String items) {
        boolean isAllItemsPresent = true;
        if (items.contains("backpack")) {
            if (!cartPage.isSauceLabsBackpackPresent()) isAllItemsPresent = false;
        }
        else if (items.contains("bike light")) {
            if (!cartPage.isSauceLabsBikeLightPresent()) isAllItemsPresent = false;
        }
        else if (items.contains("black shirt")) {
            if (!cartPage.isSauceLabsBlackShirtPresent()) isAllItemsPresent = false;
        }
        else if (items.contains("jacket")) {
            if (!cartPage.isSauceLabsJacketPresent()) isAllItemsPresent = false;
        }
        else if (items.contains("onesie")) {
            if (!cartPage.isSauceLabsOnesiePresent()) isAllItemsPresent = false;
        }
        else if (items.contains("orange pulover")) {
            if (!cartPage.isSauceLabsOrangePuloverPresent()) isAllItemsPresent = false;
        }
        Assertions.assertTrue(isAllItemsPresent);
        System.out.println("I see the selected item's in the cart: " + items);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
