package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomePage {
	
	protected WebDriver driver;
	private By WelcomeloginButton = By.xpath("//a[contains(text(),'login')]");

	
	public welcomePage(WebDriver driver) {
			
			this.driver = driver;
	//		if(!driver.getTitle().equals("TestProject Demo")) {
	//			
	//			throw new IllegalStateException("This is not Login Page. The Current page is "
	//			+driver.getCurrentUrl());
//		}
	}
	
	public void clickLogin() {
		
		driver.findElement(WelcomeloginButton).click();
	}
	
	

}
