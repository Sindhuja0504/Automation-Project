package com.malawi.stepdefinition;


import com.malawi.baseclass.UtilityClass;
import com.malawi.pagefactory.SlotPF;

import io.cucumber.java.en.*;

public class SlotStepDefinition {
	SlotPF slot= new SlotPF();
	
	@Given("launch a browser and url")
	public void launch_a_browser_and_url() {
		
	     
	}

	@When("validate can able to select avaiable slots")
	public void validate_can_able_to_select_avaiable_slots() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("slot page");
		slot.alldates("16 Oct 2025");
		//slot.selectingdate("22 sep 2025");
//		Assert.assertTrue(true);
		
		
		
	     
	}

	@When("Validate user can able to select time slot")
	public void validate_user_can_able_to_select_time_slot() throws InterruptedException {
        slot.alltiming("AFTERNOON");
	//	slot.selectingtime("Afternoon");
//		Assert.assertTrue(true);
		UtilityClass.scroll();
		Thread.sleep(1000);
		
		
		 
	     
	}

	@When("Validate user can navigate using next and previous arrow")
	public void validate_user_can_navigate_using_next_and_previous_arrow() {
	     
	}

	@Then("Validate a back and book later and continue")
	public void validate_a_back_and_book_later_and_continue() {
		UtilityClass.clickElement(20, slot.continuebutton);
	     
	}

	@Then("Validate  a continue button should be enabled after selecting a slot")
	public void validate_a_continue_button_should_be_enabled_after_selecting_a_slot() {
		UtilityClass.clickElement(20, slot.dialogbox);
		UtilityClass.clickElement(20, slot.nextbutton);
	}

}
