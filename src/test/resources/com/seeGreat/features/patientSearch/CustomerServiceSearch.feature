Feature: Patient Search 

@PatientSearchCS
Scenario: User navigates to Patient Search pop-up window
	Given user is at the customer service portal
	When user clicks on the Patient Search button
	Then Patient Search pop-up window should display
	
#@FirstLastNameCS
#Scenario Outline: User searches for a patient in the customer service portal using First Name and Last Name
#	Given user is at the customer service portal
#	And user clicks on Patient Search button
#	When user enters "<FirstName>" , "<LastName>" 
#	And user clicks the Search button
#	Then patient should display
	
#Examples:
#		|FirstName|   |LastName|
#		|michael  |   |Test    |

#Scenario: User uses the Clear Search button
#	Given patient is displayed
#	When user clicks on the Clear Search button
#	Then user should be directed back to home page

@FirstLastNameCS
Scenario Outline: User searches for a patient in the customer service portal using First Name and Last Name
	Given user is at the customer service portal
	And user clicks on Patient Search button
	When user enters "<FirstName>" , "<LastName>" 
	And user clicks the Search button
	Then patient should display
	
Examples:
		|FirstName|   |LastName|
		|michael  |   |Test    |
		
		
@PhoneCS
Scenario Outline: User searches for a patient in the customer service portal using Phone Number only
	Given user is at the customer service portal
	And user clicks on Patient Search button
	When user enters "<PhoneNumber>"
	And user clicks the Search button
	Then patient should display
Examples:
		|PhoneNumber|
		|3203397161 |
		

@TransNumCS
Scenario Outline: User searches for a patient in the customer service portal using Transaction Number only
	Given user is at the customer service portal
	And user clicks on Patient Search button
	When user types "<TransactionNum>"
	And user clicks the Search button
	Then patient should display
Examples:
		|TransactionNum|
		|5026118       |
		
		
@FirstLastNameDobCS
Scenario Outline: User searches for a patient in the customer service portal using First Name and Last Name
	Given user is at the customer service portal
	And user clicks on Patient Search button
	When user enters "<FirstName>" , "<LastName>", "<DOB>"
	And user clicks the Search button
	Then patient should display
Examples:
		|FirstName|  |LastName|  |DOB       |
		|Sylvia   |  |Test    |  |05/11/1982|
		
		
@FnLnSecondaryDobCS
Scenario Outline: User searches for a patient in the customer service portal using First Name and Last Name
	Given user is at the customer service portal
	And user clicks on Patient Search button
	When user enters "<FirstName>" , "<LastName>"
	And user chooses "<Month>" , "<Year>" , "<Day>"
	And user clicks the Search button
	Then patient should display
Examples:
		|FirstName|  |LastName|  |Month| |Year| |Day|
		|Sylvia   |  |Test    |  |May  | |1982| |11 |
		

@TransDateNumCS
Scenario Outline: User searches for a patient in the customer service portal using Transaction Number and Transaction Date
	Given user is at the customer service portal
	And user clicks on Patient Search button
	When user types "<TransactionNum>" , "<TransactionDate>"
	And user clicks the Search button
	Then patient should display
Examples:
		|TransactionNum| |TransactionDate|
		|5026118       | |03/04/2019     |
		
@TransSecondaryDateCS
Scenario Outline: User searches for a patient in the customer service portal using First Name and Last Name
	Given user is at the customer service portal
	And user clicks on Patient Search button
	When user types "<TransactionNum>"
	And user clicks "<Month>" , "<Year>" , "<Day>"
	And user clicks the Search button
	Then patient should display
Examples:
		|TransactionNum|  |Month| |Year| |Day|
		|5026118       |  |May  | |1982| |11 |
		
