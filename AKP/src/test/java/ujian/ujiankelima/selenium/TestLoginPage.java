package ujian.ujiankelima.selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import latihan.cucumber.framework.connection.DriverSingleton;
import tugas.selenium.demoqa.driver.connection.DriverSingleton;
import tugas.selenium.demoqa.page.demoqa.PracticeFormPage;
import tugas.selenium.demoqa.util.Constants;


public class TestLoginPage {

	private static WebDriver driver;
	private LoginPage loginPage;
	
	@BeforeMethod
	public void pageObjext() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLDEMOQA);
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException{
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test(priority = 0)
	public void testLoginPage() throws InterruptedException, AWTException  {
		loginPage.clickBtnDissmis();
		loginPage.clickBtnMyAccount();
		loginPage.loginPage("aditya@gmail.com", "1234qwert");
		loginPage.clickBtnRememberMe();
		loginPage.clickBtnLogin();
//		assertEquals(loginPage.msgError());
		String errorLogin = loginPage.msgError(10);
		assertTrue(errorLogin.contains("ERROR"));
	}
	
	@Test (priority = 1)
	public void testRegisterPage() throws InterruptedException, AWTException  {
		loginPage.clickBtnDissmis();
		loginPage.clickBtnMyAccount();
		loginPage.registerPage("adityakrisna","aditya@gmail.com", "1029alskDJ");
//		loginPage.clickBtnRememberMe();
		loginPage.clickBtnRegister();
//		assertEquals(loginPage.msgError());
		String errorLogin = loginPage.msgErrorRegister(10);
		assertTrue(errorLogin.contains("Error"));
	}
	
	@Test (priority = 2)
	public void testShoesPage() throws InterruptedException, AWTException  {
//		loginPage.clickBtnDissmis();
		loginPage.clickBtnSearch();
		loginPage.searchPage("shoes");
		String errorLogin = loginPage.msgShoes(10);
		assertTrue(errorLogin.contains("SHOES"));
	}
	
	@Test (priority = 3)
	public void shopPage() throws InterruptedException, AWTException  {
		loginPage.addChartPage("black", "36");
		String errorLogin = loginPage.msgShirt(10);
		assertTrue(errorLogin.contains("black"));
	}
	
	@Test (priority = 4)
	public void hapusPage() throws InterruptedException, AWTException  {
		loginPage.addChartPage("black", "36");
		String errorLogin = loginPage.msgShirt(10);
		assertTrue(errorLogin.contains("black"));
		
		loginPage.clickBtnHome();
	}
	
}
