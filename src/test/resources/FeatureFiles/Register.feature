Feature: Registration Functionality scenarios

  @Register @one
  Scenario: Verify whether user is able to register application by providing all the details
   Given : Launch the application
   And : I navigate to register page
   When : I provide all the below details
    |Firstname |Ravi								  |
    |Lastname	 |Kiran								  |
    |Email		 |ravi.kira797@gmail.com|
    |Telephone |9988776655					  |
    |Password	 |rkiran							 	|
   And : I click on privacy button
   And : I click on continue button
   Then : I should see that the user account is created successfully.
   
   @Register @two
   Scenario: Verify whether user is not able to register when mandatory fields are not filled
   Given : Launch the application
   And : I navigate to register page
   And : I click on continue button
   Then : I should see that the user account is not created
   And : I should see the error message for each fields
   
   