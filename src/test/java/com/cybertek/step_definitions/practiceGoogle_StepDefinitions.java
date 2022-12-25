package com.cybertek.step_definitions;

import com.cybertek.pages.practiceGooglePage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class practiceGoogle_StepDefinitions {

    practiceGooglePage practiceGooglePage = new practiceGooglePage();

    @Given("user is Google home page")
    public void user_is_google_home_page() {
        Driver.getDriver().get("http://www.google.com");
    }
    @When("user searches  for galatasaray")
    public void user_searches_for_galatasaray() {
        practiceGooglePage.searchButton.sendKeys("galatasaray"+ Keys.ENTER);
    }
    @Then("user should see galatasaray in the title")
    public void user_should_see_galatasaray_in_the_title() {
        String expectedTitle = "galatasaray";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Given("user is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("http://www.google.com");
    }
    @When("user searches for {string}")
    public void user_searches_for(String string) {
        practiceGooglePage.searchButton.sendKeys(string+Keys.ENTER);
    }
    @Then("user should see {string} in the title")
    public void user_should_see_in_the_title(String string) {
        String expectedTitle = string;
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
