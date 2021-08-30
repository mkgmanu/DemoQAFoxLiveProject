Feature: Login functionality scenarios

@Login @one
Scenario: Verify whether user is able to login successfully
	Given : Launch the application
   And  I navigate to login page
   When  I login to the application using username "ravi.kiran@gmail.com" and Password "rkiran"
   Then I should see that user is able to login successfully
   
@Login @two
Scenario: Verify that user is not able to login using invalid credentials
	Given : Launch the application
	And  I navigate to login page
	When  I login to the application using username "ravi.kiran999@gmail.com" and Password "rkiran999"
  Then I should see that user is not able to login successfully
  
  
@Login @three
Scenario: Verify that user is not able to login when no credentials is provided
	Given : Launch the application
	And  I navigate to login page
	When  I login to the application using username "" and Password ""
  Then I should see that user is not able to login successfully
  
@Login @four 
Scenario: verify that user is able to reset the forgotten password
	Given : Launch the application
	And  I navigate to login page
	When  I click on Forgotten password
  When I provide the email address "ravi.kiran@gmail.com"
  Then I should see the confirmation message for password reset