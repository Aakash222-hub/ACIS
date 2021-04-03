package com.acis.automation.pages.intake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PersonsInvovled_Omniscript extends PageBase {

	public PersonsInvovled_Omniscript() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_Omniscript.class);

	@FindBy(xpath = "(//*[text()[contains(.,'Person(s) Involved')]])[2]")
	WebElement PersonsInvolvedTitle;

	@FindBy(xpath = "//*[contains(text(),'Intake Person Information')]")
	WebElement IntakePersonInformationLabel;

	@FindBy(xpath = "//p[text()='Create/Add']")
	WebElement CreateAddButton;

	@FindBy(xpath = "(//div[@role='button']//*[text()='Edit'])[2]")
	WebElement EditButton;

	@FindBy(xpath = "(//input[@id='FirstName'])[2]")
	WebElement FirstNameTextBox;

	@FindBy(xpath = "(//input[@id='LastName'])[2]")
	WebElement LastNameTextBox;

	@FindBy(xpath = "(//input[@id='MiddleName'])[2]")
	WebElement MiddleName;

	@FindBy(xpath = "(//select[@id='Relationship'])[2]")
	WebElement Relationship;

	@FindBy(xpath = "(//select[@id='Role'])[2]")
	WebElement Role;

	@FindBy(xpath = "(//select[@id='Suffix'])[2]")
	WebElement Suffix;

	@FindBy(xpath = "(//select[@id='State'])[2]")
	WebElement State;

	@FindBy(xpath = "(//select[@id='Country'])[2]")
	WebElement Country;

	@FindBy(xpath = "(//input[@id='Age'])[2]")
	WebElement Age;

	@FindBy(xpath = "//button[@id='alert-ok-button']")
	WebElement Alert_OkButton;

	@FindBy(xpath = "(//span/following-sibling::span[text()='American Indian or Alaska Native'])[2]")
	WebElement Race_AmericanIndianAlaskaNative;

	@FindBy(xpath = "(//span/following-sibling::span[text()='Asian'])[2]")
	WebElement Race_Asian;

	@FindBy(xpath = "(//input[@id='Birthdate'])[2]")
	WebElement BirthDate;

	@FindBy(xpath = "(//span/following-sibling::span[text()='Black or African American'])[2]")
	WebElement Race_BlackAfricanAmerican;

	@FindBy(xpath = "(//input[@id='City'])[2]")
	WebElement City;

	@FindBy(xpath = "//span[text()='20']")
	WebElement DateBirthdate;

	@FindBy(xpath = "//span[text()='10']")
	WebElement DateOfDeath;

	@FindBy(xpath = "(//div[contains(text(),'Birthdate Cannot be Greater than Date of Death')])[2]")
	WebElement DateBirthDateError;

	@FindBy(xpath = "(//input[@id='DateOfDeath'])[2]")
	WebElement DeathDate;

	@FindBy(xpath = "(//div[contains(text(),'Date of Death Cannot be Future Date')])[2]")
	WebElement DeathDateError;

	@FindBy(xpath = "(//input[@id='Email'])[2]")
	WebElement EmailId;

	@FindBy(xpath = "(//span/following-sibling::span[text()='Native Hawaiian or Other Pacific Islander'])[2]")
	WebElement Race_NativeHawaiian;

	@FindBy(xpath = "(//select[@id='Gender'])[2]")
	WebElement Gender;

	@FindBy(xpath = "(//span/following-sibling::span[text()='Hispanic or Latino'])[2]")
	WebElement Race_HispanicOrLatino;

	@FindBy(xpath = "//div[@id='PersonsInvolved_nextBtn']")
	WebElement NextButton_PersonsInvovled;

	@FindBy(xpath = "//button[@title='Next Month']")
	WebElement NextMonth;

	@FindBy(xpath = "(//*[@id='Notes'])[2]")
	WebElement Notes_textarea;

	@FindBy(xpath = "(//label[contains(.,'Notes')])[2]")
	WebElement Notes_label;

	@FindBy(xpath = "(//input[@id='Phone'])[2]")
	WebElement Phone;

	@FindBy(xpath = "(//span[contains(text(),'Primary Address')])[2]")
	WebElement PrimaryAddress;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement SaveButton;

	@FindBy(xpath = "//*[text()='Unable to Determine']")
	WebElement Race_UnableToDetermine;

	@FindBy(xpath = "(//span/following-sibling::span[text()='White'])[2]")
	WebElement Race_White;

	@FindBy(xpath = "(//input[@id='ZipPostalCode'])[2]")
	WebElement ZipCode;

	@FindBy(xpath = "(//input[@id='ZipPostalCode']/../..//a[contains(text(),'i')])[2]")
	WebElement ZipCode_I;

	@FindBy(xpath = "//textarea[@id='Narrative2']")
	WebElement Narrative_textarea;

	public By MiddleNameError = By.xpath("(//*[contains(text(),'Middle Name should not include numbers or Special characters')])[2]");

	public By FirstNameError = By.xpath("(//*[contains(text(),'First Name should not include numbers or Special characters')])[2]");

	public By FirstNameRequired = By.xpath("(//input[@id='FirstName'][@required='required'])[2]");

	public By LastNameRequired = By.xpath("(//input[@id='LastName'][@required='required'])[2]");

	public By LastNameError = By.xpath("(//*[contains(text(),'Last Name should not include numbers or Special characters')])[2]");

	public By ZipCode_error = By.xpath("//*[contains(text(),'Zip code must be in 99999 or 99999-9999 format')]");

	/**
	 * Verify First Name and Last name are required field
	 * @throws AcisException 
	 */
	public void verifyFirstnameLastnamerequired() throws AcisException {
		waitAndVerifyElement(FirstNameRequired);
		waitAndVerifyElement(LastNameRequired);
		Assert.assertTrue(SaveButton.isDisplayed(), SaveButton + " Element is not Disabled ");
		logger.info("Verify First Name and Last name are required field");
	}

	/**
	 * Verify first name , middle name, last name can not accept numbers, symbols
	 * @throws AcisException 
	 */
	public void verifyAllNamesNotAcceptNumbers() throws AcisException {
		enterText(FirstNameTextBox, "Demo@123");
		enterText(MiddleName, "DEmo2#2");
		enterText(LastNameTextBox, "Demo$%5");

		clickWebElement(SaveButton);

		waitAndVerifyElement(FirstNameError);
		waitAndVerifyElement(MiddleNameError);
		waitAndVerifyElement(LastNameError);
		logger.info("Verify first name , middle name, last name can not accept numbers, symbols");

		FirstNameTextBox.clear();
		MiddleName.clear();
		LastNameTextBox.clear();

	}

	/**
	 * Set First name, middle name, last name
	 * @throws AcisException 
	 */
	public void SetAllNames(String firstName, String middleName, String lastName) throws AcisException {
		enterText(FirstNameTextBox, firstName);
		enterText(MiddleName, middleName);
		enterText(LastNameTextBox, lastName);

		clickWebElement(SaveButton);
		logger.info("Set First name, middle name, last name");
	}

	/**
	 * Give suffix
	 * @throws AcisException 
	 */

	public void PrvoideSuffix(String suffix) throws AcisException {
		clickWebElement(Suffix);
		selectDropdownByValue(Suffix, suffix);
		logger.info("Set suffix");
	}

	/**
	 * Set contact information : phone and email
	 * @throws AcisException 
	 */
	public void ProvideContactInformation(String phone, String emailID) throws AcisException {

		enterText(Phone, phone);
		enterText(EmailId, emailID);
		logger.info("Set contact information : phone and email");
	}

	/**
	 * Select relationship
	 * @throws AcisException 
	 */
	public void PrvoideRelationship(String option) throws AcisException {
		clickWebElement(Relationship);
		selectDropdownByVisibleText(Relationship, option);
		logger.info("Select relationship");
	}

	/**
	 * Select role
	 * @throws AcisException 
	 */
	public void PrvoideRole(String roleoption) throws AcisException {
		clickWebElement(Role);
		selectDropdownByVisibleText(Role, roleoption);
		logger.info("Select role");
	}

	/**
	 * Set zip code
	 *//*
		 * public void ProvideZipCode(String zipCode) {
		 * 
		 * enterText(ZipCode, zipCode);
		 * 
		 * }
		 */

	/**
	 * Verify Zip code must be in 99999 or 99999-9999 format
	 * @throws AcisException 
	 */
	public void VerifyZipCodeFormat() throws AcisException {

		enterText(ZipCode, "3433");
		hoverOverElement(ZipCode_I);

		waitAndVerifyElement(ZipCode_error);

	}
	
	
	public void enterTextFieldValueOnPersonsInvovled(String textFieldName, String strValue) throws AcisException {
		switch(textFieldName)
		{
		   case "phone":
			   waitForElement(Phone);
				enterText(Phone, strValue);
		      break;
		   
		   case "zipcode":
			   waitForElement(ZipCode);
				enterText(ZipCode, strValue);
		      break;
		      
		   case "emailId":
			   waitForElement(EmailId);
				enterText(EmailId, strValue);
		      break;
		      
		   case "narrative":
			   waitForElement(Narrative_textarea);
				enterText(Narrative_textarea, strValue);
		      break;
		  
		   default : 
			   logger.info("Text Field Value: " + textFieldName+"did not find");
		}
	
	}
	
}
