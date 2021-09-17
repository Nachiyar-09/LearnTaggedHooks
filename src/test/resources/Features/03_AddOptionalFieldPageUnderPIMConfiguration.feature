Feature: To verify the PIM Header options functionality
  @OptionalConfigure
  Scenario: PIM header option under test
    Given user login to the application with valid credentials as 'Raghu' and 'Welcome@123'
    When  user clicks on the PIM header option available
    And   User clicks on the Configuration option available under PIM
    And   User clicks on the Optional Configure option
    And   User clicks on the Edit button that is available in the page
    Then   User can hit the Save button once all changes are done
