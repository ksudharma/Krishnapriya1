import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Sel7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.navigate().to("http://newtours.demoaut.com/");
		WebElement links= driver.findElement(By.linkText("Cruises"));
		//Actions
		Actions MH=new Actions(driver);
		//mouse over on cruises
		Action mouseover= MH.moveToElement(links).build();
		//move the mouse to that element
		Thread.sleep(3000);
		mouseover.perform();
		//click enter from the keyboard
		MH.sendKeys(links,(Keys.ENTER)).perform();
		//or this is also used to click enter from the keyboard
		MH.sendKeys(links,(Keys.RETURN)).perform();
		
		

	}

}
