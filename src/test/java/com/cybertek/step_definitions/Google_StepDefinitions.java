package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("http://www.google.com");
    }

    @When("User searches for apple")
    public void user_searches_for_apple() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple" + Keys.ENTER);
    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @When("User searches for galatasaray")
    public void user_searches_for_galatasaray() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("galatasaray" + Keys.ENTER);
    }

    @Then("User should see that the title is galatasaray")
    public void user_should_see_that_the_title_is_galatasaray() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "saray";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @When("User searches for {string}")
    public void user_searches_for(String string) {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys(string + Keys.ENTER);
    }
    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = string;
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        Driver.closeDriver();
    }

}
