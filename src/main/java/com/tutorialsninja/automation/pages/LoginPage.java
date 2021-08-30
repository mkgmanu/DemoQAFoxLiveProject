package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement username;
	
	@FindBy(id="input-password")
	public static WebElement password;

	@FindBy(xpath="//input[@class='btn btn-primary']")
	public static WebElement loginButton;
	
	@FindBy(css="div[class='alert alert-danger alert-dismissible']")
	public static WebElement loginWarning;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgottenPassword;
	
	@FindBy(css="div[class='alert alert-success alert-dismissible']")
	public static WebElement emailSentMessage;
	
	public static void login(String email, String password) {
		
		Elements.TypeText(LoginPage.username, email);
		Elements.TypeText(LoginPage.password, password);
		Elements.click(LoginPage.loginButton);
	}
}
