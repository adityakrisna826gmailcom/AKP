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
//import ujian.ujiankelima.selenium.LoginPage;

public class Register {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private RegisterPage registerPage = new RegisterPage();
	
	public Register() {
		driver = DemoQAOutlineHooks.driver;
		extentTest = DemoQAOutlineHooks.extentTest;
	}
	
	@When("Open Web DemoQA register")
	public void open_web_demo_qa_register() {
		driver.get(Constants.URLDEMOQAACCOUNT);
		extentTest.log(LogStatus.PASS, "Open Web DemoQA");
	}

	@And("^User register invalid (.*) (.*) and (.*)$")
	public void enter_invalid_username_email_and_password(String username , String email, String password) throws AWTException {
//		registerPage.clickBtnDissmis();
//		registerPage.clickBtnMyAccount();
		registerPage.registerPage(username,email, password);
		extentTest.log(LogStatus.PASS, "enter_invalid_username_email_and_password");
	}

	@And("button regsiter click")
	public void button_regsiter_click() {
	    registerPage.clickBtnRegister();
	    extentTest.log(LogStatus.PASS, "button_regsiter_click");
	}

	@Then("System check error register")
	public void ssystem_check_error_register() {
		String errorLogin = registerPage.msgErrorRegister(10);
		assertTrue(errorLogin.contains("Error"));
	}
}
