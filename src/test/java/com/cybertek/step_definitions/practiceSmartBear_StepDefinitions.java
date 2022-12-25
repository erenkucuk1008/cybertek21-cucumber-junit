package com.cybertek.step_definitions;

import com.cybertek.pages.practiceSmartBearLoginPage;
import com.cybertek.pages.practiceSmartBearOrderPage;
import com.cybertek.pages.practiceSmartBearViewAllOrdersPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class practiceSmartBear_StepDefinitions {

    practiceSmartBearLoginPage practiceSmartBearLoginPage = new practiceSmartBearLoginPage();
    practiceSmartBearOrderPage practiceSmartBearOrderPage = new practiceSmartBearOrderPage();
    practiceSmartBearViewAllOrdersPage practiceSmartBearViewAllOrdersPage = new practiceSmartBearViewAllOrdersPage();

    @Given("user logged into the smartbear login page and go to on order page")
    public void user_logged_into_the_smartbear_login_page_and_go_to_on_order_page() {
        String url = ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);
        practiceSmartBearLoginPage.loginSmartBear();
        practiceSmartBearOrderPage.order.click();
    }

    @When("user fill out the forms as followed from the table below")
    public void user_fill_out_the_forms_as_followed_from_the_table_below() {
    }

    @When("user select {string} from Product dropdown")
    public void user_select_from_product_dropdown(String string) {
        Select product = new Select(practiceSmartBearOrderPage.product);
        product.selectByVisibleText(string);
    }

    @When("user enter {string} on Quantity")
    public void user_enter_on_quantity(String string) {
        practiceSmartBearOrderPage.quantity.sendKeys(Keys.BACK_SPACE + string);
    }

    @When("user enter {string} on Customer Name")
    public void user_enter_on_customer_name(String string) {
        practiceSmartBearOrderPage.customerName.sendKeys(string);
    }

    @When("user enter {string} on Street")
    public void user_enter_on_street(String string) {
        practiceSmartBearOrderPage.street.sendKeys(string);
    }

    @When("user enter {string} on City")
    public void user_enter_on_city(String string) {
        practiceSmartBearOrderPage.city.sendKeys(string);
    }

    @When("user enter {string} on State")
    public void user_enter_on_state(String string) {
        practiceSmartBearOrderPage.state.sendKeys(string);
    }

    @When("user enter {string} on Zip")
    public void user_enter_on_zip(String string) {
        practiceSmartBearOrderPage.zip.sendKeys(string);
    }

    @When("user select {string} on Card Type")
    public void user_select_on_card_type(String string) {
        if (string.equalsIgnoreCase("visa")){
            practiceSmartBearOrderPage.visa.click();
        }else if (string.equalsIgnoreCase("mastercard")){
            practiceSmartBearOrderPage.masterCard.click();
        }else if (string.equalsIgnoreCase("american express")){
            practiceSmartBearOrderPage.americanExpress.click();
        }else {
            System.err.println("Incorrect Test Data!");
        }
    }

    @When("user enter {string} on Card Number")
    public void user_enter_on_card_number(String string) {
        practiceSmartBearOrderPage.cardNumber.sendKeys(string);
    }

    @When("user enter {string} on Expire Date")
    public void user_enter_on_expire_date(String string) {
        practiceSmartBearOrderPage.expDate.sendKeys(string);
    }

    @When("user click process button")
    public void user_click_process_button() {
        practiceSmartBearOrderPage.processButton.click();
    }

    @Then("user verify {string} on the list")
    public void user_verify_on_the_list(String string) {
        practiceSmartBearViewAllOrdersPage.viewAllOrders.click();
        String expectedName = string;
        String actualName = practiceSmartBearViewAllOrdersPage.nameOnList.getText();
        Assert.assertEquals(actualName,expectedName);
    }
}
