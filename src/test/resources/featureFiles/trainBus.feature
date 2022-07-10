@trainAndBus_SearchBox
Feature: Search Box Functionality in Train and bus category tap




Scenario: User is able to search for train after input information in the search fields and should be able to book his selected trips
When User click on theTrain and bus category tap
Then User should be navigated to the "<TrainPage>" and able to input search information in the provided fields
And User select departure station from "<Departure>" and arrival station "<Destination>"
And User select "<StartDate>"  and "<EndDate>" 
And User click on train
And User click search button
Then User should be able to see the number of trips as a result of the search displayed in different pages with trip duration and prices are displayed and the select button is clickable.
And user should also be able select departure trip and returned trip and navigate to the "<BookingPage>"



Examples:
|TrainPage|Departure  						|Destination |StartDate		|EndDate	 |BookingPage|
|trains		|Union, Washington, D.C.|New Rochelle|08/01/2022	|09/15/2022|tripsummary|







