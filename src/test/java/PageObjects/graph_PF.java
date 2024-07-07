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

public class graph_PF {
	
		static WebDriver driver = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//String url = "https://dsportalapp.herokuapp.com/";

		@FindBy(xpath="//button[@class='btn']") WebElement GetStarted_btn;
		@FindBy(xpath = "//a[normalize-space()='Sign in']") WebElement Signin;
		@FindBy(id = "id_username") WebElement username;
		@FindBy(id = "id_password") WebElement password;
		@FindBy(xpath = "//input[@value='Login']") WebElement loginButton;
		@FindBy(xpath ="//a[@href='graph']") WebElement Graphgetstarted_btn;
		@FindBy(xpath = "//a[@class='list-group-item']") WebElement graph_link;
		@FindBy(xpath = "//h4[@class='bg-secondary text-white']") WebElement graph_HomePage; 
		@FindBy(xpath = "//a[normalize-space()='Graph Representations']") WebElement graphrepresentation_link;
		@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']") WebElement practice_ques;

		@FindBy (xpath = "//a[@href='/tryEditor']") WebElement Tryhere_link;
		@FindBy (css = ".CodeMirror") WebElement textEditor; 
		@FindBy (xpath = "//button[@type='button']") WebElement run_button;
		@FindBy (id = "output") WebElement output;
		@FindBy(xpath = "//a[@class='navbar-brand']") WebElement NumpyNinja_homepage;
		@FindBy (xpath = "//a[@href='logout']") WebElement sign_out;
		@FindBy (xpath = "//div[@class='alert alert-primary']") WebElement logout_msg;
		
		ConfigReader config;
		
	public graph_PF() {
		driver=ConfigDriver.getBrowser();
		PageFactory.initElements(driver, this);
		config=new ConfigReader();
		}
	
  public void navigateToPage() {
	  try {
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));
			String url=config.getHomePage();
			System.out.println(url);
			driver.get(url);
			}
			catch (Exception ex) {
				LoggerLoad.error("Exception occurred in GraphPage: navigateToPage function: " + ex.getMessage());

			}
  }
	
  
  public void loginPage() {
	  try {
		  LoggerLoad.info("Navigate to login page");
		  GetStarted_btn.click();
		  Signin.click();
		  username.sendKeys(config.getProperty("username"));
		  password.sendKeys(config.getProperty("password"));
		  loginButton.click();
	  }
		  catch(Exception ex) {
			  LoggerLoad.error("Exception occured in GraphPage: loginPage function:" + ex.getMessage());
		  }
  }
  public void graph_getStarted() {
	  Graphgetstarted_btn.click();
  }
  
  public void graph_HomePage() {
	  LoggerLoad.info("Navigate to Graph home page");
	  
	  String expectedText = "Graph"; //Replace with actual expected text
	  String actualText = graph_HomePage.getText(); 
	  
	  System.out.println("actualText");
	  System.out.println("user navigate to graph home page");
	  
	  assert actualText.equals(expectedText) : "Graph homepage text does not match expected text";
  }
  
  public void usertraversal(String strInput) {
	  LoggerLoad.info("user checking each elements");
	  
	  WebElement element=null;
	  if (strInput=="Graph")
		  element=graph_link;
	  else if (strInput=="Graph Representation")
		element=graphrepresentation_link;
	  
	  System.out.println("Scenario : " + element.toString().split("'")[1]);
	  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));
	  
	  LoggerLoad.info("Verifying scenario:" + element.getText() );
	  element.click();
	  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));	
  }
  
  public void click_tryHere_btn() {
	  LoggerLoad.info("User clicks on tryhere button in graph homepage");
	  Tryhere_link.click();
	  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));	
	  
  }
  public void tryEditor() {
	  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));	
     LoggerLoad.info("user navigates to pythoncode editor page");
     
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
  
  /*public void homepage() {
	  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));	
	  NumpyNinja_homepage.click();
  }
  
  public void signout() {
	  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(120));	
	  sign_out.click();
  }
  
  public void logoutMsg() {
	  System.out.println(logout_msg.getText());
	  
  }
  
  public void close() {
	  driver.close();

  */}






		

