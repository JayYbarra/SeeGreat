package com.seeGreat.step_definitions.patientSearch.csSearch;

import org.openqa.selenium.WebDriver;

import com.seeGreat.pages.PatientSearch;
import com.seeGreat.utilities.Driver;

import cucumber.api.java.en.When;

public class TransNumDateSearch {
	WebDriver driver = Driver.getDriver();
	PatientSearch patientSearchCS = new PatientSearch();
	
	@When("user types {string} , {string}")
	public void user_types(String transactionNum, String transactionDate) {
		patientSearchCS.tranNo.sendKeys(transactionNum);
		patientSearchCS.tranDate.sendKeys(transactionDate);
	}

}
