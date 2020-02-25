Feature: Perform multiple activities after sign in on Mapsynq (http://www.mapsynq.com) website

Description: This feature will automate few activities performed after sign in on Mapsynq website

@smoke
Scenario Outline: User is logged into Mapsynq website
Given user launches Mapsynq
When User enters "<username>" and "<password>"
And User clicks sign in button
Examples:
|username|password|
|admin|admin|

    


#@smoke
Scenario: User logout from Mapsynq website
Given user clicks logout
Then user is succesfully logged out


