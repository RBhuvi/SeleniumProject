Feature: Validation the facebook detail
@loginDataWithHeader
Scenario: Validation of login detail
Given  Facebook Pages
When User enter in to facebook username and pwd
|username|pwd|email|
|arthi|2345|test1@gmail.com|
|riya|09876|test2@gmail.com|
|ragul|45678|test3@gmail.com|
And User click the login buttons and messages display
Then Success messages was displayeds  