package com.acis.automation.pages.caseplan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewLegalAction_OmniScriptPage extends PageBase {

	public NewLegalAction_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewLegalAction_OmniScriptPage.class);

	@FindBy(xpath = "(//label[text()='Court Action Date/Time']//..//..//..//input)[1]")
	WebElement courtCaseActionDateTime;

	@FindBy(xpath = "(//label[text()='Next Court Action Date/Time']//..//..//..//input)[1]")
	WebElement nextCourtActionDateTime;

	@FindBy(xpath = "//span[text()='Court Case Number']//..//..//..//input")
	WebElement courtCaseNumberText;

	@FindBy(xpath = "//span[text()='Court Action Type']//..//..//..//input")
	WebElement courtActionType;

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
	
	@FindBy(xpath = "(//*[text()='Court Action Type']/../../..//li//*[text()='Court Order'])[last()]")
	WebElement courtActionTypeCourtOrder;
	
	@FindBy(xpath = "(//*[text()='Court Action Type']/../../..//li//*[text()='Emergency Protection Order'])[last()]")
	WebElement courtActionTypeEmergency;

	
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
	
	@FindBy(xpath = "(//label[text()='Court Action Participant']//..//..//input)")
	WebElement courtActionParticipant;

	@FindBy(xpath = "(//label[text()='Court Action Participant']//..//..//input)[1]")
	WebElement courtActionParticipant1;
	
	@FindBy(xpath="//span[contains(normalize-space(),'abvy abc Child')]")
	WebElement firstChild;
	@FindBy(xpath="//span[contains(normalize-space(),'chgnhy abc child')]")
	WebElement secondChild;

	@FindBy(xpath = "//button[text()='Save'][last()]")
	WebElement saveButton;

	@FindBy(xpath = "//div[text()='New Court Action']")
	WebElement btnCourtAction;

	@FindBy(xpath = "//*[text()='Court Action Date/Time']//..//..//input")
	WebElement textCourtActionDate;

	// Khushboo
	@FindBy(xpath = "//span[text()='Court Case Number']//..//..//..//input")
	WebElement textCourtCaseNumber;
	
	@FindBy(xpath="//*[text()='Insights']")
	WebElement tabInsight;
	
	@FindBy(xpath="//*[text()='16']")
	 WebElement selectDate;


	/***
	 * 
	 * 09-09-2020 use this date format while passing the data Selecting date court
	 * action type date must be lesser than nextcourtaction
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void dateTime(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "courtCaseActionDateTime":
			logger.info("Selecting Court Action Date :" + subtypeOption);
			clickWebElement(courtCaseActionDateTime);
			clickWebElement(selectDate);
			logger.info("Selected  Court Case Action Date as :" + subtypeOption);
			break;

		case "NextCourtActipm":
			logger.info("Selecting Court Action Date :" + subtypeOption);
			clickWebElement(nextCourtActionDateTime);
			Actions action = new Actions(driver);
			waitForPageLoadTill(5);
			action.sendKeys(Keys.CONTROL).sendKeys().perform();
			waitForPageLoadTill(2);
			logger.info("Selected  Court Case Action Date as :" + subtypeOption);
			break;

		default:
			logger.info("No Court Action Type");
			break;
		}
	}

	/**
	 * @author akash.a.gaurav
	 * Selecting CourtAction Type
	 * @throws AcisException 
	 */
	public void courtActionType(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "Disposition":
			logger.info("Selecting Court Action Type :"+subtypeOption);
			clickWebElement(courtActionType);
			clickWebElement(courtActionTypeDisposition);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type as :"+subtypeOption);
			break;

		case "Adjudication":
			logger.info("Selecting Court Action Type  :"+subtypeOption);
			clickWebElement(courtActionType);
			clickWebElement(courtActionTypeAdjudication);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type  as :"+subtypeOption);
			break;

		case "PermanencyGoal":
			logger.info("Selecting Court Action Type  :"+subtypeOption);
			clickWebElement(courtActionType);
			clickWebElement(courtActionTypePermanencyGoal);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type  as :"+subtypeOption);
			break;
		case "Court Order":
			logger.info("Selecting Court Action Type  :"+subtypeOption);
			clickWebElement(courtActionType);
			waitForPageLoadTill(2);
			clickWebElement(courtActionTypeCourtOrder);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type  as :"+subtypeOption);
			break;
		case "Emergency":
			logger.info("Selecting Court Action Type  :"+subtypeOption);
			clickWebElement(courtActionType);
			clickWebElement(courtActionTypeEmergency);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type  as :"+subtypeOption);
			break;


		default:
			logger.info("No Court Action Type");
			break;
		}

	}

	/**
	 * @author akash.a.gaurav Selecting Next CourtAction Type
	 * @throws AcisException
	 */
	public void nextcourtActionType(String subtypeOption) throws AcisException {
		Actions act = new Actions(driver);

		switch (subtypeOption) {

		case "Disposition":
			logger.info("Selecting Court Action Type :" + subtypeOption);
			act.sendKeys(Keys.DOWN).build().perform();
			clickWebElement(nextCourtActiondropdown);
			clickWebElement(nextCourtActionDeposition);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type as :" + subtypeOption);
			break;

		case "Adjudication":
			logger.info("Selecting Court Action Type  :" + subtypeOption);
			act.sendKeys(Keys.DOWN).build().perform();
			clickWebElement(nextCourtActiondropdown);
			clickWebElement(nextCourtActionAdjudication);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type  as :" + subtypeOption);
			break;

		case "PermanencyGoal":
			logger.info("Selecting Court Action Type  :" + subtypeOption);
			act.sendKeys(Keys.DOWN).build().perform();
			clickWebElement(nextCourtActiondropdown);
			clickWebElement(nextCourtActionPermanencyGoal);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type  as :" + subtypeOption);
			break;

		case "Court Order":
			logger.info("Selecting Court Action Type  :" + subtypeOption);
			act.sendKeys(Keys.DOWN).build().perform();
			clickWebElement(nextCourtActiondropdown);
			clickWebElement(nextCourtActionCourtOrder);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type  as :" + subtypeOption);
			break;

		case "Emergency":
			logger.info("Selecting Court Action Type  :" + subtypeOption);
			act.sendKeys(Keys.DOWN).build().perform();
			clickWebElement(nextCourtActiondropdown);
			clickWebElement(nextCourtActionEmergencyProtectionOrder);
			waitForPageLoadTill(2);
			logger.info("Selected  Court Action Type  as :" + subtypeOption);
			break;

		default:
			logger.info("No Court Action Type");
			break;
		}

	}

	/**
	 * Selecting court action participant
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void courtActionParticipant(String child) throws AcisException {

		logger.info("Selecting court action participant");
		scrollingToElementofAPage(courtActionParticipant);
		waitForPageLoadTill(9);
		waitForElement(courtActionParticipant1);
		clickWebElement(courtActionParticipant1);
		waitForPageLoadTill(9);
		clickWebElement(courtActionParticipant1);
		switch(child) {
			case"first child":
				clickWebElement(firstChild);
				break;
			case"Second child":
				clickWebElemntUsingJavascriptExecutor(secondChild);
				break;
			default:
				logger.info("no child selected");
		}
		logger.info("Cliked on court action participant");
	}

	/***
	 * Clicking on Saves and navigate
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void saveButton() throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		logger.info("Clicking on next Button");
		clickWebElement(saveButton);
		logger.info("Clicked on next bUTTON");

	}

	/**
	 * click on court action on case head Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickOnCourtAction() throws AcisException {
		//clickWebElement(btnCourtAction);
		waitForPageLoad();
		Actions actions = new Actions(driver);
         actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
         waitForPageLoadTill(5);
         actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
         waitForElementClickable(btnCourtAction);
         scrollingToElementofAPage(btnCourtAction);
		clickWebElemntUsingJavascriptExecutor(btnCourtAction);
		waitForPageLoadTill(5);
		logger.info("clicked on new court button");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(15);
		waitForElement(courtCaseNumberText);
		logger.info("Successfully opened New Legal Action");

	}

	/**
	 * click on court action on case head Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void courtCaseNumber(String textfield) throws AcisException {
		waitForElement(textCourtCaseNumber);
		clickWebElement(textCourtCaseNumber);
		enterText(textCourtCaseNumber,textfield);
	}
	/**
	 * click on Insight tab  action on case head Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickInsightsTab() throws AcisException {
		scrollUpTillPageStart();
		clickWebElement(tabInsight);
		
	}

	/**
	 * Adding the court Action Participant
	 * @author Varun.krish
	 * @throws AcisException 
	 */
	
	public void addCourtActionParticipant(String childname) throws AcisException{
		scrollingToElementofAPage(courtActionParticipant);
		waitForElement(courtActionParticipant);
		clickWebElement(courtActionParticipant);
		waitForPageLoadTill(5);
		System.out.println(childname);
//		  Actions action = new Actions(driver);
//        waitForElement(driver.findElement(By.xpath("(//*[contains(text(),'" + childname + "')])")));
//		clickWebElement(driver.findElement(By.xpath("(//*[contains(text(),'" + childname + "')])")));

		waitForPageLoadTill(10);       
       Actions action = new Actions(driver);
       action.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'" + childname + "')])"))).click().perform();


	
	}

}
