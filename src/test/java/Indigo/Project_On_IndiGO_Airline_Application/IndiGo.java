package Indigo.Project_On_IndiGO_Airline_Application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IndiGo 
{

	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.goindigo.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.navigate().refresh();
		
		WebElement add_0 = driver.findElement(By.xpath("//span[@id='salePopupCloseBtn']"));
		add_0.click();
		
		WebElement  add_1_frame = driver.findElement(By.xpath("//iframe[@id='cx-iframe']"));
		driver.switchTo().frame(add_1_frame);
		Thread.sleep(5000);
		WebElement add_1 = driver.findElement(By.xpath("//div[@class='MuiBox-root css-pori7h']"));
		add_1.click();
		driver.switchTo().defaultContent(); 
		Thread.sleep(5000);
		WebElement add_2 = driver.findElement(By.xpath("//a[@aria-label='Close this dialog window']"));
		add_2.click();
		
		Thread.sleep(5000);
		WebElement login =	driver.findElement(By.xpath("(//div//a//span[.='Login'])[1]"));
	    
		Actions a = new Actions(driver);
		a.click(login).perform();
	    
	    Thread.sleep(5000);
	WebElement customer =	driver.findElement(By.xpath("//div//ul//li//a[.='Customer Login']"));
	customer.click();
	
	Thread.sleep(5000);
	WebElement username =	driver.findElement(By.xpath("//input[@placeholder='Mobile No.']"));
	username.sendKeys("9182826091");
	
	Thread.sleep(5000);
	WebElement password =	driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys("PavanKumar@999");
	
	Thread.sleep(5000);
	WebElement login_1 =	driver.findElement(By.xpath("(//span[@class='custom-button__label'])[1]"));
	login_1.click();
	
	
	
		
	}
}
