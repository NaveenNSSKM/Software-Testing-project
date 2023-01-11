@Feature1
Feature: To validate the login functionality of bisto application

Scenario: To validate Login with Invalid username and password
Given To launch the chrome browser and window maximise
When To launch the Url in bisto Application
And To click the Account button
And To pass the invalid mobno in textbox
And To pass the invalid password in textbox
And To click the login button
Then To close the browser