Feature: Accessing the site
	As a user
	I want to to be able to filter the apartments
	so that I effectively manage them

Scenario: Filter the apartments
	Given I have logged in and have navigated to 'apartments' page
	When I change filter to rooms state 'vacant'
	Then I am shown only vacant 'apartments'