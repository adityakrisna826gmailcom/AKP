package latihan.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PencetSanaPencetSini {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 
		 WebElement formFirstName = driver.findElement(By.id("first-name"));
		 formFirstName.sendKeys("Sutarno");
		 
		 WebElement formLastName = driver.findElement(By.id("last-name"));
		 formLastName.sendKeys("Onratus");
		 
		 WebElement formJobTitle = driver.findElement(By.id("job-title"));
		 formJobTitle.sendKeys("Karyawan");
		 
		 WebElement radioButton = driver.findElement(By.id("radio-button-1"));
		 radioButton.click();
		 
		 WebElement checkBox = driver.findElement(By.id("checkbox-1"));
		 checkBox.click();
		 
		 Select formControl = new Select(driver.findElement(By.id("select-menu")));
		 formControl.selectByValue("3");
		 
		 WebElement date = driver.findElement(By.id("datepicker"));
		 date.sendKeys("09/13/2022");
		 
		 WebElement logo = driver.findElement(By.partialLinkText("Submit"));
		 logo.click();
		 
		}
}
