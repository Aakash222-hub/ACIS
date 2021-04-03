package com.acis.automation.pages.casemanagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewComprehensiveAssessmentpage extends PageBase {

	public NewComprehensiveAssessmentpage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewComprehensiveAssessmentpage.class);

	@FindBy(xpath = "//label[contains(text(),'Start Date')]/../../..//input")
	WebElement startDate;

	@FindBy(xpath = "//*[text()='Child']/../..//input")
	WebElement childName;

	@FindBy(xpath = "//label[contains(text(),'Assessment Narrative')]/../..//textarea")
	WebElement assessmentNarrative;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement next;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;

	@FindBy(xpath = "//button[text()='Add Assessment Category']")
	WebElement addAssessmentCategory;

	@FindBy(xpath = "//*[text()='Type']/../../..//input")
	WebElement type;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//*[text()='Type']/../../..//*[text()='Social History']")
	WebElement socialHistory;

	@FindBy(xpath = "//*[text()='Type']/../../..//*[text()='Medical History']")
	WebElement medicalHistory;

	@FindBy(xpath = "//*[text()='Type']/../../..//*[text()='Mental Health']")
	WebElement mentalHealth;

	@FindBy(xpath = "//*[text()='Type']/../../..//*[text()='Dental']")
	WebElement dental;

	@FindBy(xpath = "//*[text()='Type']/../../..//*[text()='Education']")
	WebElement education;

	@FindBy(xpath = "//*[text()='Type']/../../..//*[text()='Special Needs']")
	WebElement specialNeeds;

	@FindBy(xpath = "//*[text()='Type']/../../..//*[text()='Permanency']")
	WebElement permanency;

	@FindBy(xpath = "//label[contains (text(),'Narrative')]/../../..//textarea")
	WebElement narrative;

	@FindBy(xpath = "//label[contains(text(),'Start Date')]/../../..//input")
	WebElement assessmentCategoryStartDate;

	@FindBy(xpath = "//label[contains(text(),'Due Date')]/../../..//input")
	WebElement dueDate;

	@FindBy(xpath = "//label[contains(text(),'Completion Date')]/../../..//input")
	WebElement completionDate;

	@FindBy(xpath = "(//label[contains(text(),'Start Date')]/../../..//*[text()='Pick a year']/../../..//select)[last()]")
	WebElement startDateYear;

	@FindBy(xpath = "//label[contains(text(),'Start Date')]/../../..//*[text()='20']")
	WebElement startDateday;

	@FindBy(xpath = "(//label[contains(text(),'Due Date')]/../../..//*[text()='Pick a year']/../../..//select)[last()]")
	WebElement dueDateYear;

	@FindBy(xpath = "//label[contains(text(),'Due Date')]/../../..//*[text()='20']")
	WebElement dueDateday;

	@FindBy(xpath = "(//label[contains(text(),'Completion Date')]/../../..//*[text()='Pick a year']/../../..//select)[last()]")
	WebElement completionDateYear;

	@FindBy(xpath = "//label[contains(text(),'Completion Date')]/../../..//*[text()='20']")
	WebElement completionDateday;

	@FindBy(xpath = "//label[contains(text(),'Due Date')]/../../..//*[text()='Next Month']")
	WebElement dueDateNextmonth;

	@FindBy(xpath = "//label[contains(text(),'Completion Date')]/../../..//*[text()='Next Month']")
	WebElement completionDateNextmonth;

	@FindBy(xpath = "//h1[text()='Comprehensive Assessment']")
	WebElement verifyComprehensive;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//h1[contains(text(),'Comprehensive Assessment Categories')]")
	WebElement comprehensiveAssessmentCategories;

	@FindBy(xpath = "//h1//*[text()='Assessment']")
	WebElement assessment;
	
	@FindBy(xpath="//button[text()='New Comprehensive Assessment']")
	WebElement btnNewComprehensiveAssessment;

	@FindBy(xpath="//label[text()='Child']//..//..//input")
	WebElement labelchild;

	@FindBy(xpath="//*[contains(normalize-space(),'Name:first last;Age 5;Gender:Female;Ethnicity:')]")
	WebElement childname;

	@FindBy(xpath="//button[text()='Submit']")
	WebElement btnSubmit;

	@FindBy(xpath="//span[text()='Status']//..//..//lightning-formatted-text")
	WebElement status;

	@FindBy(xpath="//button[text()='Guided Comprehensive Assessment']")
	WebElement btnGuidedComprehensiveAssessment;

	@FindBy(xpath="//button[text()='Save for later']")
	WebElement saveForLater;
			
	@FindBy(xpath="//button[text()='OK']")
	WebElement ok;
			
	@FindBy(xpath="//span[text()='Your OmniScript is saved for later']")
	WebElement omniscriptSaveForLater;
	

	/**
	 * @author Varun.krish Selecting Entering the Comprehensive Assessment Details
	 *         page
	 * @throws AcisException
	 */

	public void enterComprehensiveAssessmentDetails(String strg) throws AcisException {
		logger.info("Verify start date and time ");
		waitForPageLoadTill(2);
		enterText(assessmentNarrative, strg);
		scrollDownTillPageEnd();
		waitForElementClickable(next);
		waitForPageLoadTill(10);
		waitForElementClickable(addAssessmentCategory);
	}

	/**
	 * @author Varun.krish Selecting Selecting Assessment CategoryType
	 * @throws AcisException
	 */

	public void addAssessmentCategoryType(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "SocialHistory":
			logger.info("Selecting SocialHistory:" + subtypeOption);
			waitForElementClickable(type);
			clickWebElement(type);
			clickWebElement(socialHistory);
			logger.info("Selecting SocialHistory:" + subtypeOption);
			break;

		case "MedicalHistory":
			logger.info("Selecting MedicalHistory:" + subtypeOption);
			waitForElementClickable(type);
			waitForElementClickable(medicalHistory);
			logger.info("Selecting MedicalHistory:" + subtypeOption);
			break;

		case "Dental":
			logger.info("Selecting Dental:" + subtypeOption);
			waitForElementClickable(type);
			waitForElementClickable(dental);
			logger.info("Selecting Dental:" + subtypeOption);
			break;

		case "Education":
			logger.info("Selecting Education:" + subtypeOption);
			waitForElementClickable(type);
			waitForElementClickable(education);
			logger.info("Selecting Education:" + subtypeOption);
			break;

		case "SpecialNeeds":
			logger.info("Selecting SpecialNeeds :" + subtypeOption);
			waitForElementClickable(type);
			waitForElementClickable(education);
			logger.info("Selecting SpecialNeeds:" + subtypeOption);
			break;

		case "Permanency":
			logger.info("Selecting Permanency :" + subtypeOption);
			waitForElementClickable(type);
			waitForElementClickable(permanency);
			logger.info("Selecting Permanency:" + subtypeOption);
			break;

		default:
			logger.info("No Assessment Category type selected");
			break;
		}
	}

	/**
	 * @author Varun.krish choosing current month and date
	 * @throws AcisException
	 */

	public void selectStartDate(String month_year) throws AcisException {
		logger.info("Entering startDate");
		waitForElementClickable(assessmentCategoryStartDate);
		clickWebElement(assessmentCategoryStartDate);
		waitForPageLoadTill(2);
		waitForElementClickable(startDateYear);
		clickWebElement(startDateYear);
//	enterText(assessmentCategoryStartDate, month_year);
		Select startDateYearList = new Select(startDateYear);
		List<WebElement> elementCount = startDateYearList.getOptions();
		int iSize = elementCount.size();
		for (int i = 0; i < iSize; i++) {
			String startDateYearvalue = elementCount.get(i).getText().trim();
			// System.out.println(birthyearValue);
			if (startDateYearvalue.equalsIgnoreCase(month_year)) {
				startDateYearList.selectByVisibleText(month_year);
				logger.info(" matching startdateyear Value");
				break;
			} else {
				System.out.println("No matching year Value");
				logger.info("No matching year Value");
			}

		}

		clickWebElement(startDateday);
		logger.info("StartDate entered");

	}

	/**
	 * @author Varun.krish choosing next month from current month
	 * @throws AcisException
	 */

	public void selectDueDate(String month_year) throws AcisException {
		logger.info("Entering startDate");
		waitForElementClickable(dueDate);
		clickWebElement(dueDate);
		waitForPageLoadTill(2);
		waitForElementClickable(dueDateYear);
		clickWebElement(dueDateYear);
//	enterText(assessmentCategoryStartDate, month_year);
		Select dueDateYearList = new Select(dueDateYear);
		List<WebElement> elementCount = dueDateYearList.getOptions();
		int iSize = elementCount.size();
		for (int i = 0; i < iSize; i++) {
			String dueDateYearvalue = elementCount.get(i).getText().trim();
			// System.out.println(birthyearValue);
			if (dueDateYearvalue.equalsIgnoreCase(month_year)) {
				dueDateYearList.selectByVisibleText(month_year);
				logger.info(" matching duedateyear Value");
				break;
			} else {
				System.out.println("No matching year Value");
				logger.info("No matching year Value");
			}

		}
		clickWebElement(dueDateday);
		waitForPageLoadTill(2);
	//	clickWebElement(startDateday);
		logger.info("DueDate entered");

	}

	/**
	 * @author Varun.krish choosing two month from current month and entering
	 *         narrative and save
	 * @throws AcisException
	 */

	public void selectCompletionDate(String month_year) throws AcisException {
		logger.info("Entering startDate");
		waitForElementClickable(completionDate);
		clickWebElement(completionDate);
		waitForPageLoadTill(2);
		waitForElementClickable(completionDateYear);
		clickWebElement(completionDateYear);
//	enterText(assessmentCategoryStartDate, month_year);
		Select completionDateList = new Select(completionDateYear);
		List<WebElement> elementCount = completionDateList.getOptions();
		int iSize = elementCount.size();
		for (int i = 0; i < iSize; i++) {
			String completionDatevalue = elementCount.get(i).getText().trim();
			// System.out.println(birthyearValue);
			if (completionDatevalue.equalsIgnoreCase(month_year)) {
				completionDateList.selectByVisibleText(month_year);
				logger.info(" matching completiondateyear Value");
				break;
			} else {
				System.out.println("No matching year Value");
				logger.info("No matching year Value");
			}

		}
		clickWebElement(completionDateNextmonth);
		waitForPageLoadTill(2);
		clickWebElement(completionDateNextmonth);
		waitForPageLoadTill(2);
		clickWebElement(completionDateday);
		waitForPageLoadTill(2);
		clickWebElement(narrative);
		waitForPageLoadTill(2);
		clickWebElement(save);
		logger.info("completionDate entered");

	}

	/**
	 * enter value in Name textbox
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void enterTextNameTextbox(String name) throws AcisException {
		logger.info("Entering name : " + name);
		waitForElement(verifyComprehensive);
		waitForPageLoadTill(5);
		enterText(childName, name);
		waitForPageLoadTill(5);
		clickWebElement(childName);
		waitForPageLoadTill(10);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'" + name + "')])"))).click().perform();
		waitForPageLoadTill(5);
		logger.info("Entered name : " + name);
	}

	/**
	 * click submit button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickSubmitButton() throws AcisException {
		logger.info("Clicking on submit button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(submitButton);
		scrollingToElementofAPage(submitButton);
		clickWebElement(submitButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on submit button");
		waitForPageLoad();
		waitForPageLoadTill(10);
		waitForElement(assessment);
		logger.info("Successfully clicked on submit button");

	}

	/**
	 * click next button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Next button");
		waitForElement(comprehensiveAssessmentCategories);
		logger.info("Select Meeting Location  Page loaded");
	}

	/**
	 * close window
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeWindow() throws AcisException {
		logger.info("Closing Windows");
		closeWindowsExceptParent();
		logger.info("Closed Windows");

	}
	/* click on New Assessment
	 * 
	 * By khushboo
	 */
	public void clickOnNewComprehenssieAssessment() throws AcisException {
		logger.info("clicking on button");
		clickWebElement(btnNewComprehensiveAssessment);
		logger.info("clicked on button");

	}
	/* Field child on New Assessment
	 * 
	 * By khushboo
	 */
	public void enterchild() throws AcisException {
		logger.info("enter child  on text field");
		clickWebElement(labelchild);
		enterText(labelchild, "Name:first last;Age 5;Gender:Female;Ethnicity:");
		//clickWebElement(childName);
		logger.info("enter child  on text field");

	}

	/*click on submit button
	 * 
	 */
	public void btnsubmit() throws AcisException{
		logger.info("Clicking on submit button");
		clickWebElemntUsingJavascriptExecutor(btnSubmit);
		logger.info("clicked on submit button");

	}
	/*click on submit button
	 * 
	 */
	public void checkStatus() throws AcisException{
		logger.info("checking status ");
		String textstatus=status.getText();
		logger.info("Status is"+textstatus);
		logger.info("checked status");

	}
	/*click on Guided Comprehensive Assessment
	 * 
	 * 
	 */
	public void clickOnGuidedComprehsenssiveAssesment() throws AcisException{
		logger.info("clicking on button");
		clickWebElement(btnGuidedComprehensiveAssessment);
		logger.info("clicked on button");

	}
	/*click on Next Button Comprehensive Assessment
	 * 
	 * 
	 */
	public void clickOnNextButton() throws AcisException{
		logger.info("clicking on Next button");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitForElementClickable(next);
		scrollingToElementofAPage(next);
		clickWebElemntUsingJavascriptExecutor(next);
		logger.info("clicked on next button");

	}
	/*click on Next Button Comprehensive Assessment
	 * 
	 * khushboo
	 */
	public void clickAddAssessment() throws AcisException{
		logger.info("clicking on Add assessment button");
		clickWebElement(addAssessmentCategory);
		logger.info("clicked on Add assessment button");

	}
	/*
	 * 
	 */
	public void clickonsave() throws AcisException{
		clickWebElement(save);
		logger.info("saved button");


	}
	
	/*** Click Save For Later
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSaveForLater() throws AcisException {
		logger.info("Clicking on Save For Later");
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(saveForLater);
		//clickWebElement(saveForLater);
		waitForPageLoadTill(5);
		logger.info("Clicked on Save For Later");
	}
	
	/*** Click OK
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickOk() throws AcisException {
		logger.info("Clicking on OK Button");
		waitForPageLoad();
		clickWebElement(ok);
		waitForPageLoadTill(5);
		logger.info("Clicked on OK button");
	}
	
	/*** Click OmniScript is saved for later
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void omniscriptSaveForLater() throws AcisException {
		logger.info("Verify OmniScript is saved for later");
		waitForPageLoad();
		waitForElement(omniscriptSaveForLater);
		
		waitForPageLoadTill(5);
		logger.info("Verified OmniScript is saved for later");
	}

}
