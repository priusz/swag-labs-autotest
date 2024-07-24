package bdd.step_definitions;

import com.codecool.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderItemsStep {

    private HookTest hookTest;

    @Before
    public void before() {
        hookTest = new HookTest();
        hookTest.getDriver().manage().window().maximize();
    }

    @When("I try to order the items by {string}")
    public void i_try_to_order_the_items_by_filter(String filter) {
        if (filter.equals("A - Z")) hookTest.getHomePage().sortItemsByNamesAsc();
        else if (filter.equals("Z - A")) hookTest.getHomePage().sortItemsByNamesDesc();
        System.out.println("Order the items by " + filter);
    }

    @Then("I see the ordered products")
    public void i_see_the_products_text() {
        List<String> actual = hookTest.getHomePage().getProductNamesInActualOrder();
        List<String> expected = new ArrayList<>(actual);
        Collections.sort(expected);
        Assertions.assertEquals(expected, actual);
        System.out.println("I see the ordered products");
    }

    @After
    public void after() {
        hookTest.tearDown();
    }
}
