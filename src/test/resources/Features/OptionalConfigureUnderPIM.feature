Feature: To verify the PIM Header options functionality
  Scenario: PIM header option under test
    Given user login to the application with valid credentials as 'Admin' and 'admin123'
    When  user clicks on the PIM header option available
    And   User clicks on the Configuration option available under PIM
    And   User clicks on the Optional Configure option
    And   User clicks on the Edit button that is available in the page
    And   User can hit the Save button once all changes are done
    Then  User should able to see Success message as 'Successfully saved'