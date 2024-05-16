package Indigo.Project_On_IndiGO_Airline_Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class IndiGo_Seat_Selection 
{
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='widget-container__filter-bar__pax-selection']")
	WebElement increment_persons;
	
	@FindBy(xpath="(//button[@class='stepper-input__btn stepper-input__btn--plus'])[1]")
	WebElement increse_adults_1;

	@FindBy(xpath="(//div[@class='add-seat-accordion__head'])[1]")
	WebElement add_double_or_triple_seat_for_adults;
	@FindBy(xpath="(//select[@class='add-seat-accordion__body__row__right__select'])[1]")
	WebElement double_seat_for_adult;
	@FindBy(xpath="(//select[@class='add-seat-accordion__body__row__right__select'])[1]//option[@value='2 Double Seat']")
	WebElement select_double_seat_value;
	@FindBy(xpath="(//select[@class='add-seat-accordion__body__row__right__select'])[2]")
	WebElement triple_seat_for_adult;
	@FindBy(xpath="(//select[@class='add-seat-accordion__body__row__right__select'])[2]")
	WebElement triple_seat_for_adult_value;
	
	//-----------------------------------------------------------------
	
	@FindBy(xpath="(//button[@class='stepper-input__btn stepper-input__btn--plus'])[2]")
	WebElement increse_senior_citizens_1;
	
	@FindBy(xpath="//div[@class='important-information']//h3[.='Information Alert']")
	WebElement alert;
	
	@FindBy(xpath="//div//p[.='This fare is only valid on domestic flights and cannot be clubbed with any special fares.']")
	WebElement alert_passage;
	
	@FindBy(xpath="//div[@class='buttonRight']")
	WebElement ok_1;
	
	@FindBy(xpath="(//div[@class='add-seat-accordion__body__row__right'])[1]")
	WebElement add_double_seat_for_scenior;
	
	@FindBy(xpath="(//div[@class='add-seat-accordion__head'])[2]")
	WebElement add_triple_seat_for_senior;
	@FindBy(xpath="(//div[@class='add-seat-accordion__body__row__right'])[2]")
	WebElement select_triple_seat;
	
	@FindBy(xpath="(//div[@class='add-seat-accordion__body__row__right'])[2]//option[@value='1 Triple Seats']")
	WebElement value_for_senior_triple_seat;
	//--------------------------------------------------------------------------
	@FindBy(xpath="(//button[@class='stepper-input__btn stepper-input__btn--plus'])[3]")
	WebElement increse_childrens_1;
	@FindBy(xpath="(//div[@class='add-seat-accordion__head'])[3]")
	WebElement add_double_or_triple_seat_for_childrens;
	
	@FindBy(xpath="(//button[@class='stepper-input__btn stepper-input__btn--plus'])[4]")  
	WebElement increse_infants_1;
	
	
	public void adults() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean b =increment_persons.isDisplayed();
		System.out.println("Increment button is visible :- "+b);
		Assert.assertEquals(b, true);
		increment_persons.click();
	    Reporter.log("Clicked on the Increment Persons");
		Thread.sleep(3000);
		increse_adults_1.click();
		Reporter.log("Successfully increment the Adult from 1 to 2");
		add_double_or_triple_seat_for_adults.click();
		Reporter.log("Clicked on Drop down of Adults");
		double_seat_for_adult.click();
		Reporter.log("Clicked on the double seat drop down for Adults");
		select_double_seat_value.click();
		Reporter.log("Successfully Added the Double seat");
		Thread.sleep(3000);
		add_double_or_triple_seat_for_adults.click();
	}
	
	public void seniour_citizens() throws InterruptedException
	{
		increse_senior_citizens_1.click();
		Thread.sleep(3000);
		String actual_message =alert.getText();
	    System.out.println(actual_message);
	    String Expected_message="Information Alert";
	    Assert.assertEquals(actual_message,Expected_message);
	    Thread.sleep(3000);
	    Reporter.log("Done Assertion on the Alert message ");
	    String actual_passage=    alert_passage.getText();
	    System.out.println(actual_passage);
	    String Expected_passage ="This fare is only valid on domestic flights and cannot be clubbed with any special fares.";
	    Assert.assertEquals(actual_passage, Expected_passage);
	    Thread.sleep(3000);
	    Reporter.log("Done Assertion on the Alert Passage");
	    ok_1.click();
	    Thread.sleep(3000);
	    increment_persons.click();
	 Reporter.log("Again Clicked on the increase person");
	    Thread.sleep(3000);
	    add_triple_seat_for_senior.click();
	    Thread.sleep(3000);
	    select_triple_seat.click();
	    Thread.sleep(5000);
	    value_for_senior_triple_seat.click();
	    Thread.sleep(5000);
	    add_triple_seat_for_senior.click();
	}
	
	@FindBy(xpath="//div[@class='add-seat-accordion__body__row__right']")
	WebElement double_seat_for_child;
	@FindBy(xpath="//div[@class='add-seat-accordion__body__row__right']//option[@value='1 Double Seat']")
	WebElement select_double_seat_for_child;
	public void children() throws InterruptedException
	{
		increse_childrens_1.click();
		Reporter.log("Sucessfully Increment on the child");
		Thread.sleep(3000);
		add_double_or_triple_seat_for_childrens.click();
		Thread.sleep(3000);
		double_seat_for_child.click();
		Reporter.log("Successfully incremented children");
		Thread.sleep(3000);
		select_double_seat_for_child.click();
		Reporter.log("Selected double seat for children");
		
	}
	public void infant() throws InterruptedException
	{
		increse_infants_1.click();
		Reporter.log("Successfully increment on the Infants");
	    Thread.sleep(3000);
	   
	    
	}
	
	
	public IndiGo_Seat_Selection(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}