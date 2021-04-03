package com.acis.automation.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PlacementResourcePage extends PageBase {

	public PlacementResourcePage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PlacementResourcePage.class);

	@FindBy(xpath = "//h2[text()='New Account']/../..//span[text()='Placement Resource']")
	WebElement placementResourceRadio;
	
	@FindBy(xpath = "//h2[text()='New Account']/../..//span[text()='Kinship Placement Resource']")
	WebElement kinshipPlacementResourceRadio;
	
	@FindBy(xpath = "//h1[text()='Select Case']")
	WebElement selectCase;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//*[text()='Account Name']/../..//input[@type='text']")
	WebElement accountName;

	@FindBy(xpath = "//*[text()='Parent 1']/../..//input[@type='text']")
	WebElement parent1;

	@FindBy(xpath = "//*[text()='Parent 2']/../..//input[@type='text']")
	WebElement parent2;

	@FindBy(xpath = "//*[text()='Parent Account']/../..//input[@type='text']")
	WebElement parentAccount;

	@FindBy(xpath = "//*[text()='Account Number']/../..//input[@type='text']")
	WebElement accountNumber;

	@FindBy(xpath = "//*[text()='Placement Type']/../..//input")
	WebElement placementType;

	@FindBy(xpath = "//*[@title='Regular Foster']")
	WebElement regularFoster;
	
	@FindBy(xpath = "//*[@title='Treatment Foster']")
	WebElement treatmentFoster;
	
	@FindBy(xpath = "//*[@title='Kinship']")
	WebElement Kinship;
	
	@FindBy(xpath = "//*[@title='Residential Treatment Center (RTC)']")
	WebElement rtc;
	
	@FindBy(xpath = "//*[@title='Hospital']")
	WebElement hospital;
	
	@FindBy(xpath = "//*[@title='Group Home']")
	WebElement groupHome;
	
	@FindBy(xpath = "//*[@title='Own Home']")
	WebElement ownHome;
	
	@FindBy(xpath = "//*[@title='Relative Foster']")
	WebElement relativeFoster;
	
	@FindBy(xpath="//*[@title='Adoptive Home']")
	WebElement adoptiveHome;
	
	@FindBy(xpath="//*[@title='Independent Living Program (ILP)']")
	WebElement ILp;
	
	

	@FindBy(xpath="//*[@title='Semi-Independent Living Arrangement (SILA)']")
	WebElement sLa;
	
	
	@FindBy(xpath = "//*[text()='Occupancy']/../..//input")
	WebElement occupancy;

	@FindBy(xpath = "//*[text()='Capacity']/../..//input")
	WebElement capacity;

	@FindBy(xpath = "//*[text()='Female Age Minimum']/../..//input")
	WebElement femaleAgeMinimum;

	@FindBy(xpath = "//*[text()='Male Age Minimum']/../..//input")
	WebElement maleAgeMinimum;

	@FindBy(xpath = "//*[text()='Female Age Maximum']/../..//input")
	WebElement femaleAgeMaximum;

	@FindBy(xpath = "//*[text()='Male Age Maximum']/../..//input")
	WebElement maleAgeMaximum;

	@FindBy(xpath = "//*[text()='Number of Beds']/../..//input")
	WebElement numberOfBeds;

	@FindBy(xpath = "//*[text()='Phone']/../..//input[@type='tel']")
	WebElement phone;

	@FindBy(xpath = "//*[text()='Email']/../..//input")
	WebElement email;

	@FindBy(xpath = "//*[text()='Provider Agency']/../..//input")
	WebElement providerAgency;

	@FindBy(xpath = "//*[text()='Number of Children in the Home']/../..//input")
	WebElement numberOfChildrenInTheHome;

	@FindBy(xpath = "//*[text()='Date of Certification']/../..//input")
	WebElement dateOfCertification;

	@FindBy(xpath = "//*[text()='Date of Recertification']/../..//input")
	WebElement dateOfRecertification;

	@FindBy(xpath = "//*[text()='Description']/../..//textarea")
	WebElement description;

	@FindBy(xpath = "//*[text()='Licensing Worker']/../..//input")
	WebElement licensingWorker;

	@FindBy(xpath = "//*[text()='Billing Street']/../..//textarea")
	WebElement billingStreet;

	@FindBy(xpath = "//*[text()='Billing City']/../..//input")
	WebElement billingCity;

	@FindBy(xpath = "//*[text()='Billing State/Province']/../..//input")
	WebElement billingStateProvince;

	@FindBy(xpath = "//*[text()='Billing Zip/Postal Code']/../..//input")
	WebElement billingZipPostalCode;

	@FindBy(xpath = "//*[text()='Billing Country']/../..//input")
	WebElement billingCountry;

	@FindBy(xpath = "//*[text()='Status']/../..//input")
	WebElement status;

	@FindBy(xpath = "//*[@title='Applicant']")
	WebElement applicant;
	
	@FindBy(xpath = "//a[@title='Approved']")
	WebElement approved;

	@FindBy(xpath = "//a[@title='In Progress']")
	WebElement inProgress;
	
	@FindBy(xpath = "//a[@title='Submitted']")
	WebElement submitted;

	@FindBy(xpath = "//*[@title='Licensed']")
	WebElement licensed;

	@FindBy(xpath = "//*[@title='On Hold']")
	WebElement onHold;

	@FindBy(xpath = "//*[@title='Closed']")
	WebElement closed;

	@FindBy(xpath = "//span[@title='Medically Complex']")
	WebElement medicallyComplex;
	
	@FindBy(xpath = "//span[@title='Teen Parent']")
	WebElement teenParent;
	
	@FindBy(xpath = "//span[@title='ESL']")
	WebElement esl;
	
	@FindBy(xpath = "//span[@title='Disabled']")
	WebElement disabled;
	
	@FindBy(xpath = "//span[@title='LGBTQ']")
	WebElement lgbtq;
	
	@FindBy(xpath = "//span[@title='SEN']")
	WebElement sen;
	
	@FindBy(xpath = "//div[text()='Special Needs for Placement']/..//span[text()='Move selection to Chosen']")
	WebElement specialNeedsAbleToAcceptSelect;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;
	
	@FindBy(xpath="//*[text()='Account ID']/../..//lightning-formatted-text")
	WebElement accountIDs;
	
	@FindBy(xpath = "//*[text()='Account ID']/../..//*[contains(text(),'A-00')]")
	WebElement accountVerify;
	
	@FindBy(xpath = "//*[text()='Related']")
	WebElement relatedTab;
	
	@FindBy(xpath = "//*[text()='Site Locations']")
	WebElement siteLocations;
	
	@FindBy(xpath = "//a[@title='New']")
	WebElement newSiteLocations;
	
	@FindBy(xpath = "//h2[text()='New Business Location']")
	WebElement siteLocationsVerify;
	
	@FindBy(xpath = "//*[text()='State']/../../../..//input[@type='text']")
	WebElement stateSelect;
	//*[text()='State']/../../../..//input
	
	@FindBy(xpath = "//*[text()='Location Name']/../..//input[@type='text']")
	WebElement locationName;
	
	@FindBy(xpath = "//*[text()='Street 1']/../..//input[@type='text']")
	WebElement street;
	
	@FindBy(xpath = "//*[text()='City']/../..//input[@type='text']")
	WebElement city;
	
	@FindBy(xpath = "//*[text()='Latitude']/../..//input[@type='text']")
	WebElement latitude;
	
	@FindBy(xpath = "//*[text()='Longitude']/../..//input[@type='text']")
	WebElement longitude;
	
	@FindBy(xpath = "//*[text()='Zip/Postal Code']/../..//input[@type='text']")
	WebElement zipCode;
	
	@FindBy(xpath = "//*[text()='Primary Address']/../..//input")
	WebElement primaryCheckBox;
	
	@FindBy(xpath = "//lightning-formatted-text[contains(.,'A-')]")
	WebElement accountID;
	
	@FindBy(xpath = "//*[@title='Details']//a")
	WebElement details;
	
	@FindBy(xpath = "//span[text()='Account']/../..//a")
	WebElement siteAccount;
	
	@FindBy(xpath = "//span[text()='Genogram']")
	WebElement genogramLabel;
	
	@FindBy(xpath = "//a[text()='Health']")
	WebElement healthTab;
	
	@FindBy(xpath = "//span[text()='Special Needs']")
	WebElement specialNeeds;
	
	@FindBy(xpath = "//span[text()='Special Needs']/../../../../../..//*[text()='New']")
	WebElement newSpecialNeeds;
	
	@FindBy(xpath = "//*[text()='Clinically diagnosed disability(ies)?']/../..//input")
	WebElement clinicallyDiagnosedDisabilities;
	
	@FindBy(xpath = "//label[text()='Clinically diagnosed disability(ies)?']/..//input")
	WebElement clinicallyDiagnosedDisabilitiesEdit;
	
	@FindBy(xpath ="//*[text()='Yes']")
	WebElement specialNeedsYes;
	
	@FindBy(xpath = "//*[text()='No']")
	WebElement specialNeedsNo;
	
	@FindBy(xpath = "//*[text()='Condition']/../..//input")
	WebElement condition;
	
	@FindBy(xpath = "//*[text()='Club Foot']")
	WebElement conditionclubFoot;
	
	@FindBy(xpath = "//*[text()='Type']/../..//input")
	WebElement type;
	
	@FindBy(xpath = "//*[text()='Physically Disabled']")
	WebElement typePhysicallyDisabled;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//button[text()='Edit'])[3]")
	WebElement editSpecialNeed;
	
	@FindBy(xpath = "//h1//*[text()='Business Location']")
	WebElement siteAccountVerify;
	
	@FindBy(xpath = "//*[text()='Assessments']")
	WebElement assessmentsTab;
	
	@FindBy(xpath = "//*[text()='New Walkthrough Assessment']")
	WebElement newWalkthroughAssessmentsButton;
	
	@FindBy(xpath = "//*[contains(text(),'The pets in the home, if any, are properly licensed')]")
	WebElement thePet_QuestionLabel;
	
	@FindBy(xpath = "//*[contains(text(),'The pets in the home, if any, are properly licensed')]/../../..//input")
	WebElement thePet_QuestionDropdown;
	
	@FindBy(xpath = "//*[contains(text(),'The pets in the home, if any, are properly licensed')]/../../..//*[text()='Yes']")
	WebElement thePet_QuestionYes;

	@FindBy(xpath = "//*[contains(text(),'The pets in the home, if any, are properly licensed')]/../../..//*[text()='No']")
	WebElement thePet_QuestionNo;
	
	@FindBy(xpath = "//*[contains(text(),'Medications are kept in a secure manner')]")
	WebElement medication_QuestionLabel;
	
	@FindBy(xpath = "//*[contains(text(),'Medications are kept in a secure manner')]/../../..//input")
	WebElement medication_QuestionDropdown;
	
	@FindBy(xpath = "//*[contains(text(),'Medications are kept in a secure manner')]/../../..//*[text()='Yes']")
	WebElement medication_QuestionYes;
	
	@FindBy(xpath = "//*[contains(text(),'Medications are kept in a secure manner')]/../../..//*[text()='No']")
	WebElement medication_QuestionNo;
	
	@FindBy(xpath = "//*[contains(text(),'The home is free of visible hazards, such as exposed wires')]")
	WebElement home_QuestionLabel;
	
	@FindBy(xpath = "//*[contains(text(),'The home is free of visible hazards, such as exposed wires')]/../../..//input")
	WebElement home_QuestionDropdown;
	
	@FindBy(xpath = "//*[contains(text(),'The home is free of visible hazards, such as exposed wires')]/../../..//*[text()='Yes']")
	WebElement home_QuestionYes;
	
	@FindBy(xpath = "//*[contains(text(),'The home is free of visible hazards, such as exposed wires')]/../../..//*[text()='No']")
	WebElement home_QuestionNo;

	@FindBy(xpath = "//*[contains(text(),'There are adequate sleeping quarters for a child in foster care')]")
	WebElement adequateSleep_QuestionLabel;
	
	@FindBy(xpath = "//*[contains(text(),'There are adequate sleeping quarters for a child in foster care')]/../../..//input")
	WebElement adequateSleep_QuestionDropdown;
	
	@FindBy(xpath = "//*[contains(text(),'There are adequate sleeping quarters for a child in foster care')]/../../..//*[text()='Yes']")
	WebElement adequateSleep_QuestionYes;
	
	@FindBy(xpath = "//*[contains(text(),'There are adequate sleeping quarters for a child in foster care')]/../../..//*[text()='No']")
	WebElement adequateSleep_QuestionNo;
	
	@FindBy(xpath = "//*[contains(text(),'The refrigerator is set to no greater than 37 F')]")
	WebElement refrigerator_QuestionLabel;
	
	@FindBy(xpath = "//*[contains(text(),'The refrigerator is set to no greater than 37 F')]/../../..//input")
	WebElement refrigerator_QuestionDropdown;
	
	@FindBy(xpath = "//*[contains(text(),'The refrigerator is set to no greater than 37 F')]/../../..//*[text()='Yes']")
	WebElement refrigerator_QuestionYes;
	
	@FindBy(xpath = "//*[contains(text(),'The refrigerator is set to no greater than 37 F')]/../../..//*[text()='No']")
	WebElement refrigerator_QuestionNo;
	
	@FindBy(xpath = "//*[text()='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//button[@title='Close Walkthrough Assessment']")
	WebElement closeWalkthroughAssessment;
	
	@FindBy(xpath = "//button[@title='Close Assessments']")
	WebElement closeAssessmentsButton;
	
	@FindBy(xpath = "(//a[contains(text(),'A-')])[1]")
	WebElement firstAssessmentsRecord;

	@FindBy(xpath = "//*[text()='Created By']/../../input")
	WebElement createdBy_value;
	
	@FindBy(xpath = "//label[text()='Last Modified By']")
	WebElement lastModifiedByLabel;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelButton;
	
	public By approvedBy = By.xpath("//*[text()='Approved']");
	
	public By inprogressBy = By.xpath("//*[text()='In Progress']");
	
	public By closedBy = By.xpath("//*[text()='Closed']");
	
	public By onHoldBy = By.xpath("//*[text()='On Hold']");
	
	public By clocloseAssessmentsButtonsedBy = By.xpath("//button[@title='Close Assessments']");
	
	public By closeWalkthroughAssessmentBy = By.xpath("//button[@title='Close Walkthrough Assessment']");
	
	
	/**
	 * Get AccountID from an Placment Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public String getAccountID() throws AcisException {
		logger.info("Getting Account ID from Placement Account Record Page");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(details);
		waitForElement(accountID);
		logger.info("Getting Account ID");
		System.out.println("Account ID : " +accountID.getText().trim());
		testLoggerInfo("Created Account ID " + accountID.getText().trim());
		logger.info("Returning Account ID from Placement Account Record Page");
		return(accountID.getText().trim());
		
	}
	
	
	/**
	 * Click on Account Name on Site Location Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickSiteAccount() throws AcisException {
		logger.info("Clicking on Account Name on Site Location");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(siteAccount);
		logger.info("Clicked on Account Name on Site location");
	}
	
	/**
	 * Verify AccountID from an Placement Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyAccountID(String accountID) throws AcisException {
		logger.info("Verifying Account ID from Placement Account Record Page");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(details);
		waitForElementClickable(driver.findElement(By.xpath("//lightning-formatted-text[contains(.,'"+accountID+"')]")));
		logger.info("Verified Account ID from Placement Account Record Page");
		
	}
	
	/**
	 * Clicked on Related Tab on a Provider Agency Account Created By Dharmesh
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
	
	/**
	 * Clicked on Primary CheckBox on a Provider Agency Account Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void checkPrimaryCheckBox() throws AcisException {
		logger.info("Clicking on Primary CheckBox");
		//waitForElement(primaryCheckBox);
		clickWebElemntUsingJavascriptExecutor(primaryCheckBox);
		logger.info("Clicked on Primary CheckBox");

	}
	
	/**
	 * Clicked on Site Locations Tab on Provider Agency Record Created By
	 * Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickSiteLocationsTab() throws AcisException {
		logger.info("Clicking on New Person Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(siteLocations);
		clickWebElemntUsingJavascriptExecutor(siteLocations);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(newSiteLocations);
		logger.info("Clicked on New Person Tab");

	}
	
	/**
	 * Clicked on New SiteLocations on Case Person Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickNewSiteLocations() throws AcisException {
		logger.info("Clicking on New Site Locations Button");
		clickWebElement(newSiteLocations);
		waitForElement(siteLocationsVerify);
		logger.info("Clicked on Site Locations Button");
	}
	
	/**
	 * Clicked on New SiteLocations on Case Person Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setState(String str) throws AcisException {
		logger.info("Selecting State");
		scrollingToElementofAPage(stateSelect);
		clickWebElemntUsingJavascriptExecutor(stateSelect);
		//clickWebElement(stateSelect);
		//waitForElement(stateSelect);
		waitForElementClickable(driver.findElement(By.xpath("//*[@title='"+str+"']")));
		clickWebElement(driver.findElement(By.xpath("//*[@title='"+str+"']")));
		waitForPageLoadTill(3);
		logger.info("Selected State");
	}
	
	/**
	 * Entering Text on New Provider Agency Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setTextOnSite(String txtBox, String strText) throws AcisException {
		logger.info("Entering Text on " + txtBox + " TextBox as:" + strText);
		switch (txtBox) {
		case "LocationName":
			waitForElement(locationName);
//			locationName.sendKeys(strText);
//			 Actions act1=new Actions(driver);
//		    act1.sendKeys(strText).build().perform();
//			enterTextUsingJavascript(locationName, strText);
			enterText(locationName, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Street":
			waitForElement(street);
			enterText(street, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "City":
			waitForElement(city);
			enterText(city, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "ZipCode":
			waitForElement(zipCode);
			enterText(zipCode, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Latitude":
			waitForElement(latitude);
			enterText(latitude, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Longitude":
			waitForElement(longitude);
			enterText(longitude, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		default:
			logger.info(txtBox + " TextBox not found");
			break;
		}

	}

	/**
	 * Select Placement Resource Radio Button and Click Next Created by Dharmesh
	 * Krishna
	 * 
	 * @throws AcisException
	 */
	public void selectRadioButton() throws AcisException {
		logger.info("Selecting Provider Agency Radio Button");
		waitForElement(placementResourceRadio);
		clickWebElement(placementResourceRadio);
		clickWebElement(nextButton);
		logger.info("Selected Provider Agency Radio Button");
	}

	/**
	 * Entering Text on New Placement Resource Page Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setTextOnPlacement(String txtBox, String strText) throws AcisException {
		logger.info("Entering Text on " + txtBox + " TextBox as:" + strText);
		switch (txtBox) {
		case "AccountName":
			waitForElement(accountName);
			enterText(accountName, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Phone":
			waitForElement(phone);
			scrollingToElementofAPage(phone);
			enterText(phone, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "AccountNumber":
			waitForElement(accountNumber);
			enterText(accountNumber, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Capacity":
			scrollingToElementofAPage(capacity);
			waitForElement(capacity);
			enterText(capacity, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Occupancy":
			scrollingToElementofAPage(occupancy);
			waitForElement(occupancy);
			enterText(occupancy, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "MaleAgeMinimum":
			scrollingToElementofAPage(maleAgeMinimum);
			waitForElement(maleAgeMinimum);
			enterText(maleAgeMinimum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "MaleAgeMaximum":
			scrollingToElementofAPage(maleAgeMaximum);
			waitForElement(maleAgeMaximum);
			enterText(maleAgeMaximum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "FemaleAgeMinimum":
			scrollingToElementofAPage(femaleAgeMinimum);
			waitForElement(femaleAgeMinimum);
			enterText(femaleAgeMinimum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "FemaleAgeMaximum":
			scrollingToElementofAPage(femaleAgeMaximum);
			waitForElement(femaleAgeMaximum);
			enterText(femaleAgeMaximum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "NumberOfBeds":
			scrollingToElementofAPage(numberOfBeds);
			waitForElement(numberOfBeds);
			enterText(numberOfBeds, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Email":
			waitForElement(email);
			enterText(email, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "NumberOfChildrenInTheHome":
			scrollingToElementofAPage(numberOfChildrenInTheHome);
			waitForElement(numberOfChildrenInTheHome);
			enterText(numberOfChildrenInTheHome, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		default:
			logger.info(txtBox + " TextBox not found");
			break;
		}

	}

	/**
	 * Select Special Needs able to Foster Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void selectSpecialNeeds(String option) throws AcisException {
		logger.info("Selecting Special Needs able to Foster as :"+option);
		switch (option) {
		case "Medically Complex":
			scrollingToElementofAPage(medicallyComplex);
			waitForElementClickable(medicallyComplex);
			clickWebElement(medicallyComplex);
			clickWebElemntUsingJavascriptExecutor(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "Teen Parent":
			scrollingToElementofAPage(teenParent);
			waitForElementClickable(teenParent);
			clickWebElement(teenParent);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "ESL":
			scrollingToElementofAPage(esl);
			waitForElementClickable(esl);
			clickWebElement(esl);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "Disabled":
			scrollingToElementofAPage(disabled);
			waitForElementClickable(disabled);
			clickWebElement(disabled);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "LGBTQ":
			scrollingToElementofAPage(lgbtq);
			waitForElementClickable(lgbtq);
			clickWebElement(lgbtq);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "SEN":
			scrollingToElementofAPage(sen);
			waitForElementClickable(sen);
			clickWebElement(sen);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		default:
			break;
		}
		
	}

	
	/**
	 * Select Status Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void setStatus(String option) throws AcisException {
		logger.info("Selecting Placement Type");
		switch (option) {
		case "Applicant":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(applicant);
			clickWebElement(applicant);
			break;
		case "Submitted":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(submitted);
			clickWebElement(submitted);
			break;
		case "Licensed":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(licensed);
			clickWebElement(licensed);
			break;
		case "OnHold":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(onHold);
			clickWebElement(onHold);
			break;
		case "Closed":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(closed);
			clickWebElement(closed);
			break;

		default:
			break;
		}
		logger.info("Selected Placement Type as:" + option);
	}
	
	/**
	 * Select Placement Type Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void setPlacementType(String option) throws AcisException {
		logger.info("Selecting Placement Type");
		switch (option) {
		case "RelativeFoster":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(relativeFoster);
			clickWebElement(relativeFoster);
			break;
		case "RegularFoster":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(regularFoster);
			clickWebElement(regularFoster);
			break;
		case "TreatmentFoster":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(treatmentFoster);
			clickWebElement(treatmentFoster);
			break;
		case "Kinship":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(Kinship);
			clickWebElement(Kinship);
			break;
		case "RTC":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(rtc);
			clickWebElement(rtc);
			break;
		case "Hospital":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(hospital);
			clickWebElement(hospital);
			break;
		case "GroupHome":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(groupHome);
			clickWebElement(groupHome);
			break;
		case "OwnHome":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(ownHome);
			clickWebElement(ownHome);
			break;

		default:
			break;
		}
		logger.info("Selected Placement Type as:" + option);
	}
	
	
	/**
	 * Save Record Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void clickOnSave() throws AcisException {
		logger.info("Clicking on Save Button");
		Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        waitForPageLoadTill(9);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
    
		clickWebElement(save);
		waitForElement(accountVerify);
		logger.info("Clicked on Save Button");
	}
	
	/**
	 * Save Site Record Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void clickOnSaveSite() throws AcisException {
		logger.info("Clicking on Save Button");
		clickWebElement(save);
		waitForElement(siteAccountVerify);
		logger.info("Clicked on Save Button");
	}
	
	
	/**
	 * Check Status  for Kinship Placement Type
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void checkStatus(String option) throws AcisException {
		logger.info("Checking status Type");
		scrollingToElementofAPage(status);
		clickWebElement(status);
		switch (option) {
		case "Approved":
			Assert.assertTrue(isElementPresent(approvedBy), "Error : No Approved Status for Kinship Placement Type");
			break;
		case "InProgress":
			Assert.assertTrue(isElementPresent(inprogressBy), "Error : No InProgress Status for Kinship Placement Type");
			break;
		case "OnHold":
			Assert.assertTrue(isElementPresent(onHoldBy), "Error : No OnHold Status for Kinship Placement Type");
			break;
		case "Closed":
			Assert.assertTrue(isElementPresent(closedBy), "Error : No Closed Status for Kinship Placement Type");
			break;

		default:
			break;
		}
		scrollingToElementofAPage(status);
		clickWebElement(status);
		logger.info("Checked status as:" + option);
	}
	
	/**Verify Genogram Label
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void verifyGenogramLabel() throws AcisException {
		logger.info("Verify Genogram Label");
		waitForPageLoad();
		waitForElement(genogramLabel);
		logger.info("Verified Genogram Label");
	}
	
	/*** Click Health Tab
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickHealthTab() throws AcisException {
		logger.info("Clicking on Health Tab");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(healthTab);
		clickWebElemntUsingJavascriptExecutor(healthTab);
		waitForPageLoad();
		logger.info("Clicking on Health Tab");
	}
	/*** Click On Special Needs Tab
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSpecialNeedsTab() throws AcisException {
		logger.info("Clicking On Special Needs Tab");
		waitForPageLoad();
		waitForElement(specialNeeds);
		clickWebElemntUsingJavascriptExecutor(specialNeeds);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicking On Special Needs Tab");
	}
	
	/*** Click On New Special Needs 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickNewSpecialNeedsTab() throws AcisException {
		logger.info("Clicking On New Special Needs ");
		waitForPageLoad();
		waitForPageLoadTill(9);
		scrollingToElementofAPage(specialNeeds);
		waitForElement(newSpecialNeeds);
		clickWebElemntUsingJavascriptExecutor(newSpecialNeeds);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicking On New Special Needs");
	}
	/***Select Yes and No for Clinically Diagnosed Disabilities
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 * 
	 */
	public void selectClinicallyDiagnosedDisabilities(String option) throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		switch (option) {
		case "Yes":
			logger.info("Selecting Yes for Clinically Diagnosed Disabilities");
			waitForElement(clinicallyDiagnosedDisabilities);
			clickWebElemntUsingJavascriptExecutor(clinicallyDiagnosedDisabilities);
			clickWebElemntUsingJavascriptExecutor(specialNeedsYes);
			waitForPageLoadTill(5);
			logger.info("Selected Yes for Clinically Diagnosed Disabilities");
			break;
			
		case "No":
			logger.info("Selecting No for Clinically Diagnosed Disabilities");
			waitForElement(clinicallyDiagnosedDisabilitiesEdit);
			clickWebElemntUsingJavascriptExecutor(clinicallyDiagnosedDisabilitiesEdit);
			clickWebElemntUsingJavascriptExecutor(specialNeedsNo);
			waitForPageLoadTill(5);
			logger.info("Selected No for Clinically Diagnosed Disabilities");
			break;
			
		}
	}
	
	/*** Select Condition ADD
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void selectConditionADD() throws AcisException {
		logger.info("Selecting ADD for Condition");
		waitForElement(condition);
		clickWebElemntUsingJavascriptExecutor(condition);
		clickWebElemntUsingJavascriptExecutor(conditionclubFoot);
		waitForPageLoadTill(5);
		logger.info("Selected ADD for Condition");
	}
	
	/*** Select Type Physical Disability
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void selectTypePhysicalDisability() throws AcisException {
		logger.info("Selecting ADD for Condition");
		waitForElement(type);
		clickWebElemntUsingJavascriptExecutor(type);
		clickWebElemntUsingJavascriptExecutor(typePhysicallyDisabled);
		waitForPageLoadTill(5);
		logger.info("Selected ADD for Condition");
		
	}
	
	/***Click on save Button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void saveButton() throws AcisException {
		logger.info("Click on save Button");
		waitForElement(saveBtn);
		clickWebElemntUsingJavascriptExecutor(saveBtn);
		waitForPageLoadTill(5);
		logger.info("Clicked on save Button");
	}
	
	/***Click on Cancel Button
	 * @author mrunal.s.tilekar
	 * 
	 * @throws AcisException 
	 */
	public void clickCancelButton() throws AcisException {
		logger.info("Click on Cancel Button");
		waitForElement(cancelButton);
		clickWebElemntUsingJavascriptExecutor(cancelButton);
		waitForPageLoadTill(5);
		logger.info("Clicked on cancel Button");
	}
	
	/***Click Edit Special Need
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void editSpecialNeeds() throws AcisException {
		logger.info("Click Edit Special Need");
		waitForElement(editSpecialNeed);
		clickWebElemntUsingJavascriptExecutor(editSpecialNeed);
		waitForPageLoadTill(5);
		logger.info("Clicked on Edit Special Need");
	}
	
	
	/***
	 * Verifying palcement resource type for test case S-08880 update placement type
	 * @author akash.a.gaurav
	 */
	

	public void verifytPlacementType() throws AcisException {
		logger.info("Verifying placement type");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(adoptiveHome);
			verifyElementNotPresent(adoptiveHome);
			logger.info("Verfied adoptiveHome foster");
			verifyElementNotPresent(ILp);
			logger.info("Verfied ilp foster");
			clickWebElement(sLa);
			logger.info("Verfying sla foster");
			
	}
	
	/**
	 * Clicked on New Assessments Tab on Placement Record
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickAssessmentsTab() throws AcisException {
		logger.info("Clicking on New Assessments Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(assessmentsTab);
		clickWebElemntUsingJavascriptExecutor(assessmentsTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Assessments Tab");

	}
	
	/**
	 * Clicked on New Walkthrough Assessments button
	 * 	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickNewWalkthroughAssessments() throws AcisException {
		logger.info("Clicking New Walkthrough Assessments button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(newWalkthroughAssessmentsButton);
		clickWebElement(newWalkthroughAssessmentsButton);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Walkthrough Assessments button");
		waitForElement(thePet_QuestionLabel);
		logger.info("Successfully Clicked on New Walkthrough Assessments button");
		
	}
	
	/**
	 * Provide answers  to questions
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideAnswers(String question, String option) throws AcisException {
		logger.info("Providing answers");
		
		switch (question) {
		case "The pet":
			logger.info("Providing answer to qustion: " + question);
			waitForElement(thePet_QuestionLabel);
			clickWebElement(thePet_QuestionDropdown);
			 switch (option) {
			case "Yes":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(thePet_QuestionYes);
				logger.info("Provided answer:" + option);
				break;
				
			case "No":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(thePet_QuestionNo);
				logger.info("Provided answer:" + option);
				break;

			default:
				break;
			}
			
			break;

		case "Medicaation":
			logger.info("Providing answer to qustion: " + question);
			waitForElement(medication_QuestionLabel);
			clickWebElement(medication_QuestionDropdown);
			 switch (option) {
			case "Yes":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(medication_QuestionYes);
				logger.info("Provided answer:" + option);
				break;
				
			case "No":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(medication_QuestionNo );
				logger.info("Provided answer:" + option);
				break;

			default:
				break;
			}
			
			break;

		case "The home":
			logger.info("Providing answer to qustion: " + question);
			waitForElement(home_QuestionLabel);
			clickWebElement(home_QuestionDropdown);
			 switch (option) {
			case "Yes":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(home_QuestionYes);
				logger.info("Provided answer:" + option);
				break;
				
			case "No":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(home_QuestionNo );
				logger.info("Provided answer:" + option);
				break;

			default:
				break;
			}
			
			break;

		case "Adequate Sleeping":
			logger.info("Providing answer to qustion: " + question);
			waitForElement(adequateSleep_QuestionLabel);
			clickWebElement(adequateSleep_QuestionDropdown);
			 switch (option) {
			case "Yes":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(adequateSleep_QuestionYes);
				logger.info("Provided answer:" + option);
				break;
				
			case "No":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(adequateSleep_QuestionNo );
				logger.info("Provided answer:" + option);
				break;

			default:
				break;
			}
			
			break;

		case "Refrigeator":
			logger.info("Providing answer to qustion: " + question);
			waitForElement(refrigerator_QuestionLabel);
			clickWebElement(refrigerator_QuestionDropdown);
			 switch (option) {
			case "Yes":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(refrigerator_QuestionYes);
				logger.info("Provided answer:" + option);
				break;
				
			case "No":
				logger.info("Providing answer:" + option);
				waitForPageLoadTill(5);
				clickWebElement(refrigerator_QuestionNo );
				logger.info("Provided answer:" + option);
				break;

			default:
				break;
			}
			
			break;

		default:
			break;
		}
		
		
	}
	
	
	/***Click on submit Button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSubmitButton() throws AcisException {
		logger.info("Click on submit Button");
		waitForElement(submitButton);
		clickWebElemntUsingJavascriptExecutor(submitButton);
		waitForPageLoadTill(5);
		logger.info("Clicked on submit Button");
	}
	
	/**
	 * Close New Walk through assessments Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeNewWalkthroughAssessmentsTab() throws AcisException {
		logger.info("Closing New Walk through assessments Tab");
		if (closeWalkthroughAssessment.isDisplayed()) {

			clickWebElement(closeWalkthroughAssessment);
			waitForPageLoadTill(5);

		}
		logger.info("Closed New Walk through assessments Tab");
	}
	
	/**
	 * Close assessments Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeAssessmentsTab() throws AcisException {
		logger.info("Closing assessments Tab");
		if (closeAssessmentsButton.isDisplayed()) {

			clickWebElement(closeAssessmentsButton);
			waitForPageLoadTill(5);

		}
		logger.info("Closed assessments Tab");
	}
	
	/***Click on first assessment record
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickFirstAssessmentButton() throws AcisException {
		logger.info("Click on first assessment record");
		waitForElement(firstAssessmentsRecord);
		clickWebElemntUsingJavascriptExecutor(firstAssessmentsRecord);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on first assessment record");
	}
	
	
	/**
	 * Verify created by value
	 * @author mrunal.s.tilekar
	 */
	public void verifyCreatedByValue(String value) {
		logger.info("Verifying created by value");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(createdBy_value);
		System.out.println(createdBy_value.getAttribute("value"));
		Assert.assertTrue(((createdBy_value.getAttribute("value")).contains(value)), "Created by value does not match");
		logger.info("Verified created by value");
		
	}
	
	/**
	 * Verify last modified value 
	 * @author mrunal.s.tilekar
	 */
	public void verifyLastModified() {
		logger.info("Verifying last modified");
		waitForElement(lastModifiedByLabel);
		logger.info("Verified last modified");
		
	}
	
	/**
	 * Select Kinship Placement Resource Radio Button and Click Next Created by Pallavi
	 * 
	 * 
	 * @throws AcisException
	 */
	public void selectKPResourceRadioButton() throws AcisException {
		logger.info("Selecting Provider Agency Radio Button");
		waitForElement(kinshipPlacementResourceRadio);
		clickWebElement(kinshipPlacementResourceRadio);
		clickWebElement(nextButton);
		waitForElement(selectCase);
		logger.info("Selected Provider Agency Radio Button");
	}
	/**
	 * Account ID of placement created
	 * 
	 * @throws AcisException
	 */
	public String AccountId() throws AcisException {
		String status ="";
		try {
		
			logger.info("Clicking on Save Button");
			waitForPageLoadTill(9);
			status =accountIDs.getText().trim();
			System.out.println(status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    return status;
	}
}
