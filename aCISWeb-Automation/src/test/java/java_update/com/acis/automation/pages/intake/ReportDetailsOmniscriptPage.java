package com.acis.automation.pages.intake;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;


public class ReportDetailsOmniscriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(ReportDetailsOmniscriptPage.class);

	public ReportDetailsOmniscriptPage() throws AcisException {
	}
	
	Actions act = new Actions(driver);

	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement iframe;

	@FindBy(xpath = "//*[text()='Intake Date/Time']/../..//button[@title='Previous Month']")
	WebElement previousMonthIntake;
	
	@FindBy(xpath = "//*[text()='Incident Date/Time']/../..//button[@title='Previous Month']")
	WebElement previousMonthIncident;

	@FindBy(xpath = "//span[text()=18]")
	WebElement intakeDate;
	
	@FindBy(xpath = "(//span[text()=17])[2]")
	WebElement incidentDate;
	
	@FindBy(xpath = "//label[text()='Incident Date/Time']/../..//input[@name='date']")
	WebElement incidentDatePicker;

	@FindBy(xpath = "//*[@data-omni-key='IntakeDateTime']//label[text()='Intake Date/Time']/../..//input[@name='date']")
	WebElement intakeDatePicker;
	
	@FindBy(xpath = "//child[@vlc-slds-change-inline-templates='::child.eleArray[0].propSetMap.showInputWidth']/div/ng-form/div[2]/div/select[@id='IntakeMethod']")
	WebElement intakeMethodPosition;

	@FindBy(xpath = "//select[@disabled='disabled']/..//label[contains(text(),'Intake Method')]")
	WebElement intakeMethodDisabled;
	
	@FindBy(xpath = "//span[text()='Intake Method']/../../..//input")
	WebElement intakeMethodDropdown;
	
	@FindBy(xpath = "//option[text()='E-Report']")
	WebElement intakeMethodEreport;
	
	@FindBy(xpath = "//option[text()='Email']")
	WebElement intakeMethodEmail;
	
	@FindBy(xpath = "//option[text()='Face-to-Face']")
	WebElement intakeMehodFaceToFace;
	
	@FindBy(xpath = "//option[text()='Fax']")
	WebElement intakeMehodFax;

	@FindBy(xpath = "//option[text()='Letter']")
	WebElement intakeMehodLetter;

	@FindBy(xpath = "//option[text()='Phone']")
	WebElement intakeMehodPhone;

	@FindBy(xpath = "//div[@id='IntakeOverview_nextBtn']//p[text()='Next']")
	WebElement next;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//span[contains(text(),'Report Details')]")
	WebElement reporterDetailsTitle;

	@FindBy(xpath = "//span[text()='No']")
	WebElement reporterAnonymousNo;

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement reporterAnonymousYes;
	
	@FindBy(xpath = "//label[contains(text(),'Is the Reporter Anonymous?')]")
	WebElement isReporterAnonymousTitle;

	@FindBy(xpath = "//span[text()='First Name']/../../..//input")
	WebElement reportersFirstName;

	@FindBy(xpath = "//span[text()='Last Name']/../../..//input")
	WebElement reportersLastName;

	@FindBy(xpath = "//span[text()='Middle Name']/../../..//input")
	WebElement reportersMiddleName;

	@FindBy(xpath = "//span[text()='Email']/../../..//input")
	WebElement reportersEmail;
	
	@FindBy(xpath = "//label[text()='How does reporter know alleged victim?']/../../..//input")
	WebElement reportersRole;

	@FindBy(xpath = "//select[@id='ReporterSuffix']")
	WebElement reportersSuffix;

	@FindBy(xpath = "//label[text()='Phone']/../../..//input")
	WebElement reportersPhone;

	@FindBy(xpath = "//span[text()='01']")
	WebElement firstDate;

	@FindBy(xpath = "(//span[text()='01'])[1]")
	WebElement selectIncidentDate;

	@FindBy(xpath = "//option[text()='II']")
	WebElement suffix_II_option;

	@FindBy(xpath = "//span[text()='Phone']")
	WebElement phoneOption;

	@FindBy(xpath ="//label[text()='Location of Incident']/..//..//input")
	WebElement locationOfIncident;
	
	@FindBy(xpath = "//body[@data-id='mytextarea']")
	WebElement narrative;
	
	@FindBy(xpath = "//iframe[@id='mytextarea_ifr']")
	WebElement iframeNarrative;
	
	@FindBy(xpath = "//h1[normalize-space()='Person(s) Involved']")
	WebElement personInvolvePageTitle;
	
	@FindBy(xpath = "//button[contains(text(),'Today')]")
	WebElement todayDate;
	
	@FindBy(xpath = "//button[@slot='iconRight']")
	WebElement locationbtn;
	
	@FindBy(xpath = "//*[text()='Street 1']//..//..//..//input")
	WebElement street1;
	
	@FindBy(xpath = "//*[text()='City']//..//..//..//input")
	WebElement city;
	
	@FindBy(xpath = "//*[text()='Zip/Postal Code']//..//..//..//input")
	WebElement zipcode;
	
	@FindBy(xpath="//*[text()='17 Toms Dr, Bloomington, IL, USA')]")
	WebElement addresspicklist;
	
    @FindBy(xpath = "//*[text()='Address Same as Location of Incident']")
    WebElement addresssameasLocationofIncident;
    
    @FindBy(xpath = "//table/tbody/tr/th/span/a")
    WebElement personAccount;
    
    @FindBy(xpath = "//*[text()='Related']")
    WebElement related;
    
    @FindBy(xpath = "//span[@title='Addresses']")
    WebElement addresses;
  

  //Pallavi
  	@FindBy(xpath = "//*[text()='Save for later']")
  	WebElement saveForlater;
  				
  	@FindBy(xpath = "//button[text()='OK']")
  	WebElement ok;
  			
  	@FindBy(xpath = "//span[text()='Your OmniScript is saved for later']")
  	WebElement omniscriptsaveForLater;
  				
  	@FindBy(xpath = "//h1[text()='Activities In Progress']")
  	WebElement activitiesInProgress;
  				
  	@FindBy(xpath = "//div[text()='Activities In Progress']")
  	WebElement activitiesInProgressColumn;
  				
  	@FindBy(xpath = "//div[text()='Created Date/Time']")
  	WebElement createdDateTime;
  	
  	@FindBy(xpath = "//div[text()='Link to Resume Activity']")
  	WebElement linkToResumeActivity;
  				
  	@FindBy(xpath = "//tr[1]/td[4]/a")
  	WebElement clickHereToContinue;
  				
  	@FindBy(xpath = "//button[text()='Intake Record']")
  	WebElement intakeRecord;
  	
	@FindBy(xpath = "//*[@data-omni-key='IntakeDateTimeManualOverridetrue' and not(contains(@class,'slds-hide'))]")
  	WebElement intakeTimeOverrideCheck;
    
	public By reportDetailsHeader= By.xpath("//vlocity_ps-omniscript-step//h1");
	public By intakeInfo = By.xpath("//span[text()='Intake Information']");

	/**
	 * Check Override Time and Date
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void checkIntakeDateOverride() throws AcisException, InterruptedException{
		logger.info("Verifying Intake Time/Date Override");
		waitForElement(intakeTimeOverrideCheck);
		logger.info("Verified Intake Time/Date Override");
	}
	
	/**
	 * Set Incident Date/ Intake Date on Report Details Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void setDate(String field) throws AcisException, InterruptedException{
		switchToWindowBytitle("Intake | Salesforce");
		switch(field)
		{
			case "Intake" :
				logger.info("Selecting Intake Date");
				waitForElement(intakeDatePicker);
				clickWebElement(intakeDatePicker);
				waitForElement(previousMonthIntake);
				clickWebElement(previousMonthIntake);
				clickWebElement(intakeDate);
				waitForPageLoadTill(5);
				logger.info("Intake Date succesfully selected");
				break;
				
			case "Incident" :
				logger.info("Selecting Incident Date");
				waitForElement(incidentDatePicker);
				clickWebElement(incidentDatePicker);
				waitForElement(previousMonthIncident);
				clickWebElement(previousMonthIncident);
				scrollingToElementofAPage(incidentDate);
				clickWebElement(incidentDate);
				waitForPageLoadTill(5);
				logger.info("Incident Date succesfully selected");
				break;
			default : 
				   logger.info("Date: " + field +" not found");
				   break;
		}
	}

	/**
	 * Select: Intake Method
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void selectIntakeMethod() throws AcisException, InterruptedException{
		logger.info("Selecting Intake Method");
		clickWebElement(intakeMethodDropdown);
		waitForPageLoadTill(2);
		clickWebElement(phoneOption);
		logger.info("Intake Method Selected :");
	}
	

	/**
	 * Click on Next Button
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickNextBtn() throws AcisException, InterruptedException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Next button");
		waitForElement(personInvolvePageTitle);
		logger.info("PersonInvolve   Page loaded");

	}

	/**
	 * Set Reporter Anonymous : Yes
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void reporterAnonymousYes() throws AcisException, InterruptedException {
		logger.info("Selecting Reporter Anonymous as : Yes");
		clickWebElement(reporterAnonymousYes);
		logger.info("Reporter Anonymous Selected : Yes");
	}
	
	/**
	 * Set Reporter Anonymous : No with data
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void reporterAnonymousNo(String firstName , String lastName, String middleName, String phone, String email, String role) throws AcisException, InterruptedException {
		logger.info("Selecting Reporter Anonymous as : No");
		clickWebElement(reporterAnonymousNo);
		logger.info("Reporter Anonymous Selected : No");
		waitForPageLoadTill(5);
		logger.info("Entering Reporters First Name");
		waitForElement(reportersFirstName);
		enterText(reportersFirstName, firstName);
		logger.info("Entered FirstName as:" + firstName);
		logger.info("Entering Reporters Middle Name");
		enterText(reportersMiddleName, middleName);
		logger.info("Entered MiddleName as:" + middleName);
		logger.info("Entering Reporters Last Name");
		enterText(reportersLastName, lastName);
		logger.info("Entered LastName as:" + lastName);
		logger.info("Entering Reporters Email");
		enterText(reportersEmail, email);
		logger.info("Entered Email as:" + email);
		logger.info("Entering Reporters Phone");
		enterTextUsingJavascript(reportersPhone, phone);
		logger.info("Entered Phone as:" + phone);
		logger.info("Entering Reporters Role");
		enterText(reportersRole, role);
		logger.info("Entered Role as:" + role);
				
	}
	
	
	/**
	 * Enter Location of Incident
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void enterLocationOfIncident(String strText) throws AcisException, InterruptedException {
		logger.info("Entering Location of Incident as:"+strText);
		enterText(locationOfIncident, strText);
		waitForPageLoadTill(2);
		logger.info("Location of Incident entered as:"+strText);

	}
	/*
	 * Enter location of Incident
	 * varun.krish
	 */
	
	public void locationEditfield(String street,String cityname,String zip) throws AcisException,InterruptedException{
		logger.info("Verify the Edit ");
		verifyElementNotPresent(locationbtn);
//		waitForElement(addresspicklist);
//		clickWebElemntUsingJavascriptExecutor(addresspicklist);
		
		waitForPageLoadTill(5);
		waitForElement(locationbtn);
//		act.moveToElement(locationbtn).click().build().perform();
		clickWebElemntUsingJavascriptExecutor(locationbtn);
		waitForElement(street1);
		enterText(street1, street);
		waitForPageLoadTill(2);
		waitForElement(city);
		enterText(city, cityname);
		waitForPageLoadTill(2);
		waitForElement(zipcode);
		enterText(zipcode, zip);	
	}
	
	/*
	 * Selecting Address As same location of Incident checkbox
	 * varun.krish
	 */
	public void addressAsSamelocationofIncident() throws AcisException,InterruptedException{
		logger.info("Address same as Location of Incident");
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		waitForElement(addresssameasLocationofIncident);
        clickWebElement(addresssameasLocationofIncident);
	}
	
	/*
	 * Verifying Address As same location of Incident updated in the person account
	 * varun.krish
	 */
	public void verifyPersonAddress(String address) throws AcisException,InterruptedException{
		logger.info("Selecting person Account");
		waitForPageLoadTill(10);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
        waitForPageLoadTill(10);
        logger.info("Click on related tab");
        waitForElement(related);
        clickWebElement(related);
        waitForPageLoadTill(5);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        logger.info("Click on the Address tab");
        waitForElement(addresses);
        clickWebElement(addresses);
        logger.info("verifying the same address");
        waitForPageLoadTill(2);
		verifyElementNotPresent(driver.findElement(By.xpath("//span[text()='"+address+"']")));
        		
	}
	
	/**
	 * Enter Narrative
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public void enterNarrative(String strText) throws AcisException, InterruptedException, AWTException {
		logger.info("Entering Narrative as:" + strText);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(locationOfIncident);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        StringSelection path=new StringSelection(strText);
//        
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_V);
//        waitForPageLoadTill(10);
		act.sendKeys(Keys.CONTROL).sendKeys(strText).perform();
		logger.info("Narrative entered as:" + strText);

	}
	
	/***
	* @author Shreyas
	* Verifying Report Details Page
	* @throws AcisException
	*/

	 public void verifyReportDetailsPage() throws AcisException{

		 logger.info("Verifying Report Details Header");
		isElementPresent(reportDetailsHeader);
		logger.info("Verified Report Details Header");
		isElementPresent(intakeInfo);
		logger.info("Verified Intake Information");
	}
	 
	 
	 /**
		 * Set Incident Date/ Intake Date on Report Details Page
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 * @throws InterruptedException 
		 */
		public void setIntakeDateToday() throws AcisException, InterruptedException{
			switchToWindowBytitle("Intake | Salesforce");
			logger.info("Selecting Intake Date");
			waitForElement(intakeDatePicker);
			clickWebElement(intakeDatePicker);
			waitForElementClickable(todayDate);
			clickWebElement(todayDate);;
			waitForPageLoadTill(5);
			logger.info("Intake Date succesfully selected");
					
			
		}
		
		/***Click on Save For Later
		 * @author pallavi.sanjay.yemle
		 * @throws AcisException 
		 */
		public void clickSaveForLater() throws AcisException {
			logger.info("Clicking on Save for later");
			waitForElement(saveForlater);
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
		
		/*** Verify Omniscript save for Later
		 * @author pallavi.sanjay.yemle
		 */
		public void verifySaveForLater() {
			logger.info("Verifying Omniscript save For later");
			waitForPageLoadTill(5);
			waitForElement(omniscriptsaveForLater);
			waitForPageLoadTill(3);
			logger.info("Verified Omniscript save for later");
		}
		
		/***Verify Column Titles of Activities In Progress
		 * @author pallavi.sanjay.yemle
		 */
		public void verifyColumnsTitles() {
			logger.info("Verifying Column Titles of Activities In Progress");
			waitForElement(activitiesInProgress);
			waitForElement(activitiesInProgressColumn);
			waitForElement(createdDateTime);
			waitForElement(linkToResumeActivity);
			logger.info("Verified Column Titles of Activities In Progress");
		}
		
		/***Click on click Here To Continue
		 * @author pallavi.sanjay.yemle
		 * @throws AcisException 
		 */
		public void clickHereToContinue() throws AcisException {
			logger.info("Clicking on click Here To Continue");
			clickWebElemntUsingJavascriptExecutor(clickHereToContinue);
			waitForPageLoadTill(5);
			logger.info("Clicked on click Here To Continue");
		}
		
		/*** Click On Intake Record
		 * @author pallavi.sanjay.yemle
		 * @throws AcisException 
		 */
		public void clickIntakeRecord() throws AcisException {
			logger.info("Clicking on Intake Record");
			clickWebElement(intakeRecord);
			waitForPageLoadTill(5);
			logger.info("Clicked on Intake Record");
		}

}