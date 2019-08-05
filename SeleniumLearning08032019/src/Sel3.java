import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		if(driver.findElement(By.xpath("//*[@name='tripType'and @value='roundtrip'] ")).isSelected()) {
			driver.findElement(By.xpath("//*[@name='tripType'and @value='oneway']")).click();
		}
		//storing an element which is dropdown in a variable
		WebElement DD= driver.findElement(By.name("passCount"));
		//Select is going to click on the drowpdown
		Select sel= new Select(DD);
		
		//Select the value from the dropdown(3 methods)
		
		sel.selectByIndex(0);
		
		//selecting another radio button
		driver.findElement(By.xpath("//input[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("passFirst0")).sendKeys("KPfirst1");
		driver.findElement(By.name("passLast0")).sendKeys("KPlast1");
		driver.findElement(By.name("creditnumber")).sendKeys("123 456");
		
		//this is to find both the elements using FindElements
		List<WebElement>checkbox= driver.findElements(By.xpath("//*[@name='ticketLess' and @value='checkbox']"));
		System.out.println("size of checkbox is " + checkbox.size());
		
		/*
		//i values given 0,so it has to select both the checkboxes
		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
			
		}
		
		//i values given 1,so it has to select the second checkbox
		for(int i=1;i<checkbox.size();i++) {
			checkbox.get(i).click();
			
		}
		
		*/
		
		//to select only 1st checkbox 
				for(int i=0;i<checkbox.size()-1;i++) {
					checkbox.get(i).click();
					
				}	
		
		
		//This for loop to click on both the checkboxes
		/*for(WebElement e:checkbox) {
			e.click();
		}
		*/
				
		driver.findElement(By.name("buyFlights")).click();
		
		
		
		
				
		
				
		

	}

}
