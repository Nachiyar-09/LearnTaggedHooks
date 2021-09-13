package com.HooksSample.Pages;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends PageObject {

   @Step("User checks the forgot password link")
    public void ClickForgotPasswordButton(){
    $("//a[normalize-space()='Forgot your password?']").click();
}

@Step("User verify the forgot password page")
    public Boolean CheckForProperLanding(){
    Boolean resetPasswordButton = $(By.id("btnSearchValues")).isDisplayed();
    return resetPasswordButton;
}

}
