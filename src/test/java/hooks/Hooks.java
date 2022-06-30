package hooks;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import context.TestContext;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;

public class Hooks {
	private AppiumDriver driver;
	private final TestContext context;
	
	public Hooks(TestContext context) {
		this.context = context;
	}
	
	@Before
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("deviceName", "RZ8R120RBWA");
		capabilities.setCapability("appPackage","money.jupiter.staging");
		capabilities.setCapability("appActivity","money.jupiter.MainActivity");
		capabilities.setCapability("app", System.getProperty("user.dir")+"/app/jupiter-staging.apk");
		capabilities.setCapability("appWaitDuration", 120000);
//		capabilities.setCapability("autoDissmissAlerts", "true");
		driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		context.driver = driver;
	}
}
