package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import com.tutorialsninja.automation.pages.RegisterPage;
import com.tutorialsninja.automation.pages.forgottenPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	
	LoginPage loginPage= new LoginPage();
	MyAccountPage myaccountpage = new MyAccountPage();
	forgottenPage forgotPage = new forgottenPage();
	
	@Given("I navigate to login page")
	public void i_navigate_to_login_page() {
		Elements.click(HeadersSection.myaccountLink);
		Elements.click(HeadersSection.login);
	}
	    
	
	@When("I login to the application using username {string} and Password {string}")
	public void i_login_to_the_application_using_username_and_password(String email, String password) {
		
		LoginPage.login(email, password);	    
	}
	
	@Then("I should see that user is able to login successfully")
	public void i_should_see_that_user_is_able_to_login_successfully() {
		
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.AffiliateAccountLink));
}
	
	@Then("I should see that user is not able to login successfully")
	public void i_should_see_that_user_is_not_able_to_login_successfully() {
		
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.loginWarning, "Warning: No match for E-Mail Address and/or Password."));		
}
	
	@When("I click on Forgotten password")
	public void I_click_on_Forgotten_password() {

		Elements.click(LoginPage.forgottenPassword);
	    
	}
	
	@When("I provide the email address {string}")
	public void I_provide_the_valid_email_address(String email) {
		
		Elements.TypeText(forgottenPage.email, email);
		Elements.click(forgottenPage.continueButton);
	    
	}
	
	@Then("I should see the confirmation message for password reset")
	public void I_should_see_the_confirmation_message_for_password_reset() {
		
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.emailSentMessage, "An email with a confirmation link has been sent your email address."));
		
}
	
}
