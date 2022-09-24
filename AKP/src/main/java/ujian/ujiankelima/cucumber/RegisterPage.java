package ujian.ujiankelima.cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;
import tugas.selenium.demoqa.util.Constants;
import tugas.selenium.demoqa.util.Utils;

public class RegisterPage {
	
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public RegisterPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement btnDismiss;
	
	@FindBy(xpath = "//a[normalize-space()='My Account']")
	private WebElement btnMyAccount;
	
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement reqUsername;
	
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement reqPassword;
	
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement email;
	
	@FindBy(name = "register")
	private WebElement btnRegister;
	
	@FindBy(xpath = "//strong[normalize-space()='Error:']")
	private WebElement txtErrorRegister;
	
	@FindBy(xpath = "//strong[normalize-space()='ERROR']")
	private WebElement txtErrorLogin;
	
	public void registerPage(String reqUsername, String email,String reqPassword) throws AWTException {
//		Robot rb = new Robot();
//		for(int i = 0; i<2; i++) {
//			rb.keyPress(KeyEvent.VK_CONTROL);
//			rb.keyPress(KeyEvent.VK_SUBTRACT);
//			rb.keyRelease(KeyEvent.VK_CONTROL);
//			rb.keyRelease(KeyEvent.VK_SUBTRACT);
//		}
		
		this.reqUsername.sendKeys(reqUsername); //step
		Utils.delay(1, strDelay);
		this.email.sendKeys(email);
		Utils.delay(1, strDelay);
		this.reqPassword.sendKeys(reqPassword);
		Utils.delay(1, strDelay);
	}
	
	
	public void clickBtnRegister() {
		btnRegister.click();
	}
	
	public void clickBtnDissmis() {
		btnDismiss.click();
	}
	
	public void clickBtnMyAccount() {
		btnMyAccount.click();
	}
	
	public String msgErrorRegister(int delays) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtErrorRegister)).getText();
	}
	
	public String msgError(int delays) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtErrorLogin)).getText();
	}
}
