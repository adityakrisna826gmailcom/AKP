package tugas.selenium.demoqa.page.demoqa;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;

public class PracticeFormPage {

private WebDriver driver;
	
	
	public PracticeFormPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "userEmail")
	private WebElement userEmail;
	
	@FindBy(xpath = "//div[@id='genterWrapper']/div[2]/div/label")
	private WebElement btnGender;
	
	@FindBy(id = "userNumber")
	private WebElement userNumber;
	
	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	private WebElement btnTanggal;
	
	@FindBy(id = "subjectsInput")
	private WebElement subject;
//	
//	

	
	
	@FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
	private WebElement btnHobi;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[8]/div[2]/div[1]/input[1]")
	private WebElement uploadPicture;
	
	@FindBy(id = "currentAddress")
	private WebElement alamat;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	@FindBy(id = "closeLargeModal")
	private WebElement txtClose;
	
//	@FindBy(id = "submit-msg")
//	private WebElement txtSukses;
	
	
	public void tanggal(String date) {
		try {
			Robot robot = new Robot();
			btnTanggal.click();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_A);
			
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.btnTanggal.sendKeys(date);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}catch(AWTException e) {
			e.printStackTrace();
		}
		
	}
	
	public void isiSubjek(String subjeks) {
		try {
			Robot robot = new Robot();
			this.subject.click();
			this.subject.sendKeys(subjeks);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public void practiceForm(String firstName, String lastName, String userEmail, 
			String userNumber, String tanggals, String sbj, String upload, String address) throws InterruptedException, AWTException {
		Robot rb = new Robot();
		for(int i = 0; i<5; i++) {
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		
		this.firstName.sendKeys(firstName);
		Thread.sleep(500);
		this.lastName.sendKeys(lastName);
		Thread.sleep(500);
		this.userEmail.sendKeys(userEmail);
		Thread.sleep(0);
		btnGender.click();
		this.userNumber.sendKeys(userNumber);
		tanggal(tanggals);
		isiSubjek(sbj);
		btnHobi.click();
		this.uploadPicture.sendKeys(upload);
		this.alamat.sendKeys(address);
		
		state.click();
		Thread.sleep(500);
		List<WebElement> selectedItemState = driver.findElements(By.id("react-select-3-option-2"));
		selectedItemState.get(0).click();
		
		city.click();
		Thread.sleep(500);
		List<WebElement> selectedItemCity = driver.findElements(By.id("react-select-4-option-1"));
		selectedItemCity.get(0).click();
		Thread.sleep(500);
		
		btnSubmit.click();
		Thread.sleep(500);
		
//		btnClose.click();
//		Thread.sleep(500);
	}
	
	public String getTxtClose() {
		return txtClose.getText();
	}
	
	
}
