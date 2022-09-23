package latihan.cucumber.framework.runner.hrmscobaoutline;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import latihan.cucumber.framework.page.hrmscobaoutline.LoginPage;
import tugas.selenium.demoqa.util.Constants;


public class TestHRMSCobaOutline {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestHRMSCobaOutline() {
		driver = HRMSCobaOutlineHooks.driver;
		extentTest = HRMSCobaOutlineHooks.extentTest;
	}
	

	@When("User go to Web HRMS")
	public void user_go_to_web_nopc() {
		driver.get(Constants.URLHRMS);
		extentTest.log(LogStatus.PASS, "User go to Web HRMS");
	}

	@And("^User input invalid (.*) and (.*)$")
	public void user_input_invalid_username_and_password(String username , String password) {
		System.out.println("user_enter_username_password_invalid uName : "+username+" pwd : "+password);
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "user_input_invalid_password_and_username");
	}

	@And("Click button invalid")
	public void click_button_invalid() {
		loginPage.clickBtnLogin();
	    extentTest.log(LogStatus.PASS, "Click button invalid");
	}

	@Then("User invalid")
	public void user_invalid() {
		assertEquals(loginPage.msgInvalid(10), "Invalid credentials");
		extentTest.log(LogStatus.PASS, "User Invalid");
	}
}
