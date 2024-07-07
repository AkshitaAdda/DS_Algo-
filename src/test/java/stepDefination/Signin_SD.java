package stepDefination;

import static org.testng.Assert.assertEquals;

import PageObjects.SignIn_POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class Signin_SD {

	SignIn_POM signIn = new SignIn_POM();
	//static String username;
	//static String password;


	@Given("User should open the Ds algo potal link")
	public void user_should_open_the_ds_algo_potal_link() throws InterruptedException {
	LoggerLoad.info("-----DSAlgo Portal----");
	signIn.dsalgoportal();
	Thread.sleep(2000);
	   
	   
	}
	@When("User should click on {string} link")
	public void user_should_click_on_link(String string) throws InterruptedException {
	LoggerLoad.info("-----click on get started button----");
	    signIn.GetStartedbtn();  
	    Thread.sleep(2000);
	}

	@Then("User should land on home page")
	public void user_should_land_on_home_page() {
		String title = signIn.getTitleofPage();
	    LoggerLoad.info("-----User is on "+ title + "Page----");
	    assertEquals(title,"NumpyNinja");
	}
	


	@Given("The user is on home page")
	public void the_user_is_on_home_page() {
	LoggerLoad.info("----User is on homepage----");
	    signIn.getLoginurl();
	   
	 }
	
	@When("The user should click on Register link")
	public void the_user_should_click_on_Register_link() {
	LoggerLoad.info("----User clicks on Register link----");
	signIn.register();
	   
	}
	@Then("The user is redirected to Register page")
	public void the_user_is_redirected_to_Register_page() throws InterruptedException {
	   String title =signIn.registerlink();
	   LoggerLoad.info("----User is  Redirected to Register page link----" +title);
	   assertEquals(title,"Registration");  
	   Thread.sleep(2000);
	}

	@Given("The user is on  Sign in page")
	public void The_user_is_on_Sign_in_page(){

	signIn.getLoginurl();

	}

	

	@Then("User clicks on login button with all empty fields")
	public void user_clicks_on_login_button_with_all_empty_fields() throws InterruptedException {
	LoggerLoad.info("----User is clicking login button with empty fields----");
		signIn.EnterUsername("");
		signIn.EnterPassword("");   
		signIn.Login();
	    Thread.sleep(2000);
	   
	   
	}
	
	@Then("User should see the message at username as {string}")
	public void user_should_see_the_message_at_username_as(String string) {
	    signIn.verifySignin(string);
	
	   
	   
	}
	
	@Given("The user is on DS Algo Sign in page")
	public void the_user_is_on_ds_algo_sign_in_page() {
		signIn.getLoginurl();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("User enters Username as {string}")
	public void user_enters_username_as(String string) {
		signIn.EnterUsername(string);
	}   

	//@Given("The user is on DS Algo Sign in page")
	//public void the_user_is_on_ds_algo_sign_in_page() {
	   
	   
	//}
	@When("User clicks on login button with empty password")
	public void user_clicks_on_login_button_with_empty_password() {
		signIn.EnterPassword("");
		signIn.Login();
	}
	
	
	
	@Then("User should see the message at username {string}")
	public void user_should_see_the_message_at_username(String string) {
//		String text1 = signIn.validateUsernamefield(string);
//		//System.out.println(text1);
//		LoggerLoad.info("User can see" +text1);
//		assertEquals(text1, "Please fill out this field.");
	    signIn.verifySignin(string);

	}
	
	
	//@Given("The user is on DS Algo Sign in page")
	//public void the_user_is_on_ds_algo_sign_in_page() {
	   
	   
	//}
	
	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		signIn.EnterPassword(string);
	}

	@When("User clicks on login button without Username")
	public void user_clicks_on_login_button_without_username() {
		signIn.EnterUsername("");
		signIn.Login();
	}
	
	
	@Then("User should see the message at Password as {string}")
	public void user_should_see_the_message_at_Password_as(String string) {
//	  String text = signIn.validatePasswordfield(string);  
//	  //System.out.println(text);
//	  LoggerLoad.info("User can see " +text);
//	  assertEquals(text, "Please fill out this field.");
	    signIn.verifySignin(string);

	   
	}
	

	@When("User Enters Email as {string}")
	public void user_enters_email_as(String string) {
		signIn.EnterUsername(string);
	}

	   


	@When("Password as {string}")
	public void password_as(String string) {
	signIn.EnterPassword(string);
	   
	   
	}
	@When("Clicks on Login link")
	public void clicks_on_login_link() {
	LoggerLoad.info("------User clicks on login link-----");
	signIn.Login();
	   
	   
	}
	@Then("User should see the msg {string} in Ds Algo homepage")
	public void user_should_see_the_msg_in_ds_algo_homepage(String string) {
	    String successmsg=signIn.SuccessMsg();
	   // System.out.println(successmsg);
	    LoggerLoad.info("The actual msg is "+successmsg);
	   
	   
	   
	   
	}
	//@Given("The user is on DS Algo Sign in page")
	//public void the_user_is_on_ds_algo_sign_in_page() {
	   
	   
	//}
	@When("The user enters the {string} in text box and {string} in text box")
	public void the_user_enters_the_in_text_box_and_in_text_box(String string, String string2) {
	    signIn.EnterUsername(string);
	    signIn.EnterPassword(string2);
	   
	}
	@When("User clicks login button")
	public void user_clicks_login_button() {
	   
	   signIn.Login();
	   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("The user should see the error message {string}")
	public void the_user_should_see_the_error_message(String string) {
	    String alertmsg=signIn.invalidalertMsg();
	    System.out.println(alertmsg);
	    LoggerLoad.info("The actual alert is "+alertmsg);
	    assertEquals(string, alertmsg);
	   
	   
	}
	@When("User clicks on sign out link")
	public void user_clicks_on_sign_out_link() {
	    signIn.signout();
	   
	}
	@Then ("User should see the message {string}")
	public void user_should_see_the_message_(String string) {
	signIn.successfulllogout();
	}



}
