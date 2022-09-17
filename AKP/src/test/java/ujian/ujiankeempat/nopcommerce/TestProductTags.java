package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;
import tugas.selenium.demoqa.util.Constants;

public class TestProductTags {

	public static WebDriver driver;
	private ProductTagsPage productTagsPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLNOPCOMMERCE);
		productTagsPage = new ProductTagsPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test(priority = 0)
	public void testProductTags() throws InterruptedException {
		productTagsPage.productTags("nice");
		assertTrue(productTagsPage.getAdmin().contains("Admin"));
	}
}
