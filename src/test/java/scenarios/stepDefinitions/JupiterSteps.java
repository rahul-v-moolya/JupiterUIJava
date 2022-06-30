package scenarios.stepDefinitions;

import org.openqa.selenium.By;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;
import context.TestContext;
import pages.BasePage;
import pages.HomePage;

public class JupiterSteps {
	BasePage basePage;
	HomePage homepage;
	
	public JupiterSteps(TestContext context) {
		homepage = new HomePage(context.driver);
	}
	
	@And("Click Start")
	public void clickStartButton(){
		homepage.click(homepage.startButton);
	}
	
	@And("Click Allow")
	public void clickAllow(){
		homepage.click(homepage.allowButton);
	}
	@When("Enter Mobile Number")
	public void enterMobileNumber() throws Exception{
		homepage.enterNumber(homepage.enterMobileNumber, "8788537892");
	}
	
	@And("Click Verify")
	public void clickVerify(){
		homepage.click(homepage.verifyButton);
	}
	
	@And("Click Continue Button")
	public void clickContinue(){
		homepage.click(homepage.continueButton);
	}
	
	@Then("Click Alright")
	public void clickAlright() { 
		homepage.click(homepage.alrightButton);
	}
	
	@And("Click Continue")
	public void clickContinueButton(){
		homepage.click(homepage.continueButton);
	}
	
	@And("Deny Permission")
	public void denyPermission() {
		homepage.click(homepage.permission);
	}
	
	@When("Complete Login Process")
	public void completeValidLoginProcess() throws InterruptedException {
		homepage.click(homepage.permission);
		homepage.click(homepage.startButton);
		homepage.click(homepage.allowButton);
		homepage.click(homepage.permission);
		homepage.click(homepage.permission);
		homepage.click(homepage.permission);
		homepage.enterNumber(homepage.enterMobileNumber, "8788537892");
		homepage.click(homepage.verifyButton);
		homepage.click(homepage.continueButton);
		homepage.click(homepage.alrightButton);
		homepage.click(homepage.continueButton);
		homepage.click(homepage.doneButton);
	}	
	
	@Then("Tap on Hamurger icon navigates to App settings screen")
	public void tapOnHamburgerIcon(){
		homepage.click(homepage.hamburgerMenu);
		Assert.assertEquals(homepage.getText(homepage.settingsText), "Settings");
		homepage.goBack();
		
	}
	
	@And("Tap on Rewards icon navigates to rewards home page")
	public void tapOnRewardsButton() {	
		homepage.click(homepage.rewardsButton);
		Assert.assertEquals(homepage.getText(homepage.rewardsText), "Rewards");
		homepage.goBack();
		System.out.println("test");
	}
	
	@And("Tap on Total account balance navigates to Networth page")
	public void tapOnTotalAccountBalance() {
		homepage.click(homepage.checkAllYourBalances);
		Assert.assertEquals(homepage.getText(homepage.seeBankBalanceText), "See all your bank balances at one place");
		homepage.goBack();
		System.out.println("test");
		
	}
	
	@And("Tap on Deposit money CTA navigates to deposit screen")
	public void tapOnDepositMoneyCTA() {	
	//add logic to deny 
		homepage.click(homepage.depositMoneyCTA);
		homepage.click(homepage.permission);
		homepage.click(homepage.permission);
		Assert.assertEquals(homepage.getText(homepage.waysToDepositText), "Ways to deposit");
		homepage.goBack();
		System.out.println("test");
	}
	
	
	@And("Tap on Savings tag and pro salary tags navigates to Account types page")
	public void tapOnSavingsTag() {	
		homepage.click(homepage.accountType);
		Assert.assertEquals(homepage.getText(homepage.accountTypesText), "Account types");
		homepage.goBack();
	}
	
	@And("Tap on VKYC prompts navigates to to respective pages")
	public void tapOnVkyc() {	
		homepage.click(homepage.vkycButton);
		Assert.assertEquals(homepage.getText(homepage.videoVerificationText), "Video verification");
		homepage.goBack();
	}

	@And("Tap on Transfers navigates to Payments page")
	public void tapOnTransfers() {	
		homepage.click(homepage.transfersTabButton);
		homepage.click(homepage.permission);
		Assert.assertEquals(homepage.getText(homepage.transfersText), "Transfers");
		homepage.goBack();	
	}
	
	@And("Tap on Money navigates to Money page")
	public void tapOnMoneyTab() {	
		homepage.click(homepage.moneyTabButton);
		Assert.assertEquals(homepage.getText(homepage.moneyText), "Money");
		homepage.goBack();
	}
	
	@And("Tap on Cards navigates to Cards page")
	public void tapOnCards() {	
		homepage.click(homepage.cardsTabButton);
		Assert.assertEquals(homepage.getText(homepage.debitCardText), "Debit Card");
		homepage.goBack();	
	}
	
	@And("Tap on Help navigates to Help page")
	public void tapOnHelpTabButton() {	
		homepage.click(homepage.helpTabButton);
		Assert.assertEquals(homepage.getText(homepage.helpText), "Help");
		homepage.goBack();
		}
	
	@And("Tap on spotlight cards navigates to there respective pages")
	public void tapOnSpotlight() {	
		homepage.click(homepage.vkycButton);
		Assert.assertEquals(homepage.getText(homepage.videoVerificationText), "Video verification");
		}
	
	@Then("Tap on any one of the transaction navigates to Transaction Details page")
	public void tapOnAnyTransactionsCard() {
		homepage.click(homepage.recentTransactionsCard);
//		homepage.showPageSource();
		homepage.click(homepage.transactionOneCard);
		Assert.assertEquals(homepage.getText(homepage.transactionSuccessfulText), "Transaction successful");
		homepage.goBack();
		homepage.click(homepage.transactionTwoCard);
		Assert.assertEquals(homepage.getText(homepage.transactionSuccessfulText), "Transaction successful");
		homepage.goBack();
		homepage.click(homepage.transactionThreeCard);
		Assert.assertEquals(homepage.getText(homepage.transactionSuccessfulText), "Transaction successful");
		homepage.goBack();
	}
	
	@And("Tap on see all navigates to all Transaction screen")
	public void tapOnSeeAllButton() {	
		homepage.click(homepage.seeAllTransactionButton);
		Assert.assertEquals(homepage.getText(homepage.allTransactionsText), "All Transactions");
		homepage.goBack();
	}
	
	@And("Tap on track spends navigates to Insights screen")
	public void tapOnTrackSpendsButton() {	
		homepage.click(homepage.trackSpendsButton);
		Assert.assertEquals(homepage.getText(homepage.insightsText), "Insights");
		homepage.goBack();
		homepage.goBack();
	
	}
}