package com.HooksSample.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class AddTerminationReasonPageUnderPIMConfiguration extends PageObject {

    @Step
    public void ClickTerminationReasonFromDropDown(){
        $("#menu_pim_viewTerminationReasons").click();
    }
    @Step
    public void ClickAddButton(){
        $("#btnAdd").click();
    }
    @Step
    public void EnterNameInTerminationPage(String reason){
        $("#terminationReason_name").type(reason);
    }
    @Step
    public void ClickSave(){
        $("#btnSave").click();
    }
}
