Feature: Patient Dropdown
@distanceReason
Scenario: User selects a patient  
#This test is specific to picking the last (newest) patient
	Given user navigates to See Great customer service portal "https://seegreatportal-q.visionworks.com/?storeNum=1006&associateId=12702"
	When user clicks on the chevron next to the patient
	Then patient is expanded
	
Scenario: Workflow when user saves a Reason for dissatisfaction
	Given user sees expanded view of patient 
	When user chooses Unclear vision in distance from the Reason for dissatisfaction dropdown menu
	And user enters comments in the Additional Notes text box
	And  user clicks save
	Then user should see the entry in the reasons for dissatisfaction list

	
