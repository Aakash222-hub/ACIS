package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class FosterCareFamilyNeedsAssessmentpage extends PageBase {

	public FosterCareFamilyNeedsAssessmentpage() throws AcisException
	{
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(FosterCareFamilyNeedsAssessmentpage.class);

@FindBy(xpath="//*[contains(text(),'adequate and reliable child care.')]/../../..//input")
WebElement adequateAndReliableChild; 

@FindBy(xpath="//*[contains(text(),'care attend school regularly.')]/../../..//input")
WebElement careAttendSchoolRegularly;

@FindBy(xpath="//*[contains(text(),'emotional health conditions.')]/../../..//input")
WebElement emotionalHealthConditions;

@FindBy(xpath="//*[contains(text(),'living arrangements')]/../../..//input")
WebElement livingArrangements;

@FindBy(xpath="//*[contains(text(),'living wage.')]/../../..//input")
WebElement livingWage;

@FindBy(xpath="//*[contains(text(),'Substance Use Disorder.')]/../../..//input")
WebElement substanceUseDisorde;

@FindBy(xpath="//*[contains(text(),'living environment')]/../../..//input")
WebElement livingEnvironment;


@FindBy(xpath="//*[contains(text(),'nutritional meals')]/../../..//input")
WebElement nutritionalMeals;

@FindBy(xpath="//*[contains(text(),'reliable transportation')]/../../..//input")
WebElement reliableTransportation;

// Rate the family's ability to provide adequate and reliable child care dropdown

@FindBy(xpath="//*[contains(text(),'adequate and reliable child care.')]/../../..//*[text()='1 - Crisis']")
WebElement crisis;

@FindBy(xpath="//*[contains(text(),'adequate and reliable child care.')]/../../..//*[text()='2 - At-Risk']")
WebElement atRisk;

@FindBy(xpath="//*[contains(text(),'adequate and reliable child care.')]/../../..//*[text()='3 - Average']")
WebElement average;

@FindBy(xpath="//*[contains(text(),'adequate and reliable child care.')]/../../..//*[text()='4 - Stable']")
WebElement stable;

@FindBy(xpath="//*[contains(text(),'adequate and reliable child care.')]/../../..//*[text()='5 - Thriving']")
WebElement thriving;


//Rate the family's ability to ensure children in their care attend school regularly dropdown

@FindBy(xpath="//*[contains(text(),'care attend school regularly.')]/../../..//*[text()='1 - Crisis']")
WebElement careAttendSchoolRegularlyCrisis;

@FindBy(xpath="//*[contains(text(),'care attend school regularly.')]/../../..//*[text()='2 - At-Risk']")
WebElement careAttendSchoolRegularlyAtRisk;

@FindBy(xpath="//*[contains(text(),'care attend school regularly.')]/../../..//*[text()='3 - Average']")
WebElement careAttendSchoolRegularlyAverage;

@FindBy(xpath="//*[contains(text(),'care attend school regularly.')]/../../..//*[text()='4 - Stable']")
WebElement careAttendSchoolRegularlyStable;

@FindBy(xpath="//*[contains(text(),'care attend school regularly.')]/../../..//*[text()='5 - Thriving']")
WebElement careAttendSchoolRegularlyThriving;

//Rate the family's ability to cope with any mental, physical or emotional health conditions dropdown

@FindBy(xpath="//*[contains(text(),'emotional health conditions.')]/../../..//*[text()='1 - Crisis']")
WebElement emotionalHealthconditionsCrisis;

@FindBy(xpath="//*[contains(text(),'emotional health conditions.')]/../../..//*[text()='2 - At-Risk']")
WebElement emotionalHealthconditionsAtRisk;

@FindBy(xpath="//*[contains(text(),'emotional health conditions.')]/../../..//*[text()='3 - Average']")
WebElement emotionalHealthconditionsAverage;

@FindBy(xpath="//*[contains(text(),'emotional health conditions.')]/../../..//*[text()='4 - Stable']")
WebElement emotionalHealthconditionsStable;

@FindBy(xpath="//*[contains(text(),'emotional health conditions.')]/../../..//*[text()='5 - Thriving']")
WebElement emotionalHealthconditionsThriving;

//Rate the family's ability to maintain reliable living arrangements for the children in their care dropdown

@FindBy(xpath="//*[contains(text(),'living arrangements')]/../../..//*[text()='1 - Crisis']")
WebElement livingArrangementsCrisis;

@FindBy(xpath="//*[contains(text(),'living arrangements')]/../../..//*[text()='2 - At-Risk']")
WebElement livingArrangementsAtRisk;

@FindBy(xpath="//*[contains(text(),'living arrangements')]/../../..//*[text()='3 - Average']")
WebElement livingArrangementsAverage;

@FindBy(xpath="//*[contains(text(),'living arrangements')]/../../..//*[text()='4 - Stable']")
WebElement livingArrangementsStable;

@FindBy(xpath="//*[contains(text(),'living arrangements')]/../../..//*[text()='5 - Thriving']")
WebElement livingArrangementsThriving;



//Rate the family's ability to maintain stable employment and earn a living wage dropdown

@FindBy(xpath="//*[contains(text(),'living wage.')]/../../..//*[text()='1 - Crisis']")
WebElement livingWageCrisis;

@FindBy(xpath="//*[contains(text(),'living wage.')]/../../..//*[text()='2 - At-Risk']")
WebElement livingWageAtRisk;

@FindBy(xpath="//*[contains(text(),'living wage.')]/../../..//*[text()='3 - Average']")
WebElement livingWageAverage;

@FindBy(xpath="//*[contains(text(),'living wage.')]/../../..//*[text()='4 - Stable']")
WebElement livingWageStable;

@FindBy(xpath="//*[contains(text(),'living wage.')]/../../..//*[text()='5 - Thriving']")
WebElement livingWageThriving;


// Rate the family's ability to cope with any instances of Substance Use Disorder dropdown

@FindBy(xpath="//*[contains(text(),'Substance Use Disorder.')]/../../..//*[text()='1 - Crisis']")
WebElement disorderCrisis;

@FindBy(xpath="//*[contains(text(),'Substance Use Disorder.')]/../../..//*[text()='2 - At-Risk']")
WebElement disorderAtRisk;

@FindBy(xpath="//*[contains(text(),'Substance Use Disorder.')]/../../..//*[text()='3 - Average']")
WebElement disorderAverage;

@FindBy(xpath="//*[contains(text(),'Substance Use Disorder.')]/../../..//*[text()='4 - Stable']")
WebElement disorderStable;

@FindBy(xpath="//*[contains(text(),'Substance Use Disorder.')]/../../..//*[text()='5 - Thriving']")
WebElement disorderThriving;


// Rate the family's ability to provide a safe living environment for children in their care dropdown

@FindBy(xpath="//*[contains(text(),'living environment')]/../../..//*[text()='1 - Crisis']")
WebElement livingEnvironmentCrisis;

@FindBy(xpath="//*[contains(text(),'living environment')]/../../..//*[text()='2 - At-Risk']")
WebElement livingEnvironmentAtRisk;

@FindBy(xpath="//*[contains(text(),'living environment')]/../../..//*[text()='3 - Average']")
WebElement livingEnvironmentAverage;

@FindBy(xpath="//*[contains(text(),'living environment')]/../../..//*[text()='4 - Stable']")
WebElement livingEnvironmentStable;

@FindBy(xpath="//*[contains(text(),'living environment')]/../../..//*[text()='5 - Thriving']")
WebElement livingEnvironmentThriving;

//Rate the family's ability to provide adequate, nutritional meals for children in their care dropdown

@FindBy(xpath="//*[contains(text(),'nutritional meals')]/../../..//*[text()='1 - Crisis']")
WebElement nutritionalMealsCrisis;

@FindBy(xpath="//*[contains(text(),'nutritional meals')]/../../..//*[text()='2 - At-Risk']")
WebElement nutritionalMealsAtRisk;

@FindBy(xpath="//*[contains(text(),'nutritional meals')]/../../..//*[text()='3 - Average']")
WebElement nutritionalMealsAverage;

@FindBy(xpath="//*[contains(text(),'nutritional meals')]/../../..//*[text()='4 - Stable']")
WebElement nutritionalMealsStable;

@FindBy(xpath="//*[contains(text(),'nutritional meals')]/../../..//*[text()='5 - Thriving']")
WebElement nutritionalMealsThriving;

//Rate the family's access to reliable transportation dropdown

@FindBy(xpath="//*[contains(text(),'reliable transportation')]/../../..//*[text()='1 - Crisis']")
WebElement reliableTransportationCrisis;

@FindBy(xpath="//*[contains(text(),'reliable transportation')]/../../..//*[text()='2 - At-Risk']")
WebElement reliableTransportationAtRisk;

@FindBy(xpath="//*[contains(text(),'reliable transportation')]/../../..//*[text()='3 - Average']")
WebElement reliableTransportationAverage;

@FindBy(xpath="//*[contains(text(),'reliable transportation')]/../../..//*[text()='4 - Stable']")
WebElement reliableTransportationStable;

@FindBy(xpath="//*[contains(text(),'reliable transportation')]/../../..//*[text()='5 - Thriving']")
WebElement reliableTransportationThriving;

@FindBy(xpath = "//button[text()='Submit']")
WebElement submit;

@FindBy(xpath = "//*[text()='Submitted']")
WebElement submitted;

@FindBy(xpath = "//*[@title='Assessment ID']")
WebElement assessmentID;

@FindBy(xpath = "//*[@title='Type']")
WebElement type;

@FindBy(xpath = "//*[@title='Status']")
WebElement status;

@FindBy(xpath = "//*[@title='Created Date']")
WebElement createdDate;

@FindBy(xpath = "//span[contains(text(),' items • Sorted by Type • ')]")
WebElement multipeItems;

@FindBy(xpath = "//button[text()='Save for later']")
WebElement saveForlater;
	
@FindBy(xpath = "//button[text()='OK']")
WebElement ok;
	
@FindBy(xpath = "//span[text()='Your OmniScript is saved for later']")
WebElement omniscriptsaveForLater;
/**
 * @author Varun.krish
 * Selecting Family Needs Assessment
 * @throws AcisException 
 */



public void adequateAndReliableChildcareAssessmentDropdown(String subtypeOption) throws AcisException {
	switch (subtypeOption) {
	case "Crisis":
		logger.info("Selecting Crisis:"+subtypeOption);
//		waitForElementClickable(adequateAndReliableChild);
		waitForElement(adequateAndReliableChild);
		clickWebElement(adequateAndReliableChild);
		clickWebElement(crisis);
		waitForElementClickable(crisis);
		logger.info("Selecting Crisis:"+subtypeOption);
		break;

	case "AtRisk":
		logger.info("Selecting At-Risk:"+subtypeOption);
		waitForElement(adequateAndReliableChild);
		clickWebElement(adequateAndReliableChild);
		clickWebElement(atRisk);
		logger.info("Selecting Crisis:"+subtypeOption);
		break;
		
	case "Average":
		logger.info("Selecting Average:"+subtypeOption);
		waitForElement(adequateAndReliableChild);
		clickWebElement(adequateAndReliableChild);
		clickWebElement(average);
		logger.info("Selecting Average:"+subtypeOption);
		break;
		
	case "Stable":
		logger.info("Selecting Stable:"+subtypeOption);
		waitForElement(adequateAndReliableChild);
		clickWebElement(adequateAndReliableChild);
		clickWebElement(stable);
		logger.info("Selecting Stable:"+subtypeOption);
		break;
		
	case "Thriving":
		logger.info("Selecting Thriving :"+subtypeOption);
		waitForElement(adequateAndReliableChild);
		clickWebElement(adequateAndReliableChild);
		clickWebElement(thriving);
		logger.info("Selecting Thriving:"+subtypeOption);
		break;
			
	default:
		logger.info("No Family Needs Assessment type selected");
		break;
	}
}

public void careAttendSchoolRegularlyAssessmentDropdown(String subtypeOption) throws AcisException {
	switch (subtypeOption) {
	case "Crisis":
		logger.info("Selecting Crisis:"+subtypeOption);
		clickWebElement(careAttendSchoolRegularly);
		clickWebElement(careAttendSchoolRegularlyCrisis);
		logger.info("Selecting Crisis:"+subtypeOption);
		break;

	case "AtRisk":
		logger.info("Selecting At-Risk:"+subtypeOption);
		clickWebElement(careAttendSchoolRegularly);
		clickWebElement(careAttendSchoolRegularlyAtRisk);
		logger.info("Selecting Crisis:"+subtypeOption);
		break;
		
	case "Average":
		logger.info("Selecting Average:"+subtypeOption);
		clickWebElement(careAttendSchoolRegularly);
		clickWebElement(careAttendSchoolRegularlyAverage);
		logger.info("Selecting Average:"+subtypeOption);
		break;
		
	case "Stable":
		logger.info("Selecting Stable:"+subtypeOption);
		waitForElement(careAttendSchoolRegularly);
		clickWebElement(careAttendSchoolRegularly);
		clickWebElement(careAttendSchoolRegularlyStable);
		logger.info("Selecting Stable:"+subtypeOption);
		break;
		
	case "Thriving":
		logger.info("Selecting Thriving :"+subtypeOption);
		clickWebElement(careAttendSchoolRegularly);
		clickWebElement(careAttendSchoolRegularlyThriving);
		logger.info("Selecting Thriving:"+subtypeOption);
		break;
			
	default:
		logger.info("No Family Needs Assessment type selected");
		break;
	}
}

public void livingarrangementsAssessmentDropdown(String subtypeOption) throws AcisException {
	switch (subtypeOption) {
	case "Crisis":
		logger.info("Selecting Crisis:"+subtypeOption);
		clickWebElement(livingArrangements);
		clickWebElement(livingArrangementsCrisis);
		logger.info("Selecting Crisis:"+subtypeOption);
		break;

	case "AtRisk":
		logger.info("Selecting At-Risk:"+subtypeOption);
		clickWebElement(livingArrangements);
		clickWebElement(livingArrangementsAtRisk);
		logger.info("Selecting Crisis:"+subtypeOption);
		break;
		
	case "Average":
		logger.info("Selecting Average:"+subtypeOption);
		clickWebElement(livingArrangements);
		clickWebElement(livingArrangementsAverage);
		logger.info("Selecting Average:"+subtypeOption);
		break;
		
	case "Stable":
		logger.info("Selecting Stable:"+subtypeOption);
		clickWebElement(livingArrangements);
		clickWebElement(livingArrangementsStable);
		logger.info("Selecting Stable:"+subtypeOption);
		break;
		
	case "Thriving":
		logger.info("Selecting Thriving :"+subtypeOption);
		clickWebElement(livingArrangements);
		clickWebElement(livingArrangementsThriving);
		logger.info("Selecting Thriving:"+subtypeOption);
		break;
			
	default:
		logger.info("No Family Needs Assessment type selected");
		break;
	}
}
	
	public void livingWageAssessmentDropdown(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "Crisis":
			logger.info("Selecting Crisis:"+subtypeOption);
			clickWebElement(livingWage);
			clickWebElement(livingWageCrisis);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;

		case "AtRisk":
			logger.info("Selecting At-Risk:"+subtypeOption);
			clickWebElement(livingWage);
			clickWebElement(livingWageAtRisk);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;
			
		case "Average":
			logger.info("Selecting Average:"+subtypeOption);
			clickWebElement(livingWage);
			clickWebElement(livingWageAverage);
			logger.info("Selecting Average:"+subtypeOption);
			break;
			
		case "Stable":
			logger.info("Selecting Stable:"+subtypeOption);
			clickWebElement(livingWage);
			clickWebElement(livingWageStable);
			logger.info("Selecting Stable:"+subtypeOption);
			break;
			
		case "Thriving":
			logger.info("Selecting Thriving :"+subtypeOption);
			clickWebElement(livingWage);
			clickWebElement(livingWageThriving);
			logger.info("Selecting Thriving:"+subtypeOption);
			break;
				
		default:
			logger.info("No Family Needs Assessment type selected");
			break;
		}

}
	
	public void emotionalHealthConditionsAssessmentDropdown(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "Crisis":
			logger.info("Selecting Crisis:"+subtypeOption);
			clickWebElement(emotionalHealthConditions);
			clickWebElement(emotionalHealthconditionsCrisis);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;

		case "AtRisk":
			logger.info("Selecting At-Risk:"+subtypeOption);
			clickWebElement(emotionalHealthConditions);
			clickWebElement(emotionalHealthconditionsAtRisk);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;
			
		case "Average":
			logger.info("Selecting Average:"+subtypeOption);
			clickWebElement(emotionalHealthConditions);
			clickWebElement(emotionalHealthconditionsAverage);
			logger.info("Selecting Average:"+subtypeOption);
			break;
			
		case "Stable":
			logger.info("Selecting Stable:"+subtypeOption);
			clickWebElement(emotionalHealthConditions);
			clickWebElement(emotionalHealthconditionsStable);
			logger.info("Selecting Stable:"+subtypeOption);
			break;
			
		case "Thriving":
			logger.info("Selecting Thriving :"+subtypeOption);
			clickWebElement(emotionalHealthConditions);
			clickWebElement(emotionalHealthconditionsThriving);
			logger.info("Selecting Thriving:"+subtypeOption);
			break;
				
		default:
			logger.info("No Family Needs Assessment type selected");
			break;
		}

}
	
	public void disorderAssessmentDropdown(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "Crisis":
			logger.info("Selecting Crisis:"+subtypeOption);
			clickWebElement(substanceUseDisorde);
			clickWebElement(disorderCrisis);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;

		case "AtRisk":
			logger.info("Selecting At-Risk:"+subtypeOption);
			clickWebElement(substanceUseDisorde);
			clickWebElement(disorderAtRisk);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;
			
		case "Average":
			logger.info("Selecting Average:"+subtypeOption);
			clickWebElement(substanceUseDisorde);
			clickWebElement(disorderAverage);
			logger.info("Selecting Average:"+subtypeOption);
			break;
			
		case "Stable":
			logger.info("Selecting Stable:"+subtypeOption);
			clickWebElement(substanceUseDisorde);
			clickWebElement(disorderStable);
			logger.info("Selecting Stable:"+subtypeOption);
			break;
			
		case "Thriving":
			logger.info("Selecting Thriving :"+subtypeOption);
			clickWebElement(substanceUseDisorde);
			clickWebElement(disorderThriving);
			logger.info("Selecting Thriving:"+subtypeOption);
			break;
				
		default:
			logger.info("No Family Needs Assessment type selected");
			break;
		}

}
	
	public void livingEnvironmentAssessmentDropdown(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "Crisis":
			logger.info("Selecting Crisis:"+subtypeOption);
			clickWebElement(livingEnvironment);
			clickWebElement(livingEnvironmentCrisis);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;

		case "AtRisk":
			logger.info("Selecting At-Risk:"+subtypeOption);
			clickWebElement(livingEnvironment);
			clickWebElement(livingEnvironmentAtRisk);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;
			
		case "Average":
			logger.info("Selecting Average:"+subtypeOption);
			clickWebElement(livingEnvironment);
			clickWebElement(livingArrangementsAverage);
			logger.info("Selecting Average:"+subtypeOption);
			break;
			
		case "Stable":
			logger.info("Selecting Stable:"+subtypeOption);
			clickWebElement(livingEnvironment);
			clickWebElement(livingArrangementsStable);
			logger.info("Selecting Stable:"+subtypeOption);
			break;
			
		case "Thriving":
			logger.info("Selecting Thriving :"+subtypeOption);
			clickWebElement(livingEnvironment);
			clickWebElement(livingArrangementsThriving);
			logger.info("Selecting Thriving:"+subtypeOption);
			break;
				
		default:
			logger.info("No Family Needs Assessment type selected");
			break;
		}

}

	public void nutritionalMealsAssessmentDropdown(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "Crisis":
			logger.info("Selecting Crisis:"+subtypeOption);
			clickWebElement(nutritionalMeals);
			clickWebElement(nutritionalMealsCrisis);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;

		case "AtRisk":
			logger.info("Selecting At-Risk:"+subtypeOption);
			clickWebElement(nutritionalMeals);
			clickWebElement(nutritionalMealsAtRisk);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;
			
		case "Average":
			logger.info("Selecting Average:"+subtypeOption);
			clickWebElement(nutritionalMeals);
			clickWebElement(nutritionalMealsAverage);
			logger.info("Selecting Average:"+subtypeOption);
			break;
			
		case "Stable":
			logger.info("Selecting Stable:"+subtypeOption);
			clickWebElement(nutritionalMeals);
			clickWebElement(nutritionalMealsStable);
			logger.info("Selecting Stable:"+subtypeOption);
			break;
			
		case "Thriving":
			logger.info("Selecting Thriving :"+subtypeOption);
			clickWebElement(nutritionalMeals);
			clickWebElement(nutritionalMealsThriving);
			logger.info("Selecting Thriving:"+subtypeOption);
			break;
				
		default:
			logger.info("No Family Needs Assessment type selected");
			break;
		}

}

	public void reliableTransportationAssessmentDropdown(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "Crisis":
			logger.info("Selecting Crisis:"+subtypeOption);
			clickWebElement(reliableTransportation);
			clickWebElement(reliableTransportationCrisis);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;

		case "AtRisk":
			logger.info("Selecting At-Risk:"+subtypeOption);
			clickWebElement(reliableTransportation);
			clickWebElement(reliableTransportationAtRisk);
			logger.info("Selecting Crisis:"+subtypeOption);
			break;
			
		case "Average":
			logger.info("Selecting Average:"+subtypeOption);
			clickWebElement(reliableTransportation);
			clickWebElement(reliableTransportationAverage);
			logger.info("Selecting Average:"+subtypeOption);
			break;
			
		case "Stable":
			logger.info("Selecting Stable:"+subtypeOption);
			clickWebElement(reliableTransportation);
			clickWebElement(reliableTransportationStable);
			logger.info("Selecting Stable:"+subtypeOption);
			break;
			
		case "Thriving":
			logger.info("Selecting Thriving :"+subtypeOption);
			clickWebElement(reliableTransportation);
			clickWebElement(reliableTransportationThriving);
			logger.info("Selecting Thriving:"+subtypeOption);
			break;
				
		default:
			logger.info("No Family Needs Assessment type selected");
			break;
		}

}
	public void clickSubmit() throws AcisException {
		logger.info("Clicking on Submit button");
		waitForPageLoadTill(10);	
		clickWebElement(submit);
//		waitForElement(element);
		waitForPageLoadTill(10);
		driver.navigate().refresh();
		
	}

	public void verifyAssesmentstatus() throws AcisException {
		logger.info("Clicking on submitted button");
		waitForElement(submitted);
		verifyElementNotPresent(submitted);
		waitForElement(assessmentID);;
		verifyElementNotPresent(assessmentID);
		verifyElementNotPresent(type);
		verifyElementNotPresent(status);
		verifyElementNotPresent(createdDate);
		verifyElementNotPresent(multipeItems);
		
		
	}

	/***Click on Save For Later
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSaveForLater() throws AcisException {
		logger.info("Clicking on Save for later");
		clickWebElemntUsingJavascriptExecutor(saveForlater);
		waitForPageLoadTill(3);
		logger.info("Clicked on Save for later");
	}
	
	/***Click on Ok
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickOk() throws AcisException {
		logger.info("Clicking on Ok");
		clickWebElement(ok);
		waitForPageLoadTill(5);
		logger.info("Clicked on Ok");
	}
	
	/*** Verify Individuals Involved save for Later
	 * @author pallavi.sanjay.yemle
	 */
	public void omniscriptSaveForLater() {
		logger.info("Verifying Omniscript save For later");
		waitForPageLoadTill(5);
		waitForElement(omniscriptsaveForLater);
		waitForPageLoadTill(3);
		logger.info("Verified Omniscript save for later");
	}
	
}