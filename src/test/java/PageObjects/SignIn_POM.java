package PageObjects;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class SignIn_POM {

		static WebDriver driver=null;

		String url = "https://dsportalapp.herokuapp.com/";

		String loginurl = "https://dsportalapp.herokuapp.com/login";
		String registerurl="https://dsportalapp.herokuapp.com/register";
		//String homepageurl="https://dsportalapp.herokuapp.com/home";

		/*public static WebDriver driver = BaseClass.getDriver();
		String loginurl = ConfigReader.loginPage();
		String registerurl = ConfigReader.registerPageURL();
		String homepageurl=ConfigReader.homePage();*/
		@FindBy (xpath ="//button[text()='Get Started']") WebElement GetStartedbtn ;
		@FindBy (xpath ="//a[text()='Sign in']") WebElement Signinbtn ;
		@FindBy (id ="id_username") WebElement Username ;
		@FindBy (id ="id_password") WebElement Password ;
		@FindBy (xpath ="//input[@value='Login']") WebElement Loginlink ;
		@FindBy (xpath ="/html/body/div[3]") WebElement alertmsg ;
		@FindBy (xpath ="//a[text()='Register!']") WebElement Registerlink ;
		@FindBy (xpath ="  //div[@role='alert']") WebElement SuccessfullLogin ;
		@FindBy (linkText ="Sign out") WebElement Signout ;
		@FindBy (xpath ="(//div[@role='alert'])[1]") WebElement SuccessfullLogout ;



		public SignIn_POM()
		{
		
		if(driver==null)
			   driver=new ChromeDriver();
				//driver=new EdgeDriver();
			   //driver=new FirefoxDriver();

			PageFactory.initElements(driver, this);

		}
		//public void gethomepageurl()
		//{
		//driver.get(homepageurl);
		//}

		public void dsalgoportal()
		  {
		     driver.get(url);
		     
		  }

		public void getregisterurl()
		{
		driver.get(registerurl);
		}

		public void GetStartedbtn()
		  {
				GetStartedbtn.click();
			
		 
		  }

		public String getTitleofPage()
		 
		  {
		String title   =driver.getTitle();
		return title;
		  }

	   public void getLoginurl()
		 {

			driver.get(loginurl);
		}



		public void Signinbtn()
		{
		Signinbtn.click();
		}

		public String Signinpagetitle()
		{
		    String title =driver.getTitle()    ;
		    return title;
		}

		public void EnterUsername(String username)
		{
		Username.sendKeys(username);
		}

		public void EnterPassword(String password)
		{
			Password.sendKeys(password);
		}

		public void Login()
		{
		Loginlink.click();
		}

		public void verifySignin(String text)
		{
			System.out.println(text);

			if(text.contains("Please fill out this field.")) {
				driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

	           WebElement activeElement = driver.switchTo().activeElement();
	           String messageStr = activeElement.getAttribute("validationMessage");
	           System.out.println("Actual message appeared on screen: " + messageStr);
	      }
	      
		}

		
		public String SuccessMsg()
		{
		String Successmsg=SuccessfullLogin.getText();
		System.out.println(Successmsg);
		return Successmsg;
		}

		public  String invalidalertMsg()
		{
		String alertMsg =alertmsg.getText();
		System.out.println(alertMsg);
		return alertMsg;
		}

		public String validateUsernamefield(String validationMessage)
		{
		String message = Username.getAttribute(validationMessage);
		System.out.println(message);
		return message;
		}

		public String validatePasswordfield(String validationMessage)
		{
		String message =Password.getAttribute(validationMessage);
		System.out.println(message);
		return message;
		}

		public void register()
		{
		Registerlink.click();
		}

		public String registerlink()
		{
		String title =driver.getTitle();
		return title;
		}

		public void signout()
		{
		Signout.click();
		}

		public String successfulllogout()
		{
		String alertmsg = SuccessfullLogout.getText();
		System.out.println(alertmsg);
		return alertmsg;
		}
	}



