

Feature: Stays page Search and booking automation testing


Background: 
Given user on Kayak homepage
And user click on the stay tab
@tag1
Scenario: Search functionality
Given user on the stays page
When user fill in searching criteria 
And user click on search button
Then user should be able to see the search result is displayed
And user click on Hotel class and Review score
Then user should be able to see new search results are displayed
And user finish searching

Scenario: Booking functionality
Given user on the stays page
When user fill in searching criteria 
And user click on search button
Then user should be able to see the search result is displayed
And user click on Hotel class and Review score
Then user should be able to see new search results are displayed
Given user on the hotel search result page
When user scroll mouse to The Plaza Hotel user should be able to see different booking providers
Then user click on KAYAK booking link
Then user should be navigated to the new window tap where user can select the room and do the booking process
And user fill in the booking information required
And user can also validate the booking Now button is enabled to be booked if all information required are filled.









  