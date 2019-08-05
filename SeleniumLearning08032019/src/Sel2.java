import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel2 {

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
		//get all the values from the dropdown
		List<WebElement> options = sel.getOptions();
		//printing size of the drodpwn
		System.out.println(options.size());
		//print all options in a dropdown
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
		//Select the value from the dropdown(3 methdds)
		
		sel.selectByIndex(0);
		String options1= driver.findElement(By.name("passCount")).getAttribute("value");
		System.out.println("The selected values is " + options1);
		Thread.sleep(2000);
		sel.selectByValue("2");
		Thread.sleep(2000);
		sel.selectByVisibleText("3");
		
		//selecting another radio button
		driver.findElement(By.xpath("//input[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
				
		

	}

}
