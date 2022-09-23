package latihan.cucumber.framework.runner.nopccoba;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tugas.selenium.demoqa.util.Constants;
//import latihan.cucumber.framework.runner.nopc.scenefirst.SceneFirstHooks;
import ujian.ujiankeempat.nopcommerce.LoginPage;


public class TestLoginPage {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestLoginPage() {
		driver = NOPCHooks.driver;
		extentTest = NOPCHooks.extentTest;
	}
	
	@When("User go to Web NOPC")
	public void user_go_to_web_nopc() {
		driver.get(Constants.URLNOPCOMMERCE);
		extentTest.log(LogStatus.PASS, "User go to Web NOPC");
	}
	@When("User input invalid username and password")
	public void user_input_invalid_username_and_password() {
		loginPage.loginInvalid("admin@yourstore", "salah");
		extentTest.log(LogStatus.PASS, "User input invalid username and password");
	}
	@When("Click button invalid")
	public void click_button_invalid() {
		loginPage.login();
	    extentTest.log(LogStatus.PASS, "Click button invalid");
	}
	@Then("User invalid")
	public void user_invalid() throws InterruptedException {
		assertTrue(loginPage.getTxtError().contains("unsuccessful"));
		extentTest.log(LogStatus.PASS, "User invalid");
	}
	
	@When("User input valid")
	public void user_go_back_to_web_nopc() throws InterruptedException {
		loginPage.loginInvalid("admin@yourstore.com", "admin");
	}
	
	@When("Click button valid")
	public void user_click_button() {
		
		loginPage.login();
	    extentTest.log(LogStatus.PASS, "Click button valid");
	}
	@Then("User valid")
	public void user_valid() {
		assertEquals(loginPage.getTxtDash(), "Dashboard");
		extentTest.log(LogStatus.PASS, "User valid");
	}
	
	

	
}
