Feature: ConfigTool Login Feature

#without Examples Keyword
#Scenario: ConfigTool Login Test Scenario
#Given user already on login page 
#When  title of login page if configtool
#Then  user enters "vverma" and "123456" and select "Checker"
#Then  user clicks on login button 
#Then  user is on home page	
#And  log out the home page

#with Examples Keyword

Scenario Outline: ConfigTool Login Test Scenario
Given user already on login page 
When  title of login page if configtool
Then  user enters "<username>" and "<password>" and select "<tool>"
Then  user clicks on login button 
Then  user is on home page
And  log out the home page

Examples:
	| username | password | tool 		|
	| vverma 	 | 123456   | Checker |
	| peter 	 | peter@1  | Updater |

