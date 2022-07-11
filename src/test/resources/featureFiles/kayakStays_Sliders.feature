
@tola2
Feature: Stays page view sliders automation testing

Background: 
Given user on Kayak homepage
And user click on the stay tab

Scenario: Sliders functionality
Given user on the stays page
When use scroll mouse to Top eight popular cities
Then user should be able to see number of sliders and number of image per slide
And user should be able click on each images
And user should be able to see the name city attaches with image
Then user close the window








  