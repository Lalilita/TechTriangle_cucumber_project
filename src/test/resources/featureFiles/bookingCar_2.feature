Feature: Booking car Functionality
Scenario: User able to sort car type from the rental car list 

Given User is on KAYAK Home Page
When User click on car tab
Then User should be navigated to car page
When  User select the small car
Then  User should see the check box for car type
When User select the car type
Then User able to see the list of rental car the same as you select car type
And User can close the brower
  