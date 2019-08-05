package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("tripType")).click();
		WebElement DD= driver.findElement(By.name("passCount"));
		Select se= new Select(DD);
		se.selectByIndex(2);
		WebElement DD1= driver.findElement(By.name("fromMonth"));
		Select se1= new Select(DD);
		se1.selectByIndex(2);
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("outFlight")).click();
		
		
		
		
		
		
		

	}

}
