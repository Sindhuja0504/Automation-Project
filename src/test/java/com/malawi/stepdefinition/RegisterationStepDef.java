package com.malawi.stepdefinition;

import org.junit.Assert;

import com.malawi.baseclass.MBaseClass;
import com.malawi.baseclass.UtilityClass;
import com.malawi.pagefactory.RegisterationPF;

import io.cucumber.java.en.*;

public class RegisterationStepDef {
	
	RegisterationPF reg;
	
	@Given("launch browser and load url")
	public void launch_browser_and_load_url() {
		MBaseClass.browserLaunch();
		MBaseClass.loadUrl(UtilityClass.readProperty("Url2"));
	     
	}
	
	@When("verify the name field {string}")
	public void verify_the_name_field(String Name) {
		RegisterationPF reg = new RegisterationPF();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
			System.out.println(e);
		}
		reg.username.sendKeys(Name);
	    
	}
	@When("verify the surname field {string}")
	public void verify_the_surname_field(String Surname) {
		reg = new RegisterationPF();
		reg.surname.sendKeys(Surname);
		
	     
	}
	@When("verify the phone number field {string}")
	public void verify_the_phone_number_field(String Number) {
		reg = new RegisterationPF();
		reg.mobileno.sendKeys(Number);
	}
	
	@When("verify the national id field {string}")
	public void verify_the_national_id_field(String ID) {
		reg = new RegisterationPF();
		reg.id.sendKeys(ID);
		
	}
	
	@When("veriify the email address field {string}")
	public void veriify_the_email_address_field(String Email) {
		reg = new RegisterationPF();
		reg.mail.sendKeys(Email);
	}
	
	@When("verify the password field {string}")
	public void verify_the_password_field(String Password) {
		reg.password.sendKeys(Password);
	     
	}
	 
	@When("verify the sendotp button")
	public void verify_the_sendotp_button() throws InterruptedException {
		reg = new RegisterationPF();
		reg.button.click();
		Thread.sleep(2000);
	}
	@When("verify the otp field")
	public void verify_the_otp_field() {
		reg = new RegisterationPF();
	String otp=	MBaseClass.scanner();
	reg.enterotp(otp);
	
	
	}
	
	@Then("verify the submit button")
	public void verify_the_submit_button() {
	     UtilityClass.clickElement(20, reg.verifybutton);
	    UtilityClass.clickElement(20,reg.successmsg);
	     Assert.assertTrue("Account Created Successfully!", reg.successmsg.isDisplayed());
	   
	}



}
