package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;
import tugas.selenium.demoqa.util.Constants;
import ujian.ujiankeempat.nopcommerce.LoginPage;

public class TestLoginPage {

	public static WebDriver driver;
	private LoginPage loginPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLNOPCOMMERCE);
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test(priority = 0)
	public void testValidLogin() {
		loginPage.login();
		assertEquals(loginPage.getTxtDash(), "Dashboard");
	}
	
	@Test(priority = 1)
	public void testValidLoginInvalid() {
		loginPage.loginInvalid("admin@yourstore.com", "");
		assertTrue(loginPage.getTxtError().contains("unsuccessful"));
	}
	
	@Test(priority = 2)
	public void testInvalidPassword() {
		loginPage.loginInvalid("admin@yourstore.com", "salah");
		assertTrue(loginPage.getTxtError().contains("unsuccessful"));
	}
	
	@Test(priority = 3)
	public void testEmailKosong() {
		loginPage.loginInvalid("", "");
		assertTrue(loginPage.getEmailError().contains("Please"));
	}
	
	@Test(priority = 4)
	public void testInvalidEmail() {
		loginPage.loginInvalid("adit", "");
		assertTrue(loginPage.getEmailError().contains("Wrong"));
	}
}
