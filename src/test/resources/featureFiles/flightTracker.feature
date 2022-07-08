@flightTracker
Feature: Flight Tracker Functionality 




Scenario: User should not be  able to track their flight if they input the flight number incorrectly
Given User is on KAYAK Home Page
When User click on the Flight Tracker category tap
Then User should be navigated to the tracker page
And  User select Flight Number tab
And  User select United Airlines (UA)
And User input Flight Number (UA2492 for example)
And User select the date they want to track (They can only track 4 days ahead)
And User click on track flight Button
Then User should not be able to track the flight without filling correct flight number and Airline
And User should also be able to share any trip that he or she chooses to up to 5 email addresses.

Scenario: Users should be able to track the flight based on the correct information that they fill in.
Given User is on KAYAK Home Page
When User click on the Flight Tracker category tap
Then User should be navigated to the tracker page
And  User select Airport tab
And  User select Airport name (IAD)
And  User select Airline name (Korean Air)
And  User select date and time
Then  User should be able to track the flight based on the airport name, airline name and date they have input.










