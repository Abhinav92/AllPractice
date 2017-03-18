package TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import PHPTravelsDemo.HomePage;
import PHPTravelsDemo.LoginPage;
import PHPTravelsDemo.RegisterPage;
import Utility.UtilClass;

public class OpenChromeAndRegisterToPHPTravels {

	static WebDriver driver;
	static String URL_PHP;
	
	static ArrayList<String> dataFromPropFile = new ArrayList<String>();
	
	
	static LoginPage objLogin;
	static HomePage objHomePage;
	static RegisterPage registerPage;

	public static void main(String args[]) throws IOException, AWTException, InterruptedException {
		
		setup();
		
	}
	
	
	 public static  void setup() throws IOException   // get all the properties from the file for running
, AWTException, InterruptedException
	    {
		
		    UtilClass utl = new UtilClass();
		    URL_PHP = utl.getPropValues("URL_PHP");  
		    
		    String temp=utl.getPropValues("firstname");
		    String temp1=utl.getPropValues("lastname");
		    String temp2=utl.getPropValues("companyName");
		    String temp3=utl.getPropValues("Eid");
		    String temp4=utl.getPropValues("Password");
		    String temp5=utl.getPropValues("Address");
		    String temp6=utl.getPropValues("City");
		    String temp7=utl.getPropValues("State");
		    String temp8=utl.getPropValues("ZIP");
		    String temp9=utl.getPropValues("Country");
		    String temp10=utl.getPropValues("Phone");
		    String temp11=utl.getPropValues("findUs");
		    String temp12=utl.getPropValues("firstname");
		    
		    dataFromPropFile.add(temp);
		    dataFromPropFile.add(temp1);
		    dataFromPropFile.add(temp2);
		    dataFromPropFile.add(temp3);
		    dataFromPropFile.add(temp4);
		    dataFromPropFile.add(temp5);
		    dataFromPropFile.add(temp6);
		    dataFromPropFile.add(temp7);
		    dataFromPropFile.add(temp8);
		    dataFromPropFile.add(temp9);
		    dataFromPropFile.add(temp10);
		    dataFromPropFile.add(temp11);
		    dataFromPropFile.add(temp12);
		    
		    
		    driver = utl.openBrowser();	
		    driver.get(URL_PHP);
		    
		    openPHP(dataFromPropFile,URL_PHP);
	    }
	
	 
	    public static void openPHP(ArrayList<String> dataFromPropFile , String URL) throws AWTException, IOException, InterruptedException {
			
		
	    	objHomePage = new HomePage(driver);
	    	objHomePage.clickOnLoginButton(driver);
	    	objHomePage.navigateToNextTab(driver);
	    	
	    	objLogin = new LoginPage(driver);
	    	objLogin.clickOnAccountButton(driver);
	    	
	    	registerPage=new RegisterPage(driver);
	    	registerPage.fillAlDetails(dataFromPropFile,driver);
		    
		   
	    }
	    
	   
	   
}

