package com.malawi.pagefactory;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.malawi.baseclass.MBaseClass;
import com.malawi.baseclass.UtilityClass;

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
	
	@FindBy(xpath = "//input[@maxlength=\"1\"]")
	public List<WebElement> otpbox;
	
	public   void enterotp(String otp) {
		for(int i=0; i< otp.length();i++) {
			otpbox.get(i).sendKeys(String.valueOf(otp.charAt(i)));
		}
	}
	
	@FindBy (xpath = "//button[text()=' Verify ']")
	public WebElement verifybutton;
	
	@FindBy(xpath = "//button[text()='NEXT']")
	public WebElement successmsg;
	
	//error message
	@FindBy(xpath = "//*[contains(text(),'first name') or contains(text(),'Name is required')]")
	public WebElement nameError;
	
	@FindBy(xpath = "//*[contains(text(),'surname') or contains(text(),'Surnameis required')]")
	public WebElement surnameError;
	
	@FindBy(xpath = "//*[contains(text(),'Phone') or contains(text(),'phone number required'), or contains(text(),'invalid phone number')]")
	public WebElement phoneError;
	
	@FindBy(xpath = "//*[contains(text(),'National ID') or contains(text(),'minimum of 8 digits') or contains(text(),'national id require')]")
	public WebElement nationalIdError;
	
	@FindBy(xpath = "//*[contains(text(),'email') or contains(text(),'valid email') or contains(text(),'Invalid email address')]")
	public WebElement emailError;
	
	@FindBy(xpath = "//*[contains(text(),'Password') or contains(text(),'characters') or contains(text(),'Password must be at least 8 characters')]")
	public WebElement passwordError;
	
//	// ✅ Optional generic list (for flexible validation)
//	@FindBy(xpath = "//*[contains(@class,'error') or contains(@style,'red') or contains(text(),'Please') or contains(text(),'should be')]")
//	public List<WebElement> allErrorMessages;
	public void allerror() {
		//UtilityClass.wait;
		WebDriverWait wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(30));
	List<WebElement> errormsg=	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*contains(@class,'error') or contains(@style,'red')contains(text(),'Please') or contains(text(),'should be')")));
	for (WebElement web : errormsg) {
		System.out.println(web.getText());
	}
	
	}

}
