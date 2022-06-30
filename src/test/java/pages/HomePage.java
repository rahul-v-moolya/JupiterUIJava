package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class HomePage extends BasePage {
	
	public final By startButton = By.xpath("//android.widget.TextView[@text=\"Start\"]");
	public final By allowButton = By.xpath("//android.widget.TextView[@text=\"Allow\"]");
	public final By enterMobileNumber = By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]");
	public final By verifyButton = By.xpath("//android.widget.TextView[@text=\"Verify\"]");
	public final By continueButton = By.xpath("//android.widget.TextView[@text=\"Continue\"]");
	public final By alrightButton = By.xpath("//android.widget.TextView[@text =\"Alright\"]");
	public final By permission = By.xpath("//android.widget.Button[@text=\"Don't allow\"]");
	public final By accountType = By.xpath("//android.widget.TextView[@text=\"SAVINGS\"]");
	public final By debitCardIcon = By.xpath("//android.view.View[@resource-id=\"debitCard\"]");
	public final By payBillsIcon = By.xpath("//android.view.View[@resource-id=\"billPayments\"]");
	public final By saveIcon = By.xpath("//android.view.View[@resource-id=\"pots\"]");
	public final By portfolioIcon = By.xpath("//android.view.View[@resource-id=\"casAnalyser\"]");
	public final By referAndEarnIcon = By.xpath("//android.view.View[@resource-id=\"referEarn\"]");
	public final By recentTransactionsCard = By.xpath("//android.view.View[@resource-id=\"recent-transactions-card\"]");
	public final By depositMoneyButton = By.xpath("//android.view.View[@resource-id=\"add-money-button\"]");
	public final By fkycBannerForNewUsers = By.xpath("//android.view.View[@resource-id=\"infobar-616\"]");
	public final By doneButton = By.xpath("//android.widget.TextView[@text=\"Done\"]");
	public final By hamburgerMenu = By.xpath("//*[@resource-id=\"greeting\"]//parent::*//android.widget.Button");
	public final By rewardsButton = By.xpath("//android.view.View[@resource-id=\"rewards-home\"]");
	public final By checkAllYourBalances = By.xpath("//*[@resource-id=\"networth-container\"]//android.widget.Image");
	public final By depositMoneyCTA = By.xpath("//*[@resource-id=\"add-money-button\"]//android.widget.Button");
	public final By vkycButton = By.xpath("//*[@resource-id=\"pro-cta\"]");
	public final By transfersTabButton = By.xpath("//android.widget.Button[contains(@content-desc,\"Transfers\")]");
	public final By moneyTabButton = By.xpath("//android.widget.Button[contains(@content-desc,\"Money\")]");
	public final By cardsTabButton = By.xpath("//android.widget.Button[contains(@content-desc,\"Cards\")]");
	public final By helpTabButton = By.xpath("//android.widget.Button[contains(@content-desc,\"Help\")]");
	
	/// think about the placement of next locators
	public final By settingsText = By.xpath("//android.widget.TextView[@text=\"Settings\"]");
	public final By rewardsText = By.xpath("//android.widget.TextView[@text=\"Rewards\"]");
	public final By waysToDepositText = By.xpath("//android.widget.TextView[@text=\"Ways to deposit\"]");
	public final By seeBankBalanceText = By.xpath("//*[contains(@text,\"bank balances\")]");
	public final By accountTypesText = By.xpath("//android.widget.TextView[@text=\"Account types\"]");
	public final By videoVerificationText = By.xpath("//android.widget.TextView[@text=\"Video verification\"]");
	public final By transfersText = By.xpath("//android.widget.TextView[@text=\"Transfers\"]");
	public final By moneyText = By.xpath("//android.widget.TextView[@text=\"Money\"]");
	public final By debitCardText = By.xpath("//android.widget.TextView[@text=\"Debit Card\"]");
	public final By helpText = By.xpath("//android.widget.TextView[@text=\"Help\"]");
	public final By transactionOneCard = By.xpath("//*[@resource-id=\"recent-transactions-card\"]/android.view.View[2]");
	public final By transactionTwoCard = By.xpath("//*[@resource-id=\"recent-transactions-card\"]/android.view.View[3]");
	public final By transactionThreeCard = By.xpath("//*[@resource-id=\"recent-transactions-card\"]/android.view.View[4]");
	public final By seeAllTransactionButton = By.xpath("//*[@resource-id=\"recent-transactions-card\"]/android.view.View[5]");
	public final By trackSpendsButton = By.xpath("//*[@resource-id=\"recent-transactions-card\"]/android.view.View[6]");
	public final By transactionSuccessfulText = By.xpath("//android.widget.TextView[@text=\"Transaction successful\"]");
	public final By allTransactionsText = By.xpath("//android.widget.TextView[@text=\"All Transactions\"]");
	public final By insightsText = By.xpath("//android.widget.TextView[@text=\"Insights\"]");
	///
	
	public HomePage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
