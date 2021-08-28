package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import io.cucumber.datatable.DataTable;



public class RegisterPage {
	
	public RegisterPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	public static WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	public static WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	public static WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	public static WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	public static WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	public static WebElement confirmPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	public static WebElement privacyCheckbox;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public static WebElement continueButton;
	
	@FindBy(linkText="Register")
	public static WebElement registerLink;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement first_name_warning;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement last_name_warning;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement email_warning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephone_warning;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement password_warning;
	
	@FindBy(css="div[class='alert alert-danger alert-dismissible']")
	public static WebElement main_warning;

	public void enterAllDetails(DataTable dataTable) {
		
		Map<String,String> map=dataTable.asMap(String.class, String.class);
		Elements.TypeText(RegisterPage.firstname, map.get("Firstname"));
		Elements.TypeText(RegisterPage.lastName, map.get("Lastname"));
		Elements.TypeText(RegisterPage.email, System.currentTimeMillis()+map.get("Email"));
		Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.password, map.get("Password"));
		Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
	}
	
}
