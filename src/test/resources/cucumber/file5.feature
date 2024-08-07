Feature: Validations of facebook detail
@loginDataWithHeader
Scenario: Validation the login detail
Given  Facebook Page
When User enter into facebook username and pwds
|test@gmail.com|test1@gmail.com|test2@gmail.com|
|test3@gmail.com|test4@gmail.com|test5@gmail.com|
|test6@gmail.com|test7@gmail.com|test8@gmail.com|
|test9@gmail.com|test10@gmail.com|test11@gmail.com|
And User click the login button and message display
Then Success message was displayed   