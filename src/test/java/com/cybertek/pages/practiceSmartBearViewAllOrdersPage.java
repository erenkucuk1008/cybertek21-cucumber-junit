package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class practiceSmartBearViewAllOrdersPage extends practiceSmartBearHomePage{

    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    public WebElement nameOnList;
}
