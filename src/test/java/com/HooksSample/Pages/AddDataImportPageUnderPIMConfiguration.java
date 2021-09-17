package com.HooksSample.Pages;

import net.serenitybdd.core.pages.WithByLocator;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class AddDataImportPageUnderPIMConfiguration extends PageObject {

    @Step
    public void ClickOnDataImportDropDown(){
        $("#menu_admin_pimCsvImport").click();
    }
    @Step
    public void ClickOnChooseFileButton(){
       WebElement ChooseFile = $("#pimCsvImport_csvFile");
       upload("C:\\Users\\2041048\\Downloads\\importData.csv").to(ChooseFile);
    }
    @Step
    public void ClickOnUpload(){
        $("#btnSave").click();

    }
}
