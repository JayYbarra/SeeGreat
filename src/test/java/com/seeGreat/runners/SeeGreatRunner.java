package com.seeGreat.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
				// One tag ---> mvn test -Dcucumber.options="--tags @FirstLastNameDobCS"
				// multiple tags ---> mvn test -Dcucumber.options="--tags @shoppingWithoutInsuranceForNonRxLenses,@singleMemberLookup"
				// mvn verify -Dcucumber.options="@shoppingWithoutInsuranceForNonRxLenses" --> 
				// This is being used in Powershell when we want to see
				// cucumber reports under target folder (cucumber reports)
		 
		},
			
	//	for multiple tests, use multiple tags: tags= {"@tagOne , @tagTwo"},
			tags= {"@FirstLastNameCS"},
		features="src/test/resources/com/seeGreat/features", 
		glue="com/seeGreat/step_definitions"
		,dryRun = false
		,monochrome = true
		)
public class SeeGreatRunner {}


