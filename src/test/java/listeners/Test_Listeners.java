package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Test_Listeners extends Date_Of_EveryDay implements ITestListener
{
public static Date_Of_EveryDay d = new Date_Of_EveryDay();


//public static WebDriver driver = new ChromeDriver();       
 //public static WebDriver driver = new EdgeDriver();
 public static WebDriver driver = new FirefoxDriver();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		d.date();
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("This is getTestname method :- "+result.getTestName());
		System.out.println("This is a method name :- "+ result.getName());
		//date(); // calling static method from date class
		d.date();
	    String time	=pdate;
		System.out.println(time);
	    String method_name=result.getName();
		System.out.println(method_name);
		
		String method_name_with_time = method_name.concat(time);
		System.out.println(method_name_with_time);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_IndiGO_Airline_Application\\ScreenShots\\onTestSuccess\\"+result.getName()+"-"+pdate+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Reporter.log("Took ScreenShot onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	      d.date();
	//	date(); // calling static method from date class
	     String method_name = result.getName();
	     System.out.println(method_name);
	     String date= pdate;
	     String method_name_with_time= method_name.concat("-"+date);
	     System.out.println(method_name_with_time);
	     TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_IndiGO_Airline_Application\\ScreenShots\\onTestFailure\\"+method_name_with_time+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("Took ScreenShot onTestFailure");
//	driver.manage().window().minimize();
//	driver.close();
	}
 
	
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		
		//String date =result.getName().concat(" [").concat(d.date()).concat("]");
     //System.out.println(result.getName().concat(" [").concat(d.date()).concat("]"));
		//String d1 = d.date();
//	System.out.println("{"+d1+"}");
		TakesScreenshot ts = (TakesScreenshot)driver;
		String method_name =result.getName();
		System.out.println(method_name);
		File source =ts.getScreenshotAs(OutputType.FILE);//"["+present_date+"]"+
		File destination = new File("C:\\Users\\golip\\eclipse-workspace\\Project_On_IndiGO_Airline_Application\\ScreenShots\\onTestSkipped\\"+"-"+method_name+"-"+pdate+".png");
		
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("Took ScreenShot onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	
		Reporter.log("Took ScreenShot onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		
		Reporter.log("Took ScreenShot onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		
		
		Reporter.log("Took ScreenShot onStart");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		
		Reporter.log("Took ScreenShot onFinish");
	}

}