package com.libraryAutomaion.step_defination.Group1;

import com.libraryAutomaion.pages.Group1.Landing_Page;
import com.libraryAutomaion.utilities.BrowserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class TC7_Search_StepDefinitions extends BrowserUtil {

  Landing_Page landing_page = new Landing_Page();


  @When("User selects a {string} from search by category dropdown")
  public void user_selects_a_from_search_by_category_dropdown(String category) {
    Select select = new Select(landing_page.dropdownBookCategories);
    select.selectByVisibleText(category);
  }

  @Then("Books table should show books by {string}")
  public void books_table_should_show_books_by(String expectedCategory) {
    sleep(1);
    String actualCategory = landing_page.bookCategoryFromTable.getText();
    Assert.assertEquals(expectedCategory, actualCategory);
  }
}
