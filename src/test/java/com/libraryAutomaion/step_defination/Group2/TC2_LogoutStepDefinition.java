package com.libraryAutomaion.step_defination.Group2;

import com.libraryAutomaion.pages.Group2.UserManagementPage;
import com.libraryAutomaion.utilities.BrowserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC2_LogoutStepDefinition extends BrowserUtil {

    UserManagementPage u1 = new UserManagementPage();

    @When("User loges out from app")
    public void user_loges_out_from_app() {
        sleep(1);
        u1.logOutDropdown.click();
        sleep(1);
        u1.logOutButton.click();
        sleep(1);
    }


}
