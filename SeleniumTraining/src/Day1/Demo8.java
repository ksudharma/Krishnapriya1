package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//Absolute xpath for Username
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[2]/input")).sendKeys("Admin");
		//Absolute xpath for password
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[3]/input")).sendKeys("admin123");
		//Relative xpath for login button
		driver.findElement(By.xpath("//form/div[5]/input")).click();
		Thread.sleep(3000);
		//relative xpath syntax1--->click on assign leave link
		driver.findElement(By.xpath("//span[@class='quickLinkText']")).click();
		//relative xpath syntax2--->Enter employee name
		driver.findElement(By.xpath("//*[@id='assignleave_txtEmployee_empName']")).sendKeys("KP");
		
				

		
		
		
		
	}

}
