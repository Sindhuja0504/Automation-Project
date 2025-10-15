package com.malawi.baseclass;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MBaseClass {

	public static WebDriver driver;
	public static Select select;
	public static Actions actions;
	public static WebDriverWait wait;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-build-check");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static WebElement findelement(By by) {
		return driver.findElement(by);

	}
	public static List<WebElement> findelements(By by){
		return driver.findElements(by);
		 
		
	}

	public static void textelement(String text) {
		driver.findElement(By.xpath("//span[contains(text(),'"+text+"')]")).click();

	}
	public static void clickElement(long time, WebElement element) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static String scanner() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		String value = scan.nextLine();
		return value;
	}

	public static void selectByVisibleText(String data) {
		select.selectByVisibleText(data);
	}

	public static void selectByIndex(int number) {
		select.selectByIndex(number);
	}

	public static void selectbyValue(String value) {
		select.selectByValue(value);
	}

	public static void selectByContainsVisibletext(String text) {
		select.selectByContainsVisibleText(text);
	}

	public static void getoptionList() {
		select.getOptions();
	}

	public static void getFirstSelectedOption() {
		select.getFirstSelectedOption();
	}

	public static void getAllSelectedOptions() {
		select.getAllSelectedOptions();
	}

//	public static void browserLaunch() {
//		if (browser.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		} else if (browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if (browser.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		}
//
//		driver.manage().window().maximize();
//	}

}
