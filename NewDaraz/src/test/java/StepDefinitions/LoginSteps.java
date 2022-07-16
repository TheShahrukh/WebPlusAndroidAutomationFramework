package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AddAdressPage;
import pages.AddressPage;
import pages.landingPage;
import pages.loginPage;
import pages.welcomePage;

public class LoginSteps {
	
	
	WebDriver driver = null;
	loginPage login;
	landingPage landing;
	AddAdressPage addAdressPage;
	
	

	@Given("browser window is open")
	public void browser_is_open() {
		
		System.out.println("Inside Step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/Resources/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}
	
	@Given("I have arrived at daraz.pk")
	public void i_have_arrived_at_daraz_pk() {
		// Write code here that turns the phrase above into concrete actions
				System.out.println("inside login page");
				driver.navigate().to("https://www.daraz.pk/");
	}
	
	@And("I clicked at login button.")
	public void i_clicked_at_login_button() {
		System.out.println("2nd step");
		
		welcomePage welcome = new welcomePage(driver);
		welcome.clickLogin();
		
//		WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'login')]"));
//		loginButton.click();
	}

	@And("I have given username and password")
	public void i_have_given_shan_and_shan() {
		System.out.println("2nd step");
		
		login = new loginPage(driver);
		
		login.enterUsername("shahrukh.bashir99@gmail.com");
		login.enterPassword("Scorpian1014");
		
	}

	@And("I click at login button")
	public void i_click_at_login_button() {
		
		login.clickLogin();
		
		
	}
	
	@And("I should arrive at daraz.pk")
	public void i_should_arrive_at_daraz_pk() throws Exception {
		
		System.out.println("4step");
		landing = new landingPage(driver);
		Thread.sleep(10000);
		landing.clickAccountName();
		Thread.sleep(2000);
//		landing.verifyThroughAccountName();
		landing.manageAccount();
		
			
	}
	
	@And("I Have clicked on manage account.")
	public void i_have_clicked_on_manage_account() throws Exception {
	    
	}

	@And("I have clicked on add address book.")
	public void i_have_clicked_on_add_address_book() throws InterruptedException {
		Thread.sleep(5000);
		AddressPage address = new AddressPage(driver);
		address.clickAddAddress();
		
	}

	@And("I have given full name.")
	public void i_have_given_full_name() throws Exception {
		Thread.sleep(4000);
		addAdressPage = new AddAdressPage(driver);
		addAdressPage.enterFullName("Shahrukh");
	}

	@And("I have given phone number.")
	public void i_have_given_phone_number() {
	    
		addAdressPage.enterPhoneNumber("03313411357");
	}

	@And("I have choosed province")
	public void i_have_choosed_province() throws Exception {
		addAdressPage.enterProvince("Sindh");
	    ;
	}

	@And("I have choosed city")
	public void i_have_choosed_city() throws Exception {
		addAdressPage.enterCity("Karachi - Clifton");
	    
	}

	@And("I have choosed area.")
	public void i_have_choosed_area() throws Exception {
		
		addAdressPage.chooseArea("Block 8");
	    
	}

	@And("I have given Adress.")
	public void i_have_given_adress() throws Exception {
		
		addAdressPage.giveAddress("House Number 41");
	}

	@And("I have clicked Home.")
	public void i_have_clicked_home() throws Exception {
		addAdressPage.selectHome();
	    
	}

	@Then("I have clicked save button.")
	public void i_have_clicked_save_button() throws Exception {
		addAdressPage.save();
	    
	}

	@Then("It should save my address.")
	public void it_should_save_my_address() {
		//addAdressPage.save();
		
	    
	}
	
	
	

}
