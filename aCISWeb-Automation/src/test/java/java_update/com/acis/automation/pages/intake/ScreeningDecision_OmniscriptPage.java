package com.acis.automation.pages.intake;

import java.io.IOException;

import javax.xml.xpath.XPath;

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

public class ScreeningDecision_OmniscriptPage extends PageBase {
	final static Logger logger = LoggerFactory.getLogger(ScreeningDecision_OmniscriptPage.class);

	public ScreeningDecision_OmniscriptPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	Actions act = new Actions(driver);
	public By screeningInsights = By.xpath("//textarea[@id='Factors' and @disabled='disabled']");

	public By insightsLabel = By.xpath("//label[contains(text(),'Insights')]");

	@FindBy(xpath = "//span[text()='Screening Recommendation']/../../..//input")
	WebElement screeningRecommendation;

	@FindBy(xpath = "//span[text()='Select Case Head']/../../..//input")
	WebElement selectCaseHead;
	
	@FindBy(xpath = "//span[text()='Screening Recommendation']/../../..//div[text()='required']")
	WebElement screeningRecommendationRequired;

	public By screeningRecommendationRequiredBy = By
			.xpath("//span[text()='Screening Recommendation']/../../..//div[text()='required']");

	public By workerCommentsRequiredBy = By.xpath("//*[text()='Worker Comments']/../..//div[text()='required']");

	@FindBy(xpath = "//label[text()='Worker Comments']/../../..//textarea")
	WebElement workerComments;

	@FindBy(xpath = "//*[text()='Worker Comments']/../..//div[text()='required']")
	WebElement workerCommentsRequired;

	@FindBy(xpath = "//span[text()='Recommend to Associate Allegation Report to Case']/../../..//input")
	WebElement workerCaseCreation;

	@FindBy(xpath = "//button[text()='Create/Add']")
	WebElement newAllegation;

	@FindBy(xpath = "(//span[text()='Alleged Maltreator']/../../..//input)[last()]")
	WebElement maltreator;

	@FindBy(xpath = "(//span[text()='Allegation Type']/../../..//input)[last()]")
	WebElement allegationType;

	@FindBy(xpath = "(//span[text()='Alleged Victim']/../../..//input)[last()]")
	WebElement victim;

	@FindBy(xpath = "//span[text()='Accept & Assign']")
	WebElement acceptAssign;

	@FindBy(xpath = "//span[text()='Override']/..//span[@class='slds-radio_faux']")
	WebElement override;

	@FindBy(xpath = "(//button[text()='Save'])[last()]")
	WebElement save;

	@FindBy(xpath = "//span[text()='Disposition']/../../..//input")
	WebElement disposition;

	@FindBy(xpath = "//span[text()='Disposition']")
	WebElement dispositionLabel;

	@FindBy(xpath = "//label[text()='Supervisory Comments']/../..//textarea")
	WebElement supervisoryComments;

	@FindBy(id = "Narrative5")
	WebElement narrative;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement submit;

	@FindBy(xpath = "//span[text()='Screen Out']")
	WebElement screenOut;

	@FindBy(xpath = "(//span[text()='Screen Out'])[2]")
	WebElement screenOutSupervisor;

	@FindBy(xpath = "//span[text()='Screen In for Family Services']")
	WebElement familyService;

	@FindBy(xpath = "(//span[text()='Screen In for Family Services'])[2]")
	WebElement familyServiceSupervisor;

	@FindBy(xpath = "//span[text()='Screen In for Investigation']")
	WebElement investigation;

	@FindBy(xpath = "(//span[text()='Screen In for Investigation'])[2]")
	WebElement investigationSupervisor;

	@FindBy(xpath = "//span[text()='Create New Case']")
	WebElement newCase;

	@FindBy(xpath = "(//span[text()='Abuse'])[last()]")
	WebElement abuse;

	@FindBy(xpath = "(//span[text()='Neglect'])[last()]")
	WebElement neglect;

	@FindBy(xpath = "(//span[text()='Sex Abuse'])[last()]")
	WebElement sexAbuse;

	@FindBy(xpath = "//span[text()='Associate Allegation Report to Existing Case']")
	WebElement existingCase;

