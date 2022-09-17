package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;
import tugas.selenium.demoqa.util.Constants;

public class TestCategories {

	public static WebDriver driver;
	private CategoriesPage categoriesPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLNOPCOMMERCE);
		categoriesPage = new CategoriesPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test(priority = 0)
	public void testCategories() {
		categoriesPage.kategori("Shoes");
		assertTrue(categoriesPage.getAparel().contains("Apparel"));
	}
}
