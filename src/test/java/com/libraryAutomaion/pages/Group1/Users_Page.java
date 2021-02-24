package com.libraryAutomaion.pages.Group1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Users_Page extends Base_Page {


    @FindBy(xpath = "//table[@id = 'tbl_users']/thead/tr/th[1]")
    public WebElement actionsColumn;

    @FindBy(xpath = "//table[@id = 'tbl_users']/thead/tr/th[2]")
    public WebElement userIDColumn;

    @FindBy(xpath = "//table[@id = 'tbl_users']/thead/tr/th[3]")
    public WebElement fullNameColumn;

    @FindBy(xpath = "//table[@id = 'tbl_users']/thead/tr/th[4]")
    public WebElement emailColumn;

    @FindBy(xpath = "//table[@id = 'tbl_users']/thead/tr/th[5]")
    public WebElement groupColumn;

    @FindBy(xpath = "//table[@id = 'tbl_users']/thead/tr/th[6]")
    public WebElement statusColumn;

    @FindBy(xpath = "//table[@id = 'tbl_users']/thead/tr")
    public WebElement headerRow;

}
