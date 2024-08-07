Feature: Validation of facebook details
@loginDataWithHeader
Scenario: Validate the login details
Given On facebook Page
When User enters facebook with username and pwds
|test@gmail.com|test1@gmail.com|test2@gmail.com|
And User clicks the login button and message displayed
Then Success message displayed   