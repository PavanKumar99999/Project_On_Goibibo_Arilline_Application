package Indigo.Project_On_IndiGO_Airline_Application;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.Test_Listeners;
import utilities.Fetch_User_Details;


@Listeners(Test_Listeners.class)
public class TestCase_05_IndiGo_B_To_C extends IndiGo_launch_And_Quit
{

	
	@Test
	public void testCase_05_IndiGo_B_To_C_Search_Functionality_for_Round_Trip_Flight() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Fetch_User_Details detail = new Fetch_User_Details();
		detail.details();
		IndiGo_Main_Page m = new IndiGo_Main_Page(driver);
		m.add_0();
		m.add_1(driver);
		m.add_2();
		m.click_on_login(driver);
		
		IndiGO_Valid_And_Invalid_Credentials  vc = new IndiGO_Valid_And_Invalid_Credentials (driver);
		vc.valid_username();
		vc.valid_password();
		vc.login();
		IndiGo_Whole_Trip_Page trip = new IndiGo_Whole_Trip_Page(driver);
		m.add_1(driver);
		m.add_2();
	    trip.round_way_trip("hyderabad", "delhi");
		
		
		
	}
}