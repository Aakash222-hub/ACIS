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

public class PersonMedicationPage extends PageBase {

	public PersonMedicationPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(PersonMedicationPage.class);
	
	//Dharmesh
	
	@FindBy(xpath = "//span[text()='Medication']/../..//a")
	WebElement medicationTab;
	
	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;
	
	@FindBy(xpath = "//*[text()='Medication Name']/../..//input[@type='text']")
	WebElement medicationName;
	
	@FindBy(xpath = "//*[text()='Diagnosis']/../..//textarea")
	WebElement diagnosis;
	
	@FindBy(xpath = "//*[text()='Start Date']/../..//input")
	WebElement startDatePicker;
	
	@FindBy(xpath = "//*[text()='End Date']/../..//input")
	WebElement endDatePicker;
	
	@FindBy(xpath = "//span[text()='19']")
	WebElement startDate;
	
	@FindBy(xpath = "//span[text()='22']")
	WebElement endDate;
	
	@FindBy(xpath = "//*[text()='Dose']/../..//input[@type='text']")
	WebElement dose;
	
	@FindBy(xpath = "//*[text()='Frequency']/../..//input")
	WebElement frequency;
	
	@FindBy(xpath = "//*[text()='Other']")
	WebElement other;
	
	public By medicationTabCheck = By.xpath("//span[text()='Medication']/../..//a");
	
	public By weekly = By.xpath("//*[text()='Weekly']");
	
	public By monthly = By.xpath("//*[text()='Monthly']");
	
	public By daily = By.xpath("//*[text()='Daily']");
	
	public By medicationIDVerify = By.xpath("//span[text()='Medication ID']/../..//lightning-formatted-text[contains(text(),'MD')]");
	
	@FindBy(xpath = "//*[text()='Other Frequency']/../..//input")
	WebElement otherFrequency;
	
	@FindBy(xpath = "//button[@name='SaveEdit']")
	WebElement saveButton;
	
	
	/**
	 * Owner : Dharmesh
	 * Description : Click on Medicaiton Tab
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickMedicationTab() throws AcisException, InterruptedException {
		logger.info("Clicking on Education Related Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		waitForElementClickable(medicationTab);
		scrollingToElementofAPage(medicationTab);
		clickWebElemntUsingJavascriptExecutor(medicationTab);
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
		logger.info("Clicking on New button");
		waitForElementClickable(newButton);
		clickWebElement(newButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New button");
	}
	
	/**
	 * Verify : All Frequency Options available in Medication Record Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyFrequencyType() throws AcisException, InterruptedException {
		logger.info("Verifying Frequency Type options on Medicaiton Page ");
		clickWebElemntUsingJavascriptExecutor(frequency);
		waitForPageLoadTill(5);
		isElementPresent(daily);
		isElementPresent(weekly);
		isElementPresent(monthly);
		clickWebElemntUsingJavascriptExecutor(other);
		logger.info("Verified Frequency Type options on Medication Page ");
	}
	
	/**
	 * Set Start Date/ End Date on Medication Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void setDate(String field) throws AcisException, InterruptedException{
		switch(field)
		{
			case "Start" :
				logger.info("Setting Start Date");
				clickWebElemntUsingJavascriptExecutor(startDatePicker);
				waitForElement(startDate);
				clickWebElemntUsingJavascriptExecutor(startDate);
				waitForPageLoadTill(2);
				logger.info("Start Date succesfully selected");
				break;
				
			case "End" :
				logger.info("Setting End Date");
				clickWebElemntUsingJavascriptExecutor(endDatePicker);
				waitForElement(endDate);
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
	 * Enter Text in Medication Record Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void enterText(String str, String data) throws AcisException, InterruptedException {
		
		logger.info("Entering "+str+" Field as "+data);
		switch(str)
		{
		case "Name":
			enterText(medicationName, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "Diagnosis":
			enterText(diagnosis, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "Dose":
			enterText(dose, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		case "Other_Frequency":
			enterText(otherFrequency, data);
			logger.info(str+" Field entered as :"+data);
			break;
			
		default:
			logger.info(str+" Field not found.");
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
	 * Verify : Medication Record Created
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyFields() throws AcisException {
		logger.info("Verify Medication Record Created");
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		isElementPresent(medicationIDVerify);
		logger.info("Successfully verified Medication Record Created");
	}
}
