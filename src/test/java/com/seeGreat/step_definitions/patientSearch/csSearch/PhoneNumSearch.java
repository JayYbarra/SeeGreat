package com.seeGreat.step_definitions.patientSearch.csSearch;

import org.openqa.selenium.WebDriver;

import com.seeGreat.pages.PatientSearch;
import com.seeGreat.utilities.BrowserUtils;
import com.seeGreat.utilities.Driver;

import cucumber.api.java.en.When;

public class PhoneNumSearch {
	WebDriver driver = Driver.getDriver();
	PatientSearch patientSearchCS = new PatientSearch();
	
	@When("user enters {string}")
	public void user_enters(String phoneNumber) {
	    patientSearchCS.phone.sendKeys(phoneNumber);
	    BrowserUtils.waitFor(1);
	}
}
