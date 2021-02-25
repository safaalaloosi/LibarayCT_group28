package com.libraryAutomaion.step_defination.Group2;

import com.libraryAutomaion.pages.Group2.Login_Page;
import com.libraryAutomaion.utilities.ConfigurationReader;
import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;


public class Hooks {

    private Login_Page l1 = new Login_Page();

    @Before(value = "@Student") //STUDENT
    public void loginStudent(){
        Driver.getDriver().get(ConfigurationReader.getProperties("qa3_url"));
        l1.inputEmailLogin.sendKeys(ConfigurationReader.getProperties("student17Email"));
        l1.inputPassLogin.sendKeys(ConfigurationReader.getProperties("student17Password"));
        l1.submitButton.click();
    }

    @Before(value = "@Librarian") //LIBRARIAN
    public void loginLibrarian(){
        Driver.getDriver().get(ConfigurationReader.getProperties("qa3_url"));
        l1.inputEmailLogin.sendKeys(ConfigurationReader.getProperties("librarian13"));
        l1.inputPassLogin.sendKeys(ConfigurationReader.getProperties("librarian13Password"));
        l1.submitButton.click();

    }


    @After
    public void closeDriver(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }

}
