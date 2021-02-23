package com.libraryAutomaion.pages.Group1;

import com.libraryAutomaion.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing_Page {

    public Landing_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement userModulesLink;

    @FindBy(id = "user_groups")
    public WebElement dropDownUserGroups;

    @FindBy(name="tbl_users_length")
    public WebElement dropDownRecords;

    @FindBy(xpath = "//select[@id='book_categories']")
    public WebElement dropdownBookCategories;

    @FindBy(xpath = "//table[@id='tbl_books']//tbody/tr[1]/td[5]")
    public WebElement bookCategoryFromTable;
}
