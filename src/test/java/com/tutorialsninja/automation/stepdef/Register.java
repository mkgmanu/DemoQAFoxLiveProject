package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;
import com.tutorialsninja.automation.pages.SuccessPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register {
	
	HeadersSection headersSection =new HeadersSection();
	RegisterPage registerPage = new RegisterPage();
	SuccessPage successPage = new SuccessPage();
	
	@Given("^: Launch the application$")
	public void Launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());	    
	}
	
	@And("^: I navigate to register page$")
	public void I_navigate_to_register_page() {
		
		Elements.click(HeadersSection.myaccountLink);
		Elements.click(HeadersSection.register);
	}

	@When("^: I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable dataTable)  {
		
		registerPage.enterAllDetails(dataTable);
	}

	@And("^: I click on privacy button$")
	public void i_click_on_privacy_button() {
		
		Elements.click(RegisterPage.privacyCheckbox);
	   
	}

	@And("^: I click on continue button$")
	public void i_click_on_continue_button() {
		
		Elements.click(RegisterPage.continueButton);
	}

	@Then("^: I should see that the user account is created successfully\\.$")
	public void i_should_see_that_the_user_account_is_created_successfully() {
		
		Assert.assertTrue(Elements.isDisplayed(SuccessPage.successLink));
	   
	}

	@Then(": I should see that the user account is not created")
	public void i_should_see_that_the_user_account_is_not_created() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerLink));
	   
	    
	}
	@And(": I should see the error message for each fields")
	public void i_should_see_the_error_message_for_each_fields() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.first_name_warning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.last_name_warning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephone_warning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.email_warning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.password_warning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.main_warning));
	    
	    
	}


}
