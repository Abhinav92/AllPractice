package Utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UtilClass {

		 
		String result = "";
		InputStream inputStream;
		public static WebDriver driver;
		
		

		    

		  /*  public Utility(WebDriver driver) {
		        Utility.driver = driver;
		    }
*/
		
		public String getPropValues(String value) throws IOException {
	 
			try {
				Properties prop = new Properties();
				String propFileName = "Abhinav.properties";
	 
				inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
	 
				if (inputStream != null) {
					prop.load(inputStream);
				} else {
					throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
				}
				result = prop.getProperty(value);
	 
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			} finally {
				inputStream.close();
			}
			return result;
		}
		
		public WebDriver openBrowser() throws IOException
		{
			
			String path;
			String browsertype1=getPropValues("Browser");
			if(browsertype1.contentEquals("chrome"))
			{
			//	path="C://chromedriver.exe";
				
				path ="/home/singhal_saab/Desktop/Abhi/chromedriver";
				
				System.setProperty("webdriver.chrome.driver", path);
				driver = new ChromeDriver();
							
			}
			
			else if(browsertype1.contentEquals("IE"))
			{
				path="C://IEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", path);
				driver = new InternetExplorerDriver();
			
			}
			
			driver.manage().window().maximize();
			return driver;
			
		}
		
	

}
