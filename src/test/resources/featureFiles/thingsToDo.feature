@Regression
Feature: Search Box Functionality


Scenario: Search Box Functionality
		Given User is on KAYAK Home Page
		When User click on the Things to do tab
		Then User should be navigated to things to do page then see title "<titleThingTodo>" and header "<headerThingTodo>"
		And User able to see the search box 
		When User enter "<city>" and click on the city on the drop down and click search button
		Then User able to see Top attractions in Chicago and see all button
		When User click on see all button
		Then User able to see experiences attraction places of the city
		And User can close the brower
		
		Examples:
    |   titleThingTodo      |        headerThingTodo                           |     city                  |
    |    Things To Do       |   Find the best things to do for your trip.      |  New York, United States  |  
