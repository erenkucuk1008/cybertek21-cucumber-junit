package com.cybertek.step_definitions;

import com.cybertek.pages.practiceDataTable_DropDownPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class practiceDataTable_StepDefinitions {

    practiceDataTable_DropDownPage practiceDataTable_dropDownPage = new practiceDataTable_DropDownPage();

    @Given("user is on the dropdowns page")
    public void user_is_on_the_dropdowns_page() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }
    @Then("user should see below months in dropdowns")
    public void user_should_see_below_months_in_dropdowns(List<String> expectedMonths) {
        Select months = new Select(practiceDataTable_dropDownPage.dropDownMonths);
        List<WebElement> monthsWeb = months.getOptions();
        List<String> actualMonths = new ArrayList<>();

        for (WebElement eachMonth :monthsWeb){
            actualMonths.add(eachMonth.getText());
        }

        Assert.assertEquals(actualMonths, expectedMonths);

    }
}
