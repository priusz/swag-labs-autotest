package bdd.step_definitions;

import com.codecool.HomePage;
import com.codecool.ItemPage;
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

public class DescriptionStep {

    private WebDriver driver;
    private HomePage homePage;
    private ItemPage itemPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        itemPage = new ItemPage(driver);
    }

    @When("I want to see a description of an {string}")
    public void i_want_to_see_a_description_of_an_item(String itemName) {
        switch (itemName) {
            case "backpack" -> homePage.clickOnBackpackHeader();
            case "bike light" -> homePage.clickOnBikeLightHeader();
            case "black shirt" -> homePage.clickOnBlackShirtHeader();
            case "jacket" -> homePage.clickOnJacketHeader();
            case "onesie" -> homePage.clickOnOnesieHeader();
            case "orange pulover" -> homePage.clickOnOrangePuloverHeader();
        }
        System.out.println("I click on an item, what i want to see: " + itemName);
    }

    @Then("I see the selected item's {string}")
    public void i_see_the_products_text(String expected) {
        String actual = itemPage.getItemDescriptionText();
        Assertions.assertEquals(expected, actual);
        System.out.println("I see the selected item's description");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
