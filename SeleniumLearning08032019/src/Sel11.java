import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//opens in a new tab
		//to click on multiple keys together
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		//switch to other tab
		Thread.sleep(3000);
		//i want to find out how many tabs are there
		//getwindowhandles-->will fetch all the parent window/parent tab and child tabs
		//getwindowhandle--->will fetch the parent window/parent tab
		ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
		System.out.println("tabs --->" + tabs.size());
		//to switch to the 2nd tab and get the title
		driver.switchTo().window(tabs.get(1));
		String title= driver.getTitle();
		System.out.println(title);
		//to switch to the 1st tab and get the title
		driver.switchTo().window(tabs.get(0));
		String title1= driver.getTitle();
		System.out.println(title1);
		

	}

}
