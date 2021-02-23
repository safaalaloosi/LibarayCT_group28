package com.libraryAutomaion.step_defination.Group2;

import com.libraryAutomaion.utilities.Driver;
import io.cucumber.java.After;


public class Hooks {


    @After

    public void closeDriver(){

        System.out.println("trying to close the driver");Driver.closeDriver();
    }

}
