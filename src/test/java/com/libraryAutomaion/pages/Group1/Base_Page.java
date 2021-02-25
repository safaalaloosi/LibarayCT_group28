package com.libraryAutomaion.pages.Group1;

import com.libraryAutomaion.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
    public Base_Page (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


   @FindBy(id = "menu_item")
    public WebElement navContainer;

    @FindBy(xpath = "//a[@href = '#dashboard']")
    public WebElement dashboardLink;

    @FindBy(xpath = "//a[@href = '#users']")
    public WebElement usersLink;

    @FindBy(xpath = "//a[@href = '#books']")
    public WebElement booksLink;




}
