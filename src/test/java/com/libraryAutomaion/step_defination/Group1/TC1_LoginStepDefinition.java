package com.libraryAutomaion.step_defination.Group1;

import com.libraryAutomaion.pages.Group1.LogIn_Page;
import com.libraryAutomaion.pages.Group2.LoginPage;
import com.libraryAutomaion.utilities.BrowserUtil;
import com.libraryAutomaion.utilities.ConfigurationReader;
import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import sun.jvm.hotspot.debugger.Page;

public class  TC1_LoginStepDefinition extends BrowserUtil {

    LogIn_Page logIn_page = new LogIn_Page();

    @Given("User is on Library login {string} page")
    public void user_is_on_library_login_page(String environment) {
        Driver.getDriver().get(ConfigurationReader.getProperties(environment));

    }

    @Given("the user login as a {string}")
    public void the_user_login_as_a(String role) {
    String userName = "";
    String password = "";

    switch (role) {
        case"student" :
            userName = ConfigurationReader.getProperties("student17Email");
            password = ConfigurationReader.getProperties("student17Password");
            break;
        case "librarian" :
            userName = ConfigurationReader.getProperties("librarian13");
            password = ConfigurationReader.getProperties("librarian13Password");
            break;
    }

    logIn_page.inputEmail.sendKeys(userName);
    logIn_page.inputPassword.sendKeys(password);

    sleep(1);

    logIn_page.buttonSignIn.click();


    }

    private String getCurrentPage(){
        sleep(2);
        String url = Driver.getDriver().getCurrentUrl();
        return url.substring(url.lastIndexOf("/") + 1);
    }

    @Then("the user on  {string}")
    public void the_user_on(String expectedPage) {
        String actualPage = getCurrentPage();
        Assert.assertEquals(expectedPage,actualPage);

    }






}
