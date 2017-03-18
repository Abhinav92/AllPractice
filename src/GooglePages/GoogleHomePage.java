package GooglePages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage {

    WebDriver driver;
    
    
/*    @FindBy(id="lst-ib")
    WebElement TextSearch;*/

    public GoogleHomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    

        public String searchtext(WebDriver driver1, String textToBeSearched) throws AWTException{

        	WebDriverWait wait = new WebDriverWait(driver1, 10);
            WebElement TextSearch;
            TextSearch=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lst-ib")));
            TextSearch.sendKeys(textToBeSearched);
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            
            WebElement result;
            result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='uid_0']/div[1]/div/div[2]/div/div[5]/table/tbody/tr/td[4]")));
            String resultString=result.getText();
            
            return resultString;

        }

}