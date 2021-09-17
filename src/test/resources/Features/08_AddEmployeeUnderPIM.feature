Feature: To verify Add Employee page under PIM
  @AddEmployee
   Scenario: Add Employee under test
    Given user is on the dashboard page with username as 'Raghu' and password as 'Welcome@123'
    When User clicks on PIM header option
    When User click on Employee List under PIM
    And User click on Add Employee option
    And User enter FullName as 'Nambi' in the provided box and last name as 'T'
    And user upload file in the Photograph field
    And user click on create login details checkbox
    And User enter Username as 'Raghu'
    And User enter password as 'Welcome@123'
    And User enter Confirm password as 'Welcome@123'
    And User select the status as 'Disabled' from dropdown
    Then User click on Save button