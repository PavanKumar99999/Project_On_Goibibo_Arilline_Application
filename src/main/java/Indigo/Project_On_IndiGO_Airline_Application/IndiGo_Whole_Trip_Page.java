package Indigo.Project_On_IndiGO_Airline_Application;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class IndiGo_Whole_Trip_Page 
{
	WebDriver driver;
	
@FindBy(xpath="(//div[@class='cmp-custom-drop-down   '])[1]")
WebElement drop_down;

@FindBy(xpath="//li[@data-value='oneWay']")
WebElement one_way;

@FindBy(xpath="//li[@data-value='roundTrip']")
WebElement round_trip;

@FindBy(xpath="(//div[@class='cmp-custom-drop-down   '])[2]")
WebElement number_of_persons;

@FindBy(xpath="(//div[@class='stepper-input']//button[@class='stepper-input__btn stepper-input__btn--plus'])[1]")
WebElement increment_persons;

@FindBy(xpath="//button[@class='custom-button pax-dropdown__action__done']//span[@class='custom-button__label']")
WebElement done;



@FindBy(xpath="//input[@placeholder='From']")
WebElement from;

@FindBy(xpath="//input[@placeholder='To']")
WebElement to;

@FindBy(xpath="//input[@placeholder='Travel Dates']")
WebElement travel_dates;

@FindBy(xpath="//div[@aria-label='Choose Monday, May 27th, 2024']")
WebElement starting_date;

@FindBy(xpath="//input[@placeholder='Add return trip']")
WebElement return_click;

@FindBy(xpath="//div[@aria-label='Choose Friday, May 31th, 2024']")
WebElement end_date;

@FindBy(xpath="(//button[@class='cmp-custom-drop-down__btn'])[3]")
WebElement select_currency;

@FindBy(xpath="//li[@data-value='INR']//span[.='Indian Rupee']")
WebElement country_currency;

@FindBy(xpath="(//button[@type='button'])[15]//span")
WebElement search_button;

//-----------------------------------------------------------------------------------------------------

@FindBy(xpath="//ul//li[3]//span[.='Multi City']")
WebElement multi_city;

@FindBy(xpath="//div[@id='1']//button[@class='custom-button ']//i[@class='icon-plus']")
WebElement add_city;

@FindBy(xpath="//div[@id='0']//input[@placeholder='From']")
WebElement first_row_from;

@FindBy(xpath="//div[@id='0']//input[@placeholder='To']")
WebElement first_row_to;

@FindBy(xpath="//div[@id='0']//div[@class='widget-modify__container__date']//div[@id='travel-dates-container']")
WebElement first_row_departure;

@FindBy(xpath="//div[@id='0']//div[@class='widget-modify__container__date']//div[@id='travel-dates-container']//div[@aria-label='Choose Saturday, April 27th, 2024']")
WebElement first_row_date;

@FindBy(xpath="//div[@id='0']//div[@class='widget-modify__container__grandChildRow']//div[@class='widget-modify__container__paxType']")//button[@fdprocessedid='quwr8g']
WebElement increment_button;

@FindBy(xpath="(//div[@class='stepper-input']//button[@class='stepper-input__btn stepper-input__btn--plus'])[5]")
WebElement adult;

@FindBy(xpath="(//div[@class='pax-dropdown__action']//button[@class='custom-button pax-dropdown__action__done'])[2]")
WebElement done_for_multi;



@FindBy(xpath="//div[@id='1']//input[@placeholder='From']")
WebElement second_row_from;

@FindBy(xpath="//div[@id='1']//input[@placeholder='To']")
WebElement second_row_to;

@FindBy(xpath="//div[@id='1']//div[@class='widget-modify__container__date']//div[@id='travel-dates-container']")
WebElement second_row_departure;

@FindBy(xpath="//div[@id='1']//div[@class='widget-modify__container__date']//div[@id='travel-dates-container']//div[@aria-label='Choose Saturday, May 11th, 2024']")
WebElement second_row_date;

@FindBy(xpath="//div[@id='2']//input[@placeholder='From']")
WebElement third_row_from;

@FindBy(xpath="//div[@id='2']//input[@placeholder='To']")
WebElement third_row_to;

@FindBy(xpath="//div[@id='2']//div[@class='widget-modify__container__date']//div[@id='travel-dates-container']")
WebElement third_row_departure;

@FindBy(xpath="//div[@id='2']//div[@class='widget-modify__container__date']//div[@id='travel-dates-container']//div[@aria-label='Choose Saturday, May 25th, 2024']")
WebElement third_row_date;

@FindBy(xpath="(//div[@id='0']//div[@class='cmp-custom-drop-down  as-input '])[2]")
WebElement fare_for_multi;

@FindBy(xpath="//div//ul//li[@data-value='DFN']")
WebElement armedforce_for_multi;

@FindBy(xpath="//div[@class='widget-modify__container__submit']//button[@type='button']")
WebElement search_for_multi_city;



public void one_way_trip(String From,String To) throws InterruptedException
{
	drop_down.click();
	Reporter.log("clicked on drop down ");
	String oneway =one_way.getText();
	System.out.println(oneway);
	String Expected = "One Way";
	Assert.assertEquals(oneway, Expected);
	Reporter.log("Done with Asssertion for One Way Trip");
	Thread.sleep(3000);
	one_way.click();
	Reporter.log("clicked on One Way Trip");
	Thread.sleep(3000);
	number_of_persons.click();
	Reporter.log("clicked on number of passenger");
	Thread.sleep(5000);
	increment_persons.click();
	Reporter.log("incremented number of passengers from 1 to 2");
	Thread.sleep(3000);
	done.click();
	Reporter.log("clicked on Done");
	
	boolean b =from.isDisplayed();
	System.out.println("The 'from' Text filed is displayed :- "+b);
	Assert.assertEquals(b, true);
	Reporter.log("done with assertion on from text field");
	
	from.sendKeys(Keys.CONTROL+"a" +Keys.BACK_SPACE);
	Thread.sleep(3000);
	from.clear();
	Thread.sleep(3000);
	from.sendKeys(From);
	Reporter.log("Successfully sending the text in the FROM text filed");
	Thread.sleep(3000);
    
	to.sendKeys(Keys.CONTROL+"a" +Keys.BACK_SPACE);
	Thread.sleep(3000);
    to.clear();
	to.sendKeys(To);
	Reporter.log("Successfully sending the text in the TO text filed");
	Thread.sleep(3000);

	travel_dates.click();
	Reporter.log("clicked on travelling date");
	Thread.sleep(3000);

	starting_date.click();
	Reporter.log("date selected");
	Thread.sleep(3000);
	
	select_currency.click();
	Reporter.log("Select one country currency from dropdown");
	Thread.sleep(3000);
	
	country_currency.click();
	Reporter.log("Selected the indian currency from dropdown");
	Thread.sleep(3000);
	
	search_button.click();
	Thread.sleep(5000);
	Reporter.log("clicked on the search button");	
}
public void one_way_trip_with_out_date(String From,String To) throws InterruptedException
{
	drop_down.click();
	Reporter.log("clicked on drop down ");
	String oneway =one_way.getText();
	System.out.println(oneway);
	String Expected = "One Way";
	Assert.assertEquals(oneway, Expected);
	Reporter.log("Done with Asssertion for One Way Trip");
	Thread.sleep(3000);
	one_way.click();
	Reporter.log("clicked on One Way Trip");
	Thread.sleep(3000);	
	boolean b =from.isDisplayed();
	System.out.println("The 'from' Text filed is displayed :- "+b);
	Assert.assertEquals(b, true);
	Reporter.log("done with assertion on from text field");
	
	from.sendKeys(Keys.CONTROL+"a" +Keys.BACK_SPACE);
	Thread.sleep(3000);
	from.clear();
	Thread.sleep(3000);
	from.sendKeys(From);
	Reporter.log("Successfully sending the text in the FROM text filed");
	Thread.sleep(3000);
    
	to.sendKeys(Keys.CONTROL+"a" +Keys.BACK_SPACE);
	Thread.sleep(3000);
    to.clear();
	to.sendKeys(To);
	Reporter.log("Successfully sending the text in the TO text filed");
	Thread.sleep(3000);

	travel_dates.click();
	Reporter.log("clicked on travelling date");
	Thread.sleep(3000);

	starting_date.click();
	Reporter.log("date selected");
	Thread.sleep(3000);
	
	select_currency.click();
	Reporter.log("Select one country currency from dropdown");
	Thread.sleep(3000);
	
	country_currency.click();
	Reporter.log("Selected the indian currency from dropdown");
	Thread.sleep(3000);
	
	search_button.click();
	Thread.sleep(5000);
	Reporter.log("clicked on the search button");	
}



public void search() throws InterruptedException
{
	search_button.click();
	Thread.sleep(5000);
	Reporter.log("clicked on the search button");	
}

public void round_way_trip(String From,String To) throws InterruptedException
{
	Thread.sleep(3000);
	drop_down.click();
	Reporter.log("clicked on drop down ");
	String round_trip_1 =round_trip.getText();
	System.out.println(round_trip_1);
	String Expected = "Round Trip";
	Assert.assertEquals(round_trip_1, Expected);
	Reporter.log("Done with Asssertion for One Way Trip");
	Thread.sleep(3000);
	round_trip.click();
	Reporter.log("clicked on Round Trip");
	Thread.sleep(3000);
	number_of_persons.click();
	Reporter.log("clicked on number of passenger");
	Thread.sleep(3000);
	increment_persons.click();
	Reporter.log("incremented number of passengers from 1 to 2");
	Thread.sleep(3000);
	done.click();
	Reporter.log("clicked on Done");
	
	boolean b =from.isDisplayed();
	System.out.println("The 'from' Text filed is displayed :- "+b);
	Assert.assertEquals(b, true);
	Reporter.log("done with assertion on from text field");
	Thread.sleep(3000);
	from.sendKeys(Keys.CONTROL+"a" +Keys.BACK_SPACE);
	Thread.sleep(3000);
	from.clear();
	Thread.sleep(3000);
	from.sendKeys(From);
	Reporter.log("Successfully sending the text in the FROM text filed");
    Thread.sleep(3000);
    to.sendKeys(Keys.CONTROL+"a" +Keys.BACK_SPACE);
    Thread.sleep(3000);
    to.clear();
    Thread.sleep(3000);
	to.sendKeys(To);
	Reporter.log("Successfully sending the text in the TO text filed");
	Thread.sleep(3000);
	travel_dates.click();
	Reporter.log("clicked on travelling date");
	Thread.sleep(3000);
	starting_date.click();
	Reporter.log("date selected");
	Thread.sleep(3000);
	return_click.click();
	Thread.sleep(5000);
	end_date.click();
	Thread.sleep(3000);
	select_currency.click();
	Reporter.log("Select one country currency from dropdown");
	Thread.sleep(3000);
	country_currency.click();
	Reporter.log("Selected the indian currency from dropdown");
	Thread.sleep(3000);
	search_button.click();
	Thread.sleep(5000);
	Reporter.log("clicked on the search button");
}
	
public void multi_way(String First_Row_From,String First_Row_To ,String Second_Row_From,String Second_Row_To ,String Third_Row_From,String Third_Row_To) throws InterruptedException
{
	Thread.sleep(3000);
	drop_down.click();
	Reporter.log("clicked on drop down ");
	String multi_city_1 = multi_city.getText();
	System.out.println(multi_city_1);
	String Expected = "Multi City";
	Assert.assertEquals(multi_city_1, Expected);
	Reporter.log("Done with Asssertion for Multi City Trip");
	Thread.sleep(3000);
	multi_city.click();
	Reporter.log("clicked on multi city");
	Thread.sleep(7000);

	boolean b = add_city.isDisplayed();
	System.out.println("The Add City button is Displayed :- "+ b);
	Assert.assertEquals(b, true);
	add_city.click();
	Reporter.log("clicked on Add City Button");
	Thread.sleep(3000);
	Reporter.log("Successfully Added Row of 'From' and 'To' ");
	Thread.sleep(3000);
	first_row_from.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
	Thread.sleep(3000);
	first_row_from.clear();
	Thread.sleep(3000);
    first_row_from.sendKeys(First_Row_From);
    Thread.sleep(3000);
    first_row_to.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
    Thread.sleep(3000);
    first_row_to.clear();
    Thread.sleep(3000);
    first_row_to.sendKeys(First_Row_To);
    Reporter.log("Successfully Enter the First row From and To");
	 first_row_departure.click();
	 Thread.sleep(3000);
	 Reporter.log("Successfully clicked on First Row Departure");
	 first_row_date.click();
	 Thread.sleep(3000);
	 Reporter.log("Successfully clicked on First Row date");

//---------------------
	
    second_row_from.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
	Thread.sleep(3000);
	second_row_from.clear();
	Thread.sleep(3000);
    second_row_from.sendKeys(Second_Row_From);
    Thread.sleep(3000);
    second_row_to.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
    Thread.sleep(3000);
    second_row_to.clear();
    Thread.sleep(3000);
    second_row_to.sendKeys(Second_Row_To);
    Reporter.log("Successfully Enter the Second row From and To");
 
    second_row_departure.click();
    Thread.sleep(3000);
    Reporter.log("Successfully clicked on Second Row Departure");
    second_row_date.click();
    Thread.sleep(3000);
    Reporter.log("Successfully clicked on Second Row date");
 //---------------------------------
    
	third_row_from.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
	Thread.sleep(3000);
	third_row_from.clear();
	Thread.sleep(3000);
    third_row_from.sendKeys(Third_Row_From);
    Thread.sleep(3000);
    third_row_to.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
    Thread.sleep(3000);
    third_row_to.clear();
    Thread.sleep(3000);
    third_row_to.sendKeys(Third_Row_To);
    Reporter.log("Successfully Enter the Third row From and To");
    
    third_row_departure.click();
    Thread.sleep(3000);
    Reporter.log("Successfully clicked on Third Row Departure");
    third_row_date.click();
    Thread.sleep(3000);
    Reporter.log("Successfully clicked on Third Row date");

    boolean bb =increment_button.isDisplayed();
    System.out.println("The Increment person button is displayed :- "+bb);
   Thread.sleep(3000);
    increment_button.click();
    Reporter.log("Successfully click on the increment Button");
    
    adult.click();
    Thread.sleep(3000);
Reporter.log("Successfully increment a person");
done_for_multi.click();
Reporter.log("Clicked on Done");
Thread.sleep(3000);
search_for_multi_city.click();
Reporter.log("Done WIth the Multi City Flights");
}
	
	
public IndiGo_Whole_Trip_Page(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}
}