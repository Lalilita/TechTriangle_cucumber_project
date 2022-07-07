Feature: Search Box Functionality in packages category tab




Scenario: User is able to search for hotel and flight schedule in this package tab
Given User is on KAYAK Home Page
When User click on the packages category tab
Then User should be navigated to the package page and able to input information in the search field 
And User click and select the city of destination (Paris)
And User select the departure date and  arrival date
And User click on search button
Then User should be able to see 16 out of all recommended hotels on the page
When User click on the five stars button 
And User click on 8+ review score button
And User select price at maximum
Then User should be able to see only one hotel with a price matching the selected price








