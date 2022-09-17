package ujian.ujiankeempat.nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;

public class ProductTagsPage {

private WebDriver driver;
	
	public ProductTagsPage() {
		this.driver= DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//p[normalize-space()='Catalog']")
	private WebElement btnCatalog;
	
//	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Clear cache'])[1]/following::p[4]")
//	private WebElement btnCatalogShow;
	
	@FindBy(xpath = "//p[normalize-space()='Product tags']")
	private WebElement btnProduct;
	
	@FindBy(xpath = "//input[@id='SearchTagName']")
	private WebElement searchProduk;
	
	@FindBy(id = "search-product-tags")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//input[@name='checkbox_producttags']")
	private WebElement btnCheckBox;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement btnLogout;
	
	@FindBy(xpath = "//h1[normalize-space()='Admin area demo']")
	private WebElement txtAdmin;
	
	
	
	public void productTags(String produk) throws InterruptedException
	{
		btnLogin.click();
		btnCatalog.click();
		Thread.sleep(1000);
//		btnCatalogShow.click();
		btnProduct.click();
		Thread.sleep(1000);
		this.searchProduk.sendKeys(produk);
		Thread.sleep(3000);
		btnSearch.click();
		Thread.sleep(3000);
//		btnCheckBox.click();
		btnLogout.click();
		Thread.sleep(3000);
	}
	
	public String getAdmin() {
		return txtAdmin.getText();
	}
}
