package com.HooksSample.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class SubscribePage extends PageObject {

    @Step("user click on the subscribe button")
    public void clickSubscribeButtonInHeader(){
        $("#Subscriber_link").click();
    }
    @Step("User provide the details in name field")
    public void EnterNameInSubscription(String name){
        $("#subscriber_name").type(name);

    }
    @Step("user provide value in the email field")
    public void EnterEmailDetails(String email){
        $("subscriber_email").type(email);
    }
    @Step("Hit the subscribe button")
    public void SubscribeButton(){
        $("#btnSubscribe").click();
    }
    @Step("Verify successful Subscription")
    public void verifySubscription(String actualMessage){
        String SuccessMessage = $("//div[@class='message success']").getText();
        Assert.assertEquals(actualMessage,SuccessMessage);
    }

}
