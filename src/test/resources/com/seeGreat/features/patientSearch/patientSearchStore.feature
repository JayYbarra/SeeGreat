Feature: Patient Search
@patientSearchStore
Scenario Outline: Store portal patient search
	Given user navigates to See Great store portal "http://txs-q-ecgw1:1803/?storeNum=1221&associateId=34941"
	And user clicks on Patient Search
	When user enters "<FirstName>" , "<LastName>" , "<DateOfBirth>"
	And user clicks the Search button
	Then patient is displayed

	
Examples:
		|FirstName|   |LastName|  |DateOfBirth| 
		|Tom      |   |Test    |  |09/26/1960 |   
	