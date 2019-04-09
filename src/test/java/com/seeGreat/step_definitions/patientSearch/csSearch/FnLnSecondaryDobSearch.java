package com.seeGreat.step_definitions.patientSearch.csSearch;

import org.openqa.selenium.WebDriver;

import com.seeGreat.pages.PatientSearch;
import com.seeGreat.utilities.Driver;

import cucumber.api.java.en.When;

public class FnLnSecondaryDobSearch {
	WebDriver driver = Driver.getDriver();
	PatientSearch patientSearchCS = new PatientSearch();
	
	@When("user chooses {string} , {string} , {string}")
	public void user_chooses(String month, String year, String day) {
		patientSearchCS.secondaryDOB.click();
		patientSearchCS.selectYearMethod(year);
		patientSearchCS.selectMonthMethod(month);
		patientSearchCS.selectDayMethod(day);
		

	}
}
