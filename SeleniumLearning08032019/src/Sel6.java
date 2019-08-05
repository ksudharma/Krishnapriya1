import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		//1st navigation method
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("Cruises")).click();
		//2nd navigation method
		//It will click on back
		driver.navigate().back();
		Thread.sleep(3000);
		//3rd navigation method
		driver.navigate().forward();
		Thread.sleep(3000);
		//4th navigation method
		driver.navigate().refresh();
	}

}
