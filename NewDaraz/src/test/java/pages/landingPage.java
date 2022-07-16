package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPage {
	
	protected WebDriver driver;
	private By myAccountButton = By.xpath("//span[@id=\"myAccountTrigger\"]");
	private By manageAccountButton = By.xpath("//a[@href='//member.daraz.pk/user/account#/']");

	public landingPage(WebDriver driver) {
		
		this.driver = driver;

	}
	public void clickAccountName() {
		// TODO Auto-generated method stub
		driver.findElement(myAccountButton).click();
		
	}

	public void manageAccount() {
			
			driver.findElement(manageAccountButton).click();
	}

}
