package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class BasePage {
	protected AppiumDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(AppiumDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}
	
	public void waitForVisibility(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
	}
	
	public void enterNumber(By element,String txt) {
		waitForVisibility(element);
		WebElement ele = driver.findElement(element);
		ele.sendKeys(txt);
	}
	
	public void sendKeys(By element,String txt) throws Exception {
		waitForVisibility(element);
		WebElement ele = driver.findElement(element);
//		ele.clear();
		for (int i = 0; i < txt.length(); i++) {
			ele.sendKeys(Character.toString(txt.charAt(i)));
			Thread.sleep(500);
        }
	}
	
	public void click(By element) {
		waitForVisibility(element);
		driver.findElement(element).click();
	}
	
	public String getText(By element) {
		waitForVisibility(element);
		return driver.findElement(element).getAttribute("text");
	}
	
	public void showPageSource() {
		System.out.println(driver.getPageSource());
	}
	
	public void goBack() {
		 driver.navigate().back();
	}
	
}
