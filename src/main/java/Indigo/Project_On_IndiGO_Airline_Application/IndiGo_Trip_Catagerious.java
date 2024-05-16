package Indigo.Project_On_IndiGO_Airline_Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class IndiGo_Trip_Catagerious 
{
	public WebDriver driver;

	@FindBy(xpath="//li[.='6Exclusive']")
	WebElement exclusive6;
	@FindBy(xpath="//div[@class='important-information']//h3[.='Information Alert']")
	WebElement alert_message_for_exclusive6;
	@FindBy(xpath="//div[@class='important-information__content']//p[.='Your departure date has been revised as 6Exclusive Fare is valid on travel at least 7 days after the booking date.']")
    WebElement message1;
	
	@FindBy(xpath="//div[@class='buttonRight']")
	WebElement ok;
	
	@FindBy(xpath="//li[.='Students']")
	WebElement student;
	@FindBy(xpath="//div[@class='important-information']//h3[.='Information Alert']")
	WebElement alert_message_for_student;
	@FindBy(xpath="//div[@class='important-information__content']//p[.='The special fare for students is only valid on domestic flights.']")
	WebElement student_message;
	
	@FindBy(xpath="//div//ul//li[.='Armed Forces']")
	WebElement armed_forces;
	@FindBy(xpath="//div//p[.='The special fare for armed forces is only valid on domestic flights.']")
	WebElement armed_force_message;
	
	
	@FindBy(xpath="//div/ul//li[.='Doctors & Nurses']")
	WebElement doctor_and_nurses;
	@FindBy(xpath="//div//p[.='The special fare for doctors and nurses fare is valid only on domestic flights.']")
	WebElement doctor_and_nurse_message;
	
	@FindBy(xpath="//div//ul//li[.='Family & Friends']")
	WebElement family_and_friends;
	
	@FindBy(xpath="//div//ul//li[.='Unaccompanied Minor']")
	WebElement unaccompained_minor;
	
		
	
	
	public void exclusive_6() throws InterruptedException
	{
		boolean b =exclusive6.isDisplayed();
		System.out.println("6_exclusive is Displayed :- "+b);
		boolean expected = true;
		Assert.assertEquals(b, expected);
          Thread.sleep(5000);
		exclusive6.click();
		
	    String message =	alert_message_for_exclusive6.getText();
	    System.out.println(message);
		String expected_message ="Information Alert";
	    Assert.assertEquals(message, expected_message);
		
	    String  message_1= message1.getText();
	    System.out.println(message_1);
	    String expected_1 ="Your departure date has been revised as 6Exclusive Fare is valid on travel at least 7 days after the booking date.";
	    Assert.assertEquals(message_1,expected_1);
	    Thread.sleep(5000);
	    ok.click();
	    Reporter.log("clicked on  6_exclusive");
	}
	
	public void armed_Force() throws InterruptedException
	{
		boolean b =armed_forces.isDisplayed();
		System.out.println("Armed Force is Displayed :- "+b);
		boolean expected = true;
		Assert.assertEquals(b, expected);
          Thread.sleep(5000);
       armed_forces.click();
		
	    String message =	alert_message_for_student.getText();
	    System.out.println(message);
		String expected_message ="Information Alert";
	    Assert.assertEquals(message, expected_message);
		
	    String  message_1= armed_force_message.getText();
	    System.out.println(message_1);
	    String expected_1 ="The special fare for armed forces is only valid on domestic flights.";
	    Assert.assertEquals(message_1,expected_1);
	    Thread.sleep(5000);
	    ok.click();
	    Reporter.log("clicked on Armed_Force");
	}
	
	public void doctor_and_nurse() throws InterruptedException
	{
		boolean b =doctor_and_nurses.isDisplayed();
		System.out.println("Doctor and Nurse is Displayed :- "+b);
		boolean expected = true;
		Assert.assertEquals(b, expected);
          Thread.sleep(5000);
          doctor_and_nurses.click();
		
	    String message =	alert_message_for_student.getText();
	    System.out.println(message);
		String expected_message ="Information Alert";
	    Assert.assertEquals(message, expected_message);
		
	    String  message_1= doctor_and_nurse_message.getText();
	    System.out.println(message_1);
	    String expected_1 ="The special fare for doctors and nurses fare is valid only on domestic flights.";
	    Assert.assertEquals(message_1,expected_1);
	    Thread.sleep(5000);
	    ok.click();
	    Reporter.log("clicked on Doctor And Nurse");
	}
	
	public void family_and_friends() throws InterruptedException
	{
		boolean b =family_and_friends.isDisplayed();
		System.out.println("family and friends is Displayed :- "+b);
		boolean expected = true;
		Assert.assertEquals(b, expected);
          Thread.sleep(5000);
          family_and_friends.click();
	    Reporter.log("clicked on Doctor And Nurse");
	}
	
	public void unaccompained_Minor() throws InterruptedException
	{
		boolean b =unaccompained_minor.isDisplayed();
		System.out.println("Unaccompained minor is Displayed :- "+b);
		boolean expected = true;
		Assert.assertEquals(b, expected);
          Thread.sleep(5000);
          unaccompained_minor.click();
	    Reporter.log("clicked on Unaccompained Minor");
	}
	
	public void student() throws InterruptedException
	{
		boolean b =student.isDisplayed();
		System.out.println("Student is Displayed :- "+b);
		boolean expected = true;
		Assert.assertEquals(b, expected);
          Thread.sleep(5000);
		student.click();
		
	    String message =	alert_message_for_student.getText();
	    System.out.println(message);
		String expected_message ="Information Alert";
	    Assert.assertEquals(message, expected_message);
		
	    String  message_1= student_message.getText();
	    System.out.println(message_1);
	    String expected_1 ="The special fare for students is only valid on domestic flights.";
	    Assert.assertEquals(message_1,expected_1);
	    Thread.sleep(5000);
	    ok.click();
	    Reporter.log("clicked on Students");
	}
	
	public IndiGo_Trip_Catagerious(WebDriver driver)
	{
		//div//p[.='The special fare for doctors and nurses fare is valid only on domestic flights.']
		PageFactory.initElements(driver, this);
	}
}