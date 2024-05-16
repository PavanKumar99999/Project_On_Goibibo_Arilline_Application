package Indigo.Project_On_IndiGO_Airline_Application;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listeners.Test_Listeners;
import utilities.Fetch_User_Details;

@Listeners(Test_Listeners.class)
public class TestCase_02_IndiGo_B_To_C extends IndiGo_launch_And_Quit
{

	@Test
	public void testCase_02_IndiGo_B_To_C_Valid_Username_And_Password() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Fetch_User_Details d = new Fetch_User_Details();
				d.details();
		IndiGo_Main_Page m = new IndiGo_Main_Page(driver);
		    m.add_0();
		    m.add_1(driver);
		    m.add_2();
		m.click_on_login(driver);
		IndiGO_Valid_And_Invalid_Credentials vc = new IndiGO_Valid_And_Invalid_Credentials(driver);
		vc.valid_username();
		vc.valid_password();
		//m.add_1(driver);
		vc.login();
		m.add_1(driver);
	}
}