package com.libraryAutomaion.step_defination.Group1;

import com.libraryAutomaion.pages.Group1.Base_Page;
import com.libraryAutomaion.pages.Group1.LogIn_Page;
import com.libraryAutomaion.utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC3_ModelAccessStepDefinition extends BrowserUtil {

    LogIn_Page logIn_page = new LogIn_Page();
    Base_Page base_page = new Base_Page();

    @Given("User login with credentials {string} and {string}:")
    public void user_login_with_credentials_and(String userEmail, String password) {
    logIn_page.inputEmail.sendKeys(userEmail);
    logIn_page.inputPassword.sendKeys(password);
    sleep(2);
    logIn_page.buttonSignIn.click();

    }

    @Then("User should see following modules:")
    public void user_should_see_following_modules(List<String> expectedModules) {
        List<WebElement> modules = base_page.navContainer.findElements(
                By.xpath(".//span[@class = 'title']")
        );

        List<String> actualModules = getElementsText(modules);
        Assert.assertEquals(expectedModules, actualModules);
    }

}
