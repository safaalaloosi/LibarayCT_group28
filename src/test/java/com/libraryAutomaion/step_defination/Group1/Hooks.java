package com.libraryAutomaion.step_defination.Group1;

import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void closeDriver(){
        Driver.closeDriver();
    }

}
