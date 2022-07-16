package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddAdressPage {
	
protected WebDriver driver;
	
	private By fullName = By.xpath("//input[@placeholder='Enter your first and last name. Example: \"Mohammad Ali\"']");
	private By phoneNumber = By.xpath("//input[@placeholder='Please enter your phone number']");
	private By province = By.xpath("//span[contains(text(),'Please choose your province')]");
	private By city = By.xpath("//span[contains(text(),'Please choose your city')]");
	private By area = By.xpath("//span[contains(text(),'Please choose your area')]");
	private By address = By.xpath("//input[@placeholder='For Example: House# 123, Street# 123, ABC Road']");
	private By home = By.xpath("//span[contains(text(),'HOME')]");
	private By saveButton = By.xpath("//button[@type=\"submit\"]");
	
	
	
	
	
	
	public AddAdressPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void enterFullName(String name) {
		
		driver.findElement(fullName).click();
		driver.findElement(fullName).sendKeys(name);	
	}
	public void enterPhoneNumber(String number) {
		
		driver.findElement(phoneNumber).click();
		driver.findElement(phoneNumber).sendKeys(number);	
	}
	
	public void enterProvince(String provinceName) throws Exception {
		
//		Select dropdown = new Select(driver.findElement(province));
//		Thread.sleep(2000);
//		dropdown.selectByValue(provinceName);
		driver.findElement(province).click();
		Thread.sleep(2000);
		String xPath = "//li[@name=\""+provinceName+"\"]";
		System.out.println(xPath+"------");
		driver.findElement(By.xpath(xPath)).click();	
		
	}
	
	public void enterCity(String cityName) throws Exception {
			
			Thread.sleep(2000);
			driver.findElement(city).click();
			//Thread.sleep(2000);
			String xPath = "//li[@name=\""+cityName+"\"]";
			System.out.println(xPath+"------");
			driver.findElement(By.xpath(xPath)).click();	
		}
	
	public void chooseArea(String areaName) throws Exception {
		
			Thread.sleep(2000);
			driver.findElement(area).click();
			//Thread.sleep(2000);
			String xPath = "//li[@name=\""+areaName+"\"]";
			System.out.println(xPath+"------");
			driver.findElement(By.xpath(xPath)).click();	
		}
	public void giveAddress(String givenAddress) throws InterruptedException {
		driver.findElement(address).click();
		driver.findElement(address).sendKeys(givenAddress);
		Thread.sleep(2000);
		
	}
	public void selectHome() throws InterruptedException {
		driver.findElement(home).click();
		Thread.sleep(2000);
	}
	public void save() throws Exception {
		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
		
//		Actions actions = new Actions(driver);
//
//		actions.moveToElement((WebElement) saveButton).click().perform();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

//		jse.executeScript("arguments[0].scrollIntoView()", saveButton);
		WebElement button = driver.findElement(saveButton);
		jse.executeScript("arguments[0].click();", button );
		
//		driver.findElement(saveButton).click();
	}
	
	
	

}
