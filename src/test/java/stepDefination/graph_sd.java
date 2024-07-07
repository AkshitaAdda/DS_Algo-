package stepDefination;

import PageObjects.graph_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class graph_sd {
	
	graph_PF graphPage = new graph_PF(); 

	@Given("User is in DsAlgo home Page of Graph page")
	public void user_is_in_ds_algo_home_page_of_graph_page()  {
		graphPage.navigateToPage();
	  
	}

	@When("The user logs in with username {string} and password {string} of Graph Page")
	public void the_user_logs_in_with_username_and_password_of_graph_page(String string, String string2)  {
		graphPage.loginPage();
		   

	}

	@When("The user navigates to the Graph page by clicking Get start button")
	public void the_user_navigates_to_the_graph_page_by_clicking_get_start_button() {
		graphPage.graph_getStarted();
		   

	}

	@Then("The user is in the Graph home page")
	public void the_user_is_in_the_graph_home_page() {
		graphPage.graph_HomePage();
		  

	}


@Given("The user is in Graph page")
public void the_user_is_in_graph_page() throws InterruptedException {
		//graphPage.graph_HomePage();
		   Thread.sleep(1000);

	   
	}

	@When("The user clicks Graph link")
	public void the_user_clicks_graph_link() throws InterruptedException {
		graphPage.usertraversal("Graph");
		   Thread.sleep(1000);

	}

	@When("Click Try Here button of Graph Page")
	public void click_try_here_button_of_graph_page()throws InterruptedException {
		graphPage.click_tryHere_btn();
		   Thread.sleep(1000);

	}

	@Then("The user directed to editor input page of Graph")
	public void the_user_directed_to_editor_input_page_of_graph()  throws InterruptedException {
		graphPage.tryEditor();
		   Thread.sleep(1000);

	}

	@Given("The user is in  editor input page of Graph")
	public void the_user_is_in_editor_input_page_of_graph()throws InterruptedException {
		graphPage.tryEditor();
		   Thread.sleep(1000);

	}
	
	@When("The user runs the code by clicking Run button of Graph page")
	public void the_user_runs_the_code_by_clicking_run_button_of_graph_page()  throws InterruptedException {
		graphPage.click_run();
		   Thread.sleep(1000);

	}
	
	@Then("The output should be expected {string} of Graph page")
	public void the_output_should_be_expected_of_graph_page(String string) throws InterruptedException {
		graphPage.check_output(string);
		   Thread.sleep(1000);

	}

	@When("The user checks correct output for various Valid Input and {string} of Graph page")
	public void the_user_checks_correct_output_for_various_valid_input_and_of_graph_page(String string) throws InterruptedException {
		graphPage.inputEditor(string);
		   Thread.sleep(1000);

	}
	

	@When("The user checks correct output for various Empty Input and {string} of Graph page")
	public void the_user_checks_correct_output_for_various_empty_input_and_of_graph_page(String string)throws InterruptedException {
		graphPage.inputEditor(string);
		   Thread.sleep(1000);

	   
	}

	@When("The user checks correct output for various Invalid Input and {string} of Graph page")
	public void the_user_checks_correct_output_for_various_invalid_input_and_of_graph_page(String string) throws InterruptedException {
		graphPage.inputEditor(string);
		   Thread.sleep(1000);

	   
	}

	@Given("The user redirected to Graph home page")
	public void the_user_redirected_to_graph_home_page() throws InterruptedException {
		graphPage.redirectHomepage();
		   Thread.sleep(1000);

	}

	@When("The user clicks  Graph Representations link")
	public void the_user_clicks_graph_representations_link() throws InterruptedException {
		graphPage.usertraversal("Graph Representation");
		   Thread.sleep(1000);

	}

	@When("Click Try Here button of Graph Representations page")
	public void click_try_here_button_of_graph_representations_page() throws InterruptedException {
		graphPage.click_tryHere_btn();
		   Thread.sleep(1000);

	}

	@Then("The user directed to python editor input page of Graph Representations")
	public void the_user_directed_to_python_editor_input_page_of_graph_representations() throws InterruptedException {
		graphPage.tryEditor();
		   Thread.sleep(1000);

	}

	@Given("The user is in python editor input page  Graph Representations link")
	public void the_user_is_in_python_editor_input_page_graph_representations_link() throws InterruptedException {
		graphPage.tryEditor();
		   Thread.sleep(1000);

	   
	}

	@When("The user checks correct output for various Valid Input and {string} of Graph Representations")
	public void the_user_checks_correct_output_for_various_valid_input_and_of_graph_representations(String string) throws InterruptedException {
		graphPage.inputEditor(string);
		   Thread.sleep(1000);

	}

	@When("The user click Run button to validate the codes of Graph Representations link")
	public void the_user_click_run_button_to_validate_the_codes_of_graph_representations_link() throws InterruptedException {
		graphPage.click_run();
		   Thread.sleep(1000);

	}

	@Then("The output should  be expected {string} of  Graph Representations")
	public void the_output_should_be_expected_of_graph_representations(String string) throws InterruptedException {
		graphPage.check_output(string);
		   Thread.sleep(1000);

	}

	@When("The user checks correct output for various Empty Input and {string} of Graph Representations")
	public void the_user_checks_correct_output_for_various_empty_input_and_of_graph_representations(String string) throws InterruptedException {
		graphPage.inputEditor(string);
		   Thread.sleep(1000);

	   
	}

	@When("The user checks correct output for various Invalid Input and {string} of Graph Representations")
	public void the_user_checks_correct_output_for_various_invalid_input_and_of_graph_representations(String string) throws InterruptedException {
		graphPage.inputEditor(string);
		   Thread.sleep(1000);

	   
	}

	@Given("The user redirected to Practice Question Link of Graph page")
	public void the_user_redirected_to_practice_question_link_of_graph_page() throws InterruptedException  {
		graphPage.redirectHomepage();
		Thread.sleep(1000);
	   
	}
	
	@When("The user clicks  Practice Question Link of Graph Page")
	public void the_user_clicks_practice_question_link_of_graph_page() throws InterruptedException{
		graphPage.practiceQues();
	    Thread.sleep(1000);
	}

	@Then("The user directed to blank page of Graph")
	public void the_user_directed_to_blank_page_of_graph() {
	    
	   
	}

	@Given("The user redirected to Graph page from blank page")
	public void the_user_redirected_to_graph_page_from_blank_page() {
		graphPage.redirectHomepage();

	   
	}

	@When("The user clicks on back button from Graph Page")
	public void the_user_clicks_on_back_button_from_graph_page(){
	    
	   
	}

	@Then("The user directed to home page of Numpy Ninja from Graph")
	public void the_user_directed_to_home_page_of_numpy_ninja_from_graph() {
		graphPage.redirectHomepage();

	}

	


	@Given("The user is on the {string} Home page")
	public void the_user_is_on_the_home_page(String string) {
		graphPage.graph_HomePage();

	}

	




	}