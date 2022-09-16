package tugas.selenium.demoqa.page.demoqa;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
	
	@FindBy (xpath = "//div[@aria-label='Choose Monday, September 19th, 2022']")
	private WebElement btnPilih;
	
	@FindBy(xpath = "//div[@id='subjectsContainer']/div/div")
	private WebElement btnSubject;
	
	@FindBy(id = "subjectsInput")
	private WebElement btnSbj;
	
	@FindBy(id = "subjectsInput")
	private WebElement pilih;
	
	@FindBy(id = "subjectsInput")
	private WebElement btnEnter;
	
	
	@FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
	private WebElement btnHobi;
	
	
	public void tanggal(String date) throws AWTException {
		Robot robot = new Robot();
		btnTanggal.click();
		
	}
	
	public void practiceForm(String firstName, String lastName, String userEmail, String userNumber) throws InterruptedException {
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.userEmail.sendKeys(userEmail);
		btnGender.click();
		this.userNumber.sendKeys(userNumber);
//		this.tanggal.sendKeys(tanggal);
//		this.subject.sendKeys(subject);
//		Thread.sleep(1000);
//		btnTanggal.click();
//		Thread.sleep(1000);
//		btnPilih.click();
//		btnSubject.click();
//		btnSbj.clear();
//		this.pilih.sendKeys(pilih);
//		Thread.sleep(1000);
//		btnEnter.submit();
//		Thread.sleep(1000);
//		btnHobi.click();
	}
	
	
}
