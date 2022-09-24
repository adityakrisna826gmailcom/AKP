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

public class LoginPage {

	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement btnDismiss;
	
	@FindBy(xpath = "//a[normalize-space()='My Account']")
	private WebElement btnMyAccount;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "rememberme")
	private WebElement btnRemember;
	
	@FindBy(name = "login")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//strong[normalize-space()='ERROR']")
	private WebElement txtErrorLogin;
	
	public void loginPage(String username, String password) throws AWTException {
//		Robot rb = new Robot();
//		for(int i = 0; i<2; i++) {
//			rb.keyPress(KeyEvent.VK_CONTROL);
//			rb.keyPress(KeyEvent.VK_SUBTRACT);
//			rb.keyRelease(KeyEvent.VK_CONTROL);
//			rb.keyRelease(KeyEvent.VK_SUBTRACT);
//		}
		
		this.username.sendKeys(username); //step
		Utils.delay(1, strDelay);
		this.password.sendKeys(password);
		Utils.delay(1, strDelay);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	public void clickBtnDissmis() {
		btnDismiss.click();
	}
	
	public void clickBtnRememberMe() {
		btnRemember.click();
	}
	
	public void clickBtnMyAccount() {
		btnMyAccount.click();
	}
	
	public String msgError(int delays) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtErrorLogin)).getText();
	}
}
