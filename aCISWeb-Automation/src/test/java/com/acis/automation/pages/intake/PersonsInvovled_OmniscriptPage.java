package com.acis.automation.pages.intake;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PersonsInvovled_OmniscriptPage extends PageBase {

	public PersonsInvovled_OmniscriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_OmniscriptPage.class);
	
	public static String personName=null;
	public static String firstName;
	public static String middleName;
	public static String lastName;
	public static int age;
//Dharmesh Changes
	@FindBy(xpath = "(//*[text()[contains(.,'Person(s) Involved')]])[2]")
	WebElement personsInvolvedTitle;
	
	@FindBy(xpath = "//h1[text()='Agency History']")
	WebElement agencyHistoryTitle;

	@FindBy(xpath = "//div[contains(text(),'Intake Person Information')]")
	WebElement intakePersonInformationLabel;

	@FindBy(xpath = "//button[text()='Create/Add']")
	WebElement createAddButton;

	@FindBy(xpath = "//button[@slot='iconRight']")
	WebElement editButton;
	
	@FindBy(xpath = "(//button[@slot='iconRight'])[2]")
	WebElement editButtonSecond;
	
	@FindBy(xpath = "(//button[@slot='iconRight'])[last()]")
	WebElement editButtonNext;
	
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Role']/../../..//input)[1]")
	WebElement role;

	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Role']/../../..//div[@data-value='Alleged Victim'])[1]")
	WebElement roleAllegedVictim;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Role']/../../..//div[@data-value='Alleged Maltreator'])[1]")
	WebElement roleAllegedMaltreator;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[contains(text(),'Primary Caregiver')])[1]")
	WebElement primaryCaregiverText;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[contains(text(),'Primary Caregiver')]/preceding-sibling::span)[1]")
	WebElement primaryCaregiverCheckbox;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='First Name']/../../following-sibling::div//input)[1]")
	public static WebElement firstNameTextBox;

	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Last Name']/../../following-sibling::div//input)[1]")
	public static WebElement lastNameTextBox;

	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Middle Name']/../../following-sibling::div//input)[1]")
	public static WebElement middleNameTextBox;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Suffix']/../../..//input)[1]")
	WebElement suffix;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='I'])[1]")
	WebElement suffixI;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='II'])[1]")
	WebElement suffixII;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='III'])[1]")
	WebElement suffixIII;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='IV'])[1]")
	WebElement suffixIV;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='V'])[1]")
	WebElement suffixV;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='Jr'])[1]")
	WebElement suffixJr;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='Sr.'])[1]")
	WebElement suffixSr;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Phone']/../..//input)[1]")
	WebElement phone;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Email']/../../..//input)[1]")
	WebElement emailId;
	
	
	@FindBy(xpath = "//span/following-sibling::span[text()='American Indian or Alaska Native']")
	WebElement race_AmericanIndianAlaskaNative;

	@FindBy(xpath = "//span/following-sibling::span[text()='Asian']")
	WebElement race_Asian;

	@FindBy(xpath = "//span/following-sibling::span[text()='Black or African American']")
	WebElement race_BlackAfricanAmerican;
	
	@FindBy(xpath = "//span/following-sibling::span[text()='Hispanic or Latino']")
	WebElement race_HispanicOrLatino;

	@FindBy(xpath = "//span/following-sibling::span[text()='Native Hawaiian or Other Pacific Islander']")
	WebElement race_NativeHawaiian;

	@FindBy(xpath = "//span/following-sibling::span[text()='White']")
	WebElement race_White;
	
	@FindBy(xpath = "//*[text()='Unable to Determine']")
	WebElement race_UnableToDetermine;

	@FindBy(xpath = "(//*[text()='Intake Person Information']/../..//button[text()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "//iframe[@id='mytextarea_ifr']")
	WebElement narrativeIframe;
	
	@FindBy(xpath = "//body[@data-id='mytextarea']//p")
	WebElement narrative_textarea;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton_PersonsInvovled;
	
	@FindBy(xpath = "(//span[text()='down icon']/parent::*/parent::button)[1]")
	WebElement downArrowPersonRecord;
	
	@FindBy(xpath = "//span[text()='Edit']/../..//a")
	WebElement editPersonRecord;
	

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Role']/../../..//input)[2]")
    WebElement roleSecond;

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Role']/../../..//div[@data-value='Alleged Victim'])[2]")
    WebElement roleAllegedVictimSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Role']/../../..//div[@data-value='Alleged Maltreator'])[2]")
    WebElement roleAllegedMaltreatorSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Role']/../../..//input)[last()]")
    WebElement roleNext; 

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Role']/../../..//div[@data-value='Alleged Victim'])[last()]")
    WebElement roleAllegedVictimNext;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Role']/../../..//div[@data-value='Alleged Maltreator'])[last()]")
    WebElement roleAllegedMaltreatorNext;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[contains(text(),'Primary Caregiver')])[2]")
    WebElement primaryCaregiverTextSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[contains(text(),'Primary Caregiver')]/preceding-sibling::span)[2]")
    WebElement primaryCaregiverCheckboxSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='First Name']/../../following-sibling::div//input)[2]")
    public static WebElement firstNameTextBoxSecond;

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='First Name']/../../following-sibling::div//input)[last()]")
    public static WebElement firstNameTextBoxNext;

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Last Name']/../../following-sibling::div//input)[2]")
    public static WebElement lastNameTextBoxSecond;

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Last Name']/../../following-sibling::div//input)[last()]")
    public static WebElement lastNameTextBoxNext;
 

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Middle Name']/../../following-sibling::div//input)[2]")
    public static WebElement middleNameTextBoxSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Middle Name']/../../following-sibling::div//input)[last()]")
    public static WebElement middleNameTextBoxNext;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[text()='Suffix']/../../..//input)[2]")
    WebElement suffixSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='I'])[2]")
    WebElement suffixISecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='II'])[2]")
    WebElement suffixIISecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='III'])[2]")
    WebElement suffixIIISecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='IV'])[2]")
    WebElement suffixIVSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='V'])[2]")
    WebElement suffixVSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='Jr'])[2]")
    WebElement suffixJrSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='Sr.'])[2]")
    WebElement suffixSrSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Phone']/../..//input)[2]")
    WebElement phoneSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Email']/../../..//input)[2]")
    WebElement emailIdSecond;
    
    @FindBy(xpath = "(//span/following-sibling::span[text()='American Indian or Alaska Native'])[2]")
    WebElement race_AmericanIndianAlaskaNativeSecond;

    @FindBy(xpath = "(//span/following-sibling::span[text()='Asian'])[2]")
    WebElement race_AsianSecond;

    @FindBy(xpath = "(//span/following-sibling::span[text()='Black or African American'])[2]")
    WebElement race_BlackAfricanAmericanSecond;
    
    @FindBy(xpath = "(//span/following-sibling::span[text()='Hispanic or Latino'])[2]")
    WebElement race_HispanicOrLatinoSecond;

    @FindBy(xpath = "(//span/following-sibling::span[text()='Native Hawaiian or Other Pacific Islander'])[2]")
    WebElement race_NativeHawaiianSecond;

    @FindBy(xpath = "(//span/following-sibling::span[text()='White'])[2]")
    WebElement race_WhiteSecond;
    
    @FindBy(xpath = "(//*[text()='Unable to Determine'])[2]")
    WebElement race_UnableToDetermineSecond;

    @FindBy(xpath = "(//*[text()='Intake Person Information']/../..//button[text()='Save'])[2]")
    WebElement saveButtonSecond;
    
    @FindBy(xpath = "(//*[text()='Intake Person Information']/../..//button[text()='Save'])[last()]")
    WebElement saveButtonNext;
    
    @FindBy(xpath="(//div[@class='slds-size_12-of-12 slds-grid'])[1]")
    WebElement personAddedFirstrow;
    
    @FindBy(xpath="(//div[@class='slds-size_12-of-12 slds-grid'])[2]")
    WebElement personAddedSecondrow;

    @FindBy(xpath = "(//span[text()='down icon']/parent::*/parent::button)[2]")
    WebElement downArrowPersonRecordSecond;
    
    @FindBy(xpath="//input[@vlocity_ps-typeahead_typeahead_slds and @type='text']")
    WebElement searchbox;
    
    @FindBy(xpath="(//label[text()='Full Name'])[1]")
    WebElement fullname;
    
    @FindBy(xpath="//a[text()='New']")
    WebElement New;
    
    @FindBy(xpath="//span[@vlocity_ps-typeahead_typeahead_slds and @class='slds-listbox__option-text slds-listbox__option-text_entity']/text()='Name: first last; DOB: 8/19/2000; Age: 20; LKA:  ; Mother's Name: '")
    WebElement searchRecord;
    
    @FindBy(xpath="//*[text()='Name: first last; DOB: 8/19/2000; Age: 20; LKA:  ; Mother's Name: ']")
    WebElement searchRecord1;
    
    @FindBy(xpath="//*[text()='Intake Person Information']/../..//button[text()='Cancel']")
    WebElement cancelBtn;
    
    @FindBy(xpath="//h1[text()='Person(s) Involved']")
    WebElement personInvolvedLabel;
    
    @FindBy(xpath="//*[text()='Placement Resource Information']/../..//button[text()='Save']")
    WebElement saveButtonPlacementResourceInfromation;
    
    @FindBy(xpath="//button[contains(text(),'Refresh Person')]")
    WebElement refreshPersonsButton;
    
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Street 1']/../../..//input)[1]")
	public static WebElement street1;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Street 2']/../../..//input)[1]")
	public static WebElement street2;

	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='City']/../../..//input)[1]")
	public static WebElement city;

	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='State']/../../..//input)[1]")
	WebElement state;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Country']/../../..//input)")
	WebElement country;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Zip/Postal Code']/../../..//input)[1]")
	WebElement zipCodeTextBox;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Zip/Postal Code']/../..//button)[1]")
	WebElement zipCode_I;

	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[contains(text(),'Primary Address')])[1]")
	WebElement primaryAddressText;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[contains(text(),'Primary Address')]/../span)[1]")
	WebElement primaryAddressCheckBox;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[contains(text(),'Date of Birth')]/../..//input)[1]")
	public static WebElement birthDateTextBox;
	
	@FindBy(xpath = "//h1[text()='Intake Person Information']/../..//*[text()='20']")
	WebElement dateBirthdate;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='20'])[2]")
	WebElement dateBirthdateSecond;
	
	@FindBy(xpath = "//h1[text()='Intake Person Information']/../..//button[@title='Next Month']")
	WebElement nextMonth;

	@FindBy(xpath = "//h1[text()='Intake Person Information']/../..//button[@title='Previous Month']")
	WebElement previousMonth;
	
	@FindBy(xpath = "//h1[text()='Intake Person Information']/../..//*[text()='Pick a year']/../..//select")
	WebElement birthdateYearlist;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Pick a year']/../..//select)[2]")
	WebElement birthdateYearlistSecond;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[contains(text(),'Age')]/../../..//input[@type='text'])[1]")
	WebElement ageAtTimeOfReportTextbox;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Gender']/../../..//input)[1]")
	WebElement gender;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='Male'])[1]")
	WebElement genderMale;
	
	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='Female'])[1]")
	WebElement genderFemale;

	@FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[contains(text(),'Date of Death')]/../..//input)[1]")
	WebElement deathDateTextbox;
	
	@FindBy(xpath = "//h1[text()='Intake Person Information']/../..//span[text()='10']")
	WebElement dateOfDeath;
	
	
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Street 1']/../../..//input)[2]")
    public static WebElement street1Second;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Street 2']/../../..//input)[2]")
    public static WebElement street2Second;

 

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='City']/../../..//input)[2]")
    public static WebElement citySecond;

 

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='State']/../../..//input)[2]")
    WebElement stateSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Country']/../../..//input)[2]")
    WebElement countrySecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Zip/Postal Code']/../../..//input)[2]")
    WebElement zipCodeTextBoxSecond;

 

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//span[contains(text(),'Primary Address')])[2]")
    WebElement primaryAddressTextSecond;
    
    @FindBy(xpath = "((//h1[text()='Intake Person Information']/../..//span[contains(text(),'Primary Address')])[2]/../span)[1]")
    WebElement primaryAddressCheckBoxSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[contains(text(),'Date of Birth')]/../..//input)[3]")
    public static WebElement birthDateTextBoxSecond;
    
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Age at Time of Report']/../..//input[@type='tel'])[2]")
    WebElement ageAtTimeOfReportTextboxSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[text()='Gender']/../../..//input)[2]")
    WebElement genderSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='Male'])[2]")
    WebElement genderMaleSecond;
    
    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//div[@data-label='Female'])[2]")
    WebElement genderFemaleSecond;

    @FindBy(xpath = "(//h1[text()='Intake Person Information']/../..//*[contains(text(),'Date of Death')]/../..//input)[2]")
    WebElement deathDateTextboxSecond;

    public By relationshipText = By.xpath("//*[text()='Relationship']");

	public By middleNameError = By.xpath("//*[contains(text(),'Middle Name should not include numbers or Special characters')]");

	public By firstNameError = By.xpath("//*[contains(text(),'First Name should not include numbers or Special characters')]");

	public By lastNameError = By.xpath("//*[contains(text(),'Last Name should not include numbers or Special characters')]");

	public By firstNameRequired = By.xpath("//*[text()='First Name']/../../..//*[text()='required']");

	public By lastNameRequired = By.xpath("//*[text()='Last Name']/../../..//*[text()='required']");

	public By zipCode_error = By.xpath("//*[contains(text(),'Zip code must be in 99999 or 99999-9999 format')]");

	public By zipCodeFormat_error = By.xpath("//*[contains(text(),'must be in ##### or #####-#### format')]");

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
		logger.info("Persons added are present");
	}
	
	/**Select state
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void provideState(String option,String stateOption) throws AcisException, InterruptedException {
		switch(option)
		{
			case "first":
				clickWebElement(state);
		        logger.info("Selected state");
		        scrollingToElementofAPage(driver.findElement(By.xpath("//*[text()='"+ stateOption +"']")));
		       driver.findElement(By.xpath("//*[text()='"+ stateOption +"']")).click();;
		       
		        logger.info("Selected state option");
				break;
			case "second":
				clickWebElement(stateSecond);
				logger.info("Selected state");
				scrollingToElementofAPage(driver.findElement(By.xpath("(//*[text()='"+ stateOption +"'])[2]")));
				driver.findElement(By.xpath("(//*[text()='"+ stateOption +"'])[2]")).click();
				logger.info("Selected state option");
				break;
		}
		waitForPageLoadTill(5);
	}
	
	/**Select country
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideCountry(String option,String countryOption) throws AcisException {
		switch(option)
		{
			case "first":
				logger.info("Selecting country");
				scrollingToElementofAPage(country);
		        clickWebElement(country);
		        scrollingToElementofAPage(driver.findElement(By.xpath("//*[text()='"+ countryOption +"']")));
		        driver.findElement(By.xpath("//*[text()='"+ countryOption +"']")).click();
		        logger.info("Selected country");
				break;
			case "second":
				logger.info("Selectingcountry");
				scrollingToElementofAPage(country);
				clickWebElement(countrySecond);
				scrollingToElementofAPage(driver.findElement(By.xpath("(//*[text()='"+ countryOption +"'])[2]")));
				driver.findElement(By.xpath("(//*[text()='"+ countryOption +"'])[2]")).click();
				logger.info("Select country");
				break;
		}
		waitForPageLoadTill(5);
		
	}

	
	/**
	 * Verify First Name and Last name are required field
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyFirstnameLastnamerequired() throws AcisException {
		firstNameTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		middleNameTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		lastNameTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		scrollingToElementofAPage(saveButton);
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
		scrollingToElementofAPage(firstNameTextBox);
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
	public void setAllNames(String option,String firstName, String middleName, String lastName) throws AcisException {
		switch(option)
		{
			case "first":
				logger.info("Entering First name, middle name, last name");	
				enterText(firstNameTextBox, firstName);
				enterText(middleNameTextBox, middleName);
				enterText(lastNameTextBox, lastName);

				logger.info("Set First name, middle name, last name");		
				personName=firstName+" "+ middleName+" "+ lastName;	
				break;
			case "second":
				logger.info("Entering First name, middle name, last name");	
				enterText(firstNameTextBoxSecond, firstName);
				enterText(middleNameTextBoxSecond, middleName);
				enterText(lastNameTextBoxSecond, lastName);

				logger.info("Set First name, middle name, last name");		
				personName=firstName+" "+ middleName+" "+ lastName;	
				break;
			case "next":
				logger.info("Entering First name, middle name, last name");	
				enterText(firstNameTextBoxNext, firstName);
				enterText(middleNameTextBoxNext, middleName);
				enterText(lastNameTextBoxNext, lastName);

				logger.info("Set First name, middle name, last name");		
				personName=firstName+" "+ middleName+" "+ lastName;	
				break;
		}
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

	public void prvoideSuffix(String option,String suffixOption) throws AcisException {
		if(option.equals("first"))
		{
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
		else if(option.equals("second"))
		{
			clickWebElement(suffixSecond);
			
			switch (suffixOption) {
			case "I":
				clickWebElement(suffixISecond);
				logger.info("Set suffix I");
				break;
				
			case "II":
				clickWebElement(suffixIISecond);
				logger.info("Set suffix II");
				break;
				
			case "III":
				clickWebElement(suffixIIISecond);
				logger.info("Set suffix III");
				break;
				
			case "IV":
				clickWebElement(suffixIVSecond);
				logger.info("Set suffix IV");
				break;
				
			case "V":
				clickWebElement(suffixVSecond);
				logger.info("Set suffix V");
				break;
				
			case "Jr":
				clickWebElement(suffixJrSecond);
				logger.info("Set suffix Jr");
				break;
				
			case "Sr":
				clickWebElement(suffixSrSecond);
				logger.info("Set suffix Sr");
				break;
			
	
			default:
				logger.info("No matching suffix value");
				break;
			}
		}
		logger.info("Set suffix");
		waitForPageLoadTill(5);
	}

	/**
	 * Set contact information : phone and email
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideContactInformation(String option,String phoneOption, String emailIDOption) throws AcisException {
		Actions act = new Actions(driver);
		switch(option)
		{
			case "first":
				logger.info("Entering contact information : phone and email");	
				
				clickWebElement(phone);
				act.sendKeys(Keys.CONTROL).sendKeys(phoneOption).perform();
			//	enterTextUsingJavascript(phone, phoneOption);
				enterText(emailId, emailIDOption);
				logger.info("Set contact information : phone and email");	
				break;
			case "second":
				logger.info("Entering contact information : phone and email");
				//enterTextUsingJavascript(phoneSecond, phoneOption);
				clickWebElement(phoneSecond);
				act.sendKeys(Keys.CONTROL).sendKeys(phoneOption).perform();
				enterText(emailIdSecond, emailIDOption);
				logger.info("Set contact information : phone and email");
				break;
		}
		waitForPageLoadTill(5);
	}


	/**
	 * Select role
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideRole(String option,String roleoption) throws AcisException {
		
		if(option.equals("first"))
		{
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
		else if(option.equals("second"))
		{
			clickWebElement(roleSecond);
			logger.info("Clicked on role");
			switch (roleoption) {
			case "Alleged Victim":
				clickWebElement(roleAllegedVictimSecond);
				logger.info("Role Alleged Victim Selected");
				break;
				
			case "Alleged Maltreator":
				clickWebElement(roleAllegedMaltreatorSecond);
				logger.info("Role Alleged Maltreator Selected");
				break;

			default:
				logger.info("No matching role option");
				break;
			}
			
		}
		else if(option.equals("next"))
		{
			clickWebElement(roleNext);
			logger.info("Clicked on role");
			switch (roleoption) {
			case "Alleged Victim":
				clickWebElement(roleAllegedVictimNext);
				logger.info("Role Alleged Victim Selected");
				break;
				
			case "Alleged Maltreator":
				clickWebElement(roleAllegedMaltreatorNext);
				logger.info("Role Alleged Maltreator Selected");
				break;

			default:
				logger.info("No matching role option");
				break;
			}
			
		}
		
		waitForPageLoadTill(5);
	}

	/**Select gender
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void prvoideGender(String option,String genderOption) throws AcisException {
		if(option.equals("first"))
		{
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
			logger.info("Select gender");
		}
		else if(option.equals("second"))
		{
			clickWebElement(genderSecond);
			logger.info("Clicked on gender dropdown");
			switch (genderOption) {
			case "Male":
				clickWebElement(genderMaleSecond);
				logger.info("Gender Male Selected");
				break;
				
			case "Female":
				clickWebElement(genderFemaleSecond);
				logger.info("Gender Female Selected");
				break;

			default:
				logger.info("No matching gender option");
				break;
			}
			logger.info("Select gender");
		}
		
		waitForPageLoadTill(5);
	}

	
	/**
	 * Verify Error : A zipcode must be in ##### or #####-#### format
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyZipCodeFormat(String zipCodeValue) throws AcisException {
		zipCodeTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		scrollingToElementofAPage(zipCodeTextBox);
		enterText(zipCodeTextBox, zipCodeValue);
		waitAndVerifyElement(zipCodeFormat_error);
		logger.info("Verify Error : A zipcode must be in ##### or #####-#### format");

	}
	
	/**
	 * Verify Error : Zip code must be in 99999 or 99999-9999 format
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyZipCode(String zipCodeValue) throws AcisException {

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
		logger.info("Clicking Primary address check-box");
		waitForElement(primaryAddressText);
		scrollingToElementofAPage(primaryAddressCheckBox);
		clickWebElemntUsingJavascriptExecutor(primaryAddressCheckBox);
		logger.info("Clicked Primary address check-box");
		waitForPageLoadTill(5);
	}
	
	/**
	 * Click Primary Care-giver check-box
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickPrimaryCaregiver() throws AcisException
	{
		logger.info("Clicking Primary Caregiver check-box");
		waitForElement(primaryCaregiverText);
		clickWebElemntUsingJavascriptExecutor(primaryCaregiverCheckbox);
		logger.info("Clicked Primary Caregiver check-box");
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
		scrollingToElementofAPage(deathDateTextbox);
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
		
		logger.info("Verifying error :Multiple selections are unavailable when unable to determine is selected");
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
		logger.info("Verified all options under Race");
	}
	
	/**
	 * Enter Birth-date
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideBirthdate(String option,String year) throws AcisException {
		switch(option)
		{
			case "first":
				logger.info("Entering BirthDate"); 
				scrollingToElementofAPage(birthDateTextBox);
				clickWebElement(birthDateTextBox);
			    clickWebElement(birthdateYearlist);
			 
			    Select birthyearList = new Select(birthdateYearlist); 
			    List<WebElement> elementCount =birthyearList.getOptions(); 
				  int iSize = elementCount.size();
				  
				  for (int i = 0; i < iSize; i++) 
				  {
					  String birthyearValue = elementCount.get(i).getText().trim(); 
					//  System.out.println(birthyearValue); 
					  if(birthyearValue.equalsIgnoreCase(year)) 
					  {
						  birthyearList.selectByVisibleText(year); 
						  logger.info(" matching birthyear Value");
						  break; 
					  } 
					  else 
					  {
						  System.out.println("No matching birthyear Value");
						  logger.info("No matching birthyear Value"); 
					  }
					  
				  }
				 
		        clickWebElement(dateBirthdate);	
		        logger.info("BirthDate entered"); 
				break;
				
			case "second":
				logger.info("Entering BirthDate"); 
				scrollingToElementofAPage(birthDateTextBoxSecond);
				clickWebElement(birthDateTextBoxSecond);
			    clickWebElement(birthdateYearlistSecond);
			 
			    Select birthyearLists = new Select(birthdateYearlistSecond); 
			    List<WebElement> elementCounts =birthyearLists.getOptions(); 
				  int iSizes = elementCounts.size();
				  
				  for (int i = 0; i < iSizes; i++) 
				  {
					  String birthyearValue = elementCounts.get(i).getText().trim(); 
					  System.out.println(birthyearValue); 
					  if(birthyearValue.equalsIgnoreCase(year)) 
					  {
						  birthyearLists.selectByVisibleText(year); 
						  logger.info(" matching birthyear Value");
						  break; 
					  } 
					  else 
					  {
						  System.out.println("No matching birthyear Value");
						  logger.info("No matching birthyear Value"); 
					  }
					}
				 
		        
		        clickWebElement(dateBirthdateSecond);
		        logger.info("BirthDate entered"); 
				break;
		}
		
		waitForPageLoadTill(5);
        
	}
	 
	/**
	 * Enter future birth-date
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void provideFutureBirthDate(String year) throws AcisException, InterruptedException {
		logger.info("Entering future birth-date");
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
			 // System.out.println(birthyearValue); 
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
		
		/*
		 * LocalDate today = LocalDate.now();
		 * System.out.println("Today's Date : "+today);
		 * 
		 * DateFormat df = new SimpleDateFormat("MM-dd-yyyy"); Date d1 =
		 * df.parse(birthdate); String regBirthdateDate = df.format(d1);
		 * System.out.println("Given Birthdate: "+regBirthdateDate);
		 * 
		 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		 * LocalDate localDate = LocalDate.parse(regBirthdateDate, formatter);
		 * System.out.println("Given birthdate in format: " +localDate); Period p =
		 * Period.between(localDate, today);
		 */
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Date d = sdf.parse(birthdate);
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate birthDateIntakeOS = LocalDate.of(year, month, date);
        LocalDate todayDate = LocalDate.now();
        System.out.println("Birthdate from intake OS : " + birthDateIntakeOS);
        System.out.println("Today's Date :" + todayDate);
        Period difference = Period.between(birthDateIntakeOS,todayDate);
        System.out.println("age:" + difference.getYears() + "years");
	
		age=difference.getYears();
		
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
		logger.info("Clicking on Create/Add button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(createAddButton);
		clickWebElement(createAddButton);
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
	public void clickSaveButton(String option) throws AcisException {
		switch(option)
		{
			case "first":
				logger.info("Clicking on save button");
				clickWebElemntUsingJavascriptExecutor(saveButton);
				waitForPageLoadTill(5);
				logger.info("Clicked on save button");
				break;
			case "second":
				logger.info("Clicking on save button");
				clickWebElemntUsingJavascriptExecutor(saveButtonSecond);
				waitForPageLoadTill(5);
				logger.info("Clicked on save button");
				break;
			case "next":
				logger.info("Clicking on save button");
				clickWebElemntUsingJavascriptExecutor(saveButtonNext);
				waitForPageLoadTill(5);
				logger.info("Clicked on save button");
				break;
		}
		waitForPageLoadTill(5);
		waitForElement(personInvolvedLabel);
		
	}
	/**
	 * click on Next button
	 * @author mrunal.s.tilekar
	 */
	public void clickNextButton() throws AcisException, InterruptedException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton_PersonsInvovled);
		scrollingToElementofAPage(nextButton_PersonsInvovled);
		clickWebElement(nextButton_PersonsInvovled);
		waitForPageLoad();
		waitForPageLoadTill(9);
		logger.info("Clicked on Next button");
		waitForElement(agencyHistoryTitle);
		logger.info("Agency History page loaded");

	}

	/**
	 * Click on edit button of 1st person record from table
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public void clickEditFirstRecordButton() throws AcisException, InterruptedException, IOException {
		logger.info("Clicking on edit button of 1st person record from table");
		waitForPageLoadTill(10);
	//	scrollingToElementofAPage(downArrowPersonRecord);
		clickWebElemntUsingJavascriptExecutor(downArrowPersonRecord);
		clickWebElement(editPersonRecord);
		logger.info("Clicked on edit button of 1st person record from table");
		waitForElement(firstNameTextBox);
		logger.info("successfully opened first record");
		
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
		//scrollingToElementofAPage(downArrowPersonRecord);
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
	
	
	public void enterTextFieldValueOnPersonsInvovled(String option, String textFieldName, String strValue) throws AcisException, InterruptedException {
		   waitForPageLoadTill(5);
		if(option.equals("first"))
		{
			switch(textFieldName)
			{
			  
			 case "age":
				 logger.info("Entering age");
				   waitForElement(ageAtTimeOfReportTextbox);
					enterText(ageAtTimeOfReportTextbox, strValue);
					age=Integer.parseInt(strValue);
					logger.info("Age entered");
			      break;
			      
			 case "ageClear":
				 logger.info("Clearing Age");
				   waitForElement(ageAtTimeOfReportTextbox);
					ageAtTimeOfReportTextbox.clear();
					logger.info("Age Cleared ");
			      break;
			      
			  case "phone":
				  logger.info("entering phone");
				   waitForElement(phone);
					enterText(phone, strValue);
					logger.info("entered phone");
			      break;
			   
			   case "zipcode":
				   logger.info("entering zipcode");
				   waitForElement(zipCodeTextBox);
				   zipCodeTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
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
			  
			      
			   case "narrative":
				   logger.info("entering narrative");
				   waitForElement(narrative_textarea);
					enterText(narrative_textarea, strValue);
					logger.info("entered narrative");
			      break;
			  
			   case "birthdateTextboxClear":
				   logger.info("clearing birthdate textbox");
				   birthDateTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
					logger.info("cleared birthdate textbox");
			      break;
			      
			   default : 
				   logger.info("Text Field Value: " + textFieldName+"did not find");
			}
		
		
		}
		else if(option.equals("second"))
		{
			switch(textFieldName)
			{
			  
			 case "age":
				   logger.info("Entering age");
				   waitForElement(ageAtTimeOfReportTextboxSecond);
					enterText(ageAtTimeOfReportTextboxSecond, strValue);
					age=Integer.parseInt(strValue);
					logger.info("Age entered");
			      break;
			      
			 case "ageClear":
				   logger.info("Clearing Age");
				   waitForElement(ageAtTimeOfReportTextboxSecond);
					ageAtTimeOfReportTextboxSecond.clear();
					logger.info("Age Cleared ");
			      break;
			      
			  case "phone":
				  logger.info("entering phone");
				   waitForElement(phoneSecond);
					enterText(phoneSecond, strValue);
					logger.info("entered phone");
			      break;
			   
			   case "zipcode":
				   logger.info("entering zipcode");
				   waitForElement(zipCodeTextBoxSecond);
					enterText(zipCodeTextBoxSecond, strValue);
					logger.info("enteredzipcode");
			      break;
			      
			   case "emailId":
				   logger.info("entering emailID");
				   waitForElement(emailIdSecond);
					enterText(emailIdSecond, strValue);
					logger.info("entered emailID");
			      break;
			      
			   case "street1":
				   logger.info("entering street1");
				   waitForElement(street1Second);
					enterText(street1Second, strValue);
					logger.info("entered street1");
			      break;
			      
			   case "street2":
				   waitForElement(street2Second);
					enterText(street2Second, strValue);
					logger.info("entering strret2");
			      break;
			      
			   case "city":
				   logger.info("entering city");
				   waitForElement(citySecond);
					enterText(citySecond, strValue);
					logger.info("entered city");
			      break;
			  
	 		      
			   case "narrative":
				   logger.info("entering narrative");
				   waitForElement(narrative_textarea);
					enterText(narrative_textarea, strValue);
					 logger.info("entered narrative");
			      break;
			  
			   case "birthdateTextboxClear":
				   logger.info("clearing birthdate textbox");
				   birthDateTextBoxSecond.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
					logger.info("cleared birthdate textbox");
			      break;
			      
			   default : 
				   logger.info("Text Field Value: " + textFieldName+"did not find");
			}
		
		}
		waitForPageLoadTill(5);
	}
	
	/**
	 * Search for new person
	 * @author amit.kulshreshtha
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	
	public void searchNewPerson(String NewPerson) throws AcisException , InterruptedException{
		waitForElement(searchbox);
		enterText(searchbox, NewPerson);
		waitForElement(New);
		clickWebElement(New);
		waitForElement(fullname);
		logger.info("New Person can be added from here");
		
		
		
	}
	
	public void verifyPersonData(String ExistingPerson)throws AcisException , InterruptedException{
		waitForElement(searchbox);
		enterText(searchbox, ExistingPerson);
		waitForPageLoadTill(10);
		//waitForElement(searchRecord1);
		waitForElement(cancelBtn);
		clickWebElement(cancelBtn);
		waitForPageLoadTill(5);
		waitForElement(personInvolvedLabel);
		logger.info("record found successfully");
		
		//isElementPresent(By.xpath("//span[@vlocity_ps-typeahead_typeahead_slds and @class='slds-listbox__option-text slds-listbox__option-text_entity']/text()='Name: first last; DOB: 8/19/2000; Age: 20; LKA:  ; Mother's Name: '"));
		
	}
	
	/**
	 * Verify Relationship Filed not present
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyRealtionshipNotPresent() throws AcisException {
		logger.info("Verifying Relationship Filed not present");
	//	Assert.assertTrue(relationshipText.isDisplayed()==false, "Error : Relationship Filed present ");
		Assert.assertFalse(isElementPresent(relationshipText), "Error : Relationship Filed present " );
		logger.info("Verifyied Relationship Filed not present");
	}
	
	/**
	 * Verify first name, last name, DOB ,age present
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
	 * Click on Cancel button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickCancelButton() throws AcisException {
		logger.info("Clicking on Cancel button");
		clickWebElemntUsingJavascriptExecutor(cancelBtn);
		waitForPageLoadTill(5);
		logger.info("Clicked on Cancel button");	
		waitForPageLoadTill(5);
		waitForElement(personInvolvedLabel);
		logger.info("Successfully closed");	
		
	}
	
	/**
	 * Click on refresh person button
	 * @author mrunal.s.tilekar
	 */
	public void clickRefresPersonButton() throws AcisException {
		logger.info("Clicking refresh person button");
		Actions act = new Actions(driver);
		//act.moveToElement(refreshPersonsButton).click().perform();
		clickWebElemntUsingJavascriptExecutor(refreshPersonsButton);
		waitForPageLoadTill(5);
		logger.info("Clicked refresh person button");	
		waitForPageLoadTill(5);
		logger.info("Successfully clicked refresh person button");	
		
	}
	
	/**
	 * Get DOB from intake_OS
	 * @author mrunal.s.tilekar
	 */
	public String getDOB() {
		logger.info("Getting dob from intake OS");
		String dob=birthDateTextBox.getAttribute("value");
		logger.info("DOB  from intake OS: " + dob );
		return dob;
	}
}
	
