package com.malawi.stepdefinition;

import com.malawi.baseclass.MBaseClass;
import com.malawi.baseclass.UtilityClass;
import com.malawi.pagefactory.ReviewPF;

import io.cucumber.java.en.*;

public class ReviewStepDefinition {
	ReviewPF review = new ReviewPF();
	
	@When("Verify user is able to download a pdf")
	public void verify_user_is_able_to_download_a_pdf() throws InterruptedException {
		UtilityClass.scrollBottom();
		Thread.sleep(2000);
		review.pdf.click();
		
		System.out.println("download now");
	    
	}

	@When("verify the finish button")
	public void verify_the_finish_button() {
		MBaseClass.scanner();
		
		review.finishbutton.click();
	     
	}

	@Then("Verify that the page navigate to my application page")
	public void verify_that_the_page_navigate_to_my_application_page() {
	     
	}

}
