package com.acis.automation.pages.intake;

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

public class SearchPerson_OmniscriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(SearchPerson_OmniscriptPage.class);

	public SearchPerson_OmniscriptPage() throws AcisException {
	}

	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement iframe;

	@FindBy(xpath = "//span[text()='First Name']//..//..//..//input")
	WebElement firstName;

	@FindBy(xpath = "//span[text()='Last Name']//..//..//..//input")
	WebElement lastName;

	@FindBy(xpath = "//label[text()='Date of Birth']//..//..//..//input")
	WebElement dateofBirth;

	@FindBy(xpath = "//span[text()='Gender']//..//..//..//input")
	WebElement gender;

	@FindBy(xpath = "//span[text()='Male']")
	WebElement maleGender;

	@FindBy(xpath = "//span[text()='Female']")
	WebElement femaleGender;

	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchButton;

	@FindBy(xpath = "//*[text()='No existing person records match the search criteria entered']")
	WebElement searchError;

	@FindBy(xpath = "(//span[text()='Select']//..//..//label)[1]")
	WebElement selectFirstRecordCheckBox;

	@FindBy(xpath = "//button[text()='Add Person']//..//..//c-button")
	WebElement addPersonButton;

	@FindBy(xpath = "//button[@title='Previous Month']")
	WebElement previousMonthIntake;

	@FindBy(xpath = "(//button[@title='Previous Month'])[2]")
	WebElement previousMonthIncident;

	@FindBy(xpath = "//span[text()=10]")
	WebElement intakeDate;

	@FindBy(xpath = "(//span[text()=9])[2]")
	WebElement incidentDate;

	@FindBy(xpath = "(//input[@name='date'])[2]")
	WebElement incidentDatePicker;

	@FindBy(xpath = "//input[@name='date']")
	WebElement intakeDatePicker;

	@FindBy(xpath = "//child[@vlc-slds-change-inline-templates='::child.eleArray[0].propSetMap.showInputWidth']/div/ng-form/div[2]/div/select[@id='IntakeMethod']")
	WebElement intakeMethodPosition;

	@FindBy(xpath = "//select[@disabled='disabled']/..//label[contains(text(),'Intake Method')]")
	WebElement intakeMethodDisabled;

	@FindBy(xpath = "//span[text()='Intake Method']/../../..//input")
	WebElement intakeMethodDropdown;

	@FindBy(xpath = "//option[text()='E-Report']")
	WebElement intakeMethodEreport;

	@FindBy(xpath = "//option[text()='Email']")
	WebElement intakeMethodEmail;

	@FindBy(xpath = "//option[text()='Face-to-Face']")
	WebElement intakeMehodFaceToFace;

	@FindBy(xpath = "//option[text()='Fax']")
	WebElement intakeMehodFax;

	@FindBy(xpath = "//option[text()='Letter']")
	WebElement intakeMehodLetter;

	@FindBy(xpath = "//option[text()='Phone']")
	WebElement intakeMehodPhone;

	@FindBy(xpath = "//div[@id='IntakeOverview_nextBtn']//p[text()='Next']")
	WebElement next;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//span[contains(text(),'Report Details')]")
	WebElement reporterDetailsTitle;

	@FindBy(xpath = "//span[text()='No']")
	WebElement reporterAnonymousNo;

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement reporterAnonymousYes;

	@FindBy(xpath = "//label[contains(text(),'Is the Reporter Anonymous?')]")
	WebElement isReporterAnonymousTitle;

	@FindBy(xpath = "//span[text()='First Name']/../../..//input")
	WebElement reportersFirstName;

	@FindBy(xpath = "//span[text()='Last Name']/../../..//input")
	WebElement reportersLastName;

	@FindBy(xpath = "//span[text()='Middle Name']/../../..//input")
	WebElement reportersMiddleName;

	@FindBy(xpath = "//span[text()='Email']/../../..//input")
	WebElement reportersEmail;

	@FindBy(xpath = "//label[text()='Role']/../../..//input")
	WebElement reportersRole;

	@FindBy(xpath = "//select[@id='ReporterSuffix']")
	WebElement reportersSuffix;

	@FindBy(xpath = "//label[text()='Phone']/../../..//input")
	WebElement reportersPhone;

	@FindBy(xpath = "//span[text()='01']")
	WebElement firstDate;

	@FindBy(xpath = "(//span[text()='01'])[1]")
	WebElement selectIncidentDate;

	@FindBy(xpath = "//option[text()='II']")
	WebElement suffix_II_option;

	@FindBy(xpath = "//span[text()='Phone']")
	WebElement phoneOption;

	@FindBy(xpath = "//label[text()='Location of Incident']/../..//textarea")
	WebElement locationOfIncident;

	@FindBy(xpath = "//body[@data-id='mytextarea']")
	WebElement narrative;

	@FindBy(xpath = "//iframe[@id='mytextarea_ifr']")
	WebElement iframeNarrative;

	@FindBy(xpath = "//*[@data-omni-key='PersonsInvolved']//h1[text()[contains(.,'Person(s) Involved')]]")
	WebElement personsInvolvedTitle;

	@FindBy(xpath = "//a[contains(text(),'here')]")
	WebElement linkCreateNewPerson;

	public By reportDetailsHeader = By.xpath("//vlocity_ps-omniscript-step//h1");
	public By intakeInfo = By.xpath("//span[text()='Intake Information']");

	@FindBy(xpath = "//table//thead//tr//th[text()='FIRST NAME']")
	WebElement firstNameVerify;

	@FindBy(xpath = "//table//thead//tr//th[text()='LAST NAME']")
	WebElement lastNameVerify;

	@FindBy(xpath = "//table//thead//tr//th[text()='SUFFIX']")
	WebElement suffixVerify;

	@FindBy(xpath = "//table//thead//tr//th[text()='DATE OF ' and ' BIRTH']")
	WebElement dobVerify;

	@FindBy(xpath = "//table//thead//tr//th[text()='AGE']")
	WebElement ageVerify;

	@FindBy(xpath = "//table//thead//tr//th[text()='GENDER']")
	WebElement genderVerify;

	@FindBy(xpath = "//table//thead//tr//th[text()='LAST KNOWN ' and text()=' ADDRESS']")
	WebElement lkaVerify;

	@FindBy(xpath = "//table//thead//tr//th[text()=\"MOTHER'S \" and \" NAME\"]")
	WebElement mothersNameVerify;

	@FindBy(xpath = "//button[text()='Close']")
	WebElement close;

	@FindBy(xpath = "(//span[text()='Role']/../../..//input)[last()]")
	WebElement role;

	@FindBy(xpath = "(//span[text()='Role']/../../..//*[text()='Alleged Victim'])[last()]")
	WebElement roleAsAllegedVictim;

	@FindBy(xpath = "(//span[text()='Role']/../../..//*[text()='Alleged Maltreator'])[last()]")
	WebElement roleAsAllegedMaltenator;

	@FindBy(xpath = "//span[text()='Primary Caregiver']/../..//span[@class='slds-checkbox_faux']")
	WebElement primeCaregivercheckbox;

	@FindBy(xpath = "//div//table[@class='slds-table slds-table_cell-buffer slds-no-row-hover slds-table_bordered']")
	WebElement searchTable;

	@FindBy(xpath = "//*[text()='Search By Column']/../..//input")
	WebElement searchByColumn;

	@FindBy(xpath = "//*[text()='Search By Column']/../..//input/..//..//span[@title='Last Known Address']")
	WebElement lastKnownAddress;

	@FindBy(xpath = "//*[text()='Search']/../../../../..//input[@lightning-input_input]")
	WebElement searchTextBox;

	@FindBy(xpath = "//*[text()='Search By Column']/../..//input/..//..//span[@title=\"Mother's Name\"]")
	WebElement motherslastname;
	
	
	
	
	@FindBy(xpath="(//label[text()='Role']/..//input)")
	WebElement roleSearchPage;
	
	
	@FindBy(xpath="(//label[text()='Role']/../../..//*[text()='Alleged Victim'])[last()]")
	WebElement roleAsAllegedVictimSearchPage;
	
	
	@FindBy(xpath="(//label[text()='Role']/../../..//*[text()='Alleged Maltreator'])[last()]")
	WebElement roleAsAllegedMaltenatorSearchPage;
	
	
	@FindBy(xpath="//button[normalize-space()='Refresh Persons']")
	WebElement refreshPerson;
	
	
	@FindBy(xpath="//button[normalize-space()='Add Person']")
	WebElement addPersonSearchPage;
	
	
	
	

	public By closeVerify = By.xpath("//button[text()='Close']");

	/**
	 * Set Gender on SearchPerson Page Created By Dharmesh
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectGender(String genderChoice) throws AcisException, InterruptedException {
		switch (genderChoice) {
		case "male":
			logger.info("Selecting Male as gender");
			if (isElementPresent(closeVerify)) {
				logger.info("Clicking on Close Button");
				waitForElementClickable(close);
				clickWebElement(close);
				logger.info("Clicked on Close Button");
			}
			waitForElement(gender);
			clickWebElement(gender);
			waitForElement(maleGender);
			clickWebElement(maleGender);
			waitForPageLoadTill(5);
			clickWebElement(searchButton);
			waitForElement(firstNameVerify);
			if (isElementPresent(closeVerify)) {
				logger.info("Clicking on Close Button");
				waitForElementClickable(close);
				clickWebElement(close);
				logger.info("Clicked on Close Button");
			}
			logger.info("Male as gender selected");
			break;

		case "female":
			logger.info("Selecting female as gender");
			if (isElementPresent(closeVerify)) {
				logger.info("Clicking on Close Button");
				waitForElementClickable(close);
				clickWebElement(close);
				logger.info("Clicked on Close Button");
			}
			waitForElement(gender);
			clickWebElement(gender);
			waitForElement(femaleGender);
			clickWebElement(femaleGender);
			waitForPageLoadTill(5);
			clickWebElement(searchButton);
			waitForElement(firstNameVerify);
			if (isElementPresent(closeVerify)) {
				logger.info("Clicking on Close Button");
				waitForElementClickable(close);
				clickWebElement(close);
				logger.info("Clicked on Close Button");
			}
			logger.info("Female as gender selected");
			break;
		default:
			logger.info("Date: " + genderChoice + " not found");
			break;
		}
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
			waitForElement(firstName);
			enterText(firstName, str1);
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
			waitForElement(lastName);
			enterText(lastName, str1);
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

	/**
	 * Search a person with Multiple valid input
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchPersonUsingMultipleValidData(String name, String str1, String str2)
			throws AcisException, InterruptedException {

		switch (name) {
		case "firstlastName":
			logger.info("Selecting firstname and lastname  and searching ");
			waitForElement(firstName);
			enterText(firstName, str1);
			enterText(lastName, str1);
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

		case "firstNameGender":
			logger.info("Selecting firstname searching ");
			waitForElement(firstName);
			logger.info("Selected using first person");
			enterText(firstName, str1);
			switch (str2) {
			case "male":
				logger.info("Selecting Male as gender");
				waitForElement(gender);
				Actions action = new Actions(driver);
				action.moveToElement(gender).click().perform();
				//clickWebElement(gender);
				waitForElement(maleGender);
				clickWebElement(maleGender);
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
				logger.info("Male as gender selected");
				break;

			case "female":
				logger.info("Selecting female as gender");
				waitForElement(gender);
				clickWebElement(gender);
				waitForElement(femaleGender);
				clickWebElement(femaleGender);
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
				logger.info("Female as gender selected");
				break;
			default:
				logger.info("Date: " + str1 + " not found");
				break;
			}
			break;

		case "lastNameGender":
			logger.info("Selecting firstname searching ");
			waitForElement(firstName);
			logger.info("Selected using first person");
			enterText(lastName, str1);
			switch (str2) {
			case "male":
				logger.info("Selecting Male as gender");
				waitForElement(gender);
				clickWebElement(gender);
				waitForElement(maleGender);
				clickWebElement(maleGender);
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
				logger.info("Male as gender selected");
				break;

			case "female":
				logger.info("Selecting female as gender");
				waitForElement(gender);
				clickWebElement(gender);
				waitForElement(femaleGender);
				clickWebElement(femaleGender);
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
				logger.info("Female as gender selected");
				break;
			default:
				logger.info("Date: " + str1 + " not found");
				break;
			}
			break;
		default:
			logger.info("Date: " + name + " not found");
			break;

		}
	}

	/**
	 * Verifying the record on Search Person Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchRecordVerify(String locator) throws AcisException, InterruptedException {
		waitForElement(firstNameVerify);
		logger.info("Verifying the records");
		waitForElement(driver.findElement(By.xpath("//table//tbody//*[text()='" + locator + "']")));
		logger.info("Verified the records: ");
		waitForPageLoadTill(5);
	}

	/**
	 * Verifying the labels on Search Person Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchRecordLabelsVerify() throws AcisException, InterruptedException {
		logger.info("Verifying the labels on records");
		waitForElement(firstNameVerify);
		waitForElement(lastNameVerify);
		waitForElement(suffixVerify);
		waitForElement(dobVerify);
		waitForElement(ageVerify);
		waitForElement(genderVerify);
		waitForElement(lkaVerify);
		waitForElement(mothersNameVerify);
		logger.info("Verified the labels on records");
		waitForPageLoadTill(5);
	}

	/**
	 * Verifying the record on Search Person Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchClearText() throws AcisException, InterruptedException {

		logger.info("Clearing the records");
		waitForElement(firstName);
		firstName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		lastName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		dateofBirth.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		logger.info("Cleared the records: ");
		waitForPageLoadTill(5);
	}

	/**
	 * Search a person with valid input
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchPersonUsingInvalidData(String name, String str1) throws AcisException, InterruptedException {

		switch (name) {
		case "firstName":
			logger.info("Selecting lastname  and searching ");
			waitForElement(firstName);
			enterText(firstName, str1);
			waitForPageLoadTill(5);
			clickWebElement(searchButton);
			waitForElement(searchError);
			logger.info("Searching using first person");
			break;

		case "secondPerson":
			logger.info("Selecting last name and searching ");
			waitForElement(lastName);
			enterText(lastName, str1);
			waitForPageLoadTill(5);
			clickWebElement(searchButton);
			waitForElement(searchError);
			logger.info("Searching using lastname person");
			break;

		case "dob":
			logger.info("Selecting dob name and searching ");
			waitForElement(dateofBirth);
			enterText(dateofBirth, str1);
			waitForPageLoadTill(5);
			clickWebElement(searchButton);
			waitForElement(searchError);
			logger.info("Searching using dob person");
			break;
		default:
			logger.info("Date: " + name + " not found");
			break;

		}
	}

	/**
	 * Click on Next Button
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickNextBtn() throws AcisException, InterruptedException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Next button");
		waitForElement(personsInvolvedTitle);
		logger.info("Person Invloved Page loaded");

	}

	/**
	 * Selecting and adding person
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectingAddingPerson() throws AcisException, InterruptedException {

		logger.info("Selecting and adding persons");
		waitForElement(selectFirstRecordCheckBox);
		clickWebElemntUsingJavascriptExecutor(selectFirstRecordCheckBox);
		logger.info("Selecting first check box");
		Actions act = new Actions(driver);
		waitForPageLoadTill(9);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(9);
		logger.info("Clicking on save button");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,900)");
		waitForElement(addPersonButton);
		clickWebElement(addPersonButton);
		logger.info("Clicked on add person button");
		waitForPageLoadTill(9);

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
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		clickWebElemntUsingJavascriptExecutor(linkCreateNewPerson);
		logger.info("Clicked on link to create new person");
		waitForPageLoadTill(16);
		waitForElement(personsInvolvedTitle);
		logger.info("verified page title is " + personsInvolvedTitle.getText());

	}

	/**
	 * Changing Date of Birth
	 * 
	 * @author mrunal.s.tilekar
	 */
	public String checkDOBValue(String dobValue) {
		logger.info("Changing DOB Value");
		String expectedDobValue = dobValue.replace("-", "/");
		logger.info("Changed DOB Value");
		return expectedDobValue;

	}

	/***
	 * @author akash.a.gaurav selecting role dropdown
	 * 
	 *         This method select first checkbox and and select role
	 * @throws AcisException
	 */

	public void selectingRoleAndClickingcheckBox(String roleOption) throws AcisException {
		logger.info("This method is selecting role in person involve page while creating new person");
		waitForPageLoad();
		waitForPageLoadTill(9);

		switch (roleOption) {
		case "AllegedVictim":
			logger.info("Selecting role AllegedVictim ");
			waitForElement(role);
			clickWebElement(role);
			waitForElement(roleAsAllegedVictim);
			clickWebElement(roleAsAllegedVictim);
			waitForPageLoadTill(5);
			logger.info("Selected role as AllegedVictim ");
			clickWebElemntUsingJavascriptExecutor(primeCaregivercheckbox);
			logger.info("Selected  primary caregiver as checkbox");
			break;

		case "AllegedMallternator":
			logger.info("Selecting role AllegedMallternator ");
			waitForElement(role);
			clickWebElement(role);
			waitForElement(roleAsAllegedMaltenator);
			clickWebElement(roleAsAllegedMaltenator);
			waitForPageLoadTill(5);
			logger.info("Selected role as AllegedMallternator ");
			clickWebElemntUsingJavascriptExecutor(primeCaregivercheckbox);
			logger.info("Selected  primary caregiver as checkbox");
			break;

		}

	}

	/**
	 * Searching using first name
	 * 
	 * @author Varun.krish
	 */
	public void SearchResult(String firstname) throws AcisException {

		waitForPageLoadTill(5);
		waitForElement(searchTable);
		String Searchdate = searchTable.getText();
		System.out.println("Data=" + Searchdate);
		if ((searchTable.getText()).contains(firstname)) {
			logger.info(firstname + "Searh Result is displayed");
		} else {
			logger.info("No Search Result fetched");
		}
		verifyElementNotPresent(searchTable);

	}

	/**
	 * Searching using last name
	 * 
	 * @author Varun.krish
	 */
	public void lastnameSearchResult(String lastname) throws AcisException {

		waitForPageLoadTill(5);
		waitForElement(searchTable);
		String Searchdate = searchTable.getText();
		System.out.println("Data=" + Searchdate);

		if ((searchTable.getText()).contains(lastname)) {
			logger.info(lastname + "Searh Result is displayed");
		} else {
			logger.info("No Search Result fetched");
		}
		verifyElementNotPresent(searchTable);

	}

	/**
	 * Searching using Date of Birth
	 * 
	 * @author Varun.krish
	 */
	public void dateSearch(String str1) throws AcisException {
		logger.info("Selecting dob name and searching ");
		waitForElement(dateofBirth);
		clickWebElement(dateofBirth);
		enterText(dateofBirth, str1);
		waitForPageLoadTill(5);
		clickWebElement(searchButton);
		waitForPageLoadTill(5);
		String Searchdate = searchTable.getText();
		System.out.println("Data=" + Searchdate);

		if ((searchTable.getText()).contains(("11/20/2000"))) {
			logger.info(Searchdate + "Searh Result is displayed");
		} else {
			logger.info("No Search Result fetched");
		}

	}

	/**
	 * Searching using Gender male
	 * 
	 * @author Varun.krish
	 */

	public void genderSearchResult(String male) throws AcisException {
		logger.info("Selecting Male and searching ");
		waitForPageLoadTill(5);
		waitForElement(gender);
		clickWebElement(gender);
		waitForPageLoadTill(5);
		waitForElement(maleGender);
		clickWebElement(maleGender);
//	waitForElement(searchTable);
		waitForPageLoadTill(5);
		clickWebElement(searchButton);
		waitForPageLoadTill(5);
		String Searchdate = searchTable.getText();
		System.out.println("Data=" + Searchdate);

		if ((searchTable.getText()).contains(male)) {
			logger.info(male + "Searh Result is displayed");
		} else {
			logger.info("No Search Result fetched");
		}
		verifyElementNotPresent(searchTable);

	}

	/**
	 * Searching using Gender Female
	 * 
	 * @author Varun.krish
	 */

	public void femalegenderSearchResult(String Female) throws AcisException {
		logger.info("Selecting Female and searching ");
		waitForPageLoadTill(5);
		waitForElement(gender);
		clickWebElement(gender);
		waitForPageLoadTill(5);
		waitForElement(femaleGender);
		clickWebElement(femaleGender);
//	waitForElement(searchTable);
		waitForPageLoadTill(5);
		clickWebElement(searchButton);
		waitForPageLoadTill(5);
		String Searchdate = searchTable.getText();
		System.out.println("Data=" + Searchdate);

		if ((searchTable.getText()).contains(Female)) {
			logger.info(Female + "Searh Result is displayed");
		} else {
			logger.info("No Search Result fetched");
		}
		verifyElementNotPresent(searchTable);

	}

	/**
	 * Searching using last know Address
	 * 
	 * @author Varun.krish
	 */

	public void searchByColumn(String Address) throws AcisException {
		logger.info("Selecting Last Known Address and searching ");
		waitForPageLoadTill(10);
		waitForElement(searchByColumn);
		clickWebElement(searchByColumn);
		waitForPageLoadTill(5);
		waitForElement(lastKnownAddress);
		clickWebElement(lastKnownAddress);
		waitForElement(searchTextBox);
		clickWebElement(searchTextBox);
		enterText(searchTextBox, "Address");
		String Searchdate = searchTable.getText();
		System.out.println("Data=" + Searchdate);
		if ((searchTable.getText()).contains((Address))) {
			logger.info(Address + "Searh Result is displayed");
		} else {
			logger.info("No Search Result fetched");
		}

	}

	/**
	 * Searching using Mother's last name
	 * 
	 * @author Varun.krish
	 */
	public void searchBymonthslastname(String mothername) throws AcisException {
		logger.info("Selecting Last Known Address and searching ");
		waitForPageLoadTill(10);
		waitForElement(searchByColumn);
		clickWebElement(searchByColumn);
		waitForPageLoadTill(5);
		waitForElement(motherslastname);
		clickWebElement(motherslastname);
		waitForElement(searchTextBox);
		clickWebElement(searchTextBox);
		searchTextBox.clear();
		enterText(searchTextBox, mothername);
		String Searchdate = searchTable.getText();
		System.out.println("Data=" + Searchdate);
		if ((searchTable.getText()).contains((mothername))) {
			logger.info(mothername + "Searh Result is displayed");
		} else {
			logger.info("No Search Result fetched");
		}
	}
	/****
	 * Selecting role in search Page
	 * @param roleOption
	 * @author akash.a.gauravs
	 * @throws AcisException
	 * @throws InterruptedException 
	 */
	
	public void selectingRoleAndClickingcheckBoxSearchPage(String roleOption) throws AcisException, InterruptedException {
		Thread.sleep(1000);
		waitForPageLoad();
		waitForPageLoadTill(9);
		logger.info("Selecting first check box");
		clickWebElemntUsingJavascriptExecutor(selectFirstRecordCheckBox);
		logger.info("Selected first checkBox");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(5);
		jse.executeScript("window.scrollBy(0,1400)");
		waitForPageLoadTill(5);
		jse.executeScript("window.scrollBy(0,-550)");

		switch (roleOption) {
		case "AllegedVictim":
			logger.info("Selecting role AllegedVictim ");
			waitForElement(roleSearchPage);
			clickWebElement(roleSearchPage);
			waitForElement(roleAsAllegedVictimSearchPage);
			clickWebElement(roleAsAllegedVictimSearchPage);
			waitForPageLoadTill(5);
			logger.info("Selected role as AllegedVictim ");
			clickWebElemntUsingJavascriptExecutor(primeCaregivercheckbox);
			waitForPageLoadTill(9);
			logger.info("Adding person search page");
			clickWebElemntUsingJavascriptExecutor(addPersonSearchPage);
			logger.info("Added person search page");
			logger.info("Selected  primary caregiver as checkbox");
			break;

		case "AllegedMallternator":
			logger.info("Selecting role AllegedMallternator ");
			waitForElement(roleSearchPage);
			clickWebElement(roleSearchPage);
			waitForElement(roleAsAllegedMaltenatorSearchPage);
			clickWebElement(roleAsAllegedMaltenatorSearchPage);
			waitForPageLoadTill(5);
			logger.info("Selected role as AllegedMallternator ");
			clickWebElemntUsingJavascriptExecutor(primeCaregivercheckbox);
			logger.info("Adding person search page");
			clickWebElemntUsingJavascriptExecutor(addPersonSearchPage);
			logger.info("Added person search page");
			logger.info("Selected  primary caregiver as checkbox");
			break;
		
	}

}
	

	/**
	 * Selecting and adding person
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectingAddingPersonPersonInvolve() throws AcisException, InterruptedException {

		logger.info("Selecting and adding persons");
		waitForElement(selectFirstRecordCheckBox);
		clickWebElemntUsingJavascriptExecutor(selectFirstRecordCheckBox);
		logger.info("Selecting first check box");
		Actions act = new Actions(driver);
		waitForPageLoadTill(9);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(9);
		logger.info("Clicking on save button");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,900)");
		waitForElement(addPersonButton);
		clickWebElement(addPersonButton);
		logger.info("Clicked on add person button");
		waitForPageLoadTill(9);

	}

/***
 * @author akash.a.gaurav
 * Selecting Refresh Button
 * @throws AcisException 
 */
	
	public void refreshButton() throws AcisException {
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		waitForElement(refreshPerson);
		logger.info("Refreshing the  person ");
		clickWebElemntUsingJavascriptExecutor(refreshPerson);
		logger.info("Refreshing person clicking");
		
	}

}