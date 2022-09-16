package latihan.selenium.demoqa;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {
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
  public void testCheckBox() throws Exception {
	  driver.get("https://demoqa.com/checkbox");
	    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-all > path")).click();
	    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-all > path")).click();
	    driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-collapse-all > path")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Book Store API'])[1]/following::*[name()='svg'][3]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Book Store API'])[1]/following::*[name()='svg'][3]")).click();
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
