package com.libraryAutomaion.step_defination.Group2;

import com.libraryAutomaion.pages.Group2.Book_Management_Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US6 {    //LOGIN comes from BaseStepDef



    private Book_Management_Page b1 = new Book_Management_Page();

    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> listOfColumnNames) {
        listOfColumnNames.forEach(p-> System.out.println(p));
        int i = 0;
        for (WebElement eachTableHeader : b1.listOfTableHeaders) {
            System.out.println("eachTableHeader.getText() = " + eachTableHeader.getText());
            Assert.assertEquals(listOfColumnNames.get(i),eachTableHeader.getText());
            i++;
        }



    }
}
