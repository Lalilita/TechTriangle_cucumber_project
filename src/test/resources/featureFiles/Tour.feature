    @Regression
    Feature: Test tour feature
		Scenario: User able to search for a city and get the recommended Tour in that city
		Given User is on KAYAK Home Page
		When User click on the Things to do tab
		Then User should be navigated to things to do page then see title "<titleThingTodo>" and header "<headerThingTodo>"
		And User able to see the search box 
		When User enter "<city>" and click on the city on the drop down and click search button
		Then User able to see "<headerTourCity>" and "<headerTour>" in Most popular experiences in that city session  and see all button
		When User click on see all button in Tour city 
		Then User able to see experiences information of the Tours in that city
		When User click filter the type of tour
		And User show see the correct number of results to dispaly on the page
		When Uers click the first link of the list of tour
		Then User can navigate to the correct link and see information
		And User can close the brower
		
		Examples:
    |     city                  |   headerTourCity                            |  headerTour  | titleThingTodo      |        headerThingTodo                           | 
    |  New York, United States  | Most popular experiences in New York        |   Tours      |    Things To Do     |   Find the best things to do for your trip.      | 
		
	

