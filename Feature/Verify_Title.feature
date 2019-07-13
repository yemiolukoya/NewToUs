Feature: Test to verify the title of Linkedin login page

Scenario: To verify the title of Linkedin login page

Given i am on linkedin website
When i enter email
And i enter password
Then i click signin
And the title should be (1) LinkedIn