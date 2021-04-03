package com.acis.automation.pages.investigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class Findings_OmniScriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(Findings_OmniScriptPage.class);

	public Findings_OmniScriptPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//label[text()='Worker Summary']/../..//textarea")
	WebElement textareaWorkerSummary;

	@FindBy(xpath = "//span[text()='Accept & Assign']")
	WebElement radiobuttonacceptandassign;

	@FindBy(xpath = "//span[text()='Override']")
	WebElement radiobuttonoverride;

	@FindBy(xpath = "//label[text()=\"Supervisory Comments\"]/../..//textarea")
	WebElement textareasupervisorycomments;

	@FindBy(xpath = "//p[text()='Please complete the following before submitting: Disposition']")
	WebElement errormessagedeposition;

	@FindBy(xpath = "//*[text()='Submit']")
	WebElement btnsubmit;

	@FindBy(xpath = "//button//span[text()='Previous']")
	WebElement btnprevious;

	@FindBy(xpath = "//button[text()=\'Save for later\']")
	WebElement buttonsaveforlater;

	@FindBy(xpath = "//table/tbody/tr/td[@data-label='INTERACTIONS ID']/../..//td[3]//lightning-base-formatted-text")
	WebElement interactioninterview;

	@FindBy(xpath = "//*[text()='show Details']")
	WebElement showdetails;

	@FindBy(xpath = "//input[@id ='checkbox-615]")
	WebElement checkedscheduledbox;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement buttonsave;

	@FindBy(xpath = "//span[text()='Save for later']")
	WebElement saveForLater;

	@FindBy(xpath = "//button[text()='OK']")
	WebElement ok;

	@FindBy(xpath = "//span[text()='Your OmniScript is saved for later']")
	WebElement saveForLaterWait;

	public By saveForLaterVerify = By.xpath("//span[text()='Your OmniScript is saved for later']");

	@FindBy(xpath = "//tbody//td[@data-label='INTERACTIONS ID']/../..//button")
	WebElement interactionFindingsDownWardlink;

	@FindBy(xpath = "//label[text()='Narrative']/..//textarea")
	WebElement editnarrative;

	@FindBy(xpath = "//tbody//td[@data-label='ASSESSMENT ID']/../../tr//button")
	WebElement safetyAssesmentFindingsDownWardlink;

	@FindBy(xpath = "//label[text()='Assessment ID']/..//input")
	WebElement txtassessmentId;

	@FindBy(xpath = "//span[text()='Edit Capture Professional Opinion']")
	WebElement editcaptureprofessional;

	@FindBy(xpath = "//span[text()='Edit Capture Professional Opinion']/../..//lightning-formatted-text")
	WebElement fetcheditedcaptureprofessional;

	@FindBy(xpath = "//*[@title='required']/../../..//input")
	WebElement dispositionAllegations;

	@FindBy(xpath = "(//span[text()='Substantiated'])[last()]")
	WebElement Substantiated;

	@FindBy(xpath = "(//span[text()='Unsubstantiated'])[last()]")
	WebElement Unsubstantiated;

	@FindBy(xpath = "(//span[text()='Rulled Out'])[last()]")
	WebElement rulledOut;
	
	@FindBy(xpath = "(//a[text()='Details'])[2]")
	WebElement details;
	
	@FindBy(xpath = "(//button[text()='Edit'])[2]")
	WebElement editinvestigation;
	
	@FindBy(xpath="//input[@name='ACIS_Date_Due__c']")
	WebElement editDueDate;

	@FindBy(xpath = "//span[text()='Edit']")
	WebElement edit;
	
	@FindBy(xpath = "//*[text()='Interactions']")
	WebElement interactions;
	
	@FindBy(xpath = "//*[text()='INTERACTIONS ID']")
	WebElement interactionsID;
	
	//Pallavi
	
	@FindBy(xpath = "//tbody//td[@data-label='PERSON']/../../tr//button")
	WebElement recordReviewFindingsDownwardLinks;
		
	@FindBy(xpath="//lightning-primitive-cell-factory[@data-label='PERSON']")
	WebElement recordReviewPerson;
	
	public By safetyAssessmentVerify = By.xpath("//p[contains(text(),'Please complete the following before submitting: Safety Assessment')]");
	
	public By interactionsVerify = By.xpath("//p[contains(text(),'Please complete the following before submitting: Interactions')]");
	
	public By recordReviewVerify = By.xpath("//p[contains(text(),'Please complete the following before submitting: Record Review')]");
	
	public By dispositionVerify = By.xpath("//p[contains(text(),'Please complete the following before submitting: Disposition')]");
	
	
	/**
	 * text area of worker summary Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void txtWorkerSummary() throws AcisException {
		enterText(textareaWorkerSummary, "Testing purpose");
		logger.info("filled textarea of worker summary ");
	}

	/**
	 * verified deposition error message Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void verifyerrordeposition() throws AcisException {

		waitForElement(errormessagedeposition);
		logger.info("filled textarea of worker summary ");
	}

	/**
	 * Click on radio buttons Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickonDepositionsradiobutton(String type) throws AcisException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		if (type == "Accept &Assign") {
			clickWebElement(radiobuttonacceptandassign);
			logger.info("Clicked on acceptance and assign");
		} else {
			clickWebElement(radiobuttonoverride);
			logger.info("Clicked on override ");
		}

	}

	/**
	 * text area of Summary Comments Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void txtSupervisoryComments() throws AcisException {
		enterText(textareasupervisorycomments, "");
		logger.info("filled textarea of Summary Comments ");
	}

	/**
	 * click on submit button Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickonSubmitButton() throws AcisException {
		logger.info("Clicking on Submit Button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		clickWebElemntUsingJavascriptExecutor(btnsubmit);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on Submit Button");
	}

	/**
	 * click on Previous button Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickonPreviousButton() throws AcisException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		clickWebElement(btnprevious);
		logger.info("Clicked on Previous Button");
	}

	/**
	 * click on Save for later button Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickOnSaveForLater() throws AcisException {
		logger.info("Clicking on Save For Later");
		scrollingToElementofAPage(saveForLater);
		clickWebElement(saveForLater);
		waitForPageLoadTill(5);
		logger.info("Clicked on Save For Later");
		logger.info("Clicking on Ok");
		waitForElement(ok);
		clickWebElement(ok);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Ok");

	}

	/**
	 * Verify on Save for later completed Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void verifySaveForLater() throws AcisException {
		logger.info("Verifying Save For Later Successful");
		waitForElement(saveForLaterWait);
		isElementPresent(saveForLaterVerify);
		logger.info("Verifed Save For Later Successful");
	}

	/**
	 * Verify on Errors on Findings Page  
	 * Created By Dharmesh
	 * @throws AcisException
	 */
	public void verifyErrorMessages() throws AcisException {
		logger.info("Verifying Error messages on Findings Page");
		isElementPresent(safetyAssessmentVerify);
		isElementPresent(interactionsVerify);
		isElementPresent(recordReviewVerify);
		isElementPresent(dispositionVerify);
		logger.info("Verifed Error messages on Findings Page");
	}
	
	/**
	 * verify interview contact records Created By Khushboo
	 * 
	 * @throws AcisException
	 */

	public void verifyInterviewContactRecords() throws AcisException {
		String interviewrecordtest = interactioninterview.getText();
		if (interviewrecordtest == "Visit " || interviewrecordtest == "Collateral") {
			logger.info("Verified on Interview and Collateral record as visit ");

		}
	}

	/**
	 * verify interview contact records Created By Khushboo
	 * 
	 * @throws AcisException
	 */

	public void editInterviewRecord() throws AcisException {
		clickWebElement(interactionFindingsDownWardlink);
		clickWebElement(showdetails);
		enterText(editnarrative, "editing");
		clickWebElement(buttonsave);
		logger.info("the edited narrative is " + editnarrative.getText());
	}

	/**
	 * Review safety assessment records of findings Created By Khushboo
	 * 
	 * @throws AcisException
	 */

	public void reviewSafteyAssessment() throws AcisException {
		clickWebElement(safetyAssesmentFindingsDownWardlink);
		clickWebElement(showdetails);
		String textassessmentid = txtassessmentId.getText();
		logger.info("Assessment id " + textassessmentid);
		clickWebElement(editcaptureprofessional);
		editcaptureprofessional.clear();
		enterText(editcaptureprofessional, "Editing");
		clickWebElement(buttonsave);
		String texteditedcaptureprofessional = fetcheditedcaptureprofessional.getText();
		logger.info("edited text is :" + texteditedcaptureprofessional);

	}

	/**
	 * Add Allegation to Investigation Finding Page
	 * Created by Dharmesh
	 * @throws AcisException
	 */

	public void addAllegation(String screening,String person) throws AcisException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForElementClickable(driver.findElement(By.xpath("//div[contains(text(),'"+person+"')]/../..//button[@type='button']")));
		clickWebElement(driver.findElement(By.xpath("//div[contains(text(),'"+person+"')]/../..//button[@type='button']")));
		waitForElementClickable(edit);
		clickWebElement(edit);
		logger.info("Clicked on Edit Button");
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicking Disposition");
		waitForElement(dispositionAllegations);
		clickWebElement(dispositionAllegations);
		logger.info("Clicked Disposition");
		waitForPageLoadTill(5);
		switch (screening) {
		case "Substantiated":
			scrollingToElementofAPage(Substantiated);
			waitForElement(Substantiated);
			clickWebElement(Substantiated);
			logger.info("Screening Recommendation is: " + screening);
			break;
		case "Unsubstantiated":
			scrollingToElementofAPage(Unsubstantiated);
			waitForElement(Unsubstantiated);
			clickWebElement(Unsubstantiated);
			logger.info("Screening Recommendation is: " + screening);
			break;
		case "Ruled Out":
			scrollingToElementofAPage(rulledOut);
			waitForElement(rulledOut);
			clickWebElement(rulledOut);
			logger.info("Screening Recommendation is: " + screening);
			break;
		default:
			logger.info("Screening Recommendation not found: " + screening);
		}
		clickWebElement(buttonsave);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Save Button");

	}

