package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class forgottenPage {
	
	public forgottenPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(xpath="//div/input[@class='btn btn-primary']")
	public static WebElement continueButton;

}
