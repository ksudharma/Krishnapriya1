package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/ ");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String ExpectedTitle="OrangeHRM";
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		String ActualTitle= driver.getTitle();
		System.out.println(ActualTitle);
		if(ExpectedTitle.equals(ActualTitle)) {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Welcome Admin")).click();			
			//driver.findElement(By.linkText("Logout")).click();
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			//this will close the opened instance of the browser but it will close only one browser.
			driver.close();
			//if u want to close multiple browser opened through instance
			//driver.quit();
				
		}
		else {
			System.out.println("Title is wrong");
		}
		
			

	}

}
