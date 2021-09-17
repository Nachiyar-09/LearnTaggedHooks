package com.HooksSample.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class AddOptionalFieldsPageUnderPIMConfiguration extends PageObject {

    @Step("User clicks on the PIM header option available ")
    public void clickOnPIMHeaderMenu(){
        $("#menu_pim_viewPimModule").click();
    }
    @Step("User clicks on the Configuration option available under PIM ")
    public void clickOnConfigurationUnderPIM(){
        $("#menu_pim_Configuration").click();
    }
    @Step("User clicks on the Optional Fileds option available under Configuration ")
    public void clickOnOptionalFields(){
        $("#menu_pim_configurePim").click();
    }
    @Step("User clicks on the Edit button available under Configure PIM page ")
    public void clickOnEditConfigurePIM(){
        $("#btnSave").click();
    }
    @Step("User clicks on the save button available under Configure PIM page ")
    public void clickOnSaveConfigurePIM(){
        $("//input[@value='Save']").click();
    }



}
