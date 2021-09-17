Feature: To verify the behaviour of subscribe options
  @ValidSubscriber
  Scenario: Subscribe option under test with valid data
      Given User is launching application with 'Raghu' and 'Welcome@123' as credentials
      When  User clicks on the subscribe button available on the header
      And   User should provide value in the Name field as 'Hemalatha'
      And   User should provide value in the email field as 'admin@example.com'
      And   user should click on the subscribe button
      Then  User should see the successful subscription as 'Successfully Subscribed'