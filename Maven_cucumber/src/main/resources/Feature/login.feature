Feature: Kite Zerodha Login feature

Background:
Given user is on zerodha login page

@sanity			
Scenario: valid login action
When user enters userid as "XA0634"
And user enters password as "Sarika699!"
And user click on login button
Then user navigate to pin page
When user enters pin as "691991"
And click on continue button
Then user navigate to dashboard page

@sanity
Scenario: Forgot Password
When user click on Forgot Password link
Then user navigate to forgot password page
When user enters userid
And user enters PAN Number

@regression		
Scenario: Invalid login action
When user enters invalid username
And user enters password
And user click on login button
#Then Invalid username and password message get displayed
