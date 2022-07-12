
    Feature: Test tour feature
		Scenario: User able to search for a city and get the recommended Tour in that city
		Given User is on KAYAK Home Page
		When User click on the Things to do tab
		Then User should be navigated to things to do page
		And User able to see the search box 
		When User enter a city and click on the city on the drop down and click search button
		Then User able to see Tours in Most popular experiences in that city session  and see all button
		When User click on see all button in Tour city 
		Then User able to see experiences information of the Tours in that city
		When User click filter the type of tour
		And User show see the correct number of results to dispaly on the page
		And User can close the brower
		
	

