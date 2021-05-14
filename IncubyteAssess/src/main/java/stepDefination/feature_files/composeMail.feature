Feature: Compose

Background: User navigates to Gmail
	Given  I am on gmail sign-in page
	
	@Compose
	#login to gmail then compose and send mail
Scenario:
	When User enters the gmail id
	And User click on next button for password screen
	And User clicks on password textbox
	And User enters the password
	And User click on next button for login
	And User clicks on composeBtn
	And User clicks on Recipent TextBox
	And User enters Email in Recipent TextBox
	And User enters Subject in subject TextBox
	And User clicks on body TextBox
	And User enters Email body in Body TextBox
	And User clicks on send mail button
	
	