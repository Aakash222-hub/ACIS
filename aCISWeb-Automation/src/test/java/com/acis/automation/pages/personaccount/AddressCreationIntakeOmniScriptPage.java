package com.acis.automation.pages.personaccount;

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

public class AddressCreationIntakeOmniScriptPage extends PageBase {

	public AddressCreationIntakeOmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(AddressCreationIntakeOmniScriptPage.class);

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	@FindBy(xpath = "(//dt[text()='Person']//..//..//a)[1]")
	WebElement name;

	@FindBy(xpath = "//span[text()='down icon']")
	WebElement downButton;

	@FindBy(xpath = "(//span[text()='down icon'])[1]")
	WebElement downButton2;

	@FindBy(xpath = "//span[text()='Edit']/../..//a")
	WebElement editButton;

	@FindBy(xpath = "//button[text()='Continue']")
	WebElement continueButton;

	@FindBy(xpath = "(//button[text()='Save'])[last()]")
	WebElement saveButton;

	@FindBy(xpath = "(//button[text()='Save'])[1]")
	WebElement savebutton1;

	@FindBy(xpath = "//button[text()='OK']//..//..//lightning-button")
	WebElement okAlert;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	WebElement saveButtonSecond;

	@FindBy(xpath = "(//div[contains(text(),'Akash')])[1]")
	WebElement fullName;

	@FindBy(xpath = "//div[contains(text(),'2000')]")
	WebElement datePersonInformation;

	@FindBy(xpath = "(//a[text()='Related'])[2]")
	WebElement realtedTab;

	@FindBy(xpath = "//a[text()='Related']")
	WebElement realtedTab2;

	@FindBy(xpath = "//span[@title='Addresses']")
	WebElement addressesTab;

	@FindBy(xpath = "//button[text()='Intake Record']")
	WebElement guidedIntake;

	@FindBy(xpath = "(//span[@title='Addresses'])[2]")
	WebElement addressesTab2;

	@FindBy(xpath = "//a[@title='Show 2 more actions']")
	WebElement downArrowAddressBar;

	@FindBy(xpath = "//a[@title='Edit']")
	WebElement editButtonAddress;

	@FindBy(xpath = "(//span[text()='Primary Address']//..//..//input)[2]")
	WebElement primaryCheck;

	@FindBy(xpath = "(//span[text()='Primary Address']//..//..//input)[1]")
	WebElement primaryCheck1;

	@FindBy(xpath = "(//a[contains(@title,'ADR')])[2]")
	WebElement addressLink;

	@FindBy(xpath = "//span[text()='Street 1']/../..//lightning-formatted-text")
	WebElement addressStreet1;

	@FindBy(xpath = "//span[text()='Street 1']/../..//lightning-formatted-text")
	WebElement addressStreet2;

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement Edit;

	@FindBy(xpath = "(//button[text()='Edit'])[2]")
	WebElement Edit2;

	@FindBy(xpath = "(//span[contains(text(),'Primary Address')]/../span)[1]")
	WebElement primaryAddressCheckBox;

	@FindBy(xpath = "//span[contains(text(),'Primary Address')]")
	WebElement primaryAddressText;
	
	@FindBy(xpath="(//span[@title='Person']//lightning-formatted-url//a)[2]")
	WebElement personLink;

