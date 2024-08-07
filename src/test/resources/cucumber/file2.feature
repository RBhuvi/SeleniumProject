Feature: Validation of facebook details
@Regression
Scenario Outline: Validate the login details
Given User is on facebook pages
When User enter usernames"<username>" and passwords "<password>"
And User click the login button and message displayed 
Then Verify success message is displayed 
Examples:
|username|password|
|lakshmi@gmail.com|123456|
|ajay@gmail.com|098765|
@Regression @E2E
Scenario: Validate the signup page
Given User is on facebook pages
When User click create new account button
And User enter firstname,lastname
And User click signup button 
Then Verify account successfully created
