package com.HooksSample.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class AddDefineReportPage extends PageObject {

    @Step
    public void clickOnReportTab(){
        $("#menu_core_viewDefinedPredefinedReports").click();

    }
    @Step
    public void clickOnAddReport(){
        $("#btnAdd").click();

    }
    @Step
    public void EnterReportName(String reportName){
        $("#report_report_name").sendKeys(reportName);

    }

    @Step
    public void selectCriteriaAndClickOnAdd(String criteria){
        $("#report_criteria_list").selectByVisibleText(criteria);
        $("#btnAddConstraint").click();


    }
    @Step
    public void SelectFromSelectedCriteriaInclude(String criteriaInclude){
        $("#report_include_comparision").selectByVisibleText(criteriaInclude);

    }
    @Step
    public void SelectDisplayFieldGroup(String displaygroups){
        $("#report_display_groups").selectByVisibleText(displaygroups);

    }
    @Step
    public void SelectDisplayFields(String displayField){
        $("#report_display_field_list").selectByVisibleText(displayField);

    }
       @Step
    public void ClickOnSave(){
        $("#btnSave").click();
    }
}
