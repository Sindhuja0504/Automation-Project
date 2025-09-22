package com.malawi.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {

	public static WebDriverWait wait;
	public static FluentWait<WebDriver> fluentwait;
	// public static TakesScreenshot sc;

	public static String screenShot() {
		// String filepath =
		// "C:\\Users\\M1001\\projectclss-workspace\\FinalProject\\src\\test\\resources\\Resource\\Screenshot.png";
		String filepath = "D:\\Sindhu\\screenshots";
		TakesScreenshot sc = (TakesScreenshot) MBaseClass.driver;
		File srcFile = sc.getScreenshotAs(OutputType.FILE);
		// If folder does not exist, create it
		File f = new File(filepath);
		if (!f.exists()) {
			f.mkdirs();
		}
		// Create dynamic filename using timestamp
		String timestamp = new SimpleDateFormat("YYYYMMDD_HHMMSS").format(new Date());
		String path = filepath + "\\Screenshots_" + timestamp + ".png";
		try {
			// Save file
			File folder = new File(path);
			FileUtils.copyFile(srcFile, folder);
			System.out.println("Screenshot saved at: " + path);

		} catch (Exception e) {
			System.out.println(e);
		}
		// FileUtils.copyFile(srcFile, folder);
		return filepath;
	}

	public static String readProperty(String values) {
		String property = null;
		try {
			// File f = new File(path);
			FileReader read = new FileReader("C:\\Users\\M1001\\projectclss-workspace\\FinalProject\\"
					+ "src\\test\\resources\\Resource\\LoginCredential.properties");
			Properties pro = new Properties();
			pro.load(read);
			property = pro.getProperty(values);
		} catch (Exception e) {
			System.out.println(e);
		}
		return property;
	}

	public static void readExcel(String path, String sheetname, int rownum, int cellnum) {
		File f = new File(path);
		try {
			FileInputStream input = new FileInputStream(f);
			Workbook wk = new XSSFWorkbook(input);
			Sheet sh = wk.getSheet(sheetname);
			Row row = sh.getRow(rownum);
			Cell cells = row.getCell(cellnum);

		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void sleep(long time) {
		try {
			Thread.sleep(Duration.ofSeconds(time));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// uploading file
	public static void uploadFilejs(WebElement element, String Filepath) {
		// WebElement element = MBaseClass.driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) MBaseClass.driver;
		js.executeScript("arguments[0].style.display='block';", element);
		element.sendKeys(Filepath);
	}

	public static void uploadingfile(WebElement element, String filepath) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(20));
		WebElement elementpath = wait.until(ExpectedConditions.visibilityOf(element));
		elementpath.sendKeys(filepath);

	}

	// explict wait methods
	public static void alertPresent(long time) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void framePresentSwitchTo(long time, By by) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}

	public static void visibilityOfElement(long time, WebElement element) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void visibilityOfElementLocator(long time, By by) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void clickElement(long time, WebElement element) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();;
	}

	public static void clickElementLocator(long time, By by) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();;
	}

	public static void invisibilityOfElement(long time, WebElement element) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public static void invisibilityOfElementLocator(long time, By by) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public static void textToBePresentElement(long time, WebElement element, String text) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	public static void textToBePresentElementLocator(long time, By by, String text) {
		wait = new WebDriverWait(MBaseClass.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
	}

	// fluent wait
	public static void fluentwait(long timeout, long polling) {
		fluentwait = new FluentWait<WebDriver>(MBaseClass.driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(polling)).ignoring(Exception.class);

	}

	public static void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) MBaseClass.driver;
		js.executeScript("window.scrollBy(0,400)", "");

	}

	public static void scrolltotext(By by) {
		WebElement element = MBaseClass.findelement(by);
		JavascriptExecutor js = (JavascriptExecutor) MBaseClass.driver;
		// ((JavascriptExecutor)
		// MBaseClass.driver).executeScript("arguments[0].scrollIntoView(true)",element);
		js.executeScript("arguments[0].scrollIntoView()", element);

	}

	public static void scrollBottom() {
		JavascriptExecutor js = (JavascriptExecutor) MBaseClass.driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

	}

	public static void selectDate(String year, String month, String date) {
//		while (MBaseClass.driver.findElements(By.xpath("//div[text()='" +year+ "']")).isEmpty()) {
//			//MBaseClass.driver.findElement(By.xpath(prevpath)).click();
//			try {
//				Thread.sleep(500);
		MBaseClass.driver.findElement(By.xpath("//div[text()='" + year + "']")).click();
		MBaseClass.driver.findElement(By.xpath("//div[text()='" + month + "']")).click();
		MBaseClass.driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
//			} catch (Exception e) {
//				 
//				System.out.println();
//			}

	}
}
