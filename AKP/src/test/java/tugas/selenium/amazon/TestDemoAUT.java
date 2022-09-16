package tugas.selenium.amazon;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;
import tugas.selenium.demoqa.page.amazon.DemoAUTPage;
import tugas.selenium.demoqa.util.Constants;


public class TestDemoAUT {

	private static WebDriver driver;
	private DemoAUTPage demoAUTPage;
	
	@BeforeMethod
	public void pageObjext() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLAMAZON);
		demoAUTPage = new DemoAUTPage();

	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException{
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	
	@Test
	public void testDemoAUT() throws InterruptedException {
		demoAUTPage.demoAUT("Aditya Krisna", "Pamungkas","09/17/2022", "Klaten", "adit@gmail.com", "123455", "Nexsoft", "OKE");
		assertTrue(demoAUTPage.getTxtSukses().contains("Success"));
	}
}
