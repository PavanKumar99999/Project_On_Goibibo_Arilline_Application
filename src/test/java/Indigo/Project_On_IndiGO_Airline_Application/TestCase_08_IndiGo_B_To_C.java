package Indigo.Project_On_IndiGO_Airline_Application;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.Test_Listeners;
import utilities.Fetch_User_Details;



@Listeners(Test_Listeners.class)
public class TestCase_08_IndiGo_B_To_C extends IndiGo_launch_And_Quit
{
	@Test
	public void testCase_08_IndiGo_B_To_C_Chech_For_Seat_Selection_During_Booking_In_Process() throws EncryptedDocumentException, IOException, InterruptedException
	{
	    Fetch_User_Details d = new Fetch_User_Details();
	    d.details();
		IndiGo_Main_Page main = new IndiGo_Main_Page(driver);
		main.add_0();
		main.add_1(driver);
		main.add_2();
		main.click_on_login(driver);
		IndiGO_Valid_And_Invalid_Credentials vc = new IndiGO_Valid_And_Invalid_Credentials(driver);
		vc.valid_password();
		vc.valid_username();
		vc.login();
		IndiGo_Seat_Selection seat=new IndiGo_Seat_Selection(driver);
		seat.adults();
		seat.seniour_citizens();	
		seat.children();
		seat.infant();
		IndiGo_Whole_Trip_Page trip = new IndiGo_Whole_Trip_Page(driver);
		trip.one_way_trip_with_out_date("Hyderabad", "Delhi");
	
	}	
}
