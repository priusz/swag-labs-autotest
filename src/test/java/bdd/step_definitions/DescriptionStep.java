package bdd.step_definitions;

import com.codecool.pages.HomePage;
import com.codecool.pages.ItemPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescriptionStep {

  private HookTest hookTest;

    @Before
    public void before() {
        hookTest = new HookTest();
        hookTest.getDriver().manage().window().maximize();
    }

    @When("I want to see a description of an {string}")
    public void i_want_to_see_a_description_of_an_item(String itemName) {
        switch (itemName) {
            case "backpack" -> hookTest.getHomePage().clickOnBackpackHeader();
            case "bike light" -> hookTest.getHomePage().clickOnBikeLightHeader();
            case "black shirt" -> hookTest.getHomePage().clickOnBlackShirtHeader();
            case "jacket" -> hookTest.getHomePage().clickOnJacketHeader();
            case "onesie" -> hookTest.getHomePage().clickOnOnesieHeader();
            case "orange pulover" -> hookTest.getHomePage().clickOnOrangePuloverHeader();
        }
        System.out.println("I click on an item, what i want to see: " + itemName);
    }

    @Then("I see the selected item's {string}")
    public void i_see_the_products_text(String expected) {
        String actual = hookTest.getItemPage().getItemDescriptionText();
        Assertions.assertEquals(expected, actual);
        System.out.println("I see the selected item's description");
    }

    @After
    public void after() {
        hookTest.tearDown();
    }
}
