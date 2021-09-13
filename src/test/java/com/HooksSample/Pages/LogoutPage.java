package com.HooksSample.Pages;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LogoutPage extends PageObject {
    WebDriver driver;

    @Step("User click on Logout option")
    public void clickLogoutButton()  {
        $("#welcome").click();
        $("//*[@id=\"welcome-menu\"]/ul/li[3]/a").click();

    }
    @Step("Verify whether user navigates back to login page")
    public void VerifyBackLoginPage(String Title){
        String LoginPanel = $("#logInPanelHeading").getText();
        Assert.assertEquals(LoginPanel,Title);
    }
}
