package com.learn.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class CustomFieldsPage extends PageObject {
    @Step("User clicks on the PIM header option available ")
    public void clickOnPIMHeaderMenu(){

        $("#menu_pim_viewPimModule").click();
    }
    @Step("User clicks on the Configuration option available under PIM ")
    public void clickOnConfigurationUnderPIM(){

        $("#menu_pim_Configuration").click();
    }
    @Step
    public void ClickOnCustomFieldsOption(){
        $("#menu_pim_listCustomFields").click();
        $("#buttonAdd").click();
    }
    @Step()
    public void EnterFieldName(String name){

        $("#customField_name").type(name);
    }
    @Step()
    public void selectScreenDropDown(String screen){

        $("#customField_screen").selectByVisibleText(screen);
    }
    @Step()
    public void selectType(String type){

        $("#customField_type").selectByVisibleText(type);
    }
    @Step()
    public void clickOnSaveBtn(){

        $("#btnSave").click();
    }

}
