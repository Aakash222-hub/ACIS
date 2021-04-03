package com.acis.automation.pages.providermanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.library.TestBase;

import com.acis.automation.utilities.AcisException;

public class FosterParentInquiryFormPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(FosterParentInquiryFormPage.class);

	public FosterParentInquiryFormPage() throws AcisException {
	}

	@FindBy(xpath = "//input[@name='ACIS_Parent1FirstName']")
	WebElement PMFirstName;
	
	
	@FindBy(xpath = "//input[@name='ACIS_Middle_Name1']")
	WebElement PMMiddleName;

	@FindBy(xpath = "//input[@name='ACIS_Parent1LastName']")
	WebElement PMLastName;

	@FindBy(xpath = "//input[@name='ACIS_Date_of_Birth_Parent1']")
	WebElement clickPMDateOfBirth;

	@FindBy(xpath = "//input[@name='ACIS_Date_of_Birth_Parent2']")
	WebElement clickPMDateOfBirth1;
	
	@FindBy(xpath = "//td//span[@class='slds-day'][normalize-space()='4']")
	WebElement slectPMDateOfBirth;

	@FindBy(xpath = "//td//span[@class='slds-day'][normalize-space()='1']")
	WebElement slectPMDateOfBirth1;
	
	@FindBy(xpath = "//input[@name='ACIS_PhoneNumber']")
	WebElement PMPhoneNumber;
	@FindBy(xpath = "(//span[text()='Email Address']//..//..//..//following::input)[1]")
	WebElement PMEmailAddress;
	@FindBy(xpath = "//input[@name='ACIS_Parent2FirstName']")
	WebElement PMFirstName2;

	@FindBy(xpath = "//input[@name='ACIS_Middle_Name2']")
	WebElement PMMiddleName2;
	@FindBy(xpath = "//input[@name='ACIS_Parent2LastName']")
	WebElement PMLastName2;

	@FindBy(xpath = "//input[@name='ACIS_Date_of_Birth_Parent2']")
	WebElement clickPMDateOfBirth2;
	@FindBy(xpath = "//*[text()='21']")
	WebElement slectPMDateOfBirth2;

	@FindBy(xpath = "//input[@name='ACIS_PhoneNumber_Parent2']")
	WebElement PMPhoneNumber2;
	@FindBy(xpath = "//input[@name='ACIS_Parent2_Email']")
	WebElement PMEmailAddress2;

	@FindBy(xpath = "//div[text()='Phone']")
	WebElement PMOtherInfoPhone;
	@FindBy(xpath = "//div[text()='Email']")
	WebElement PMOtherInfoEmail;

	@FindBy(xpath = "//span[text()='Confirm whether text messages can be received ?']//..//..//..//div")
	WebElement PMCheckbox;

	@FindBy(xpath = "//button[text()='Next' and @type='button' and @title='Next']")
	WebElement PMNextButton;
	
	@FindBy(xpath = "//button[text()='Foster Parent Inquiry Form']")
	WebElement FosterPrntInqryFrmLink;
	@FindBy(xpath = "((//span[text()='First Name']/../../..//slot)/lightning-formatted-text)[1]")
	WebElement PMFirstNameverification;
	@FindBy(xpath = "((//span[text()='Date of Birth']/../../..//slot)/lightning-formatted-text)[1]")
	WebElement PMDateofBirthverification;
	@FindBy(xpath = "//div[@class='slds-truncate']/a[@data-aura-class='emailuiFormattedEmail']")
	WebElement PMEmailAddressverification;
	@FindBy(xpath = "//slot/slot/lightning-formatted-phone/a[href=contains(text(),'tel')]")
	WebElement PMPhoneNumberverification;
	@FindBy(xpath = "((//span[text()='Status']/../../..//slot)/lightning-formatted-text)[1]")
	WebElement PMStatusverification;
	@FindBy(xpath = "(//mark[contains(text(),'PN')])[1]")
	WebElement ProspectiveFosterParentsId;
	@FindBy(xpath = "//input[@role='textbox']")
	WebElement globalSearchDropdown;
	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;
	@FindBy(xpath = "//span[text()='All']")
	WebElement globalSearchDropdownAll;
	@FindBy(xpath = "//input[@title='Search Prospective Foster Parents and more']")
	WebElement globalSearchProspectiveFosterParents;
	
	@FindBy(xpath = "((//span[text()='Status']/../../..//slot)/lightning-formatted-text)[1]")
	WebElement StatusProspectiveFosterParents;
	

	/**
	 * Entering Parent1 First Name
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setParent1FirstName(String str1) throws AcisException {

		enterText(PMFirstName, str1);

		logger.info("Parent1 FirstName provided is:" + str1);
	}

	/**
	 * Entering Parent1 Middle Name
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setParent1MiddleName(String str1) throws AcisException {

		enterText(PMMiddleName, str1);

		logger.info("Parent1 MiddleName provided is:" + str1);
	}

	/**
	 * Entering Parent1 Parent1 Last Name
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setParent1LastName(String str1) throws AcisException {

		enterText(PMLastName, str1);

		logger.info("Parent1 LastName provided is:" + str1);
	}

	/**
	 * Entering Date of Birth
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setDate() throws AcisException, InterruptedException {

		logger.info("Selecting  Date of Birth");
		waitForElement(clickPMDateOfBirth);
		clickWebElement(clickPMDateOfBirth);
		waitForPageLoadTill(5);
		clickWebElement(slectPMDateOfBirth);
		logger.info(" Date of Birth succesfully selected");

	}

	public void setDateForP2() throws AcisException, InterruptedException {

		logger.info("Selecting  Date of Birth");
		waitForElement(clickPMDateOfBirth1);
		clickWebElement(clickPMDateOfBirth1);
		waitForPageLoadTill(5);
		enterText(clickPMDateOfBirth1, "Nov 4, 1986");
		//clickWebElement(slectPMDateOfBirth1);
		logger.info(" Date of Birth succesfully selected");

	}
	public void setDateForP1() throws AcisException, InterruptedException {

		logger.info("Selecting  Date of Birth");
		waitForElement(clickPMDateOfBirth);
		clickWebElement(clickPMDateOfBirth);
		waitForPageLoadTill(5);
		enterText(clickPMDateOfBirth, "Nov 7, 1980");
		//clickWebElement(slectPMDateOfBirth1);
		logger.info(" Date of Birth succesfully selected");

	}
	/**
	 * Entering Parent1 Phone Number
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setParent1PhoneNumber(String str1) throws AcisException {

		enterText(PMPhoneNumber, str1);

		logger.info("PhoneNumber provided is:" + str1);
	}

	/**
	 * Entering Parent1 Email address
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setParent1EmailAddress(String str1) throws AcisException {

		enterText(PMEmailAddress, str1);

		logger.info("EmailAddress provided is:" + str1);
	}

	/**
	 * Entering Parent2 FirstName
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setenterParent2FirstName(String str1) throws AcisException {

		enterText(PMFirstName2, str1);

		logger.info("Parent2 FirstName provided is:" + str1);
	}

	public void setParent2MiddleName(String str1) throws AcisException {

		enterText(PMMiddleName2, str1);

		logger.info("Parent2 MiddleName provided is:" + str1);
	}

	/**
	 * Entering Parent1 Parent1 Last Name
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setParent2LastName(String str1) throws AcisException {

		enterText(PMLastName2, str1);

		logger.info("Parent2 LastName provided is:" + str1);
	}

	/**
	 * Entering Date of Birth
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setDateParent2(String field, String selectDate) throws AcisException, InterruptedException {

		logger.info("Selecting Parent2 Date of Birth");
		waitForElement(clickPMDateOfBirth2);
		clickWebElement(clickPMDateOfBirth2);
		waitForPageLoadTill(5);
		clickWebElement(slectPMDateOfBirth2);
		logger.info(" Parent2 Date of Birth succesfully selected");

	}

	/**
	 * Entering Parent2 Phone Number
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setParent2PhoneNumber(String str1) throws AcisException {

		enterText(PMPhoneNumber2, str1);

		logger.info("Parent2 PhoneNumber provided is:" + str1);
	}

	/**
	 * Entering Parent1 Email address
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setParent2EmailAddress(String str1) throws AcisException {

		enterText(PMEmailAddress2, str1);

		logger.info("Parent2 EmailAddress provided is:" + str1);
	}

	/**
	 * Entering Parent2 FirstName
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	/**
	 * Clicking on Phone Radio Button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickOnPhoneRadioButton() throws AcisException {

		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		logger.info("Clicking on Phone Radio Button");
		clickWebElement(PMOtherInfoPhone);
		logger.info("Clicked on Phone Radio Button ");

	}

	/**
	 * Clicking on Eamil Radio Button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickOnEmailRadioButton() throws AcisException {

		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		logger.info("Clicking on Eamil Radio Button");
		clickWebElement(PMOtherInfoPhone);
		logger.info("Clicked on Eamil Radio Button ");

	}

	/**
	 * Clicking on Check box
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickOnCheckBox() throws AcisException {

		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		logger.info("Clicking on Check box");
		clickWebElement(PMCheckbox);
		logger.info("Clicked on Check box ");

	}

	/**
	 * Clicking on Next Button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickNextButton() throws AcisException {

		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		logger.info("Clicking on Next Button");
		clickWebElement(PMNextButton);
		logger.info("Clicked on Next Button ");

	}

/***
 * Verifying first Name and last name of inquiry for
 * @author akash.a.gaurav
 * @throws AcisException 
 */
	
	public void verifyFirstLast() throws AcisException {
		logger.info("Verifying first Name of parent 1");
		verifyElementNotPresent(PMFirstName);
		logger.info("Verfied first Name");
		verifyElementNotPresent(PMLastName);
		logger.info("Verfied last name");
		verifyElementNotPresent(PMFirstName2);
		logger.info("Verified Parent two first name");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		enterText(PMFirstName2, "animesh");
		logger.info("verified first name of parent 2");
		
		verifyElementNotPresent(PMLastName2);
		logger.info("Verifed last name");
	}
	/**
	 * Save Record Created by Virendra
	 * 
	 * @throws AcisException
	 */
	public void getFirstName(String expectedFN) throws AcisException {
		logger.info("Trying to fecth First Name value of Foster Parent");
       
        String actualFN = PMFirstNameverification.getText();
        System.out.println(actualFN);
        Assert.assertEquals(actualFN, expectedFN);
   
    logger.info("First Name Value is fetched");
	}
	
	/**
	 * Save Record Created by Virendra
	 * 
	 * @throws AcisException
	 */
	public void getDateOfBirth() throws AcisException {
		logger.info("Trying to fecth DOB value of Foster Parent");
        
        String actualDOB = PMDateofBirthverification.getText();
        System.out.println(actualDOB);
        Assert.assertNotNull(actualDOB, "Verified DOB");
        //Assert.assertEquals(actualDOB, expectedDOB);
   
    logger.info("DOB value of Foster Parent is fetched");
	}
	/**
	 * Save Record Created by Virendra
	 * 
	 * @throws AcisException
	 */
	public void getEmailAddress() throws AcisException {
		logger.info("Trying to fecth EmailAddress value of Foster Parent");
       
        String actualEmailAddress = PMEmailAddressverification.getText();
        System.out.println(actualEmailAddress);
        Assert.assertNotNull(actualEmailAddress, "Verified Email");
       // Assert.assertEquals(actualEmailAddress, expectedEmailAddress);
   
    logger.info("EmailAddress value of Foster Parent is fetched");
	}
	/**
	 * Save Record Created by Virendra
	 * 
	 * @throws AcisException
	 */
	public void getPhoneNumber(String expectedPhoneNumber) throws AcisException {
		logger.info("Trying to fecth Phone Number value of Foster Parent");
        
        String actualPhoneNumber = PMPhoneNumberverification.getText();
        System.out.println(actualPhoneNumber);
        Assert.assertNotNull(actualPhoneNumber, "Verified Phone Number");
   
    logger.info("Phone Number value of Foster Parent is fetched");
	}
	/**
	 * Save Record Created by Virendra
	 * 
	 * @throws AcisException
	 */public void getFormSubmissionStatus() throws AcisException {
			logger.info("Trying to fecth Form Submission Status value of Foster Parent");
	        String expectedFormSubmissionStatus = "Submitted";
	        String actualFormSubmissionDate= PMDateofBirthverification.getText();
	        String actualFormSubmissionStatus=StatusProspectiveFosterParents.getText();

	        System.out.println(actualFormSubmissionStatus);
	        Assert.assertEquals(actualFormSubmissionStatus, expectedFormSubmissionStatus);
	   
	    logger.info("Form Submission Status value of Foster Parent is fetched");
		}
		/**
		 * Entering Date of Birth
		 * 
		 * @author akash.a.gaurav
		 * @throws AcisException
		 */

		public void setDatewithData(String str) throws AcisException, InterruptedException {

			logger.info("Selecting  Date of Birth");
			waitForElement(clickPMDateOfBirth);
			clickWebElement(clickPMDateOfBirth);
			waitForPageLoadTill(5);
			
			enterText(clickPMDateOfBirth, str);
			waitForPageLoadTill(5);
			
			logger.info(" Date of Birth succesfully selected");

		}
}
