package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	@Given("^: Launch the application$")
	public void Launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}
	
	@And("^: I navigate to register page$")
	public void I_navigate_to_register_page() {
	   
	}

	@When("^: I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable dataTable)  {
	    
	}

	@And("^: I click on privacy button$")
	public void i_click_on_privacy_button() {
	   
	}

	@And("^: I click on continue button$")
	public void i_click_on_continue_button() {
	    
	}

	@Then("^: I should see that the user account is created successfully\\.$")
	public void i_should_see_that_the_user_account_is_created_successfully() {
	   
	}



}
