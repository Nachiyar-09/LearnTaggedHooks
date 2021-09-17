Feature: To test all scenarios related to Login page of Orange HRM application
  @ValidLogin
   Scenario: To check the application behaviour with valid credentials
     Given User navigates to the application
     When  User provides  value of username as 'Raghu' and password as 'Welcome@123'
     Then  User should navigate to the application successfully and see the dashboard page

   @InvalidLogin
   Scenario Outline: To check the application behaviour with invalid credentials
     Given User launch to the application
     When  User enter value of username as '<username>' and password as '<password>'
     Then  User should able to see the error message as '<validationMessage>'
     Examples:
       |username |password |validationMessage |
       |admin    |admin    | Invalid credentials|
       |         |admin123 | Username cannot be empty |
       |Admin    |         | Password cannot be empty |
       |         |         | Username cannot be empty |
  @LogoutFunctionality
  Scenario: To check the logout button behaviour
    Given  User login to the application
    When   User user provides valid username as 'Raghu' and password as 'Welcome@123'
    And    User clicks on the Logout option
    Then   User should navigate back to login page with panel name as "LOGIN Panel"

  @ForgotPassword
  Scenario: To verify the working of forgot password feature
    Given User is on login page
    When  User click on the ForgotPassword link available
    Then  User should be redirected to Forgot Password page
