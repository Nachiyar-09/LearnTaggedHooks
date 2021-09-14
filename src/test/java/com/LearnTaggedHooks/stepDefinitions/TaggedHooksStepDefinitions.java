package com.LearnTaggedHooks.stepDefinitions;

import com.HooksSample.Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;



public class TaggedHooksStepDefinitions {

    WebDriver driver;

    @Steps
    LoginPage loginPage;

    @Steps
    LogoutPage logoutPage;

    @Steps
    ForgotPasswordPage forgotPasswordPage;

    @Steps
    SubscribePage subscribePage;

    @Steps
    OptionalFieldsPageUnderConfiguration optionalFieldsPageUnderConfiguration;


    // -------------------Login with valid Credentials----------------------//

    @Given("User navigates to the application")
    public void userNavigatesToTheApplication() {
        loginPage.open();

    }

    @When("User provides  value of username as {string} and password as {string}")
    public void user_provides_value_of_username_as_and_password_as(String username, String password) {
        loginPage.enterValueInUsername(username);
        loginPage.enterValueInPassword(password);
    }

    @Then("User should navigate to the application successfully and see the dashboard page")
    public void user_should_navigate_to_the_application_successfully_and_see_the_dashboard_page() {
        logoutPage.clickLogoutButton();

    }
    // -------------------Login with invalid Credentials -------------------//

    @Given("User launch to the application")
    public void user_launch_to_the_application() {
        loginPage.open();
    }

    @When("User enter value of username as {string} and password as {string}")
    public void user_enter_value_of_username_as_and_password_as(String username, String password) {
        loginPage.enterValueInUsername(username);
        loginPage.enterValueInPassword(password);
    }

