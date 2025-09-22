package com.malawi.stepdefinition;
import com.malawi.baseclass.MBaseClass;
import com.malawi.baseclass.UtilityClass;
import com.malawi.pagefactory.LoginPF;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	@Given("Launch the browser and url")
	public void launch_the_browser_and_url() {
		MBaseClass.browserLaunch();
		MBaseClass.loadUrl(UtilityClass.readProperty("URL"));

	}

	@When("Provide valid inputs and  then hit submit")
	public void provide_valid_inputs_and_then_hit_submit() throws Exception {
		LoginPF login = new LoginPF();
		login.id.sendKeys(UtilityClass.readProperty("NationID"));
		login.password.sendKeys(UtilityClass.readProperty("Password"));
		login.captcha.sendKeys(MBaseClass.scanner());
		login.submit.click();
		Thread.sleep(3000);
	}

	@Then("Validate if the user logged in successfully")
	public void validate_if_the_user_logged_in_successfully() {
		System.out.println("Successfully logged in");
	}

	@Given("Launch the passport application portal")
	public void launch_the_passport_application_portal() {
		System.out.println("Application form page");
	}

	@When("Provide a  service details")
	public void provide_a_service_details() throws Exception {
		LoginPF login = new LoginPF();
		Thread.sleep(2000);
		login.location.click();
		Thread.sleep(2000);
		//UtilityClass.sleep(2000);
		login.selectlocation.click();
		login.center.click();
		Thread.sleep(2000);
		login.selectcenter.click();
		login.ptype.click();
		login.selectptype.click();
		login.stype.click();
		login.selectstype.click();
	
	}

	@When("Provide a  personal details")
	public void provide_a_personal_details() throws Throwable {
		LoginPF login = new LoginPF();
		//UtilityClass.scrolltotext(By.xpath("(//mat-label[@class=\"labelName\"])[9]"));
		UtilityClass.scroll();
		Thread.sleep(2000);
		login.surname.sendKeys(UtilityClass.readProperty("Surname"));
		login.othername.sendKeys(UtilityClass.readProperty("Othername"));
		//UtilityClass.scroll();
		Thread.sleep(2000);
		login.gender.click();
		Thread.sleep(1000);
		login.selectgender.click();
		login.nationality.click();
		Thread.sleep(1000);
		login.selectnation.click();
		login.datepicker.click();
		login.dropdown.click();
		login.previousButton.click();
		UtilityClass.selectDate("2001","DEC","30");
		UtilityClass.scroll();
		Thread.sleep(1000);
		login.brithcountry.click();
		login.malawicountry.click();
		//login.birthdistrict.click();
//		Thread.sleep(200);
//		MBaseClass.textelement("Chiradzulu");
		login.palceofbirth.sendKeys(UtilityClass.readProperty("POB"));
	}

	@When("Provide a  permanent address details")
	public void provide_a_permanent_address_details()  {
		LoginPF login= new LoginPF();
		login.presentcountry.click();
		login.selectpresentcountry.click();
		try {
			UtilityClass.scroll();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		login.presentAdd.sendKeys(UtilityClass.readProperty("Address1"));
		
	}

	@When("Select the same as present address option or enter present details")
	public void select_the_same_as_present_address_option_or_enter_present_details() throws InterruptedException {
		LoginPF login= new LoginPF();
		UtilityClass.scroll();
		Thread.sleep(200);
		login.checkbox.click();
	}

	@When("Accept the terms and conditions and Click next")
	public void accept_the_terms_and_conditions_and_click_next() throws InterruptedException {
		LoginPF login= new LoginPF();
		UtilityClass.scroll();
		Thread.sleep(200);
		login.termsndconditions.click();
		
	}

	@Then("Verify the user is navigated to the next page")
	public void verify_the_user_is_navigated_to_the_next_page() throws InterruptedException {
		LoginPF login= new LoginPF();
		login.nextbutton.click();
		Thread.sleep(200);
		
	}

}