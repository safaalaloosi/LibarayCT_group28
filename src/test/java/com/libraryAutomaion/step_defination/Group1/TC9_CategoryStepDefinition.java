package com.libraryAutomaion.step_defination.Group1;

import com.libraryAutomaion.pages.Group1.Landing_Page;
import com.libraryAutomaion.pages.Group1.LogIn_Page;
import com.libraryAutomaion.utilities.BrowserUtil;
import com.libraryAutomaion.utilities.ConfigurationReader;
import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC9_CategoryStepDefinition extends BrowserUtil {


    Landing_Page landing_page = new Landing_Page();


    @When("the user click users modules")
    public void the_user_click_users_modules() {
        sleep(2);
    landing_page.userModulesLink.click();
    sleep(1);
    }

    @When("the user click User Group dropdown")
    public void the_user_click_user_group_dropdown() {
    landing_page.dropDownUserGroups.click();
    sleep(2);
    }

    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expectedUserGroups) {
        Select select = new Select(landing_page.dropDownUserGroups);
        List<WebElement> userGroup = select.getOptions();
        List<String> actualUserGroup = getElementsText(userGroup);

        Assert.assertEquals(expectedUserGroups, actualUserGroup);

    }



}
