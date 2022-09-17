package ujian.ujiankeempat.nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;

public class ManufacturePage {

private WebDriver driver;
	
	public ManufacturePage() {
		this.driver= DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//p[normalize-space()='Catalog']")
	private WebElement btnCatalog;
	
	@FindBy(xpath = "//p[normalize-space()='Manufacturers']")
	private WebElement btnManufacture;
	
	@FindBy(xpath = "//input[@id='SearchManufacturerName']")
	private WebElement manufactureName;
	
	@FindBy(xpath = "//button[@id='search-manufacturers']")
	private WebElement btnSearchManufacture;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement btnLogout;
	
	@FindBy(xpath = "//h1[normalize-space()='Admin area demo']")
	private WebElement txtAdmin;
	
	public void productTags(String manufactureName) throws InterruptedException
	{
		btnLogin.click();
		btnCatalog.click();
		Thread.sleep(1000);
		btnManufacture.click();
		Thread.sleep(1000);
		this.manufactureName.sendKeys(manufactureName);
		Thread.sleep(3000);
		btnSearchManufacture.click();
		Thread.sleep(3000);
		btnLogout.click();
		Thread.sleep(5000);
	}
	
	public String getAdmin() {
		return txtAdmin.getText();
	}
	
}
