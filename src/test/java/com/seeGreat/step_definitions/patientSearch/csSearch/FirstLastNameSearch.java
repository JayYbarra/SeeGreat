package com.seeGreat.step_definitions.patientSearch.csSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seeGreat.pages.PatientSearch;
import com.seeGreat.utilities.BrowserUtils;
import com.seeGreat.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstLastNameSearch {
	WebDriver driver = Driver.getDriver();
	PatientSearch patientSearchCS = new PatientSearch();

	@Given("user clicks on Patient Search button")
	public void user_clicks_on_Patient_Search_button() {
		BrowserUtils.waitFor(1);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patientSearchCS.patientSearch);
	}

	@When("user enters {string} , {string}")
	public void user_enters(String firstName, String lastName) {
		patientSearchCS.firstName.sendKeys(firstName);
		patientSearchCS.lastName.sendKeys(lastName);
	}

	@When("user clicks the Search button")
	public void user_clicks_the_Search_button() {
		BrowserUtils.waitFor(2);
		patientSearchCS.searchButton.click();
		BrowserUtils.waitFor(1);
	}

	@Then("patient should display")
	public void patient_should_display() {
		List<WebElement> errorMessage = driver.findElements(By.xpath("//*[contains(text(),'Oops!')]"));
		if (errorMessage.size() == 0) {
			String patientName = driver.findElement(By.xpath("(//*[@class='col-2 text-color data-padding'])[1]"))
					.getText();
			System.out.println("Patient found: " + patientName);
		} else {
			System.out.println("Error: " + driver.findElement(By.xpath("//*[contains(text(),'Oops!')]")).getText());
		}

	}
}
