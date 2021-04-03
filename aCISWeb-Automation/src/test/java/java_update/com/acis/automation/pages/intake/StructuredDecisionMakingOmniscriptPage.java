package com.acis.automation.pages.intake;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

/**
 * 
 * @author akash.a.gaurav
 * 
 *
 */

public class StructuredDecisionMakingOmniscriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(StructuredDecisionMakingOmniscriptPage.class);

	public StructuredDecisionMakingOmniscriptPage() throws AcisException {
	}
	
	@FindBy(xpath = "//h1[text()='Structured Decision Making']")
	WebElement structuredDecisionMakingTitle;
	
	@FindBy(xpath = "//h1[text()='Screening Decision']")
	WebElement screeningDecisonTitle;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//*[contains(text(),'Safety Assessment')]")
	WebElement SafetyAssesmentTitle;

	@FindBy(xpath = "//span[text()='Child fearful/anxious']/../..//span[@class='slds-checkbox_faux']")
	WebElement childFearfulCheckbox;

	
	@FindBy(xpath = "//span[text()='Child is unable to protect self']/../..//span[@class='slds-checkbox_faux']")
	WebElement childEnableProtectCheckBox;
	
	
	@FindBy(xpath = "//span[text()='Child is unsupervised or alone for extended periods']/../..//span[@class='slds-checkbox_faux']")
	WebElement childIsInsupervisedorAloneforextendedperiodsCheckBox;
	
	
	
	@FindBy(xpath = "//span[text()='Child needs medical attention']/../..//span[@class='slds-checkbox_faux']")
	WebElement childNeedsMedicalAttentionCheckBox;
	
	
	@FindBy(xpath = "//span[text()='Face/head injuries']/../..//span[@class='slds-checkbox_faux']")
	WebElement faceHeadInjuriescheckbox;
	
	@FindBy(xpath = "//span[text()='Multiple injuries']/../..//span[@class='slds-checkbox_faux']")
	WebElement multipleInjuriesCheckBox;
	
	
	@FindBy(xpath = "//span[text()='Serious injury/near fatality']/../..//span[@class='slds-checkbox_faux']")
	WebElement seriouInjuriesCheckBox;
	
	@FindBy(xpath = "//span[text()='Several victims']/../..//span[@class='slds-checkbox_faux']")
	WebElement severalVictimCheckBox;
	
	@FindBy(xpath = "//span[text()='Unexplained injuries']/../..//span[@class='slds-checkbox_faux']")
	WebElement unExplainedInjuriesCheckBox;
	
	@FindBy(xpath="//*[contains(text(),'Information Suggests Impending Danger - Child')]")
	WebElement informationSuggetsTitle;
	
	@FindBy(xpath = "//span[text()='A child is fearful of the home situation']/../..//span[@class='slds-checkbox_faux']")
	WebElement childIsFearfulInTheHomeSituationCheckBox; 	
	
	
	@FindBy(xpath = "//span[text()='Child has exceptional needs that the parent(s) cannot or will not meet']/../..//span[@class='slds-checkbox_faux']")
	WebElement childHadexceptionalNeedsThatThePersonCannotorwillNotMeetCheckBox; 	
	
	@FindBy(xpath="//*[contains(text(),'Information Suggests Present Danger - Adult')]")
	WebElement informationSuggestsPresentDangerAdultTitle;
	
	@FindBy(xpath = "//span[text()='Bizarre behavior']/../..//span[@class='slds-checkbox_faux']")
	WebElement  bizzareBehaviourCheackBox	; 
	
	@FindBy(xpath = "//span[text()='Caregiver is unable to perform essential responsibilities']/../..//span[@class='slds-checkbox_faux']")
	WebElement caregiverIsUnableToPErformEssentialResponsiblities;
	
	
	@FindBy(xpath="//*[contains(text(),'Information Suggests Present Danger - Parent')]")
	WebElement informationSuggestsParentDangerTitle;
	
	@FindBy(xpath="//*[contains(text(),'General Parenting')]")
	WebElement generalParentingTitle;
	

	@FindBy(xpath="//span[text()='Family hides child']/../..//span[@class='slds-checkbox_faux']")
	WebElement familyHideChildCheckbox;
	
	@FindBy(xpath="//span[text()='Family will flee']/../..//span[@class='slds-checkbox_faux']")
	WebElement familyWillFleeCheckBox;
	
	

	@FindBy(xpath="//span[text()='Family violence and/or spouse abuse is present']/../..//span[@class='slds-checkbox_faux']")
	WebElement familyViolenceSpouseIsAbsentCheckBox;
	
	
	@FindBy(xpath="//span[text()='Life threatening living arrangements']/../..//span[@class='slds-checkbox_faux']")
	WebElement lifeThreateningCheckBox;
	

	@FindBy(xpath="//*[contains(text(),'Information Suggests Impending Danger - Parent')]")
	WebElement informationSuggestsImpendingDangerTiitle;
	
	
	@FindBy(xpath="//span[text()='Family does not have resources to meet basic needs']/../..//span[@class='slds-checkbox_faux']")
	WebElement familyDoesNotHaveResourcesToMeetBasicNeedsCheckBox;
	
	
	@FindBy(xpath="//span[text()='One or both parents/caregivers fear they will maltreat the child and/or request placement']/../..//span[@class='slds-checkbox_faux']")
	WebElement oneOrBothParentsfearCheckBox;
	
	@FindBy(xpath="//*[@id='tinymce']")
	WebElement narrativeTextBox;
	
	
	@FindBy (id="mytextarea_ifr")
    WebElement frameElement;
	
	
	@FindBy(xpath = "//div[@id='StructuredDecisionMaking_nextBtn']//p[text()='Next']")
	WebElement NextButton;

	
