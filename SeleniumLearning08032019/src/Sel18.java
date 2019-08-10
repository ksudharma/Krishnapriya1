import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel18 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\Jar files\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		//give the url of html file.give doube slash
		driver.get("file:///C://AT&T%20Project//Selenium%20Automation%20Training//Example1.html.html");
		driver.manage().window().maximize();
		//getting text of element
		String phonenum= driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
		System.out.println(phonenum);
		//getting following sibling of previous phonenum
		String phonenumFollowing= driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]//following-sibling::td")).getText();
		System.out.println(phonenumFollowing);
		//getting preceeding sibling of previous phonenum
		String phonenumpreceding= driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]//preceding-sibling::td[1]")).getText();
		System.out.println(phonenumpreceding);
		
		
		
		
		

		
		
	}

}
