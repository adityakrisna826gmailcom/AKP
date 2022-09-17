package ujian.ujiankeempat.nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;

public class CategoriesPage {

private WebDriver driver;
	
	public CategoriesPage() {
		this.driver= DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//p[normalize-space()='Catalog']")
	private WebElement btnCatalog;
	
	@FindBy(id = "SearchCategoryName")
	private WebElement btnCategoies;
	
	@FindBy(id = "SearchCategoryName")
	private WebElement categories;
	
	@FindBy(id = "search-categories")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//td[normalize-space()='Apparel >> Shoes']")
	private WebElement txtAparel;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Clear cache'])[1]/following::p[4]")
	private WebElement btnCatalogShow;
	
	public void kategori(String categories)
	{
		btnLogin.click();
		btnCatalog.click();
		btnCatalogShow.click();
		btnCategoies.click();
		this.categories.sendKeys(categories);
		btnSearch.click();
	}
	
	public String getAparel() {
		return txtAparel.getText();
	}
}
