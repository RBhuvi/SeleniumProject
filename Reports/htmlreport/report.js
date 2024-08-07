$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/bhuvi/Downloads/Browser/Browser/src/test/resources/cucumber/file6.feature");
formatter.feature({
  "name": "Validation the facebook detail",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validation of login detail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginDataWithHeader"
    }
  ]
});
formatter.step({
  "name": "Facebook Pages",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition7.facebook_Pages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter in to facebook username and pwd",
  "rows": [
    {
      "cells": [
        "username",
        "pwd",
        "email"
      ]
    },
    {
      "cells": [
        "arthi",
        "2345",
        "test1@gmail.com"
      ]
    },
    {
      "cells": [
        "riya",
        "09876",
        "test2@gmail.com"
      ]
    },
    {
      "cells": [
        "ragul",
        "45678",
        "test3@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition7.user_enter_in_to_facebook_username_and_pwd(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login buttons and messages display",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition7.user_click_the_login_buttons_and_messages_display()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Success messages was displayeds",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition7.success_messages_was_displayeds()"
});
formatter.result({
  "status": "passed"
});
});