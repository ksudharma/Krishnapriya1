import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		//storing title of the page in a variable
		String UnderConstructionTitle= "Under Construction: Mercury Tours";
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		//storing the size of links in linkText
		String[] linkText = new String[links.size()];
		int i=0;
		//Extract the link text of each link element
		for(WebElement e : links) {
			linkText[i]=e.getText();
			i++;
		}

		//Test whether each link is working or not
		for(String t: linkText) {
			driver.findElement(By.linkText(t)).click();
			Thread.sleep(2000);
			if(driver.getTitle().equals(UnderConstructionTitle)) {
				System.out.println("\"" + t + "\" + under construction");
			}
			else {
				System.out.println("\"" + t + "\" + is working");
			}

			driver.navigate().back();
		}

		driver.close();


	}

}




