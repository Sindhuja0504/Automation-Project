package com.malawi.pagefactory;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.malawi.baseclass.MBaseClass;

public class SlotPF extends PreviewPF {

	//approch1 dynamic xpath
	public void alldates(String date) {
		MBaseClass.findelement(By.xpath("//p[contains(text(),'"+ date +"')]")).click();
	}
	
	public void alltiming(String time) {
		MBaseClass.findelement(By.xpath("//p[contains(text(),'"+time+"')]")).click();
		
	}
	
	//approch2 filter by first
	
//	@FindBy(xpath = "//p[contains(text(),'tile-date')]")
//	public List<WebElement> alldates;
//	
//	public void selectingdate(String dateText) {
//		
//		for (WebElement firstdate : alldates) {
//			if(firstdate.getText().trim().equalsIgnoreCase(dateText)) {
//				firstdate.click();
//				break;
//			}
//		}
//	}
//	
//	@FindBy(xpath = "//p[contains(text(),'tile-date-text')]")
//	public List<WebElement> alltiming;     //finding all WebElements so i have give in List<WebElement>
//	
//	public void selectingtime(String timetext) {
//		for (WebElement firsttime : alltiming) {
//			if(firsttime.getText().trim().equalsIgnoreCase(timetext)){
//				firsttime.click();
//				break;
//			}
//			
//		}
//	}
	
	@FindBy(xpath = "( //button[text()=' Continue '])[2]")
	public WebElement dialogbox;
	
	@FindBy(xpath = "//button[text()='NEXT']")
	public WebElement nextbutton;
	
	@FindBy(xpath = "//div[@class=\"right-button\"]")
	public WebElement rightarrow;
	
	@FindBy(xpath = "//div[@class=\"left-button\"]")
	public WebElement leftarrow;

	@FindBy(xpath = "//button[contains(text(),' Continue ')]")
	public WebElement continuebutton;

	@FindBy(xpath = "//button[contains(text(),' Book Later ')]")
	public WebElement booklater;

	@FindBy(xpath = "//button[contains(text(),' Back ')]")
	public WebElement back;
	
	

}
