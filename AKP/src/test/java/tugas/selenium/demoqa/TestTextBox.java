package tugas.selenium.demoqa;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;
import tugas.selenium.demoqa.page.demoqa.TextBoxPage;
import tugas.selenium.demoqa.util.Constants;

public class TestTextBox {

	private static WebDriver driver;
	private TextBoxPage textBoxPage;
	
	@BeforeMethod
	public void pageObjext() {
		DriverSingleton.getInstance(Constants.CHROME);
		
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLTEXTBOX);
		textBoxPage = new TextBoxPage();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-400)", "");
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException{
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testBoxSubmit() throws InterruptedException {
		textBoxPage.textBox("Aditya Krisna Pamungkas", "adityakrisna816@gmail.com", "Monica Kost", "Klaten");
		assertTrue(textBoxPage.getTxtName().contains("Name"));
	}
}
