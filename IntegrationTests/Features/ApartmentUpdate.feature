Feature: Accessing the site
	As a user
	I want to update the apartment details
	So that I can keep track of who is in which apartment

Scenario: Update tenant information in apartments
	Given I have logged in and have navigated to 'apartments/rooms' page
	When I change a value of anything the 'update' button is shown and I click it
	Then I should be notified and shown my changes