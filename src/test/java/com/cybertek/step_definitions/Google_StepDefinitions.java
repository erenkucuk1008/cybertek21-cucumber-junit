package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("http://www.google.com");
    }

    @When("User searches for apple")
    public void user_searches_for_apple() {
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
        googleSearchPage.searchBar.sendKeys(string + Keys.ENTER);
    }
    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = string;
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("User should see the following links")
    public void user_should_see_the_following_links(List<String> expectedFooterLinks) {
        List<String> actualFooterLinks = BrowserUtils.getElementTexts(googleSearchPage.footerLinks);
        Assert.assertTrue(expectedFooterLinks.equals(actualFooterLinks));


/*
    METHOD KULLANMADAN ONCE ASAGIDAKI GIBI YAZIYORDUK

        List<WebElement> actualFooterLinks = googleSearchPage.footerLinks;
        List<String> footerLinks = new ArrayList<>();//yeni bi liste olusturmamizin sebebi
        //google.com dan gelen web elementleri bu listeye eklememizdir.
        //bunun sebebide Assert yaparken iki String i compare edebilmek icin.
        //String ve WebElement compare edilemez... elma elma ile toplanmali veya kiyaslanmali

        for (WebElement eachLink : actualFooterLinks) {
            footerLinks.add(eachLink.getText());// web elementleri tek tek bulup, textlerini yeni
            //kurdugumuz listeye ekliyoruz.
        }

        Assert.assertEquals(footerLinks, expectedFooterLinks);
 */

    }
}
