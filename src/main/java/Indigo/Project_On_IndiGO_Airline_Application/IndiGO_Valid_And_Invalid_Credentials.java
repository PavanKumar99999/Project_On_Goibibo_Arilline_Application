package Indigo.Project_On_IndiGO_Airline_Application;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.Fetch_User_Details;

public class IndiGO_Valid_And_Invalid_Credentials extends Fetch_User_Details
{
	WebDriver driver;
	
	//step 1
	@FindBy(xpath="//input[@placeholder='Mobile No.']")
	WebElement username_1;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password_1;
	
	@FindBy(xpath="(//span[@class='custom-button__label'])[1]")
	WebElement click_1;
	
	@FindBy(xpath="//i[@class='icon-hamburger']")
	WebElement icon;
	
	@FindBy(xpath="//span[@class='skyplus6e-header__hamburger-login-signup-button--loggedin__button__name']")
 	WebElement customer_name;
	
	@FindBy(xpath="//button[@aria-label='Close hamburger menu']")
	WebElement close_button;
	
	@FindBy(xpath="(//li[@class='skyplus6e-header__hamburger-menu-item-inner link-login-user'])[2]")
	WebElement sign_out_1;
	
	@FindBy(xpath="//div[@class='skyplus6e-header__link-loggedin-container']")
	WebElement user;
	
	@FindBy(xpath="(//span[.='Log out'])[1]")
    WebElement signout;
	
	@FindBy(xpath="//div[@class='notifi-variation-container']//h5[.='Error']")
	WebElement error_popup;
	
	@FindBy(xpath="(//button//span[.='P'])[1]")
	WebElement uname;
	
	@FindBy(xpath="(//div//a//span[.='Login'])[1]")
	WebElement login_1;
	
	
	//step 2
	public void valid_username() throws InterruptedException
 	{
		
		username_1.sendKeys(Username);
		System.out.println(Username);
		Thread.sleep(3000);
		Reporter.log("Entering valid user name");
	}
	
	public void valid_password() throws InterruptedException
	{
		password_1.sendKeys(password);
		System.out.println(password);
		Thread.sleep(3000);
		Reporter.log("Entering valid password");
	}
	
	public void invalid_username() throws InterruptedException
	{
		username_1.sendKeys(Invalid_username);
		Thread.sleep(3000);
		Reporter.log("Entering invalid user name");
		
	}
	public void invalid_password() throws InterruptedException
	{
		password_1.sendKeys(Invalid_password);
		Thread.sleep(3000);
		Reporter.log("Entering invalid password");
	}
	
	public void verify_Login(WebDriver driver) throws InterruptedException
	{
		click_1.click();
		Reporter.log("Clicking on login button");
		String e = error_popup.getText();
		System.out.println(e);
		if(e.equals("Error"))
		{
			Assert.assertEquals(e, "Error");
			Reporter.log("Successfully Error message came");
			Thread.sleep(3000);
			driver.navigate().refresh();
		}
	}
	
	public void login() throws InterruptedException
	{
		click_1.click();
		Thread.sleep(3000);
		icon.click();
		Thread.sleep(3000);
		String cn =customer_name.getText();
		System.out.println("Customer name is :- "+cn);
		String ecn = "pavan kumar";
		Thread.sleep(3000);
	Assert.assertEquals(cn,ecn);
	Reporter.log("Successfully login");
	close_button.click();
	Thread.sleep(5000);
	
	}
 	public void sign_out_by_scroll_down(WebDriver driver) throws InterruptedException
	{
		icon.click();
		Point p =sign_out_1.getLocation();
	    int x =	p.getX();
		int y = p.getY();
		System.out.println(x+","+y);
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		boolean b = signout.isDisplayed();
		System.out.println("The signout button is displayed "+ b);
		Assert.assertEquals(b, true);
		Reporter.log("Successfully logout from IndiGo WebSite");
		sign_out_1.click();
		Thread.sleep(7000);
	}
 	public void sign_out_by_scroll_down_With_customer_name(WebDriver driver) throws InterruptedException
	{
 		icon.click();
		Point p =sign_out_1.getLocation();
	    int x =	p.getX();
		int y = p.getY();
		System.out.println(x+","+y);
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		boolean b = signout.isDisplayed();
		System.out.println("The signout button is displayed "+ b);
		Assert.assertEquals(b, true);
		Reporter.log("Successfully logout from IndiGo WebSite");
		sign_out_1.click();
		Thread.sleep(7000);
	}
	public void sign_out() throws InterruptedException
	{
		boolean b = user.isDisplayed();
	System.out.println("user profile is displayed"+b);
	Assert.assertEquals(b, true);
	user.click();
	boolean bb =signout.isDisplayed();
	System.out.println("signout button is displayed"+bb);
	Assert.assertEquals(b, true);
	signout.click();
	Reporter.log("successfully logout from the indigo website");
	Thread.sleep(7000);
	}
	
	public void close(WebDriver driver)
	{
		driver.close();
	}
	public void quit(WebDriver driver)
	{
		driver.quit();
	}
	
	public void assert_1()
	{
		String error =error_popup.getText();
	System.out.println(error);
	Assert.assertEquals(error, "Error");
	Reporter.log(" can see the Error pop_up box");
	}
	
	//step 3
public 	 IndiGO_Valid_And_Invalid_Credentials(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}