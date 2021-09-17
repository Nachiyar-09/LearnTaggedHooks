Feature: To verify Termination reasons page
  @TerminationReasons
  Scenario: Termination Page under test
    Given user is on the dashboard page with username as 'Raghu' and password as 'Welcome@123'
    When User clicks on PIM header option
    And User clicks on the Configuration link
    And User clicks on the Termination link from drop down
    And User click on ADD button available in that page
    And User enter name in the field provided as 'Maternity'
    Then user click on the Save button