Feature: To verify Report page under PIM header option
  @DefineReport
  Scenario: Define Report Under test
    Given user is on the dashboard page with username as 'Raghu' and password as 'Welcome@123'
    When User clicks on PIM header option
    When User clicks on the Report tab under PIM header
    And  User clicks on the Add button to create new report
    And user enter value in the report name as 'Serenity-Cucumber Report'
     And User select the selection criteria from drop down as 'Language' and click on Add button
      Then User should able to see selected criteria to select respective criteria
     And User should select Selected Criteria Include from drop down as 'Past Employees Only'
     And  user should select Display Field Groups as 'Education' from drop down
     And user should select the display field as 'Level' from drop down
    Then user should click on save button in the page