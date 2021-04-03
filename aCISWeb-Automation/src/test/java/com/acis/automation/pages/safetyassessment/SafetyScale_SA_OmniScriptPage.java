package com.acis.automation.pages.safetyassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;


public class SafetyScale_SA_OmniScriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(SafetyScale_SA_OmniScriptPage.class);

	public SafetyScale_SA_OmniScriptPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//button[text()='Create/Add']")
	WebElement createAddButton;
	
	@FindBy(xpath = "//span[text()='Is any child four years old or younger or otherwise unable to protect him/herself?']/../../..//input")
	WebElement unableDefend;
	
	@FindBy(xpath = "//span[text()='Is any child four years old or younger or otherwise unable to protect him/herself?']/../../..//span[text()='Yes']")
	WebElement unableDefendYes;

	@FindBy(xpath = "//span[text()='Is any child four years old or younger or otherwise unable to protect him/herself?']/../../..//span[text()='No']")
	WebElement unableDefendNo;
	
	@FindBy(xpath = "//span[text()='Is any child four years old or younger or otherwise unable to protect him/herself?']/../../..//span[text()='Unknown']")
	WebElement unableDefendUnknown;
	
	@FindBy(xpath = "//span[text()='Is any child four years old or younger or otherwise unable to protect him/herself?']/../../..//span[text()='--Clear--']")
	WebElement unableDefendClear;



	@FindBy(xpath = "//span[text()='Does any caregiver have a history of drug or alcohol abuse?']/../../..//input")
	WebElement drugsAlcohol;
	
	@FindBy(xpath = "//span[text()='Does any caregiver have a history of drug or alcohol abuse?']/../../..//span[text()='Yes']")
	WebElement drugsAlcoholYes;
	
	@FindBy(xpath = "//span[text()='Does any caregiver have a history of drug or alcohol abuse?']/../../..//span[text()='No']")
	WebElement drugsAlcoholNo;
	
	@FindBy(xpath = "//span[text()='Does any caregiver have a history of drug or alcohol abuse?']/../../..//span[text()='Unknown']")
	WebElement drugsAlcoholUnknown;
	
	@FindBy(xpath = "//span[text()='Does any caregiver have a history of drug or alcohol abuse?']/../../..//span[text()='--Clear--']")
	WebElement drugsAlcoholClear;
	
	
	
	@FindBy(xpath = "//span[text()='Has any child been denied essential medical treatment?']/../../..//input")
	WebElement deniedMedical;
	
	@FindBy(xpath = "//span[text()='Has any child been denied essential medical treatment?']/../../..//span[text()='Yes']")
	WebElement deniedMedicalYes;

	@FindBy(xpath = "//span[text()='Has any child been denied essential medical treatment?']/../../..//span[text()='No']")
	WebElement deniedMedicalNo;

	@FindBy(xpath = "//span[text()='Has any child been denied essential medical treatment?']/../../..//span[text()='Unknown']")
	WebElement deniedMedicalUnknown;
	
	@FindBy(xpath = "//span[text()='Has any child been denied essential medical treatment?']/../../..//span[text()='--Clear--']")
	WebElement deniedMedicalClear;


	
	@FindBy(xpath = "//span[text()='Are conditions in and/or around the home hazardous or unsanitary?']/../../..//input")
	WebElement unsanitaryConditions;
	
	@FindBy(xpath = "//span[text()='Are conditions in and/or around the home hazardous or unsanitary?']/../../..//span[text()='Yes']")
	WebElement unsanitaryConditionsYes;

	@FindBy(xpath = "//span[text()='Are conditions in and/or around the home hazardous or unsanitary?']/../../..//span[text()='No']")
	WebElement unsanitaryConditionsNo;

	@FindBy(xpath = "//span[text()='Are conditions in and/or around the home hazardous or unsanitary?']/../../..//span[text()='Unknown']")
	WebElement unsanitaryConditionsUnknown;
	
	@FindBy(xpath = "//span[text()='Are conditions in and/or around the home hazardous or unsanitary?']/../../..//span[text()='--Clear--']")
	WebElement unsanitaryConditionsClear;


	
	@FindBy(xpath = "//span[text()='Has any person in the home ever been a victim of spousal abuse?']/../../..//input")
	WebElement spousalAbuse;
	
	@FindBy(xpath = "//span[text()='Has any person in the home ever been a victim of spousal abuse?']/../../..//span[text()='Yes']")
	WebElement spousalAbuseYes;

	@FindBy(xpath = "//span[text()='Has any person in the home ever been a victim of spousal abuse?']/../../..//span[text()='No']")
	WebElement spousalAbuseNo;

	@FindBy(xpath = "//span[text()='Has any person in the home ever been a victim of spousal abuse?']/../../..//span[text()='Unknown']")
	WebElement spousalAbuseUnknown;
	
	@FindBy(xpath = "//span[text()='Has any person in the home ever been a victim of spousal abuse?']/../../..//span[text()='--Clear--']")
	WebElement spousalAbuseClear;


	
	@FindBy(xpath = "//span[text()='Does any person in the home promote violence?']/../../..//input")
	WebElement promoteViolence;
	
	@FindBy(xpath = "//span[text()='Does any person in the home promote violence?']/../../..//span[text()='Yes']")
	WebElement promoteViolenceYes;
	
	@FindBy(xpath = "//span[text()='Does any person in the home promote violence?']/../../..//span[text()='No']")
	WebElement promoteViolenceNo;
	
	@FindBy(xpath = "//span[text()='Does any person in the home promote violence?']/../../..//span[text()='Unknown']")
	WebElement promoteViolenceUnknown;
	
	@FindBy(xpath = "//span[text()='Does any person in the home promote violence?']/../../..//span[text()='--Clear--']")
	WebElement promoteViolenceClear;
	
	@FindBy(xpath="//h1[text()='Safety Decision']")
	WebElement safetyDecissionPagelabel;


	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;
	
	@FindBy(xpath ="//button[text()='Cancel']")
	WebElement cancel;
	

	@FindBy(xpath = "(// button[text()='Next'])[last()]")
	WebElement next;
	
	public By assessmentIDverify = By.xpath("//*[text()='Decision Making Tool']/../..//*[text()='Assessment Id']");

	public By createdDateVerify = By.xpath("//*[text()='Decision Making Tool']/../..//*[text()='Created Date']");

	public By statusVerify = By.xpath("//*[text()='Decision Making Tool']/../..//*[text()='Status']");
	
	public By riskRecordVerify = By.xpath("//div[text()='In Progress']");
	
