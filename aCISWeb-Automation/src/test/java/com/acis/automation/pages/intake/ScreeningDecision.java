package com.acis.automation.pages.intake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ScreeningDecision extends PageBase {
	final static Logger logger = LoggerFactory.getLogger(ScreeningDecision.class);

	public ScreeningDecision() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	
	public By screeningInsights = By.xpath("//textarea[@id='Factors' and @disabled='disabled']");
	
	public By insightsLabel = By.xpath("//label[contains(text(),'Insights')]");
	
	@FindBy(id = "ScreenInForInvestigation2")
	WebElement screeningRecommendation;
	
	@FindBy(id = "WorkerComments")
	WebElement workerComments;
	
	@FindBy(id = "Worker_CaseCreation")
	WebElement workerCaseCreation;

	@FindBy(xpath = "///p[text()='New']")
	WebElement newAllegation;

	@FindBy(xpath = "(//input[@id='Maltreator'])[2]")
	WebElement maltreator;
	
	@FindBy(xpath = "(//select[@id='AllegationType'])[2]")
	WebElement allegationType;
	
	@FindBy(xpath = "(//input[@id='Victim'])[2]")
	WebElement victim;
	
	@FindBy(xpath = "//span[text()='Accept & Assign']")
	WebElement acceptAssign;
	
	@FindBy(xpath = "//span[text()='Override']")
	WebElement override;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;

	@FindBy(id = "SupervisoryComments")
	WebElement supervisoryComments;
	
	@FindBy(id = "Narrative5")
	WebElement narrative;
	
	@FindBy(xpath = "//p[text()='Submit']")
	WebElement submit;
	
	
	public void verifyInsightsLabel() throws AcisException {
		isElementPresent(insightsLabel);
		logger.info("Verifying if Insights Label is Present");
	}
	
	public void verifyScreeningInsights() throws AcisException {
		isElementPresent(screeningInsights);
		logger.info("Verifying if Screening Insight is Present and disabled");
	}

	public void selectScreeningRecommendation(String screening) throws AcisException {
		selectDropdownByVisibleTextUsingJavascriptExecutor(screeningRecommendation, screening);
		logger.info("Screening Recommendation is: " + screening);
	}

	public void enterTextFieldValue(String textFieldName, String strValue) throws AcisException {
		switch(textFieldName)
		{
		   case "workerComments":
			   enterText(workerComments, strValue);
			   logger.info("Worker Comment entered as: " + strValue);
		      break;
		   
		   case "supervisoryComments":
			   enterText(supervisoryComments, strValue);
			   logger.info("Supervisory Comment entered as: " + strValue);
		   break;
		   
		   case "narrative":
			   enterText(narrative, strValue);
			   logger.info("Narrative Comment entered as: " + strValue);
		   break;
		  
		   default : 
			   logger.info("Text Field Value: " + textFieldName+"did not find");
		}
	}
	

	public void selectAllegationReportToCase(String workerCase) throws AcisException {
		selectDropdownByVisibleTextUsingJavascriptExecutor(workerCaseCreation, workerCase);
		logger.info(" Recommend to associate Allegation Report to Case: " + workerCase);
	}
	
	public void newAllegations(String typeAllegation,String allegedMaltreator,String allegedVictim) throws AcisException {
		clickWebElement(newAllegation);
		waitForElement(allegationType);
		selectDropdownByVisibleTextUsingJavascriptExecutor(allegationType, typeAllegation);
		selectDropdownByVisibleTextUsingJavascriptExecutor(maltreator, allegedMaltreator);
		selectDropdownByVisibleTextUsingJavascriptExecutor(victim, allegedVictim);
		clickWebElement(save);
		logger.info(" New Allegation Created with Allegation type: " + typeAllegation + " and Alleged Maltreator as "+ allegedMaltreator + " and Alleged Victim as "+ allegedVictim );
	}
	
	public void selectAcceptAssign() throws AcisException {
		waitForElement(acceptAssign);
		clickWebElement(acceptAssign);
		logger.info("Selected Accept and Assign frome Screening Decision");
	}
	
	public void selectOverride() throws AcisException {
		clickWebElement(override);
		logger.info("Selected Override frome Screening Decision");
	}
	
	public void clickSubmitbtn() throws AcisException {
		clickWebElement(submit);
		logger.info("Intake Flow has been submitted");
	}
}
