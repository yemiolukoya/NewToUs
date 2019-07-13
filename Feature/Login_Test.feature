Feature: To test the login functionality of newtours application

Background: 
Given  the user is on newtours application website

Scenario: Test that user can login to newtours application with valid login details
When the user enter valid username 
And the user enters valid password
And he clicked submit button
Then he must see the SIGN-OFF option

#Scenario Outline: Test to verify login functionality of the application with valid username and invalid password
#When the user enter valid "<username>"
#And the user enters invalid "<password>"
#And he clicked submit button
#Then he must see the SIGN-ON option
#
#Examples:
#|username|password |
#|mecury  |password1|
#|mecury  |password2|
#|mecury  |password3|
#|mecury  |password4|
#|mecury  |password5|
#|mecury  |password6|
#|mecury  |password7|