	/**
	 * Owner : @author akash.a.gaurav Description: this method is clicking the edit
	 * buttton of person intake information
	 * 
	 * @throws AcisException
	 */
	public void clickingDownButtonPersonInvolve() throws AcisException {
		try {
			waitForElementClickable(nextButton);
			scrollingToElementofAPage(nextButton);
			clickWebElement(nextButton);
			waitForPageLoadTill(9);
		
			try {
				// clickWebElement(continueButton);
				waitForPageLoadTill(8);
				waitForElementNew(downButton, 6);
				clickWebElemntUsingJavascriptExecutor(downButton);
			} catch (Exception e) {
				waitForElementNew(downButton2, 6);
				clickWebElement(downButton2);
			}
			waitForElementNew(editButton, 4);
			clickWebElement(editButton);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/***
	 * This method clicking on save button person intake information
	 * 
	 * @param option
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickSaveButtonPersonInvolveOmniScript(String option) throws AcisException, InterruptedException {
		logger.info("Clicking on SaveButton Person involve");
		switch (option) {
		case "first":
			waitForPageLoadTill(9);
			scrollingToElementofAPage(saveButton);
			waitForElementClickable(saveButton);
			try {
				waitForPageLoadTill(9);
				scrollingToElementofAPage(saveButton);
				waitForElementClickable(saveButton);
				clickWebElement(saveButton);
				waitForPageLoadTill(9);
			} catch (AcisException e) {
				waitForElementClickable(saveButton);
				clickWebElement(saveButton);
			}
			logger.info("Clicked on save button of person intake information");
			break;
		case "second":
			clickWebElement(saveButtonSecond);
			Thread.sleep(5000);
			logger.info("Clicked on save button");
			break;
		}
		waitForPageLoadTill(5);

	}

	/***
	 * Capturing full name and using as xpath in next step
	 * 
	 * @author akash.a.gaurav
	 */

	public String captureFullName() {
		String personName = "";

		try {
			logger.info("Clicking and capturing person name");
			waitForPageLoadTill(9);
			personName = fullName.getText().trim();
			System.out.println(personName);
			logger.info(" captured person name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personName;
	}

	/***
	 * This method caputre date of birth
	 * 
	 */

	public String captureDateofBirth() {
		String dateofBirth = "";
		try {
			logger.info("Clicking and capturing date name");
			waitForPageLoadTill(9);
			dateofBirth = datePersonInformation.getText().trim();
			System.out.println(dateofBirth);
			logger.info("Captured date");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dateofBirth;

	}

	/***
	 * Clicking on the name in the allegation report page and opening the address
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * 
	 */

	public void navigatingtoAddressTab() throws AcisException, InterruptedException {
		try {
             Thread.sleep(1000);
			waitForPageLoad();
			String firstName = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName");
			String middleName = testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName");
			String lastName = testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName");
			System.out.println(firstName +lastName);
			logger.info("Clicking name and navigating to address tab");

		
				waitForPageLoadTill(5);

				//clickWebElemntUsingJavascriptExecutor(name);
				/*
				 * System.out.println(driver.findElement(By.xpath("//a[text()='" + firstName +
				 * " " + middleName + " " + lastName + "']")).getText());
				 * clickWebElemntUsingJavascriptExecutor(driver
				 * .findElement(By.xpath("//a[text()='" + firstName + " " + middleName + " " +
				 * lastName + "']")));
				 */
				waitForPageLoadTill(5);
				System.out.println(personLink.getText());
				clickWebElemntUsingJavascriptExecutor(personLink);
				waitForPageLoadTill(10);
				logger.info("Clicking on the person account link");
				logger.info("Clicked on the person account link");
			
			waitForPageLoadTill(9);
			try {
				clickWebElement(realtedTab);
				logger.info("Clicking on the related tab");
			} catch (AcisException e) {
				clickWebElement(realtedTab2);
				logger.info("Clicking on the related tab");
			}
			waitForPageLoadTill(9);
			try {
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,590)");
				waitForElementNew(addressesTab, 4);
				waitForPageLoadTill(9);
				waitForElementClickable(addressesTab);
				clickWebElemntUsingJavascriptExecutor(addressesTab);
				logger.info("Clicked on address tab");
			} catch (AcisException e) {
				waitForElementNew(addressesTab2, 4);
				clickWebElemntUsingJavascriptExecutor(addressesTab2);
				logger.info("Clicked on address tab");
			}

			waitForPageLoadTill(9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @author akash.a.gaurav
	 * @throws AcisException The guided intake flow button This method is clicking
	 *                       on intake guided flow button in allegation report
	 */
	public void clickIntakeBtn() throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(7);
		waitForElementClickable(guidedIntake);
		clickWebElement(guidedIntake);
		logger.info("Clicked on Guided Intake button");
		waitForPageLoadTill(15);

	}

	/***
	 * Verifying Address Change status and also whether it is mark as primary
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void verifyPrimaryAddress() throws AcisException {

		try {
			logger.info("Verifying and primary address");
			String street1 = testData.get(Constants.AddressCreationIntakeOmniScriptPage).get("firstPersonstreet1");
			String street2 = testData.get(Constants.AddressCreationIntakeOmniScriptPage).get("firstPersonstreet2");
			waitForPageLoadTill(9);
			waitForElementClickable(addressLink);

			clickWebElemntUsingJavascriptExecutor(addressLink);
			waitForPageLoad();
			driver.navigate().refresh();
			waitForPageLoad();
			waitForPageLoadTill(11);
			verifyElementNotPresent(addressStreet1);

			logger.info("Verifying adddress" + street1);
			verifyElementNotPresent(addressStreet2);

			logger.info("Verifying adddress" + street2);

			
				clickWebElement(Edit2);
				logger.info("Clicked on edit button in the address section");
			

			waitForPageLoadTill(28);
			try {
				verifyElementNotPresent(primaryCheck);
			} catch (Exception e) {
				verifyElementNotPresent(primaryCheck1);
			}
			logger.info("Verified primary addrees is checked of the related address changed");
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Click Primary address check-box
	 * 
	 * @author akash
	 * @throws AcisException
	 */
	public void clickPrimaryAddress() throws AcisException {
		waitForElement(primaryAddressText);
		scrollingToElementofAPage(primaryAddressCheckBox);
		waitForPageLoadTill(7);
		clickWebElemntUsingJavascriptExecutor(primaryAddressCheckBox);
		logger.info("Click Primary address check-box");
		waitForPageLoadTill(5);
	}

	/***
	 * Clicking down arrow and editing
	 */

	/**
	 * Owner : @author akash.a.gaurav Description: this method is clicking the edit
	 * buttton of person intake information
	 * 
	 * @throws AcisException
	 */
	public void clickingDownPersonInvolve() throws AcisException {

		try {
			// clickWebElement(continueButton);
			waitForPageLoadTill(8);
			waitForElementNew(downButton, 6);
			clickWebElemntUsingJavascriptExecutor(downButton);
		} catch (Exception e) {
			waitForElementNew(downButton2, 6);
			clickWebElement(downButton2);
		}
		waitForElementNew(editButton, 4);
		clickWebElement(editButton);

	}

	/***
	 * save
	 */

	/**
	 * Click on save button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickSaveButtonaddress() throws AcisException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		logger.info("Clicking on save button");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,900)");
		scrollingToElementofAPage(saveButton);
		clickWebElemntUsingJavascriptExecutor(saveButton);
		waitForPageLoadTill(5);
		logger.info("Clicked on save button");
	}

	/***
	 * Click on alert ok
	 * 
	 * @throws AcisException
	 */
	public void selectOk() throws AcisException {

		if (okAlert.isDisplayed()) {
			clickWebElement(okAlert);
		} else {
			logger.info("Chnaged primary address and marked checked box");
		}

		/*
		 * try { try { clickWebElement(okAlert); } catch (Exception e) {
		 * logger.info("Chnaged primary address and marked checked box"); }
		 */

	}
}
