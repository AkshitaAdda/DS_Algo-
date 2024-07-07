package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

import driverFactory.ConfigDriver;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class dataStructure_PF {

	public static WebDriver driver = null;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//String URL = "https://dsportalapp.herokuapp.com/";
	
	
	@FindBy(xpath="//button[@class='btn']") WebElement GetStarted_btn;
	@FindBy(xpath = "//a[normalize-space()='Sign in']") WebElement Signin;
	@FindBy(id = "id_username") WebElement userName;
	@FindBy(id = "id_password") WebElement password;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginbutton;
	@FindBy (xpath = "//a[@href=\'data-structures-introduction']")WebElement dataStructuregetStrated_button;
	@FindBy (xpath = "//a[@href='time-complexity']") WebElement TimeComplexity_link;
	@FindBy(xpath = "//h4[@class='bg-secondary text-white']") WebElement dataStructureintro_HomePage; 
	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']") WebElement practice_ques;
	
	@FindBy (xpath = "//a[@href='/tryEditor']") WebElement Tryhere_link;
	@FindBy (css = ".CodeMirror") WebElement textEditor; 
	@FindBy (xpath = "//button[text() = 'Run']") WebElement run_button;
	@FindBy (id = "output") WebElement output;
	@FindBy(xpath = "//a[@class='navbar-brand']") WebElement NumpyNinja_homepage;
	
	ConfigReader config;


	public dataStructure_PF() {
		driver=ConfigDriver.getBrowser();
		PageFactory.initElements(driver, this);
		config = new ConfigReader();
						
			 				
	}
	
	public void gotopage() {
		try {
			  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(220));
			 String url = config.getHomePage();
			 System.out.println(url);
			 driver.get(url);
		  }
			  catch(Exception ex) {
				  LoggerLoad.error("Exception occured in GraphPage: gotopage function:" + ex.getMessage());
			  }	
		  }
	public void loginpage() {
		try {
			  LoggerLoad.info("Navigate to login page");
			  GetStarted_btn.click();
			  Signin.click();
			  userName.sendKeys(config.getProperty("username"));
			  password.sendKeys(config.getProperty("password"));
			  loginbutton.click();
		  }
			  catch(Exception ex) {
				  LoggerLoad.error("Exception occured in GraphPage: loginPage function:" + ex.getMessage());
			  }
	}
	
	public void dataStructure_getStarted() {
		LoggerLoad.info("Navigate to dataStructure introduction page");
		dataStructuregetStrated_button.click();
	}
	
	public void dataStructure_homepage() {
		LoggerLoad.info("Navigate to Data Structure introduction page");
		
		String expectedText = "Data Structures-Introduction";
		String actualText = dataStructureintro_HomePage.getText();
		
		System.out.println(actualText);
		System.out.println("User navigates to Data Structure-Introduction");
		
		assert actualText.equals(expectedText) : "dataStructure home page text does not match expected text";  
	}
	


	
	
	public void timecomplexity() {
		LoggerLoad.info("User clicks on timecomplexitylink ");
		TimeComplexity_link.click();
		  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));		
	}
	
	public void click_tryhere_btn() {
		LoggerLoad.info("User clicks the tryhere button in Data Structure-Introduction page");
		Tryhere_link.click();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));     

	}
	
	public void tryeditorPage() {
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));
		LoggerLoad.info("User navigates to python code editor page");

		System.out.println(run_button.getText());
	     System.out.println("user is in editor page");

	}
	public void inputEditor(String input) {
		  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));		  

		  LoggerLoad.info("user validates the various code in Input editor page");
		  System.out.println(input);
		  js.executeScript("arguments[0].CodeMirror.setValue('"+input+"')",textEditor);
		  	  
	  }
	
	
	
	public void click_run() {
		  LoggerLoad.info("user clicks on run button to validate various code");
		  run_button.click();
	  }
	public void check_output(String expectedOutput) {
		  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(220));
		  System.out.println(expectedOutput);
		  
		  if (expectedOutput.contains("SyntaxError")) {
			  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(220));

			  Alert alert = driver.switchTo().alert();
			  String alertMessage = driver.switchTo().alert().getText();
			  System.out.println(alertMessage);
			  alert.accept();
			  LoggerLoad.info("Invalid input : error occurs");
			  
			  assert alertMessage.contains("SyntaxError: bad input on line 1"): "Scenario-Invalid Input:Fail";
			  System.out.println("Error input: passed ");		  		
		   }
		  else {
			LoggerLoad.info("Valid input verified");
			
			System.out.println("Valid Input " + output.getText());
			  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(220));

			  LoggerLoad.info("Empty Input");
			  
			  assert output.getText().equalsIgnoreCase(expectedOutput) : "Scenario-Valid Input:Fail";
		}
		  	  
	  }
	
	
	
	public void practiceQues() {
		  LoggerLoad.info("Clicking on practice question page");
		  practice_ques.click();
		  String expectedText = "NumpyNinja";
		  String actualText = NumpyNinja_homepage.getText();
		  System.out.println(actualText);
		  System.out.println("Blank page appears capturing NumpyNinja header image ");
		  assert actualText.equals(expectedText) : "Numpy Ninja homepage text does not match expected Text";
		  //Assert.assertEquals("Numpy Ninja homepage text does not match expected Text", expectedText, actualText);	  
		  	 	  
	  }
	public void redirectHomepage() {
		  LoggerLoad.info("Redirected to home page of specified element link");
		  driver.navigate().back();
	  }
	

	public void HomePage() {
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
    	LoggerLoad.info("Redirected to Numpy Ninja home page");
		NumpyNinja_homepage.click();
	}

	
	
}