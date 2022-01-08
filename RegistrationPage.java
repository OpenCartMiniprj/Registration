import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open Website
		driver.get("http://localhost/Opencart");
		
		//Open my account option
		//div[@id='top-links']/ul/li[2]/a
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
		
		//Open register module
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		
		//Fill the data
		driver.findElement(By.id("input-firstname")).sendKeys("Pramila");
		driver.findElement(By.id("input-lastname")).sendKeys("Dey");
		driver.findElement(By.id("input-email")).sendKeys("Pramila@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("Pramila");
		driver.findElement(By.id("input-confirm")).sendKeys("Pramila");
		driver.findElement(By.xpath("(//input[@name='newsletter'])[2]")).click();
		driver.findElement(By.name("agree")).click();
		
		
	}

}
