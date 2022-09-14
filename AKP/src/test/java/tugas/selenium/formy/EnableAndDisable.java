package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EnableAndDisable {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEnableAndDisable() throws Exception {
    driver.get("https://formy-project.herokuapp.com/enabled");
    driver.findElement(By.id("input")).click();
    driver.findElement(By.id("input")).clear();
    driver.findElement(By.id("input")).sendKeys("Warning!!!");
    driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
    driver.findElement(By.id("input")).click();
    driver.findElement(By.id("input")).clear();
    driver.findElement(By.id("input")).sendKeys("");
    driver.findElement(By.id("input")).clear();
    driver.findElement(By.id("input")).sendKeys("Password Salah!!!");
    driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("input")).clear();
    driver.findElement(By.id("input")).sendKeys("Coba Lagi!!!");
    driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
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

