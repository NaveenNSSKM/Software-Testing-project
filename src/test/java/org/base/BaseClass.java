package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchurl(String Url) {
		driver.get(Url);
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void passtxt(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void clickbtn(WebElement ele) {
		ele.click();
	}

	public static void screenshot(String imgname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgName.png");
		FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void moveThecursor(WebElement targetWebElement) {

		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}

	public static void doubleclick(WebElement Element) {
		a = new Actions(driver);
		a.doubleClick().perform();
	}

	public static void contextclick(WebElement Ele) {
		a = new Actions(driver);
		a.contextClick().perform();
	}

	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(True)", target);
	}

	public static void scroll(WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(True)", target);

	}

	public static void click(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

	public static void insertvalue(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','enter')", ele);
	}

	public static void getvalue(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].getAttribute('value')", ele);
	}

	
	public static void windowhandle() {
		String parentId = driver.getWindowHandle();
		
	}
	
	public static void windowhandles() {
		Set<String> childId = driver.getWindowHandles();
	}
	
	public static void excelRead(String sheetname, int rowNum, int cellNum) throws IOException {

		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Data");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);

		int cellType = c.getCellType();

		if (cellType == 1) {

			String value = c.getStringCellValue();

		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date value = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat();
			String page = s.format(value);

		}

		else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueOf = String.valueOf(l);
		}
		
		
	}
	
	public static void createNewExcelFile(int rowNum, int cellNum, String newData) throws IOException {
		
		File f = new File("C:\\Users\\user\\eclipse-workspace\\maveninstallation\\excel4\\newfile.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newsheet = wb.createSheet();
		Row r = newsheet.createRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(newData);
		FileOutputStream s = new FileOutputStream(f);
		
		wb.write(s);
	
		
	}

	public static void createcell(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\maveninstallation\\excel4\\newfile.xlsx");
		FileInputStream fos = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fos);
		Sheet mysheet = wb.getSheet("Sheet0");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(newData);
		FileOutputStream s = new FileOutputStream(f);
		wb.write(s);
	}
	
	public static void createrow(int crerow, int crecell, String newData) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\maveninstallation\\excel4\\newfile.xlsx");
		FileInputStream fos = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fos);
		Sheet mysheet = wb.getSheet("Sheet0");
		Row r = mysheet.createRow(crerow);
		Cell c = r.createCell(crecell);
		
		c.setCellValue(newData);
		FileOutputStream s = new FileOutputStream(f);
		wb.write(s);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
