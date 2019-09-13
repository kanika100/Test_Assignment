Feature: Traction 

Scenario Outline: To verify the signup page of mtraction 
	Given launch chrome and start application 
	When User clicks on Signup button 
	Then User enters "<name>" and "<email>" and "<password>" and "<confirmpass>" 
	And user select country 
	And User checks termncondition checkbox 
	And User clicks signup button 
#	And user is successfully registered 
	
Examples: 
		|name      |email             |password |confirmpass|
		|kanika    |kanikaagarwal     |Qait@100 |Qait@100   |