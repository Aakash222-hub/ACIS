package com.acis.automation.pages.providermanagement;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ServiceProviderPage extends PageBase {
	final static Logger logger = LoggerFactory.getLogger(ServiceProviderPage.class);
	
	public ServiceProviderPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement usernameServiceProviderPortal;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordServiceProviderPortal;
	
	@FindBy(xpath="//span[contains(text(),'Log in')]")
	WebElement loginButtonServiceProviderPortal;
	
	@FindBy(xpath="//*[text()='Home']")
	WebElement ServiceProviderPortalHomePage;

	@FindBy(xpath="//div[@id='LoginNew']")
	WebElement loginImage;
	
	@FindBy(xpath="//div[@style='background: rgba(0, 0, 0, 0.3);']")
	WebElement citizenTheme;
	
	@FindBy(xpath="//span[text()='Service Referral ID']")
	WebElement serviceReferralID;
	
	@FindBy(xpath="//a[contains(text(),'SR-00')]")
	WebElement serviceReferralIdText;
	
	@FindBy(xpath="//div[@title='Approve']")
	WebElement approveButton;
	
	@FindBy(xpath="//span[text()='Enrollment Date']/../../..//input")
	WebElement enrollmentDateTextBox;
	
	@FindBy(xpath="//*[text()='15']")
	WebElement enrollmentDate;
	
	@FindBy(xpath="//span[text()='Discharge Date']/../../..//input")
	WebElement dischargeDateTextBox;
	
	@FindBy(xpath="//*[text()='25']")
	WebElement dischargeDate;
	
	@FindBy(xpath="//a[@title='Referrals']")
	WebElement referral;
	
	@FindBy(xpath="//a[@title='Select List View']")
	WebElement selectListView;
	
	@FindBy(xpath="(//a[@role='option'])[1]")
	WebElement selectAll;
	
	@FindBy(xpath="//button[@title='Next']")
	WebElement next;
	
	@FindBy(xpath="//h2[text()='Approve']")
	WebElement approvePage;
	
	@FindBy(xpath="//p[text()='Services Provided Record is Created successfully!']")
	WebElement SPRecordCreated;
	
	@FindBy(xpath="//span[text()='Edit Narrative']")
	WebElement editNarrative;
	
	@FindBy(xpath="//span[text()='Monthly Assessments']")
	WebElement monthlyAssesment;
	
	@FindBy(xpath="//span[text()='Client Invoices']")
	WebElement clientInvoices;
	
	@FindBy(xpath="//span[text()='Contracts']")
	WebElement contracts;
	
	@FindBy(xpath="//span[text()='Monthly Assessment ID']")
	WebElement monthlyAssessmentId;
	
	@FindBy(xpath="//a[contains(text(),'MA-00')]")
	WebElement monthlyAssessmentIdTextBox;

	@FindBy(xpath="//span[@class=' virtualAutocompleteOptionText' and text()='My monthly assessment']")
	WebElement myMonthlyAssessment;
	
	@FindBy(xpath="//div[text()='Edit']")
	WebElement EditButton;
	
	@FindBy(xpath="//span[text()='Attendance Rate']/../..//input")
	WebElement attendaceRateTextBox;
	
	@FindBy(xpath="//span[text()='Narrative']/../..//textarea")
	WebElement narrativeTextBox;
	
	@FindBy(xpath="//span[text()='Outcomes Measure']/../..//input")
	WebElement outcomeMeasureTextBox;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//span[text()='Name']")
	WebElement name;
	
	@FindBy(xpath="//span[text()='Status']")
	WebElement status;
	
	@FindBy(xpath="//span[text()='Due Date']")
	WebElement dueDate;
	
	
	
	/*** Verify front Page image
	 * @author pallavi.sanjay.yemle
	 */
	public void frontPageImage() {
		logger.info("Verifying front page image");
		waitForElement(loginImage);
		logger.info("Verified front page image");
	}
	
	/*** verify Citizen theme
	 * @author pallavi.sanjay.yemle
	 */
	public void citizenTheme() {
		logger.info("Verifying citizen Theme on all Page");
		waitForElement(citizenTheme);
		logger.info("Verified citizen theme on all Page");
	}
	
	/***Click On Referral tab
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void referralTab() throws AcisException {
		logger.info("Clicking on referral tab");
		clickWebElement(referral);
		logger.info("Clicked on referral tab");
	}
	
	/*** click on All Referral
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void allReferral() throws AcisException {
		logger.info("Click on All referral");
		clickWebElement(selectListView);
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(selectAll);
		logger.info("Clicked on All referral");
	}
	
	/*** click on service referral Id
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void serviceReferralId() throws AcisException {
		logger.info("checking service referral id");
		waitForElement(serviceReferralID);
		clickWebElement(serviceReferralIdText);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("checked service referral id");
	}
	
	/***click on Approve Button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void approveButton() throws AcisException {
		logger.info("checking on Approve button");
		clickWebElement(approveButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("checked on Approve button");
	}
	
	/***Click on Enrollment Date
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void selectEnrollmentdate() throws AcisException {
		logger.info("selecting Enrollment date");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(enrollmentDateTextBox);
		waitForPageLoadTill(3);
		clickWebElement(enrollmentDateTextBox);
		clickWebElement(enrollmentDate);
		logger.info("selected Enrollment date");
	}
	
	/***Click on Discharged Date
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void selectDischargedate() throws AcisException {
		logger.info("selecting Discharged date");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(dischargeDateTextBox);
		waitForPageLoadTill(3);
		clickWebElement(dischargeDateTextBox);
		clickWebElement(dischargeDate);
		logger.info("selected Enrollment date");
	}
	
	/***Click on Next Button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void next() throws AcisException {
		logger.info("Click on Next Button");
		clickWebElement(next);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Next Button");
	}
	
	/*** Approve Page
	 * @author pallavi.sanjay.yemle
	 */
	public void approvePage() {
		logger.info("waiting for Approve Page");
		waitForPageLoadTill(3);
		waitForElement(approvePage);
		waitForElement(SPRecordCreated);
		
	}
	/***Select My Monthly Assessment from list view
	 * @author pallavi.sanjay.yemle
	 * 
	 */
	public void myMonthlyAssessment() throws AcisException {
		logger.info("Select My Monthly Assessment");
		clickWebElement(selectListView);
		clickWebElement(myMonthlyAssessment);
		logger.info("Selected My Monthly Assessment");
	}
	
	/*** click on Monthly Assessment tab
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickMonthlyAssesmentTab() throws AcisException {
		logger.info("Click on Monthly Assessment tab");
		clickWebElement(monthlyAssesment);
		logger.info("Clicked on Monthly Assessment tab");
	}
	
	/***Check Monthly Assessment Id
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void monthlyAssessmentId() throws AcisException {
		logger.info("verify monthly Assessment Id");
		waitForElement(monthlyAssessmentId);
		waitForPageLoadTill(3);
		waitForElement(monthlyAssessmentIdTextBox);
		logger.info("verified monthly Assessment Id");
	}
	

	/***Entering text on Attendance rate outcomes measure and Narrative
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	
	public void enteringText(String option, String str1) throws AcisException {
		switch(option) {
		case "Attendance Rate":
			logger.info("Selecting Input Text :" + option);
			attendaceRateTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			waitForPageLoadTill(5);
			enterText(attendaceRateTextBox, str1);
			waitForPageLoadTill(2);
			logger.info("Selected  Input Text :" + option);
			break;
			
		case "Outecomes Measure":
			logger.info("Selecting Input Text :" + option);
			outcomeMeasureTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			waitForPageLoadTill(5);
			enterText(outcomeMeasureTextBox, str1);
			waitForPageLoadTill(2);
			logger.info("Selected  Input Text :" + option);
			break;
			
		case "Narrative":
			logger.info("Selecting Input Text :" + option);
			narrativeTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			waitForPageLoadTill(5);
			enterText(narrativeTextBox, str1);
			waitForPageLoadTill(2);
			logger.info("Selected  Input Text :" + option);
			break;
		}
	}
	
	/*** Click Save
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSave() throws AcisException {
		logger.info("Click on save button");
		clickWebElement(saveButton);
		waitForPageLoadTill(3);
		logger.info("Clicked on save button");
	}
	
	/***Able to access List view field
	 * @author pallavi.sanjay.yemle
	 */
	public void accessListViewField() {
		logger.info("Access List View field");
		waitForElement(name);
		waitForElement(status);
		waitForElement(dueDate);
		waitForElement(monthlyAssessmentId);
		logger.info("All List View field of Monthly Assessments");
	}
	/*** Switching to service portal page
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 * 
	 */
	public void switchToPortalPage() throws AcisException {
		waitForPageLoadTill(5);
		customUrL("providerPortalurl");
		waitForPageLoadTill(5);
		switchToWindowBytitle("Login");
	}
	
	/***Enter username and password to provider portal
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void enteringUsernamePassword(String str1, String str2) throws AcisException {
		logger.info("Entering text in Service Provider Portal Username");
		clickWebElement(usernameServiceProviderPortal);
		enterText(usernameServiceProviderPortal, str1);
		logger.info("Entering text in Service Provider Portal Password");
		//waitForPageLoadTill(3);
		clickWebElement(passwordServiceProviderPortal);
		//waitForPageLoadTill(3);
		
		enterText(passwordServiceProviderPortal, str2);
		
		logger.info("Entered text in Service Provider Portal passwd");
		waitForPageLoadTill(9);
	}
	
	/*** Login to provider portal
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void loginToProviderPortal() throws AcisException {
		logger.info("Clicking on login button");
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(loginButtonServiceProviderPortal);
		logger.info("Clicked on login button"); 
		waitForPageLoadTill(11);
	}
		
}
	