//Khushboo
	@FindBy(xpath="(//div[text()='Decision Making Tool'])[1]/../..//button")
	WebElement buttonDownwardLink;
	
	@FindBy(xpath="//span[text()='Edit']")
	WebElement buttonedit;
	
	/**
	 * Click on Create/Add button
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickCreateAddButton() throws AcisException {
		logger.info("Clicking on Create/Add button");
		waitForElement(createAddButton);
		clickWebElement(createAddButton);
		logger.info("Clicked on Create/Add button");
		waitForPageLoadTill(5);
		waitForPageLoad();
	}
	
	/**
	 * Verify Risk Assessment labels from safety assessment
	 * @author Dharmesh Krishna
	 * @throws AcisException  
	 */
	public void verifyRiskAssessment() throws AcisException {
		logger.info("Verifying Assessment ID, Created Date and Status Label");
		waitForElement(createAddButton);
		
		isElementPresent(assessmentIDverify);
		isElementPresent(createdDateVerify);
		isElementPresent(statusVerify);
		logger.info("Verified Assessment ID, Created Date and Status Label");
	}
	
	/**
	 * Select : Child Unable to Defend Picklist
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectUnableDefend(String type) throws AcisException {
		logger.info("Selecting Is any child four years old or younger or otherwise unable to protect him/herself? : "+type);
		waitForElementClickable(unableDefend);
		clickWebElement(unableDefend);
		switch(type)
		{
		case "Yes":
			waitForElement(unableDefendYes);
			clickWebElement(unableDefendYes);
			break;
		case "No":
			waitForElement(unableDefendNo);
			clickWebElement(unableDefendNo);
			break;
		case "Unknown":
			waitForElement(unableDefendUnknown);
			clickWebElement(unableDefendUnknown);
			break;
		}
		logger.info("Is any child four years old or younger or otherwise unable to protect him/herself? selected: "+type);
		
	}				
	
	/**
	 * Select : Does any caregiver have a history of drug or alcohol abuse?
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectDrugAlcohol(String type) throws AcisException {
		logger.info("Selecting Does any caregiver have a history of drug or alcohol abuse? as: "+type );
		waitForElement(drugsAlcohol);
		clickWebElement(drugsAlcohol);
		switch(type)
		{
		case "Yes":
			waitForElement(drugsAlcoholYes);
			clickWebElement(drugsAlcoholYes);
			break;
		case "No":
			waitForElement(drugsAlcoholNo);
			clickWebElement(drugsAlcoholNo);
			break;
		case "Unknown":
			waitForElement(drugsAlcoholUnknown);
			clickWebElement(drugsAlcoholUnknown);
			break;
		}
		logger.info("Does any caregiver have a history of drug or alcohol abuse? selected: "+type );

	}
	

	/**
	 * Select : Has any child been denied essential medical treatment?
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectDeniedMedical(String type) throws AcisException {
		logger.info("Selecting Has any child been denied essential medical treatment? as: "+type);
		waitForElement(deniedMedical);
		clickWebElement(deniedMedical);
		switch(type)
		{
		case "Yes":
			waitForElement(deniedMedicalYes);
			clickWebElement(deniedMedicalYes);
			break;
		case "No":
			waitForElement(deniedMedicalNo);
			clickWebElement(deniedMedicalNo);
			break;
		case "Unknown":
			waitForElement(deniedMedicalUnknown);
			clickWebElement(deniedMedicalUnknown);
			break;
		}
		logger.info("Has any child been denied essential medical treatment? selected: "+type);

	}
	


	/**
	 * Select : Are conditions in and/or around the home hazardous or unsanitary?
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectHazardousUnsanitary(String type) throws AcisException {
		logger.info("Selecting Are conditions in and/or around the home hazardous or unsanitary? : "+type);
		waitForElement(unsanitaryConditions);
		clickWebElement(unsanitaryConditions);
		switch(type)
		{
		case "Yes":
			waitForElement(unsanitaryConditionsYes);
			clickWebElement(unsanitaryConditionsYes);
			break;
		case "No":
			waitForElement(unsanitaryConditionsNo);
			clickWebElement(unsanitaryConditionsNo);
			break;
		case "Unknown":
			waitForElement(unsanitaryConditionsUnknown);
			clickWebElement(unsanitaryConditionsUnknown);
			break;
		}
		logger.info("Are conditions in and/or around the home hazardous or unsanitary? selected: "+type);

	}

	
	/**
	 * Select : Has any person in the home ever been a victim of spousal abuse?
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectSpousalAbuse(String type) throws AcisException {
		logger.info("Selecting Has any person in the home ever been a victim of spousal abuse? as: "+type );
		waitForElement(spousalAbuse);
		clickWebElement(spousalAbuse);
		switch(type)
		{
		case "Yes":
			waitForElement(spousalAbuseYes);
			clickWebElement(spousalAbuseYes);
			break;
		case "No":
			waitForElement(spousalAbuseNo);
			clickWebElement(spousalAbuseNo);
			break;
		case "Unknown":
			waitForElement(spousalAbuseUnknown);
			clickWebElement(spousalAbuseUnknown);
			break;
		}
		logger.info("Has any person in the home ever been a victim of spousal abuse? selected: "+type);

	}
	
	
	/**
	 * Select : Does any person in the home promote violence?
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectPromoteViolence(String type) throws AcisException {
		logger.info("Selecting Does any person in the home promote violence? as: "+type);
		waitForElement(promoteViolence);
		clickWebElement(promoteViolence);
		switch(type)
		{
		case "Yes":
			waitForElement(promoteViolenceYes);
			clickWebElement(promoteViolenceYes);
			break;
		case "No":
			waitForElement(promoteViolenceNo);
			clickWebElement(promoteViolenceNo);
			break;
		case "Unknown":
			waitForElement(promoteViolenceUnknown);
			clickWebElement(promoteViolenceUnknown);
			break;
		}
		logger.info("Does any person in the home promote violence? selected: "+type);

	}

	/**
	 * Click on cancel New Risk Assessment
	 * Created By Dharmesh
	 * @throws AcisException 
	 */	
	public void verifyRiskRecordCreated() throws AcisException {
		logger.info("Verifying Risk Record is Created");
		isElementPresent(riskRecordVerify);
		logger.info("Verified Risk Record is Created");
	}
	
	/**
	 * Click on Save New Risk Assessment
	 * Created By Khushboo
	 * @throws AcisException 
	 */
	public void clickSave() throws AcisException {
		logger.info("Clicking on Save New Risk Assessment");
		clickWebElement(save);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Save New Risk Assessment");
	}
	
	/**
	 * Click on cancel New Risk Assessment
	 * Created By Khushboo
	 * @throws AcisException 
	 */	
	public void clickCancel() throws AcisException {
		clickWebElement(cancel);
		logger.info("Clicked on cancel  button");
	}
						
	
	/***
	 * Clikcing on next|
	 * @author akash.a.gaurav
	 */
	
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForElementClickable(next);
		clickWebElement(next);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Next button");
		waitForElement(safetyDecissionPagelabel);
		logger.info("User is in safety decission page label");

	}
	
	
	/***
	 * Editing existing safety Assessment |
	 * @author akash.a.gaurav
	 */
	
	public void editSafteyAssessment() throws AcisException {
		logger.info("Editing  Safety Assessment");
		clickWebElement(buttonDownwardLink);
		clickWebElement(buttonedit);
		logger.info("Opened Decision Making Tool");

	}

}
	