Feature: To verify all scenarios with Custom fields
  @CustomFields
  Scenario: Custom Field page under test
    Given user is on the dashboard page with username as 'Admin' and password as 'admin123'
    When User clicks on PIM header option
    And User clicks on the Configuration link
    And user select on custom fields option from drop down
    And user should enter Field name as 'Optional'
    And user selects the screen type as 'Dependents'
    And user selects the type as 'Drop Down'
    Then user click on the Save