package GooglePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

 

    WebDriver driver;




    
    @FindBy(id="Passwd")
    WebElement password;
    
    @FindBy(id="next")
     WebElement nextButton;
    
    @FindBy(id="Email")
    WebElement Email_Field;
    
    @FindBy(id="signIn")
    WebElement signIn;
    
    

    public Login(WebDriver driver){

        this.driver = driver;
       //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }

    
    

  
    public void loginToGmail(WebDriver driver1,String username, String pass) throws InterruptedException
    {
    	
    	 WebDriverWait wait = new WebDriverWait(driver1, 10);
         Email_Field.click();
         Email_Field.sendKeys(username);
         nextButton.click();
         
         WebElement password2;
         password2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
         password2.sendKeys(pass);
         signIn.click();
         
         
         
    }

    

}