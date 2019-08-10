import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Workbook;



public class Sel16 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\Jar files\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/ ");
		driver.manage().window().maximize();
		//storing file path in filedata
		File filedata= new File("C:\\Users\\KrishnapriyaSudharma\\Desktop\\Excel\\test data.xlsx");
		//taking the input
		FileInputStream fis= new FileInputStream(filedata);
		//poi supports both xls and xlsx. If using xls, use interface HSS and of using XSS
		//below interface to read the workbook
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//read the sheet
		XSSFSheet sheet = wb.getSheet("day1");
		//to fetch the cell value of the cell by row and column
		String data1=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		String data2=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data2);
		//sending data to application from excel
		driver.findElement(By.id("txtUsername")).sendKeys(data1);
		driver.findElement(By.id("txtPassword")).sendKeys(data2);
		driver.findElement(By.id("btnLogin")).click();
		wb.close();
	}

}
