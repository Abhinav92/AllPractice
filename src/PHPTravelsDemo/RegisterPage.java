package PHPTravelsDemo;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegisterPage {

 

    WebDriver driver;
    
    @FindBy(id="firstname")
    WebElement FirstName;
    
    @FindBy(id="lastname")
    WebElement lastName;
    
    @FindBy(id="companyname")
    WebElement companyname;
    
    @FindBy(id="email")
    WebElement email;

    @FindBy(id="inputNewPassword1")
    WebElement inputNewPassword1;
    
    @FindBy(id="inputNewPassword2")
    WebElement inputNewPassword2;
   
    
    @FindBy(id="address1")
    WebElement address1;
    
    @FindBy(id="city")
    WebElement city;
    
    @FindBy(id="stateinput")
    WebElement stateinput;

    @FindBy(id="postcode")
    WebElement postcode;
    
    @FindBy(xpath="//*[@id='country']/option[102]")
    WebElement country;
    
    @FindBy(id="phonenumber")
    WebElement phonenumber;
    
    
    @FindBy(id="//*[@id='customfield1']/option[2]")
    WebElement mobilenumber;
   

    public RegisterPage(WebDriver driver){

        this.driver = driver;
       //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }

    
    

  
    public void fillAlDetails(ArrayList<String> dataFromPropFile , WebDriver driver1) throws InterruptedException
    {
    	
    	 FirstName.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 lastName.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 companyname.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 email.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 inputNewPassword1.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 inputNewPassword2.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 address1.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 city.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 stateinput.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 postcode.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 country.sendKeys(dataFromPropFile.get(0));
    	 driver1.wait(2000);
    	 mobilenumber.sendKeys(dataFromPropFile.get(0));
    	 
    	 
    	 
    	
    	
         
    }

    

}