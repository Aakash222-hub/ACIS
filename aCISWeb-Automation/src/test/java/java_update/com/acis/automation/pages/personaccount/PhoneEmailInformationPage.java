package com.acis.automation.pages.personaccount;

import java.util.List;

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

public class PhoneEmailInformationPage extends PageBase {

	public PhoneEmailInformationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PhoneEmailInformationPage.class);
	@FindBy(xpath = "//span[text()='Phone & Email']/../..//a")
	WebElement phoneAndEmailTab;

	@FindBy(linkText = "New")
	WebElement newPhoneEmailButton;

	@FindBy(xpath = "(//span[@class='slds-radio--faux topdown-radio--faux'])[2]")
	WebElement phoneCheckBoxRadioButton;

	@FindBy(xpath = "(//span[@class='slds-radio--faux topdown-radio--faux'])[1]")
	WebElement emailCheckBoxRadioButton;

	@FindBy(xpath = "//button[.='Next']")
	WebElement nextButton;

	@FindBy(xpath = "(//span[text()='Phone Type']//..//..//a)[last()]")
	WebElement phoneTypeLists;

	@FindBy(xpath = "//*[text()='Business']")
	WebElement phoneTypeBusinessList;

	@FindBy(linkText = "//*[text()='Mobile']")
	WebElement phoneTypeMobileList;

	@FindBy(linkText = "(//span[text()='Phone Type'])/../../..//*[text()='Other'][last()]")
	WebElement phoneTypeOtherList;

	@FindBy(xpath = "(//a[@class='datePicker-openIcon display'])[1]")
	WebElement endDatePhoneButton;

	@FindBy(xpath = "(//a[@class='datePicker-openIcon display'])[2]")
	WebElement startDatePhoneButton;

	@FindBy(xpath = "//input[@type='tel']")
	WebElement phoneEntryTextBox;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//span[text()='Phone & Email'])[2]")
	WebElement phoneEmailtabButton;

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement PhoneEmaileditButton;

	@FindBy(xpath = "//button[@name='Edit']")
	WebElement editEndDate;

	@FindBy(xpath = "(//button[@name='Edit'])[2]/../../../../../..")
	WebElement editEndDate2;

	@FindBy(xpath = "(//button[@name='Edit'])[2]")
	WebElement editEndDateButton;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement editPageSaveButton;

	@FindBy(xpath = "//input[contains(@name,'ACIS_End_date__c')]")
	WebElement endDatetextarea;

	@FindBy(xpath = "//span[text()='Email Address']//..//..//input[@type='text']")
	WebElement emailTextArea;

	@FindBy(xpath = "(//a[@class='datePicker-openIcon display'])[2]")
	WebElement emailEndDate;

	@FindBy(xpath = "(//a[@class='datePicker-openIcon display'])[1]")
	WebElement emailStarDate;

	@FindBy(xpath = "//label[text()='End Date']/../..//input[@type='text'][last()]")
	WebElement changeEndDate;

	@FindBy(xpath = "(//span[text()='End Date']/../..//input)[2]")
	WebElement changeEndDate2;

	@FindBy(xpath = "//*[text()='30']")
	WebElement endDate;

	@FindBy(xpath = "//*[text()='18']")
	WebElement startDate;

	@FindBy(xpath = "(//a[@data-aura-class='forceOutputLookup'])[1]")
	WebElement phoneEmailReferenceLink;

	@FindBy(xpath = "//*[text()='26'][last()]") //// td[@data-datevalue='2020-09-30']
	WebElement editedDate;

	@FindBy(xpath = "//button[@title='Save'][last()]")
	WebElement editedDateSaveButton;

	@FindBy(xpath = "//span[text()='End Date']/../..//lightning-formatted-text")
	WebElement ChangedEndDateText;

	@FindBy(xpath = "(//span[text()='End Date']/../..//lightning-formatted-text)[2]")
	WebElement ChangedEndDateText2;

	@FindBy(xpath = "//*[contains(text(),'Close PHE-000')]//..//lightning-primitive-icon")
	WebElement closePhoneEmailTab;

	@FindBy(xpath = "//span[text()='Phone & Email ID']/../..//lightning-formatted-text")
	WebElement phoneRefrence;

	@FindBy(xpath = "(//span[text()='Phone & Email ID']/../..//lightning-formatted-text)[2]")
	WebElement emailRefrence;

	@FindBy(xpath = "//a[@data-aura-class='forceOutputLookup']")
	WebElement phoneEmailIDTable;
	
	@FindBy(xpath = "//button[@title='Close Phone & Email']")
	WebElement closePhoneEmailTabButton;
	
	@FindBy(xpath = "//a[text()='Health']")
	WebElement health;
	
	/***
	 * This method is clicking on new phone button and creating new Phone Number
	 * related to the person associated
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void creatingNewPhone() throws AcisException, Exception {

		String phoneText = testData.get(Constants.PhoneEmailPage).get("phoneText");

		try {

			logger.info("Creating Phone");
			
			waitForPageLoadTill(5);			
			waitForElementClickable(newPhoneEmailButton);
			clickWebElemntUsingJavascriptExecutor(newPhoneEmailButton);

			waitForPageLoad();
			waitForPageLoadTill(2);
			phoneCheckBoxRadioButton.click();
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(nextButton);
			waitForPageLoadTill(10);		
			clickWebElemntUsingJavascriptExecutor(phoneTypeLists);
			waitForPageLoadTill(5);
			clickWebElemntUsingJavascriptExecutor(phoneTypeBusinessList);
			waitForElementClickable(phoneEntryTextBox);
			try {
				Actions act = new Actions(driver);

				act.sendKeys(Keys.TAB).build().perform();

				act.sendKeys(Keys.ENTER).build().perform();
				act.sendKeys(Keys.CONTROL).sendKeys(phoneText).keyUp(Keys.CONTROL).perform();

				enterText(phoneEntryTextBox, phoneText);
			} catch (Exception e1) {
				enterText(phoneEntryTextBox, phoneText);
			}

			clickWebElement(endDatePhoneButton);
			waitForPageLoadTill(2);
			clickWebElemntUsingJavascriptExecutor(endDate);// end date

			clickWebElement(startDatePhoneButton);
			waitForPageLoadTill(3);
			clickWebElement(startDate);// start date

			clickWebElement(saveButton);
			logger.info("Creating new Phone Number for the user");
			waitForPageLoadTill(9);
			String phoneID = phoneRefrence.getText().trim();
			System.out.println(phoneID);
			waitForElement(phoneEmailtabButton);
			waitForPageLoadTill(8);
			clickWebElement(phoneEmailtabButton);
			waitForPageLoadTill(6);
			waitForElementClickable(closePhoneEmailTab);
			clickWebElement(closePhoneEmailTab);
			waitForPageLoad();
			waitForPageLoadTill(5);

			List<WebElement> phoneEmailID = driver.findElements(By.xpath("//a[@data-aura-class='forceOutputLookup']"));
			int totalrefrenceofPhone = phoneEmailID.size();
			for (int i = 0; i < totalrefrenceofPhone; i++) {

				System.out.println(phoneEmailID.get(i).getText().trim());
				if (phoneEmailID.get(i).getText().trim().equalsIgnoreCase(phoneID)) {

					try {
						waitForPageLoadTill(9);
						driver.findElement(By.xpath("//a[text()='" + phoneID + "']")).click();
						break;
					} catch (Exception e) {
						waitForPageLoadTill(9);
						driver.findElement(By.xpath("(//a[text()='" + phoneID + "'])[2]")).click();
						break;
					}
				}
			}
			logger.info("Selected reference no " + phoneID);
			logger.info("Created phone");
			waitForPageLoadTill(9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	/**
	 * Change the end date of the phone no created
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void editChangeEndDatePhone() throws AcisException {

		String endDatePhone = testData.get(Constants.PhoneEmailPage).get("changeEndDate");

		try {

			logger.info("Editing and changing end date of phone");
			waitForPageLoad();
			try {
				waitForPageLoadTill(3);
				clickWebElement(editEndDate2);
			} catch (Exception e) {
				waitForPageLoadTill(3);
				clickWebElemntUsingJavascriptExecutor(editEndDate2);
			}
			waitForElement(changeEndDate);
			clickWebElemntUsingJavascriptExecutor(changeEndDate);

			waitForPageLoadTill(8);
			clickWebElemntUsingJavascriptExecutor(editedDate);// edit end date
			clickWebElement(editedDateSaveButton);// editDateSave

			waitForPageLoadTill(9);

			try {

				String newEditedPhoneEndDate = ChangedEndDateText.getText().trim();
				System.out.println("Newly changed end " + newEditedPhoneEndDate);
				verifyTextEquals(ChangedEndDateText, endDatePhone);

				logger.info("Verified end Date of Phone changed Successfully");
			} catch (Exception e1) {
				String newEditedPhoneEndDate = ChangedEndDateText2.getText().trim();
				System.out.println("Newly changed end " + newEditedPhoneEndDate);
				verifyTextEquals(ChangedEndDateText2, endDatePhone);

				logger.info("Verified end Date of Phone changed Successfully");
			}

			waitForElement(phoneEmailtabButton);
			waitForPageLoadTill(8);

			try {
				waitForPageLoadTill(8);
				clickWebElement(phoneEmailtabButton);
			} catch (Exception e) {
				clickWebElemntUsingJavascriptExecutor(phoneEmailtabButton);
			}

			logger.info("End date of phone changed ");
			waitForPageLoadTill(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/***
	 * Entering Email details in New Phone& Email
	 * 
	 * @author akash.a.gaurav
	 * @throws InterruptedException
	 * @throws AcisException
	 */

	public void creatingEmailDetails() throws InterruptedException, AcisException {
		String emailInput = testData.get(Constants.PhoneEmailPage).get("emailInput");

		try {
			logger.info("Creating email details");
			clickWebElemntUsingJavascriptExecutor(newPhoneEmailButton);
			waitForPageLoad();
			waitForPageLoadTill(3);
			;
			clickWebElemntUsingJavascriptExecutor(emailCheckBoxRadioButton);
			waitForPageLoad();
			nextButton.click();
			waitForPageLoad();
			try {
				waitForPageLoadTill(3);
				enterText(emailTextArea, emailInput);
			} catch (Exception e) {
				enterTextUsingJavascript(emailTextArea, emailInput);
			}

			clickWebElement(emailEndDate);
			clickWebElement(endDate);
			clickWebElement(emailStarDate);
			waitForPageLoadTill(3);
			clickWebElement(startDate);

			clickWebElement(saveButton);
			logger.info("Creating new Email Number for the user");
			waitForPageLoadTill(9);
			String emailID = emailRefrence.getText().trim();
			System.out.println(emailID);
			waitForElement(phoneEmailtabButton);
			waitForPageLoadTill(10);
			clickWebElement(phoneEmailtabButton);
			waitForPageLoadTill(9);
			clickWebElement(closePhoneEmailTab);
			waitForPageLoad();
			waitForPageLoadTill(7);

			List<WebElement> phoneEmailID = driver.findElements(By.xpath("//a[@data-aura-class='forceOutputLookup']"));
			int totalrefrenceofEmail = phoneEmailID.size();
			for (int i = 0; i < totalrefrenceofEmail; i++) {

				System.out.println(phoneEmailID.get(i).getText().trim());
				if (phoneEmailID.get(i).getText().trim().equalsIgnoreCase(emailID)) {

					try {
						waitForPageLoadTill(9);
						driver.findElement(By.xpath("//a[text()='" + emailID + "']")).click();
						break;
					} catch (Exception e) {
						waitForPageLoadTill(9);
						driver.findElement(By.xpath("(//a[text()='" + emailID + "'])[2]")).click();
						break;
					}
				}
			}

			logger.info("Selected incident no" + emailID);
			logger.info("Email date created");

			waitForPageLoadTill(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Change the end date of the email no created
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void editChangeEndDateEmailAndVerificationChangedDate() throws AcisException {
		String endDateEmail = testData.get(Constants.PhoneEmailPage).get("changeEndDate");
		try {
			logger.info("Changing end date of email created");
			waitForPageLoad();
			try {
				clickWebElement(editEndDateButton);

			} catch (Exception e) {
				clickWebElement(editEndDate);
			}
			try {
				waitForPageLoadTill(4);
				clickWebElemntUsingJavascriptExecutor(changeEndDate);
			} catch (Exception e) {
				waitForElement(changeEndDate2);
				clickWebElement(changeEndDate2);
			}
			waitForPageLoadTill(10);
			clickWebElemntUsingJavascriptExecutor(editedDate);
			clickWebElement(editedDateSaveButton);

			waitForPageLoad();
			try {
				String newEditedPhoneEndDate = ChangedEndDateText.getText().trim();
				System.out.println("Newly changed end " + newEditedPhoneEndDate);
				verifyTextEquals(ChangedEndDateText, endDateEmail);

				logger.info("Verified end Date of Email changed Successfully");
			} catch (Exception e1) {
				String newEditedPhoneEndDate = ChangedEndDateText2.getText().trim();
				System.out.println("Newly changed end " + newEditedPhoneEndDate);
				verifyTextEquals(ChangedEndDateText2, endDateEmail);

				logger.info("Verified end Date of Email changed Successfully");
			}

			logger.info("Verified end Date of Email changed Successfully");
			waitForPageLoadTill(8);
			waitForElement(phoneEmailtabButton);
			try {
				waitForPageLoadTill(2);
				clickWebElement(phoneEmailtabButton);
			} catch (Exception e) {
				clickWebElemntUsingJavascriptExecutor(phoneEmailtabButton);
			}

			logger.info("End date of email changed ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	/**
	 * Check email & phone record with email value Primary is checked
	 * @author mrunal.s.tilekar
	 * @throws Exception 
	 */
	public void verifyRecordWithPrimaryCheck(String recordType, String recordValue) throws Exception {
		String tickMark;
		switch (recordType) {
		
		case "Email":
			logger.info("Checking Email id " +  recordValue + "Is checked as Primary");
			Assert.assertTrue((driver.findElement(By.xpath("//*[text()='Email']/../../..//a[text()='"+recordValue+"']"))).isDisplayed(),
								"Error: No matching Email record field present");
			 tickMark=driver.findElement(By.xpath("//*[text()='Email']/../../..//a[text()='"+recordValue+"']/../../../..//img")).getAttribute("alt");

			if(tickMark.equalsIgnoreCase("true")) {
				System.out.println("Email id " +  recordValue + "Is checked as Primary");
				logger.info("Email id " +  recordValue + "Is checked as Primary");
			}
			else
			{
				System.out.println("Email id " +  recordValue + "Is NOT checked as Primary");
				logger.info("Email id " +  recordValue + "Is NOT checked as Primary");
				throw new Exception("Error :Email id " +  recordValue + "Is NOT checked as Primary");
				
			}
			break;

		case "Phone":
			Assert.assertTrue((driver.findElement(By.xpath("//*[text()='Phone']/../../..//*[text()='"+recordValue+"']"))).isDisplayed(),
								"Error: No matching Phone record field present");
			tickMark=driver.findElement(By.xpath("//*[text()='Phone']/../../..//*[text()='"+recordValue+"']/../../..//img")).getAttribute("alt");

			if(tickMark.equalsIgnoreCase("true")) {
				System.out.println("Phone " +  recordValue + "Is checked as Primary");
				logger.info("Phone " +  recordValue + "Is checked as Primary");
			}
			else
			{
				System.out.println("Phone " +  recordValue + "Is NOT checked as Primary");
				logger.info("Phone" +  recordValue + "Is NOT checked as Primary");
				throw new Exception("Error :Phone " +  recordValue + "Is NOT checked as Primary");
				
			}
			break;

		default:
			logger.info("No matching order text");
			break;
		}
		
	}
	
	
	/**
	 * Close  Phone& email Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closePhoneEmailTab() throws AcisException {
		logger.info("Closing Phone& email  Tab");
		if(closePhoneEmailTabButton.isDisplayed()) {

			clickWebElemntUsingJavascriptExecutor(closePhoneEmailTabButton);
			waitForPageLoadTill(2);
		}
		logger.info("Closed Phone& email  Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForElement(health);
		logger.info("successfully Closed Phone& email  Tab");
	}
}