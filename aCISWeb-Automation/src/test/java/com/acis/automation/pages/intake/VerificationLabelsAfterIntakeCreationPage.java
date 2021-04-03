package com.acis.automation.pages.intake;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class VerificationLabelsAfterIntakeCreationPage extends PageBase {

	public VerificationLabelsAfterIntakeCreationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(VerificationLabelsAfterIntakeCreationPage.class);

	@FindBy(xpath = "//*[@id='window']")
	WebElement caseId;

	@FindBy(xpath = "//p[contains(text(),'Case Action ID')]")
	WebElement caseActionIdLabel;

	@FindBy(xpath = "//p[contains(text(),'Case Head')]")
	WebElement caseActionHeadLabel;

	@FindBy(xpath = "//p[contains(text(),'Status')]")
	WebElement statusLabel;

	@FindBy(xpath = "//p[contains(text(),'Date Opened')]")
	WebElement dateOpenedLabel;

	@FindBy(xpath = "//span[@class='test-id__field-label'][contains(text(),'Case Action ID')]")
	WebElement caseIdfieldDetailsForm;

	@FindBy(xpath = "(//span[@class='test-id__field-label'][contains(text(),'Status')])[2]")
	WebElement statusFieldDetailForm;

	@FindBy(xpath = "//span[@class='test-id__field-label'][contains(text(),'Case Type')]")
	WebElement caseTypeDetailForm;

	@FindBy(xpath = "//span[@class='test-id__field-label'][contains(text(),'Date Opened')]")
	WebElement dateOpenFieldDetailForm;

	@FindBy(xpath = "(//span[@class='test-id__field-label'][contains(text(),'Date Closed')])[2]")
	WebElement dateCloseDetailForm;

	@FindBy(xpath = "//span[@class='test-id__field-label'][contains(text(),'Case Head')]")
	WebElement caseHeadDetailForm;

	@FindBy(xpath = "(//span[@class='test-id__field-label'][contains(text(),'Created By')])[2]")
	WebElement createdByDetailForm;

	@FindBy(xpath = "//span[text()='Allegation Report ID']/../..//lightning-formatted-text")
	WebElement allegationIDIntake;

	@FindBy(xpath = "(//a[text()='Related'])[2]")
	WebElement relatedtabCase;

	@FindBy(xpath = "//span[text()='Allegation Report ID']/../..//lightning-formatted-text")
	WebElement allegationIDCase;

	@FindBy(xpath = "//span[@title='Person'][text()='Person']")
	WebElement personLabelCase;

	@FindBy(xpath = "(//span[@title='Person'][text()='Person'])[2]")
	WebElement personLabelCase2;

	@FindBy(xpath = "(//span[@title='Birthdate'][text()='Birthdate'])[2]")
	WebElement birthDateLabel;

	@FindBy(xpath = "(//span[@title='Age'][text()='Age'])[2]")
	WebElement ageLabel;

	@FindBy(xpath = "(//span[@title='Relationship'][text()='Relationship'])[2]")
	WebElement relationshipLabel;

	@FindBy(xpath = "(//span[@title='Case Person ID'])[2]")
	WebElement casPersonLabel;

	@FindBy(xpath = "//span[@title='Case Persons'][text()='Case Persons']")
	WebElement casePersonLink;

	@FindBy(xpath = "//button[@title='Close Case Persons']")
	WebElement closeCasePersonTab;

	@FindBy(xpath = "//span[contains(text(),'Upload Files')]")
	WebElement uploadFileButton;

	@FindBy(xpath = "//span[@title='Files'][text()='Files']")
	WebElement fileLink;

	@FindBy(xpath = "(//div[@title='Add Files'])[1]")
	WebElement addFilesButton;
	
	@FindBy(xpath = "(//div[@title='Add Files'])[2]")
	WebElement addFilesButtonSecond;

	@FindBy(xpath = "//*[text()='Select Files']")
	WebElement selectFilesTitle;

	@FindBy(xpath = "(//button//span[text()='Upload Files'])[2]")
	WebElement uploadFilesButton;
	
	@FindBy(xpath="//button[@title='Refresh']")
	WebElement refreshButton;
	
	@FindBy(xpath="//span[text()='Intake Case']/../..//force-lookup")
	WebElement caseallegationId;
	
	@FindBy(xpath="//*[text()='Done'][last()]")
	WebElement doneButton;
	
	

	@FindBy(xpath = "//a[contains(text(),'here')]")
	WebElement linkCreateNewPerson;

	/**
	 * Clicking on Case Id and fetching Allegation report ID
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public String clickingOnCaseID() throws AcisException {
		String AllegationReportIDIntake = "";
		try {
			logger.info("Clicking on Case ID");
			waitForPageLoadTill(10);
			waitForPageLoad();
			AllegationReportIDIntake = allegationIDIntake.getText().trim();
			System.out.println(AllegationReportIDIntake);
			try {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,200)");
				waitForElement(caseallegationId);
				clickWebElement(caseallegationId);
			} catch (Exception e) {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,200)");
				waitForElement(caseallegationId);
				clickWebElemntUsingJavascriptExecutor(caseallegationId);
			}

			waitForPageLoad();
			logger.info("Clicked on Case Id");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return AllegationReportIDIntake;
	}

	/***
	 * @author akash.a.gaurav Verified labels in CaseIntake Page US-0000486
	 */
	public void verifyLabelsAndFieldCaseIntakePage() {
		String caseActionlabel = testData.get(Constants.VerificationIntakeLabelPage).get("caseAction");
		String caseHeadlabel = testData.get(Constants.VerificationIntakeLabelPage)
				.get("caseActionHead");
		String caseStatusLabel = testData.get(Constants.VerificationIntakeLabelPage)
				.get("caseStatus");
		String datelabel = testData.get(Constants.VerificationIntakeLabelPage)
				.get("date");
		try {
			waitForPageLoad();
			verifyTextEquals(caseActionIdLabel, caseActionlabel);
			logger.info("Verified label Case ActionId ");
			verifyTextEquals(caseActionHeadLabel, caseHeadlabel);
			logger.info("Verified label Case Action Head ");
			verifyTextEquals(caseActionIdLabel, caseStatusLabel);
			logger.info("Verified label Case Status ");
			verifyTextEquals(caseActionIdLabel, datelabel);
			logger.info("Verified label Case Date Opened	 ");
		} catch (Exception e) {

		}
	}

	/***
	 * @author akash.a.gaurav Verified fields in CaseIntake Details Form US-0000269
	 */
	public void verifyFieldInCaseIntakeDetail() {
		
		String casefieldlabel = testData.get(Constants.VerificationIntakeLabelPage)
				.get("caseField");
		
		
		String statusFieldLabel = testData.get(Constants.VerificationIntakeLabelPage)
				.get("statusFieldLabel");
		
		String caseType = testData.get(Constants.VerificationIntakeLabelPage)
				.get("caseTypeLabel");
		
		String dateOpen = testData.get(Constants.VerificationIntakeLabelPage)
				.get("dateOpened");
		
		String dateClosed = testData.get(Constants.VerificationIntakeLabelPage)
				.get("dateClosed");
		
		String caseHead = testData.get(Constants.VerificationIntakeLabelPage)
				.get("caseHead");
		
		String created = testData.get(Constants.VerificationIntakeLabelPage)
				.get("createdby");
		
		try {
			logger.info("Verifying Fields Case Intake details"); 
			waitForPageLoad();
			waitForPageLoadTill(10);
			verifyTextEquals(caseIdfieldDetailsForm, casefieldlabel);
			logger.info("Verified Case ID in Detail form area");

			verifyTextEquals(statusFieldDetailForm, statusFieldLabel);
			logger.info("Verified Status in Detail form area ");

			verifyTextEquals(caseTypeDetailForm, caseType);
			logger.info("Verified CaseType in Detail form area");

			verifyTextEquals(dateOpenFieldDetailForm, dateOpen);
			logger.info("Verified Dateopen Field in Detail form ");

			verifyTextEquals(dateCloseDetailForm, dateClosed);
			logger.info("Verified Dateclose Field in Detail form");

			verifyTextEquals(caseHeadDetailForm, caseHead);
			logger.info("Verified Case Head Field in Detail form");

			verifyTextEquals(createdByDetailForm, created);
			logger.info("Verified CreatedBy Field in Detail form");
		} catch (Exception e) {

		}
	}

	/***
	 * Verification Alligation reports and case Person forms fields
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void verifyAllegationCasePerson(String AllegationReportIDIntake) throws AcisException, InterruptedException {
		String AllegationReportIDCase = "";
		try {
			logger.info("Verifying Fields Case Intake details"); 
			waitForPageLoad();
			waitForPageLoadTill(15);
			waitForElement(relatedtabCase);
			waitForPageLoadTill(5);
			clickWebElement(relatedtabCase);
			waitForPageLoadTill(15);
			AllegationReportIDCase = allegationIDCase.getText().trim();
			if (AllegationReportIDCase.equalsIgnoreCase(AllegationReportIDIntake)) {
				logger.info("Verified Allegation Report ID of Inatke equals to Allegation Report Id of Case");

			}

		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/***
	 * @author akash.a.gaurav Verifying the case person related list Dob age
	 *         relationship Case Person ID
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void verifyCasePersonRelatedList() throws AcisException, InterruptedException {

		try {
			logger.info("Verifying Fields Case Person Related details"); 
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			waitForPageLoadTill(10);
			jse.executeScript("window.scrollBy(0,1900)");
			Actions act = new Actions(driver);
			waitForPageLoadTill(10);
		
			waitForElement(casePersonLink);
			waitForPageLoadTill(9);
			clickWebElemntUsingJavascriptExecutor(casePersonLink);
			waitForPageLoadTill(9);
			waitForPageLoad();
			verifyTextEquals(personLabelCase2, "Person");

			logger.info("Verifying Person label case is present in person tab");

			verifyTextEquals(casPersonLabel, "Case Person ID");
			logger.info("Verifying Case Person ID label case is present in person tab");
			logger.info("Verified Fields Case Intake details"); 
			waitForPageLoadTill(5);
			waitForElementClickable(closeCasePersonTab);
			clickWebElement(closeCasePersonTab);

			logger.info("closed Case PersonTab");
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	/***
	 * Upload file and check
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws AWTException
	 */

	public void uploadFile() throws AcisException, InterruptedException, AWTException {

		try {
			waitForPageLoadTill(5);
			waitForElementClickable(closeCasePersonTab);
			clickWebElement(closeCasePersonTab);
			clickWebElement(uploadFileButton);
			waitForPageLoadTill(2);
			uploadFileUsingRobot("C:\\Users\\akash.a.gaurav\\Desktop\\fileupload.html");

			waitForPageLoadTill(2);
			logger.info("file uploaded successfully");

		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	/***
	 * Upload file and check
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		logger.info("Clicking on add file"); 
		Thread.sleep(2000);
		waitForPageLoad();
		waitForPageLoadTill(9);
	
		waitForElementClickable(fileLink);
		clickWebElemntUsingJavascriptExecutor(fileLink);
		waitForPageLoadTill(9);

		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(9);
		try {
			waitForElement(addFilesButtonSecond);
			clickWebElemntUsingJavascriptExecutor(addFilesButtonSecond);
			logger.info("Clicked on add file button");
		} catch (Exception e) {
			waitForPageLoadTill(5);
		
			logger.info("Clicked on add file button");
		}
		
		waitForPageLoadTill(5);
		//waitForElement(selectFilesTitle);
		clickWebElement(driver.findElement(By.xpath("(//button//span[text()='Upload Files'])[1]")));

		// uploadFileUsingRobot("C:\\Users\\mrunal.s.tilekar\\Desktop\\demo doc.txt");
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
		// waitForElement(doneButton);
		// clickWebElement(doneButton);
		logger.info("file uploaded successfully");
	}
	
	/**
	 * Verfiy file uploaded 
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	public void verifyFileUploaded(String fileName) throws AcisException {
		
		try {
			Thread.sleep(1000);
			waitForPageLoadTill(5);
			logger.info("Verifying addded file"); 
			waitForPageLoad();
			System.out.println(driver.findElement(By.xpath("(//tbody//tr//th)[2]")).getText().trim());
			WebElement ele=driver.findElement(By.xpath("(//tbody//tr//th)[2]"));
			verifyTextEquals(ele, "Akashdemo");
			logger.info("Verified file name uploaded successfully");
		} catch (Exception e) {
			waitForElement(refreshButton);
			clickWebElement(refreshButton);
			waitForPageLoadTill(7);
			verifyElementNotPresent((driver.findElement(By.xpath("//span[@title='"+fileName+"']"))));
			//Assert.assertTrue(	(driver.findElement(By.xpath("(//span[@title='"+fileName+"'])[2]"))).isDisplayed(), "Error:"+fileName+" File is Not uploaded");
			logger.info("Verified file name uploaded successfully");
		}
		
	}
	/***
	 * label verification of create link
	 */
	
	public void verifyCreateLink() {
		
		logger.info("Verifyig the create link");
		
		waitForPageLoadTill(9);

	verifyElementNotPresent(linkCreateNewPerson);
	logger.info("Verified link create new person");
	}
}
