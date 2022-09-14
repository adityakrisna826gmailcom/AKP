package latihan.selenium.webelement;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAutosuggestive {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://www.makemytrip.com/";
		 driver.get(baseUrl);

		 String target = "Jayapura, Indonesia";
		 WebElement ngisiKota = driver.findElement(By.xpath("//input[@id='fromCity']"));
		 ngisiKota.sendKeys("Jayapura");
		 Thread.sleep(3000);
		 List<WebElement> opsiKota = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//child::li"));

		 for (int i = 0; i<opsiKota.size();i++) {
		 
		 String isiOpsi = opsiKota.get(i).getText();
		 System.out.println("ISI OPSI " + isiOpsi);
		 if (isiOpsi.contains(target)) {
			 opsiKota.get(i).click();
		 break;
		 }
		 }
		}
}
