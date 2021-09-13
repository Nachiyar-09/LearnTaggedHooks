package com.HooksSample.Pages;

import javafx.scene.chart.Chart;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://opensource-demo.orangehrmlive.com/")
public class LoginPage extends PageObject {
    

    @Step("Provide values in username field")
    public void enterValueInUsername(String username){
        $("#txtUsername").type(username);
    }
    @Step("Provide values in password field")
    public void enterValueInPassword(String password){
        $("#txtPassword").typeAndEnter(password);
    }
    @Step("Error Message on unsuccessful login")
    public String errorMessage() {
        String actualErrorMessage = $(By.id("spanMessage")).getText();
        return actualErrorMessage;
    }


}
