package Indigo.Project_On_IndiGO_Airline_Application;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.Test_Listeners;


public class IndiGo_launch_And_Quit extends Test_Listeners
{

	@BeforeTest
	public void launch()
	{
	
		//https://www.goindigo.in/
	driver.navigate().to("https://www.goindigo.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		Reporter.log("This is Before mehthod Successfully launch the IndiGO Website");
	}
	
	
	
   // @AfterTest
	public void signout() throws InterruptedException
	{
        String main=driver.getTitle();
         System.out.println(main);
      IndiGo_Main_Page m = new IndiGo_Main_Page(driver);
    	IndiGO_Valid_And_Invalid_Credentials vm = new IndiGO_Valid_And_Invalid_Credentials(driver);
                           
    	String n= m.login_Signup();
    	
    	
    	if(n.equals(n)==true && m.login_signup.getText()=="Login/SignUp")  
        {
      	 driver.manage().window().minimize();
      	 driver.close();
        }
    	else 
    	{
    	   String cn=  m.customer();       
    	   System.out.println("After_method"+cn);
           if((main.equals(main)==true &&cn.equals(cn)==true)==true)
    	{
			  //vm.sign_out();
			    m.add_2();
				vm.sign_out_by_scroll_down(driver);
				Thread.sleep(5000);
				driver.manage().window().minimize();
				Thread.sleep(3000);
				driver.close();	
				Reporter.log("This is After method Successfully close the IndiGo website");
	     }	  
//    	else    
//    	{
////    		if()
////    		{
////    			boolean b = vm.login_1.isDisplayed();
////    		}
////              System.out.println("login button is visible :- "+b);      
////    		   
////              if(b==true)
////    		  {       
////    		    String login =vm.login_1.getText();
////    		    System.out.println(login);   
//////    		 if((main.equals(main)&&login.equals(login))==true)
//////		      {
//	           driver.manage().window().minimize();
//		       driver.close();
    	}	          
    }
}
