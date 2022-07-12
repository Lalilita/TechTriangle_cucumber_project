Feature: Booking car Functionality




Scenario: User able to search the rental car from Top 8 popular cities 
Given User is on KAYAK Home Page
When User click on car tab
And User should be navigated to car page
And User scroll down to top 8 popular cities
And   User should see the 8 slide and can click on each slide
When User click  the cities on the  slide
Then User able to see the list of rental car and show the pickup location is the same with the city in the slide 
