package com.seeGreat.step_definitions.patientSearch.csSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 

import com.seeGreat.pages.PatientSearch;
import com.seeGreat.utilities.BrowserUtils;
//import com.seeGreat.utilities.ConfigurationReader;
import com.seeGreat.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientSearchButton {
	WebDriver driver = Driver.getDriver();
	String SeeGreatURL = "https://seegreatportal-u.visionworks.com/";
	PatientSearch patientSearchCS = new PatientSearch();

	@Given("user is at the customer service portal")
	public void user_is_at_the_customer_service_portal() {
		driver.get(SeeGreatURL);
//		driver.get(ConfigurationReader.getProperty("urlCS"));
		BrowserUtils.waitFor(1);
		driver.findElement(By.name("loginfmt")).sendKeys("jybarra@hvhcvision.com");
		driver.findElement(By.id("idSIButton9")).click();
	}

	@When("user clicks on the Patient Search button")
	public void user_clicks_on_the_Patient_Search_button() {
		BrowserUtils.waitFor(1);

		// To call from class
		// Scroll the browser to the element's X position
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patientSearchCS.patientSearch);

		// --------------------------------------------------------------------------------------------------------
		// To manually click the element
		// WebElement element = driver.findElement(By.id("Search"));

		// Scroll the browser to the element's X position

		// ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

		// --------------------------------------------------------------------------------------------------------

	}

	@Then("Patient Search pop-up window should display")
	public void patient_Search_pop_up_window_should_display() {
		String firstNameText = patientSearchCS.patientSearchWindow.getText();
		System.out.println(firstNameText);
	}

}
