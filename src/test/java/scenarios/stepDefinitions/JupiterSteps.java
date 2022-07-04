/**

package scenarios.stepDefinitions;

import org.openqa.selenium.By;

import context.TestContext;
import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;
import context.TestContext;
import pages.HomePage;
import runner.TestRunner;

public class JupiterSteps{
	//BasePage basePage = new BasePage();
	HomePage homepage = new HomePage();
	TestRunner runner = new TestRunner();
	
//	public JupiterSteps jupiterstep(TestContext context) {
//		homepage = new HomePage(context.driver);
//		return this;
//	}
	
	@When("Launch Jupiter Application")
	public void launcher() {
		try {
			Hooks.getDefaultDriver();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	@And("runner.click Start")
	public void clickStartButton(){
		runner.click(homepage.startButton);
	}
	
	@And("runner.click Allow")
	public void clickAllow(){
		runner.click(homepage.allowButton);
	}
	@When("Enter Mobile Number")
	public void enterMobileNumber() throws Exception{
		runner.enterNumber(homepage.enterMobileNumber, "8788537892");
	}
	
	@And("runner.click Verify")
	public void clickVerify(){
		runner.click(homepage.verifyButton);
	}
	
	@And("runner.click Continue Button")
	public void clickContinue(){
		runner.click(homepage.continueButton);
	}
	
	@Then("runner.click Alright")
	public void clickAlright() { 
		runner.click(homepage.alrightButton);
	}
	
	@And("runner.click Continue")
	public void clickContinueButton(){
		runner.click(homepage.continueButton);
	}
	
	@And("Deny Permission")
	public void denyPermission() {
		runner.click(homepage.permission);
	}
	
	@When("Complete Login Process")
	public void completeValidLoginProcess() throws InterruptedException {
		System.out.println("I'M HERE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.permission);
		runner.click(homepage.startButton);
		runner.click(homepage.allowButton);
		runner.click(homepage.permission);
		runner.click(homepage.permission);
		runner.click(homepage.permission);
		runner.enterNumber(homepage.enterMobileNumber, "8788537892");
		runner.click(homepage.verifyButton);
		runner.click(homepage.continueButton);
		runner.click(homepage.alrightButton);
		runner.click(homepage.continueButton);
		runner.click(homepage.doneButton);
	}	
	
	@Then("Tap on Hamurger icon navigates to App settings screen")
	public void tapOnHamburgerIcon(){
		System.out.println("I'M HERE TOO 1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.hamburgerMenu);
		Assert.assertEquals(runner.getText(homepage.settingsText), "Settings");
		runner.goBack();
		
	}
	
	@And("Tap on Rewards icon navigates to rewards home page")
	public void tapOnRewardsButton() {	
		System.out.println("I'M HERE TOO 2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.rewardsButton);
		Assert.assertEquals(runner.getText(homepage.rewardsText), "Rewards");
		runner.goBack();
		System.out.println("test");
	}
	
	@And("Tap on Total account balance navigates to Networth page")
	public void tapOnTotalAccountBalance() {
		System.out.println("I'M HERE TOO 3~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.checkAllYourBalances);
		Assert.assertEquals(runner.getText(homepage.seeBankBalanceText), "See all your bank balances at one place");
		runner.goBack();
		System.out.println("test");
		
	}
	
	@And("Tap on Deposit money CTA navigates to deposit screen")
	public void tapOnDepositMoneyCTA() {	
	//add logic to deny 
		System.out.println("I'M HERE TOO 4~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.depositMoneyCTA);
		runner.click(homepage.permission);
		runner.click(homepage.permission);
		Assert.assertEquals(runner.getText(homepage.waysToDepositText), "Ways to deposit");
		runner.goBack();
		System.out.println("test");
	}
	
	
	@And("Tap on Savings tag and pro salary tags navigates to Account types page")
	public void tapOnSavingsTag() {	
		System.out.println("I'M HERE TOO 5~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.accountType);
		Assert.assertEquals(runner.getText(homepage.accountTypesText), "Account types");
		runner.goBack();
	}
	
	@And("Tap on VKYC prompts navigates to to respective pages")
	public void tapOnVkyc() {	
		System.out.println("I'M HERE TOO 6~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.vkycButton);
		Assert.assertEquals(runner.getText(homepage.videoVerificationText), "Video verification");
		runner.goBack();
	}

	@And("Tap on Transfers navigates to Payments page")
	public void tapOnTransfers() {	
		System.out.println("I'M HERE TOO 7~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.transfersTabButton);
		runner.click(homepage.permission);
		Assert.assertEquals(runner.getText(homepage.transfersText), "Transfers");
		runner.goBack();	
	}
	
	@And("Tap on Money navigates to Money page")
	public void tapOnMoneyTab() {	
		System.out.println("I'M HERE TOO 8~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.moneyTabButton);
		Assert.assertEquals(runner.getText(homepage.moneyText), "Money");
		runner.goBack();
	}
	
	@And("Tap on Cards navigates to Cards page")
	public void tapOnCards() {	
		System.out.println("I'M HERE TOO 9~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.cardsTabButton);
		Assert.assertEquals(runner.getText(homepage.debitCardText), "Debit Card");
		runner.goBack();	
	}
	
	@And("Tap on Help navigates to Help page")
	public void tapOnHelpTabButton() {	
		System.out.println("I'M HERE TOO 10~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		runner.click(homepage.helpTabButton);
		Assert.assertEquals(runner.getText(homepage.helpText), "Help");
		runner.goBack();
		}
	
	@And("Tap on spotlight cards navigates to there respective pages")
	public void tapOnSpotlight() {	
		runner.click(homepage.vkycButton);
		Assert.assertEquals(runner.getText(homepage.videoVerificationText), "Video verification");
		}
	
	@Then("Tap on any one of the transaction navigates to Transaction Details page")
	public void tapOnAnyTransactionsCard() {
		runner.click(homepage.recentTransactionsCard);
//		homepage.showPageSource();
		runner.click(homepage.transactionOneCard);
		Assert.assertEquals(runner.getText(homepage.transactionSuccessfulText), "Transaction successful");
		runner.goBack();
		runner.click(homepage.transactionTwoCard);
		Assert.assertEquals(runner.getText(homepage.transactionSuccessfulText), "Transaction successful");
		runner.goBack();
		runner.click(homepage.transactionThreeCard);
		Assert.assertEquals(runner.getText(homepage.transactionSuccessfulText), "Transaction successful");
		runner.goBack();
	}
	
	@And("Tap on see all navigates to all Transaction screen")
	public void tapOnSeeAllButton() {	
		runner.click(homepage.seeAllTransactionButton);
		Assert.assertEquals(runner.getText(homepage.allTransactionsText), "All Transactions");
		runner.goBack();
	}
	
	@And("Tap on track spends navigates to Insights screen")
	public void tapOnTrackSpendsButton() {	
		runner.click(homepage.trackSpendsButton);
		Assert.assertEquals(runner.getText(homepage.insightsText), "Insights");
		runner.goBack();
		runner.goBack();
	
	}
}

**/