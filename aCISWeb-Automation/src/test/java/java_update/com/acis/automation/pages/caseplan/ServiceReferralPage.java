package com.acis.automation.pages.caseplan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

/**
 * @author akash.a.gaurav
 *
 */
public class ServiceReferralPage extends PageBase {

	public ServiceReferralPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ServiceReferralPage.class);

	@FindBy(xpath = "//label[text()='Name of Service Recipient']//..//..//input")
	WebElement nameOfServiceRequestTextBox;

	@FindBy(xpath = "//span[text()='Type of Service']//..//..//..//input")
	WebElement typeOfService;

	@FindBy(xpath = "(//*[text()='Type of Service']/../../..//li//*[text()='Child Care'])[last()]")
	WebElement childCareOptionTypeOfService;

	@FindBy(xpath = "(//*[text()='Type of Service']/../../..//li//*[text()='Substance Abuse Treatment'])[last()]")
	WebElement substanceAbuseTreatment;

	@FindBy(xpath = "(//*[text()='Type of Service']/../../..//li//*[text()='Transportation'])[last()]")
	WebElement transportationTypeofServices;

	@FindBy(xpath = "(//*[text()='Type of Service']/../../..//li//*[text()='Tutoring'])[last()]")
	WebElement tutoringTypeofAction;

	@FindBy(xpath = "(//*[text()='Type of Service']/../../..//li//*[text()='Licensed Child Placement Agency'])[last()]")
	WebElement licensetypeofService;

	@FindBy(xpath = "(//label[text()='Court Action Date/Time']//..//..//..//input)[1]")
	WebElement courtCaseActionDateTime;

	@FindBy(xpath = "(//label[text()='Next Court Action Date/Time']//..//..//..//input)[1]")
	WebElement nextCourtActionDateTime;

	@FindBy(xpath = "//span[text()='Court Case Number']//..//..//..//input")
	WebElement courtCaseNumberText;

	@FindBy(xpath = "//span[text()='Court Action Type']//..//..//..//input")
	WebElement courtActionType;

	@FindBy(xpath = "//span[text()='City']//..//..//..//input")
	WebElement cityTextArea;

	@FindBy(xpath = "//span[text()='State']//..//..//..//input")
	WebElement stateTextArea;

	@FindBy(xpath = "//span[text()='Zip Code']//..//..//..//input")
	WebElement zipCodeTextArea;

	@FindBy(xpath = "(//*[text()='Add Parental Visitation Plan?']/../../..//li//*[text()='N/A'])[last()]")
	WebElement addParentalNA;

	@FindBy(xpath = "(//label[text()='Parent']//..//..//input)[1]")
	WebElement ParenTextArea;

	@FindBy(xpath = "(//label[text()='Child']//..//..//input)[1]")
	WebElement ChildTextArea;

	@FindBy(xpath = "(//label[text()='Narrative']//..//..//textarea)[1]")
	WebElement NarrativeTextArea;

	@FindBy(xpath = "(//*[text()='Add Sibling Visitation Plan?']/../../..//input)[last()]")
	WebElement addSiblingVisitation;

	@FindBy(xpath = "(//*[text()='Court Action Type']/../../..//li//*[text()='Disposition'])[last()]")
	WebElement courtActionTypeDisposition;

	@FindBy(xpath = "(//*[text()='Court Action Type']/../../..//li//*[text()='Adjudication'])[last()]")
	WebElement courtActionTypeAdjudication;

	@FindBy(xpath = "(//*[text()='Court Action Type']/../../..//li//*[text()='Permanency Goal'])[last()]")
	WebElement courtActionTypePermanencyGoal;

	@FindBy(xpath = "//span[text()='Next Court Action Type']//..//..//..//input")
	WebElement nextCourtActiondropdown;

	@FindBy(xpath = "(//*[text()='Next Court Action Type']/../../..//li//*[text()='Disposition'])[last()]")
	WebElement nextCourtActionDeposition;

	@FindBy(xpath = "(//*[text()='Next Court Action Type']/../../..//li//*[text()='Adjudication'])[last()]")
	WebElement nextCourtActionAdjudication;

	@FindBy(xpath = "(//*[text()='Next Court Action Type']/../../..//li//*[text()='Permanency Goal'])[last()])")
	WebElement nextCourtActionPermanencyGoal;

	@FindBy(xpath = "(//*[text()='Next Court Action Type']/../../..//li//*[text()='Court Order'])[last()]")
	WebElement nextCourtActionCourtOrder;

	@FindBy(xpath = "(//*[text()='Next Court Action Type']/../../..//li//*[text()='Emergency Protection Order'])[last()])")
	WebElement nextCourtActionEmergencyProtectionOrder;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//h1[text()='Services to the Provider(s)']")
	WebElement serviceTotheProvider;

	@FindBy(xpath = "(//label[text()='Court Action Participant']//..//..//input)[1]")
	WebElement courtActionParticipant1;

	@FindBy(xpath = "//button[text()='Save'][last()]")
	WebElement saveButton;

	@FindBy(xpath = "//span[contains(text(),'Name')]")
	WebElement nameText;

	@FindBy(xpath = "//div[@title='New Service Referral']")
	WebElement serviceReferralLink;

	@FindBy(xpath = "//*[@title='New Placement']")
	WebElement newPlacementLink;

	@FindBy(xpath = "(//span[contains(text(),'Name')])[2]")
	WebElement nameText2;

	@FindBy(xpath = "//*[text()='Search']")
	WebElement search;

	@FindBy(xpath = "//p[contains(normalize-space(),'Please enter at least one of the following: Zip Co')]")
	WebElement zipcodeStateError;

	@FindBy(xpath = "//li[5]//lightning-primitive-coordinate-item[1]//li[1]//button[1]//span[2]//span[2]")

	WebElement verifyProviderAgency;

	@FindBy(xpath = "//p[contains(normalize-space(),'Please select a Placement Resource to proceed.')]")
	WebElement verifyPlacement;

	@FindBy(xpath = "(//span[contains(text(),'C-')]/../..//button)[2]")
	WebElement serviceReferalClose;

	@FindBy(xpath = "//span[text()='No']/..//span[@class='slds-radio_faux']")
	WebElement noCheckBox;

	@FindBy(xpath = "(//span[@class='slds-listbox__option-text slds-listbox__option-text_entity'][contains(normalize-space(),'Name: ')])[2]")
	WebElement nameProvider;

	@FindBy(xpath = "(//label[text()='Child']//..//..//input)[1]")
	WebElement childProviderInput;

	@FindBy(xpath = "(//span[text()='Medically Complex']/../..//span[@class='slds-checkbox_faux'])[1]")
	WebElement medicalCheckbox;
	
	@FindBy(xpath = "//*[text()='Previous']")
	WebElement previousButton;
	
	@FindBy(xpath = "//h1[text()='Service Referral']")
	WebElement serviceReferralVerify;

	@FindBy(xpath = "//*[text()='Save for later']")
	WebElement saveForlater;
		
	@FindBy(xpath = "//button[text()='OK']")
	WebElement ok;
		
	@FindBy(xpath = "//span[text()='Your OmniScript is saved for later']")
	WebElement omniscriptSaveForLater;
	
	/***
	 * Wait for element person search
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	/**
	 * enter value in Name textbox
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void enterTextNameTextbox(String name) throws AcisException {
		try {
			Thread.sleep(1000);
			logger.info("Entering name : " + name);
			waitForPageLoadTill(5);
			enterText(nameOfServiceRequestTextBox, name);
			waitForPageLoadTill(5);
			clickWebElement(nameOfServiceRequestTextBox);
			waitForPageLoadTill(10);		
			Actions action = new Actions(driver);
			try {
				action.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'" + name + "')])[2]"))).click().perform();
			} catch (Exception e) {
				action.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'" + name + "')])[1]"))).click().perform();
			}
			waitForPageLoadTill(5);
			logger.info("Entered name : " + name);
		} catch (Exception e) {
			
		}
	}
	
	public void searchPerson(String subType, String strText) throws AcisException, InterruptedException {

		switch (subType) {
		case "referal":

			logger.info("Searching Person");
			waitForElementClickable(nameOfServiceRequestTextBox);
			waitForPageLoadTill(10);
			enterText(nameOfServiceRequestTextBox, strText);
			waitForPageLoadTill(10);
			clickWebElement(nameText2);
			logger.info("Entered the name");
			break;
		case "placement":
			logger.info("Searchin person placement page");
			waitForPageLoadTill(21);
			waitForElement(childProviderInput);
			waitForPageLoadTill(10);
			enterText(childProviderInput, strText);
			waitForPageLoadTill(10);
			clickWebElement(nameProvider);
			logger.info("Searched person placment page");
			break;

		default:
			logger.info("No Court Action Type");
			break;

		}
	}

	/***
	 * @author akash.a.gaurav Selecting different options from type of services
	 */

	public void selectingTypeOfService(String subtypeOption) throws AcisException {
		waitForElement(typeOfService);
		switch (subtypeOption) {
		case "ChildCare":
			logger.info("Selecting type of services :" + subtypeOption);
			clickWebElement(typeOfService);
			clickWebElement(childCareOptionTypeOfService);
			waitForPageLoadTill(5);
			logger.info("Selected  typoe of services:" + subtypeOption);
			break;

		case "SubstanceAbuseStatement":
			logger.info("Selecting type of services :" + subtypeOption);
			clickWebElement(typeOfService);
			clickWebElement(substanceAbuseTreatment);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Case Action Date as :" + subtypeOption);
			break;

		case "transportation":
			logger.info("Selecting type of services :" + subtypeOption);
			clickWebElement(typeOfService);
			clickWebElement(transportationTypeofServices);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Case Action Date as :" + subtypeOption);
			break;

		case "tutoring":
			logger.info("Selecting type of services :" + subtypeOption);
			clickWebElement(typeOfService);
			clickWebElement(tutoringTypeofAction);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Case Action Date as :" + subtypeOption);
			break;

		case "license":
			logger.info("Selecting type of services :" + subtypeOption);
			clickWebElement(typeOfService);
			clickWebElement(licensetypeofService);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Case Action Date as :" + subtypeOption);
			break;

		default:
			logger.info("No Court Action Type");
			break;
		}
	}

	/***
	 * 
	 * 09-09-2020 use this date format while passing the data Selecting date court
	 * action type date must be lesser than nextcourtaction
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void dateTime(String subtypeOption, String str1) throws AcisException {
		switch (subtypeOption) {
		case "courtCaseActionDateTime":
			logger.info("Selecting Court Action Date :" + subtypeOption);
			clickWebElement(courtCaseActionDateTime);
			Actions act = new Actions(driver);
			waitForPageLoadTill(5);
			act.sendKeys(Keys.CONTROL).sendKeys(str1).perform();
			waitForPageLoadTill(5);
			logger.info("Selected  Court Case Action Date as :" + subtypeOption);
			break;

		case "NextCourtActipm":
			logger.info("Selecting Court Action Date :" + subtypeOption);
			clickWebElement(nextCourtActionDateTime);
			Actions action = new Actions(driver);
			waitForPageLoadTill(5);
			action.sendKeys(Keys.CONTROL).sendKeys(str1).perform();
			waitForPageLoadTill(2);
			logger.info("Selected  Court Case Action Date as :" + subtypeOption);
			break;

		default:
			logger.info("No Court Action Type");
			break;
		}
	}

	/**
	 * Clear City
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clearCity() throws AcisException {
		logger.info("Clearing City ");
		cityTextArea.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		logger.info("Cleared City ");
	}
	
	/**
	 * Reset Data
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void resetData() throws AcisException {
		logger.info("Resetting Data ");
		refreshPage();
		waitForElement(serviceReferralVerify);
		logger.info("Data Reset");
	}

	/**
	 * @author akash.a.gaurav Entering text area city state zip code
	 * @throws AcisException
	 */
	public void enteringText(String subtypeOption, String str1) throws AcisException {
		switch (subtypeOption) {
		case "City":
			logger.info("Selecting Input Text :" + subtypeOption);
			cityTextArea.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			waitForPageLoadTill(5);
			enterText(cityTextArea, str1);
			waitForPageLoadTill(2);
			logger.info("Selected  Input Text :" + subtypeOption);
			break;

		case "State":
			logger.info("Selecting Input Text :" + subtypeOption);
			stateTextArea.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			waitForPageLoadTill(5);
			enterText(stateTextArea, str1);
			waitForPageLoadTill(2);
			logger.info("Selected  Input Text :" + subtypeOption);
			break;

		case "zipcode":
			logger.info("Selecting Input Text :" + subtypeOption);
			zipCodeTextArea.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			waitForPageLoadTill(5);
			enterText(zipCodeTextArea, str1);
			waitForPageLoadTill(2);
			logger.info("Selected  Input Text :" + subtypeOption);
			break;

		default:
			logger.info("No input text are");
			break;
		}

	}

	/***
	 * Clicking on servie Referal Page
	 * 
	 * @author akash.a.gaurav
	 * @throws InterruptedException
	 * @throws AcisException
	 */

	public void clickonServiceReferal(String subType) throws InterruptedException, AcisException {
		switch (subType) {
		case "ServiceRefral":

			waitForPageLoadTill(19);
			logger.info("Clicking on service referral page");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,950)");
			waitForPageLoadTill(35);
			logger.info("Clicking on service referral");
			clickWebElemntUsingJavascriptExecutor(serviceReferralLink);
			waitForPageLoadTill(25);
			logger.info("Clicked on service referral page");
			break;

		case "Placement":
			Thread.sleep(1000);
			logger.info("Clicking on Placement page");
			waitForPageLoadTill(9);
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			jse1.executeScript("window.scrollBy(0,350)");
			waitForPageLoadTill(5);
			logger.info("Clicking on placement referral");
			clickWebElement(newPlacementLink);
			waitForPageLoadTill(20);
			logger.info("Clicked on placement page ");
			break;

		}

	}

	/***
	 * Verify Error if no city , state ,zip code, is enter
	 * 
	 * @author akash.a.gaurav
	 */

	public void verifyNoCityStateError(String subtypeOption) {
		switch (subtypeOption) {
		case "VerifyErrror":
			logger.info("Verifying zip code state city error if not provided");
			verifyElementNotPresent(zipcodeStateError);
			logger.info("Verifyied zip code state city error if not provided");
			break;

		case "VerifyProvideHomePage":
			logger.info("Verifying Provider Home Page ");
			verifyElementNotPresent(verifyProviderAgency);
			logger.info("Verified Provider Home Page");
			break;

		case "VerifyPlacement":
			logger.info("Verifying Palcement Resource Error");
			verifyElementNotPresent(verifyPlacement);
			logger.info("Verified Placement Resource Error");
			break;

		default:
			logger.info("No data");
			break;
		}

	}

	/***
	 * Click on search Page
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void searchPage() throws AcisException {
		logger.info("Clicking on Search Page");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,750)");
		Actions act = new Actions(driver);
		waitForPageLoadTill(5);
//		act.moveToElement(search).click().perform();
//		act.sendKeys(Keys.TAB).perform();
//		waitForPageLoadTill(5);
//		act.sendKeys(Keys.TAB).perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.ENTER).perform();
//		waitForPageLoadTill(5);
		clickWebElement(search);
		waitForElement(previousButton);
		logger.info("Clicked on Search page");

	}

	/***
	 * Close service referal page
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void closeserviceReferalPage() throws AcisException {
		waitForPageLoadTill(9);
		logger.info("Closing service referal page");
		waitForElement(serviceReferalClose);
		clickWebElement(serviceReferalClose);
	}

	/***
	 * Select check box
	 * 
	 * @throws AcisException
	 */
	public void checkBox(String subType) throws AcisException {
		switch (subType) {
		case "No":
			waitForElement(noCheckBox);
			clickWebElement(noCheckBox);
			logger.info("CheckBox Selected as no");
			break;
		case "Medical":
			waitForElement(medicalCheckbox);
			clickWebElement(medicalCheckbox);
			logger.info("Medical check box selected");
		default:
			break;
		}
	}
	

	/*** Click Save For Later
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSaveForLater() throws AcisException {
		logger.info("Clicking on Save For Later");
		waitForPageLoad();
		waitForPageLoadTill(10);
		waitForElement(saveForlater);
		clickWebElemntUsingJavascriptExecutor(saveForlater);
		//clickWebElement(saveForLater);
		waitForPageLoadTill(5);
		logger.info("Clicked on Save For Later");
	}
	
	/*** Click OK
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickOk() throws AcisException {
		logger.info("Clicking on OK Button");
		waitForPageLoad();
		clickWebElement(ok);
		waitForPageLoadTill(5);
		logger.info("Clicked on OK button");
	}
	
	/*** Click OmniScript is saved for later
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void omniscriptSaveForLater() throws AcisException {
		logger.info("Verify OmniScript is saved for later");
		waitForPageLoad();
		waitForElement(omniscriptSaveForLater);
		waitForPageLoadTill(5);
		logger.info("Verified OmniScript is saved for later");
	}
	/***
	 * Scroll till end
	 * @author akash.a.gaurav
	 */ 
	
	public void scrollEnd() {
		
		waitForPageLoad();
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,940)");
	}
	
	/**
	 * enter value in Name textbox
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void enterTextNameTextboxVerifying(String name) throws AcisException {
		logger.info("Entering name : " + name);
		waitForPageLoadTill(5);
		enterText(nameOfServiceRequestTextBox, name);
		waitForPageLoadTill(5);
		clickWebElement(nameOfServiceRequestTextBox);
		waitForPageLoadTill(10);		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'" + name + "')])[2]"))).click().perform();
		waitForPageLoadTill(5);
		logger.info("Entered name : " + name);
	}
}
