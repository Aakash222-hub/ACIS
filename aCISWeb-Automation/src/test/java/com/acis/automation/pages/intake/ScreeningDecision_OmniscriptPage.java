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

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ScreeningDecision_OmniscriptPage extends PageBase {
	final static Logger logger = LoggerFactory.getLogger(ScreeningDecision_OmniscriptPage.class);

	public ScreeningDecision_OmniscriptPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	public By screeningInsights = By.xpath("//textarea[@id='Factors' and @disabled='disabled']");

	public By insightsLabel = By.xpath("//label[contains(text(),'Insights')]");

	@FindBy(xpath = "//span[text()='Screening Recommendation']/../../..//input")
	WebElement screeningRecommendation;

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

	@FindBy(xpath = "//button[text()='Submit']")
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

	public By errorMessage = By.xpath("//vlocity_ps-omniscript-messaging[@data-omni-key='Messaging7']");

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
		 */ act.moveToElement(screeningRecommendation).click().perform();
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
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		act.moveToElement(newAllegation).click().perform();
		//clickWebElement(newAllegation);
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
		waitForElement(
				driver.findElement(By.xpath("(//span[contains(text(),'" + allegedMaltreator + "')])[last()-1]")));
		clickWebElement(
				driver.findElement(By.xpath("(//span[contains(text(),'" + allegedMaltreator + "')])[last()-1]")));
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
		logger.info("Selecting Accept and Assign from Screening Decision");
		Actions act = new Actions(driver);
		for (int i = 1; i <= 20; i++)
			act.sendKeys(Keys.ARROW_UP).build().perform();
		waitForElement(screeningRecommendationRequired);
		waitForPageLoadTill(5);
		isElementPresent(screeningRecommendationRequiredBy);
		waitForElement(workerCommentsRequired);
		waitForPageLoadTill(5);
		isElementPresent(workerCommentsRequiredBy);
		logger.info("Selected Accept and Assign from Screening Decision");
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

	/*
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

}
