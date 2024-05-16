package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Fetch_User_Details 
{
public static	String username,Username, Invalid_username, password, Invalid_password, creditcard, cvv;
	
	public  void details() throws EncryptedDocumentException, IOException
	{
	FileInputStream f = new FileInputStream("C:\\Users\\golip\\eclipse-workspace\\Project_On_IndiGO_Airline_Application\\Excel\\IndiGO_Airline_Application_Username_Password.xlsx");
	
	Workbook w =WorkbookFactory.create(f);
    Username=	NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue());
  //  String country_code="+91";
    //username=country_code.concat(Username);
    
    String invalid_username = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(5).getNumericCellValue());
    String country = "91";
    String invalid_username_1 =country.concat(invalid_username);
    this.Invalid_username  = invalid_username_1;
    
    password=	w.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
    Invalid_password = w.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
	
	
	}	
}