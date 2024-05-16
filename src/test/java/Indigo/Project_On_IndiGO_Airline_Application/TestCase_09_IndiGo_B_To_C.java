package Indigo.Project_On_IndiGO_Airline_Application;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listeners.Test_Listeners;
import utilities.Fetch_User_Details;

@Listeners(Test_Listeners.class)
public class TestCase_09_IndiGo_B_To_C extends IndiGo_launch_And_Quit
{
	@Test
	public void testCase_09_IndiGo_B_To_C_handle_multiple_passanger_in_single_booking() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Fetch_User_Details detail = new Fetch_User_Details();
		detail.details();
		IndiGo_Main_Page main = new IndiGo_Main_Page(driver);
		main.add_0();
		main.add_1(driver);
		main.add_2();
		main.click_on_login(driver);
		IndiGO_Valid_And_Invalid_Credentials vc = new IndiGO_Valid_And_Invalid_Credentials(driver);
		vc.valid_username();
		vc.valid_password();
		vc.login();
		
	}
}