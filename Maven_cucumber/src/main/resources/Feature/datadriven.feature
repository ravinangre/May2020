Feature: Kite Zerodha Login feature for data driven

Background:
Given user is on zerodha login page

@sanity			
Scenario Outline: valid login action
When user enters userid as "<userid>"
And user enters password as "<password>"
And user click on login button
Then user navigate to pin page
When user enters pin as "<pin>"
And click on continue button
Then user navigate to dashboard page
Examples: 
      | userid  | password   | pin    |
      | XA0634  | Sarika699! | 691991 |
      | SUG689  | ajujoshi@1 | 381838 |
