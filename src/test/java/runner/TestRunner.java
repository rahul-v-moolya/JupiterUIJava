package runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.Hooks;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import pages.AppiumBaseTests;
import pages.HomePage;

@CucumberOptions(plugin = {"pretty", "html:target/cucumber/cucumber.html"}, glue = {"runner"}
, features = "src/test/java/scenarios/features/Jupiter.feature", tags = "@C15110")

public class TestRunner extends AbstractTestNGCucumberTests implements AppiumBaseTests{
	
	protected AppiumDriver driver;
	HomePage homepage= new HomePage();
	
	@When("Launch Jupiter Application")
	public void launcher() {
		try {
			Hooks.getDefaultDriver();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	@And("operable.click Start")
	public void clickStartButton(){
		operable.click(homepage.startButton);
	}
	
	@And("operable.click Allow")
	public void clickAllow(){
		operable.click(homepage.allowButton);
	}
	@When("Enter Mobile Number")
	public void enterMobileNumber() throws Exception{
		operable.enterNumber(homepage.enterMobileNumber, "8788537892");
	}
	
	@And("operable.click Verify")
	public void clickVerify(){
		operable.click(homepage.verifyButton);
	}
	
	@And("operable.click Continue Button")
	public void clickContinue(){
		operable.click(homepage.continueButton);
	}
	
	@Then("operable.click Alright")
	public void clickAlright() { 
		operable.click(homepage.alrightButton);
	}
	
	@And("operable.click Continue")
	public void clickContinueButton(){
		operable.click(homepage.continueButton);
	}
	
	@And("Deny Permission")
	public void denyPermission() {
		operable.click(homepage.permission);
	}
	
	@When("Complete Login Process")
	public void completeValidLoginProcess() throws InterruptedException {
		operable.click(homepage.permission);
		operable.click(homepage.startButton);
		operable.click(homepage.allowButton);
		operable.click(homepage.permission);
		operable.click(homepage.permission);
		operable.click(homepage.permission);
		operable.enterNumber(homepage.enterMobileNumber, "8788537892");
		operable.click(homepage.verifyButton);
		operable.click(homepage.continueButton);
		operable.click(homepage.alrightButton);
		operable.click(homepage.continueButton);
		operable.click(homepage.doneButton);
	}	
	
	@Then("Tap on Hamurger icon navigates to App settings screen")
	public void tapOnHamburgerIcon(){
		operable.click(homepage.hamburgerMenu);
		Assert.assertEquals(operable.getText(homepage.settingsText), "Settings");
		//operable.scrollPage(homepage.rewardsButton);
		
		operable.goBack();
	}
	
	@And("Tap on Rewards icon navigates to rewards home page")
	public void tapOnRewardsButton() throws InterruptedException{	
		System.out.println("Executing SHELL Command");
		operable.scrollin();
		operable.click(homepage.rewardsButton);
		operable.goBack();
	}
	
	@And("Tap on Total account balance navigates to Networth page")
	public void tapOnTotalAccountBalance() throws InterruptedException, IOException{
		operable.click(homepage.checkAllYourBalances);
		Assert.assertEquals(operable.getText(homepage.seeBankBalanceText), "See all your bank balances at one place");
		operable.goBack();
		
	}
	
	@And("Tap on Deposit money CTA navigates to deposit screen")
	public void tapOnDepositMoneyCTA() {	
	//add logic to deny 
		operable.click(homepage.depositMoneyCTA);
		operable.click(homepage.permission);
		operable.click(homepage.permission);
		Assert.assertEquals(operable.getText(homepage.waysToDepositText), "Ways to deposit");
		operable.goBack();
	}
	
	
	@And("Tap on Savings tag and pro salary tags navigates to Account types page")
	public void tapOnSavingsTag(){	
		operable.click(homepage.accountType);
		Assert.assertEquals(operable.getText(homepage.accountTypesText), "Account types");
		operable.goBack();
	}
	
	@And("Tap on VKYC prompts navigates to to respective pages")
	public void tapOnVkyc() {	
		operable.click(homepage.vkycButton);
		Assert.assertEquals(operable.getText(homepage.videoVerificationText), "Video verification");
		operable.goBack();
	}

	@And("Tap on Transfers navigates to Payments page")
	public void tapOnTransfers() {	
		operable.click(homepage.transfersTabButton);
		operable.click(homepage.permission);
		Assert.assertEquals(operable.getText(homepage.transfersText), "Transfers");
		operable.goBack();	
	}
	
	@And("Tap on Money navigates to Money page")
	public void tapOnMoneyTab() {	
		operable.click(homepage.moneyTabButton);
		Assert.assertEquals(operable.getText(homepage.moneyText), "Money");
		operable.goBack();
	}
	
	@And("Tap on Cards navigates to Cards page")
	public void tapOnCards() {	
		operable.click(homepage.cardsTabButton);
		Assert.assertEquals(operable.getText(homepage.debitCardText), "Debit Card");
		operable.goBack();	
	}
	
	@And("Tap on Help navigates to Help page")
	public void tapOnHelpTabButton() {	
		operable.click(homepage.helpTabButton);
		Assert.assertEquals(operable.getText(homepage.helpText), "Help");
		operable.goBack();
		}
	
	@And("Tap on spotlight cards navigates to there respective pages")
	public void tapOnSpotlight() {	
		operable.click(homepage.vkycButton);
		Assert.assertEquals(operable.getText(homepage.videoVerificationText), "Video verification");
		}
	
	@Then("Tap on any one of the transaction navigates to Transaction Details page")
	public void tapOnAnyTransactionsCard() {
		operable.click(homepage.recentTransactionsCard);
//		homepage.showPageSource();
		operable.click(homepage.transactionOneCard);
		Assert.assertEquals(operable.getText(homepage.transactionSuccessfulText), "Transaction successful");
		operable.goBack();
		operable.click(homepage.transactionTwoCard);
		Assert.assertEquals(operable.getText(homepage.transactionSuccessfulText), "Transaction successful");
		operable.goBack();
		operable.click(homepage.transactionThreeCard);
		Assert.assertEquals(operable.getText(homepage.transactionSuccessfulText), "Transaction successful");
		operable.goBack();
	}
	
	@And("Tap on see all navigates to all Transaction screen")
	public void tapOnSeeAllButton() {	
		operable.click(homepage.seeAllTransactionButton);
		Assert.assertEquals(operable.getText(homepage.allTransactionsText), "All Transactions");
		operable.goBack();
	}
	
	@And("Tap on track spends navigates to Insights screen")
	public void tapOnTrackSpendsButton() {	
		operable.click(homepage.trackSpendsButton);
		Assert.assertEquals(operable.getText(homepage.insightsText), "Insights");
		operable.goBack();
		operable.goBack();
	
	}
	}
