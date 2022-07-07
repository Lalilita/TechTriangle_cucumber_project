@trainAndBus_SearchBox
Feature: Search Box Functionality in Train and bus category tap




Scenario: User is able to search for train or bus after input appropriated information in the search fields and should be able to book his selected trips
Given User is on KAYAK Home Page
When User click on theTrain and bus category tap
Then User should be navigated to the train page and able to input search information in the provided fields
And User select round trip
And User select 4 adults
And User select departure station from Union, Washington, D.C., District of Columbia, United States and arrival station New Rochelle, New Rochelle, New York, United States
And User select departure and arrival date 
And User click on train
And User click on search button
Then User should be able to see the number of trips as a result of the search displayed in different pages with trip duration and prices are displayed and the select button is clickable.
And user should also be able select departure trip and returned trip and navigate to the booking page










