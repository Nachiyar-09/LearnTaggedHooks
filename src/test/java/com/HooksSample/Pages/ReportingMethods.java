package com.learn.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class ReportingMethods extends PageObject {

    @Step
    public void clickOnReportingMethod(){
        $("#menu_pim_viewReportingMethods").click();
    }
    @Step
    public void clickonAdd(){
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
