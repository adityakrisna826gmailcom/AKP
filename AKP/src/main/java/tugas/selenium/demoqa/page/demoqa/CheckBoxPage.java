package tugas.selenium.demoqa.page.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;

public class CheckBoxPage {

private WebDriver driver;
	
	public CheckBoxPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@title='Expand all']//*[name()='svg']//*[name()='path' and contains(@d,'M19 3H5c-1')]")
	private WebElement btnPlus;
	
	@FindBy(xpath = "//button[@title='Collapse all']//*[name()='svg']//*[name()='path' and contains(@d,'M19 3H5c-1')]")
	private WebElement btnMin;
	
	@FindBy(xpath = "//button[@title='Toggle']//*[name()='svg']")
	private WebElement btnTogle;
	
	public void checkBox() throws InterruptedException {
		btnPlus.click();
		Thread.sleep(1000);
		btnMin.click();
		Thread.sleep(1000);
		btnTogle.click();
		Thread.sleep(1000);
	}
}
