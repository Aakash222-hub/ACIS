package com.acis.automation.pages.safetyassessment;

import java.io.IOException;
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

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ReviewAllegationReport_SA_OmniScriptPage extends PageBase{

	public ReviewAllegationReport_SA_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(ReviewAllegationReport_SA_OmniScriptPage.class);
		
	public static String personName=null;
	public static String firstName;
	public static String middleName;
	public static String lastName;
	public static int age;
	//Dharmesh Changes
	
	@FindBy(xpath = "//button[text()='Create/Add']")
	WebElement createAddButton;

	@FindBy(xpath = "(//button[@slot='iconRight'])[1]")
	WebElement editButton;
	
	@FindBy(xpath = "(//button[@slot='iconRight'])[2]")
	WebElement editButtonSecond;
	
	@FindBy(xpath = "(//button[@slot='iconRight'])[last()]")
	WebElement editButtonNext;
	
	@FindBy(xpath = "(//span[text()='Role']/../../..//input)[last()]")
	WebElement role;

	@FindBy(xpath = "(//div[@data-value='Alleged Victim'])[last()]")
	WebElement roleAllegedVictim;
	
	@FindBy(xpath = "(//div[@data-value='Alleged Maltreator'])[last()]")
	WebElement roleAllegedMaltreator;
	
	@FindBy(xpath = "(//span[contains(text(),'Primary Caregiver')])[last()]")
	WebElement primaryCaregiverText;
	
	@FindBy(xpath = "(//span[contains(text(),'Primary Caregiver')]/../span)[last()]")
	WebElement primaryCaregiverCheckbox;
	
	@FindBy(xpath = "(//*[text()='First Name']/../../following-sibling::div//input)[last()]")
	public static WebElement firstNameTextBox;

	@FindBy(xpath = "(//*[text()='Last Name']/../../following-sibling::div//input)[last()]")
	public static WebElement lastNameTextBox;

	@FindBy(xpath = "(//*[text()='Middle Name']/../../following-sibling::div//input)[last()]")
	public static WebElement middleNameTextBox;
	
	@FindBy(xpath = "(//span[text()='Suffix']/../../..//input)[last()]")
	WebElement suffix;
	
	@FindBy(xpath = "(//div[@data-label='I'])[last()]")
	WebElement suffixI;
	
	@FindBy(xpath = "(//div[@data-label='II'])[last()]")
	WebElement suffixII;
	
	@FindBy(xpath = "(//div[@data-label='III'])[last()]")
	WebElement suffixIII;
	
	@FindBy(xpath = "(//div[@data-label='IV'])[last()]")
	WebElement suffixIV;
	
	@FindBy(xpath = "(//div[@data-label='V'])[last()]")
	WebElement suffixV;
	
	@FindBy(xpath = "(//div[@data-label='Jr'])[last()]")
	WebElement suffixJr;
	
	@FindBy(xpath = "(//div[@data-label='Sr.'])[last()]")
	WebElement suffixSr;
	
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

	@FindBy(xpath = "(//*[text()='State']/../../..//input)[last()]")
	WebElement state;
		
	@FindBy(xpath = "(//*[text()='Zip Postal Code']/../../..//input)[last()]")
	WebElement zipCodeTextBox;
	
	@FindBy(xpath = "(//*[text()='Zip Postal Code']/../..//button)[last()]")
	WebElement zipCode_I;

	@FindBy(xpath = "(//span[contains(text(),'Primary Address')])[last()]")
	WebElement primaryAddressText;
	
	@FindBy(xpath = "(//span[contains(text(),'Primary Address')]/../span)[last()]")
	WebElement primaryAddressCheckBox;
	
	@FindBy(xpath = "(//*[contains(text(),'Date of Birth')]/../..//input)[last()]")
	public static WebElement birthDateTextBox;
	
	@FindBy(xpath = "(//*[text()='20'])[last()]")
	WebElement dateBirthdate;
	
	@FindBy(xpath = "(//button[@title='Next Month'])[last()]")
	WebElement nextMonth;

	@FindBy(xpath = "(//button[@title='Previous Month'])[last()]")
	WebElement previousMonth;
	
	@FindBy(xpath = "(//*[text()='Pick a year']/../..//select)[last()]")
	WebElement birthdateYearlist;
	
	@FindBy(xpath = "(//*[text()='Age']/../..//input[@type='tel'])[last()]")
	WebElement ageAtTimeOfReportTextbox;
	
	@FindBy(xpath = "(//*[text()='Gender']/../../..//input)[last()]")
	WebElement gender;
	
	@FindBy(xpath = "(//div[@data-label='Male'])[last()]")
	WebElement genderMale;
	
	@FindBy(xpath = "(//div[@data-label='Female'])[last()]")
	WebElement genderFemale;

	@FindBy(xpath = "(//*[contains(text(),'Date Of Death')]/../..//input)[last()]")
	WebElement deathDateTextbox;
	
	@FindBy(xpath = "(//span[text()='10'])[last()]")
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

	@FindBy(xpath = "(//span/following-sibling::span[text()='White'])[last()]")
	WebElement race_White;
	
	@FindBy(xpath = "(//*[text()='Unable to Determine'])[last()]")
	WebElement race_UnableToDetermine;

	@FindBy(xpath = "(//button[text()='Save'])[1]")
	WebElement saveButtonFirst;
	
	@FindBy(xpath = "(//*[text()='Individuals Involved']/../..//button[text()='Save'])[last()]")
	WebElement saveButton;

	@FindBy(xpath = "//iframe[@id='mytextarea_ifr']")
	WebElement narrativeIframe;
	
	@FindBy(xpath = "//body[@data-id='mytextarea']//p")
	WebElement narrative_textarea;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath="//h1[text()='Establish Relationships']")
	WebElement establishRelationshipPage;
	
	@FindBy(xpath = "(//span[text()='down icon']/parent::*/parent::button)[1]")
	WebElement downArrowPersonRecord;
	
	@FindBy(xpath = "//span[text()='Edit']/../..//a")
	WebElement editPersonRecord;
	
    
    @FindBy(xpath="(//div[@class='slds-size_12-of-12 slds-grid'])[1]")
    WebElement personAddedFirstrow;
    
    @FindBy(xpath="(//div[@class='slds-size_12-of-12 slds-grid'])[2]")
    WebElement personAddedSecondrow;
    
    @FindBy(xpath="(//input[@vlocity_ps-typeahead_typeahead_slds and @type='text'])[last()]")
    WebElement searchbox;
    
    @FindBy(xpath="(//button[text()='Cancel'])[last()]")
    WebElement cancelBtn;
    
    @FindBy(xpath="(//h1[text()='Review Allegation Report'])[last()]")
    WebElement reviewAllegationLabel;

    
    @FindBy(xpath="(//label[text()='Full Name'])[last()-1]")
    WebElement fullname;
    
    @FindBy(xpath="//a[text()='New']")
    WebElement New;
    
    @FindBy(xpath="//button[@title='Close Safety Assessment']")
    WebElement closeSafteyAssessmentButton;
    
    @FindBy(xpath = "//*[contains(text(),'New Safety Assessment')]/../..//a")
	WebElement newSafetyAssessmentButton;
 
    @FindBy(xpath = "(//span[text()='down icon']/parent::*/parent::button)[2]")
    WebElement downArrowPersonRecordSecond;
    
    @FindBy(xpath="//span[text()='Approx. Age']/../../..//input")
    WebElement textApproxAge;
    
    @FindBy(xpath="(//*[text()='Search for a Person'])[1]/../..//c-icon")
	WebElement iconbutton;

	public By middleNameError = By.xpath("//*[contains(text(),'Middle Name should not include numbers or Special characters')]");

	public By firstNameError = By.xpath("//*[contains(text(),'First Name should not include numbers or Special characters')]");

	public By lastNameError = By.xpath("//*[contains(text(),'Last Name should not include numbers or Special characters')]");

	public By firstNameRequired = By.xpath("//*[text()='First Name']/../../..//*[text()='required']");

	public By lastNameRequired = By.xpath("//*[text()='Last Name']/../../..//*[text()='required']");

	public By zipCode_error = By.xpath("//*[contains(text(),'Zip code must be in 99999 or 99999-9999 format')]");

	public By unableToDetermineError = By.xpath("//*[contains(text(),'Multiple selections are unavailable when unable to determine is selected')]");

	public By birthDateError = By.xpath("//*[contains(text(),'Birthdate Cannot be Greater than Date of Death')]");

	public By deathDateError = By.xpath("//*[contains(text(),'Date of Death Cannot be Future Date')]");
	
	
	/**
	 * verify rows added for persons
	 * @author amit.kulshreshtha
	 */
	
	
	public void verifyPersonAdded() throws AcisException, InterruptedException, IOException {
		waitForElement(personAddedFirstrow);
		personAddedFirstrow.isDisplayed();
		waitForElement(personAddedSecondrow);
		personAddedSecondrow.isDisplayed();
		logger.info("Persons added are present");
	}
	
	/**Select state
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void provideState(String stateOption) throws AcisException, InterruptedException {
		clickWebElement(state);
		logger.info("Select state");
		scrollingToElementofAPage(driver.findElement(By.xpath("//*[text()='"+ stateOption +"']")));
		driver.findElement(By.xpath("//*[text()='"+ stateOption +"']")).click();;
		logger.info("Select state option");
		waitForPageLoadTill(5);
	}
	
	
	/**
	 * Verify First Name and Last name are required field
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyFirstnameLastnamerequired() throws AcisException {
		clickWebElement(saveButton);
		waitAndVerifyElement(firstNameRequired);
		waitAndVerifyElement(lastNameRequired);
		logger.info("Verify First Name and Last name are required field");
	}

	/**
	 * Verify first name , middle name, last name can not accept numbers, symbols
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyAllNamesNotAcceptNumbers() throws AcisException {
		enterText(firstNameTextBox, "Demo@123");
		enterText(middleNameTextBox, "DEmo2#2");
		enterText(lastNameTextBox, "Demo$%5");

		waitAndVerifyElement(firstNameError);
		waitAndVerifyElement(middleNameError);
		waitAndVerifyElement(lastNameError);
		logger.info("Verify first name , middle name, last name can not accept numbers, symbols");

		firstNameTextBox.clear();
		middleNameTextBox.clear();
		lastNameTextBox.clear();

	}

	/**
	 * Set First name, middle name, last name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void setAllNames(String firstName, String middleName, String lastName) throws AcisException {
		enterText(firstNameTextBox, firstName);
		enterText(middleNameTextBox, middleName);
		enterText(lastNameTextBox, lastName);
		logger.info("Set First name, middle name, last name");
		personName = firstName + " " + middleName + " " + lastName;	
		waitForPageLoadTill(5);
	}

	public void getPersonName() {
		
		String[] fullName=personName.split(" ");	
		firstName=fullName[0];
		middleName=fullName[1];
		lastName= fullName[3];
		
	}
	
	/**
	 * Give suffix
	 * @author mrunal.s.tilekar
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
		
		logger.info("Set suffix");
		waitForPageLoadTill(5);
	}

	/**
	 * Set contact information : phone and email
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideContactInformation(String phoneOption, String emailIDOption) throws AcisException {

		enterTextUsingJavascript(phone, phoneOption);
		enterText(emailId, emailIDOption);
		logger.info("Set contact information : phone and email");
		waitForPageLoadTill(5);
	}


	/**
	 * Select role
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideRole(String roleoption) throws AcisException {
		
		clickWebElement(role);
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
		waitForPageLoadTill(5);
	}

	/**Select gender
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void prvoideGender(String genderOption) throws AcisException {

		clickWebElement(gender);

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
		logger.info("Select gender");
		
		waitForPageLoadTill(5);
	}

	
	/**
	 * Verify Error : Zip code must be in 99999 or 99999-9999 format
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyZipCodeFormat(String zipCodeValue) throws AcisException {

		enterText(zipCodeTextBox, zipCodeValue);
		hoverOverElement(zipCode_I);

		waitAndVerifyElement(zipCode_error);
		logger.info("Verify Error : Zip code must be in 99999 or 99999-9999 format");

	}
	
	/**
	 * Click Primary address check-box
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickPrimaryAddress() throws AcisException
	{
		waitForElement(primaryAddressText);
		scrollingToElementofAPage(primaryAddressCheckBox);
		clickWebElemntUsingJavascriptExecutor(primaryAddressCheckBox);
		logger.info("Click Primary address check-box");
		waitForPageLoadTill(5);
	}
	
	/**
	 * Click Primary Care-giver check-box
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickPrimaryCaregiver() throws AcisException
	{
		waitForElement(primaryCaregiverText);
		clickWebElemntUsingJavascriptExecutor(primaryCaregiverCheckbox);
		logger.info("Click Primary Caregiver check-box");
	}
	
	/**
	 * Verify error : Birthdate Cannot be Greater than Date of Death
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyDateofDeathEarlierError() throws AcisException {
		clickWebElement(birthDateTextBox);
		clickWebElement(dateBirthdate);
		clickWebElement(deathDateTextbox);
		clickWebElement(dateOfDeath);
	
		waitAndVerifyElement(birthDateError);
		logger.info("Verify error : Birthdate Cannot be Greater than Date of Death");
		
		birthDateTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		deathDateTextbox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	}
	
	/**
	 * Verify error : Date of death can not be future date
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyFutureDeathError() throws AcisException
	{
		clickWebElement(deathDateTextbox);
		clickWebElement(nextMonth);
		clickWebElement(dateOfDeath);
		
		waitAndVerifyElement(deathDateError);
		logger.info("Verify error : Date of death can not be future date");
		
		deathDateTextbox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		
	}
	
	
	/**
	 * Verify error :Multiple selections are unavailable when unable to determine is selected
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyMultipleSelectionError() throws AcisException {
		
		clickWebElement(race_AmericanIndianAlaskaNative);
		clickWebElement(race_Asian);
		clickWebElement(race_HispanicOrLatino);
		clickWebElement(race_UnableToDetermine);
		
		waitAndVerifyElement(unableToDetermineError);
		logger.info("Verify error :Multiple selections are unavailable when unable to determine is selected");
		
		clickWebElement(race_AmericanIndianAlaskaNative);
		clickWebElement(race_Asian);
		clickWebElement(race_HispanicOrLatino);
		clickWebElement(race_UnableToDetermine);
		waitForPageLoadTill(5);
	}
	
	/**
	 * Verify all options under Race
	 * @author mrunal.s.tilekar
	 */
	public void verifyRaceOptions() {
		
		waitForElement(race_AmericanIndianAlaskaNative);
		waitForElement(race_Asian);
		waitForElement(race_BlackAfricanAmerican);
		waitForElement(race_HispanicOrLatino);
		waitForElement(race_NativeHawaiian);
		waitForElement(race_UnableToDetermine);
		waitForElement(race_White);
	}
	
	/**
	 * Enter Birth-date
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideBirthdate(String year) throws AcisException {

		scrollingToElementofAPage(birthDateTextBox);
		clickWebElement(birthDateTextBox);
		clickWebElement(birthdateYearlist);

		Select birthyearList = new Select(birthdateYearlist);
		List<WebElement> elementCount = birthyearList.getOptions();
		int iSize = elementCount.size();

		for (int i = 0; i < iSize; i++) {
			String birthyearValue = elementCount.get(i).getText().trim();
			System.out.println(birthyearValue);
			if (birthyearValue.equalsIgnoreCase(year)) {
				birthyearList.selectByVisibleText(year);
				logger.info(" matching birthyear Value");
				break;
			} else {
				System.out.println("No matching birthyear Value");
				logger.info("No matching birthyear Value");
			}
		}

		clickWebElement(dateBirthdate);

		waitForPageLoadTill(5);
        
	}
	 
	/**
	 * Enter future birth-date
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void provideFutureBirthDate(String year) throws AcisException, InterruptedException {
		 
		scrollingToElementofAPage(birthDateTextBox);
		waitForPageLoadTill(5);
		clickWebElement(birthDateTextBox);
	    clickWebElement(birthdateYearlist);
	 
	    Select birthyearList = new Select(birthdateYearlist); 
	    List<WebElement> elementCount =birthyearList.getOptions(); 
		  int iSize = elementCount.size();
		  
		  for (int i = 0; i < iSize; i++) 
		  {
			  String birthyearValue = elementCount.get(i).getText().trim(); 
			  System.out.println(birthyearValue); 
			  if(birthyearValue.equalsIgnoreCase(year)) 
			  {
				  birthyearList.selectByVisibleText(year); 
				  logger.info(" matching birthyear Value");
				  break; 
			  } 
			  else 
			  {
				  System.out.println("No matching birthyear Value");
				  logger.info("No matching birthyear Value"); }
			  }
		 
        clickWebElement(nextMonth);
        clickWebElement(dateBirthdate);
        age=0;
	}
	
	/**
	 * calculate age from birth-date
	 * @author mrunal.s.tilekar
	 * @throws ParseException 
	 */
	
	public void calculateAge() throws ParseException {
		
		String birthdate = birthDateTextBox.getAttribute("value");
		
		LocalDate today = LocalDate.now(); 
        System.out.println("Today's Date : "+today);
        
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date d1 = df.parse(birthdate);
		String regBirthdateDate = df.format(d1);
        System.out.println("Given Birthdate: "+regBirthdateDate);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate localDate = LocalDate.parse(regBirthdateDate, formatter);
        System.out.println("Given birthdate in format: " +localDate);
        Period p = Period.between(localDate, today);
	
		age=p.getYears();
		
		System.out.println("Age Caluclated : " + age);
		
	}
	
	/**
	 * Verify age as per given birth-date
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyAge() throws AcisException, InterruptedException {
		System.out.println("Global Age var value : " + age);
		waitAndVerifyElement(By.xpath("//div[text()='"+ age+"']"));
		logger.info("Age is as expected  !");
		waitForPageLoadTill(5);
	}
	
	
	/**
	 * Click on Create/Add button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickCreateAddButton() throws AcisException, InterruptedException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		scrollingToElementofAPage(createAddButton);
		waitForElement(createAddButton);
		clickWebElemntUsingJavascriptExecutor(createAddButton);
		logger.info("Click on Create/Add button");
		waitForPageLoadTill(5);
	}
	
	/**
	 * Click on edit button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickEditButton(String option) throws AcisException {
		switch(option)
		{
		case "first":
			logger.info("Clicking on edit button");
			clickWebElement(editButton);
			logger.info("Clicked on edit button");
			break;
		case "second":
			logger.info("Clicking on edit button");
			clickWebElement(editButtonSecond);
			logger.info("Clicked on edit button");
			break;
		case "next":
			logger.info("Clicking on edit button");
			clickWebElement(editButtonNext);
			logger.info("Clicked on edit button");
			break;
			default:
				logger.info("Edit button not found");
		}
		waitForPageLoadTill(5);
		
	}
	
	/**
	 * Click on save button
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
				waitForElement(createAddButton);
				logger.info("Clicked on save button");
				break;
		}
		waitForPageLoadTill(5);
		
	}
	/**
	 * click on Next button
	 * @author mrunal.s.tilekar
	 */
	public void clickNextButton() throws AcisException, InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(5);
		waitForElementClickable(nextButton);
		clickWebElement(nextButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Next button");
		waitForElement(establishRelationshipPage);
		logger.info("User is on the establishRelationshipPage");

	}

	/**
	 * Click on edit button of 1st person record from table
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public void clickEditFirstRecordButton() throws AcisException, InterruptedException, IOException {
		waitForPageLoadTill(10);
		scrollDownTillPageEnd();
		clickWebElemntUsingJavascriptExecutor(downArrowPersonRecord);
		clickWebElement(editPersonRecord);
		logger.info("Click on edit button of 1st person record from table");
		clickWebElemntUsingJavascriptExecutor(iconbutton);
		
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
		scrollingToElementofAPage(downArrowPersonRecord);
		clickWebElement(driver.findElement(By.xpath("//*[contains(text(),'"+personName+"')]/../..//span[text()='down icon']/parent::*/parent::button")));
		clickWebElement(editPersonRecord);
		logger.info("Clicked on edit button of "+personName+" person record from table");
		
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
				emailIdFirst.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				clickWebElement(emailIdFirst);
				waitForPageLoadTill(5);
				act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
			//	enterText(emailIdFirst, strValue);
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
	public void verifyPersonData(String ExistingPerson)throws AcisException , InterruptedException{
		waitForElement(searchbox);
		enterText(searchbox, ExistingPerson);
		waitForPageLoadTill(10);
		//waitForElement(searchRecord1);
		waitForElement(cancelBtn);
		clickWebElement(cancelBtn);
		waitForPageLoadTill(5);
		waitForElement(reviewAllegationLabel);
		logger.info("record found successfully");
		
		//isElementPresent(By.xpath("//span[@vlocity_ps-typeahead_typeahead_slds and @class='slds-listbox__option-text slds-listbox__option-text_entity']/text()='Name: first last; DOB: 8/19/2000; Age: 20; LKA:  ; Mother's Name: '"));
		
	}
	
	/**
	 * Search for Exisiting Person in ReviewAllegationReport Page
	 * @author Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	
	public void verifyExisitingPerson(String ExistingPerson) throws AcisException , InterruptedException{
		logger.info("Searching for Record in Person Search");
		waitForElement(searchbox);
		enterText(searchbox, ExistingPerson);
		waitForPageLoadTill(10);
		isElementPresent(By.xpath("//span[contains(text(),'"+ ExistingPerson +"')]"));
		waitForElement(cancelBtn);
		clickWebElement(cancelBtn);
		waitForPageLoadTill(5);
		waitForElement(reviewAllegationLabel);
		logger.info("record found successfully");
		
	}
	
	
	/**
	 * Search for new person
	 * @author amit.kulshreshtha
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	
	public void searchNewPerson(String NewPerson) throws AcisException , InterruptedException{
		logger.info("Trying to add New Person");
		waitForElement(searchbox);
		enterText(searchbox, NewPerson);
		waitForElement(New);
		clickWebElement(New);
		waitForElement(fullname);
		logger.info("New Person can be added from here");
		
		
		
	}
	
	/**
	 * Edit Approx age 
	 * @author Khushboo
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	
	public void EditApproxAge() throws AcisException , InterruptedException{
		logger.info("Editing Approx age ");
		waitForElement(textApproxAge);
		scrollingToElementofAPage(textApproxAge);
		clickWebElement(textApproxAge);
		enterText(textApproxAge, "32 yr 1 month");
				
	}
	
	/**
	 * Close Case Safety Assessment Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeSafetyAssessmentTab() throws AcisException {
		logger.info("Closing Case Safety Assessment Tab");
		 if(closeSafteyAssessmentButton.isDisplayed()) {

			clickWebElement(closeSafteyAssessmentButton);
			waitForPageLoadTill(2);
		}
		logger.info("Closed Case Safety Assessment Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForElement(newSafetyAssessmentButton);
		logger.info("successfully Closed Case Safety Assessment Tab");
	}
	
}
