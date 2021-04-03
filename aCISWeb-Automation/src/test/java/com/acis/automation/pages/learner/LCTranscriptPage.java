package com.acis.automation.pages.learner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

/**
 * /** This class is for defining objects of Leaner Center page and defining
 * methods on those objects.
 * 
 * @author Chandrashekhar.Reddy
 * @since 15 Feb 2018
 *
 */

public class LCTranscriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(LCTranscriptPage.class);

	public LCTranscriptPage() throws AcisException {
	}

	@FindBy(xpath = "//*[text()='Transcript']")
	private WebElement linkTranscript;

	@FindBy(id = "historyEnabledLinks_Main_Calendar")
	private WebElement linkCalendar;

	@FindBy(id = "aDetailsView")
	private WebElement linkDetailView;

	@FindBy(xpath = "//*[@id='rightArrow']")
	private WebElement linkRightArrow;

	By modelDialogBox = By.xpath("//*[@class='modal-dialog']");

	String strCertificateHeader = "//*[text()='ABC']";

	String strCertificateFooter = "//*[text()='ABC']";

	@FindBy(xpath = "//*[@title='View/Email/Print']")
	private WebElement linkViewEmailPrintCertificate;

	@FindBy(xpath = "//*[@title='Email Certificate']")
	private WebElement linkEmailCertificate;

	@FindBy(xpath = "//*[@title='Print Certificate in PDF']")
	private WebElement linkPrintCertificate;

	@FindBy(xpath = "//*[@title='Download Certificate in PDF']")
	private WebElement linkDownloadCertificate;

	By imageCertificateOfCompletionLocator = By.xpath("//*[contains(@src,'images/certi.gif')]");
	By imageSuccessfullyCompletedLocator = By.xpath("//*[contains(@src,'images/success.gif')]");

	By imagelogoLocator = By.id("imgLogoPath");

	@FindBy(xpath = "//*[contains(@src,'images/success.gif')]/preceding::font[1]")
	WebElement textFirstLastName;

	@FindBy(xpath = "//*[contains(@src,'images/success.gif')]/following::font[1]")
	WebElement textCoursename;

	@FindBy(xpath = "//*[contains(@src,'images/success.gif')]/following::font[2]")
	WebElement textCompletionDate;

	By textCertificateNumber = By.xpath("//*[text()='Certificate Number']");

	/**
	 * This method is used to click on Transcript tab on Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 22 Oct 2019
	 */

	public LCTranscriptPage clickOnTranscriptFromLC() throws AcisException {
		waitForPageLoad();
		waitForElement(linkTranscript);
		clickWebElement(linkTranscript);
		waitForPageLoad();

		testLoggerInfo("Clicked on 'Transcript' link from Learner Center");
		logger.info("Clicked on 'Transcript' link from Learner Center");
		return this;
	}

	/**
	 * This method is used to click on Detail view tab on Learner Center Transcript
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 22 Oct 2019
	 */

	public LCTranscriptPage clickOnDetailView() throws AcisException {
		waitForPageLoad();
		waitForElement(linkDetailView);
		clickWebElement(linkDetailView);
		waitForPageLoad();
		waitForElement(linkRightArrow);

		testLoggerInfo("Clicked on 'DetailView' link from Learner Center");
		logger.info("Clicked on 'DetailView' link from Learner Center");
		return this;
	}

	/**
	 * This method is used to click on View Certificate icon on Learner Center
	 * Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage clickOnViewCertificateLink() throws AcisException {
		waitForPageLoad();
		// scrollingToElementofAPage(linkViewEmailPrintCertificate);
		waitForElement(linkViewEmailPrintCertificate);
		clickWebElement(linkViewEmailPrintCertificate);
		waitForPageLoad();
		testLoggerInfo("Clicked on 'View/Email/Print' link from Learner Center");
		logger.info("Clicked on 'View/Email/Print' link from Learner Center");
		return this;
	}

	/**
	 * This method is used to click on View Certificate icon on Learner Center
	 * Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 24 Oct 2019
	 */

	public LCTranscriptPage clickCertificateIsOpenedInModelDialogPopup() throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(modelDialogBox);				
		testLoggerInfo("After clicking on View Certificate link, Certificate is Opened in modal-dialog Popup");
		logger.info("After clicking on View Certificate link, Certificate is Opened in modal-dialog Popup");
		return this;
	}

	/**
	 * This method is used to verify Course Name on Learner Center Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyCourseNameOnCertificate(String coursename) throws AcisException {
		waitForElement(textCoursename);
		Assert.assertEquals(textCoursename.getText().trim(), coursename,
				"Verifed that expected Course Name '" + coursename + "' is not displayed on certificate as expected");
		waitForPageLoad();
		testLoggerPass(
				"Verifed that expected Course Name '" + coursename + "' is displayed on certificate as expected");
		logger.info("Verifed that expected Course Name '" + coursename + "' is displayed on certificate as expected");
		return this;
	}

	/**
	 * This method is used to verify Completed Date on Learner Center Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyCompletedDateOnCertificate(String completionDate) throws AcisException {
		waitForElement(textCompletionDate);
		Assert.assertEquals(textCompletionDate.getText().trim(), "Completed On : " + completionDate,
				"Verifed that expected Completed Date '" + completionDate
						+ "' is not displayed on certificate as expected");

		if (textCompletionDate.getText().trim().equals("Completed On : " + completionDate))
			waitForPageLoad();
		testLoggerPass("Verifed that expected Completed Date '" + completionDate
				+ "' is displayed on certificate as expected");
		logger.info("Verifed that expected Completed Date '" + completionDate
				+ "' is displayed on certificate as expected");
		return this;
	}

	/**
	 * This method is used to verify Completed Date on Learner Center Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyFirstNameLastNameOnCertificate(String firstName, String lastName)
			throws AcisException {
		waitForElement(textFirstLastName);
		Assert.assertTrue(
				textFirstLastName.getText().trim().contains(firstName)
						&& textFirstLastName.getText().trim().contains(lastName),
				"Verifed that expected First Name '" + firstName + "' &  Last Name '" + lastName
						+ "' is not displayed on certificate as expected");
		waitForPageLoad();
		testLoggerPass("Verifed that expected First Name '" + firstName + "' &  Last Name '" + lastName
				+ "' is displayed on certificate as expected");
		logger.info("Verifed that expected First Name '" + firstName + "' &  Last Name '" + lastName
				+ "' is displayed on certificate as expected");
		return this;
	}

	/**
	 * This method is used to verify Completed Date on Learner Center Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyEmailCertificateLinkOnCertificate() throws AcisException {
		waitForElement(linkEmailCertificate);
		Assert.assertEquals(linkEmailCertificate.getAttribute("title").trim(), "Email Certificate",
				"Verifed that 'Email Certificate' Link is not displayed on Certificate");
		waitForPageLoad();
		testLoggerPass("Verifed that 'Email Certificate' Link is displayed on Certificate");
		logger.info("Verifed that 'Email Certificate' Link is displayed on Certificate");
		return this;
	}
	
	
	
	@FindBy(xpath = "//*[@class='span-msg-success']")
	private WebElement toastMessageEmailSentSuccess;
	
	/**
	 * This method is used to verify Completed Date on Learner Center Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifySuccessMsgAfterCertificateEmailSent() throws AcisException {	
		waitForElement(linkEmailCertificate);
		clickWebElement(linkEmailCertificate);
		waitForElement(toastMessageEmailSentSuccess);
		
		Assert.assertEquals(toastMessageEmailSentSuccess.getText().trim(), "Email sent successfully.",
				"Verifed that 'Email Certificate' Link is not displayed on Certificate");
		waitForPageLoad();
		testLoggerPass("Verifed that 'Email Certificate' Link is not displayed on Certificate");
		logger.info("Verifed that 'Email Certificate' Link is not displayed on Certificate");
		return this;
	}

	/**
	 * This method is used to verify Completed Date on Learner Center Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyPrintCertificateLinkOnCertificate() throws AcisException {
		waitForElement(linkPrintCertificate);
		Assert.assertEquals(linkPrintCertificate.getAttribute("title").trim(), "Print Certificate in PDF",
				"Verifed that 'Email Certificate' Link is not displayed on Certificate");
		waitForPageLoad();
		testLoggerPass("Verifed that 'Print Certificate in PDF' Link is not displayed on Certificate");
		logger.info("Verifed that 'Print Certificate in PDF' Link is not displayed on Certificate");
		return this;
	}

	/**
	 * This method is used to verify Completed Date on Learner Center Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyDownloadCertificateLinkOnCertificate() throws AcisException {
		waitForElement(linkDownloadCertificate);
		Assert.assertEquals(linkDownloadCertificate.getAttribute("title").trim(), "Download Certificate in PDF",
				"Verifed that 'Email Certificate' Link is not displayed on Certificate");
		waitForPageLoad();
		testLoggerPass("Verifed that 'Download Certificate in PDF' Link is not displayed on Certificate");
		logger.info("Verifed that 'Download Certificate in PDF' Link is not displayed on Certificate");
		return this;
	}

	/**
	 * This method is used to verify Header and Footer should not be displayed On customized Certificate at Learner Center Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyHeaderFooterDoesNotDisplayedOnCustomizedCertificate() throws AcisException {
		waitForPageLoad();
		
		waitForElement(textFirstLastName);

		By textCertificateHeaderLocator = By.xpath(strCertificateHeader.replace("ABC",
				testData.get(Constants.COURSES_SHEET).get("HeaderCustomCertificate")));		
	
		Assert.assertFalse(!isElementPresent(textCertificateHeaderLocator), "Header is displayed on Customized Certificate which is not expected");

		testLoggerPass("Verifed that Header is not displayed on Customized Certificate as expected");
		logger.info("Verifed that Header is not displayed on Customized Certificate as expected");

		By textCertificateFooterLocator = By.xpath(strCertificateFooter.replace("ABC",
				testData.get(Constants.COURSES_SHEET).get("FooterCustomCertificate")));
		Assert.assertFalse(!isElementPresent(textCertificateFooterLocator), "Footer is displayed on Customized Certificate which is not expected");

		testLoggerPass("Verifed that Footer is not displayed on Customized Certificate as expected");
		logger.info("Verifed that Footer is not displayed on Customized Certificate as expected");

		return this;
	}

	/**
	 * This method is used to verify Header Footer displayed On customized Certificate at Learner Center Transcript
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyHeaderFooterDisplayedOnCustomizedCertificate() throws AcisException {
		waitForElement(textFirstLastName);
		By textCertificateHeaderLocator = By.xpath(
				strCertificateHeader.replace("ABC", testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName4")));

		Assert.assertTrue(isElementPresent(textCertificateHeaderLocator), "Header is not displayed on Customized Certificate which is not expected");

		testLoggerPass("Verifed that Header is displayed on Customized Certificate as expected");
		logger.info("Verifed that Header is displayed on Customized Certificate as expected");

		By textCertificateFooterLocator = By.xpath(
				strCertificateFooter.replace("ABC", testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName4")));
		Assert.assertTrue(isElementPresent(textCertificateFooterLocator), "Footer is not displayed on Customized Certificate which is not expected");

		testLoggerPass("Verifed that Footer is displayed on Customized Certificate as expected");
		logger.info("Verifed that Footer is displayed on Customized Certificate as expected");

		return this;

	}

	/**
	 * This method is used to verify Certificate Number label On Certificate at Learner Center Transcript
	 *  
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyCertificateNumberOnCertificate() throws AcisException {
		waitForElement(textFirstLastName);
		waitAndVerifyElement(textCertificateNumber);
		testLoggerPass("Verifed that label 'Certificate Number' is displayed on Certificate");
		logger.info("Verifed that label 'Certificate Number' is displayed on Certificate");
		return this;
	}
	

	/**
	 * This method is to click on 'Download Certificate in PDF' link on Certificate 
	 *
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @throws InterruptedException
	 * @since 7 Aug 2019
	 */
	public LCTranscriptPage clickDownloadCertificatetLink() throws AcisException, InterruptedException {
		if (currentBrowserName.equalsIgnoreCase(Constants.FF_BROWSER)
				|| currentBrowserName.equalsIgnoreCase(Constants.CHROME_BROWSER)) {
			deleteAlreadyDownloadedReportFiles("Certificate", ".pdf");
			waitForElement(linkDownloadCertificate);
			clickWebElement(linkDownloadCertificate);
			logger.info("Clicked on 'Download Certificate in PDF' link");
			testLoggerInfo("Clicked on 'Download Certificate in PDF' link");
			waitForPageLoad();
			Thread.sleep(3000);
		} else {
			testLoggerSkip("Unable to handle download in Current browser using selenium  " + currentBrowserName);
			logger.info("Unable to handle download in Current browser using selenium  " + currentBrowserName);

			ITestResult testResult = Reporter.getCurrentTestResult();
			testResult.setStatus(ITestResult.SKIP);

			logger.info("Test case skipped due to skip exception");
			testLoggerSkip("Test case skipped due to skip exception occured");

			throw new SkipException("Test case skipped due to skip exception occured");
		}

		return this;
	}
	
	/**
	 * This method is used to verify Certificate is downloaded
	 * 
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 Oct 2019
	 */

	public LCTranscriptPage verifyCertificateIsDownloaded(String strFileName) throws AcisException {		
		Assert.assertTrue((strFileName.contains("Certificate"))&&(strFileName.contains(".pdf")),"Cerificate is not downloaded successfully");
		testLoggerPass("Cerificate is downloaded successfully");
		logger.info("Cerificate is downloaded successfully");
		return this;
	}
	
	
	
			
		
		
}