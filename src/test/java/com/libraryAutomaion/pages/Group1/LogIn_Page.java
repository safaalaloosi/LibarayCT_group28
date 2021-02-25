package com.libraryAutomaion.pages.Group1;

import com.libraryAutomaion.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LogIn_Page {

    public LogIn_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement buttonSignIn;

    @FindBy (id="inputEmail")
    public WebElement inputEmailLogin;

    @FindBy (id="inputPassword")
    public WebElement inputPassLogin;

    @FindBy (xpath = "//button[.='Sign in']") //find by text
    public WebElement submitButton;

}
