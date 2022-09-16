package tugas.selenium.demoqa.page.amazon;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.demoqa.driver.connection.DriverSingleton;

public class DemoAUTPage {

private WebDriver driver;
	
	public DemoAUTPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastName;
	
	@FindBy(xpath = "//label[normalize-space()='Male']//input[@name='gender']")
	private WebElement btnGender;
	
//	@FindBy(id = "dob")
//	private WebElement btnDate;
//	
//	@FindBy(xpath = "//td[@class='active day']")
//	private WebElement btnPilihTanggal;
//	
//	@FindBy(xpath = "//td[@class='active day']")
//	private WebElement btnPilih;
	
	@FindBy(xpath = "//input[@id='dob']")
	private WebElement tanggal;
	
	@FindBy(id = "address")
	private WebElement alamat;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "company")
	private WebElement company;
	
	@FindBy(id = "role")
	private WebElement btnRole;
	
	@FindBy(xpath = "//option[@value='QA']")
	private WebElement btnQA;
	
	@FindBy(xpath = "//option[@value='Excellent colleagues']")
	private WebElement btnColleagues;
	
	@FindBy(xpath = "//input[@value='']")
	private WebElement btnReadBuku;
	
	@FindBy(id = "comment")
	private WebElement comment;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	@FindBy(id = "submit-msg")
	private WebElement txtSukses;
	
//	, String alamat, String email, String password, String company, String comment
	
	public void demoAUT(String firstName, String lastName, String tanggal, String alamat, String email, String password, String company, String comment) throws InterruptedException {
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		btnGender.click();
//		btnDate.click();
//		btnPilihTanggal.click();
//		btnPilih.click();
		this.tanggal.sendKeys(tanggal);
		this.alamat.sendKeys(alamat);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.company.sendKeys(company);
		btnRole.click();
		btnQA.click();
		btnColleagues.click();
		btnReadBuku.click();
		this.comment.sendKeys(comment);
		btnSubmit.click();
	}
	
	public String getTxtSukses() {
		return txtSukses.getText();
	}
}
