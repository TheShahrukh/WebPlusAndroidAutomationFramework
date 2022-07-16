package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	protected WebDriver driver;
	
	private By emailBox = By.xpath("//input[@placeholder=\"Please enter your Phone Number or Email\"]");
	
	private By passwordBox = By.xpath("//input[@type=\"password\"]");
	private By loginButton = By.xpath("//button[@type=\"submit\"]");
	
	public loginPage(WebDriver driver) {
		
		this.driver = driver;
//		if(!driver.getTitle().equals("TestProject Demo")) {
//			
//			throw new IllegalStateException("This is not Login Page. The Current page is "
//			+driver.getCurrentUrl());
//		}
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(emailBox).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(passwordBox).sendKeys(password);
	}
	
	public void clickLogin() {
		
		driver.findElement(loginButton).click();
	}
	
	

}
