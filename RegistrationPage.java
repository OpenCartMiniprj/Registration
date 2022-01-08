import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open Website
		driver.get("http://localhost/Opencart");
		try
		{
			//Open my account option
			//div[@id='top-links']/ul/li[2]/a
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
			
			//Open register module
			Thread.sleep(2000);
			driver.findElement(By.linkText("Register")).click();
			
			//Fill the data
			driver.findElement(By.id("input-firstname")).sendKeys("Pramila");
			Thread.sleep(2000);
			Alert alert=driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();
			
			driver.findElement(By.id("input-lastname")).sendKeys("Dey");
			Thread.sleep(2000);
//			Alert alert1=driver.switchTo().alert();
//			Thread.sleep(2000);
//			alert1.accept();
			
			driver.findElement(By.id("input-email")).sendKeys("Pramila@gmail.com");
			Thread.sleep(2000);
//			Alert alert2=driver.switchTo().alert();
//			Thread.sleep(2000);
//			alert2.accept();
			
			driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
			Thread.sleep(2000);
//			Alert alert3=driver.switchTo().alert();
//			Thread.sleep(2000);
//			alert3.accept();
			
			
			driver.findElement(By.id("input-password")).sendKeys("Pramila");
			Thread.sleep(2000);
//			Alert alert4=driver.switchTo().alert();
//			Thread.sleep(2000);
//			alert4.accept();
			
			driver.findElement(By.id("input-confirm")).sendKeys("Pramila");
			Thread.sleep(2000);
//			Alert alert5=driver.switchTo().alert();
//			Thread.sleep(2000);
//			alert5.accept();
			
			driver.findElement(By.xpath("(//input[@name='newsletter'])[2]")).click();
			Thread.sleep(2000);
//			Alert alert6=driver.switchTo().alert();
//			Thread.sleep(2000);
//			alert6.accept();
			
			driver.findElement(By.name("agree")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			driver.close();
		}
		
		
		
	}

}
