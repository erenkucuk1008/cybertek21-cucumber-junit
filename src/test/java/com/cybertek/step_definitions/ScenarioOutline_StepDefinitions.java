package com.cybertek.step_definitions;

import com.cybertek.pages.SbOrderPage;
import com.cybertek.pages.Sb_ViewAllOrdersPage;
import com.cybertek.pages.SmartBearLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ScenarioOutline_StepDefinitions {

    SbOrderPage sbOrderPage = new SbOrderPage();
    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
    Sb_ViewAllOrdersPage sb_viewAllOrdersPage = new Sb_ViewAllOrdersPage();

    @Given("user is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {

        String url = ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);
        smartBearLoginPage.loginToSmartBear();
        sbOrderPage.order.click();
    }

    @When("user fills out the forms as followed from the table below")
    public void user_fills_out_the_forms_as_followed_from_the_table_below() {
    }

    @When("user selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {

        Select product = new Select(sbOrderPage.product);
        product.selectByVisibleText(string);
    }

    @When("user enters {string} to quantity")
    public void user_enters_to_quantity(String string) {

        sbOrderPage.quantity.sendKeys(Keys.BACK_SPACE + string);
    }

    @When("user enters {string} to customer name")
    public void user_enters_to_customer_name(String string) {

        sbOrderPage.customerName.sendKeys(string);
    }

    @When("user enters {string} to street")
    public void user_enters_to_street(String string) {

        sbOrderPage.street.sendKeys(string);
    }

    @When("user enters {string} to city")
    public void user_enters_to_city(String string) {

        sbOrderPage.city.sendKeys(string);
    }

    @When("user enters {string} to state")
    public void user_enters_to_state(String string) {

        sbOrderPage.state.sendKeys(string);
    }

    @When("user enters {string} to zip")
    public void user_enters_to_zip(String string) {

        sbOrderPage.zip.sendKeys(string);
    }

    @When("user selects {string} as card type")
    public void user_selects_as_card_type(String string) {

        sbOrderPage.selectVisa.click();
    }

    @When("user enters {string} to card number")
    public void user_enters_to_card_number(String string) {

        sbOrderPage.cardNumber.sendKeys(string);
    }

    @When("user enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {

        sbOrderPage.expirationDate.sendKeys(string);
    }

    @When("user clicks process button")
    public void user_clicks_process_button() {

        sbOrderPage.processButton.click();
    }

    @Then("user verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {

        sbOrderPage.viewAllOrders.click();

        String actualName = sb_viewAllOrdersPage.nameInList.getText();

        Assert.assertTrue(actualName.equals(expectedName));
    }
}
