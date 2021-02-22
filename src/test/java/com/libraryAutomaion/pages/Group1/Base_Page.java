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
    public WebElement navcontainer;




}
