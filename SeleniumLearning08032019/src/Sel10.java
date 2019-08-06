import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://elearning.upskills.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.name("submitAuth")).click();
		driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
		Thread.sleep(2000);
		//upload the file. path is the path of csv file
		driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\KrishnapriyaSudharma\\Desktop\\data.csv");
		
		
		
	}

}
