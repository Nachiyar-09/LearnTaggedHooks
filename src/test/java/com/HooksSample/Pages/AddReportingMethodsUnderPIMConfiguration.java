package com.HooksSample.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class AddReportingMethodsUnderPIMConfiguration extends PageObject {
    @Step
    public void clickOnReportingMethod(){
        $("#menu_pim_viewReportingMethods").click();
    }
    @Step
    public void clickOnAdd(){
        $("#btnAdd").click();
    }
    @Step
    public void enterName(String reportingName){
        $("#reportingMethod_name").type(reportingName);
    }
    @Step
    public void clickOnSave(){
        $("#btnSave").click();
    }
}
