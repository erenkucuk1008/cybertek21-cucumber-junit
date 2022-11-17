package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Sb_ViewAllOrdersPage extends SbBasePage{

    @FindBy(xpath = "//tr[2]/td[2]")
    public WebElement nameInList;

    @FindBy(xpath = "//td[2]")
    public List<WebElement> listOfNames;

}
