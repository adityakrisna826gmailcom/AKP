package ujian.ujiankelima.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement reqUsername;
	
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement reqPassword;
	
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement email;
	
	@FindBy(id = "rememberme")
	private WebElement btnRemember;
	
	@FindBy(name = "login")
	private WebElement btnLogin;
	
	@FindBy(name = "register")
	private WebElement btnRegister;
	
	@FindBy(xpath = "//strong[normalize-space()='ERROR']")
	private WebElement txtErrorLogin;
	
	@FindBy(xpath = "//strong[normalize-space()='Error:']")
	private WebElement txtErrorRegister;
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;
	
	@FindBy(name = "s")
	private WebElement search;
	
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement txtShoes;
	
	@FindBy(xpath = "//li[@id='nav-menu-item-cart']/a/span/i")
	private WebElement btnChart;
	
	@FindBy(xpath = "//a[@class='button wc-backward']")
	private WebElement btnShop;
	
	@FindBy(xpath = "//img[contains(@src,'https://shop.demoqa.com/wp-content/uploads/2019/04/black-lux-graphic-t-shirt-300x300.jpg')]")
	private WebElement btnShirt;
	
	@FindBy(id = "pa_color")
	private WebElement btnColor;
	
	@FindBy(id = "pa_size")
	private WebElement btnSize;
	
	@FindBy(xpath = "//div[@id='product-1485']/div/div[2]/form/div/div[2]/button")
	private WebElement btnAddChart;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement txtShirt;
	
	@FindBy(xpath = "//img[@alt='ToolsQA Demo Site']")
	private WebElement btnHome;
	
	@FindBy(xpath = "//a[@class='icon_close_alt2']")
	private WebElement btnHapus;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement txtValid;

	
	public void loginPage(String username, String password) throws AWTException {
		Robot rb = new Robot();
		for(int i = 0; i<3; i++) {
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		
		this.username.sendKeys(username); //step
		Utils.delay(1, strDelay);
		this.password.sendKeys(password);
		Utils.delay(1, strDelay);
	}
	
	public void registerPage(String reqUsername, String email,String reqPassword) throws AWTException {
		Robot rb = new Robot();
		for(int i = 0; i<3; i++) {
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		
		this.reqUsername.sendKeys(reqUsername); //step
		Utils.delay(1, strDelay);
		this.email.sendKeys(email);
		Utils.delay(1, strDelay);
		this.reqPassword.sendKeys(reqPassword);
		Utils.delay(2, strDelay);
	}
	
	public void searchPage(String search) throws AWTException {
		Robot rb = new Robot();
		this.search.sendKeys(search); //step
		Utils.delay(1, strDelay);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void addChartPage(String color, String Size) throws AWTException {
		Robot rb = new Robot();
		for(int i = 0; i<3; i++) {
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		
		btnChart.click();
		Utils.delay(1, strDelay);
		btnShop.click();
		Utils.delay(1, strDelay);
		btnShirt.click();
		Utils.delay(1, strDelay);
		
		btnColor.click();
		Utils.delay(1, strDelay);
		
		Select sColor = new Select(btnColor);
		sColor.selectByValue(color);
		
		btnSize.click();
		Utils.delay(1, strDelay);
		
		Select sSize = new Select(btnSize);
		sSize.selectByValue(Size);
		
		btnAddChart.click();
		Utils.delay(1, strDelay);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	public void clickBtnRegister() {
		btnRegister.click();
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
	
	public void clickBtnSearch() {
		btnSearch.click();
	}
	
	public void clickBtnHome() {
		btnHome.click();
		Utils.delay(1, strDelay);
		btnChart.click();
		Utils.delay(1, strDelay);
		btnHapus.click();
		Utils.delay(1, strDelay);
	}
	
	public String msgError(int delays) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtErrorLogin)).getText();
	}
	
	public String msgErrorRegister(int delays) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtErrorRegister)).getText();
	}
	
	public String msgShoes(int delays) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtShoes)).getText();
	}
	
	public String msgShirt(int delays) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtShirt)).getText();
	}
	
	public String msgValid(int delays) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtValid)).getText();
	}
}
