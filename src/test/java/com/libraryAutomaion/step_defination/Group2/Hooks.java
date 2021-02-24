package com.libraryAutomaion.step_defination.Group2;

import com.libraryAutomaion.utilities.BrowserUtil;
import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks extends BrowserUtil {


    @After

    public void closeDriver(Scenario scenario){

//        if(scenario.isFailed()) {
//            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenShot, "image/jpeg", scenario.getName());
//        }
        System.out.println("trying to close the driver");
        sleep(2);
        Driver.closeDriver();
    }

}
