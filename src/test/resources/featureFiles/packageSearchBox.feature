@Package_SearchBox
Feature: Search Box Functionality in packages category tab




Scenario: User is able to search for hotel and flight schedule in this package tab
Given User is on KAYAK Home Page
When User click on the packages category tab
Then User should be navigated to the package page and able to input information in the search field 
And User enter number of traveler 2 adult
And User click and select the the airport of departure (IAD) and select the city of destination (Paris)
And User select the departure date (Aug/01/2022) and  arrival date (Aug/31/2022)
And User click on search button
Then User should be able to see 16 out of 390 recommended hotels on the page with the flight details also displayed when hovering on it.
When User click on the five stars button 
And User click on 8+ review score button
And User select  price at $3,517 
Then User should be able to see only one hotel with a price $3,170 and related information displayed.










