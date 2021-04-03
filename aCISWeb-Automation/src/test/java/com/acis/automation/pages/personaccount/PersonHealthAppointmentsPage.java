package com.acis.automation.pages.personaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PersonHealthAppointmentsPage extends PageBase {

	public PersonHealthAppointmentsPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(PersonHealthAppointmentsPage.class);
	
	//Dharmesh
	
	@FindBy(xpath = "//span[text()='Health Appointments']/../..//a")
	WebElement healthAppointmentsTab;
		
	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;
	
	@FindBy(xpath = "//span[text()='Provider Name']/../..//input[@type='text']")
	WebElement providerName;
	
	@FindBy(xpath = "//span[text()='Provider Type']/../..//input[@type='text']")
	WebElement providerType;
	
	@FindBy(xpath = "//span[text()='Provider Contact Information']/../..//input[@type='text']")
	WebElement providerContactInformation;
	
	@FindBy(xpath = "//span[text()='Date Last Seen']/../..//input[@type='text']")
	WebElement dateLastSeen;
	
	@FindBy(xpath = "//span[text()='Date of Next Visit']/../..//input[@type='text']")
	WebElement dateOfNextVisit;
	
	@FindBy(xpath = "//a[@title='Go to previous month']")
	WebElement previousMonth;
	
	@FindBy(xpath = "//a[@title='Go to next month']")
	WebElement nextMonth;
	
	@FindBy(xpath = "//span[text()='19']")
	WebElement startDate;
	
	@FindBy(xpath = "//span[text()='22']")
	WebElement endDate;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement saveButton;
	
	public By healthAppointmentsTabCheck = By.xpath("//span[text()='Health Appointments']/../..//a");
	
	public By datePriorError = By.xpath("//li[contains(text(),'cannot be prior')]");
	
	public By healthAppointmentIDVerify = By.xpath("//span[text()='Health Appointment ID']");
	
	public By providerNameVerify = By.xpath("//span[text()='Provider Name']");
	
	public By providerTypeVerify = By.xpath("//span[text()='Provider Type']");
	
	public By providerContactInformationVerify = By.xpath("//span[text()='Provider Contact Information']");
	
	public By dateLastSeenVerify = By.xpath("//span[text()='Date Last Seen']");
	
	public By dateOfNextVisitVerify = By.xpath("//span[text()='Date of Next Visit']");

	/**
	 * Owner : Dharmesh
	 * Description : Click on Health Appointments Tab
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickHealthAppointmentsTab() throws AcisException, InterruptedException {
		logger.info("Clicking on Health Appointments Related Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		waitForElementClickable(healthAppointmentsTab);
		scrollingToElementofAPage(healthAppointmentsTab);
		clickWebElemntUsingJavascriptExecutor(healthAppointmentsTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Health Appointments Related Tab");
	}
	
	/**
	 * Click New button on Health Appointments Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickNewButton() throws AcisException {
		logger.info("Clicking on New button");
		waitForElementClickable(newButton);
		clickWebElement(newButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New button");
	}
	
	/**
	 * Enter Text in Health Appointments Record Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void enterText(String str, String data) throws AcisException, InterruptedException {
		
		logger.info("Entering "+str+" Field as "+data);
		switch(str)
		{
		case "Name":
			enterText(providerName, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "Type":
			enterText(providerType, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "Contact":
			enterText(providerContactInformation, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
			
		default:
			logger.info(str+" Field not found.");
		}
		
	}
	

	/**
	 * Set Previous Date Last Seen/ Date of Next Visit on Health Appointment Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void setDatePrevious(String field) throws AcisException, InterruptedException{
		switch(field)
		{
			case "Last" :
				logger.info("Setting Date Last Seen Previous month");
				clickWebElemntUsingJavascriptExecutor(dateLastSeen);
				waitForElement(previousMonth);
				clickWebElemntUsingJavascriptExecutor(previousMonth);
				waitForElement(startDate);
				clickWebElemntUsingJavascriptExecutor(startDate);
				waitForPageLoadTill(2);
				logger.info("Last Date Seen succesfully selected");
				break;
				
			case "Next" :
				logger.info("Setting Date of Next visit Previous Month");
				clickWebElemntUsingJavascriptExecutor(dateOfNextVisit);
				waitForElement(previousMonth);
				clickWebElemntUsingJavascriptExecutor(previousMonth);
				waitForElement(endDate);
				clickWebElemntUsingJavascriptExecutor(endDate);
				waitForPageLoadTill(2);
				logger.info("Date of Next Visit succesfully selected");
				break;
			default : 
				   logger.info("Date: " + field +" not found");
				   break;
		}
	}
	
	/**
	 * Set Next Date Last Seen/ Date of Next Visit on Health Appointment Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void setDatePriorVerify() throws AcisException, InterruptedException{
				logger.info("Setting Date Last Seen Previous month");
				clickWebElemntUsingJavascriptExecutor(dateLastSeen);
				waitForElement(endDate);
				clickWebElemntUsingJavascriptExecutor(endDate);
				waitForPageLoadTill(2);
				logger.info("Date Last Seen succesfully selected");
				logger.info("Setting Date of Next visit Previous Month");
				clickWebElemntUsingJavascriptExecutor(dateOfNextVisit);
				waitForElement(startDate);
				clickWebElemntUsingJavascriptExecutor(startDate);
				waitForPageLoadTill(2);
				logger.info("Date of Next Visit succesfully selected");
				clickSaveButton();
				logger.info("Verifying Prior Error present");
				waitForPageLoadTill(5);
				waitForPageLoad();
				isElementPresent(datePriorError);
				logger.info("Verified Prior Error present");
				
	}
	
	/**
	 * Set Previous Date Last Seen/ Date of Next Visit on Health Appointment Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void setDateNext(String field) throws AcisException, InterruptedException{
		switch(field)
		{
			case "Last" :
				logger.info("Setting Date Last Seen Next month");
				clickWebElemntUsingJavascriptExecutor(dateLastSeen);
				waitForElement(nextMonth);
				clickWebElemntUsingJavascriptExecutor(nextMonth);
				waitForElement(startDate);
				clickWebElemntUsingJavascriptExecutor(startDate);
				waitForPageLoadTill(2);
				logger.info("Date Last Seen succesfully selected");
				break;
				
			case "Next" :
				logger.info("Setting Date of Next visit Next Month");
				clickWebElemntUsingJavascriptExecutor(dateOfNextVisit);
				waitForElement(nextMonth);
				clickWebElemntUsingJavascriptExecutor(nextMonth);
				waitForElement(endDate);
				clickWebElemntUsingJavascriptExecutor(endDate);
				waitForPageLoadTill(2);
				logger.info("Date of Next Visit succesfully selected");
				break;
			default : 
				   logger.info("Date: " + field +" not found");
				   break;
		}
	}
	
	/**
	 * Click Save button
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("Clicking on save button");
		clickWebElement(saveButton);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked save button");
	}
	
	/**
	 * Verify : Health Appointment ID, Provider Type, Provider Name, Contact Information, 
	 * Date Last Seen and Date of Next Visit Fields on Health Appointment Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyFields() throws AcisException {
		logger.info("Verifying Health Appointment Record Page");
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		isElementPresent(healthAppointmentIDVerify);
		isElementPresent(providerNameVerify);
		isElementPresent(providerTypeVerify);
		isElementPresent(providerContactInformationVerify);
		isElementPresent(dateLastSeenVerify);
		isElementPresent(dateOfNextVisitVerify);
		logger.info("Verfied Health Appointment Record Page");
	}
}
