package com.seeGreat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.seeGreat.utilities.Driver;

public class PatientSearch {
	WebDriver driver = Driver.getDriver();

	public PatientSearch() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
// Windows
	@FindBy(xpath = "//label[contains(text(),'First Name:')]")
	public WebElement patientSearchWindow;
	
	
// Buttons
	@FindBy(xpath = "//*[@type = 'submit']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement cancelButton;
	
	@FindBy(xpath = "//*[@id = 'Search']") // used javascript executor
	public WebElement patientSearch;
	
	@FindBy(xpath = "//*[@id = 'Clear']")
	public WebElement clearSearch;
	
	@FindBy(xpath = "(//*[@class = 'btn btn-outline-secondary calendar'])[1]")
	public WebElement secondaryDOB;
	
	@FindBy(xpath = "(//*[@class = 'btn btn-outline-secondary calendar'])[2]")
	public WebElement secondaryTransDate;
	
	@FindBy(xpath = "//select[@title='Select month']")
    public WebElement selectMonth;
	
    public void selectMonthMethod(String month) { // select month from secondary calendar
        Select selectDropdownMonth = new Select(selectMonth);
        selectDropdownMonth.selectByVisibleText(month);
    }
	
	@FindBy(xpath = "//select[@title='Select year']")
    public WebElement selectYear;
	
    public void selectYearMethod(String year) { // select year from secondary calendar
        Select selectDropdownYear = new Select(selectYear);
        selectDropdownYear.selectByVisibleText(year);
    }

    public void selectDayMethod(String day) { // select day from secondary calendar
       driver.findElement(By.xpath("//div[contains(text(),'"+day+ "')]")).click();
    }
	
// Text Boxes
	@FindBy(xpath = "//*[@formcontrolname = 'FirstName']")
	public WebElement firstName;
	
	@FindBy(xpath = "//*[@formcontrolname = 'LastName']")
	public WebElement lastName;
	
	@FindBy(xpath = "//*[@id = 'dateOfBirth']")
	public WebElement dateOfBirth;
	
	@FindBy(xpath = "//*[@formcontrolname = 'Phone']")
	public WebElement phone;
	
	@FindBy(xpath = "//*[@formcontrolname = 'TranNo']")
	public WebElement tranNo;
	
	@FindBy(xpath = "//*[@id = 'TranDate']")
	public WebElement tranDate;
	
	@FindBy(xpath = "//*[@formcontrolname = 'Email']")
	public WebElement email;
	

// probably belongs to dropdown	
	@FindBy(xpath = "//*[@formcontrolname = 'associateName']")
	public WebElement associateName;
	
	
}
