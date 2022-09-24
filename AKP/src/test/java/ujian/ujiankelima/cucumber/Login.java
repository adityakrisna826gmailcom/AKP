package ujian.ujiankelima.cucumber;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tugas.selenium.demoqa.util.Constants;

public class Login {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public Login() {
		driver = DemoQAOutlineHooks.driver;
		extentTest = DemoQAOutlineHooks.extentTest;
	}
	
	@When("Browser open Web DemoQA login")
	public void browser_open_web_demo_qa_login() {
		driver.get(Constants.URLDEMOQAACCOUNT);
		extentTest.log(LogStatus.PASS, "Browser open Web DemoQA");
	}

	@And("^User login invalid (.*) and (.*)$")
	public void user_login_invalid_username_and_password(String username , String password) throws AWTException {
//		loginPage.clickBtnDissmis();
//		loginPage.clickBtnMyAccount();
		loginPage.loginPage(username, password);
		extentTest.log(LogStatus.PASS, "enter_invalid_username_and_password");
	}

	@And("button remember me click")
	public void button_remember_me_click() {
	    loginPage.clickBtnRememberMe();
	    extentTest.log(LogStatus.PASS, "button remember me click");
	}
	
	@And("button login click")
	public void button_login_click() {
	    loginPage.clickBtnLogin();
	    extentTest.log(LogStatus.PASS, "button login click");
	}

	@Then("System check error login")
	public void system_check_error_login() {
		String errorLogin = loginPage.msgError(10);
		assertTrue(errorLogin.contains("ERROR"));
		extentTest.log(LogStatus.PASS, "System check error");
	}
}