/**
	 * Review Allegation records of findings Created By Khushboo
	 * 
	 * @throws AcisException
	 */

	public void reviewAllegation(String screening) throws AcisException {
		// clickWebElement(safetyAssesmentFindingsDownWardlink);
		clickWebElement(showdetails);
		waitForPageLoadTill(10);
		clickWebElement(dispositionAllegations);
		waitForPageLoadTill(5);
		switch (screening) {
		case "Substantiated":
			waitForElement(Substantiated);
			clickWebElement(Substantiated);
			logger.info("Screening Recommendation is: " + screening);
			break;
		case "Unsubstantiated":
			waitForElement(Unsubstantiated);
			clickWebElement(Unsubstantiated);
			logger.info("Screening Recommendation is: " + screening);
			break;
		case "Ruled Out":
			waitForElement(rulledOut);
			clickWebElement(rulledOut);
			logger.info("Screening Recommendation is: " + screening);
			break;
		default:
			logger.info("Screening Recommendation not found: " + screening);
		}

	}
	public void clickDetailsTab() throws AcisException, InterruptedException {
		logger.info(" Clicking on Details Tab");
		waitForPageLoadTill(10);
		waitForElement(details);
		clickWebElement(details);
		logger.info(" Opened Details Tab");
	}
	
	public void clickEditButton() throws AcisException {

		logger.info("clicking on edit button on case Person");
		clickWebElement(editinvestigation);
		waitForPageLoadTill(5);
	//	waitForElement(editCasePersonTitle);
		logger.info("clicking on edit button on case Person");
	}

	public void setDate() throws AcisException, InterruptedException{
				logger.info("Selecting Issued Date succesfully");
				clickWebElemntUsingJavascriptExecutor(editDueDate);
				enterText(editDueDate, "11/7/2020");
				logger.info("Issued Date succesfully selected");
	
}

	/**
	 * Verify Interactions Label on Findings Page Created By Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */

	public void verifyInterationsLabel() throws AcisException {
		logger.info("Verifying Interactions Label on Findings Omniscript Page");
		waitForElement(interactions);
		waitForElement(interactionsID);
		logger.info("Verified Interactions Label on Findings Omniscript Page");

	}
	
	/*** verify record review
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	
	public void verifyRecordReview() throws AcisException {
		logger.info("Verifying Record Review Label on Findings Omniscript Page");
		waitForElement(recordReviewPerson);
		logger.info("Verified Record Review Label on Findings Omniscript Page");
	}
	
}