
#@tola2
Feature: Stays page Searching automation testing

Background: 
Given user on Kayak homepage
And user click on the stay tab

Scenario: Search functionality
Given user on the stays page
When user fill in searching criteria 
And user click on search button
Then user should be able to see the search result is displayed
And user click on Hotel class and Review score
Then user should be able to see new search results are displayed
And user finish searching









  