package com.libraryAutomaion.pages.Group2;

import com.libraryAutomaion.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Book_Management_Page {



    public Book_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//table//th")
    public List<WebElement> listOfTableHeaders;



}
