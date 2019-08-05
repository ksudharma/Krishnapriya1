import javax.swing.plaf.synth.SynthSliderUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//saving in WebElement
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("sunil");
		//saving attribute in String
		String UN=username.getAttribute("value");	
		//printing attribute value
		System.out.println(UN);
		driver.findElement(By.name("password")).sendKeys("sunil");
		String getText=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font")).getText();
		System.out.println(getText);
		//driver.findElement(By.name("login")).click();		
		//Thread.sleep(2000);			
		
		String getText1=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a")).getText();
		System.out.println(getText1);
		
		
	}
	

}
