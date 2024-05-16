package Indigo.Project_On_IndiGO_Airline_Application;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.Fetch_User_Details;

public class IndiGo_Main_Page extends Fetch_User_Details
{
public 	WebDriver driver;
//step 1
 	@FindBy(xpath="(//a[@class='skyplus6e-header__link-no-mobile'])[4]")
 	WebElement login;
 	
 	@FindBy(xpath="//div//ul//li//a[.='Customer Login']")
 	WebElement customer_login;
 	
 	@FindBy(xpath="(//a[.='Sign Up'])[2]")
 	WebElement signup;
 	
 	@FindBy(xpath="//input[@name='txtOTPMobile']")
 	WebElement mobilenumber;
 	
 	@FindBy(xpath="(//button[@type='submit'])[1]")
 	WebElement send_otp;
 	
 	@FindBy(xpath="//span[@id='salePopupCloseBtn']")
 	WebElement Add_0;
 	
 	@FindBy(xpath="//iframe[@id='cx-iframe']")
 	WebElement Frame;
 	@FindBy(xpath="//i[@class='ri-subtract-line']")
 	WebElement Add_1;
 	
 	@FindBy(xpath="//a[@aria-label='Close this dialog window']")
	WebElement Add_2;
 	
 	@FindBy(xpath="//i[@class='icon-hamburger']")
	WebElement icon;
	
 	@FindBy(xpath="//span[@class='skyplus6e-header__hamburger-login-signup-button--loggedin__button__initial']")
 	WebElement customer_name;
 	
	@FindBy(xpath="//button[@aria-label='Close hamburger menu']")
	WebElement close_button;
	
	@FindBy(xpath="//div[@class='notifi-variation-container']//h5[.='Error']")
	WebElement error_popup;
	
	@FindBy(xpath="//button[@aria-label='Login/Signup']//span[.='Login/SignUp']")
    WebElement login_signup; 	

	//step 2
 	public void add_0() throws InterruptedException
 	{
 		Thread.sleep(3000);
        Add_0.click();
 	}
 	public void add_1(WebDriver driver) throws InterruptedException
 	{
 		driver.switchTo().frame(Frame);
 		Add_1.click();
 		Thread.sleep(3000);
 		driver.switchTo().defaultContent();
 	}
 	public void add_2() throws InterruptedException
 	{
 		Add_2.click();
 		Thread.sleep(3000);
 	}
 	
 	public void forword_page(WebDriver driver) throws InterruptedException
 	{
 		driver.navigate().forward();
 		Thread.sleep(5000);
 	}
 	public void refresh_page(WebDriver driver) throws InterruptedException
 	{
 		driver.navigate().refresh();
 		Thread.sleep(5000);
 	}
 	public void backword_page(WebDriver driver) throws InterruptedException
 	{
 		driver.navigate().back();
 		Thread.sleep(5000);
 	}
 	
 	public void click_on_login(WebDriver driver) throws InterruptedException
 	{
 		
 		Thread.sleep(3000);
 		String main_title =driver.getTitle();
 		Actions a = new Actions(driver);
 	a.moveToElement(login).perform();
 	Thread.sleep(5000);
 	customer_login.click();
 	customer_login.click();
 	String expected_title=driver.getTitle();
    
 	Reporter.log("Clicking on Customer login");
 	}
 
 	public void new_user() throws InterruptedException
 	{
 		boolean b=	signup.isDisplayed();
 	 	System.out.println(b);
 	 	Assert.assertEquals(b, true);
 	 	signup.click();
 	 	Thread.sleep(3000);
 	 	Reporter.log("clicking on Sign Up");
 	}

 	public void register_through_mobilenumber(WebDriver driver) throws InterruptedException
 	{
 		Thread.sleep(5000);
 		mobilenumber.sendKeys(Username);
 		Thread.sleep(3000);
 		send_otp.click();
 		boolean b =send_otp.isDisplayed();
 		System.out.println(b);
 		Assert.assertEquals(b, true);
 		Reporter.log("Entered OTP");
 		Thread.sleep(3000);
 		driver.navigate().back();
 	}
 	public String login_Signup() throws InterruptedException
 	{
 		Thread.sleep(3000);
 		icon.click();
 		Thread.sleep(3000);
 		String name =login_signup.getText();
 		System.out.println(name);
 	return name;
 	}
 	
 	public String customer() throws InterruptedException
 	{
 		icon.click();
 		String name =customer_name.getText();
 		System.err.println("Return type is String "+name);
     	Assert.assertEquals(name, name);
     	Thread.sleep(5000);
     	close_button.click();
 	return name;
 	}
 
 	//step 3
 	public IndiGo_Main_Page(WebDriver driver)
 	{
 		PageFactory.initElements(driver,this);
 	}
 	
}