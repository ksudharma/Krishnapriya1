import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Sel13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/ ");
		driver.manage().window().maximize();
		//indicates that you are going to execute the code using java script
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//return-->to return, document--->webpage
		//saving in title
		//should always use "executeScript" to execute the script
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		//get url of webpage
		String url= js.executeScript("return document.URL").toString();
		System.out.println(url);
		//get domain of webpage
		String domain= js.executeScript("return document.domain").toString();
		System.out.println(domain);
		//passing value to username field
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		//refresh the page using javascript
		//js.executeScript("history.go(0)");
		//js.executeScript("document.getElementById('txtUsername').value='Admin'");
		//storing a webelement
		//WebElement ele = (WebElement)js.executeScript("document.getElementById('txtUsername')");
		//String value = ele.getAttribute("value");
		//System.out.println(value);
		js.executeScript("document.getElementById('txtPassword').value='admin123'");
		js.executeScript("document.getElementById('btnLogin').click()");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
		//scroll down and scroll up
		//this is x and y coordinates
		//js.executeScript("window.scrollBy(0,400)");
		//this is to scroll to the end of the page
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		//scroll up
		//js.executeScript("window.scrollTo(0,0)");
		//OR
		//js.executeScript("window.scrollTo(0,-600)");
		//OR
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		//scroll to a particular element
		//js.executeScript("document.getElementById('ohrmList_chkSelectRecord_24').scrollIntoView()");
		//print all in console with tagname a--->using webdriver
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Number of links is " + links.size());

		for(WebElement e : links) {
			String AllTinkstext = e.getText();
			System.out.println(AllTinkstext);


		}
		//print all in console with tagname a--->using javascript
		//String Table = js.executeScript("return document.getElementById('resultTable').innerText").toString();
		//to get inner HTML
		String Table = js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
		System.out.println(Table);

		//go back in webdriver
		driver.navigate().back();

		//go back in javascript
		js.executeScript("window.history.back()");

		//go forward in webdriver
		driver.navigate().back();

		//go forward in javascript
		js.executeScript("window.history.forward()");
		
		Thread.sleep(3000);
		//Altert(pop up): simple altert with message---says OK		
		js.executeScript("alert('Welcome to Selenium Training')");
		//Alert:confirm--->says OK or cancel
		js.executeScript("confirm('Enter the Credentials')");
		//Alert prompt--->enter and says OK
		js.executeScript("prompt('Enter the credentials','Enter Yes/NO')");

	}
}