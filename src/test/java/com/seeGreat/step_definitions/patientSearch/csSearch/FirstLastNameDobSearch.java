package com.seeGreat.step_definitions.patientSearch.csSearch;

import org.openqa.selenium.WebDriver;

import com.seeGreat.pages.PatientSearch;
import com.seeGreat.utilities.Driver;

import cucumber.api.java.en.When;

public class FirstLastNameDobSearch {
	WebDriver driver = Driver.getDriver();
	PatientSearch patientSearchCS = new PatientSearch();
	
	@When("user enters {string} , {string}, {string}")
	public void user_enters(String firstName, String lastName, String DOB) {
		patientSearchCS.firstName.sendKeys(firstName);
	    patientSearchCS.lastName.sendKeys(lastName);
	    patientSearchCS.dateOfBirth.sendKeys(DOB);
	}
}
