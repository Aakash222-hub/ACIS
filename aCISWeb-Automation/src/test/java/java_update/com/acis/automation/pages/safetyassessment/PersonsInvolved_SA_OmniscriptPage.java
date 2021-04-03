package com.acis.automation.pages.safetyassessment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.investigation.PersonsInvovled_Workflow_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class PersonsInvolved_SA_OmniscriptPage extends PageBase {

	public PersonsInvolved_SA_OmniscriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_Workflow_OmniscriptPage.class);

	public static int age;
	
	@FindBy(xpath = "(//*[text()='First Name']//..//..//..//input)[1]")
	WebElement firstNames;
	
	@FindBy(xpath = "//span[text()='Search']")
	WebElement searchButton;
	
	@FindBy(xpath = "//table//thead//tr//th[text()='FIRST NAME']")
	WebElement firstNameVerify;
	
	public By closeVerify = By.xpath("//button[text()='Close']");
	
	@FindBy(xpath = "//button[text()='Close']")
	WebElement close;
	
	@FindBy(xpath = "(//*[text()='Last Name']//..//..//..//input)[1]")
	WebElement lastNames;
	
	@FindBy(xpath = "(//*[text()='Date of Birth']//..//..//..//input)[1]")
	WebElement dateofBirth;

	
	@FindBy(xpath = "//span[contains(text(),'here')]/../..//button")
	WebElement linkCreateNewPerson;
	
	@FindBy(xpath = "//h2[contains(text(),'Involved')]/../../..//*[text()='First Name']/../../..//input")
	public static WebElement firstNameTextBox;

	@FindBy(xpath = "//h2[contains(text(),'Involved')]/../../..//*[text()='Last Name']/../../..//input")
	public static WebElement lastNameTextBox;

	@FindBy(xpath = "//h2[contains(text(),'Involved')]/../../..//*[text()='Middle Name']/../../..//input")
	public static WebElement middleNameTextBox;
	
	@FindBy(xpath = "(//h2[contains(text(),'Involved')]/../..//*[text()='Save'])[1]")
	WebElement saveButtonFirst;
	
	@FindBy(xpath = "(//h2[contains(text(),'Involved')]/../..//*[text()='Save'])[last()]")
	WebElement saveButton;
	
	@FindBy(xpath = "(//h1[contains(text(),'Involved')]/../..//*[text()='Save'])[1]")
	WebElement saveButtonFirstAfterEdit;
	
	@FindBy(xpath = "(//h1[contains(text(),'Involved')]/../..//*[text()='Save'])[last()-1]")
	WebElement saveButtonAfterEdit;
	
	@FindBy(xpath = "//span[contains(text(),'Refresh Person')]")
	WebElement refreshPersonsButton;
	
	@FindBy(xpath = "//*[contains(text(),'details are saved. Close this')]")
	WebElement saveVerify;
	
	@FindBy(xpath = "//*[text()='Close']")
	WebElement closeButton;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;
	
	 @FindBy(xpath="//h1[text()='Establish Relationships']")
	 WebElement verifyEstablishLabel;
	 
	 @FindBy(xpath="(//span[text()='down icon']/../..)[last()]")
	 WebElement downArrowSecondPerson;
	 
	 
	 
	 @FindBy(xpath="(//span[text()='down icon']/../..)[1]")
	 WebElement downArrowFirstPerson;
	 
	 @FindBy(xpath="//span[text()='Edit']/..")
	 WebElement editSecondPerson;
	 
	@FindBy(xpath = "(//*[text()='Phone']/../..//input)[last()]")
	WebElement phone;
		
	
	 @FindBy(xpath = "(//*[text()='Phone']/../..//input)[1]")
	WebElement phoneFirst;
		
	@FindBy(xpath = "(//*[text()='Email']/../../..//input)[last()]")
	WebElement emailId;
		
	@FindBy(xpath = "(//*[text()='Email']/../../..//input)[1]")
	WebElement emailIdFirst;
	
	@FindBy(xpath = "(//*[text()='Street 1']/../../..//input)[last()]")
	public static WebElement street1;
	
	@FindBy(xpath = "(//*[text()='Street 2']/../../..//input)[last()]")
	public static WebElement street2;

	@FindBy(xpath = "(//*[text()='City']/../../..//input)[last()]")
	public static WebElement city;

	@FindBy(xpath = "(//*[text()='Zip Postal Code']/../../..//input)[last()]")
	WebElement zipCodeTextBox;
	
	@FindBy(xpath = "(//*[text()='Age']/../..//input[@type='tel'])[last()]")
	WebElement ageAtTimeOfReportTextbox;
	
	@FindBy(xpath = "//body[@data-id='mytextarea']//p")
	WebElement narrative_textarea;

	@FindBy(xpath = "(//*[contains(text(),'Date of Birth')]/../..//input)[last()]")
	public static WebElement birthDateTextBox;
	
	@FindBy(xpath = "(//span[text()='Choose not to disclose'])[last()]")
	WebElement race_UnableToDetermine;

	@FindBy(xpath = "(//span[text()='Choose not to disclose'])[1]")
	WebElement race_UnableToDetermineFirst;
	
	
	/**
	 * Click on close button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void closeCreateIntakePerson() throws AcisException {
		logger.info("Closing CreateIntakePerson");
		waitForElement(saveVerify);
		clickWebElemntUsingJavascriptExecutor(closeButton);
		waitForPageLoadTill(5);
		waitForElement(refreshPersonsButton);
		logger.info("Added Person");
	}
	
	/**
	 * Click on refresh person button
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void clickRefresPersonButton() throws AcisException {
		logger.info("Clicking refresh person button");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(refreshPersonsButton);
		waitForPageLoadTill(5);
		logger.info("Clicked refresh person button");
		waitForPageLoadTill(5);
		logger.info("Successfully clicked refresh person button");

	}
	
	/**
	 * Set First name, middle name, last name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void setAllNames(String firstName, String middleName, String lastName) throws AcisException {
		waitForElement(firstNameTextBox);
		enterText(firstNameTextBox, firstName);
		enterText(middleNameTextBox, middleName);
		enterText(lastNameTextBox, lastName);
		logger.info("Set First name, middle name, last name");
		waitForPageLoadTill(5);
	}

	/**
	 * Click on save button after clicking on "Create link"
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickSaveButton(String option) throws AcisException, InterruptedException {
		switch(option)
		{
			case "first":
				logger.info("Clicking on save button");
				clickWebElemntUsingJavascriptExecutor(saveButtonFirst);
				waitForPageLoadTill(5);
				logger.info("Clicked on save button");
				break;
		
			case "next":
				logger.info("Clicking on save button");
				clickWebElement(saveButton);
				waitForPageLoadTill(5);
				logger.info("Clicked on save button");
				break;
		}
		waitForPageLoadTill(5);
		
	}
	
	/**
	 * Click on save button after clicking on edit on person name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickSaveButtonAfterEdit(String option) throws AcisException, InterruptedException {
		switch(option)
		{
			case "first":
				logger.info("Clicking on save button");
				clickWebElemntUsingJavascriptExecutor(saveButtonFirstAfterEdit);
				waitForPageLoadTill(5);
				logger.info("Clicked on save button");
				break;
		
			case "next":
				logger.info("Clicking on save button");
				clickWebElement(saveButtonAfterEdit);
				waitForPageLoadTill(5);
				logger.info("Clicked on save button");
				break;
		}
		waitForPageLoadTill(5);
		
	}
	
	/**
	 * Search a person with valid input
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchPersonUsingvalidData(String name, String str1) throws AcisException, InterruptedException {

		switch (name) {
		case "firstName":
			logger.info("Selecting first Name  and searching ");
			waitForElement(firstNames);
			enterText(firstNames, str1);
			waitForPageLoadTill(5);
			clickWebElement(searchButton);
			waitForElement(firstNameVerify);
			waitForPageLoadTill(5);
			if (isElementPresent(closeVerify)) {
				logger.info("Clicking on Close Button");
				waitForElementClickable(close);
				clickWebElement(close);
				logger.info("Clicked on Close Button");
			}
			logger.info("Searching using first person");
			break;

		case "lastName":
			logger.info("Seleting last name and searching ");
			waitForElement(lastNames);
			enterText(lastNames, str1);
			waitForPageLoadTill(5);
			clickWebElement(searchButton);
			waitForElement(firstNameVerify);
			waitForPageLoadTill(5);
			if (isElementPresent(closeVerify)) {
				logger.info("Clicking on Close Button");
				waitForElementClickable(close);
				clickWebElement(close);
				logger.info("Clicked on Close Button");
			}
			logger.info("Searching using lastname person");
			break;

		case "dob":
			logger.info("Selecting dob name and searching ");
			waitForElement(dateofBirth);
			enterText(dateofBirth, str1);
			waitForPageLoadTill(5);
			clickWebElement(searchButton);
			waitForElement(firstNameVerify);
			waitForPageLoadTill(5);
			if (isElementPresent(closeVerify)) {
				logger.info("Clicking on Close Button");
				waitForElementClickable(close);
				clickWebElement(close);
				logger.info("Clicked on Close Button");
			}
			logger.info("Searching using dob person");
			break;
		default:
			logger.info("Date: " + name + " not found");
			break;

		}

	}
	
	/***
	 * Link to create new person
	 * 
	 * @throws AcisException
	 */
	public void linkToCreateNewPerson() throws AcisException {
		waitForPageLoadTill(9);
		logger.info("Clikcing on link to create new person");
		Actions act = new Actions(driver);
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,650)");
		clickWebElemntUsingJavascriptExecutor(linkCreateNewPerson);
		logger.info("Clicked on link to create new person");
		waitForPageLoadTill(10);
	}
	
	/**
	 * click on Next button
	 * @author mrunal.s.tilekar
	 */
	public void clickNextButton() throws AcisException, InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,900)");
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(10);
		waitForElement(verifyEstablishLabel);
		logger.info("Clicked on Next button");

	}
	
	/***
	 * Click on second person 
	 * @author akash.a.gaurav
	 * This method is used in US-0869
	 * @throws AcisException 
	 */
   
	
	public void clickEditSecond() throws AcisException {
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(3);
		jse.executeScript("window.scrollBy(0,300)");
		logger.info("Clicking on second person down button");
		waitForElementClickable(downArrowSecondPerson);
		clickWebElemntUsingJavascriptExecutor(downArrowSecondPerson);
		waitForElement(editSecondPerson);
		clickWebElemntUsingJavascriptExecutor(editSecondPerson);
		logger.info("Clicked on edit Second Person");
	}
	
	
	/***
	 * Click on first person 
	 * @author akash.a.gaurav
	 * This method is used in US-0869
	 * @throws AcisException 
	 */
   
	
	public void clickEditFirst() throws AcisException {
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(3);
		jse.executeScript("window.scrollBy(0,300)");
		logger.info("Clicking on second person down button");
		waitForElementClickable(downArrowFirstPerson);
		clickWebElemntUsingJavascriptExecutor(downArrowSecondPerson);
		waitForElement(editSecondPerson);
		clickWebElemntUsingJavascriptExecutor(editSecondPerson);
		logger.info("Clicked on edit Second Person");
	}
	
	/**
	 * all textbox
	 * @author mrunal.s.tilekar
	 * @param textFieldName
	 * @param strValue
	 * @throws AcisException
	 * @throws InterruptedException 
	 */
	
	
	public void enterTextFieldValueOnReviewAllegation_SA( String option,String textFieldName, String strValue) throws AcisException, InterruptedException {
		Actions act = new Actions(driver);
 
		waitForPageLoadTill(5);
		if(option.equals("first"))
		{
			switch (textFieldName) {

			case "phone":
				waitForElement(phoneFirst);
				phoneFirst.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		//		clickWebElement(phone);
				act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
				logger.info("entered phone");
				break;
				
			case "emailId":
				waitForElement(emailIdFirst);
				//	emailIdFirst.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
					clickWebElement(emailIdFirst);
					waitForPageLoadTill(5);
				//	act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
					enterText(emailIdFirst, strValue);
				logger.info("entered emailID");
				break;

			default:
				logger.info("Text Field Value: " + textFieldName + "did not find");
			}

		
		}
		else if (option.equals("last"))
		{
			switch (textFieldName) {

			case "age":
				waitForElement(ageAtTimeOfReportTextbox);
				enterText(ageAtTimeOfReportTextbox, strValue);
				age = Integer.parseInt(strValue);
				logger.info("entering Age");
				break;

			case "ageClear":
				waitForElement(ageAtTimeOfReportTextbox);
				ageAtTimeOfReportTextbox.clear();
				logger.info("Age Cleared ");
				break;

			case "phone":
				waitForElement(phone);
				phone.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
			//	enterText(phone, strValue);
				logger.info("entering phone");
				break;

			case "zipcode":
				waitForElement(zipCodeTextBox);
				enterText(zipCodeTextBox, strValue);
				logger.info("entering zipcode");
				break;

			case "emailId":
				waitForElement(emailId);
				enterText(emailId, strValue);
				logger.info("entering emailID");
				break;

			case "street1":
				waitForElement(street1);
				enterText(street1, strValue);
				logger.info("entering street1");
				break;

			case "street2":
				waitForElement(street2);
				enterText(street2, strValue);
				logger.info("entering strret2");
				break;

			case "city":
				waitForElement(city);
				enterText(city, strValue);
				break;

			case "narrative":
				waitForElement(narrative_textarea);
				enterText(narrative_textarea, strValue);
				break;

			case "birthdateTextboxClear":
				birthDateTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				logger.info("cleared birthdate textbox");
				break;

			default:
				logger.info("Text Field Value: " + textFieldName + "did not find");
			}

			waitForPageLoadTill(5);
		}
		
	}

	
	/**
	 * Click on edit button of person record from table
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public void clickEditRecordButton(String personName) throws AcisException, InterruptedException, IOException {
		logger.info("Clicking on edit button of "+personName+" person record from table");
		waitForPageLoadTill(10);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
	//	scrollingToElementofAPage(downArrowFirstPerson);
		clickWebElement(driver.findElement(By.xpath("//*[contains(text(),' "+personName+"')]/../..//span[text()='down icon']/parent::*/parent::button")));
		clickWebElement(editSecondPerson);
		logger.info("Clicked on edit button of "+personName+" person record from table");
		
	}
	
	/**
	 * click Save button using tab
	 * @author mrunal.s.tilekar
	 */
	public void clickSaveButtonUsingTab(String option) throws AcisException, InterruptedException {
		Actions act = new Actions(driver);
		
		switch(option)
		{
			case "first":
				logger.info("Clicking on save button");
				scrollingToElementofAPage(race_UnableToDetermineFirst);
				clickWebElement(race_UnableToDetermineFirst);
				clickWebElement(race_UnableToDetermineFirst);
				act.sendKeys(Keys.TAB).build().perform();
				act.sendKeys(Keys.TAB).build().perform();
				waitForPageLoadTill(5);
				act.sendKeys(Keys.ENTER).build().perform();
				//clickWebElement(saveButtonFirst);
				waitForPageLoadTill(5);
				logger.info("Clicked on save button");
				break;
		
			case "next":
				logger.info("Clicking on save button");
				scrollingToElementofAPage(race_UnableToDetermine);
				clickWebElement(race_UnableToDetermine);
				clickWebElement(race_UnableToDetermine);
				act.sendKeys(Keys.TAB).build().perform();
				act.sendKeys(Keys.TAB).build().perform();
				waitForPageLoadTill(5);
			
				clickWebElement(saveButton);
				waitForPageLoadTill(5);
			
				logger.info("Clicked on save button");
				break;
		}
		waitForPageLoadTill(5);
		
	}
	
}
