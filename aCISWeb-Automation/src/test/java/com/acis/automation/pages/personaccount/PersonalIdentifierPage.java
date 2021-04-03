package com.acis.automation.pages.personaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PersonalIdentifierPage extends PageBase {

	public PersonalIdentifierPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(PersonalIdentifierPage.class);

	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//span[text()='ID Type Non-SSN']")
	WebElement radioNonSSN;
	
	@FindBy(xpath = "//a[text()='Drivers License' and @class='select']")
	WebElement identifierType;
	
	@FindBy(xpath = "//span[text()='Identifier Number']/../..//input[@type='text']")
	WebElement identifierNumber;
	
	@FindBy(xpath = "//span[text()='ID Type SSN']")
	WebElement radioSSN;
	
	@FindBy(xpath = "//span[text()='Social Security Number']/../..//input")
	WebElement socialSecurityNumber;
	
	
	@FindBy(xpath = "//span[text()='Issued Date']/../..//input[@type='text']")
	WebElement issuedDatePicker;
	
	@FindBy(xpath = "//span[text()='12']")
	WebElement issuedDate;
	
	@FindBy(xpath = "//span[text()='Expiry Date']/../..//input[@type='text']")
	WebElement expiryDatePicker;
	
	@FindBy(xpath = "//span[text()='19']")
	WebElement expiryDate;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement saveButton;
	
	@FindBy(xpath = "//a[@title='Drivers License' and @class='selected']")
	WebElement driverLicense;
	
	public By  identifierNumberVerify = By.xpath("//span[text()='Identifier Number']/../..//lightning-formatted-text[text()='"+testData.get(Constants.PERSONALIDENTIFIERPAGE).get("nonSSNNumber")+"']");
	
	public By  ssnRecordVerify = By.xpath("//span[contains(@class,'read-only')]//lightning-formatted-text[text()='SSN']");
	
	public By  identifierTypeSSN = By.xpath("//span[text()='Identifier Type']/../..//span[text()='SSN']");
	
	public By errorSSNFormat = By.xpath("//li[contains(text(),'format') and contains(text(),'SSN')]");
	
	public By insNumber = By.xpath("//a[@title='INS Number']");
	
	public By medicaid = By.xpath("//a[@title='Medicaid']");
	
	public By medicare = By.xpath("//a[@title='Medicare']");
	
	public By passport = By.xpath("//a[@title='Passport']");
	
	public By military = By.xpath("//a[@title='Military']");
	
	
	/**
	 * Click New button on Personal Identifier Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickNewButton() throws AcisException {
		logger.info("Clicking New button");
		waitForElementClickable(newButton);
		clickWebElement(newButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked New button");
	}
	
	/**
	 * Verify Identifier Number from Non-SSN Record type
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyIdentifierNumber() throws AcisException {
		isElementPresent(identifierNumberVerify);
		waitForPageLoad();
		logger.info("Identifier Number from Non-SSN Record Verified");
	}
	
	/**
	 * Select New Personal Identifier Type using radio button
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectPersonalIdentifierType(String str) throws AcisException {
		logger.info("Selecting Personal Identifier Type as "+str);
		switch(str)
		{
		case "Non-SSN":
			clickWebElement(radioNonSSN);
			logger.info("Personal Identifier Type "+str+" selected");
			break;
		
		case "SSN":
			clickWebElement(radioSSN);
			logger.info("Personal Identifier Type "+str+" selected");
			break;
			
			default:
				logger.info("Personal Identifier Type "+str+" not found");
		}
	}
	
	
	/**
	 * Click Next button on Personal Identifier Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking Next button");
		clickWebElement(nextButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked Next button");
	}
	
	/**
	 * Verify : All Options are available in Non-SSN Personal Identifier Type
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyIdentiferTypeNonSSN() throws AcisException, InterruptedException {
		logger.info("Verifying options in Non-SSN Identifer Type");
		clickWebElemntUsingJavascriptExecutor(identifierType);
		waitForPageLoadTill(2);
		isElementPresent(insNumber);
		isElementPresent(medicaid);
		isElementPresent(medicare);
		isElementPresent(passport);
		isElementPresent(military);
		clickWebElemntUsingJavascriptExecutor(driverLicense);
		logger.info("Verifyied options in Non-SSN Identifer Type");
	}
	
	/**
	 * Enter Identifier Number in Non-SSN Personal Identifier
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void enterIdentifierNumberNonSSN(String str) throws AcisException {
		logger.info("Entering Identifier Number in Non-SSN Personal Identifier");
		enterText(identifierNumber, str);
		logger.info("Enterered Identifier Number in Non-SSN Personal Identifier");
	}
	
	/**
	 * Set Issued Date/ Expiry Date on Report Details Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void setDate(String field) throws AcisException, InterruptedException{
		switch(field)
		{
			case "Issued" :
				logger.info("Selecting Issued Date succesfully");
				clickWebElemntUsingJavascriptExecutor(issuedDatePicker);
				waitForElement(issuedDate);
				clickWebElemntUsingJavascriptExecutor(issuedDate);
				waitForPageLoadTill(2);
				logger.info("Issued Date succesfully selected");
				break;
				
			case "Expiry" :
				logger.info("Selecting Expiry Date succesfully");
				clickWebElemntUsingJavascriptExecutor(expiryDatePicker);
				waitForElement(expiryDate);
				clickWebElemntUsingJavascriptExecutor(expiryDate);
				waitForPageLoadTill(2);
				logger.info("Expiry Date succesfully selected");
				break;
			default : 
				   logger.info("Date: " + field +" not found");
				   break;
		}
	}
	
	/**
	 * Verify SSN Identifier Type on SSN Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifySSNRecord() throws AcisException {
		logger.info("Verifying SSN Record created");
		isElementPresent(ssnRecordVerify);
		logger.info("SSN Record created verified");
	}
	
	/**
	 * Verify Non-SSN Identifier Type on Non-SSN Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyNonSSNRecord() throws AcisException {
		logger.info("Verifying SSN Record created");
		isElementPresent(ssnRecordVerify);
		logger.info("SSN Record created verified");
	}
	
	/**
	 * Identifier Type SSN verified on New SSN Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyIdentifierTypeSSN() throws AcisException {
		logger.info("Verifying Identifier Type : SSN");
		isElementPresent(identifierTypeSSN);
		logger.info("Identifier Type SSN Verified");
	}
	
	/**
	 * Click Next button on Personal Identifier Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void enterSocialSecurityNumber(String Option, String str) throws AcisException, InterruptedException {
		
		switch(Option)
		{
		case "Wrong":
			logger.info("Entering Wrong SSN Format");
			enterText(socialSecurityNumber, str);
			clickSaveButton();
			logger.info("Entered Wrong SSN Format");
			waitForPageLoad();
			waitForPageLoadTill(5);
			isElementPresent(errorSSNFormat);
			logger.info("Verifying Wrong SSN Format Error");
			break;
		case "Right":
			logger.info("Entering SSN Number");
			enterText(socialSecurityNumber, str);
			logger.info("Entered SSN Number");
			break;
			
			default:
				logger.info("Social Security Number TextBox not found");
		}
	}
	
	
	/**
	 * Click Save button
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("Clicking save button");
		clickWebElement(saveButton);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked save button");
	}
	
}
