Feature: Perform multiple activities after sign in on Mapsynq (http://www.mapsynq.com) website

Description: This feature will automate few activities performed after sign in on Mapsynq website

Background: User launches Mapsynq website
Given user launches Mapsynq

@first
Scenario Outline: User fails to login into Mapsynq website with invalid credentials
#Given user launches Mapsynq
When User enters "<username>" and "<password>"
And User clicks sign in button
Examples:
|username|password|
|admin|admin|


@first
Scenario: User search total number of Roadwork on Mapsynq website
#Given user launches Mapsynq
When user search for number of roadworks
Then user get total number of roadworks

@first
Scenario: User search total number of heavy traffic on Mapsynq website
#Given user launches Mapsynq
When user search for number of heavytraffics
Then user get total number of heavy traffics

@first
Scenario: User get directions on Mapsynq website
#Given user launches Mapsynq
When user clicks on directions
Then user enters point a
And user enters point b
And user clicks get directions
Then user is able to get directions on map




