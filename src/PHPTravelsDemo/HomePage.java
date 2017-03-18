package PHPTravelsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

 

    WebDriver driver;




    
    @FindBy(xpath="//*[@id='main-menu']/ul/li[7]/a/span")
    WebElement loginButton;
    
     
    

    public HomePage(WebDriver driver){

        this.driver = driver;
       //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }

    
    

  
    public void clickOnLoginButton(WebDriver driver1) throws InterruptedException
    {
    	
    	 WebDriverWait wait = new WebDriverWait(driver1, 10);
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-menu']/ul/li[7]/a/span")));
    	 loginButton.click();          
         
    }





	public void navigateToNextTab(WebDriver driver1) {
		Actions action= new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		
	}

    

}