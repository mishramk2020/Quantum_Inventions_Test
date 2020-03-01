Feature: Register to Mapsynq (http://www.mapsynq.com) website

Description: This feature will allow new user to register to Mapsynq website

@second
Scenario: Register on Mapsynq
Given user launches Mapsynq
When user click on register link
And user fill account details
Then user registered successfully