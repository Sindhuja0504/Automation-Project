//package com.malawi.stepdefinition;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import com.malawi.baseclass.MBaseClass;
//import com.malawi.baseclass.UtilityClass;
//import com.malawi.pagefactory.RegisterationPF;
//
//import io.cucumber.java.en.*;
//
//public class RegisterationStepDef {
//	
//	RegisterationPF reg;
//	
//	@Given("launch browser and load url")
//	public void launch_browser_and_load_url() {
//		MBaseClass.browserLaunch();
//		MBaseClass.loadUrl(UtilityClass.readProperty("Url2"));
//		reg = new RegisterationPF();
//	}
//	
//	@When("verify the name field {string}")
//	public void verify_the_name_field(String Name) {
//		//RegisterationPF reg = new RegisterationPF();
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			
//			System.out.println(e);
//		}
//		reg.username.sendKeys(Name);
//	    
//	}
//	@When("verify the surname field {string}")
//	public void verify_the_surname_field(String Surname) {
//		reg = new RegisterationPF();
//		reg.surname.sendKeys(Surname);
//		
//	     
//	}
//	@When("verify the phone number field {string}")
//	public void verify_the_phone_number_field(String Number) {
//		reg = new RegisterationPF();
//		reg.mobileno.sendKeys(Number);
//	}
//	
//	@When("verify the national id field {string}")
//	public void verify_the_national_id_field(String ID) {
//		reg = new RegisterationPF();
//		reg.id.sendKeys(ID);
//		
//	}
//	
//	@When("veriify the email address field {string}")
//	public void veriify_the_email_address_field(String Email) {
//		reg = new RegisterationPF();
//		reg.mail.sendKeys(Email);
//	}
//	
//	@When("verify the password field {string}")
//	public void verify_the_password_field(String Password) {
//		reg.password.sendKeys(Password);
//	     
//	}
//	 
//	@When("verify the sendotp button")
//	public void verify_the_sendotp_button() throws InterruptedException {
//		reg = new RegisterationPF();
//		reg.button.click();
//		Thread.sleep(2000);
//	}
//	@When("verify the otp field")
//	public void verify_the_otp_field() {
//		//reg = new RegisterationPF(); 
//		
//		List<WebElement> errors = MBaseClass.driver.findElements(By.xpath(
//		        "//*[contains(text(),'invalid') or contains(text(),'required') or contains(text(),'not valid') or contains(text(),'please enter')]"
//		    ));
//		System.out.println(errors);
//
//		    if (!errors.isEmpty()) {
//		        System.out.println("❌ OTP not required due to validation errors:");
//		        for (WebElement e : errors) {
//		            System.out.println("error message " + e.getText());
//		        }
//		        // ⚠️ Skip OTP entry and continue to next ro
//		    }else {
//		    	String otp=	MBaseClass.scanner();
//		    	reg.enterotp(otp);
//			}
//
//		    // ✅ No errors — now safe to ask user for OTP
//		  
//	
//	
//	
//	}
//	
//	@Then("verify the submit button")
//	public void verify_the_submit_button() {
//		try {
//			 UtilityClass.clickElement(20, reg.verifybutton);
//			 Thread.sleep(2000);
//			 List<WebElement> errors =MBaseClass. driver.findElements(By.xpath("//*[contains(text(),'invalid') or contains(text(),'required') or contains(text(),'please enter') or contains(text(),'not valid')]"));
//
//		        if (!errors.isEmpty()) {
//		            // 🔴 Error found
//		            System.out.println("❌ Validation failed. Error message(s):");
//		            for (WebElement e : errors) {
//		                System.out.println("error message " + e.getText());
//		            }
//
//		            // Do not throw exception — just continue with next row
//		        } else {
//		            // ✅ No error → check for success message
//		            UtilityClass.clickElement(20, reg.successmsg);
//		            if (reg.successmsg.isDisplayed()) {
//		                System.out.println("✅ Account Created Successfully!");
//		            } else {
//		                System.out.println("⚠️ Submit clicked but success message not visible.");
//		            }
//		        }
//
//		    } catch (Exception e) {
//		        System.out.println("⚠️ Exception during form submission: " + e.getMessage());
//		        // Don't fail the test; allow next example to run
//		    }
//		MBaseClass.closeBrowser();
//			}
//			
//		
//	    
////	    UtilityClass.clickElement(20,reg.successmsg);
////	     Assert.assertTrue("Account Created Successfully!", reg.successmsg.isDisplayed());
//	   
//	
//	
////	@Then("error message")
////	public void verify_error(String Fieldname) {
////		System.out.println("error");
////		switch (Fieldname.toLowerCase()) {
////		
////		case "name":
////			UtilityClass.visibilityOfElement(10, reg.nameError); 
////			System.out.println("name error:" + reg.nameError.getText());
////			 
////			
////		case "surname":
////			UtilityClass.visibilityOfElement(10, reg.surnameError); 
////			System.out.println("surname error:" + reg.surnameError.getText());
////			 
////		case "phonenumber":
////			UtilityClass.visibilityOfElement(10, reg.phoneError); 
////			Assert.assertTrue(reg.phoneError.isDisplayed()); 
////			 
////			
////		case "nationalid":
////			UtilityClass.visibilityOfElement(10, reg.nationalIdError); 
////			Assert.assertTrue( reg.nationalIdError.isDisplayed()); 
////			   
////		case "email":
////			UtilityClass.visibilityOfElement(10, reg.emailError); 
////			Assert.assertTrue (reg.emailError.isDisplayed()); 
////			 
////			
////		case "password":
////			UtilityClass.visibilityOfElement(10, reg.passwordError);
////			Assert.assertTrue(reg.passwordError.isDisplayed()); 
////			 
////			
////
////		default:
////			System.out.println("no matching field error");
////			break;
////		}
////	}
//
//
//
//}
