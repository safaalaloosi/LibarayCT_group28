package com.libraryAutomaion.step_defination.Group1;

import com.libraryAutomaion.pages.Group1.Landing_Page;
import com.libraryAutomaion.utilities.BrowserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC5_Records extends BrowserUtil {
Landing_Page landing_page = new Landing_Page();


    @Then("Default records dropdown value is {int}")
    public void default_records_dropdown_value_is(Integer expectedNumber) {
        Select select = new Select(landing_page.dropDownRecords);
        Integer actualNumber = Integer.parseInt(
                select.getFirstSelectedOption().getText()
        );

        Assert.assertEquals(expectedNumber, actualNumber);

    }

    @When("User clicks {string} dropdown")
    public void user_clicks_dropdown(String string) {

        landing_page.dropDownRecords.click();
        sleep(1);
    }

    @Then("User should see the following dropdown options:")
    public void user_should_see_the_following_dropdown_options(List<String>expectedListOfRecords) {

        Select select = new Select(landing_page.dropDownRecords);

        List<WebElement> recordOptions = select.getOptions();

        List<String> actualListOfRecords = getElementsText(recordOptions);

        Assert.assertEquals(expectedListOfRecords, actualListOfRecords);

    }


}
