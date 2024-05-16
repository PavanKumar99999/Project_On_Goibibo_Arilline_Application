package Indigo.Project_On_IndiGO_Airline_Application;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.Test_Listeners;
import utilities.Fetch_User_Details;

@Listeners(Test_Listeners.class)
public class TestCase_04_IndiGo_B_To_C extends IndiGo_launch_And_Quit
{

	@Test
	public void testCase_04_IndiGo_B_To_C_Search_Functionality_for_One_Way_Flight() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
		Fetch_User_Details f = new Fetch_User_Details();
	    f.details();
		IndiGo_Main_Page m = new IndiGo_Main_Page(driver);
		m.add_0();
		m.add_1(driver);
		m.add_2();
	//	m.click_on_login(driver);
		
		IndiGO_Valid_And_Invalid_Credentials vup = new IndiGO_Valid_And_Invalid_Credentials(driver);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ESCAPE);
		
//		vup.valid_username();
//		vup.valid_password();
//		vup.login();
//		m.refresh_page(driver);
		IndiGo_Whole_Trip_Page tp = new IndiGo_Whole_Trip_Page(driver);
//		m.add_1(driver);
//		m.add_2();
		tp.one_way_trip("hyderabad", "bengaluru");
		
	}
}