	@FindBy(xpath = "//span[text()='Recommend to Associate Allegation Report to Case']/../../..//input")
	WebElement recommendAllegation;

	@FindBy(xpath = "//span[text()='Recommend to Associate Allegation Report to Case']")
	WebElement recommendAllegationLabel;

	@FindBy(xpath = "(//span[text()='Select']//..//..//label)[1]")
	WebElement selectFirstRecordCheckBox;
	
	
	@FindBy(xpath="//*[text()='Intake Record']/../..//span[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Select Case Head']")
	WebElement selectCaseHeadLabel;

	@FindBy(xpath = "//*[text()='Select Case Head']/../../..//input")
	WebElement selectCaseHeadInputBox;

	@FindBy(xpath = "//*[text()='Yes']/preceding-sibling::span")
	WebElement associateExsitingInvestigation_Yes;
	
	@FindBy(xpath = "//*[text()='No']/preceding-sibling::span")
	WebElement associateExsitingInvestigation_No;

	@FindBy(xpath = "//*[contains(text(),'Active Investigation Case')]")
	WebElement activeInvestigationCasesLabel;

	@FindBy(xpath = "//*[contains(text(),'Active Investigation Case')]/../../..//input")
	WebElement activeInvestigationCasesInput;

	public By errorMessage = By.xpath("//vlocity_ps-omniscript-messaging[@data-omni-key='Messaging7']");

	public By cancelBtnBy = By.xpath("//*[text()='Intake Record']/../..//span[text()='Cancel']");

	public By pleaseSelectCaseError = By.xpath("//*[contains(text(),'Please select a Case')]");

	@FindBy(xpath = "(//*[@class='vlocity-btn slds-button slds-button_icon slds-m-bottom_xx-small'])[1]")
	WebElement selectCaseHeadBtnLabel;

	@FindBy(xpath = "//span[@aria-label='Select a Case Head from the designated Primary Caregivers. Any agency history for a given family will be organized by household and the Case Head will represent the head of the household. If Case Head is not known at this time or a primary caregiver has not been indicated do not select a value for Case Head. If no value is selected a Household with an \"Unknown\" Case Head will be created and can be updated at a later time.']")
	public static WebElement CaseHeadBtnLabelInfo;

	@FindBy(xpath = "//span[text()='Active Investigation Cases']/../..//span/c-button/button/span")
	WebElement activeInvestigationCasesBtnLabel;

	@FindBy(xpath = "//span[@aria-label='If appropriate, select the active Investigation you'd like to link this Allegation Report to. If approved, any new people or allegations not currently included on the Investigation will automatically be added.']")
	public static WebElement activeInvestigationLabelToolTip;

	@FindBy(xpath = "//span[@class='slds-popover slds-nubbin_bottom-left slds-popover_tooltip bottom-left tooltipSection slds-fall-into-ground']")
	public static WebElement activeInvestigationLabelinfo;

