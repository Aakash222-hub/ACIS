package com.acis.automation.pages.personaccount;

import java.awt.AWTException;

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

import ch.qos.logback.core.joran.action.Action;

public class MandatoryPersonSearchSafetyAssesmentPage extends PageBase {

	public MandatoryPersonSearchSafetyAssesmentPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(MandatoryPersonSearchSafetyAssesmentPage.class);

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Case Actions']")
	WebElement caseAction;

	@FindBy(xpath = "//a[@title='Select List View']")
	WebElement selectListView;

	@FindBy(xpath = "//span[normalize-space(.)='My Investigations'] ")
	WebElement myInvestigationList;

	@FindBy(xpath = "(//table/tbody/tr/td/span/a)[1] ")
	WebElement selectFirstRecord;

	@FindBy(xpath = "//a[contains(text(),'Related')]")
	WebElement relatedTab;

	@FindBy(xpath = "//button[contains(text(),'New Safety Assessment')]")
	WebElement newSafetyAssesmentLink;

	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;

	// Khushboo
	@FindBy(xpath = "(//*[text()='Safety Assessment Person Information']/../..//button)[1]")
	WebElement downArrowSafetyAssessmentInformation;

	@FindBy(xpath = "//span[text()='Edit']")
	WebElement buttonEdit;
	
	@FindBy(xpath="(//*[text()='Search for a Person'])[1]/../..//c-icon")
	WebElement iconbutton;
	
	@FindBy(xpath="(//*[text()='Street 1']//..//../..//input)[1]")
	WebElement txtsteet1;
	
	@FindBy(xpath="(//button[text()='Save'])[1]")
	WebElement txtSaveButton;
	
	@FindBy(xpath="//*[text()='Review Allegation Report']")
	WebElement reviewAlligationReport;
	
	@FindBy(xpath="(//*[text()='Capture Narrative']/../..//textarea)")
	WebElement textCaptureNarrative;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement btnSave;
	
	@FindBy(xpath="//*[text()='Assessments']")
	WebElement assessmentlink;
	
	@FindBy(xpath="//*[text()='Show Actions']")
	WebElement safetyDownArrow;
	
	@FindBy(xpath="(//*[text()='Edit'])[last()]")
	WebElement btnEdit;

	/***
	 * This methods lands on the new safety Assement Page
	 * 
	 * @throws AcisException
	 */

	public void navigatingToNewSafetyAssessmentPage() throws AcisException {

		logger.info("This method will click on the down arrow and navigate it to Safety Assesment Page");
		waitForPageLoadTill(19);
		waitForElement(downArrow);
		try {
			clickWebElement(downArrow);
		} catch (Exception e1) {
			clickWebElemntUsingJavascriptExecutor(downArrow);
		}
		logger.info("Clicked in down arrow");
		waitForPageLoad();
		waitForPageLoadTill(9);
		waitForElementNew(caseAction, 10);
		clickWebElement(caseAction);
		logger.info("clicked on Case Action link");
		driver.navigate().refresh();
		logger.info("Page getting refresh");
		waitForPageLoad();
		waitForElementClickable(selectListView);
		try {
			waitForElementClickable(selectListView);
			clickWebElement(selectListView);
		} catch (Exception e) {
			clickWebElement(selectListView);
		}
		logger.info("Clicked on select list view drop  menu");
		waitForElementNew(myInvestigationList, 7);
		clickWebElement(myInvestigationList);
		logger.info("clicked on My investigation ");
		waitForPageLoadTill(9);
		waitForElement(selectFirstRecord);
		try {
			clickWebElement(selectFirstRecord);
		} catch (AcisException e) {
			clickWebElement(selectFirstRecord);
		}
		logger.info("Clicked on first record");
		waitForPageLoadTill(9);
		waitForElementClickable(relatedTab);
		clickWebElement(relatedTab);
		logger.info("Clicked on related tab");
		waitForPageLoadTill(9);
		waitForElement(newSafetyAssesmentLink);
		clickWebElemntUsingJavascriptExecutor(newSafetyAssesmentLink);
		logger.info("Clicked on New Safety Assesment Link");

		waitForPageLoadTill(24);
		waitForPageLoad();
	}
/***
 * Click on new safety assessment
 * @author akash.a.gaurav
 * @throws AcisException 
 * 
 */
	
	public void clickNewSafetyAssessment() throws AcisException {
		waitForPageLoadTill(9);
		waitForElement(newSafetyAssesmentLink);
		clickWebElemntUsingJavascriptExecutor(newSafetyAssesmentLink);
		waitForPageLoadTill(34);
	}
	/***
	 * This methods Click on the new safety Assement Page
	 * 
	 * @throws AcisException Khushboo
	 */

	public void clickOnNewSafetyAssessmentlink() throws AcisException {
		waitForElement(newSafetyAssesmentLink);
		clickWebElemntUsingJavascriptExecutor(newSafetyAssesmentLink);
		logger.info("Clicked on New Safety Assesment Link");
		waitForPageLoad();
		waitForElement(reviewAlligationReport);
	}
	/***
	 * This methods Click on Safety Assessment Information  from  safety Assessment 
	 * 
	 * @throws AcisException Khushboo
	 */

	public void clickSafetyAssessment() throws AcisException {
		clickWebElemntUsingJavascriptExecutor(downArrowSafetyAssessmentInformation);

	}
	/***
	 * This methods Edit address from  safety Assessment 
	 * 
	 * @throws AcisException Khushboo
	 */

	public void editAddressFromSafetyAssessment(String text) throws AcisException {
		logger.info("Editing Addess of safety Assessment");
	//	clickWebElement(iconbutton);
		waitForPageLoadTill(10);
		waitForPageLoad();
		enterText(txtsteet1, text);
		clickWebElement(txtSaveButton);
		
	}
	/*open safety assessment
	 * @khushboo
	 * 
	 */
	public void editSafetyAssessment() throws AcisException {
		logger.info("open safety Assessment page");
		clickWebElement(assessmentlink);
		waitForPageLoad();
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		clickWebElemntUsingJavascriptExecutor(safetyDownArrow);
		clickWebElemntUsingJavascriptExecutor(btnEdit);
		waitForPageLoadTill(10);
		
		
	}
	/*edit safety assessment 
	 * @khushboo
	 */
public void enterCaptureNarrative(String string) throws AcisException {
	logger.info("fill textarea of capture narrative ");
	Actions act =new Actions(driver);
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	scrollingToElementofAPage(textCaptureNarrative);
	enterText(textCaptureNarrative, string);

}
/*click on save button
 * @khushboo
 * 
 */
public void clickSavebtn() throws AcisException {
	logger.info("clicking on save button");
	clickWebElement(btnSave);
	logger.info("clicked on save button");

	
}
}
