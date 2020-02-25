$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Activities.feature");
formatter.feature({
  "line": 1,
  "name": "Perform multiple activities after sign in on Mapsynq (http://www.mapsynq.com) website",
  "description": "\nDescription: This feature will automate few activities performed after sign in on Mapsynq website",
  "id": "perform-multiple-activities-after-sign-in-on-mapsynq-(http://www.mapsynq.com)-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "User is logged into Mapsynq website",
  "description": "",
  "id": "perform-multiple-activities-after-sign-in-on-mapsynq-(http://www.mapsynq.com)-website;user-is-logged-into-mapsynq-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launches Mapsynq",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks sign in button",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "perform-multiple-activities-after-sign-in-on-mapsynq-(http://www.mapsynq.com)-website;user-is-logged-into-mapsynq-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "perform-multiple-activities-after-sign-in-on-mapsynq-(http://www.mapsynq.com)-website;user-is-logged-into-mapsynq-website;;1"
    },
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 12,
      "id": "perform-multiple-activities-after-sign-in-on-mapsynq-(http://www.mapsynq.com)-website;user-is-logged-into-mapsynq-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User is logged into Mapsynq website",
  "description": "",
  "id": "perform-multiple-activities-after-sign-in-on-mapsynq-(http://www.mapsynq.com)-website;user-is-logged-into-mapsynq-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launches Mapsynq",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters \"admin\" and \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "StepsSignIn.user_launches_Mapsynq()"
});
formatter.result({
  "duration": 27034803402,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 13
    },
    {
      "val": "admin",
      "offset": 25
    }
  ],
  "location": "StepsSignIn.user_enters_and(String,String)"
});
formatter.result({
  "duration": 6553375747,
  "status": "passed"
});
formatter.match({
  "location": "StepsSignIn.user_clicks_sign_in_button()"
});
formatter.result({
  "duration": 977264472,
  "status": "passed"
});
});