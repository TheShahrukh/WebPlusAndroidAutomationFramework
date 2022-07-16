package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
	
protected WebDriver driver;
	
	private By addAdressButton = By.xpath("//a[@href='/address#/create']");
	
	
	public AddressPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void clickAddAddress() {
		
		driver.findElement(addAdressButton).click();
	}
	
	
	

}
