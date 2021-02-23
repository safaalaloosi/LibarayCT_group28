package com.libraryAutomaion.step_defination.Group2;

import com.github.javafaker.Faker;
import com.libraryAutomaion.pages.Group2.LogIn_Page;
import com.libraryAutomaion.pages.Group2.UserManagementPage;
import com.libraryAutomaion.utilities.BrowserUtil;
import com.libraryAutomaion.utilities.ConfigurationReader;
import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class TC4_AddUserStepDefinition extends BrowserUtil {

    LogIn_Page login = new LogIn_Page();
    UserManagementPage userManagementPage = new UserManagementPage();
    Faker faker = new Faker();

    @Given("user successfully logged in to the user page")
    public void user_successfully_logged_in_to_the_user_page() {

        Driver.getDriver().get(ConfigurationReader.getProperties("qa3_url"));

        login.inputEmailLogin.sendKeys(ConfigurationReader.getProperties("librarian13"));
        login.inputPassLogin.sendKeys(ConfigurationReader.getProperties("librarian13Password"));
        sleep(1);
        login.submitButton.click();
        sleep(1);
    }

    @When("user enters User Management page")
    public void user_enters_user_management_page() {

        userManagementPage.usersButtonDashboard.click();
        sleep(1);
    }

    @When("clicks on Add User button")
    public void clicks_on_add_user_button() {
        userManagementPage.addUserButton.click();
    }

    @Then("user can fill up fields with valid info")
    public void user_can_fill_up_fields_with_valid_info() {

        Select select = new Select(userManagementPage.dropDownUserGroup);
        Select select1 = new Select(userManagementPage.dropDownStatus);
        userManagementPage.addUserWindow.sendKeys(faker.name().fullName());
        userManagementPage.passwordField.sendKeys(faker.internet().password());
        userManagementPage.emailField.sendKeys(faker.internet().emailAddress());
        select.selectByVisibleText("Students");
        select1.selectByVisibleText("ACTIVE");
        userManagementPage.addressField.sendKeys(faker.address().fullAddress());


        sleep(1);

    }

    @Then("user clicks Save changes button")
    public void user_clicks_save_changes_button() {
        userManagementPage.saveButton.click();
        sleep(1);

    }


    @Then("user is able to close the window by clicking close button")
    public void user_is_able_to_close_the_window_by_clicking_close_button() {
        sleep(2);
        userManagementPage.closeButton.click();
        sleep(1);
        Assert.assertFalse(userManagementPage.windowAddUser.isDisplayed());
    }


    @Then("user clicks on edit user button")
    public void user_clicks_on_edit_user_button() {
        userManagementPage.editUser.click();
    }

    @Then("user is able to enter new credentials")
    public void user_is_able_to_enter_new_credentials() {
userManagementPage.editFullName.clear();

userManagementPage.editFullName.sendKeys(faker.name().fullName());
sleep(1);

    }

    @Then("user is able to Save Changes")
    public void user_is_able_to_save_changes() {

userManagementPage.saveChanges.click();

    }

}
