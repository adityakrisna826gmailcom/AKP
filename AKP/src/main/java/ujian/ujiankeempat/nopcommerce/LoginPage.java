package ujian.ujiankeempat.nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;


public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver= DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	private WebElement txtDashboard;
	
	@FindBy(id = "Email")
	private WebElement btnEmail;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement btnPassword;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
	private WebElement txtError;
	
	@FindBy(id = "Email-error")
	private WebElement txtEmailError;
	
	
	public void login() {
		btnLogin.click();
	}
	
	public String getTxtDash() {
		return txtDashboard.getText();
	}
	
	public void loginInvalid(String emails, String password)
	{
		btnEmail.click();	
		btnEmail.clear();
		this.email.sendKeys(emails);
		btnPassword.click();
		btnPassword.clear();
		this.password.sendKeys(password);
//		btnLogin.click();
	}
	
	
	public String getTxtError() {
		String txt = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(txtError)).getText();
		
		return txt;

	}
	
//	public String getEmailError()
//	{
//		return txtEmailError.getText();
//	}
//	
	
}
