package stepDefination;

import static org.testng.Assert.assertEquals;

import PageObjects.register_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class register_sd {
	
	register_PF RegisterPage = new register_PF();
	
	@Given("Use should open the dsAlgo portal Link")
	public void use_should_open_the_ds_algo_portal_link() throws InterruptedException {
		LoggerLoad.info("DS Algo portal");
		RegisterPage.goTopage();
		Thread.sleep(3000);
		
	    
	}

	@When("The user should click on {string} link")
	public void the_user_should_click_on_link(String string) throws InterruptedException {
		LoggerLoad.info("The user clicks on getStarted button");
		RegisterPage.getStarted();
		Thread.sleep(3000);
	    
	}

	@Then("The user should land on home page")
	public void the_user_should_land_on_home_page() throws InterruptedException {
		String title = RegisterPage.getTitleofPage();
	    LoggerLoad.info("user is on " + title + "page" );
		Thread.sleep(3000);

	    
	}

	@Given("The user is on  Ds Algo home page")
	public void the_user_is_on_ds_algo_home_page() {
		
	    
	}

	@When("The user clicks on Register link")
	public void the_user_clicks_on_register_link() {
		RegisterPage.Registerlink();
	    
	}

	@Then("The the user is on register page")
	public void the_the_user_is_on_register_page() throws InterruptedException {
		String title = RegisterPage.getTitleofPage();
	    LoggerLoad.info("user is on " + title + "page" );
		Thread.sleep(3000);
	    
	}

	@Given("The user is on register page")
	public void the_user_is_on_register_page() throws InterruptedException {
		
	    
	}

	@When("The user clicks on register button with all empty fields")
	public void the_user_clicks_on_register_button_with_all_empty_fields() {
		RegisterPage.register_btn();
	    
	}

	@Then("User should see the message {string} at the username field")
	public void user_should_see_the_message_at_the_username_field(String string) {
		RegisterPage.verifyRegistererrormsg(string);
	    
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
	    
		RegisterPage.enterUsername(string);
	}

	@When("User clicks the register button with empty password and empty confirm password")
	public void user_clicks_the_register_button_with_empty_password_and_empty_confirm_password() {
		RegisterPage.register_btn();
	    
	}

	@Then("User should see the message at password {string}")
	public void user_should_see_the_message_at_password(String string) {
		
		RegisterPage.verifyRegistererrormsg(string);

	    
	}

	@When("User enter UserName {string} and password {string}")
	public void user_enter_user_name_and_password(String string, String string2) {
		RegisterPage.enterUsername(string);
		RegisterPage.enterPassword(string2);

	    
	}

	@When("User clicks on register button with confirmpassword field empty")
	public void user_clicks_on_register_button_with_confirmpassword_field_empty() {
		RegisterPage.register_btn();

	    
	}

	@Then("User should see the message at Confirmpassword {string}")
	public void user_should_see_the_message_at_confirmpassword(String string) {
	    
		RegisterPage.verifyRegistererrormsg(string);

	}

	@When("The user enters the {string} in user name field")
	public void the_user_enters_the_in_user_name_field(String string) {
	    RegisterPage.enterUsername(string);
	}

	@When("The user enters the  {string} in password field")
	public void the_user_enters_the_in_password_field(String string) {
	    RegisterPage.enterPassword(string);

	}

	@When("The user enters the {string} in confirmpassword field")
	public void the_user_enters_the_in_confirmpassword_field(String string) {
	    RegisterPage.enterConfrmPassword(string);

	}

	@When("The user enters the password as {string}")
	public void the_user_enters_the_password_as(String string) {
	    RegisterPage.enterPassword(string);
	}




	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
		RegisterPage.register_btn();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	    
	}

	@Then("The user should see the error message {string} in register page")
	public void the_user_should_see_the_error_message_in_register_page(String string) throws InterruptedException {
	    String alertmsg = RegisterPage.invalidalertmsg();
	    System.out.println(alertmsg);
	    LoggerLoad.info("The actual alert is "+alertmsg);
	  	    assertEquals(string, alertmsg);
			Thread.sleep(3000);

	}

	@When("The user enters Username as {string}")
	public void the_user_enters_username_as(String string) throws InterruptedException {
		RegisterPage.enterUsername(string);
		Thread.sleep(3000);

	}

	@When("The user enters the paswword as {string}")
	public void the_user_enters_the_paswword_as(String string) throws InterruptedException {
		RegisterPage.enterPassword(string);
		Thread.sleep(3000);

	}

	@When("The user enters the confirmPassword as {string}")
	public void the_user_enters_the_confirm_password_as(String string) throws InterruptedException {
		RegisterPage.enterConfrmPassword(string);
		Thread.sleep(3000);

	}

	@When("The user clicks on the register button")
	public void the_user_clicks_on_the_register_button() throws InterruptedException {
	    
		RegisterPage.register_btn();
		Thread.sleep(3000);

	}

	@Then("The user should see the message {string}")
	public void the_user_should_see_the_message(String string) throws InterruptedException {
		RegisterPage.sucessmsg();
		Thread.sleep(3000);

	}
	@Then("When The user logs in with username {string} and password {string} by clickinkg Siginbutton")
	public void when_the_user_logs_in_with_username_and_password_by_clickinkg_siginbutton(String string, String string2) {
		RegisterPage.loginPage();
		   

	}


	}	