/****
 * This method enables us to click on checkboxes of Information Suggest Present Danger
 * @throws AcisException
 * @throws InterruptedException 
 * @author akash.a.gaurav
 */
	public void informationSuggestPresentDanger() throws AcisException, InterruptedException {
		try {
			logger.info("Selecting checkboxes of corrosponding information Suggest present Danger");
			waitForPageLoad();
			waitForPageLoadTill(8);
			clickWebElemntUsingJavascriptExecutor(childFearfulCheckbox);
			logger.info("Clicked on Child  Fearful CheckBox");
			clickWebElemntUsingJavascriptExecutor(childEnableProtectCheckBox);
			logger.info("Clicked on Child Enable Protect Check Box");
			clickWebElemntUsingJavascriptExecutor(childIsInsupervisedorAloneforextendedperiodsCheckBox);
			logger.info("Clicked on Child Is in Supervisor enable java script ");
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/****
	 * This method enables us to click on checkboxes of Information Suggests Impending Danger - Child

	 * @throws AcisException
	 * @throws InterruptedException 
	 * @author akash.a.gaurav
	 */
	
	public void informationSuggestImpendingDangerChild() throws AcisException {
		
		try {
			logger.info("This method will click on checkBoxes of information Suggest Impending Danger Child");
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(childIsFearfulInTheHomeSituationCheckBox);
			clickWebElemntUsingJavascriptExecutor(childHadexceptionalNeedsThatThePersonCannotorwillNotMeetCheckBox);
			logger.info("Clicked on all the checkboxes of information Sugggest Impending Danger Child");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
	/****
	 * This method enables us to click on checkboxes of Information Suggests Impending Danger - Adult

	 * @throws AcisException
	 * @throws InterruptedException 
	 * @author akash.a.gaurav
	 */
	
	public void informationSuggestImpendingDangerAdult() throws AcisException {
		
		try {
			logger.info("This method will click on information suggest impending danger adult");
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(bizzareBehaviourCheackBox);
			clickWebElemntUsingJavascriptExecutor(childHadexceptionalNeedsThatThePersonCannotorwillNotMeetCheckBox);
			logger.info("Clicked on all the checkboxes of information Suggest Impending Danger Adult");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
	/****
	 * This method enables us to click on checkboxes of Information Suggests Impending Danger - Parent

	 * @throws AcisException
	 * @throws InterruptedException 
	 * @author akash.a.gaurav
	 */
	
	public void informationSuggestImpendingPresentDangerParent() throws AcisException {
		
		try {
			logger.info("This method will click on information suggest impending danger parent");
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(familyHideChildCheckbox);
			clickWebElemntUsingJavascriptExecutor(familyWillFleeCheckBox);
			logger.info("Clicked on all CheckBoxes of Information Suggest Impending Danger -Parent");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
	/****
	 * This method enables us to click on checkboxes of Information Suggests Impending Danger - Parent

	 * @throws AcisException
	 * @throws InterruptedException 
	 * @author akash.a.gaurav
	 */
	
	public void informationSuggestImpendingDangerParent() throws AcisException {
		
		try {
			logger.info("This method will click on information suggest impending danger parent");
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(familyDoesNotHaveResourcesToMeetBasicNeedsCheckBox);
			clickWebElemntUsingJavascriptExecutor(oneOrBothParentsfearCheckBox);
			logger.info("Clicked on all CheckBoxes of Information Suggest Impending Danger -Parent");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/***
	 * Narrative text Box
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 * 
	 */
	public void narrativeTextBox() throws AcisException {
        try {
            waitForPageLoadTill(9);
            
              Actions act = new Actions(driver);
              
              act.sendKeys(Keys.TAB).build().perform();
              act.sendKeys(Keys.TAB).build().perform();
              act.sendKeys(Keys.ENTER).build().perform(); 
              act.sendKeys(Keys.CONTROL).sendKeys("Entering in the Narrative").keyUp(Keys.CONTROL).perform();
              logger.info("Verify all checkboxes and enter and also enter text");
              waitForPageLoadTill(9);
             

             
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

 

    }

	/**
	 * click on Next button
	 * @author mrunal.s.tilekar
	 */
	public void clickNextButton() throws AcisException, InterruptedException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Next button");
		waitForElement(screeningDecisonTitle);
		logger.info("Screening Decision Making page loaded");

	}
	
}
	
	

