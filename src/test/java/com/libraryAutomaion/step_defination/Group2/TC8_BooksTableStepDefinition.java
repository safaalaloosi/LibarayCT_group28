package com.libraryAutomaion.step_defination.Group2;

import com.libraryAutomaion.pages.Group2.UserManagementPage;
import com.libraryAutomaion.utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class TC8_BooksTableStepDefinition extends BrowserUtil {
UserManagementPage userManagementPage= new UserManagementPage();

    @When("the user click Borrowing Books module")
    public void the_user_click_borrowing_books_module() {
        sleep(1);
userManagementPage.borrowingBooksModule.click();
sleep(1);
    }

    @Then("the user shoulde see the following column names:")
    public void the_user_shoulde_see_the_following_column_names(List<String>expectedTittle) {
        List<String>actualTittle=getElementsText(userManagementPage.tableTittles);
        Assert.assertEquals(expectedTittle,actualTittle);
    }
}
