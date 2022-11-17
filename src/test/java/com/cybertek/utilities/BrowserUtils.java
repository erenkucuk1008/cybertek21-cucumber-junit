package com.cybertek.utilities;

import com.cybertek.pages.Sb_ViewAllOrdersPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class  BrowserUtils {

    public static Sb_ViewAllOrdersPage sb_viewAllOrdersPage = new Sb_ViewAllOrdersPage();

    public static boolean isOnTheList(String name){
        boolean result = false;
        for (String s : getElementTexts(sb_viewAllOrdersPage.listOfNames)) {
            if (s.equals(name)){
                result=true;
                break;
            }
        }
        return result;
    }

    //List<WebElement> olarak store edilen webElementlerin get.Text ini alarak List<String> ile compare eden method
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
