package pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import hooks.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

public class BasePage extends Hooks {
	WebDriverWait wait = new WebDriverWait(driver, 20);


	public void waitForVisibility(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));

	}

	public void enterNumber(By element, String txt) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		WebElement ele = driver.findElement(element);
		ele.sendKeys(txt);
	}

	public void sendKeys(By element, String txt) throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		WebElement ele = driver.findElement(element);
//		ele.clear();
		for (int i = 0; i < txt.length(); i++) {
			ele.sendKeys(Character.toString(txt.charAt(i)));
			Thread.sleep(500);
		}
	}

	public void click(By element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			driver.findElement(element).click();
		} catch (Exception e) {
			e.getLocalizedMessage();
		}
	}

	public void scrollPage(By to) throws Exception {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		if (to.equals("end"))

			/**
			 * executor.executeScript(
			 * "window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
			 **/
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");

		else if (to.equals("top"))
			executor.executeScript(
					"window.scrollTo(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight),0);");
		else
			throw new Exception("Exception : Invalid Direction (only scroll \"top\" or \"end\")");
	}

	public void scrollin() throws InterruptedException{
		try {
			String commandToRun = "adb shell input swipe 500 1000 300 300";
			Runtime runtime = Runtime.getRuntime();
	        Process process = runtime.exec(new String[] {"/usr/bin/adb", commandToRun});
	        process.waitFor();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void swipeUp() throws IOException, InterruptedException {        
		String shell_cmd = "adb shell input swipe 500 1000 300 300";
		Runtime run = Runtime.getRuntime();
	    Process pr = run.exec(shell_cmd);
	    pr.waitFor();
	    BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
	    String line = "";
	    while ((line=buf.readLine())!=null) {
	    System.out.println(line);
	    }
	    }
	public void swipeDown() throws IOException, InterruptedException {        
		String shell_cmd="adb shell input swipe 500 1000 300 300";
		Runtime run = Runtime.getRuntime();
	    Process pr = run.exec(shell_cmd);
	    pr.waitFor();
	    BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
	    String line = "";
	    while ((line=buf.readLine())!=null) {
	    System.out.println(line);
	    }
	    }
	public void swipeLeftToRight() throws IOException, InterruptedException {        
		String shell_cmd = "adb shell input swipe 500 1000 1000 1000";
		Runtime run = Runtime.getRuntime();
	    Process pr = run.exec(shell_cmd);
	    pr.waitFor();
	    BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
	    String line = "";
	    while ((line=buf.readLine())!=null) {
	    System.out.println(line);
	    }
	    }
	public void swipeRightToLeft() throws IOException, InterruptedException {        
		String shell_cmd= "adb shell input swipe 1000 1000 500 1000";
		Runtime run = Runtime.getRuntime();
	    Process pr = run.exec(shell_cmd);
	    pr.waitFor();
	    BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
	    String line = "";
	    while ((line=buf.readLine())!=null) {
	    System.out.println(line);
	    }
	}
	
	public void swipeScreen(Direction dir) {
	    final int ANIMATION_TIME = 200;
	    final int PRESS_TIME = 200;
	    int edgeBorder = 10;
	    PointOption pointOptionStart, pointOptionEnd;
	    Dimension dims = driver.manage().window().getSize();
	    pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

	    switch (dir) {
	        case DOWN:
	            pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
	            break;
	        case UP:
	            pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
	            break;
	        case LEFT:
	            pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
	            break;
	        case RIGHT:
	            pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
	            break;
	        default:
	            throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
	    }

	    try {
	        new TouchAction(driver).press(pointOptionStart)
	                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME))).moveTo(pointOptionEnd).release()
	                .perform();
	    } catch (Exception e) {
	        System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
	        return;
	    }

	    try {
	        Thread.sleep(ANIMATION_TIME);
	    } catch (InterruptedException e) {
	    }
	}

	public enum Direction {
	    UP, DOWN, LEFT, RIGHT;
	}

	public String getText(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		return driver.findElement(element).getAttribute("text");
	}

	public void showPageSource() {
		System.out.println(driver.getPageSource());
	}

	public void goBack() {
		driver.navigate().back();
	}

}