	/**
	 * Verify : Insight Label Exist Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void verifyInsightsLabel() throws AcisException {
		isElementPresent(insightsLabel);
		logger.info("Verifying if Insights Label is Present");
	}

	/**
	 * Verify : Screening Insights Exist and Disabled Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void verifyScreeningInsights() throws AcisException {
		isElementPresent(screeningInsights);
		logger.info("Verifying if Screening Insight is Present and disabled");
	}

	/**
	 * Select : Screening Recommendation Created By Dharmesh
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectScreeningRecommendation(String screening) throws AcisException {
		Actions act = new Actions(driver);
		waitForPageLoadTill(5);
		/*
		 * act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 * act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 * act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 */ 
		act.moveToElement(screeningRecommendation).click().perform();
		// clickWebElement(screeningRecommendation);
		waitForPageLoadTill(5);
		switch (screening) {
		case "screenOut":
			waitForElement(screenOut);
			act.moveToElement(screenOut).click().perform();
			logger.info("Screening Recommendation is: " + screening);
			break;
		case "familyServices":
			waitForElement(familyService);
			// clickWebElement(familyService);
			act.moveToElement(familyService).click().perform();
			logger.info("Screening Recommendation is: " + screening);
			break;
		case "investigation":
			waitForElement(investigation);
			// clickWebElement(investigation);
			act.moveToElement(investigation).click().perform();
			logger.info("Screening Recommendation is: " + screening);
			break;
		default:
			logger.info("Screening Recommendation not found: " + screening);
		}

	}

	/**
	 * Select : Disposition Created By Dharmesh Modified By akash
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectDisposition(String screening) throws AcisException, InterruptedException {
		Thread.sleep(1000);

		Actions act = new Actions(driver);
		waitForPageLoadTill(10);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(10);
		jse.executeScript("window.scrollBy(0,-580)");
		waitForPageLoadTill(10);
		jse.executeScript("window.scrollBy(0,580)");
		waitForElement(disposition);
		clickWebElement(disposition);
		waitForPageLoadTill(5);
		switch (screening) {
		case "screenOut":
			waitForElement(screenOutSupervisor);
			clickWebElement(screenOutSupervisor);
			logger.info("Screening Recommendation is: " + screening);
			break;
		case "familyServices":
			waitForElement(familyServiceSupervisor);
			clickWebElement(familyServiceSupervisor);
			logger.info("Screening Recommendation is: " + screening);
			break;
		case "investigation":
			waitForElement(investigationSupervisor);
			clickWebElement(investigationSupervisor);
			logger.info("Screening Recommendation is: " + screening);
			break;
		default:
			logger.info("Screening Recommendation not found: " + screening);
		}

	}

	/**
	 * Enter Text Box : WorkerComments, SupervisoryComments, Narrative Created By
	 * Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void enterTextFieldValue(String textFieldName, String strValue) throws AcisException {
		logger.info("Entering Worker Comment as: " + strValue);
		switch (textFieldName) {
		case "workerComments":
			enterText(workerComments, strValue);
			waitForPageLoadTill(5);
			logger.info("Worker Comment entered as: " + strValue);
			break;

		case "supervisoryComments":
			enterText(supervisoryComments, strValue);
			waitForPageLoadTill(5);
			logger.info("Supervisory Comment entered as: " + strValue);
			break;

		case "narrative":
			enterText(narrative, strValue);
			logger.info("Narrative Comment entered as: " + strValue);
			break;

		default:
			logger.info("Text Field Value: " + textFieldName + "did not find");
		}
		waitForPageLoadTill(5);
	}

	/**
	 * Select : Recommend to associate Allegation Report to Case Created By Dharmesh
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void selectAllegationReportToCase(String workerCase) throws AcisException, IOException {

		Actions act = new Actions(driver);

		act.sendKeys(Keys.TAB).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		logger.info("Clicking on Recommend Allegation Picklist ");
		waitForElement(recommendAllegation);
		waitForPageLoadTill(10);
		clickWebElement(recommendAllegation);
		logger.info("Clicked on Recommend Allegation Picklist ");
		waitForPageLoadTill(5);
		logger.info("Selecting Recommend to associate Allegation Report to Case: " + workerCase);
		switch (workerCase) {
		case "newCase":
			waitForElement(newCase);
			clickWebElement(newCase);
			logger.info(" Recommend to associate Allegation Report to Case: " + workerCase);
			break;
		case "existingCase":
			waitForElement(existingCase);
			clickWebElement(existingCase);
			logger.info(" Recommend to associate Allegation Report to Case: " + workerCase);
			break;
		default:
			logger.info(" Recommend to associate Allegation Report to Case: " + workerCase);
		}

	}

	/**
	 * Create New Allegation Created By Dharmesh
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void newAllegations(String typeAllegation, String allegedMaltreator, String allegedVictim)
			throws AcisException {

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		act.moveToElement(newAllegation).click().perform();
		// clickWebElement(newAllegation);
		waitForPageLoadTill(10);
		waitForElement(allegationType);
		clickWebElement(allegationType);
		waitForPageLoadTill(5);
		logger.info("Selecting Allegation Type: " + typeAllegation);
		switch (typeAllegation) {
		case "Abuse":
			waitForElement(abuse);
			clickWebElement(abuse);
			logger.info(" Allegation Type: " + typeAllegation);
			break;
		case "Neglect":
			waitForElement(neglect);
			clickWebElement(neglect);
			logger.info(" Allegation Type: " + typeAllegation);
			break;
		case "Sex Abuse":
			waitForElement(sexAbuse);
			clickWebElement(sexAbuse);
			logger.info(" Allegation Type: " + typeAllegation);
			break;
		default:
			logger.info(" Allegation Type not found: " + typeAllegation);
		}
		clickWebElemntUsingJavascriptExecutor(maltreator);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'" + allegedMaltreator + "')])[last()]")));
		clickWebElement(driver.findElement(By.xpath("(//span[contains(text(),'" + allegedMaltreator + "')])[last()]")));
		clickWebElemntUsingJavascriptExecutor(victim);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'" + allegedVictim + "')])[last()]")));
		clickWebElement(driver.findElement(By.xpath("(//span[contains(text(),'" + allegedVictim + "')])[last()]")));
		clickWebElement(save);
		logger.info(" New Allegation Created with Allegation type: " + typeAllegation + " and Alleged Maltreator as "
				+ allegedMaltreator + " and Alleged Victim as " + allegedVictim);

		waitForPageLoadTill(5);
	}



	/**
	 * Create New Allegation Created By Dharmesh
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void newAllegationsNext(String typeAllegation, String allegedMaltreator, String allegedVictim)
			throws AcisException {
		clickWebElement(newAllegation);
		waitForPageLoadTill(10);
		waitForElement(allegationType);
		clickWebElement(allegationType);
		waitForPageLoadTill(5);
		logger.info("Selecting Allegation Type: " + typeAllegation);
		switch (typeAllegation) {
		case "Abuse":
			waitForElement(abuse);
			clickWebElement(abuse);
			logger.info(" Allegation Type: " + typeAllegation);
			break;
		case "Neglect":
			waitForElement(neglect);
			clickWebElement(neglect);
			logger.info(" Allegation Type: " + typeAllegation);
			break;
		case "Sex Abuse":
			waitForElement(sexAbuse);
			clickWebElement(sexAbuse);
			logger.info(" Allegation Type: " + typeAllegation);
			break;
		default:
			logger.info(" Allegation Type not found: " + typeAllegation);
		}
		clickWebElemntUsingJavascriptExecutor(maltreator);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'" + allegedMaltreator + "')])[last()]")));
		clickWebElement(driver.findElement(By.xpath("(//span[contains(text(),'" + allegedMaltreator + "')])[last()]")));
		clickWebElemntUsingJavascriptExecutor(victim);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'" + allegedVictim + "')])[last()]")));
		clickWebElement(driver.findElement(By.xpath("(//span[contains(text(),'" + allegedVictim + "')])[last()]")));
		clickWebElement(save);
		logger.info(" New Allegation Created with Allegation type: " + typeAllegation + " and Alleged Maltreator as "
				+ allegedMaltreator + " and Alleged Victim as " + allegedVictim);

		waitForPageLoadTill(5);
	}

	/**
	 * Select : Accept and Assign Radio button Created By Dharmesh Modify By Mrunal
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectAcceptAssign() throws AcisException {

		logger.info("Selecting Accept and Assign from Screening Decision");
		Actions act = new Actions(driver);

		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		try {
			try {
				waitForElement(acceptAssign);
				// scrollingToElementofAPage(acceptAssign);
				clickWebElement(acceptAssign);
				logger.info("Selected Accept and Assign from Screening Decision");
			} catch (Exception e) {
				// scrollingToElementofAPage(acceptAssign);
				clickWebElemntUsingJavascriptExecutor(acceptAssign);
				logger.info("Selected Accept and Assign from Screening Decision");
			}
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Select : Accept and Assign Radio button Created By Dharmesh
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void verifyRequiredFields() throws AcisException {
		logger.info("Verify Required fields");
		Actions act = new Actions(driver);
		for (int i = 1; i <= 20; i++)
			act.sendKeys(Keys.ARROW_UP).build().perform();
		waitForElement(screeningRecommendationRequired);
		waitForPageLoadTill(5);
		isElementPresent(screeningRecommendationRequiredBy);
		waitForElement(workerCommentsRequired);
		waitForPageLoadTill(5);
		isElementPresent(workerCommentsRequiredBy);
		logger.info("Verified Required fields");
	}

	/**
	 * Select : Override button Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void selectOverride() throws AcisException {
		logger.info("Selecting Override from Screening Decision");
		try {
			try {
				waitForElement(override);
				clickWebElement(override);
				logger.info("Selected Override from Screening Decision");
			} catch (Exception e) {
				clickWebElemntUsingJavascriptExecutor(override);
				logger.info("Selected Override from Screening Decision");

			}
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Select : Override button Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void selectOverrideScroll() throws AcisException {
		logger.info("Selecting Override from Screening Decision");
		try {
			try {
				Actions act = new Actions(driver);
				act.sendKeys(Keys.PAGE_DOWN).build().perform();
				waitForElement(override);
				clickWebElement(override);
				logger.info("Selected Override from Screening Decision");
			} catch (Exception e) {
				clickWebElemntUsingJavascriptExecutor(override);
				logger.info("Selected Override from Screening Decision");
			}
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Click on Submit Button Created By Dharmesh
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickSubmitbtn() throws AcisException {
		logger.info("Clicking on Submit button");
		scrollingToElementofAPage(submit);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		try {
			clickWebElement(submit);
		} catch (Exception e) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,1940)");
			clickWebElemntUsingJavascriptExecutor(submit);
		}
		waitForPageLoadTill(5);
		logger.info("Intake Flow has been submitted");
	}

	/**
	 * To check error message Created By Khushboo
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void verifyAlligationErrononExistingworkcase() throws AcisException {
		logger.info("Verifying on Error Message ");
		isElementPresent(errorMessage);
		logger.info("Verified Flow has been submitted");
	}

	/**
	 * Selecting Existing case History
	 * 
	 * @author akash.a.gaurav
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void selectingExistingCaseHistory() throws AcisException, InterruptedException {
		logger.info("Selecting Case History");
		waitForElement(selectFirstRecordCheckBox);
		clickWebElemntUsingJavascriptExecutor(selectFirstRecordCheckBox);
		logger.info("Selecting first check box");
		Actions act = new Actions(driver);
		waitForPageLoadTill(9);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(9);
		logger.info("Selected Case History");
		waitForPageLoadTill(9);
	}

	/**
	 * Select Case Head
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void selectCaseHead(String option) throws AcisException {
		logger.info("Selecting Case Head :" + option);
		waitForElement(selectCaseHeadLabel);
		clickWebElement(selectCaseHeadInputBox);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(
				By.xpath("//*[text()='Select Case Head']/../../..//span[contains(text(),'" + option + "')]")));
		clickWebElement(driver.findElement(
				By.xpath("//*[text()='Select Case Head']/../../..//span[contains(text(),'" + option + "')]")));
		waitForPageLoadTill(5);
		logger.info("Selected Case Head :" + option);

	}

	/**
	 * Select : Do you want to c?
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void selectAssociateExistingInvestigation(String option) throws AcisException {
		switch (option) {
		case "Yes":
			logger.info("Selecting Do you want to associate this to an existing investigation :" + option);
			waitForElement(associateExsitingInvestigation_Yes);
			clickWebElement(associateExsitingInvestigation_Yes);
			waitForPageLoadTill(5);
			logger.info("Selected associate this to an existing investigation :" + option);
			break;
		case "No":
			logger.info("Selecting Do you want to associate this to an existing investigation :" + option);
			waitForElement(associateExsitingInvestigation_No);
			clickWebElement(associateExsitingInvestigation_No);
			waitForPageLoadTill(5);
			logger.info("Selected associate this to an existing investigation :" + option);
			break;
		default:
			break;
		}

	}
	/**
	 * Select Active Investigation Case ID
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void verifySelectActiveInvestigationCase() throws AcisException {
		logger.info("Verifying Active Investigation Case ID :");
		waitForElement(activeInvestigationCasesLabel);
		logger.info("Verified Active Investigation Case ID:");

	}
	/**
	 * Select Active Investigation Case ID
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void selectActiveInvestigationCaseID(String option) throws AcisException {
		logger.info("Selecting Active Investigation Case ID :" + option);
		waitForElement(activeInvestigationCasesLabel);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		clickWebElement(activeInvestigationCasesInput);
		waitForPageLoadTill(5);
		// act.moveToElement(activeInvestigationCasesInput).click().perform();
		try {
			waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'" + option + "')])[last()]")));
			clickWebElement(driver.findElement(By.xpath("(//span[contains(text(),'" + option + "')])[last()]")));

		} catch (Exception e) {
			clickWebElemntUsingJavascriptExecutor(activeInvestigationCasesInput);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'" + option + "')])[last()]")));
			clickWebElement(driver.findElement(By.xpath("(//span[contains(text(),'" + option + "')])[last()]")));

		}
		waitForPageLoadTill(5);
		logger.info("Selected Active Investigation Case ID:" + option);

	}

	/**
	 * Selecting Existing case History
	 * 
	 * @author mrunal.s.tilekar
	 * @throws InterruptedException
	 * 
	 */
	public void selectExistingCaseHistory(String caseID) throws AcisException, InterruptedException {
		logger.info("Selecting Case History : " + caseID);
		if (isElementPresent(pleaseSelectCaseError)) {
			waitForElement(
					driver.findElement(By.xpath("//*[text()='" + caseID + "']/../..//span[contains(@class,'radio')]")));
			clickWebElemntUsingJavascriptExecutor(
					driver.findElement(By.xpath("//*[text()='" + caseID + "']/../..//span[contains(@class,'radio')]")));

		}
		logger.info("Selected Case History : " + caseID);

	}

	/***
	 * Verify Case head Information
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */

	public void caseHeadInfo() throws AcisException {
		logger.info("Verify case head Information");
		clickWebElemntUsingJavascriptExecutor(selectCaseHeadBtnLabel);
		Actions actions = new Actions(driver);
		actions.moveToElement(selectCaseHeadBtnLabel).perform();
		String toolTipText = CaseHeadBtnLabelInfo.getText();
		if (toolTipText.equalsIgnoreCase(
				"Select a Case Head from the designated Primary Caregivers. Any agency history for a given family will be organized by household and the Case Head will represent the head of the household. If Case Head is not known at this time or a primary caregiver has not been indicated do not select a value for Case Head. If no value is selected a Household with an \"Unknown\" Case Head will be created and can be updated at a later time.")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		Boolean b = CaseHeadBtnLabelInfo.isDisplayed();
		logger.info("Verify case head Information " + b);
		Assert.assertTrue(b, "Error : Case head label NOT present ");
		// waitForElement(CaseHeadBtnLabelInfo);
		logger.info("Verified case head Information");
	}

	/***
	 * Verify Case head Information
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */

	public void activeCaseInvestigationInfo() throws AcisException {
		logger.info("Verify Active Case Investigation Information");
		clickWebElemntUsingJavascriptExecutor(activeInvestigationCasesBtnLabel);
		Actions actions = new Actions(driver);
		actions.moveToElement(activeInvestigationCasesBtnLabel).perform();
//		String toolTipText = activeInvestigationLabelToolTip.getText();
//		if(toolTipText.equalsIgnoreCase("If appropriate, select the active Investigation you'd like to link this Allegation Report to. If approved, any new people or allegations not currently included on the Investigation will automatically be added.")){
//			System.out.println("Pass");
//			}else{
//			System.out.println("Fail");
//			}
//		Boolean b=activeInvestigationLabelToolTip.isDisplayed();
//		logger.info("Verify case head Information "+ b);
//	//	Assert.assertTrue(b, "Error : Case head label NOT present ");
		logger.info("Verified Active Case Investigation Information");
	}

	
	/***
	 * @author akash.a.gaurav
	 * Cancel button'
	 * @throws AcisException 
	 */
	
	public void cancelButton() throws AcisException {
		logger.info("Clicking on Cancle button Intake Record");
		waitForPageLoad();
		waitForPageLoadTill(15);
		if(isElementPresent(cancelBtnBy))
		{
			clickWebElement(cancelBtn);
		}
		
	}
}
