package com.malawi.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.malawi.baseclass.MBaseClass;

public class RegisterationPF extends MBaseClass{
	
	public  RegisterationPF() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id=\"signup-username\"]")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id=\"signup-confirm-password\"]")
	public WebElement surname;
	
	@FindBy(xpath = "//input[@id=\"mat-input-0\"]")
	public WebElement mobileno;
	
	@FindBy(xpath = "//input[@name=\"nationalId\"]")
	public WebElement id;
	
	@FindBy(xpath = "//input[@type=\"email\"]")
	public WebElement mail;
	
	@FindBy (xpath = "//input[@id=\"signup-password\"]")
	public WebElement password;
	
	@FindBy(xpath = "//button[text()=' Send OTP ']")
	public WebElement button;

}
