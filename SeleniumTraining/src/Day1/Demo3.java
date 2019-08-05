package Day1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.get("http://newtours.demoaut.com/");
		//i want to store an element in a variable
		WebElement username = driver.findElement(By.name("userName"));
		if(username.isEnabled()) {
			//sending the value to username
			username.sendKeys("sunil");
			username.clear();
			username.sendKeys("sunil");

		}

		if(username.isDisplayed()) {
			//Getattribute whenever we pass value to the edit field
			String un = username.getAttribute("value");
			String un1 = username.getAttribute("name");
			System.out.println(un1);
			//gettext--->label,dropdown,links
			//Getattribute --->editbox where we pass value and if any element attribute is dynamic in nature
			
			String text = driver.findElement(By.xpath("//*[contains(text(),'Name')]")).getText();
			System.out.println(text);
			System.out.println(un);
			
		}
		
		

		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			//work with radio button
			driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).click();
		}
		
		//storing an element which is dropdown in a variable
		WebElement DD= driver.findElement(By.name("passCount"));
		//select is going to click on the dropdown
		Select se1= new Select(DD);
		//get all the values from the dropdown
		/*List<WebElement> options= se1.getOptions();
		System.out.println(options.size());
		
		for(int i=0;i<options.size;i++) {
			System.out.println(options.get(i).getText);
		}
		
		//select the value from the dropdown
		se1.selectByValue("2");
		Thread.sleep(3000);
		se1.selectByVisibleText("3");
		Thread.sleep(3000);
		se1.selectByIndex(3);
		*/

	}
	
		

}
