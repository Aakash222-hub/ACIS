package com.acis.automation.pages.personaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class Addresses extends PageBase {
	final static Logger logger = LoggerFactory.getLogger(Addresses.class);
	public Addresses() throws AcisException {
				// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@title='New']")
	WebElement newAddresses;
	
	@FindBy(xpath = "//a[text()='Mailing']")
	WebElement addressType;
	
	@FindBy(xpath = "//label/span[text()='Primary Address']/../..//input")
	WebElement primaryAddress;

	@FindBy(xpath = "//span[text()='Street 1']/../..//input")
	WebElement street1;
	
	@FindBy(xpath = "//span[text()='Street 2']/../..//input")
	WebElement street2;
	
	@FindBy(xpath = "//span[text()='City']/../..//input")
	WebElement city;
	
	@FindBy(xpath = "//span[text()='State/Territory']/../..//a")
	WebElement state;
	
	@FindBy(xpath = "//span[text()='Zip/Postal Code']/../..//input")
	WebElement zipCode;
	
	@FindBy(xpath = "//span[text()='Country']/../..//a[text()='United States of America']")
	WebElement country;
	
	@FindBy(xpath = "//span[text()='Start Date']/../..//input")
	WebElement startDatePicker;
	
	@FindBy(xpath = "//label[text()='End Date']/../..//input")
	WebElement endDatePicker;
	
	@FindBy(xpath = "//label/span[text()='Latitude']/../..//input")
	WebElement latitude;
	
	@FindBy(xpath = "//label/span[text()='Longitude']/../..//input")
	WebElement longitude;
	
	@FindBy(xpath ="//span[text()='1']")
	WebElement startDate;
	
	@FindBy(xpath ="//span[text()='26']")
	WebElement endDate;
	
	@FindBy(xpath ="//button[@title='Save']")
	WebElement save;

	
	public void clickNewBtn() throws AcisException {
		refreshPage();
		clickWebElement(newAddresses);
		logger.info("Clicked on New Addresses Button");

	}
	
	public void selectAddressType(String type) throws AcisException {
		waitForElement(addressType);
		selectDropdownByVisibleTextUsingJavascriptExecutor(addressType, type);
		logger.info("Address Type selected: " + type);

	}
	
	public void checkPrimaryAddress() throws AcisException {
		clickWebElement(primaryAddress);
		logger.info("Checked PrimaryAddress checkbox");

	}
	
	public void enterTextFieldValue(String textFieldName, String strValue) throws AcisException {
		switch(textFieldName)
		{
		   case "street1Name":
			   enterText(street1, strValue);
				logger.info("Entered Street1 as: " + strValue);
		      break;
		   
		   case "street2Name":
			   enterText(street2, strValue);
				logger.info("Entered Street2 as: " + strValue);
		   break;
		   
		   case "cityName":
			   enterText(city, strValue);
				logger.info("Entered City as: " + strValue);
		   break;
		   
		   case "zipCode":
			   enterText(zipCode, strValue);
				logger.info("Entered Zip/Postal Code as: " + strValue);
			   break;
			   
		   case "latitude":
			   enterText(latitude, strValue);
				logger.info("Entered Latitude as: " + strValue);
			   break;
			   
		   case "longitude":
			   enterText(longitude, strValue);
				logger.info("Entered Longitude as: " + strValue);
			   break;
		  
		   default : 
			   logger.info("Text Field Value: " + textFieldName+"did not find");
		}
	}
	
	public void selectCountry(String countryName) throws AcisException {
		selectDropdownByVisibleTextUsingJavascriptExecutor(country, countryName);
		logger.info("Country selected: " + countryName);

	}
	
	public void selectState(String stateName) throws AcisException {
		selectDropdownByVisibleTextUsingJavascriptExecutor(state, stateName);
		logger.info("State selected: " + stateName);

	}
	
	public void selectStartDate() throws AcisException {
		clickWebElement(startDatePicker);
		waitForElement(startDate);
		clickWebElement(startDate);
		logger.info("Start Date Selected");

	}
	
	public void selectEndDate() throws AcisException {
		clickWebElement(endDatePicker);
		waitForElement(endDate);
		clickWebElement(endDate);
		logger.info("End Date Selected");

	}
	
	
	public void clickSaveBtn() throws AcisException {
		clickWebElement(save);
		logger.info("Clicked on Save Button");

	}
}
