package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.ConfigDriver;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class register_PF {

	static WebDriver driver = null;
	//String url = "https://dsportalapp.herokuapp.com/";
	@FindBy(xpath="//button[@class='btn']") WebElement GetStarted_btn;
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]") WebElement register_link;

	@FindBy(xpath="//input[@value='Register']") WebElement registerbutton;
	@FindBy(name = "username") WebElement username;
	@FindBy(name = "password1") WebElement password;
	@FindBy(name = "password2") WebElement confirmpassword;
	@FindBy(xpath = "//*[@class = 'alert alert-primary']") WebElement errorMsg;
	@FindBy(xpath = "/html/body/div[2]") WebElement message;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginButton;
	@FindBy(xpath = "//a[normalize-space()='Sign in']") WebElement Signin;
	@FindBy(id = "id_username") WebElement Username;
	@FindBy(id = "id_password") WebElement Password;
	
	ConfigReader config;

	
	public register_PF() {
		driver=ConfigDriver.getBrowser();
		PageFactory.initElements(driver, this);
		config = new ConfigReader();
				
						
	}
	
	public void goTopage() {
		try {
			  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(220));
			 String url = config.getHomePage();
			 System.out.println(url);
			 driver.get(url);
		  }
			  catch(Exception ex) {
				  LoggerLoad.error("Exception occured in registerPage: goTopage function:" + ex.getMessage());
			  }	
	}
	public void getStarted() {
		try {
		GetStarted_btn.click();
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: getstarted function: " + ex.getMessage());
		}
		
	}
	public void Registerlink() {
		try {
		register_link.click();
		}
        catch (Exception ex) {
			
        	LoggerLoad.error("Exception occurred in Register: Registerlink function: " + ex.getMessage());
		}
	}
	
	public String getTitleofPage() {
		String title=null;
		try {
		title = driver.getTitle();
		return title;
		}
        catch (Exception ex) {
			
        	LoggerLoad.error("Exception occurred in Register: getTitlepage function: " + ex.getMessage());
		}
		return title;
	}
	
	public void enterUsername(String Username ) {
		try {
		username.clear();
		username.sendKeys(Username);
		}
        catch (Exception ex) {
			
        	LoggerLoad.error("Exception occurred in Register: enterusername function: " + ex.getMessage());
		}
	}
	
	public void enterPassword(String Password) {
		try {
		password.clear();
		//System.out.println(Password);

		password.sendKeys(Password);
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: enterpassword function: " + ex.getMessage());
		}
	}

	public void enterConfrmPassword(String confrmPassword) {
		try {
		confirmpassword.clear();
		//System.out.println(confrmPassword);
		confirmpassword.sendKeys(confrmPassword);
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: confirmpassword function: " + ex.getMessage());
		}
	}
	
	public void register_btn() {
		try {
		registerbutton.click();
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: registerbtn function: " + ex.getMessage());
		}
	}
	
	public void verifyRegistererrormsg(String text){
		try {
		System.out.println(text);

		if(text.contains("Please fill out this field.")) {
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

           WebElement activeElement = driver.switchTo().activeElement();
           String messageStr = activeElement.getAttribute("validationMessage");
           System.out.println("Actual message appeared on screen: " + messageStr);
         }
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: verifyregistererrormsg function: " + ex.getMessage());
		}
  
   }
	
	public String sucessmsg() {
		String Sucessmsg =null;
		try {
		Sucessmsg = message.getText();
		System.out.println(Sucessmsg);
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: successmsg function: " + ex.getMessage());
		}
		return Sucessmsg;
	}
	
	public String invalidalertmsg() {
		String alertmsg=null;

		try {
		alertmsg = errorMsg.getText();
		System.out.println(alertmsg);
		return alertmsg;
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: invalidalrertmsg function: " + ex.getMessage());
		}
		return alertmsg;
		
	}
	
	public String validateUsernamefield(String validationMessage) {
		String message=null;

		try {
		message = username.getAttribute(validationMessage);
		System.out.println(message);
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: invalidalrertmsg function: " + ex.getMessage());
		}
		return message;
	}
	
	public String validatePasswordfield(String validationMessage) {
		String message=null;
		try {
		 message = password.getAttribute(validationMessage);
		 System.out.println(message);
		 
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: invalidalrertmsg function: " + ex.getMessage());
		}
		return message;
	}
	
	public String validateConfrmPasswordfield(String validationMessage) {
		String message = null;
		try {
		message = confirmpassword.getAttribute(validationMessage);
		System.out.println(message);
		
		}
        catch (Exception ex) {
			
			LoggerLoad.error("Exception occurred in Register: invalidalrertmsg function: " + ex.getMessage());
		}
		return message;

	}
	
	
public void loginPage() {
	  try {
		  LoggerLoad.info("Navigate to login page");
		  Signin.click();
		  Username.sendKeys(config.getProperty("username"));
		  Password.sendKeys(config.getProperty("password"));
		  loginButton.click();
	  }
		  catch(Exception ex) {
			  LoggerLoad.error("Exception occured in GraphPage: loginPage function:" + ex.getMessage());
		  }
}
}