package latihan;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CekJudul {

	@Test
	public void cekGoogle() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\NEXSOFT\\Documents\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://google.com";
		String expectedTitle = "Google";
		driver.get(baseUrl);
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);

//		driver.close();

	}

}
