package com.libraryAutomaion.step_defination.Group1;

import com.libraryAutomaion.pages.Group1.Landing_Page;
import com.libraryAutomaion.pages.Group1.LogIn_Page;
import com.libraryAutomaion.pages.Group1.Users_Page;
import com.libraryAutomaion.utilities.BrowserUtil;
import com.libraryAutomaion.utilities.ConfigurationReader;
import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC11_DataTableStepDefinition extends BrowserUtil {


    LogIn_Page logIn_page = new LogIn_Page();
    Landing_Page landing_page = new Landing_Page();
    Users_Page users_page = new Users_Page();

    @Given("User on the homepage")
    public void userOnTheHomepage() {

        Driver.getDriver().get(ConfigurationReader.getProperties("qa3_url"));
        sleep(2);
        logIn_page.inputEmail.sendKeys(ConfigurationReader.getProperties("librarian13"));
        sleep(2);
        logIn_page.inputPassword.sendKeys(ConfigurationReader.getProperties("librarian13Password"));
        sleep(2);
        logIn_page.buttonSignIn.click();

    }

    @When("User clicks users module")
    public void user_clicks_users_module() {

        landing_page.userModulesLink.click();
        sleep(2);

    }

    @Then("User should see the following column names")
    public void user_should_see_the_following_column_names(List<String> expectedList) {

        List<WebElement> webElementList = new ArrayList<>();
        webElementList.addAll(Arrays.asList(users_page.actionsColumn,
                users_page.userIDColumn,
                users_page.fullNameColumn,
                users_page.emailColumn,
                users_page.groupColumn,
                users_page.statusColumn
        ));

        List<String> actualTexts = BrowserUtil.getElementsText(webElementList);

        Assert.assertEquals(actualTexts,expectedList);

    }


}
