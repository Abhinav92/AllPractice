package TestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import GooglePages.HomePage;
import GooglePages.Login;
import Utility.UtilClass;

public class OpenChromeAndLoginToGmail {

	static WebDriver driver;
	static String URL;
	static String username;
	static String password;

	static Login objLogin;
	static HomePage objHomePage;

	public static void main(String args[]) throws IOException, AWTException, InterruptedException {
		
		setup();
		
	}
	
	
	 public static  void setup() throws IOException   // get all the properties from the file for running
, AWTException, InterruptedException
	    {
		
		    UtilClass utl = new UtilClass();
		    URL = utl.getPropValues("URL");  
		    username =utl.getPropValues("username");
		    password=utl.getPropValues("password");
		    driver = utl.openBrowser();	
		    driver.get(URL);
		    
		    openGmail(username,password,URL);
	    }
	
	 
	    public static void openGmail(String username,String password, String URL) throws AWTException, IOException, InterruptedException {
			
		
	    	System.out.println("GIT PUSH TEST");
			objLogin = new Login(driver);
		    objLogin.loginToGmail(driver,username,password);

		    objHomePage = new HomePage(driver);
		    objHomePage.getHomePageDashboardUserName(driver);
		   
	    }
	    
	   
	   
}

