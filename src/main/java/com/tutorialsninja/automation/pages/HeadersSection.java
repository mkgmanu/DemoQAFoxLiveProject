package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeadersSection {
	
	public HeadersSection() {
		
		//To avoid staleelementreferenceexception , We need to initialize web elements
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement myaccountLink;
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;

}
