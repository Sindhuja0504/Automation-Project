package com.malawi.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocumentPF extends LoginPF{
	
	@FindBy(xpath = "(//input[@class=\"browseInput\"])[1]")
	public WebElement nationalid;
	
	
	@FindBy(xpath = "(//input[@value=\"Browse file\"])[2]")
	public WebElement photo;
	
	@FindBy(xpath = "//button[text()=' NEXT ']")
	public WebElement nextbutton;
	

}
