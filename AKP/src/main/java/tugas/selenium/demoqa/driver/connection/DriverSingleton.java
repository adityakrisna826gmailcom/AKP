package tugas.selenium.demoqa.driver.connection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import tugas.selenium.demoqa.driver.startegies.DriverStrategy;
import tugas.selenium.demoqa.driver.startegies.DriverStrategyImplementer;
import tugas.selenium.demoqa.util.Constants;


public class DriverSingleton {

	private static DriverSingleton instance = null;
	private static WebDriver driver;
	
	private DriverSingleton(String driver) {
		instantiate(driver);
	}
	
	@SuppressWarnings("deprecation")
	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static DriverSingleton getInstance(String driver) {
		if(instance == null) {
			instance = new DriverSingleton(driver);
		}
		
		return instance;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void closeObjectInstance() {
        instance = null;
        driver.quit();
    }
}
