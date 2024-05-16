package Indigo.Project_On_IndiGO_Airline_Application;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.Test_Listeners;
import utilities.Fetch_User_Details;

//Validate search results for Different classes (economy, business,first class)

@Listeners(Test_Listeners.class)
public class TestCase_06_IndiGo_B_To_C extends IndiGo_launch_And_Quit
{

@Test(priority=1)
public void testCase_06_IndiGo_B_To_C_search_results_for_6exclusive() throws EncryptedDocumentException, IOException, InterruptedException
{
	Fetch_User_Details details_1 = new Fetch_User_Details();
	details_1.details();
 IndiGo_Main_Page m = new IndiGo_Main_Page(driver);	
	m.add_0();
	m.add_1(driver);
	m.add_2();
	m.click_on_login(driver);
	IndiGO_Valid_And_Invalid_Credentials vc = new IndiGO_Valid_And_Invalid_Credentials(driver);
	vc.valid_username();
	vc.valid_password();
	vc.login();
	
	IndiGo_Trip_Catagerious c = new IndiGo_Trip_Catagerious(driver);
	c.exclusive_6();
	//	IndiGo_Whole_Trip_Page trip = new IndiGo_Whole_Trip_Page(driver);
//	trip.one_way_trip("Hyderabad(HYD)", "Bengaluru");
//	IndiGo_Trip_Catagerious_1 c = new IndiGo_Trip_Catagerious_1(driver);
//	c.fares();   
//	c.exclusive6();
//	c.modify();
}

@Test(priority=2)
public void testCase_06_IndiGo_B_To_C_search_results_for_Armed_Force() throws EncryptedDocumentException, IOException, InterruptedException
{
//	IndiGo_Main_Page m = new IndiGo_Main_Page(driver);	
	IndiGo_Trip_Catagerious c = new IndiGo_Trip_Catagerious(driver);
	c.armed_Force();
//	IndiGo_Whole_Trip_Page trip = new IndiGo_Whole_Trip_Page(driver);
//	trip.one_way_trip("Hyderabad(HYD)", "Bengaluru");
//	m.backword_page(driver);
	
//	IndiGo_Trip_Catagerious_1 c = new IndiGo_Trip_Catagerious_1(driver);
//     c.fares();
//     c.arm_forces();
//     c.modify();
}

@Test(priority=3)
public void testCase_6_IndiGo_B_To_C_search_results_for_Doctor_And_Nurse() throws EncryptedDocumentException, IOException, InterruptedException
{
	//IndiGo_Main_Page m = new IndiGo_Main_Page(driver);	
	IndiGo_Trip_Catagerious c = new IndiGo_Trip_Catagerious(driver);
	c.doctor_and_nurse();
	//IndiGo_Whole_Trip_Page trip = new IndiGo_Whole_Trip_Page(driver);
	//trip.one_way_trip("Hyderabad(HYD)", "Bengaluru");
	//m.backword_page(driver);
//	IndiGo_Trip_Catagerious_1 c = new IndiGo_Trip_Catagerious_1(driver);
//     c.fares();
//     c.doctor_And_Nurse();
//     c.modify();
}

@Test(priority=4)
public void testCase_6_IndiGo_B_To_C_search_results_for_Family_And_Friends() throws EncryptedDocumentException, IOException, InterruptedException
{
	//IndiGo_Main_Page m = new IndiGo_Main_Page(driver);	
	IndiGo_Trip_Catagerious c = new IndiGo_Trip_Catagerious(driver);
	c.family_and_friends();
	//IndiGo_Whole_Trip_Page trip = new IndiGo_Whole_Trip_Page(driver);
	//trip.one_way_trip("Hyderabad(HYD)", "Bengaluru");
	//m.backword_page(driver);
	
	
//	IndiGo_Trip_Catagerious_1 c = new IndiGo_Trip_Catagerious_1(driver);
//     c.fares();
//     c.family_and_Friends();
//     c.modify();
}

@Test(priority=5)
public void testCase_6_IndiGo_B_To_C_search_results_for_UnAccompained_Minor() throws EncryptedDocumentException, IOException, InterruptedException
{

	//IndiGo_Main_Page m = new IndiGo_Main_Page(driver);	
	IndiGo_Trip_Catagerious c = new IndiGo_Trip_Catagerious(driver);
	c.unaccompained_Minor();
	//IndiGo_Whole_Trip_Page trip = new IndiGo_Whole_Trip_Page(driver);
	//trip.one_way_trip("Hyderabad(HYD)", "Bengaluru");
	//m.backword_page(driver);
//IndiGo_Trip_Catagerious_1 c = new IndiGo_Trip_Catagerious_1(driver);
//     c.fares();
//     c.unaccompanied_Minor();
//     c.modify();
}

@Test(priority=6)
public void testCase_6_IndiGo_B_To_C_search_results_for_student() throws EncryptedDocumentException, IOException, InterruptedException
{
	//IndiGo_Main_Page m = new IndiGo_Main_Page(driver);	
	IndiGo_Trip_Catagerious c = new IndiGo_Trip_Catagerious(driver);
	c.student();
//	IndiGo_Whole_Trip_Page trip = new IndiGo_Whole_Trip_Page(driver);
//	trip.one_way_trip("Hyderabad(HYD)", "Bengaluru");
//	m.backword_page(driver);
//	IndiGo_Trip_Catagerious_1 c = new IndiGo_Trip_Catagerious_1(driver);
//     c.fares();
//     c.student();
//     c.modify();
}

}