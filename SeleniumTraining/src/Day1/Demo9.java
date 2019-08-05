package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");	
		String ExpectedTitle="OrangeHRM";
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[2]/input")).sendKeys("Admin");		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[3]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//form/div[5]/input")).click();
		Thread.sleep(3000);
		//Refresh the page
		driver.navigate().refresh();
		String ActualTitle=driver.getTitle();
		if(ActualTitle.equals(ExpectedTitle)){

			System.out.println(ActualTitle);
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']//ul/li[3]/a")).click();

		}
		else {
			System.out.println("Title is wrong");
		}
	}

}
