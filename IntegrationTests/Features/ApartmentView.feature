Feature: Accessing the site
	As a user
	I want to see information about all apartments
	so that I can inform myself about the state of the rooms
	
Scenario: Browse the apartments on the site 
	Given I have logged in
	When I click 'view apartments'
	Then I can view a table of of apartments and its details

Scenario: Browse the rooms on the site
	Given I have logged in and have navigated to 'apartments' page
	When I click on a 'apartment'
	Then I am shown a detailed breakdown of the 'apartment'
	
Scenario: Login to 
	Given I have logged in and have navigated to 'apartments' page
	When I click on a 'apartment'
	Then I am shown the room state