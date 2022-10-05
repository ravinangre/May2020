Feature: Kite Zerodha Watchlist feature

Background:
Given user is on zerodha login page
When user enters username
And user enters password
And user click on login button
Then user navigate to pin page
When user enters pin
And click on continue button
Then user navigate to dashboard page

@sanity			
Scenario: validate search functionality
When search box is displayed
And search a stock called sbin
Then display the sbin results

@sanity
Scenario: validate successfully add the stocks in watchlist
When search a stock called sbin
And mouse over the first stock we found
And click on Add button 
Then validate the sbin stock successfully added into watchlist

@regression		
Scenario: validate successfully delete the stocks from watchlist
