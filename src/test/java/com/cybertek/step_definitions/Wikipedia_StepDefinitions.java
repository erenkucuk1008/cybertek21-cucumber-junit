package com.cybertek.step_definitions;

import com.cybertek.pages.WikiPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinitions {

    WikiPage wikiPage = new WikiPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url = ConfigurationReader.getProperty("wikiURL");
        Driver.getDriver().get(url);
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {

        wikiPage.searchBar.sendKeys(string);
    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPage.searchButton.click();
    }

    @Then("user sees {string} in the wiki title")
    public void user_sees_in_the_wiki_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("user sees {string} in the main header")
    public void user_sees_in_the_main_header(String arg0) {
        String mainHeaderText = wikiPage.mainHeader.getText();
        Assert.assertTrue(mainHeaderText.equals(arg0));
        Assert.assertTrue(wikiPage.mainHeader.isDisplayed());
    }

}
