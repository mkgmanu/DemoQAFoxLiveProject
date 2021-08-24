Feature: Registration Functionality scenarios

  @Register @one
  Scenario: Verify whether user is able to register application by providing all the details
   Given : Launch the application
   And : I navigate to register page
   When : I provide all the below details
    |Firstname |Ravi								|
    |Lastname	 |Kiran								|
    |Email		 |ravi.kiran@gmail.com|
    |Telephone |9988776655					|
    |Password	 |rkiran							|
   And : I click on privacy button
   And : I click on continue button
   Then : I should see that the user account is created successfully.