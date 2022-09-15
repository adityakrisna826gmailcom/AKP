package latihan.pagefactoryobjek;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.pagefactoryobjek.driver.DriverSingleton;
import latihan.pagefactoryobjek.driver.pages.LoginPage;
import latihan.pagefactoryobjek.driver.util.Constants;

public class TestLogin {

	public static WebDriver driver;
	private LoginPage loginPage;
	
	@BeforeClass
	public void setUp() {
		
	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testValidLogin() {
		loginPage.login("Admin", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
	}
	
//	@Test
//	public void testValidLoginUsernameKapital() {
//		loginPage.login("ADMIN", "admin123");
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
//	}
//	
//	@Test
//	public void testInvalidLogin() {
//		loginPage.login("AdminNexsoft","admin1234");
//		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
//	}
//	
//	@Test
//	public void testInValidLoginUsernameSalah() {
//		loginPage.login("AdminNexsoft", "admin123");
//		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
//	}
//	
//	@Test
//	public void testInValidLoginPasswordSalah() {
//		loginPage.login("Admin", "admin1234");
//		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
//	}
//	
//	@Test
//	public void testInValidLoginUsernameKosong() {
//		loginPage.login("", "admin123");
//		assertEquals(loginPage.getTxtRequired(), "Required");
//	}
//	
//	@Test
//	public void testInValidLoginPasswordKosong() {
//		loginPage.login("Admin", "");
//		assertEquals(loginPage.getTxtRequired(), "Required");
//	}
//	
//	@Test
//	public void testInValidLoginUsernamePasswordKosong() {
//		loginPage.login("", "");
//		assertEquals(loginPage.getTxtRequired(), "Required");
//	}
}
