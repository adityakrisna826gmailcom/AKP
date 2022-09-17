package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;
import tugas.selenium.demoqa.util.Constants;

public class TestManufacture {

	public static WebDriver driver;
	private ManufacturePage manufacturePage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLNOPCOMMERCE);
		manufacturePage = new ManufacturePage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test(priority = 0)
	public void testProductTags() throws InterruptedException {
		manufacturePage.productTags("Apple");
		assertTrue(manufacturePage.getAdmin().contains("Admin"));
	}
}
