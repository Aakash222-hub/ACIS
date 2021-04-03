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

	@FindBy(xpath = "//*[text()='Add Persons']")
	WebElement addPersons;

	@FindBy(xpath = "//*[text()='Add Collateral']")
	WebElement addCollateral;

	@FindBy(xpath = "(//*[text()='Persons Search']/../../..//input)[last()]")
	WebElement personSearch;

	@FindBy(xpath = "//h1[text()='Persons']/../..//button[text()='Save']")
	WebElement saveButtonPersons;

	@FindBy(xpath = "//h1[text()='Collateral']/../..//button[text()='Save']")
	WebElement saveButtonCollateral;

	@FindBy(xpath = "//*[text()='First Name']/../../..//input")
	WebElement firstName;

	@FindBy(xpath = "//*[text()='Last Name']/../../..//input")
	WebElement lastName;

	@FindBy(xpath = "//*[text()='Collateral Phone']/../../..//input")
	WebElement collateralPhone;

	@FindBy(xpath = "//*[text()='Email']/../../..//input")
	WebElement email;

	@FindBy(xpath = "//button[text()='Next']")
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
	@FindBy(xpath = "//div[text()='Schedule Meeting']")
	WebElement scheduleMeeting;
				
	@FindBy(xpath="//button[text()='Save for later']")
	WebElement saveForLater;
				
	@FindBy(xpath="//button[text()='OK']")
	WebElement ok;
				
	@FindBy(xpath="//span[text()='Your OmniScript is saved for later']")
	WebElement omniscriptSaveForLater;
	
	@FindBy(xpath = "(//*[text()='Related'])[2]")
	WebElement relatedTab;
	
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
		enterText(firstName, lastNameStr);
		enterText(firstName, collateralPhoneStr);
		enterText(firstName, emailStr);
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
}
