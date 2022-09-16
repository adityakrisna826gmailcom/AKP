package latihan.selenium.amazon;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAUT {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  WebDriverManager.chromedriver().setup();
//    driver = new FirefoxDriver();
	driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
  }

  @Test
  public void testDemoAUT() throws Exception {
    driver.get("https://katalon-test.s3.amazonaws.com/aut/html/form.html");
    driver.findElement(By.id("first-name")).click();
    driver.findElement(By.id("first-name")).clear();
    driver.findElement(By.id("first-name")).sendKeys("Aditya Krisna");
    driver.findElement(By.id("last-name")).click();
    driver.findElement(By.id("last-name")).clear();
    driver.findElement(By.id("last-name")).sendKeys("Pamungkas");
    driver.findElement(By.name("gender")).click();
    driver.findElement(By.id("dob")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[16]")).click();
    driver.findElement(By.id("address")).click();
    driver.findElement(By.id("address")).clear();
    driver.findElement(By.id("address")).sendKeys("Klaten");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("adit@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("aditya");
    driver.findElement(By.id("company")).click();
    driver.findElement(By.id("company")).clear();
    driver.findElement(By.id("company")).sendKeys("nexsoft");
    driver.findElement(By.id("role")).click();
    new Select(driver.findElement(By.id("role"))).selectByVisibleText("QA");
    driver.findElement(By.xpath("//option[@value='QA']")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=expectation | label=Good teamwork]]
    driver.findElement(By.xpath("//option[@value='Good teamwork']")).click();
    driver.findElement(By.xpath("//input[@value='']")).click();
    driver.findElement(By.id("comment")).click();
    driver.findElement(By.id("comment")).clear();
    driver.findElement(By.id("comment")).sendKeys("Oke");
    driver.findElement(By.id("submit")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
