package com.seeGreat.step_definitions.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

// import com.seeGreat.utilities.ConfigurationReader;
import com.seeGreat.utilities.DBUtils;
import com.seeGreat.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	WebDriver driver = Driver.getDriver();
	
	@Before
	public void setUp() {
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		
		// Driver.getDriver().manage().window().fullscreen();
        // Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@Before("@db")
	public void setUpDBConnection() {
		DBUtils.createConnection();
	}

	@After("@db")
	public void tearDownDBConnection() {
		DBUtils.destroy();
	}

	@After
	public void tearDown(Scenario scenario) {
		// only takes a screenshot if the scenario fails
		if (scenario.isFailed()) {
			// taking a screenshot
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			// adding the screenshot to the report
			scenario.embed(screenshot, "image/png");
		}
		//Driver.closeDriver();
	}
}
