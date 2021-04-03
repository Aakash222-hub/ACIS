package com.acis.automation.pages.personaccount;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PersonEducationPage extends PageBase{

	public PersonEducationPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonEducationPage.class);
	
	@FindBy(xpath = "//span[text()='Education']/../..//a")
	WebElement educationTab;
	
	public By schoolNameVerify = By.xpath("//*[text()='School Name']");
	
	public By educationIDVerify = By.xpath("//*[text()='Education ID']");
	
	public By gradeVerify = By.xpath("//*[text()='Grade']");
	
	public By iepVerify = By.xpath("//*[text()='IEP']");
	
	
	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;
	
	@FindBy(xpath = "//*[text()='Educational Setting']/../..//input")
	WebElement educationType;
	
	public By notInSchool = By.xpath("//*[@title='Not in school']");
	
	public By school = By.xpath("//*[@title='School']");
	
	@FindBy(xpath = "//*[@title='Day care']")
	WebElement dayCare;
	
	@FindBy(xpath = "//*[text()='Grade']/../..//input[@type='text']")
	WebElement gradeType;
	
	@FindBy(xpath = "//*[@title='Kindergarten']")
	WebElement kindergarten;
	
	@FindBy(xpath = "//*[text()='Rate of Attendance']/../..//input")
	WebElement rateOfAttendance;
	
	@FindBy(xpath = "//*[text()='IEP']/../..//input[@type='text']")
	WebElement iep;
	
	public By yes = By.xpath("//*[@title='Yes']");
	
	@FindBy(xpath = "//*[@title='No']")
	WebElement no;
	
	@FindBy(xpath = "//*[text()='Start Date']/../..//input")
	WebElement startDatePicker;
	
	@FindBy(xpath = "//*[text()='19']")
	WebElement startDate;
	
	@FindBy(xpath = "//*[text()='End Date']/../..//input")
	WebElement endDatePicker;
	
	@FindBy(xpath = "//*[text()='22']")
	WebElement endDate;
	
	@FindBy(xpath = "//*[text()='School Name']/../..//input[contains(@placeholder,'Search Schools')]")
	WebElement searchSchool;
	
	@FindBy(xpath = "//*[text()='New School']")
	WebElement newSchoolButton;
	
	@FindBy(xpath = "//*[text()='School Name']/../..//input[@class=' input']")
	WebElement schoolName;
	
	@FindBy(xpath = "//*[text()='Address Line 1']/../..//input")
	WebElement address1;
	
	@FindBy(xpath = "//*[text()='Address Line 2']/../..//input")
	WebElement address2;
	
	@FindBy(xpath = "//*[text()='City']/../..//input")
	WebElement city;
	
	@FindBy(xpath = "//*[text()='State']/../..//input")
	WebElement state;
	
	@FindBy(xpath = "//*[text()='ZIP']/../..//input")
	WebElement zip;
	
	@FindBy(xpath = "//*[text()='Active']/../..//input")
	WebElement active;
	
	@FindBy(xpath = "//button[@name='SaveEdit']")
	WebElement educationSaveButton;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement schoolSaveButton;
	
	@FindBy(xpath = "//*[text()='School Name']/../..//a")
	WebElement schoolNameAdded;
	
	
	/**
	 * Owner : Dharmesh
	 * Description : Click on Education Tab
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickEducation() throws AcisException, InterruptedException {
		logger.info("Clicking on Education Related Tab");
		scrollingToElementofAPage(educationTab);
		clickWebElemntUsingJavascriptExecutor(educationTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Education Related Tab");
	}
	
	/**
	 * Click New button on Education Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickNewButton() throws AcisException {
		logger.info("Clicking New button");
		waitForElementClickable(newButton);
		clickWebElement(newButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked New button");
	}
	
	/**
	 * Verify : Related list elements on Education Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyEducationRelated() throws AcisException, InterruptedException {
		logger.info("Verifying Related list on Education Page ");
		isElementPresent(educationIDVerify);
		isElementPresent(schoolNameVerify);
		isElementPresent(gradeVerify);
		isElementPresent(iepVerify);
		logger.info("Verified Related list on Education Page ");
	}
	
	
	/**
	 * Verify : All Education Type Options are available in Education Record Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyEducationType() throws AcisException, InterruptedException {
		logger.info("Verifying Education Type options on Education Page ");
		logger.info("Clicking on Education Type on Education Page ");
		clickWebElemntUsingJavascriptExecutor(educationType);
		logger.info("Clicked on Education Type on Education Page ");
		waitForPageLoadTill(5);
		isElementPresent(notInSchool);
		isElementPresent(school);
		logger.info("Selecting Day Care Option on Education Type on Education Page ");
		clickWebElemntUsingJavascriptExecutor(dayCare);
		logger.info("Selected Day Care Option on Education Type on Education Page ");
		logger.info("Verified Education Type options on Education Page ");
	}
	
	/**
	 * Enter data in Rate of Attendance in Education Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickNewSchool() throws AcisException, InterruptedException {
		logger.info("Clicking on Search School");
		clickWebElemntUsingJavascriptExecutor(searchSchool);
		logger.info("Clicked on Search School");
		waitForPageLoadTill(5);
		logger.info("Clicking on New School Button in Search School");
		clickWebElemntUsingJavascriptExecutor(newSchoolButton);
		logger.info("Clicked on New School Button in Search School");
		waitForPageLoadTill(5);
		waitForPageLoad();
	}
	
	/**
	 * Set Active as Checked on New School Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void setActive() throws AcisException, InterruptedException {
		logger.info("Active Checkbox has be checked");
		clickWebElemntUsingJavascriptExecutor(active);
		logger.info("Active has be checked");
	}

	/**
	 * Enter Text in School Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void enterSchoolText(String str, String data) throws AcisException, InterruptedException {
		logger.info(str+" Field entering as :"+data);
		switch(str)
		{
		case "Name":
			enterText(schoolName, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "Address1":
			enterText(address1, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "Address2":
			enterText(address2, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "City":
			enterText(city, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "State":
			enterText(state, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "Zip":
			enterText(zip, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		default:
			logger.info(str+" Field not found.");
		}
		
	}
	
	/**
	 * Enter data in Rate of Attendance in Education Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void enterRateOfAttendance(String data) throws AcisException, InterruptedException {
		logger.info("Rate of Attendance Field entering as :"+data);
		enterText(rateOfAttendance, data);
		logger.info("Rate of Attendance Field entered as :"+data);
	}
	
	/**
	 * Select : Kindergarten in grade on Education Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void selectGrade() throws AcisException, InterruptedException {
		logger.info("Clicking on Grade Type on Education Record");
		clickWebElemntUsingJavascriptExecutor(gradeType);
		logger.info("Clicked on Grade Type on Education Record");
		waitForPageLoadTill(2);
		logger.info("Selecting Grade as Kindergarten");
		clickWebElemntUsingJavascriptExecutor(kindergarten);
		logger.info("Grade selected as Kindergarten");
	}
	
	/**
	 * Verify : IEP Options on Education Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyIEP() throws AcisException, InterruptedException {
		logger.info("Verifying IEP option ");
		logger.info("Clicking on IEP option ");
		clickWebElemntUsingJavascriptExecutor(iep);
		logger.info("Clicked on IEP option ");
		waitForPageLoadTill(2);
		isElementPresent(yes);
		logger.info("Selecting 'No' option on IEP option ");
		clickWebElemntUsingJavascriptExecutor(no);
		logger.info("Selected 'No' option on IEP option ");
		logger.info("IEP option verified");
	}
	
	/**
	 * Set Start Date/ End Date on Education Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void setDate(String field) throws AcisException, InterruptedException{
		switch(field)
		{
			case "Start" :
				logger.info("Selecting Start Date");
				clickWebElemntUsingJavascriptExecutor(startDatePicker);
				waitForElement(startDate);
				clickWebElemntUsingJavascriptExecutor(startDate);
				waitForPageLoadTill(2);
				logger.info("Start Date succesfully selected");
				break;
				
			case "End" :
				logger.info("Selecting End Date");
				clickWebElemntUsingJavascriptExecutor(endDatePicker);
				waitForPageLoadTill(5);
				clickWebElemntUsingJavascriptExecutor(endDate);
				waitForPageLoadTill(2);
				logger.info("End Date succesfully selected");
				break;
			default : 
				   logger.info("Date: " + field +" not found");
				   break;
		}
	}
	
	/**
	 * Click Save button on Education and School Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickSaveButton(String option) throws AcisException {
		switch(option)
		{
		case "Education":
			logger.info("Clicking save button");
			clickWebElement(educationSaveButton);
			waitForPageLoad();
			waitForPageLoadTill(2);
			refreshPage();
			waitForPageLoadTill(10);
			waitForPageLoad();
			logger.info("Clicked save button");
			break;
		case "School":
			logger.info("Clicking save button");
			clickWebElement(schoolSaveButton);
			waitForPageLoadTill(10);
			waitForPageLoad();
			logger.info("Clicked save button");
			break;
			default:
				logger.info(option+" Save Button not Found");
		}
		
	}
	

	/**
	 * Verify School Name is getting populated after the data is entered
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifySchoolName(String option) throws AcisException {
		logger.info("Verifying School Name on Education Record");
		verifyTextEquals(schoolNameAdded,option);
		logger.info("Verified School Name on Education Record");
	}
	
}
