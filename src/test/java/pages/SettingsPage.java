package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class SettingsPage extends BasePage {
	
	
	public final By settingsText = By.xpath("//android.widget.TextView[@text=\"Settings\"]");

	public SettingsPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
