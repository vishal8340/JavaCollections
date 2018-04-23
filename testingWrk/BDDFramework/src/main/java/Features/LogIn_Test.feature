Feature: ConfigTool Login Feature

#Data Tables in Cucumber
Scenario: ConfigTool Login Test Scenario
Given user already on login page 
When title of login page if configtool
Then user enters Credentials and tool to LogIn
		 | vverma 	 | 123456   | Checker |
Then user clicks on login button 
Then user is on home page	
And  log out the home page