package com.libraryAutomaion.pages.Group2;

import com.libraryAutomaion.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserManagementPage {

    public UserManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersButtonDashboard;


    @FindBy(xpath = "//a[@href='tpl/add-user.html']")
    public WebElement addUserButton;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement addUserWindow;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy(id = "user_group_id")
    public WebElement dropDownUserGroup;

    @FindBy(id = "status")
    public WebElement dropDownStatus;

    @FindBy(id = "address")
    public WebElement addressField;

    @FindBy(xpath = "//button[.='Save changes']")
    public WebElement saveButton;

    @FindBy(xpath = "//form[@id='add_user_form']//button[.='Close']")
    public WebElement closeButton;

    @FindBy(id = "ajax")
    public WebElement windowAddUser;

    @FindBy(xpath = "//a[@href='javascript:void(0)']")
    public WebElement editUser;

    @FindBy(xpath = "//form[@id='edit_user_form']//input[@name='full_name']")
    public WebElement editFullName;
    @FindBy(xpath = "//form[@id='edit_user_form']//button[.='Save changes']")
    public WebElement saveChanges;

    @FindBy(xpath = "//a[@href='#borrowing-books']")
    public WebElement borrowingBooksModule;

    @FindBy(xpath = "//table[@id='borrowed_list']//th")
    public List<WebElement> tableTittles;
}
