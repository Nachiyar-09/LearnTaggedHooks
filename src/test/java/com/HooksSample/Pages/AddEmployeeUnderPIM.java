package com.HooksSample.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class AddEmployeeUnderPIM extends PageObject {

    @Step
    public void clickOnAddEmployeeList(){
        $("#menu_pim_viewEmployeeList").click();

    }
    @Step
    public void clickOnAdd(){
        $("#btnAdd").click();

    }
    @Step
    public void EnterFirstName(String Fname){
        $("#firstName").sendKeys(Fname);

    }
    @Step
    public void EnterLastName(String Lname){
        $("#lastName").sendKeys(Lname);

    }
    @Step
    public void uploadPhoto(){
       WebElement photo = $("#photofile");
       upload("C:\\Users\\2041048\\OneDrive - Cognizant\\Pictures\\Saved Pictures\\pic.jpg").to(photo);

    }
    @Step
    public void clickOnCreateLoginDetails(){
        $("#chkLogin").click();

    }
    @Step
    public void EnterUsername(String Uname){
        $("#user_name").sendKeys(Uname);

    }
    @Step
    public void EnterPassword(String Pass){
        $("#user_password").sendKeys(Pass);

    }
    @Step
    public void EnterConfPassword(String ConfPass){
        $("#re_password").sendKeys(ConfPass);

    }
    @Step
    public void SelectStatus(String status){
        $("#status").selectByVisibleText(status);
    }
    @Step
    public void ClickOnSave(){
        $("#btnSave").click();
    }
}
