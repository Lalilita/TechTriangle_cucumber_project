

Feature: Stays page view sliders automation testing

Background: 
Given user on Kayak homepage
And user click on the stay tab

Scenario: Sliders functionality
Given user on the stays page
When user is on Stays near you list
Then user should be able to see number of sliders and number of image per slide
And user should be able click on each images to see the detail inside
When user is on Explore a variety of stays list 
Then user should be able to see number of sliders and number of image per slide
And user should be able click on each images to see the detail inside
When user is on Favorite hotels around the globe list 
Then user should be able to see number of sliders and number of image per slide
And user should be able click on each images to see the detail inside








  