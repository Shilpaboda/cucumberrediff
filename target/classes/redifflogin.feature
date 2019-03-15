Feature: Verify login page in order to check the Rediff login page

Scenario Outline: Verify rediff Login Page with valid and invalid data
Given user open "browsertype" browser
When user navigates "baseurl" url
Then user clicked on "logsignin" link
And user enter "loguname" as "<uname>"
And user enter "logpass" as "<pass>"
And user clicked on "logbutton" button
And user validate the login page
Then user closed browser


Examples:
|uname  |pass        |
|Shilpa |selenium123 |
|Arvind |java12345   |
|Aarav  |test1234    |


