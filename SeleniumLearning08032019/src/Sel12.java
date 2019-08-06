import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Sel12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		//trying to get the parent window in a string
		String parentwindow = driver.getWindowHandle();
		//printing the id of the parent window
		System.out.println("id of parent window is " + parentwindow);
		//identifying the button which opens the child browser and storing it in a webelement
		WebElement clickbutton = driver.findElement(By.id("button1"));
		//it will open the child window 3 times
		for(int i=0;i<3;i++) {
			clickbutton.click();
			Thread.sleep(2000);
		}
		
		//trying to get all the window IDs
		
		ArrayList<String> childwindow= new ArrayList<>(driver.getWindowHandles());
		System.out.println("childwindow is  " + childwindow);
		
		String lastwindow="";
		//to switch between by child window
		for(int i=1;i<childwindow.size();i++) {
			driver.switchTo().window(childwindow.get(1));
			//driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			//it will identify the last window handle
			lastwindow=childwindow.get(i).toString();
		}
		driver.switchTo().window(parentwindow);
		driver.navigate().to("http://newtours.demoaut.com/");
		String Titleparent=driver.getTitle();
		System.out.println(Titleparent);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(lastwindow);
		driver.get("https://opensource-demo.orangehrmlive.com/ ");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
