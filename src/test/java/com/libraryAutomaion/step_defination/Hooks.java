package com.libraryAutomaion.step_defination;

import com.libraryAutomaion.pages.Group2.LoginPage;
import com.libraryAutomaion.utilities.ConfigurationReader;
import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {


    @After

    public void closeDriver(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }

    private LoginPage l1 = new LoginPage();

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

}
