package com.malawi.stepdefinition;

import org.openqa.selenium.By;

import com.malawi.baseclass.MBaseClass;
import com.malawi.baseclass.UtilityClass;
import com.malawi.pagefactory.DocumentPF;

import io.cucumber.java.en.*;

public class DocumentStepDef {
	
	DocumentPF document= new DocumentPF();
	
	
	@Given("In document upload page")
	public void in_document_upload_page() {
		System.out.println("Start uploading");
	     
	}

	@When("upload national id document")
	public void upload_national_id_document() throws InterruptedException {	
		Thread.sleep(3000);
		document.nationalid.click();
		MBaseClass.scanner();
		System.out.println("enter the scanner");
		UtilityClass.scroll();
		Thread.sleep(2000);
		//document.nationalid.sendKeys(UtilityClass.readProperty("D:\\Sindhu\\malawifiles\\national.pdf"));
		UtilityClass.uploadingfile(document.nationalid,UtilityClass.readProperty("NationIDdoc"));
		
	}

	@When("upload passport size photo document")
	public void upload_passport_size_photo_document() {
		document.photo.click();
		MBaseClass.scanner();
		
	    
	}

	@When("upload other require documents")
	public void upload_other_require_documents() {
		
	     
	}

	@Then("Documents should be accepted and the application should navugate to the next page")
	public void documents_should_be_accepted_and_the_application_should_navugate_to_the_next_page() throws InterruptedException {
	    document.nextbutton.click();
	    Thread.sleep(2000);
	}

	

}
