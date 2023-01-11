@Feature3
Feature: To fills out the registration form and ignores the confirm password

Scenario: To fill the registration form without confirm password
Given To launch the chrome browser and window maximise
When To launch the Url in bisto Application
And To click the Account button
And To pass the name in name textbox
And To pass the Email in email textbox
And To pass the mobno in mobno textbox
And To pass the password in password textbox
And To click the Register button
Then To close the Browser