Feature: To verify the reporting method page validations
  @ReportingMethod
  Scenario: Reporting Method page under test
    Given user is on the dashboard page with username as 'Admin' and password as 'admin123'
    When User clicks on PIM header option
    And User clicks on the Configuration link
    And user click on the Reporting method link
    And user click on add button
    And User enters name in the provided field value as 'Niranjan'
    Then user click on the Save option



