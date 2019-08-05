package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.name("userName"));
		if (username.isEnabled()) {
			username.sendKeys("sunil");
			username.clear();
			username.sendKeys("sunil");
		}
		if(username.isDisplayed()) {
			System.out.println("username is displayed");
		}


	}

}
