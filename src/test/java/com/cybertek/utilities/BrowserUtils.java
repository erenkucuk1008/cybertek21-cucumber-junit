package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static List<String> getElementTexts(List<WebElement> webElementList){

        List<String> webElementListAsString = new ArrayList<>();

        for (WebElement each : webElementList) {
            webElementListAsString.add(each.getText());
        }

        return webElementListAsString;
    }


    //Method to assert title
    public static void titleVerification(String expectedTitle){

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    public static void sleep(int second){

        second *= 1000;
        try{
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
