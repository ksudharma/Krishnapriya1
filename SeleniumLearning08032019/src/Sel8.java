import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Sel8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		
	}

}
