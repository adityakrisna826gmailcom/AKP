package tugas.selenium.demoqa;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;
import tugas.selenium.demoqa.page.demoqa.PracticeFormPage;
import tugas.selenium.demoqa.util.Constants;

public class TestPracticeForm {

	private static WebDriver driver;
	private PracticeFormPage practiceFormPage;
	
	@BeforeMethod
	public void pageObjext() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLPRACTICEFORM);
		practiceFormPage = new PracticeFormPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException{
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testPracticeForm() throws InterruptedException, AWTException  {
		practiceFormPage.practiceForm("Aditya Krisna", "Pamungkas", "aditya@gmail.com", "0823456789", "12 Oct 1998", "Math", "C:\\Users\\NEXSOFT\\Pictures\\Screenshots\\Screenshot (9).png", "Jln. Boulevard");
		assertTrue(practiceFormPage.getTxtClose().contains("Close"));
	}
}
