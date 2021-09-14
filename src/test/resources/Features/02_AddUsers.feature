Feature: To verify all scenarios with respect to Add users
  @AddNewUser
  Scenario: Add user under test
    Given user is on the dashboard page with username as 'Admin' and password as 'admin123'
    When  User clicks on the Admin link available on the header
    And   User able to see user management option from drop down and click on it
    And   User from there able to see the users options and just click on it
    And   User should provide value in the Employee name as 'Satya'
    And  user should provide the username as 'satya'
    And  user should select the status as 'Disabled' from the status dropdown
    And  User should enter value in password as 'Welcome@123'
    And  User should enter value in the confirm password as 'Welcome@123'
    Then user should click on the save button