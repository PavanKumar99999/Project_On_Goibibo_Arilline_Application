package Indigo.Project_On_IndiGO_Airline_Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class IndiGo_Trip_Catagerious_1 
{
	public WebDriver driver;
	
	@FindBy(xpath="//div//button//span[.='Special fares']")
    WebElement special_fares;	
	
	@FindBy(xpath="//div[@id='special-fare-dropdown']//div[@class='cmp-custom-drop-down__options']//ul//li[@data-value='DFN']//span[.='Armed Forces']")
	WebElement arm_force;
	
	@FindBy(xpath="//div[@id='special-fare-dropdown']//div[@class='cmp-custom-drop-down__options']//ul//li[@data-value='MEDICAL']//span[.='Doctors & Nurses']")
	WebElement doctor_and_nurse;
	
	@FindBy(xpath="//div[@id='special-fare-dropdown']//div[@class='cmp-custom-drop-down__options']//ul//li[@data-value='FNF']//span[.='Family & Friends']")
	WebElement family_and_friend;
	
	@FindBy(xpath="//div[@id='special-fare-dropdown']//div[@class='cmp-custom-drop-down__options']//ul//li[@data-value='UMNR']//span[.='Unaccompanied Minor']")
	WebElement unaccompanied_minor;
	
	@FindBy(xpath="//div[@id='special-fare-dropdown']//div[@class='cmp-custom-drop-down__options']//ul//li[@data-value='STU']//span[.='Students']")
	WebElement students;
	
	@FindBy(xpath="//div[@id='special-fare-dropdown']//div[@class='cmp-custom-drop-down__options']//ul//li[@data-value='VAXI']//span[.='6Exclusive']")
	WebElement exclusive_6;
	
	@FindBy(xpath="//div//button[@data-flk-success='atNodeInserted53']//span")
	WebElement modify_button;
	
	public void fares() throws InterruptedException
	{
		Thread.sleep(3000);
		special_fares.click();
		Reporter.log("Clicked on the Fares");
		
	}

	public void arm_forces() throws InterruptedException
	{
		
		Thread.sleep(3000);
		arm_force.click();
		Thread.sleep(3000);
	    Reporter.log("Clicked on the Arm_Force");
	    Thread.sleep(6000);
	}
	
	public void unaccompanied_Minor() throws InterruptedException
	{
		Thread.sleep(3000);
		unaccompanied_minor.click();
	    Reporter.log("Clicked on the Unaccompanied Minor");
	    Thread.sleep(6000);
	}
		
	
	public void student() throws InterruptedException
	{
		Thread.sleep(3000);
		students.click();
	    Reporter.log("Clicked on the Students");
	    Thread.sleep(6000);
	  
	}
	
	public void exclusive6() throws InterruptedException
	{
		Thread.sleep(3000);
		exclusive_6.click();
	    Reporter.log("Clicked on the 6exclusive");
	    Thread.sleep(6000);
	  
	}
	
	
	public void doctor_And_Nurse() throws InterruptedException
	{
		Thread.sleep(3000);
		doctor_and_nurse.click();	
	Reporter.log("Clicked on the Doctor and Nurse");
	Thread.sleep(6000);
	}
	
	public void family_and_Friends() throws InterruptedException
	{
		Thread.sleep(3000);
		family_and_friend.click();	
	Reporter.log("Clicked on the Family and Friend");
	Thread.sleep(6000);
	}

	public void modify() throws InterruptedException
	{
		Thread.sleep(3000);
	  boolean b =	modify_button.isDisplayed();
	  System.out.println("Modify buton is Displayed :- "+b);	
      Assert.assertEquals(b, true);
          modify_button.click();
      Reporter.log("Clicked on the modify button");
      Thread.sleep(5000);
	}
	
	
	

	public IndiGo_Trip_Catagerious_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}