Feature: Jupiter Application
  I want to use this template for my feature file

  @positive
  Scenario: Launch Home Page
  And Deny Permission
	And Click Start
	And Click Allow
	And Deny Permission
	And Deny Permission
	And Deny Permission
	When Enter Mobile Number
	And Click Verify
	And Click Continue Button
	Then Click Alright
	And Click Continue
	
	@positive @C15111
	Scenario: Verify UI of design home page
	When Complete Login Process
	
	@positive @C15110
	Scenario:	 Check whether the displayed CTA home page design is navigating to the respective page
	When Complete Login Process
#	Then Tap on Hamurger icon navigates to App settings screen
#	And Tap on Rewards icon navigates to rewards home page
#	And Tap on Total account balance navigates to Networth page
#	And Tap on Deposit money CTA navigates to deposit screen
#	And Tap on Savings tag and pro salary tags navigates to Account types page
#	And Tap on VKYC prompts navigates to to respective pages
#	And Tap on Transfers navigates to Payments page
#	And Tap on Money navigates to Money page
#	And Tap on Cards navigates to Cards page
	And Tap on Help navigates to Help page


	@positive @C15115
	Scenario: Verify the behavior of when tap on transactions, SeeAll CTA and TrackSpends.
	When Complete Login Process
	Then Tap on any one of the transaction navigates to Transaction Details page
	And Tap on see all navigates to all Transaction screen
	And Tap on track spends navigates to Insights screen
	
	 