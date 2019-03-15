Feature: verify registration page in order to check the registration page
#<browser>=browser parameter
Scenario Outline: Verify registration page with valid and invalid data
Given user open "<browser>" browser
When user navigates "<url>" url
Then user clicked on "<signinprop>" link
Then user clicked on "<jobseekerprop>" link
Then user clicked on "<registerbutton>" button
And user clicked on "<allowcookiesprop>" button
Then user enter "<fnameprop>" as "<firstname>"
Then user enter "<lnameprop>" as "<lastname>"
And user enter "<emailprop>" as "<emailaddress>"
And user enter "<passprop>" as "<password>"
Then user enter "<confpassprop>" as "<confpassword>"
Then user select option "<sendmejobprop>" as "<sendmejob>" Send me job opportunities on behalf of recruitersRequired
Then user selct option "<marketemailsprop>" as "<marketingemails>" Send me marketing emails
Then user clicked on iam not robot
Then user clicked on registration button
Then user closed browser

Examples:
|browser|url                |signinprop|jobseekerprop|registerbutton|allowcookiesprop|fnameprop   |firstname|lnameprop  |lastname    |emailprop      |emailaddress  |passprop   |password |confpassprop|confpassword|sendmejobprop|sendmejob|marketemailsprop|marketingemails|
|firefox|http://jobserve.com|signin    |jobseeker    |regbutton     |allowcookies    |regfirstname|shilpa   |reglastname|boda        |regemailaddress|test@gmail.com|regpassword|saibaba12|regconfpass |saibaba12   |regsendmejob | Yes     |regmarketemails|  Yes          |
|chrome |http://jobserve.com|signin    |jobseeker    |regbutton     |allowcookies    |regfirstname|arvind   |reglastname|nagavelli   |regemailaddress|test@gmail.com|regpassword|saibaba12|regconfpass |saibaba12   |regsendmejob | No      |regmarketemails|  No           |