package com.malawi.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.malawi.baseclass.MBaseClass;

public class LoginPF extends MBaseClass {

	public LoginPF() { // constructor
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "nationalId") // WebElement id = driver.findElement(By.name("nationalId"))
	public WebElement id;
	
	@FindBy(name = "password")
	public WebElement password;

	@FindBy(name = "captcha")
	public WebElement captcha;

	@FindBy(xpath = "//button[text()=' Submit ']")
	public WebElement submit;
	
	@FindBy(xpath = "//mat-select[@id=\"mat-select-0\"]")
	public  WebElement location;
	
	@FindBy(xpath = "//span[text()=' MALAWI ']")
	public WebElement selectlocation;
	
	@FindBy(xpath="//mat-select[@id=\"mat-select-18\"]")
	public WebElement center;
	
	@FindBy(xpath="//span[text()=' Blantyre ']")
	public WebElement selectcenter;
	
	@FindBy(xpath="//mat-select[@id=\"mat-select-1\"]")
	public WebElement ptype;
	
	@FindBy(xpath =" //span[text()=' ORDINARY - 48 PAGES ']")
	public WebElement selectptype;
	
	@FindBy(xpath="//mat-select[@id=\"mat-select-3\"]")
	public WebElement stype;
	
	@FindBy(xpath="//span[text()=' NORMAL ']")
	public WebElement selectstype;
	
	@FindBy(xpath = "//input[@id=\"mat-input-0\"]")
	public WebElement surname;
	
	@FindBy(xpath = "//input[@id=\"mat-input-1\"]")
	public WebElement othername;
	
	@FindBy(xpath = "//mat-label[text()='Personal Details (Zambiri za munthu) ']")
	public WebElement scroll;
	
	@FindBy(xpath = "//mat-select[@id=\"mat-select-4\"]")
	public WebElement gender;
	
	@FindBy(xpath = "//span[text()=' Male ']")
	public WebElement selectgender;
	
	@FindBy(xpath = "//mat-select[@id=\"mat-select-5\"]")
	public WebElement nationality;
	
	@FindBy(xpath = "//span[text()=' Malawian ']")
	public WebElement selectnation;
	
	@FindBy(xpath = "(//button[@class=\"mat-icon-button\"])[1]")
	public WebElement datepicker;
	
	@FindBy(xpath = "//span[text()='2001']")
	public WebElement locatoryear;
	
	@FindBy(xpath = "//div[@class=\"mat-calendar-arrow\"]")
	public WebElement dropdown;
	
	@FindBy(xpath = "//button[@aria-label=\"Previous 20 years\"]")
	public WebElement previousButton;
	
	@FindBy(xpath = "(//div[@class=\"mat-select-arrow-wrapper\"])[8]")
	public WebElement brithcountry;
	
	@FindBy(xpath = "//span[text()=' Malawi ']")
	public WebElement malawicountry;
	
//	@FindBy(xpath = "(//div[@class=\"mat-select-arrow\"])[9]")
//	public WebElement birthdistrict;
	
	@FindBy(xpath = "//input[@id=\"mat-input-10\"]")
	public WebElement palceofbirth;
	
	@FindBy(xpath = "(//div[@class=\"mat-select-arrow\"])[10]")
	public WebElement presentcountry;
	
	@FindBy(xpath = "//span[text()=' Malawi ']")
	public WebElement selectpresentcountry;
	
	@FindBy(xpath = "//input[@id=\"mat-input-18\"]")
	public WebElement presentAdd;
	
	@FindBy(xpath = "//input[@id=\"addressCopy\"]")
	public WebElement checkbox;
	
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
	public WebElement termsndconditions;
	
	@FindBy(xpath = "//button[text()=' NEXT ']")
	public WebElement nextbutton;
}
