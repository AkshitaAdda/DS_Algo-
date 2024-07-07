package runner;

import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import dsalgoUtilities.LoggerLoad;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = {"src/test/resources/features/03_dataStructure.feature"},
                glue = "stepDefination",
                //dryRun=true
               plugin = {"pretty", "html:target/cucumber.html",
            		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
            		   "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
               )

//public class TestRun{
	
	//public void main() {
		//LoggerLoad.info("Main Function started");
	//}


  public class TestRunner extends AbstractTestNGCucumberTests{
      
     // @Override
      //@DataProvider(parallel = true)
      //public Object[][] scenarios() {
                  
        // return super.scenarios();   
      //}
}