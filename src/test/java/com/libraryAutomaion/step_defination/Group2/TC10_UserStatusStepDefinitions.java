package com.libraryAutomaion.step_defination.Group2;

import com.libraryAutomaion.pages.Group2.UserManagementPage;
import com.libraryAutomaion.utilities.BrowserUtil;
import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC10_UserStatusStepDefinitions extends BrowserUtil {

    UserManagementPage userManagementPage = new UserManagementPage();


    @When("the user click Status dropdown")
    public void the_user_click_status_dropdown() {
sleep(1);
        userManagementPage.statusDropdown.click();
        sleep(1);
    }

    @Then("librarian should see the following options:")
    public void librarian_should_see_the_following_options(List<String> expected) {

        Select s1 = new Select(userManagementPage.statusDropdown);

        List<String> actualOptions = getElementsText(s1.getOptions());
        Assert.assertEquals(expected, actualOptions);

//Driver.closeDriver();

    }

}
