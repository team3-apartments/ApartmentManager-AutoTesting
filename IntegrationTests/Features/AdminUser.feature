Feature: Accessing the site
	As a user
	I want to be able to login
	so that I can access the application

Scenario: Login to browse the apartments on the site
	Given the correct 'user name' and 'password'
	When I click 'login'
	Then I can browse a table of 'apartments'

Scenario: Login to browse the apartments on the site
	Given the incorrect 'user name' and 'password'
	When I click 'login'
	Then I am prompted to enter correct administrator 'user name' and 'password'
	
Scenario: Login to browse the apartments on the site
	Given no 'user name' and 'password'
	When I click 'login'
	Then I am prompted prompted to enter a 'user name' and 'password'
	
Scenario: Login to browse the apartments on the site
	Given no 'user name' and 'password'
	When I don't click 'login'
	Then I am not shown anything new