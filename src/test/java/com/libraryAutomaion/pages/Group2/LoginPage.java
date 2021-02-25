package com.libraryAutomaion.pages.Group2;

import com.libraryAutomaion.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="inputEmail")
    public WebElement inputEmailLogin;

    @FindBy (id="inputPassword")
    public WebElement inputPassLogin;

    @FindBy (xpath = "//button[.='Sign in']") //find by text
    public WebElement submitButton;


}
