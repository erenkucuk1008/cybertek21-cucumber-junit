package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Etsy_StepDefinitions {

    @Given("user is on etsy landing page")
    public void user_is_on_etsy_landing_page() {
        String url = ConfigurationReader.getProperty("etsyURL");
        Driver.getDriver().get(url);
    }

    @Then("user sees title is as expected")
    public void user_sees_title_is_as_expected() {
        String actualDefaultTitle = Driver.getDriver().getTitle();
        String expectedDefaultTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertTrue(actualDefaultTitle.equals(expectedDefaultTitle));
    }

    @When("user types Wooden spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        EtsySearchPage etsySearchPage = new EtsySearchPage();
        etsySearchPage.etsySearch.sendKeys("Wooden spoon"+ Keys.ENTER);
    }

    @Then("user sees Wooden spoon in the title")
    public void user_sees_wooden_spoon_in_the_title() {
        String actualTitleWoodenSpoon = Driver.getDriver().getTitle();
        String expectedTitleWoodenSpoon = "Wooden spoon";
        Assert.assertTrue(actualTitleWoodenSpoon.contains(expectedTitleWoodenSpoon));
    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        EtsySearchPage etsySearchPage = new EtsySearchPage();
        etsySearchPage.etsySearch.sendKeys(string+Keys.ENTER);
    }

    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String string) {
        String actualTitleWoodenSpoonPrmztn = Driver.getDriver().getTitle();
        String expectedTitleWoodenSpoonPrmztn = string;
        Assert.assertTrue(actualTitleWoodenSpoonPrmztn.contains(expectedTitleWoodenSpoonPrmztn));
    }
}