    @Then("User should able to see the error message as {string}")
    public void user_should_able_to_see_the_error_message_as(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.errorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    // ------------------Forgot Password link test methods--------------------//


    @Given("User is on login page")
    public void user_is_on_login_page() {
        loginPage.open();
    }

    @When("User click on the ForgotPassword link available")
    public void user_click_on_the_forgot_password_link_available() {
        forgotPasswordPage.ClickForgotPasswordButton();
    }
    @Then("User should be redirected to Forgot Password page")
    public void user_should_be_redirected_to_forgot_password_page() {
        forgotPasswordPage.CheckForProperLanding();
    }

    //--------------------Logout Button test methods ------------------------//
    @Given("User login to the application")
    public void userLoginToTheApplication() {
        loginPage.open();
    }

    @When("User user provides valid username as {string} and password as {string}")
    public void userUserProvidesValidUsernameAsAdminAndPasswordAsAdmin(String username, String password) {
        loginPage.enterValueInUsername(username);
        loginPage.enterValueInPassword(password);
    }

    @And("User clicks on the Logout option")
    public void userClicksOnTheLogoutOption() {
        logoutPage.clickLogoutButton();
    }

    @Then("User should navigate back to login page with panel name as {string}")
    public void user_should_navigate_back_to_login_page_with_panel_name_as(String Title) {
        logoutPage.VerifyBackLoginPage(Title);
    }

    // ---------------------------New user subscribe option---------------------------------//


    @Given("User is launching application with {string} and {string} as credentials")
    public void userIsLaunchingApplicationWithAdminAndAdminAsCredentials(String username,String password) {
        loginPage.open();
        loginPage.enterValueInUsername(username);
        loginPage.enterValueInPassword(password);
   }

    @When("User clicks on the subscribe button available on the header")
    public void userClicksOnTheSubscribeButtonAvailableOnTheHeader() {
       subscribePage.clickSubscribeButtonInHeader();

    }

    @And("User should provide value in the Name field as {string}")
    public void userShouldProvideValueInTheNameFieldAsHemalatha(String name) {
        subscribePage.EnterNameInSubscription(name);
    }

    @And("User should provide value in the email field as {string}")
    public void userShouldProvideValueInTheEmailFieldAsAdminExampleCom(String email) {
        subscribePage.EnterEmailDetails(email);
    }

    @And("user should click on the subscribe button")
    public void userShouldClickOnTheSubscribeButton() {
        subscribePage.SubscribeButton();
    }

    @Then("User should see the successful subscription as {string}")
    public void userShouldSeeTheSuccessfulSubscriptionAsSuccessfullySubscribed(String actualMessage) {
        subscribePage.verifySubscription(actualMessage);
    }

   //--------------------User is under PIM sections---------------------------//
    @Given("user login to the application with valid credentials as {string} and {string}")
    public void userLoginToTheApplicationWithValidCredentialsAsAdminAndAdmin(String username,String password) {
        loginPage.open();
        loginPage.enterValueInUsername(username);
        loginPage.enterValueInPassword(password);
    }

    @When("user clicks on the PIM header option available")
    public void userClicksOnThePIMHeaderOptionAvailable() {
        optionalFieldsPageUnderConfiguration.clickOnPIMHeaderMenu();
    }

    @And("User clicks on the Configuration option available under PIM")
    public void userClicksOnTheConfigurationOptionAvailableUnderPIM() {
        optionalFieldsPageUnderConfiguration.clickOnConfigurationUnderPIM();
    }

    @And("User clicks on the Optional Configure option")
    public void userClicksOnTheOptionalConfigureOption() {
        optionalFieldsPageUnderConfiguration.clickOnOptionalFields();
    }

    @And("User clicks on the Edit button that is available in the page")
    public void userClicksOnTheEditButtonThatIsAvailableInThePage() {
        optionalFieldsPageUnderConfiguration.clickOnEditConfigurePIM();
    }

    @And("User can hit the Save button once all changes are done")
    public void userCanHitTheSaveButtonOnceAllChangesAreDone() {
        optionalFieldsPageUnderConfiguration.clickOnSaveConfigurePIM();
    }

    @Then("User should able to see Success message as {string}")
    public void userShouldAbleToSeeSuccessMessageAsSuccessfullySaved() {
        optionalFieldsPageUnderConfiguration.g
    }
       // --------------@Add user page---------------//
    @Given("user is on the dashboard page with username as {string} and password as {string}")
    public void userIsOnTheDashboardPageWithUsernameAsAdminAndPasswordAsAdmin(String username,String password) {
      loginPage.open();
      loginPage.enterValueInUsername(username);
      loginPage.enterValueInPassword(password);
    }
    @When("User clicks on the Admin link available on the header")
    public void user_clicks_on_the_admin_link_available_on_the_header() {
     addUsersPage.clickAdmin();
    }
    @When("User able to see user management option from drop down and click on it")
    public void user_able_to_see_user_management_option_from_drop_down_and_click_on_it()  {
       addUsersPage.clickUserManagement();
    }
    @When("User from there able to see the users options and just click on it")
    public void user_from_there_able_to_see_the_users_options_and_just_click_on_it() {
        addUsersPage.clickUser();
    }
    @When("User should provide value in the Employee name as {string}")
    public void user_should_provide_value_in_the_employee_name_as(String EmpName) {
        addUsersPage.EnterEmployeeName(EmpName);
    }
    @When("user should provide the username as {string}")
    public void user_should_provide_the_username_as(String Username) {
        addUsersPage.EnterUserName(Username);
    }
    @And("user should select the status as {string} from the status dropdown")
    public void userShouldSelectTheStatusAsDisabledFromTheStatusDropdown(String status) {
        addUsersPage.SelectStatus(status);
    }

    @When("User should enter value in password as {string}")
    public void user_should_enter_value_in_password_as(String Password) {
        addUsersPage.EnterPassword(Password);
    }
    @When("User should enter value in the confirm password as {string}")
    public void user_should_enter_value_in_the_confirm_password_as(String ConfPassword) {
        addUsersPage.EnterConfirmPassword(ConfPassword);
    }
    @Then("user should click on the save button")
    public void user_should_click_on_the_save_button() {
        addUsersPage.ClickOnSave();
    }
    //------------------------@custom field page--------------//
    @When("User clicks on PIM header option")
    public void userClicksOnPIMHeaderOption() {
        customFieldsPage.clickOnPIMHeaderMenu();
    }

    @And("User clicks on the Configuration link")
    public void userClicksOnTheConfigurationLink() {
        customFieldsPage.clickOnConfigurationUnderPIM();
    }

    @And("user select on custom fields option from drop down")
    public void userSelectOnCustomFieldsOptionFromDropDown() {
        customFieldsPage.ClickOnCustomFieldsOption();
    }

    @And("user should enter Field name as {string}")
    public void userShouldEnterFieldNameAsOptional(String name) {
        customFieldsPage.EnterFieldName(name);
    }

    @And("user selects the screen type as {string}")
    public void userSelectsTheScreenTypeAsDependents(String screen) {
        customFieldsPage.selectScreenDropDown(screen);
    }

    @And("user selects the type as {string}")
    public void userSelectsTheTypeAsDropDown(String type) {
        customFieldsPage.selectType(type);
    }

    @Then("user click on the Save")
    public void userClickOnTheSave() {
        customFieldsPage.clickOnSaveBtn();
    }
     //--------------------@ReportingPage--------------------//
    @And("user click on the Reporting method link")
    public void userClickOnTheReportingMethodLink() {
        reportingMethods.clickOnReportingMethod();
    }

    @And("user click on add button")
    public void userClickOnAddButton() {
        reportingMethods.clickonAdd();
    }

    @And("User enters name in the provided field value as {string}")
    public void userEntersNameInTheProvidedFieldValueAsNiranjan(String reportingName) {
        reportingMethods.enterName(reportingName);
    }

    @Then("user click on the Save option")
    public void userClickOnTheSaveOption() {
        reportingMethods.clickOnSave();
    }
    
}
