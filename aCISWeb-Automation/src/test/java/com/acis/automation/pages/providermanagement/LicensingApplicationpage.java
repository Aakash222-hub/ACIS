package com.acis.automation.pages.providermanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class LicensingApplicationpage extends PageBase {

	public LicensingApplicationpage() throws AcisException {

		// TODO Auto-generated constructor stub
		super();

	}

	public static Logger logger = LoggerFactory.getLogger(LicensingApplicationpage.class);

	@FindBy(xpath = "//span[@title ='Licensing Applications']")
	WebElement licensingApplication;
	
	@FindBy(xpath = "//div[@title='New']")
	WebElement newlicensingApplicationbtn;

	@FindBy(xpath = "//*[text()='Licensing Application']/../..//input")
	WebElement licenseApplicationName;

	@FindBy(xpath = "//*[text()='Female Age Min. Interested in Fostering']/../..//input")
	WebElement femaleAgeMinTextbox;

	@FindBy(xpath = "//*[text()='Male Age Max. Interested in Fostering']/../..//input")
	WebElement maleAgeMaxTextbox;

	@FindBy(xpath = "//*[text()='Male Age Min. Interested in Fostering']/../..//input")
	WebElement maleAgeMinTextbox;

	@FindBy(xpath = "//*[text()='Female Age Max. Interested in Fostering']/../..//input")
	WebElement femaleAgeMaxTextbox;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement Savebtn;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitbtn;

	@FindBy(xpath = "//button[@type=\"button\" and @data-aura-class=\"uiButton\"]//span[text()='Save']")
	WebElement submitSavebtn;

	@FindBy(xpath = "//*[text()=\"Please complete all the licensing activities before submitting the licensing application.\"]")
	WebElement activityErrorMessage;

	@FindBy(xpath = "//*[text()='This record is locked. If you need to edit it, contact your admin.']")
	WebElement lockedErrorMessage;

	@FindBy(xpath = "//*[text()='Please capture the recommendation before submitting the licensing application.']")
	WebElement RecommendationErrorMessage;

	@FindBy(xpath = "//h2[text()='New Licensing Application']")
	WebElement newLicensingApplicationpage;

	@FindBy(xpath = "//a[@id='relatedListsTab__item' and @aria-controls='tab-5']")
	WebElement relatedtab;

	@FindBy(xpath = "//*[text()='Related']")
	WebElement accountRelatedtab;

	@FindBy(xpath = "//*[@aria-controls='tab-4']")
	WebElement detailtab;

	@FindBy(xpath = "//*[@data-component-id='CMTD_EnhancedRelatedList']//button[contains(text(),'New')]")
	WebElement checklistForApplicant;

	@FindBy(xpath = "//*[(text()='Licensing Application')]/.././/input")
	WebElement licensingApplicationSearch;

	@FindBy(xpath = "//*[(text()='Licensing Application Activity')]/.././/input")
	WebElement LicensingActivity;

	@FindBy(xpath = "//*[(text()='Standards Met?')]/.././/input")
	WebElement standardsMet;

	@FindBy(xpath = "//*[(text()='Standards Met?')]/../../../..//*[text()='Meets']")
	WebElement meets;

	@FindBy(xpath = "//*[(text()='Standards Met?')]/../../../..//*[text()='Doesn't meet']")
	WebElement doesntmeet;

	@FindBy(xpath = "//*[(text()='Standards Met?')]/../../../..//*[text()='Has Concerns']")
	WebElement hasConcerns;

	@FindBy(xpath = "//span[text()='Licensing Application']/../..//a/span")
	WebElement licensingApplicationname;

	@FindBy(xpath = "//button[@title='Edit Recommendation']")
	WebElement editrecommendation;

	@FindBy(xpath = "//label[text()='Recommendation']//../..//textarea")
	WebElement recommendation;

	@FindBy(xpath = "//*[text()='ACIS Licensing worker is requesting approval for licensing application']")
	WebElement approvalnotification;

	@FindBy(xpath = "//*[@data-key='notification']")
	WebElement notification;

	@FindBy(xpath = "//div[@title='Approve']")
	WebElement approvalbtn;

	@FindBy(xpath = "//button[2]/span[text()='Approve']")
	WebElement commentSectionApprovalbtn;

	@FindBy(xpath = "//span[text()='Comments']/../..//textarea")
	WebElement commentstextbox;

	@FindBy(xpath = "//slot/lightning-formatted-text[text()='Licensed'][1]")
	WebElement verifystatus;
	
	
	@FindBy(xpath = "//input[@role='textbox']")
	WebElement globalSearchDropdown;
	
	@FindBy(xpath = "//lightning-base-combobox-item[@role='option']//span[text()='All']")
	WebElement globalSearchDropdownAll;
	
	@FindBy(xpath = "//input[contains(@title,'Search')]")
	WebElement globalSearchtextbox;
	
	@FindBy(xpath = "//table/tbody/tr/th/span/a")
	WebElement placementAccount;
	
	@FindBy(xpath="//*[@title='Edit Female Age Max. Interested in Fostering']")
	WebElement femaleMaxAge;
	
	@FindBy(xpath ="//*[text()='Female Age Max. Interested in Fostering']/../..//input")
	WebElement femaleMaxAgeTextbox;
	
	@FindBy(xpath = "//*[text()='Placement Resource']//../..//input")
	WebElement placementResource;

	Actions action = new Actions(driver);

	public void clickLicenseApplicationTab() throws AcisException {
		logger.info("Clicking on New Person Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(licensingApplication);
		clickWebElemntUsingJavascriptExecutor(licensingApplication);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(licensingApplication);
		logger.info("Clicked on New Person Tab");

	}
	

	public void clickNewLicenseApplication() throws AcisException {
		logger.info("Clicking on New Button");
		refreshPage();
		waitForElement(newlicensingApplicationbtn);
		clickWebElement(newlicensingApplicationbtn);
		waitForElement(newLicensingApplicationpage);
		logger.info("Clicked on Site Locations Button");
	}

	public void enterapplicationdetails(String name) throws AcisException {
		logger.info("Enter the License Application Information");
		refreshPage();
		waitForPageLoadTill(10);
		waitForElement(licenseApplicationName);
		clickWebElement(licenseApplicationName);
		enterText(licenseApplicationName, name);
//		waitForElement(femaleAgeMinTextbox);
//		clickWebElement(femaleAgeMinTextbox);
//		enterText(femaleAgeMinTextbox, "5");
//		waitForElement(femaleAgeMaxTextbox);
//		clickWebElement(femaleAgeMaxTextbox);
//		enterText(femaleAgeMaxTextbox, "16");
//		scrollingToElementofAPage(maleAgeMinTextbox);
////		scrollUsingPixel(i);
//		waitForElement(maleAgeMinTextbox);
//		clickWebElement(maleAgeMinTextbox);
//		enterText(maleAgeMinTextbox, "5");
//		waitForElement(maleAgeMaxTextbox);
//		clickWebElement(maleAgeMaxTextbox);
//		enterText(maleAgeMaxTextbox, "16");
//		scrollingToElementofAPage(placementResource);
//		waitForElement(placementResource);
//		clickWebElement(placementResource);
//		enterText(placementResource, name);
//		waitForPageLoadTill(5);
//		action.sendKeys(Keys.ENTER).build().perform();
//		waitForPageLoadTill(7);
//		action.sendKeys(Keys.TAB).build().perform();
//		action.sendKeys(Keys.TAB).build().perform();
//		action.sendKeys(Keys.TAB).build().perform();
//		action.sendKeys(Keys.TAB).build().perform();
//		action.sendKeys(Keys.TAB).build().perform();
//		action.sendKeys(Keys.TAB).build().perform();
//		action.sendKeys(Keys.ENTER).build().perform();
	}

	public void saveButton() throws AcisException {
		logger.info("Click on save button");
		scrollingToElementofAPage(Savebtn);
		waitForElement(Savebtn);
		clickWebElement(Savebtn);

	}

	public void clicksubmit() throws AcisException {

		logger.info("Click on Submit button");
		waitForPageLoadTill(10);
		action.sendKeys(Keys.HOME).build().perform();
		action.sendKeys(Keys.HOME).build().perform();
		waitForElement(submitbtn);
		clickWebElement(submitbtn);
		waitForPageLoadTill(5);
	}

	public void checklistForApplicant() throws AcisException {
		logger.info("Click on the Related tab");
		waitForPageLoadTill(2);
		refreshPage();
		waitForElement(relatedtab);
		clickWebElement(relatedtab);
//		waitForPageLoadTill(5);
	}

	public void clickonNewApplicant() throws AcisException {

		logger.info("Click on the New Apllicant");
		waitForPageLoadTill(5);
		waitForElement(checklistForApplicant);
//		clickWebElement(checklistForApplicant);
		clickWebElemntUsingJavascriptExecutor(checklistForApplicant);
	}

	public void submitSavebtn() throws AcisException {

		logger.info("Click on the save button");
		waitForPageLoadTill(5);
		waitForElement(submitSavebtn);
		clickWebElement(submitSavebtn);
		waitForPageLoadTill(5);
	}

	public void verifyActivityErrormessage() throws AcisException {
		logger.info("verifying the Error Message");
		waitForPageLoadTill(5);
		verifyElementNotPresent(activityErrorMessage);
		verifyTextEquals(activityErrorMessage,
				"Please complete all the licensing activities before submitting the licensing application.");
		waitForPageLoadTill(5);
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForPageLoadTill(2);
	}

	public void verifylockedErrormessage() throws AcisException{
		logger.info("verifying the Error message");
		waitForPageLoadTill(5);
		verifyElementNotPresent(lockedErrorMessage);
		verifyTextEquals(lockedErrorMessage, "This record is locked. If you need to edit it, contact your admin.");
	}

	public void verifyRecommendationErrorMessage() throws AcisException {
		logger.info("Verifying the Error Message");
		waitForPageLoadTill(10);
		verifyElementNotPresent(RecommendationErrorMessage);
		verifyTextEquals(RecommendationErrorMessage,
				"Please capture the recommendation before submitting the licensing application.");
		action.sendKeys(Keys.ESCAPE).build().perform();
		refreshPage();

	}
	
	public void verifymaxageErrorMessage() throws AcisException{
		
		logger.info("verifying the Error Message");
		waitForPageLoadTill(10);
		waitForElement(femaleMaxAge);
		clickWebElement(femaleMaxAge);
		waitForElement(femaleAgeMaxTextbox);
		clickWebElement(femaleMaxAgeTextbox);
		enterText(femaleMaxAgeTextbox, "21");
	}

	public void editRecommendation(String comments) throws AcisException {
		logger.info("Edit Recommendation text box");
		waitForPageLoadTill(5);
		waitForElement(editrecommendation);
		clickWebElement(editrecommendation);
		scrollingToElementofAPage(recommendation);
		waitForElement(recommendation);
		clickWebElement(recommendation);
		enterText(recommendation, comments);

	}

	public void searchForLicensingapplications(String Activity) throws AcisException {
		logger.info("searching the licensing Application");
		waitForPageLoadTill(35);
		scrollingToElementofAPage(LicensingActivity);
		waitForElement(LicensingActivity);
		clickWebElement(LicensingActivity);
		enterText(LicensingActivity, Activity);
		waitForPageLoadTill(10);
		action.sendKeys(Keys.ENTER).build().perform();
		waitForPageLoadTill(10);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		waitForPageLoadTill(10);
		action.sendKeys(Keys.ENTER).build().perform();
//		waitForElement(licensingApplicationSearch);
//		clickWebElement(licensingApplicationSearch);
//		enterText(licensingApplicationSearch, "krish");
//		action.moveToElement(driver.findElement(By.xpath("licensingApplicationSearch"))).click().perform();
	}

	public void clickonLicensingApplication() throws AcisException {
		waitForPageLoadTill(2);
		waitForElement(licensingApplicationname);
		clickWebElement(licensingApplicationname);

	}

	public void clickonNotification() throws AcisException {

		waitForPageLoadTill(2);
		waitForElement(notification);
		clickWebElement(notification);
		waitForPageLoadTill(2);
		waitForElement(approvalnotification);
		clickWebElement(approvalnotification);
	}

	public void approval() throws AcisException {

		waitForPageLoadTill(5);
		waitForElement(approvalbtn);
		clickWebElement(approvalbtn);

	}

	public void enterComments() throws AcisException {

		waitForPageLoadTill(3);
		waitForElement(commentstextbox);
		clickWebElement(commentstextbox);
		enterText(commentstextbox, "Approve");
		waitForElement(commentSectionApprovalbtn);
		clickWebElement(commentSectionApprovalbtn);

	}

	public void verifyStatus() throws AcisException {

		waitForPageLoad();
		waitForElement(verifystatus);
		verifyElementNotPresent(verifystatus);
		verifyTextEquals(verifystatus, "Licensed");
		refreshPage();
		waitForElement(accountRelatedtab);
		clickWebElement(accountRelatedtab);
	}
	
	public void searchAccountRecord(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on Global Search");
		waitForElementClickable(globalSearchDropdown);
		clickWebElement(globalSearchDropdown);
		logger.info("Clicked on Global Search");	
		logger.info("selecting All on Global Search Dropdown");
		waitForElementClickable(globalSearchDropdownAll);
		clickWebElement(globalSearchDropdownAll);
		logger.info("selected All on Global Search Dropdown");
		waitForPageLoadTill(10);
		testLoggerInfo("Entering Text on Global Search " + strText);
		logger.info("Entering Text on Global Search " + strText);
		waitForElement(globalSearchtextbox);
		clickWebElement(globalSearchtextbox);
		globalSearchtextbox.sendKeys(strText);
		action.sendKeys(Keys.ENTER).build().perform();
		waitForPageLoadTill(5);
		logger.info("click on search " + strText);
		waitForElement(driver.findElement(By.xpath("//a[@title='"+ strText+"']")));
		clickWebElement(driver.findElement(By.xpath("//a[@title='"+ strText+"']")));
		waitForPageLoadTill(5);
	}
	
	public void clickonaaprovedApplicant(String strText ) throws AcisException{
		logger.info("Approved Applicant"+strText);
		refreshPage();
		waitForPageLoadTill(5);	
		waitForElement(placementAccount);
		clickWebElement(placementAccount);
		
	}
	
	
	

	public void selectStandardsMet(String typeOption) throws AcisException {
		switch (typeOption) {
		case "Meets":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(standardsMet);
			clickWebElement(meets);
			waitForPageLoadTill(2);
			logger.info("Selected Subtype as :" + typeOption);
			break;

		case "Doesn't Meet":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(standardsMet);
			clickWebElement(doesntmeet);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;

		case "HasConcerns":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(standardsMet);
			clickWebElement(hasConcerns);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;

		}
	}

}
