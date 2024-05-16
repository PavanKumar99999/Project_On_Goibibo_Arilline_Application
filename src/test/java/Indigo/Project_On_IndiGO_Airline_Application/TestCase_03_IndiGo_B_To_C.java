package Indigo.Project_On_IndiGO_Airline_Application;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.Test_Listeners;
import utilities.Fetch_User_Details;

@Listeners(Test_Listeners.class)
public class TestCase_03_IndiGo_B_To_C extends IndiGo_launch_And_Quit
{

	@Test
	public void testCase_03_0_IndiGo_B_To_C_InValid_Username() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Fetch_User_Details f = new Fetch_User_Details();
				f.details();
		IndiGo_Main_Page m = new IndiGo_Main_Page(driver);
	    m.add_0();
	    m.add_1(driver);
	    m.add_2();
		m.click_on_login(driver);
		IndiGO_Valid_And_Invalid_Credentials inv = new IndiGO_Valid_And_Invalid_Credentials(driver);
		inv.invalid_username();
		inv.valid_password();
		inv.verify_Login(driver);
		
	}
	
	@Test//(dependsOnMethods="testCase_3_0_IndiGo_B_To_C_InValid_Username")
	public void testCase_03_1_IndiGo_B_To_C_InValid_Password() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Fetch_User_Details f = new Fetch_User_Details();
	    f.details();
		IndiGo_Main_Page m = new IndiGo_Main_Page(driver);
//		m.add_0();
//		m.add_1(driver);
//		m.add_2();
		m.click_on_login(driver);
		IndiGO_Valid_And_Invalid_Credentials inv = new IndiGO_Valid_And_Invalid_Credentials(driver);
		inv.valid_username();
		inv.invalid_password();
		inv.verify_Login(driver);
	}
	

}