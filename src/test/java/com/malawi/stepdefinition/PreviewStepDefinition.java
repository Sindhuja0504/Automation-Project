package com.malawi.stepdefinition;

import org.openqa.selenium.By;

import com.malawi.baseclass.UtilityClass;
import com.malawi.pagefactory.PreviewPF;

import io.cucumber.java.en.*;

public class PreviewStepDefinition {
	
	 PreviewPF preview = new PreviewPF();
	
	@Given("launch browser and url")
	public void launch_browser_and_url() {
	   System.out.println("Preview page");
	}

	@When("validate   modify icon")
	public void validate_modify_icon() throws InterruptedException {
		UtilityClass.scrollBottom();
		Thread.sleep(2000);   
	}

	@When("validate  check box")
	public void validate_check_box() {
		preview.checkbox.click(); 
	}

	@Then("validate  continue button")
	public void validate_continue_button() {
		UtilityClass.clickElementLocator(2000, By.xpath("//button[text()=' CONTINUE ']"));
		//preview.continuebutton.click();
	    
	}

}
