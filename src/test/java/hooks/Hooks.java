package hooks;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Hooks {
	public static long DEFAULT_WAIT = 20;
	protected static AppiumDriver driver;

	public static AppiumDriver getDefaultDriver() {
		if (driver != null) {
			return driver;
		}

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("deviceName", "RZ8R4011CWN");
		capabilities.setCapability("appPackage","money.jupiter.staging");
		capabilities.setCapability("appActivity","money.jupiter.MainActivity");
//		capabilities.setCapability("app", System.getProperty("user.dir") + "/app/jupiter-staging.apk");
		capabilities.setCapability("appWaitDuration", 120000);
//		capabilities.setCapability("autoDissmissAlerts", "true");
		driver = chooseDriver(capabilities);
		return driver;
	}

	/**
	 * By default to web driver will be PhantomJS
	 *
	 * Override it by passing -DWebDriver=Chrome to the command line arguments
	 * 
	 * @param capabilities
	 * @return
	 */
	private static AppiumDriver chooseDriver(DesiredCapabilities capabilities) {
		try {
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;

	}
}
