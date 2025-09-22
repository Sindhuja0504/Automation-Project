package com.malawi.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreviewPF extends DocumentPF {
	
	@FindBy(xpath = "//input[@id=\"preview\"]")
	public WebElement checkbox;
	
	@FindBy(xpath = "//button[text()=' CONTINUE ']")
	public WebElement continuebutton;
	

}
