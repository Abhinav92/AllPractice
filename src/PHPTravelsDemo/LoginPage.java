package PHPTravelsDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

 

    WebDriver driver;




    
    @FindBy(className="dropdown-toggle")
    WebElement accountButton;
    
    @FindBy(xpath="//*[@id='Secondary_Navbar-Account-Register']/a")
    WebElement registerDropDown;
    
    @FindBy(id="Email")
    WebElement Email_Field;
    
    @FindBy(id="signIn")
    WebElement signIn;
    
    

    public LoginPage(WebDriver driver){

        this.driver = driver;
       //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }

    
    

  
    public void clickOnAccountButton(WebDriver driver1) throws InterruptedException
    {
    
    	    WebElement dropDown = driver.findElement( By.className( ".//dropdown-toggle" ) );
    	    dropDown.click();
    	    List<WebElement> allOptions = dropDown.findElements(By.xpath(".//option"));
    	    for ( WebElement we: allOptions) { 
    	        dropDown.sendKeys( Keys.DOWN ); //simulate visual movement
    	    }
    	       
    	
    	 WebDriverWait wait = new WebDriverWait(driver1, 10);
    	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Secondary_Navbar-Account']/a")));
    	 accountButton.click();  
    	 
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Secondary_Navbar-Account-Register']/a")));
    	 registerDropDown.click();  
    	 
    	
         
    

    }

}