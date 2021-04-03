package com.acis.automation.pages.intake;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CreateIntakePerson_OmniscriptPage extends PageBase {

	public CreateIntakePerson_OmniscriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int age;

	final static Logger logger = LoggerFactory.getLogger(CreateIntakePerson_OmniscriptPage.class);

	@FindBy(xpath = "(//*[text()[contains(.,'Person(s) Involved')]])[last()]")
	WebElement personsInvolvedTitle;

	@FindBy(xpath = "(//*[text()='First Name']/../../..//input)[last()]")
	public static WebElement firstNameTextBox;
	
	@FindBy(xpath = "(//label[text()='First Name']/../../..//input)[last()]")
	public static WebElement firstNameTextBoxReview;


	@FindBy(xpath = "(//*[text()='Last Name']/../../..//input)[last()]")
	public static WebElement lastNameTextBox;

	@FindBy(xpath = "(//label[text()='Last Name']/../../..//input)[last()]")
	public static WebElement lastNameTextBoxReview;

	
	@FindBy(xpath = "(//*[text()='Middle Name']/../../..//input)[last()]")
	public static WebElement middleNameTextBox;

	
	@FindBy(xpath = "(//label[text()='Middle Name']/../../..//input)[last()]")
	public static WebElement middleNameTextBoxreview;
	
	
	@FindBy(xpath = "(//*[text()='Suffix']/../../..//input)[last()]")
	WebElement suffix;

	@FindBy(xpath = "(//*[@title='I'])[last()]")
	WebElement suffixI;

	@FindBy(xpath = "(//*[@title='II'])[last()]")
	WebElement suffixII;

	@FindBy(xpath = "(//*[@title='III'])[last()]")
	WebElement suffixIII;

	@FindBy(xpath = "(//*[@title='IV'])[last()]")
	WebElement suffixIV;

	@FindBy(xpath = "(//*[@title='V'])[last()]")
	WebElement suffixV;

	@FindBy(xpath = "(//*[@title='Jr'])[last()]")
	WebElement suffixJr;

	@FindBy(xpath = "(//*[@title='Sr.'])[last()]")
	WebElement suffixSr;

	@FindBy(xpath = "(//*[text()='Phone']/../..//input)[last()]")
	WebElement phone;

	@FindBy(xpath = "(//*[text()='Email']/../../..//input)[last()]")
	WebElement emailId;

	@FindBy(xpath = "(//*[text()='Street 1']/../../..//input)[last()]")
	public static WebElement street1;

	@FindBy(xpath = "(//*[text()='Street 2']/../../..//input)[last()]")
	public static WebElement street2;

	@FindBy(xpath = "(//*[text()='City']/../../..//input)[last()]")
	public static WebElement city;

	@FindBy(xpath = "(//*[text()='State']/../../..//input)[last()]")
	WebElement state;

	@FindBy(xpath = "(//*[text()='Country']/../../..//input)[last()]")
	WebElement country;

	@FindBy(xpath = "(//*[text()='Zip/Postal Code']/../../..//input)[last()]")
	WebElement zipCodeTextBox;

	@FindBy(xpath = "(//span[contains(text(),'Primary Address')])[last()]")
	WebElement primaryAddressText;

	@FindBy(xpath = "((//span[contains(text(),'Primary Address')])/../span)[last()]")
	WebElement primaryAddressCheckBox;

	@FindBy(xpath = "(//*[contains(text(),'Date of Birth')]/../..//input)[last()]")
	WebElement birthDateTextBox;

	@FindBy(xpath = "(//*[text()='Date of Birth']/../..//*[text()='Pick a Year']/../..//select)[last()]")
	WebElement birthdateYearlist;

	@FindBy(xpath = "(//*[text()='Date of Birth']/../..//*[text()='20'])")
	WebElement dateBirthdate;

	@FindBy(xpath = "//button[@title='Next Month']")
	WebElement nextMonth;

	@FindBy(xpath = "(//*[contains(text(),'Age')]/../../..//input[@name='Age'])")
	WebElement ageAtTimeOfReportTextbox;

	@FindBy(xpath = "(//*[text()='Gender']/../../..//input)[last()]")
	WebElement gender;

	@FindBy(xpath = "(//*[@title='Male'])[last()]")
	WebElement genderMale;

	@FindBy(xpath = "(//*[@title='Female'])[last()]")
	WebElement genderFemale;

	@FindBy(xpath = "(//*[contains(text(),'Date of Death')]/../..//input)[last()]")
	WebElement deathDateTextbox;

	@FindBy(xpath = "(//*[text()='15'])[last()]")
	WebElement dateOfDeath;

	@FindBy(xpath = "(//span/following-sibling::span[text()='American Indian or Alaska Native'])[last()]")
	WebElement race_AmericanIndianAlaskaNative;

	@FindBy(xpath = "(//span/following-sibling::span[text()='Asian'])[last()]")
	WebElement race_Asian;

	@FindBy(xpath = "(//span/following-sibling::span[text()='Black or African American'])[last()]")
	WebElement race_BlackAfricanAmerican;

	@FindBy(xpath = "(//span/following-sibling::span[text()='Hispanic or Latino'])[last()]")
	WebElement race_HispanicOrLatino;

	@FindBy(xpath = "(//span/following-sibling::span[text()='Native Hawaiian or Other Pacific Islander'])[last()]")
	WebElement race_NativeHawaiian;

	@FindBy(xpath = "(//span/following-sibling::span[contains(text(),'White')])[last()]")
	WebElement race_White;

	@FindBy(xpath = "(//*[text()='Unable to Determine'])[last()]")
	WebElement race_UnableToDetermine;
	
	@FindBy(xpath = "(//*[text()='Choose not to disclose'])[last()]")
	WebElement race_ChooseNotToDisclose;

	@FindBy(xpath = "(//span[text()='Save'])[last()]")
	WebElement saveButton;

	@FindBy(xpath = "//*[contains(text(),'The Intake Person details are saved')]")
	WebElement saveVerify;

	@FindBy(xpath = "(//button[@title='Close'])[last()]")
	WebElement closeButton;

	@FindBy(xpath = "//h1[normalize-space()='Person(s) Involved']")
	WebElement searchPersonVerify;

	@FindBy(xpath = "(//*[text()='Name Information'])[last()]")
	WebElement nameInformationVerify;

	@FindBy(xpath = "(//*[text()='Role']/..//input)[last()]")
	WebElement role;

	@FindBy(xpath = "(//*[text()='Role']/..//*[@data-value='Alleged Victim'])[last()]")
	WebElement roleAllegedVictim;
	
	
	@FindBy(xpath="//span[text()='Close']")
	WebElement close;

	@FindBy(xpath = "(//*[text()='Role']/..//*[@data-value='Alleged Maltreator'])[last()]")
	WebElement roleAllegedMaltreator;

	@FindBy(xpath = "(//span[contains(text(),'Primary Caregiver')])[last()]")
	WebElement primaryCaregiverText;

	@FindBy(xpath = "(//span[contains(text(),'Primary Caregiver')]/preceding-sibling::span)[last()]")
	WebElement primaryCaregiverCheckbox;

	public By relationshipText = By.xpath("//*[text()='Relationship']");

	public By middleNameError = By
			.xpath("//*[contains(text(),'Middle Name should not include numbers or special characters')]");

	public By firstNameError = By
			.xpath("//*[contains(text(),'First Name should not include numbers or special characters')]");

	public By lastNameError = By
			.xpath("//*[contains(text(),'Last Name should not include numbers or special characters')]");

	public By firstNameRequired = By.xpath("//*[text()='First Name']/../../..//*[@title='required']");

	public By lastNameRequired = By.xpath("//*[text()='Last Name']/../../..//*[@title='required']");

	public By zipCode_error = By.xpath("//*[contains(text(),'Zip code must be in 99999 or 99999-9999 format')]");

	public By zipCodeFormat_error = By.xpath("//*[contains(text(),'must be in ##### or #####-#### format')]");

	public By unableToDetermineError = By
			.xpath("//*[contains(text(),'Multiple selections are unavailable when unable to determine is selected')]");

	public By birthDateError = By.xpath("//*[contains(text(),'Birthdate Cannot be Greater than Date of Death')]");

	public By deathDateError = By.xpath("//*[contains(text(),'future Date of Death')]");

	/**
	 * Verify first name , middle name, last name can not accept numbers, symbols
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void verifyAllNamesNotAcceptNumbers() throws AcisException {
		scrollingToElementofAPage(firstNameTextBox);
		enterText(firstNameTextBox, "Demo@123");
		enterText(middleNameTextBox, "DEmo2#2");
		enterText(lastNameTextBox, "Demo$%5");
		scrollingToElementofAPage(saveButton);
		clickWebElement(saveButton);

		waitAndVerifyElement(firstNameError);
		waitAndVerifyElement(middleNameError);
		waitAndVerifyElement(lastNameError);
		logger.info("Verify first name , middle name, last name can not accept numbers, symbols");

		logger.info("clearing first name , middle name, last name textbox");
		firstNameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		middleNameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		lastNameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		logger.info("cleared first name , middle name, last name  textbox");

	}

	/**
	 * Verify First Name and Last name are required field
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void verifyFirstnameLastnamerequired() throws AcisException {
		scrollingToElementofAPage(saveButton);
		clickWebElemntUsingJavascriptExecutor(saveButton);
		scrollingToElementofAPage(firstNameTextBox);
		waitAndVerifyElement(firstNameRequired);
		waitAndVerifyElement(lastNameRequired);
		logger.info("Verify First Name and Last name are required field");
	}

	/**
	 * Set First name, middle name, last name
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void setAllNames(String firstName, String middleName, String lastName) throws AcisException {

		logger.info("Entering First name, middle name, last name");
//		waitForElement(nameInformationVerify);
		enterText(firstNameTextBox, firstName);
		enterText(middleNameTextBox, middleName);
		enterText(lastNameTextBox, lastName);
		logger.info("Set First name, middle name, last name");
		waitForPageLoadTill(5);
	}

	/**
	 * Select role
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void provideRole(String roleoption) throws AcisException {
		waitForElement(role);
		clickWebElement(role);
		logger.info("Clicked on role");
		switch (roleoption) {
		case "Alleged Victim":
			clickWebElement(roleAllegedVictim);
			logger.info("Role Alleged Victim Selected");
			break;

		case "Alleged Maltreator":
			clickWebElement(roleAllegedMaltreator);
			logger.info("Role Alleged Maltreator Selected");
			break;

		default:
			logger.info("No matching role option");
			break;
		}

	}

	/**
	 * Click Primary Care-giver check-box
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickPrimaryCaregiver() throws AcisException {
		logger.info("Clicking Primary Caregiver check-box");
		waitForElement(primaryCaregiverText);
		clickWebElemntUsingJavascriptExecutor(primaryCaregiverCheckbox);
		logger.info("Clicked Primary Caregiver check-box");
	}

	/**
	 * Set Suffix on Create Intake Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void prvoideSuffix(String suffixOption) throws AcisException {
		clickWebElement(suffix);

		switch (suffixOption) {
		case "I":
			clickWebElement(suffixI);
			logger.info("Set suffix I");
			break;

		case "II":
			clickWebElement(suffixII);
			logger.info("Set suffix II");
			break;

		case "III":
			clickWebElement(suffixIII);
			logger.info("Set suffix III");
			break;

		case "IV":
			clickWebElement(suffixIV);
			logger.info("Set suffix IV");
			break;

		case "V":
			clickWebElement(suffixV);
			logger.info("Set suffix V");
			break;

		case "Jr":
			clickWebElement(suffixJr);
			logger.info("Set suffix Jr");
			break;

		case "Sr":
			clickWebElement(suffixSr);
			logger.info("Set suffix Sr");
			break;

		default:
			logger.info("No matching suffix value");
			break;
		}
	}

	/**
	 * Set contact information : phone and email
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void provideContactInformation(String phoneOption, String emailIDOption) throws AcisException {
		logger.info("Entering contact information : phone and email");
		Actions act = new Actions(driver);
		clickWebElement(phone);
		act.sendKeys(Keys.CONTROL).sendKeys(phoneOption).perform();
		// enterText(phone, phoneOption);
		enterText(emailId, emailIDOption);
		logger.info("Entered contact information : phone and email");
		waitForPageLoadTill(5);
		clickWebElement(nameInformationVerify);
	}

	/**
	 * Enter all Text Boxes on Create Person Intake Page
	 * 
	 * @author Dharmesh Krishna
	 * @param textFieldName
	 * @param strValue
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void enterTextFieldValueOnPersonsInvovled(String textFieldName, String strValue)
			throws AcisException, InterruptedException {
		waitForPageLoadTill(5);
		Actions act = new Actions(driver);
		switch (textFieldName) {
		case "age":
			logger.info("Entering age");
			act.sendKeys(Keys.PAGE_UP).build().perform();
			waitForPageLoadTill(5);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			act.sendKeys(Keys.ARROW_UP).build().perform();
			waitForElement(ageAtTimeOfReportTextbox);
			enterText(ageAtTimeOfReportTextbox, strValue);
			age = Integer.parseInt(strValue);
			logger.info("Age entered");
			break;
		case "phone":
			logger.info("entering phone");
			waitForElement(phone);
			enterText(phone, strValue);
			logger.info("entered phone");
			break;

		case "zipcode":
			logger.info("entering zipcode");
			act.sendKeys(Keys.PAGE_UP).build().perform();
			waitForElement(zipCodeTextBox);
			enterText(zipCodeTextBox, strValue);
			logger.info("entered zipcode");
			break;

		case "emailId":
			logger.info("entered emailID");
			waitForElement(emailId);
			enterText(emailId, strValue);
			logger.info("entering emailID");
			break;

		case "street1":
			logger.info("entered street1");
			for (int i = 0; i < 4; i++)
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
			waitForElement(street1);
			enterText(street1, strValue);
			logger.info("entering street1");
			break;

		case "street2":
			logger.info("entered strret2");
			waitForElement(street2);
			enterText(street2, strValue);
			logger.info("entering strret2");
			break;

		case "city":
			logger.info("entering City");
			waitForElement(city);
			enterText(city, strValue);
			logger.info("entered City");
			break;

		case "birthdateTextboxClear":
			logger.info("clearing birthdate textbox");
			birthDateTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			logger.info("cleared birthdate textbox");
			break;

		default:
			logger.info("Text Field Value: " + textFieldName + "did not find");
		}

	}

	/**
	 * Select state on Create Intake Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void provideState(String stateOption) throws AcisException, InterruptedException {
		waitForElementClickable(state);
		clickWebElement(state);
		logger.info("Selected state");
		scrollingToElementofAPage(driver.findElement(By.xpath("//*[@data-value='" + stateOption + "']")));
		clickWebElement(driver.findElement(By.xpath("//*[@data-value='" + stateOption + "']")));
		logger.info("Selected state option: " + stateOption);
		waitForPageLoadTill(5);
	}

	/**
	 * Select country on Create Intake Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void provideCountry(String countryOption) throws AcisException {
		logger.info("Selecting country");
		scrollingToElementofAPage(country);
		clickWebElement(country);
		scrollingToElementofAPage(driver.findElement(By.xpath("//*[text()='" + countryOption + "']")));
		driver.findElement(By.xpath("//*[text()='" + countryOption + "']")).click();
		logger.info("Selected country");
		waitForPageLoadTill(5);
	}

	/**
	 * Click Primary address check-box
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void clickPrimaryAddress() throws AcisException {
		logger.info("Clicking Primary address check-box");
		waitForElement(primaryAddressText);
		clickWebElemntUsingJavascriptExecutor(primaryAddressCheckBox);
		logger.info("Clicked Primary address check-box");
		waitForPageLoadTill(5);
	}

	/**
	 * Enter Birth-date on Create Intake Person
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void provideBirthdate(String year) throws AcisException {
		logger.info("Entering BirthDate");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		waitForElementClickable(birthDateTextBox);
		act.moveToElement(birthDateTextBox).click().perform();
		// clickWebElement(birthDateTextBox);
		waitForElementClickable(birthdateYearlist);
		act.moveToElement(birthdateYearlist).click().perform();

		Select birthyearList = new Select(birthdateYearlist);
		List<WebElement> elementCount = birthyearList.getOptions();
		int iSize = elementCount.size();

		for (int i = 0; i < iSize; i++) {
			String birthyearValue = elementCount.get(i).getText().trim();
			// System.out.println(birthyearValue);
			if (birthyearValue.equalsIgnoreCase(year)) {
				birthyearList.selectByVisibleText(year);
				logger.info(" matching birthyear Value");
				break;
			} else {
				System.out.println("No matching birthyear Value");
				logger.info("No matching birthyear Value");
			}

		}

		act.moveToElement(dateBirthdate).click().perform();
		logger.info("BirthDate entered");

	}

	/**
	 * Select gender on Create Intake Person
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void prvoideGender(String genderOption) throws AcisException {
		clickWebElement(gender);
		logger.info("Clicked on gender dropdown");
		switch (genderOption) {
		case "Male":
			clickWebElement(genderMale);
			logger.info("Gender Male Selected");
			break;

		case "Female":
			clickWebElement(genderFemale);
			logger.info("Gender Female Selected");
			break;

		default:
			logger.info("No matching gender option");
			break;
		}
		logger.info("Select gender:" + genderOption);
	}

	/**
	 * Click on save button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("Clicking on save button");
		scrollingToElementofAPage(saveButton);
		clickWebElemntUsingJavascriptExecutor(saveButton);
//		waitForElement(saveVerify);
//		waitForPageLoadTill(5);
		logger.info("Clicked on save button");
	}

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
		waitForElement(searchPersonVerify);
		logger.info("Added Person on Intake Flow");
	}

	/**
	 * Verify first name, last name, DOB ,age present
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void verifyspecificFieldPresent() {
		logger.info("Verifying first name, last name, DOB ,age present");
		Assert.assertTrue(firstNameTextBox.isDisplayed(), "Error : first name NOT present ");
		Assert.assertTrue(middleNameTextBox.isDisplayed(), "Error : Middle name NOT present ");
		Assert.assertTrue(lastNameTextBox.isDisplayed(), "Error : Last name NOT present ");
		Assert.assertTrue(birthDateTextBox.isDisplayed(), "Error : DOB NOT present ");
		Assert.assertTrue(ageAtTimeOfReportTextbox.isDisplayed(), "Error :  Age NOT present ");
		logger.info("Verifyied first name, last name, DOB ,age present");
	}

	/**
	 * Verify Error : A zipcode must be in ##### or #####-#### format
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void verifyZipCodeFormat(String zipCodeValue) throws AcisException {
		scrollingToElementofAPage(zipCodeTextBox);
		enterText(zipCodeTextBox, zipCodeValue);
		scrollingToElementofAPage(saveButton);
		clickWebElemntUsingJavascriptExecutor(saveButton);
		waitAndVerifyElement(zipCodeFormat_error);
		logger.info("Verify Error : A zipcode must be in ##### or #####-#### format");
		logger.info("clearing zipcode textbox");
		zipCodeTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		logger.info("cleared zipcode  textbox");

	}

	/**
	 * Verify error : Date of death can not be future date
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void verifyFutureDeathError() throws AcisException {
		logger.info("Verifying error : Date of death can not be future date");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		waitForElementClickable(deathDateTextbox);
		clickWebElement(deathDateTextbox);
		try {
			waitForElementClickable(nextMonth);
		} catch (Exception e) {
			act.sendKeys(Keys.ARROW_UP).build().perform();
			waitForElementClickable(deathDateTextbox);
			clickWebElement(deathDateTextbox);
		}

		clickWebElement(nextMonth);
		waitForElementClickable(dateOfDeath);
		clickWebElement(dateOfDeath);

		clickWebElemntUsingJavascriptExecutor(saveButton);
		waitAndVerifyElement(deathDateError);
		logger.info("Verify error : Date of death can not be future date");

		deathDateTextbox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

	}

	/**
	 * Verify error :Multiple selections are unavailable when unable to determine is
	 * selected
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void verifyMultipleSelectionError() throws AcisException {

		logger.info("Verifying error :Multiple selections are unavailable when unable to determine is selected");
		scrollingToElementofAPage(race_AmericanIndianAlaskaNative);
		clickWebElement(race_AmericanIndianAlaskaNative);
		clickWebElement(race_Asian);
		clickWebElement(race_HispanicOrLatino);
		clickWebElement(race_UnableToDetermine);

		waitAndVerifyElement(unableToDetermineError);
		logger.info("Verified error :Multiple selections are unavailable when unable to determine is selected");

		clickWebElement(race_AmericanIndianAlaskaNative);
		clickWebElement(race_Asian);
		clickWebElement(race_HispanicOrLatino);
		clickWebElement(race_UnableToDetermine);
		waitForPageLoadTill(5);
		logger.info("Unchecked checkbox");
	}

	/**
	 * Verify all options under Race
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void verifyRaceOptions() {
		scrollingToElementofAPage(race_AmericanIndianAlaskaNative);
		waitForElement(race_AmericanIndianAlaskaNative);
		waitForElement(race_Asian);
		waitForElement(race_BlackAfricanAmerican);
		waitForElement(race_HispanicOrLatino);
		waitForElement(race_NativeHawaiian);
		waitForElement(race_ChooseNotToDisclose);
		waitForElement(race_White);
		logger.info("Verified all options under Race");
	}
	
	/**
	 * Verify all options under Race
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void verifyUnableToDetermineNotPresent() {
		scrollingToElementofAPage(race_AmericanIndianAlaskaNative);
		verifyElementNotPresent(race_UnableToDetermine);
		logger.info("Verified Unable To Determine Not Present");
	}
	
	/**
	 *Select options under Race
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectRaceOptions(String option) throws AcisException {
		scrollingToElementofAPage(race_AmericanIndianAlaskaNative);
		switch (option) {
		case "American Indian or Alaska Native":
			waitForElement(race_AmericanIndianAlaskaNative);
			clickWebElement(race_AmericanIndianAlaskaNative);
			break;
		case "Asian":
			waitForElement(race_Asian);
			clickWebElement(race_Asian);
			break;
		case "Black or African American":
			waitForElement(race_BlackAfricanAmerican);
			clickWebElement(race_BlackAfricanAmerican);
			break;
		case "Choose not to disclose":
			waitForElement(race_ChooseNotToDisclose);
			clickWebElement(race_ChooseNotToDisclose);
			break;
		case "Hispanic or Latino":
			waitForElement(race_HispanicOrLatino);
			clickWebElement(race_HispanicOrLatino);
			break;
		case "Native Hawaiian or Other Pacific Islander":
			waitForElement(race_NativeHawaiian);
			clickWebElement(race_NativeHawaiian);
			break;
		case "White":
			waitForElement(race_White);
			clickWebElement(race_White);
			break;
		default:
			logger.info("Selected Race :Invalid ");
			break;
		}
		logger.info("Selected Race : "+option);
	}

	/**
	 * Get DOB from intake_OS
	 * 
	 * @author mrunal.s.tilekar
	 */
	public String getDOB() {
		logger.info("Getting dob from intake OS");
		String dob = birthDateTextBox.getAttribute("value");
		logger.info("DOB  from intake OS: " + dob);
		return dob;
	}

	/**
	 * calculate age from birth-date
	 * 
	 * @author mrunal.s.tilekar
	 * @throws ParseException
	 */

	public void calculateAge() throws ParseException {

		String birthdate = birthDateTextBox.getAttribute("value");

		LocalDate today = LocalDate.now();
		System.out.println("Today's Date : " + today);

		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date d1 = df.parse(birthdate);
		String regBirthdateDate = df.format(d1);
		System.out.println("Given Birthdate: " + regBirthdateDate);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate localDate = LocalDate.parse(regBirthdateDate, formatter);
		System.out.println("Given birthdate in format: " + localDate);
		Period p = Period.between(localDate, today);

		age = p.getYears();

		System.out.println("Age Caluclated : " + age);

	}

	/**
	 * Verify age as per given birth-date
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void verifyAge() throws AcisException, InterruptedException {
		System.out.println("Global Age var value : " + age);
		waitAndVerifyElement(By.xpath("//div[text()='" + age + "']"));
		logger.info("Age is as expected  !");
		waitForPageLoadTill(5);
	}

	/**
	 * Enter future birth-date
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void provideFutureBirthDate(String year) throws AcisException, InterruptedException {
		logger.info("Entering future birth-date");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		waitForElementClickable(birthDateTextBox);
		act.moveToElement(birthDateTextBox).click().perform();
		// clickWebElement(birthDateTextBox);
		waitForElementClickable(birthdateYearlist);
		act.moveToElement(birthdateYearlist).click().perform();


		Select birthyearList = new Select(birthdateYearlist);
		List<WebElement> elementCount = birthyearList.getOptions();
		int iSize = elementCount.size();

		for (int i = 0; i < iSize; i++) {
			String birthyearValue = elementCount.get(i).getText().trim();
			// System.out.println(birthyearValue);
			if (birthyearValue.equalsIgnoreCase(year)) {
				birthyearList.selectByVisibleText(year);
				logger.info(" matching birthyear Value");
				break;
			} else {
				System.out.println("No matching birthyear Value");
				logger.info("No matching birthyear Value");
			}

		}
		act.moveToElement(nextMonth).click().perform();
		act.moveToElement(dateBirthdate).click().perform();
		
	//	clickWebElement(nextMonth);
	//	clickWebElement(dateBirthdate);
		age = 0;
	}
	/**
	 * Set First name, middle name, last name
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void setAllNamesReview(String firstName, String middleName, String lastName) throws AcisException {

		logger.info("Entering First name, middle name, last name");
//		waitForElement(nameInformationVerify);
		enterText(firstNameTextBoxReview, firstName);
		enterText(middleNameTextBoxreview, middleName);
		enterText(lastNameTextBoxReview, lastName);
		logger.info("Set First name, middle name, last name");
		waitForPageLoadTill(5);
	}

	
	/***
	 * @author akash.a.gaurav
	 * Close button
	 * @throws AcisException
	 */
	public void clickCloseButton() throws AcisException {
		logger.info("Clicking on save button");
		scrollingToElementofAPage(closeButton);
		clickWebElemntUsingJavascriptExecutor(closeButton);
//		waitForElement(saveVerify);
//		waitForPageLoadTill(5);
		logger.info("Clicked on save button");
	}
}
