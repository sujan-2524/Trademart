Feature: Login feature file


Scenario Outline: user should able to login to the application 
Given user is in login page
When user enter mail id<Email id>
And user enters password<password>
And click on check box
Then user should be loggedin successfully

Examples: 
|Email id|password|
|buyer.ncrypted@gmail.com|123456|
|buyer.ncrypted@gmail.com|1234567|
