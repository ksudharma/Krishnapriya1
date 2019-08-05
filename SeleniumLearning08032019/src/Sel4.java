import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/ ");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Performance")).click();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Number of links is " + links.size());
		for(WebElement e : links) {
			String AllTinkstext = e.getText();
			System.out.println(AllTinkstext);
			
		}
		
	}

}
