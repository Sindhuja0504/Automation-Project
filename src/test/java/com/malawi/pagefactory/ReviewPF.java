package com.malawi.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPF extends SlotPF {
	
	@FindBy(xpath = "//span[text()=' PRINT/DOWNLOAD PDF ']")
	public WebElement pdf;
	
	@FindBy (xpath = "//span[text()=' FINISH ']")
	public WebElement finishbutton;

}
