package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchWindow {
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
  public void testSwitchWindow() throws Exception {
    driver.get("https://formy-project.herokuapp.com/switch-window");
    driver.findElement(By.id("alert-button")).click();
    Thread.sleep(1000);
    assertEquals(closeAlertAndGetItsText(), "This is a test alert!");
    Thread.sleep(1000);
    driver.findElement(By.id("new-tab-button")).click();
    Thread.sleep(1000);
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.id("alert-button")).click();
    Thread.sleep(1000);
    assertEquals(closeAlertAndGetItsText(), "This is a test alert!");
    try {
    	Thread.sleep(1000);
      assertEquals(driver.findElement(By.id("new-tab-button")).getText(), "Open new tab");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
    	Thread.sleep(1000);
      assertEquals(driver.getTitle(), "Formy");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
