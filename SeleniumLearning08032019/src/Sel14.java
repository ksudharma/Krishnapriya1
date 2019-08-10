import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://elearning.upskills.in/");
		//synchronization concept
		//explicit wait
		WebDriverWait mywait= new WebDriverWait(driver, 30);
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("admin")));
		//fluent wait
		//check every 5 sec
		//sleep()
		
		
		
		
		

	}

}
