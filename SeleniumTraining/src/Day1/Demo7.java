package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo7{
	
public static void main(String args[]){
	System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get(www.google.com) ;
	
}
}