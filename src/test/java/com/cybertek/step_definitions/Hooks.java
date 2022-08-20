package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 2)
    public void setUpScenario(){
        System.out.println("--------------Setting up browser with further details...");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabase(){
        System.out.println("--------------Connecting to DataBase");
    }

    @After(value = "@db", order = 1)
    public void closeDBConnection(){
        System.out.println("--------------Closing database");
        System.out.println("--------------Take a screenshot");
    }

    @After(order = 2)
    public void tearDownScenario(Scenario scenario){

        // if my scenario is failed, take a screenshot
        if (scenario.isFailed()){
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }

    @BeforeStep
    public void runBeforeSteps(){
        System.out.println("-----------Running Before Each Step-------------");
    }

    @AfterStep
    public void runAfterStep(){
        System.out.println("-----------Running After Each Step---------------");
    }
}
