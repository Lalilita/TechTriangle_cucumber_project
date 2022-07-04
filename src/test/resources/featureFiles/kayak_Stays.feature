
@tolatestcases
Feature: Stays page automation testing

Background: 
Given user on Kayak homepage
And user click on the stay tab

#Scenario: Slides functionality
#Given user on the stays page
#When user is on Stays near you list
#Then user should be able to see number of sliders and number of image per slide
#And user should be able click on each images to see the detail inside
#When user is on Explore a variety of stays list 
#Then user should be able to see number of sliders and number of image per slide
#And user should be able click on each images to see the detail inside
#When user is on Favorite hotels around the globe list 
#Then user should be able to see number of sliders and number of image per slide
#And user should be able click on each images to see the detail inside

Scenario: Search for hotel 
Given user on the stays page
When user fill in searching criteria 
And user click on search button
Then user should be able to see the search result is displayed
And user click on Hotel class and Review score
Then user should be able to see new search results are displayed


#Scenario: Booking functionality
#Given user on the stays page
#When user fill in searching criteria
#And user click on search button
#Then user should be able to see different hotel listed with detailed information are displayed
#And user select sorted by price high to low
#Then user scroll mouse to The Greenwich Hotel user should be able to see different booking provider with prices
#When user click on KAYAK 
#Then user should be navigated to the new window tap where user can select the room and do the booking process
#And user can also validate the bookingNow button is enabled to be books if all information required are filled.
#







  