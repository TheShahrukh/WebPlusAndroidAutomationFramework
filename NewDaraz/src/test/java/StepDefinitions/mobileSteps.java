package StepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import junit.framework.Assert;


public class mobileSteps {
	
	AppiumDriver<MobileElement> driver;
	
	@Given("I have opened daraz app")
	public void i_have_opened_daraz_app() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Shan's");
		cap.setCapability("udid", "f7a2f2e81020");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10.0");
		
		cap.setCapability("appPackage", "com.daraz.android");
		cap.setCapability("appActivity", "com.lazada.activities.EnterActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		
	}

	@And("I Skipp to the app")
	public void i_skipp_to_the_app() {
	    
		
		MobileElement skipToTheApp = driver.findElement(By.id("com.daraz.android:id/intro_skip_btn"));
		skipToTheApp.click();
	}

	@And("I click at account app")
	public void i_click_at_account_app() throws InterruptedException {
	    
		Thread.sleep(16000);
//		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.or(
				    ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView[2]"))
				));
			MobileElement closePopUp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView[2]"));
			closePopUp.click();
		} catch (NoSuchElementException exception) {
		    //return FAILURE;
		}
	
		
		MobileElement accountBar = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));
		accountBar.click();
		
		
		
		
		
		
	}

	@And("I click to login button app")
	public void i_click_to_login_button_app() {
	   
		
		MobileElement loginSingUp = driver.findElement(By.id("com.daraz.android:id/txt_login_signup"));
		loginSingUp.click();
		
	}

	@And("I click at login with password button app")
	public void i_click_at_login_with_password_button_app() throws Exception {
	    
		Thread.sleep(5000);
		MobileElement signInWithPasswordButton = driver.findElement(By.id("com.daraz.android:id/tv_signin"));
		signInWithPasswordButton.click();
		
	}

	@And("I have given email and password in App")
	public void i_have_given_email_and_password_in_app() throws Exception {
	    
		
		Thread.sleep(5000);
		
		MobileElement email = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
		MobileElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
		
		email.sendKeys("shane.buriro@gmail.com");
		password.sendKeys(".scorpian.");
		
		
	}

	@And("I click at login button app")
	public void i_click_at_login_button_app() {
	    
		System.out.println("print I click at login button app");
		
		MobileElement loginButton = driver.findElement(By.id("com.daraz.android:id/btn_next"));
		loginButton.click();
	}
	
	@And("I click at settings icon")
	public void i_click_at_settings_icon() throws Exception {
	    
		Thread.sleep(2000);
		MobileElement settingsButtom = driver.findElement(By.id("com.daraz.android:id/tv_settings"));
		settingsButtom.click();
	}
	
	@And("I click at addressBook")
	public void i_click_at_addressBook() throws Exception{
	    
		Thread.sleep(2000);
		MobileElement addressBook = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
		addressBook.click();
	}
	

	@And("I Verify the AdressDetail")
	public void i_get_addressdetail() throws Exception{
	    
		Thread.sleep(2000);
		MobileElement addressDetailTextView = driver.findElement(By.id("com.daraz.android:id/tv_address_detail"));
		
		String addressDetail = addressDetailTextView.getText().toString();
		String expectedDetail = "HOME House Number 41";
		
		
		Assert.assertEquals(addressDetail, expectedDetail);
		
		
//		addressBook.click();
	}
	
	
	

}
