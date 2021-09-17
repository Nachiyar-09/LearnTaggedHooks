Feature: To verify Add Data Import Page functionality
  @AddDataImport
  Scenario: Data Import functionality under test
    Given user is on the dashboard page with username as 'Raghu' and password as 'Welcome@123'
    When  User clicks on PIM header option
    And  User clicks on the Configuration link
    And  User clicks on the Data import drop down option
    And  User upload file using Choose File button
    Then user click on the Upload Button