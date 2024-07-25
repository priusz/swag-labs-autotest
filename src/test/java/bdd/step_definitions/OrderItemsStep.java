package bdd.step_definitions;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderItemsStep {

    private HookTest hookTest;

    @Before
    public void before() throws MalformedURLException, URISyntaxException {
        hookTest = HookTest.getInstance("chrome");
        hookTest.getDriver().manage().window().maximize();
    }

    @When("I try to order the items by {string}")
    public void i_try_to_order_the_items_by_filter(String filter) {
        if (filter.equals("A - Z")) hookTest.getHomePage().sortItemsByNamesAsc();
        else if (filter.equals("Z - A")) hookTest.getHomePage().sortItemsByNamesDesc();
        System.out.println("Order the items by " + filter);
    }

    @Then("I see the ordered products by {string}")
    public void i_see_the_products_text(String filter) {
        try {
            List<String> actual = hookTest.getHomePage().getProductNamesInActualOrder();
            List<String> expected = new ArrayList<>(actual);
            if (filter.equals("A - Z")) Collections.sort(expected);
            else if (filter.equals("Z - A")) Collections.sort(expected, Collections.reverseOrder());
            Assertions.assertEquals(expected, actual);
            System.out.println("I see the ordered products");
        }
        catch (Exception e) {
            System.out.println("Failed to see the ordered products because " + e.getMessage());
        }
    }

    @After
    public void after() {
        hookTest.tearDown();
    }
}
