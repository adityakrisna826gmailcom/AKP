package tugas.selenium.demoqa.page.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;



public class TextBoxPage {

	private WebDriver driver;
	
	public TextBoxPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userName")
	private WebElement fullName;
	
	@FindBy(id = "userEmail")
	private WebElement email;
	
	@FindBy(id = "currentAddress")
	private WebElement currentAddress;
	
	@FindBy(id = "permanentAddress")
	private WebElement permanentAddress;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	@FindBy(id = "name")
	private WebElement txtName;
	
	public void textBox(String fullName, String email, String currentAddress, String permanentAddress) throws InterruptedException {
		this.fullName.sendKeys(fullName);
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.currentAddress.sendKeys(currentAddress);
		Thread.sleep(1000);
		this.permanentAddress.sendKeys(permanentAddress);
		Thread.sleep(1000);
		btnSubmit.click();
	}
	
	public String getTxtName() {
		return txtName.getText();
	}
	
	
}
