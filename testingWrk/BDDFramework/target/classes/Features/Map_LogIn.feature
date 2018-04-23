Feature: ConfigTool Login Feature

#With Map in Cucumber
Scenario: ConfigTool Login  Scenario
Given user already on login page 
When title of login page if configtool
Then user enters Credentials and tool to LogIn
		 |username   |password  |  tool   | 
		 |	vverma 	 | 123456   | Checker |
		 |  vverma	 | 123456   | Updater |
Then user clicks on login button 
Then user is on home page	
And  log out the home page