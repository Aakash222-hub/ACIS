package com.acis.automation.pages.tdm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class AddMeetingAttendeesPage extends PageBase {

	public AddMeetingAttendeesPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(AddMeetingAttendeesPage.class);

	@FindBy(xpath = "//*[text()='Please select a meeting type.']/../../..//input")
	WebElement meetingType;

	@FindBy(xpath = "//*[@data-value='TDM']")
	WebElement TDM;

	@FindBy(xpath = "//*[text()='Case Plan Review']")
	WebElement casePlanReview;
	
	@FindBy(xpath="//*[text()='Case Transfer']")
	WebElement casePlanTransfer;

	@FindBy(xpath = "//*[text()='Add Persons']")
	WebElement addPersons;

	@FindBy(xpath = "//*[text()='Add Collateral']")
	WebElement addCollateral;

	@FindBy(xpath = "(//*[text()='Persons Search']/../../..//input)[last()]")
	WebElement personSearch;

	@FindBy(xpath = "//h1[text()='Persons']/../..//button[text()='Save']")
	WebElement saveButtonPersons;

	@FindBy(xpath = "//h1[text()='Collateral Contact']/../..//button[text()='Save']")
	WebElement saveButtonCollateral;

	@FindBy(xpath = "(//span[text()='First Name']/../../..//input)[2]")
	WebElement firstName;

	@FindBy(xpath = "(//span[text()='Last Name']/../../..//input)[2]")
	WebElement lastName;

	@FindBy(xpath = "//*[text()='Phone Number']/../../..//input")
	WebElement collateralPhone;

	@FindBy(xpath = "(//span[text()='Email']/../../..//input[@type='email'])[2]")
	WebElement email;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//h1[contains(text(),'Select Meeting Location')]")
	WebElement selectMeetingLocationTitle;

	@FindBy(xpath = "(//span[contains(text(),'CPR')])[1]")
	WebElement participantId;

	@FindBy(xpath = "(//a[contains(@title,'C-')])[5]")
	WebElement interactionId;

	@FindBy(xpath = "(//button[@title='Edit Date/Time']")
	WebElement editDateTime;
	
	@FindBy(xpath = "//span[text()='Age at Time of Interaction']/..//following-sibling::div//lightning-formatted-text")
	WebElement ageAtTimeOfInteraction;

	//Pallavi Changes
	@FindBy(xpath = "//*[text()='Schedule Meeting']")
	WebElement scheduleMeeting;
				
	@FindBy(xpath="//*[text()='Save for later']")
	WebElement saveForLater;
				
	@FindBy(xpath="//button[text()='OK']")
	WebElement ok;
				
	@FindBy(xpath="//span[text()='Your OmniScript is saved for later']")
	WebElement omniscriptSaveForLater;
	
	@FindBy(xpath = "(//*[text()='Related'])[2]")
	WebElement relatedTab;
	
	@FindBy(xpath = "//*[@data-value='Case Transfer']")
	WebElement caseTransfer;
	
	@FindBy(xpath = "//label[text()='Transferring Case Owner']/../..//input")
	WebElement transferringCaseOwnerTextBox;
	
	@FindBy(xpath = "//label[text()='Receiving Case Owner']/../..//input")
	WebElement receivingCaseOwnerTextBox;
	
	@FindBy(xpath = "//label[text()='Transferring Case Owner Supervisor']/../..//input")
	WebElement transferringCaseOwnerSupervisorTextBox;
	
	@FindBy(xpath = "//label[text()='Receiving Case Owner Supervisor']/../..//input")
	WebElement receivingCaseOwnerSupervisorTextBox;
	
	@FindBy(xpath = "//*[text()='New']")
	WebElement caseTransferNew;
	
	@FindBy(xpath = "//*[text()='Transferring Name']/../../..//input")
	WebElement transferringNameTextBox;
	
	@FindBy(xpath = "//*[text()='Receiving Name']/../../..//input")
	WebElement receivingNameTextBox;
	
	@FindBy(xpath = "(//*[text()='Email']/../../..//input)[1]")
	WebElement emailTransferring;
	
	@FindBy(xpath = "(//*[text()='Id']/../../..//input)[1]")
	WebElement IdTransferring;
	
	@FindBy(xpath = "//button[text()='Create/Add']")
	WebElement createAddButton;
	
	@FindBy(xpath = "(//label[text()='User']/../..//input)")
	WebElement userTextBox;
	
	@FindBy(xpath = "(//button[text()='Save'])[3]")
	WebElement save;

	@FindBy(xpath="//*[text()='Please ensure you have added attendee/s to proceed with scheduling the meeting.']")
	WebElement errorMessage;
	
	@FindBy(xpath="//*[text()='Please enter the Transferring Case Owner, Receiving Case Owner, Transferring Case Owner Supervisor to proceed.']")
	WebElement caseTransferErrorMessage;

	
	/**
	 * Owner : Dharmesh Krishna Description: Set Meeting type on Add Meeting
	 * Attendees Page
	 * 
	 * @throws AcisException
	 */
	public void setMeetingType(String strText) throws AcisException {
		logger.info("Selecting Meeting Type as:" + strText);
		switch (strText) {
		case "TDM":
			waitForElement(meetingType);
			clickWebElement(meetingType);
			waitForElement(TDM);
			clickWebElement(TDM);
			break;
		case "CasePlanReview":
			waitForElement(meetingType);
			clickWebElement(meetingType);
			waitForElement(casePlanReview);
			clickWebElement(casePlanReview);
			break;
		default:
			logger.info(strText + " Meeting not found");
			break;
		}
		logger.info("Selected Meeting Type as:" + strText);
	}

	/**
	 * Owner : Dharmesh Krishna Description: Set Person Search on Add Meeting
	 * Attendees Page
	 * 
	 * @throws AcisException
	 */
	public void searchPerson(String strText) throws AcisException {
		logger.info("Selecting Parent as:" + strText);
		waitForElementClickable(addPersons);
		clickWebElement(addPersons);
		waitForElementClickable(personSearch);
		enterText(personSearch, strText);
		// waitForElementClickable(driver.findElement(By.xpath("(//div[@class='slds-form-element'])[3]")));
		waitForPageLoadTill(5);
		// clickWebElement(driver.findElement(By.xpath("(//div[@class='slds-form-element'])[3]")));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "')]"))).click()
				.perform();
		// clickWebElement(driver.findElement(By.xpath("(//span[contains(text(),'"+strText+"'])[2]")));
		waitForPageLoadTill(5);
		clickWebElement(saveButtonPersons);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Selected Parent as:" + strText);
	}

	/**
	 * Owner : Dharmesh Krishna Description: Set Person Search on Add Meeting
	 * Attendees Page
	 * 
	 * @throws AcisException
	 */
	public void setCollateral(String firstNameStr, String lastNameStr, String collateralPhoneStr, String emailStr)
			throws AcisException {
		logger.info("Set Collateral as");
		waitForElementClickable(addCollateral);
		clickWebElement(addCollateral);
		waitForElementClickable(firstName);
		enterText(firstName, firstNameStr);
		enterText(lastName, lastNameStr);
		enterText(collateralPhone, collateralPhoneStr);
		enterText(email, emailStr);
		waitForPageLoadTill(5);
		clickWebElement(saveButtonCollateral);
		logger.info("Setting Collateral as");
	}

	/**
	 * click next button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Next button");
		waitForElement(selectMeetingLocationTitle);
		logger.info("Select Meeting Location  Page loaded");
	}

	/**
	 * click participant id button
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */

	public void clickParticipantId() throws AcisException {
		logger.info("Clicking on participant Id");
		waitForElement(participantId);
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(participantId);
		waitForPageLoadTill(5);
		logger.info("Clicked on participant Id");
	}
	
	public void verifyParticipantDetailsField() throws AcisException {
		logger.info("Verify Address is displayed or not");
		waitForPageLoadTill(10);
		List<WebElement> elements = driver.findElements(By.xpath("//*[text()='Address']"));
		if (elements.size() > 0) {

			logger.info("Verified Address is displayed");
		} else {
			logger.info("Verified Address is not displayed");
		}
		logger.info("Verify Phone is displayed or not");
		waitForPageLoadTill(10);
		elements = driver.findElements(By.xpath("//*[text()='Phone']"));
		// verifyElementNotPresent(newbtn);
		if (elements.size() > 0) {

			logger.info("Verified Phone is displayed");
		} else {
			logger.info("Verified Phone is not displayed");
		}
		logger.info("Verify Email is displayed or not");
		waitForPageLoadTill(10);
		elements = driver.findElements(By.xpath("//*[text()='Email']"));
		// verifyElementNotPresent(newbtn);
		if (elements.size() > 0) {

			logger.info("Verified Email is displayed");
		} else {
			logger.info("Verified Email is not displayed");
		}
		logger.info("Verify Gender is displayed or not");
		waitForPageLoadTill(10);
		elements = driver.findElements(By.xpath("//*[text()='Gender']"));
		// verifyElementNotPresent(newbtn);
		if (elements.size() > 0) {

			logger.info("Verified Gender is displayed");
		} else {
			logger.info("Verified Gender is not displayed");
		}
	}

	/**
	 * click interaction id button
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */

	public void clickInteractionId() throws AcisException {
		logger.info("Clicking on Interaction Id");
		waitForElement(interactionId);
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(interactionId);
		waitForPageLoadTill(5);
		logger.info("Clicked on Interaction Id");
	}

	public void clickEditDateTimeButton() throws AcisException {

		logger.info("clicking on edit button on Date/Time");
		clickWebElement(editDateTime);
		waitForPageLoadTill(5);
		// waitForElement(editCasePersonTitle);
		logger.info("clicked on edit button on Date/Time");
	}

	/**
	 * Check Age Value
	 * 
	 * @author priyanka wani
	 */
	public void checkAgeValue() {
		logger.info("Verifying Age At Time Of Interaction Value is pre populated ");
		Assert.assertNotNull(ageAtTimeOfInteraction.getText(), "Verified Age Value");
		logger.info("Verified Age At Time Of Interaction Value is pre populated ");
	}
	
	/**
	 * click schedule Meeting button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickScheduleMeetingButton() throws AcisException {
		logger.info("Clicking on schedule Meeting button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(scheduleMeeting);
		clickWebElemntUsingJavascriptExecutor(scheduleMeeting);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on schedule Meeting button");
		
	}
	
	/*** Click Save For Later
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSaveForLater() throws AcisException {
		logger.info("Clicking on Save For Later");
		waitForPageLoad();
		waitForPageLoadTill(8);
		waitForElement(saveForLater);
		clickWebElemntUsingJavascriptExecutor(saveForLater);
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
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForElement(relatedTab);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");

	}
	
	/**
	 * Owner : Pallavi Description: Set Meeting type on Add Meeting
	 * Attendees Page
	 * 
	 * @throws AcisException
	 */
	public void setMeetingTypeCaseTransfer(String strText) throws AcisException {
		logger.info("Selecting Meeting Type as:" + strText);
		waitForElement(meetingType);
		clickWebElement(meetingType);
		waitForElement(caseTransfer);
		clickWebElement(caseTransfer);
		logger.info("Selected Meeting Type as:" + strText);
	}
	
	/*** Entering Transferring Case Owner
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void EnterCaseOwner(String strText) throws AcisException {
			
			logger.info("Entering Transferring Case Owner as:" + strText);
			waitForPageLoad();
			waitForElement(transferringCaseOwnerTextBox);
			clickWebElement(transferringCaseOwnerTextBox);
			transferringCaseOwnerTextBox.clear();
			enterText(transferringCaseOwnerTextBox, strText);
			waitForPageLoadTill(5);
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "')]"))).click().perform();
			waitForPageLoadTill(5);
			logger.info("Entered Transferring Case Owner as:" + strText);
			
	}
	
	/*** Entering Receiving Case Owner
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void EnterReceivingCaseOwner( String strText) throws AcisException {
			
			logger.info("Entering Receiving Case Owner as:" + strText);
			waitForPageLoad();
			waitForElement(receivingCaseOwnerTextBox);
			clickWebElement(receivingCaseOwnerTextBox);
			receivingCaseOwnerTextBox.clear();
			enterText(receivingCaseOwnerTextBox, strText);
			waitForPageLoadTill(5);
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "')]"))).click().perform();
			waitForPageLoadTill(5);
			logger.info("Entered Transferring Case Owner as:" + strText);
			
	}
	
	/*** Entering Receiving Case Owner
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void EnterTransferringSupervisorCaseOwner(String strText) throws AcisException {
			
			logger.info("Entering Receiving Case Owner as:" + strText);
			waitForPageLoad();
			waitForElement(transferringCaseOwnerSupervisorTextBox);
			clickWebElement(transferringCaseOwnerSupervisorTextBox);
			transferringCaseOwnerSupervisorTextBox.clear();
			enterText(transferringCaseOwnerSupervisorTextBox, strText);
			waitForPageLoadTill(5);
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "')]"))).click().perform();
			waitForPageLoadTill(5);
			logger.info("Entered Transferring Case Owner as:" + strText);
			
	}
	
	/*** Entering Receiving Case Owner
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void EnterReceivingSupervisorCaseOwner( String strText) throws AcisException {
			
			logger.info("Entering Receiving Case Owner as:" + strText);
			waitForPageLoad();
			waitForElement(receivingCaseOwnerSupervisorTextBox);
			clickWebElement(receivingCaseOwnerSupervisorTextBox);
			receivingCaseOwnerSupervisorTextBox.clear();
			enterText(receivingCaseOwnerSupervisorTextBox, strText);
			waitForPageLoadTill(5);
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "')]"))).click().perform();
			waitForPageLoadTill(5);
			logger.info("Entered Transferring Case Owner as:" + strText);
			
	}
	
	/*** Click on Create/Add Button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickCreateAddButton() throws AcisException {
		logger.info("Click on Create/Add button");
		waitForElement(createAddButton);
		scrollingToElementofAPage(createAddButton);
		clickWebElement(createAddButton);
		waitForPageLoadTill(5);
		logger.info("Clicked on Create/Add button");
	}
	
	/***Click User Text Box
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void userTextBox(String strText) throws AcisException {
		logger.info("Click on User Text Box" + strText);
		waitForElement(userTextBox);
		enterText(userTextBox, strText);
		waitForPageLoadTill(5);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "')]"))).click().perform();
		waitForPageLoadTill(5);
		logger.info("Clicked on User Text Box" + strText);
	}
	
	/*** Click On Save
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 * 
	 * 
	 */
	public void ClickSave() throws AcisException {
		logger.info("Click on User Text Box");
		waitForElement(save);
		clickWebElemntUsingJavascriptExecutor(save);
		waitForPageLoadTill(5);
		logger.info("Click on User Text Box");
	}

/*verify error message
 *
 */
public void checkErrorMessage() {
	logger.info("verifying error message");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	scrollingToElementofAPage(errorMessage);
	waitForElement(errorMessage);
	logger.info("verified error message");
}

/*verify error message of case transfer
 *
 */
public void checkErrorMessageCaseTransfer() {
	logger.info("verifying error message");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	scrollingToElementofAPage(caseTransferErrorMessage);
	waitForElement(caseTransferErrorMessage);
	logger.info("verified error message");
}
}


