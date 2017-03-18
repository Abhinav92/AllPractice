package GooglePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    
    
    @FindBy(xpath=" //*[@id=':io']/div/div")
    WebElement ComposeButton;

    public HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
     
    }
   

        public void getHomePageDashboardUserName(WebDriver driver1){

        	WebDriverWait wait = new WebDriverWait(driver1, 10);
            WebElement compose;
            compose=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=':io']/div/div")));
            compose.click();

        }

}