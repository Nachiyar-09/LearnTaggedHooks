package com.HooksSample.Pages;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;

public class DashBoardPage extends PageObject {

    @Step("Verify user landed in Dashboard Page")
    public void CheckForWelcomeLink(){
    $("#welcome").click();

}}
