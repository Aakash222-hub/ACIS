package com.acis.automation.pages.caseplan;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewInteractionVisitsPage extends PageBase {

	public NewInteractionVisitsPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewInteractionVisitsPage.class);

	@FindBy(xpath = "//*[@id='DateTime2']")
	WebElement dateField;

	@FindBy(xpath = "//*[text()='16']")
	WebElement selectDate;

	@FindBy(xpath = "//*[text()='Time']")
	WebElement timeField;

	@FindBy(xpath = "//*[@id='ContactType2']")
	WebElement Type;

	@FindBy(xpath = "//*[@id='ContactType2']/..//.//..//..//*[text()='Visit']")
	WebElement visitType;

	@FindBy(xpath = "(//*[@id='SubtypeMerge'])")
	WebElement Subtype;

	@FindBy(xpath = "//*[@id='SubtypeMerge']/../../..//*[text()='Biological Parent']")
	WebElement listBiologicalParent;

	@FindBy(xpath = "(//*[text()='Subtype']//..//input/../../..//*[text()='Foster Parent'])")
	WebElement listFosterParent;

	@FindBy(xpath = "//*[@id='SubtypeMerge']/../../..//*[text()='Child']")
	WebElement listChild;

	@FindBy(xpath = "(//*[text()='Subtype']//..//input/../../..//*[text()='Relative'])")
	WebElement listRelative;

	@FindBy(xpath = "(//*[text()='Subtype']//..//input/../../..//*[text()='Sibling Visit'])")
	WebElement listSiblingVisit;

	@FindBy(xpath = "(//*[text()='Method']//..//input")
	WebElement Method;

	@FindBy(xpath = "(//*[text()='Method']//..//input/../../..//*[text()='Teleconference'])")
	WebElement teleconference;

	@FindBy(xpath = "(//*[text()='Method']//..//input/../../..//*[text()='Video Conference'])")
	WebElement videoconference;

	@FindBy(xpath = "(//*[text()='Method']//..//input/../../..//*[text()='Face-to-Face'])")
	WebElement facetoface;

	@FindBy(xpath = "//*[@id='Narrative2']")
	WebElement txtNarrative;

	@FindBy(xpath = "//*[@id='ProfessionalOpinion2']")
	WebElement txtProfessionalOpinion;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement visitSaveButton;

	@FindBy(xpath = "//button[@title='Save & New']")
	WebElement visitSaveandNewButton;

	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement buttonCancel;

	@FindBy(xpath = "//*[text()='Interactions']//..//..//..//..//..//..//*[text()='New']")
	WebElement newbtnInteraction;

	@FindBy(xpath = "//*[text()='Visit']//..//input")
	WebElement radioVisit;

	@FindBy(xpath = "(//*[text()='Next'])[last()]")
	WebElement btnNext;

	@FindBy(xpath = "//*[@id='Scheduled2']//..//span")
	WebElement btnSceheduled;

	@FindBy(xpath = "//*[@id='Unannounced2']//..//span")
	WebElement unannounced;

	@FindBy(xpath = "//*[text()='Child Welfare Reporting Dashboard']")
	WebElement linkreportingdashboard;

	@FindBy(xpath = "//*[text()='View Report (Foster Child Visited in Current Month)']")
	WebElement viewReport;

	@FindBy(xpath = "(//a[contains(text(),'C-')])[1]")
	WebElement firstCaseID;

	@FindBy(xpath = "(//label[@for='Participants']//..//input[@type='checkbox'])[1]")
	WebElement firstParticipants;

	@FindBy(xpath = "(//label[@for='Participants']//..//input[@type='checkbox'])[2]")
	WebElement secondParticipants;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement btnSave;

	/**
	 * Set date and time
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void setDateandTime() throws AcisException {
		logger.info("Selecting date and time ");
		clickWebElement(dateField);
		waitForPageLoadTill(10);
		clickWebElement(selectDate);
		waitForPageLoadTill(2);
		/*
		 * clickWebElement(timeField); waitForPageLoadTill(10);
		 */
		clickWebElement(selectDate);

	}

	/**
	 * Select Type on Page
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void selectType() throws AcisException {
		logger.info("Selecting type visit");
		clickWebElement(Type);
		clickWebElement(visitType);
		waitForPageLoadTill(2);
		logger.info("Selected type as visit");
	}

	/**
	 * Select Subtype type on Page
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void selectSubtype(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "Biological Parent":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listBiologicalParent);
			waitForPageLoadTill(2);
			logger.info("Selected Subtype as :" + subtypeOption);
			break;

		case "Foster Parent":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listFosterParent);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + subtypeOption);
			break;

		case "Child":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listChild);
			waitForPageLoadTill(2);
			logger.info("Selected sutype:" + subtypeOption);
			break;

		case "Relative":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listRelative);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + subtypeOption);
			break;

		case "Sibling Visit":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listSiblingVisit);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + subtypeOption);
			break;

		default:
			logger.info("No Subtype  ");
			break;
		}

	}

	/**
	 * Select method type on Page
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void selectmethod(String methodOption) throws AcisException {

		switch (methodOption) {
		case " Tele Conference":
			logger.info("Selecting Method :" + methodOption);
			clickWebElement(Method);
			clickWebElement(teleconference);
			waitForPageLoadTill(2);
			logger.info("Selected Method :" + methodOption);
			break;

		case "Video Conference":
			logger.info("Selecting Method :" + methodOption);
			clickWebElement(Method);
			clickWebElement(videoconference);
			waitForPageLoadTill(2);
			logger.info("Selected Method :" + methodOption);
			break;

		case "Face-to-face":
			logger.info("Selecting Method :" + methodOption);
			clickWebElement(Method);
			clickWebElement(facetoface);
			waitForPageLoadTill(2);
			logger.info("Selected Method:" + methodOption);
			break;
		default:
			logger.info("No Method  ");
			break;
		}

	}

	/**
	 * Textarea of Narrative page button
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 * 
	 */
	public void txtNarrative(String opinion) throws AcisException {

		logger.info("Filling textarea ");
		clickWebElement(txtNarrative);
		logger.info("filled textarea ");

	}

	/**
	 * Textarea of Professional Openion page button
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 * 
	 */
	public void txtProfessionalOpinion(String opinion) throws AcisException {

		logger.info("Filling textarea ");
		clickWebElement(txtProfessionalOpinion);
		logger.info("filled textarea ");

	}

	/**
	 * Click on buttons
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */

	public void clickOnButton(String option) throws AcisException {

		switch (option) {
		case "Save":
			logger.info("Clicking on :" + option);
			clickWebElement(visitSaveButton);
			waitForPageLoadTill(2);
			logger.info("Clicked on  :" + option);
			break;

		case "SaveandNew":
			logger.info("Clicking on :" + option);
			clickWebElement(visitSaveandNewButton);
			waitForPageLoadTill(2);
			logger.info("Clicked on :" + option);
			break;

		case "Cancel":
			logger.info("Clicking on :" + option);
			clickWebElement(buttonCancel);
			waitForPageLoadTill(2);
			logger.info("Clicked on  :" + option);
			break;
		default:
			logger.info("No Button is avaiable");
			break;
		}

	}

	/**
	 * Clicked on New button of Interactions Tab on Foster Care Case Record Created
	 * By khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickNewbtnOfInteraction() throws AcisException {
		logger.info("Clicking on New Meeting Button");
		waitForPageLoadTill(8);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(newbtnInteraction);
		clickWebElemntUsingJavascriptExecutor(newbtnInteraction);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Schedule Meeting Button");

	}

	/**
	 * select visit button on New button of Interactions Tab on Foster Care Case
	 * Record Created By khushboo
	 * 
	 * @throws AcisException
	 */
	public void selectVisitbtn() throws AcisException {
		logger.info("Clicking on visit  Button");
		waitForPageLoadTill(8);
		clickWebElemntUsingJavascriptExecutor(radioVisit);
		clickWebElemntUsingJavascriptExecutor(btnNext);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on visit Meeting Button");

	}

	/**
	 * Select meeting type type on Page
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void selectMettingType(String meeting) throws AcisException {

		switch (meeting) {
		case "Scheduled":
			logger.info("Selecting meeting :" + meeting);
			clickWebElement(btnSceheduled);
			waitForPageLoadTill(2);
			logger.info("Selected meeting as :" + meeting);
			break;

		case "Unannonced":
			logger.info("Selecting meeting :" + meeting);
			clickWebElement(unannounced);
			waitForPageLoadTill(2);
			logger.info("Selected meeting :" + meeting);
			break;
		default:
			logger.info("No metting  ");
			break;
		}

	}

	public void clickChildWelFareReportingDashborads() throws AcisException {
		logger.info("click on child welfare reporting dashboards");
		clickWebElement(linkreportingdashboard);
		waitForPageLoadTill(10);
		logger.info("clicked on child welfare reporting dashboards");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(viewReport);
		clickWebElement(viewReport);
		waitForPageLoadTill(10);

	}
	/*
	 * click on first record of dashboard
	 * 
	 * Created by khushboo
	 * 
	 */

	public void selectFirstCaseID() throws AcisException {
		logger.info("select first case id");
		clickWebElement(firstCaseID);
		waitForPageLoadTill(10);
	}

	/*
	 * select participant
	 * 
	 * 
	 * 
	 */
	public void selectParticipants() throws AcisException {
		logger.info("selecting Participants");
		clickWebElement(firstParticipants);
		logger.info("selected Participants");

	}

	/*
	 * click on save button
	 * 
	 * @khusboo
	 * 
	 * 
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("clicking on save button");
		clickWebElement(btnSave);
	}
}
