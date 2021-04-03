package com.acis.automation.pages.providermanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewRecruitmentEventPage extends PageBase{

	public NewRecruitmentEventPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(NewRecruitmentEventPage.class);
	
	@FindBy(xpath = "//h1[text()='New Event']")
    WebElement 	verifyNewEvent;
	
	@FindBy(xpath = "//span[text()='Event Type']/../../..//input")
    WebElement 	eventType;
	
	@FindBy(xpath = "//span[text()='Targeted Recruitment']")
    WebElement 	eventTypeTargetedRecruitment;
	
	@FindBy(xpath = "//span[text()='Child Specific Recruitment']")
    WebElement 	eventTypeChildSpecificRecruitment;
	////input[@data-value='Child Specific Recruitment']
	@FindBy(xpath = "//span[text()='General Recruitment']")
    WebElement 	eventTypeGeneralRecruitment;
	
	@FindBy(xpath = "//span[text()='Event Subtype']/../../..//input")
    WebElement 	eventSubtype;
	
	@FindBy(xpath = "//span[text()='Presentation']")
    WebElement 	eventSubtypePresentation;
	
	@FindBy(xpath = "//span[text()='Public Booth']")
    WebElement 	eventSubtypePublicBooth;
	
	@FindBy(xpath = "//span[text()='Material Distribution']")
    WebElement 	eventSubtypeMaterialDistribution;
	
	@FindBy(xpath = "//label[text()='Date/Time']/../..//input[@name='date']")
    WebElement 	dateTime;
	
	@FindBy(xpath = "//*[text()='14']")
    WebElement 	date;
	
	@FindBy(xpath = "//span[text()='Street 1']/../../..//input")
    WebElement 	street1;
	
	@FindBy(xpath = "//span[text()='City']/../../..//input")
    WebElement 	city;
	
	@FindBy(xpath = "//span[text()='State/Territory']/../../..//input")
    WebElement 	stateTerritory;
	
	@FindBy(xpath = "//span[text()='AR']")
    WebElement 	stateAR;
	
	
	
	@FindBy(xpath = "//span[text()='Zip/Postal Code']/../../..//input[@type='text']")
    WebElement 	zipPostalcode;
	
	@FindBy(xpath = "//span[text()='Target Recruitment Population']/../../..//input")
    WebElement 	targetRecruitmentPopulation;
	
	@FindBy(xpath = "//button[text()='Next']")
    WebElement 	next;
	
	@FindBy(xpath = "//span[text()='Substance Exposed Newborns']")
    WebElement 	TRPSubstanceExposedNewborns;
	
	@FindBy(xpath = "//span[text()='Teens']")
    WebElement 	teens;
	
	@FindBy(xpath = "//span[text()='Parenting Teens']")
    WebElement 	parentingTeens;
	
	@FindBy(xpath = "//span[text()='Dually Diagnosed']")
    WebElement 	duallyDiagnosed;
	
	@FindBy(xpath = "//h1[text()='Interested Persons']")
    WebElement 	interestedPersons;
	
	@FindBy(xpath = "//span[text()='First Name']/../../..//input")
    WebElement 	firstName;
	
	@FindBy(xpath = "//span[text()='Last Name']/../../..//input")
    WebElement 	lastName;
	
	@FindBy(xpath = "//span[text()='Phone']/../../..//input']")
    WebElement 	phone;
	
	@FindBy(xpath = "//span[text()='Email']/../../..//input")
    WebElement 	email;
	
	@FindBy(xpath = "//button[text()='Search']")
    WebElement 	searchButton;
	
	@FindBy(xpath = "//a[@data-label='Related']")
    WebElement 	relatedTab;
	
	
	@FindBy(xpath = "//a[text()=' here ']")
    WebElement 	linkCreateNewProspect;
	
	@FindBy(xpath = "//h1[text()='Person(s) Involved']")
    WebElement 	personsInvolvedTitle;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/label/span[1]")
	WebElement selectCheckBox;
	
	@FindBy(xpath="//button[text()='Add Prospect']")
	WebElement addProspect;
	
	@FindBy(xpath="//span[text()='Prospective Foster Parents']/../../../../../..//div[text()='New']")
	WebElement newProspectFosterParent;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	@FindBy(xpath = "//div[text()='Event']/..//lightning-formatted-text[text()='Orientation']")
	WebElement orientationEventTitle;
	
	@FindBy(xpath = "//span[text()='All Day']")
	WebElement todayEvent;
	
	@FindBy(xpath = "//span[text()='All Day']/../..//span[text()='Orientation']")
	WebElement orientation;
	
	@FindBy(xpath = "//span[text()='Parent 1']/../../..//span[text()='First Name']/../..//lightning-formatted-text")
	WebElement firstNameVerify;
	
	@FindBy(xpath = "//span[text()='Parent 1']/../../..//span[text()='Last Name']/../..//lightning-formatted-text")
	WebElement lastNameVerify;
	
	@FindBy(xpath = "//span[text()='Parent 1']/../../..//span[text()='Phone Number']/../..//a")
	WebElement phoneNumberVerify;
	
	@FindBy(xpath = "//span[text()='Parent 1']/../../..//span[text()='Email Address']/../..//a")
	WebElement emailVerify;
	
	@FindBy(xpath = "(//input[@name='ACIS_Prospect__c-search-input'])")
	WebElement searchParentId;
	
	@FindBy(xpath = "//a[contains(@title,'PN - 00')]")
	WebElement prospectiveFosterParentId;
	
	@FindBy(xpath = "//slot[@slot='outputField']/lightning-formatted-text[contains(text(),'E-00')]")
	WebElement recruitmentID;
	
	@FindBy(xpath = "//slot[@slot='outputField']/lightning-formatted-text[contains(text(),'PN - 00')]")
	WebElement prospectiveFPID;
	
	@FindBy(xpath = "(//span[@title='Prospective Foster Parents']")
	WebElement prospectiveFosterParent;
	
	@FindBy(xpath = "//a[text()='Details']")
	WebElement detailsTab;
	
	@FindBy(xpath = "//span[text()='Parent 1']/../../..//*[text()='First Name']/..//input")
	WebElement firstNameP1;
	
	@FindBy(xpath = "//span[text()='Parent 1']/../../..//*[text()='Last Name']/..//input")
	WebElement LastNameP1;
	
	@FindBy(xpath = "//span[text()='Parent 1']/../../..//*[text()='Phone Number']/..//input")
	WebElement phoneNoP1;
	
	@FindBy(xpath = "//span[text()='Parent 1']/../../..//*[text()='Email Address']/..//input")
	WebElement emailP1;
	
	@FindBy(xpath = "//span[text()='Parent 2']/../..//label[text()='First Name']/..//input")
	WebElement firstNameP2;
	
	@FindBy(xpath = "//span[text()='Parent 2']/../..//label[text()='Last Name']/..//input")
	WebElement LastNameP2;
	
	@FindBy(xpath = "//span[text()='Parent 2']/../..//label[text()='Phone Number']/..//input")
	WebElement phoneNoP2;
	
	@FindBy(xpath = "//span[text()='Parent 2']/../..//label[text()='Email Address']/..//input")
	WebElement emailP2;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;
	
	@FindBy(xpath = "//input[@role='textbox']")
	WebElement globalSearchDropdown;
	
	@FindBy(xpath = "//span[text()='All']")
	WebElement globalSearchDropdownAll;
	
	@FindBy(xpath = "//input[@title='Search Events and more']")
	WebElement globalSearchAllegation;
	
	@FindBy(xpath = "//mark[contains(text(),'E-0')]")
	WebElement eventRecord;
	
	public By targetedRecruitment = By.xpath("//input[@data-value='Targeted Recruitment']");
	public By generalRecruitment = By.xpath("//input[@data-value='General Recruitment']");
	public By noExistingPersonError = By.xpath("//p[text()='No existing person records match the search criteria entered']");
	/**
	 * Search a person with valid input
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchPersonUsingvalidData(String name, String str1) throws AcisException, InterruptedException {

		switch (name) {
		case "firstName":
			logger.info("Selecting first Name  and searching ");
			waitForElement(firstName);
			enterText(firstName, str1);
			waitForPageLoadTill(5);
			waitForElement(searchButton);
			clickWebElement(searchButton);
			waitForPageLoadTill(5);
			logger.info("Searching using first person");
			break;

		case "lastName":
			logger.info("Seleting last name and searching ");
			waitForElement(lastName);
			enterText(lastName, str1);
			waitForPageLoadTill(5);
			waitForElement(searchButton);
			clickWebElement(searchButton);
			waitForPageLoadTill(5);
			logger.info("Searching using lastname person");
			break;

		case "phone":
			logger.info("Selecting dob name and searching ");
			waitForElement(phone);
			enterText(phone, str1);
			waitForPageLoadTill(5);
			waitForElement(searchButton);
			clickWebElement(searchButton);
			waitForPageLoadTill(5);
			logger.info("Searching using dob person");
			break;
			
		case "Email":
			logger.info("Selecting email  and searching ");
			waitForElement(email);
			enterText(email, str1);
			waitForPageLoadTill(5);
			waitForElement(searchButton);
			clickWebElement(searchButton);
			waitForPageLoadTill(5);
			logger.info("Searching using email ");
			break;
		
		default:
			logger.info("Date: " + name + " not found");
			break;

		}
	}
	
	/***
	 * Link to create new person
	 * 
	 * @throws AcisException
	 */
	public void linkToCreateNewPerson() throws AcisException {
		waitForPageLoadTill(9);
		logger.info("Clikcing on link to create new person");
		Actions act = new Actions(driver);
		waitForPageLoadTill(9);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		clickWebElemntUsingJavascriptExecutor(linkCreateNewProspect);
		logger.info("Clicked on link to create new person");
		waitForPageLoadTill(16);
		waitForElement(personsInvolvedTitle);
		logger.info("verified page title is " + personsInvolvedTitle.getText());

	}
	/***Select First CheckBox
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickingCheckBoxOrExistingError() throws AcisException {
		logger.info("This method is clicking checkbox interested person page while creating new recruitment");
		waitForPageLoad();
		waitForPageLoadTill(9);
		
		if(isElementPresent(noExistingPersonError)) {
			waitForPageLoadTill(5);
			logger.info("Verified No person existing record");
			waitForPageLoadTill(9);
			logger.info("Clikcing on link to create new person");
			Actions act = new Actions(driver);
			waitForPageLoadTill(9);
			act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
			waitForElement(linkCreateNewProspect);
			clickWebElement(linkCreateNewProspect);
			waitForPageLoadTill(9);
			logger.info("Clicked on link to create new person");
			waitForPageLoadTill(16);
			waitForElement(personsInvolvedTitle);
			logger.info("verified page title is " + personsInvolvedTitle.getText());
		}else {
			waitForElement(selectCheckBox);
			clickWebElemntUsingJavascriptExecutor(selectCheckBox);
			logger.info("clicking on AddProspect");
			waitForElement(addProspect);
			clickWebElemntUsingJavascriptExecutor(addProspect);
			//clickWebElement(addProspect);
			waitForPageLoadTill(5);
			logger.info("clicked on AddProspect");
		}
	}
	
	/*** Verify No person existing record
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void noPersonExistingRecord() throws AcisException {
		logger.info("Verify No person existing record");
		waitForPageLoad();
		//waitForElement(noExistingPersonError);
		waitForPageLoadTill(5);
		logger.info("Verified No person existing record");
		waitForPageLoadTill(9);
		logger.info("Clikcing on link to create new person");
		Actions act = new Actions(driver);
		waitForPageLoadTill(9);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		clickWebElemntUsingJavascriptExecutor(linkCreateNewProspect);
		logger.info("Clicked on link to create new person");
		waitForPageLoadTill(16);
		waitForElement(personsInvolvedTitle);
		logger.info("verified page title is " + personsInvolvedTitle.getText());
	}
	
	/***Enter Event Type
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void enterEventType(String name) throws AcisException {
		switch(name) {
		case "Targeted Recruitment":
			logger.info("Entering Event Type");
			clickWebElemntUsingJavascriptExecutor(eventType);
			waitForElement(eventTypeTargetedRecruitment);
		 	clickWebElemntUsingJavascriptExecutor(eventTypeTargetedRecruitment);
			waitForPageLoadTill(5);
			logger.info("Entered Event Type");
			break;
			
		case "Child Specific Recruitment":
			logger.info("Entering Event Type");
			waitForPageLoadTill(10);
			clickWebElemntUsingJavascriptExecutor(eventType);
			waitForPageLoadTill(3);
			clickWebElemntUsingJavascriptExecutor(eventTypeChildSpecificRecruitment);
			waitForPageLoadTill(5);
			logger.info("Entered Event Type");
			break;
			
		case "General Recruitment":
			logger.info("Entering Event Type");
			clickWebElemntUsingJavascriptExecutor(eventType);
			waitForElement(eventTypeChildSpecificRecruitment);
			clickWebElemntUsingJavascriptExecutor(eventTypeGeneralRecruitment);
			waitForPageLoadTill(5);
			logger.info("Entered Event Type");
			break;
		}
						
	}
	
	/***Select Targeted Recruitment population
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void selectedTargetedRecruitmentPopulation(String name) throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		
		if(isElementPresent(targetedRecruitment)) {
			switch(name) {
			case "Substance Exposed Newborns":
				logger.info("Entering Event Type");
				clickWebElemntUsingJavascriptExecutor(targetRecruitmentPopulation);
				waitForPageLoadTill(5);
				waitForElement(TRPSubstanceExposedNewborns);
				clickWebElement(TRPSubstanceExposedNewborns);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
				
			case "Teens":
				logger.info("Entering Event Type");
				clickWebElemntUsingJavascriptExecutor(targetRecruitmentPopulation);
				waitForPageLoadTill(5);
				waitForElement(teens);
				clickWebElement(teens);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
				
			case "Parenting Teens":
				logger.info("Entering Event Type");
				clickWebElemntUsingJavascriptExecutor(targetRecruitmentPopulation);
				waitForPageLoadTill(5);
				waitForElement(parentingTeens);
				clickWebElement(parentingTeens);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
				
			case "Dually Diagnosed":
				logger.info("Entering Event Type");
				clickWebElement(targetRecruitmentPopulation);
				waitForPageLoadTill(5);
				waitForElement(duallyDiagnosed);
				clickWebElement(duallyDiagnosed);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
			}
		}else {
			System.out.println("Targeted Recruitment Is not present");
		}
	}
	
	/***Select Targeted Recruitment Event subtype
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void selectedTargetedRecruitmentEventSubType(String name) throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		if(isElementPresent(targetedRecruitment)) {
			switch(name) {
			case "Presentation":
				logger.info("Entering Event Type");
				clickWebElemntUsingJavascriptExecutor(eventSubtype);
				clickWebElement(eventSubtypePresentation);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
				
			case "Public Booth":
				logger.info("Entering Event Type");
				clickWebElemntUsingJavascriptExecutor(eventSubtype);
				clickWebElement(eventSubtypePublicBooth);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
				
			case "Material Distribution":
				logger.info("Entering Event Type");
				clickWebElemntUsingJavascriptExecutor(eventSubtype);
				clickWebElement(eventSubtypeMaterialDistribution);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
			}
		}else {
			System.out.println("Targeted Recruitment Is not present");
		}
	}
	
	/***Select General Recruitment
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 * 
	 */
	public void selectGeneralRecruitmentEventSubtype(String name) throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		if(isElementPresent(generalRecruitment)) {
			switch(name) {
			case "Presentation":
				logger.info("Entering Event Type");
				waitForElement(eventSubtype);
				clickWebElement(eventSubtypePresentation);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
				
			case "Public Booth":
				logger.info("Entering Event Type");
				waitForElement(eventSubtype);
				clickWebElement(eventSubtypePublicBooth);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
				
			case "Material Distribution":
				logger.info("Entering Event Type");
				waitForElement(eventSubtype);
				clickWebElement(eventSubtypeMaterialDistribution);
				waitForPageLoadTill(5);
				logger.info("Entered Event Type");
				break;
			}
		}else {
			System.out.println("General Recruitment Is not present");
		}
		
	}
	
	/***Enter Event Type
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void enterEventSubType(String name, String str1) throws AcisException {
		switch(name) {
		case "Presentation":
			logger.info("Entering Event Type");
			waitForElement(eventSubtype);
			clickWebElement(eventSubtypePresentation);
			waitForPageLoadTill(5);
			logger.info("Entered Event Type");
			break;
			
		case "Public Booth":
			logger.info("Entering Event Type");
			waitForElement(eventSubtype);
			clickWebElement(eventSubtypePublicBooth);
			waitForPageLoadTill(5);
			logger.info("Entered Event Type");
			break;
			
		case "Material Distribution":
			logger.info("Entering Event Type");
			waitForElement(eventSubtype);
			clickWebElement(eventSubtypeMaterialDistribution);
			waitForPageLoadTill(5);
			logger.info("Entered Event Type");
			break;
		}
	}
	
	/*** Enter Date and Time
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void setDateTime() throws AcisException {
		logger.info("Enter the Date");
		waitForPageLoadTill(10);
		//waitForElement(dateTime);
		clickWebElement(dateTime);
		clickWebElement(date);
		waitForPageLoadTill(5);
		logger.info("Entered the Date");
	}
	
	/***Enter State 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void setState() throws AcisException {
		logger.info("Enter the State");
		waitForPageLoadTill(10);
		waitForElement(stateTerritory);
		clickWebElement(stateTerritory);
	//	waitForElement(stateAR);
		clickWebElement(stateAR);
		waitForPageLoadTill(5);
		logger.info("Entered the State");
	}
	
	/*** Set City, Street1,ZipPostalCode and state
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void setAddressInformation(String option, String str) throws AcisException {
		switch(option) {
		case "Street1":
			logger.info("Enter the Street Name");
			scrollingToElementofAPage(street1);
			waitForElement(street1);
			clickWebElemntUsingJavascriptExecutor(street1);
			//clickWebElement(street1);
			enterText(street1, str);
			waitForPageLoadTill(5);
			logger.info("Entered the Street Name");
			break;
			
		case "City":
			logger.info("Enter the City");
			waitForElement(city);
			clickWebElemntUsingJavascriptExecutor(city);
			enterText(city,str);
			waitForPageLoadTill(5);
			break;
			
		case "ZipPostalCode":
			logger.info("Enter the Zipcode");
			waitForElement(zipPostalcode);
			clickWebElemntUsingJavascriptExecutor(zipPostalcode);
			enterText(zipPostalcode, str);
			waitForPageLoadTill(5);
			break;
		
		default:
			logger.info("Date: " + option + " not found");
			break;
		}
	}
	
	/*** Click next
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void next() throws AcisException {
		logger.info("Clicking on Next");
		waitForPageLoad();
		waitForPageLoadTill(5);
		scrollingToElementofAPage(next);
		waitForElement(next);
		clickWebElement(next);
		logger.info("Clicked on Next");
	}
	
	/*** Click submit button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSubmit() throws AcisException {
		logger.info("Clicking on submmit");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(submit);
		clickWebElemntUsingJavascriptExecutor(submit);
		logger.info("Clicked on submmit");
	}
	
	/***Verify Subject Field Orientation
	 * @author pallavi.sanjay.yemle
	 */
	public void verifySubjectField() {
		logger.info("Verifying Subject Field Orientation");
		waitForPageLoadTill(10);
		waitForElement(orientationEventTitle);
		logger.info("Verified Subject Field Orientation");
	}
	
	/*** Verify created event shown on Calender
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void verifyEventOnCalender() throws AcisException {
		logger.info("Verifying event shown on Calender");
		waitForPageLoadTill(10);
		verifyTextEquals(todayEvent, "Review the Today's Orientation Event");
		logger.info("Verified event shown on Calender");
		waitForPageLoadTill(5);
		logger.info("Clicking on Orientation Button");
		waitForElement(orientation);
		clickWebElement(orientation);
		waitForPageLoadTill(10);
		logger.info("Clicked on Orientation Button");
	}
	
	/***Verify Parent 1 and Parent2 info matches
	 * @author pallavi.sanjay.yemle
	 */
	public void verifyParent1() {
		logger.info("Verifying first name present or not");
		waitForElement(firstNameVerify);
		firstNameVerify.getText();
		logger.info("Verified first name present or not");
		waitForElement(lastNameVerify);
		lastNameVerify.getText();
		logger.info("Verified last name present or not");
		waitForElement(phoneNumberVerify);
		phoneNumberVerify.getText();
		logger.info("Verified Phone number present or not");
		waitForElement(emailVerify);
		emailVerify.getText();
		logger.info("Verified Email present or not");
		
	}
	
	/**
	 * click on search Recruitment event
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void searchRecruitmentEvent(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on prospective Foster Parent ID Search");
		waitForPageLoadTill(9);
		waitForElement(searchParentId);
		clickWebElement(searchParentId);
		enterText(searchParentId, strText);
		logger.info("Entered text search text area");
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//a[contains(@title,'E-00')])[1]")));
		logger.info("Clicked on first Record");
		waitForPageLoadTill(9);
	}
	
	/**
	 * Clicked on Related Tab on a Orientation Page Created By Pallavi
	 * 
	 * @throws AcisException
	 */
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForElement(relatedTab);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");

	}
	/*** Clicked on Prospective foster parent
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickProspectiveFosterParent() throws AcisException {
		logger.info("Clicking on Prospective foster parent Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(prospectiveFosterParent);
		clickWebElemntUsingJavascriptExecutor(prospectiveFosterParent);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForPageLoad();
		logger.info("Clicked on Prospective foster parent Tab");
	
	}
	
	/*** Clicked prospective foster id
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickOnPFPID() throws AcisException {
		logger.info("Clicking on prospective foster id");
		waitForElement(prospectiveFosterParentId);
		clickWebElemntUsingJavascriptExecutor(prospectiveFosterParentId);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on prospective foster id");
	}
	
	/*** Clicked prospective foster id
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void newProspectiveFosterParent() throws AcisException {
		logger.info("Clicking on new prospective foster");
		waitForPageLoadTill(5);
		waitForElement(newProspectFosterParent);
		clickWebElemntUsingJavascriptExecutor(newProspectFosterParent);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on new prospective foster");
	}
	
	/**
	 * Get Recruitment Event Id from an Recruitment record
	 * Created By Pallavi
	 * @throws AcisException 
	 */
	public String getRecruitmentID() throws AcisException {
		logger.info("Getting Recruitment Event Id from an Recruitment record");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(detailsTab);
		waitForElement(recruitmentID);
		logger.info("Getting Recruitment ID");
		System.out.println("Recruitment ID : " +recruitmentID.getText().trim());
		testLoggerInfo("Created Recruitment ID " + recruitmentID.getText().trim());
		logger.info("Returning Recruitment ID from Recruitment Record Page");
		return(recruitmentID.getText().trim());
		
	}
	
	/**
	 * Get  Prospective foster parent Id 
	 * Created By Pallavi
	 * @throws AcisException 
	 */
	public String getProspectiveID() throws AcisException {
		logger.info("Getting Prospective foster parent Id ");
		waitForPageLoad();
		waitForPageLoadTill(5);
		//clickWebElement(detailsTab);
		waitForElement(prospectiveFPID);
		logger.info("Getting Prospective foster parent Id ");
		System.out.println("PN ID : " +prospectiveFPID.getText().trim());
		testLoggerInfo("Created PN ID " + prospectiveFPID.getText().trim());
		logger.info("Returning Recruitment ID from Recruitment Record Page");
		return(prospectiveFPID.getText().trim());
		
	}
	
	/**
	 * Search the record on internal search box and click on record
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void searchRecordAndClick(String recordName) throws AcisException {
		logger.info("Searching the record on internal search box : " + recordName);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Searched the record on Recruitment event page  : " + recordName);
		logger.info(" clicking  on record" + recordName);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//a[contains(text(),'"+recordName+"')]")));
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info(" clicked  on record" + recordName);
		
	}
	
	/*** set Parent 1 record
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void setP1Info(String option, String str1) throws AcisException {
		switch(option) {
		
		case "FirstP1":
			logger.info("Selecting first Name ");
			waitForElement(firstNameP1);
			enterText(firstNameP1, str1);
			waitForPageLoadTill(5);
			logger.info("Searching using first person");
			break;
			
		case "lastP1":
			logger.info("Selecting last Name  ");
			waitForElement(LastNameP1);
			enterText(LastNameP1, str1);
			waitForPageLoadTill(5);
			logger.info("Searching using first person");
			break;
			
		case "PhoneP1":
			logger.info("Selecting Phone Number");
			waitForElement(phoneNoP1);
			enterText(phoneNoP1, str1);
			waitForPageLoadTill(5);
			logger.info("Searching using first person");
			break;
			
		case "EmailP1":
			logger.info("Selecting Email");
			waitForElement(emailP1);
			enterText(emailP1, str1);
			waitForPageLoadTill(5);
			logger.info("Searching using first person");
			break;
				
		
		
		}
			
	}
	
	/*** Click on save button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void saveBtn() throws AcisException {
		logger.info("Clicking on save button ");
		waitForElement(saveBtn);
		clickWebElement(saveBtn);
		waitForPageLoadTill(5);
		logger.info("Clicked on save button ");
	}
	
	/*** set Parent 2 record
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void setP2Info(String option, String str1) throws AcisException {
		switch(option) {
		
		case "FirstP2":
			logger.info("Selecting first Name ");
			waitForElement(firstNameP2);
			enterText(firstNameP2, str1);
			waitForPageLoadTill(5);
			logger.info("Searching using first person");
			break;
			
		case "lastP2":
			logger.info("Selecting last Name  ");
			waitForElement(LastNameP2);
			enterText(LastNameP2, str1);
			waitForPageLoadTill(5);
			logger.info("Searching using first person");
			break;
			
		case "PhoneP2":
			logger.info("Selecting Phone Number");
			waitForElement(phoneNoP2);
			enterText(phoneNoP2, str1);
			waitForPageLoadTill(5);
			logger.info("Searching using first person");
			break;
			
		case "EmailP2":
			logger.info("Selecting Email");
			waitForElement(emailP2);
			enterText(emailP2, str1);
			waitForPageLoadTill(5);
			logger.info("Searching using first person");
			break;
				
		
		
		}
			
	}
	
	/**
	 * Global Search Enter and click on the record
	 * Created By Pallavi
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void searchGlobalEvent(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on Global Search");
		waitForElement(downArrow);
		waitForElementClickable(globalSearchDropdown);
		clickWebElement(globalSearchDropdown);
		logger.info("Clicked on Global Search");	
		logger.info("selecting All on Global Search Dropdown");
		clickWebElement(globalSearchDropdownAll);
		logger.info("selected All on Global Search Dropdown");
		waitForPageLoadTill(10);
		logger.info("Entering Text on Global Search");
		globalSearchAllegation.sendKeys(strText);
		waitForPageLoadTill(5);
		waitForElement(eventRecord);
		clickWebElement(eventRecord);
		logger.info("Clicked on Event Record on Global Search");
		waitForPageLoadTill(6);
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Global Search for event Record");

	}
}

