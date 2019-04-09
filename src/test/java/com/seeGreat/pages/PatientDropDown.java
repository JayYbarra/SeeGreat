package com.seeGreat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seeGreat.utilities.Driver;

public class PatientDropDown {
	public PatientDropDown() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "(//*[@class = 'fa fa-ellipsis-h'])[1]")
	public WebElement transDetailsButton; // How to match to patient
	
	@FindBy(xpath = "(//*[@class = 'row row-margin']/td)[1]")
	public WebElement patientDropDown;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement cancelButton;
	
	@FindBy(xpath = "//button[contains(text(), 'Close Ticket')]")
	public WebElement closeTicketButton;
	
	@FindBy(xpath = "//button[contains(text(),'Send to Store')]")
	public WebElement sendButton;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//*[@formcontrolname = 'disappointmentReason']")
	public WebElement reasonDropDown;
	
	@FindBy(xpath = "//*[@value= '1']")
	public WebElement distanceReason;
	
	@FindBy(xpath = "//*[@value= '2']")
	public WebElement readingReason;
	
	@FindBy(xpath = "//*[@value= '3']")
	public WebElement lensReason;
	
	@FindBy(xpath = "//*[@value= '4']")
	public WebElement frameReason;
	
	@FindBy(xpath = "//*[@value= '5']")
	public WebElement otherReason;
	
	@FindBy(xpath = "//*[@formcontrolname = 'additionalNotes']")
	public WebElement additionalNotes;
	
	@FindBy(xpath = "//button[contains(text(),'Undo')]")
	public WebElement undoButton;
	
}
