package stepDefination;

import PageObjects.dataStructure_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataStructure_sd {
	dataStructure_PF dataStructure = new dataStructure_PF(); 
	@Given("User is in DsAlgo home page")
	public void user_is_in_ds_algo_home_page() throws InterruptedException {
		dataStructure.gotopage();
	    Thread.sleep(2000);
	}

	@When("The user logs in with username {string} and password {string} of DsAlgo")
	public void the_user_logs_in_with_username_and_password_of_ds_algo(String string, String string2) throws InterruptedException {
		dataStructure.loginpage();
		Thread.sleep(2000);
	}

	@When("The user navigates to Data Structure Introduction by clicking Get Started button")
	public void the_user_navigates_to_data_structure_introduction_by_clicking_get_started_button() {
	    
		dataStructure.dataStructure_getStarted();
	}

	@Then("The user is in  Data Structure Introduction home page")
	public void the_user_is_in_data_structure_introduction_home_page() throws InterruptedException {
		dataStructure.dataStructure_homepage();
		Thread.sleep(2000);
	}

	@Given("The user is in  Data Structure Introduction page")
	public void the_user_is_in_data_structure_introduction_page() {
		

	    
	}

	@When("The user clicks in Time complexity link")
	public void the_user_clicks_in_time_complexity_link() throws InterruptedException {
		dataStructure.timecomplexity();
		Thread.sleep(2000);
	}

	@When("The user clicks on Try here button")
	public void the_user_clicks_on_try_here_button() throws InterruptedException {
		dataStructure.click_tryhere_btn();
		Thread.sleep(2000);
	}

	@Then("The user redirected to editor input page of Time complexity")
	public void the_user_redirected_to_editor_input_page_of_time_complexity() throws InterruptedException {
		dataStructure.tryeditorPage();
		Thread.sleep(2000);
	}
	@Given("The user is in DS editor input page of Time complexity")
	public void the_user_is_in_ds_editor_input_page_of_time_complexity() {
		
		dataStructure.tryeditorPage();
	    
	}

	@When("The user checks correct output for various Valid Input and {string} of Time complexity")
	public void the_user_checks_correct_output_for_various_valid_input_and_of_time_complexity(String string)  throws InterruptedException {
		dataStructure.inputEditor(string);
		Thread.sleep(2000);
	}


    @When("The user runs the code by clicking Run button of Time complexity")
    public void the_user_runs_the_code_by_clicking_run_button_of_time_complexity() throws InterruptedException {
		dataStructure.click_run();
		Thread.sleep(2000);
	}

    @Then("The output should be expected {string} of Time complexity")
    public void the_output_should_be_expected_of_time_complexity(String string) throws InterruptedException {
		dataStructure.check_output(string);
		Thread.sleep(2000);
	}

    @When("The user checks correct output for various Empty Input and {string} of Time complexity")
     public void the_user_checks_correct_output_for_various_empty_input_and_of_time_complexity(String string)throws InterruptedException {
		dataStructure.inputEditor(string);
		Thread.sleep(2000);
	}
    
    @When("The user checks correct output for various Invalid Input and {string} of Time complexity")
    public void the_user_checks_correct_output_for_various_invalid_input_and_of_time_complexity(String string)throws InterruptedException {
		dataStructure.inputEditor(string);
		Thread.sleep(2000);
	    
	}

	@Given("The user redirected to Practice Question Link page of Data Structures-Introduction")
	public void the_user_redirected_to_practice_question_link_page_of_data_structures_introduction() throws InterruptedException {
		dataStructure.redirectHomepage();
		Thread.sleep(2000);
	    
	}

	@When("The user clicks  Practice Question Link of Data Structures-Introduction")
	public void the_user_clicks_practice_question_link_of_data_structures_introduction() {
		
	    
	}

	@Then("The user directed to blank page of Data Structures-Introductio")
	public void the_user_directed_to_blank_page_of_data_structures_introductio() throws InterruptedException {
		dataStructure.practiceQues();
		Thread.sleep(2000);
	    
	}

	@Given("The user redirects to data Structured page from blank page")
	public void the_user_redirects_to_data_structured_page_from_blank_page() throws InterruptedException {
		dataStructure.redirectHomepage();
		Thread.sleep(2000);
	    
	}

	@When("The user clicks the back button")
	public void the_user_clicks_the_back_button() {
	    
	    
	}

	@Then("The user directed to home page of Numpy Ninja in dsAlgo")
	public void the_user_directed_to_home_page_of_numpy_ninja_in_ds_algo() throws InterruptedException {
		dataStructure.HomePage();
		Thread.sleep(2000);
	}


}

