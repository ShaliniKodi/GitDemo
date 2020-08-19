Feature: Login feature

@Regression
Scenario: positive login scenario
Given User is on Login Page
When user enters "abbc@gmail.com" and "bac123"
And user clicks on submit button
Then user is on login page

@Smoke
Scenario Outline: negative login scenario
Given User is on Login Page
When user enters "<username>" and "<password>"
And user clicks on submit button
Then user is on login page
Examples:
|username|password|
|abc@gmail.com|abc123|
|cap@yahoo.com|cap123|
|race@rediffmail.com|race123|