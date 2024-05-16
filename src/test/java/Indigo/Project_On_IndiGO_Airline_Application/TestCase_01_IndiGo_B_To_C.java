package Indigo.Project_On_IndiGO_Airline_Application;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.Test_Listeners;
import utilities.Fetch_User_Details;

@Listeners(Test_Listeners.class)
public class TestCase_01_IndiGo_B_To_C extends IndiGo_launch_And_Quit
{
	@Test
	public void testCase_01_IndiGo_B_To_C_New_Registration() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Fetch_User_Details d  = new Fetch_User_Details();
		d.details();
		IndiGo_Main_Page i = new IndiGo_Main_Page(driver);
		    i.add_0();
		    i.add_1(driver);
		    i.add_2();
	      i.click_on_login(driver);
	      i.new_user();
	      i.register_through_mobilenumber(driver);
	}
	
}
