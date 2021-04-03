package com.acis.automation.pages.Placement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PlacementSearchResults_OmniScriptPage extends PageBase {

	public PlacementSearchResults_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PlacementSearchResults_OmniScriptPage.class);
	
	@FindBy(xpath = "//h1[text()='Placement Search Results']")
	WebElement placementSearchResultTitle;
	
	@FindBy(xpath = "(//span[text()='Select']/preceding-sibling::span)[1]")
	WebElement firstRecordRadioButton;
	
	@FindBy(xpath = "//span[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//span[text()='Previous']")
	WebElement previousButton;
	
	@FindBy(xpath = "//div[text()='Placement']")
	WebElement placementTitle;
	
	@FindBy(xpath = "//h1[text()='New Placement']")
	WebElement placementVerify;
	
	@FindBy(xpath = "//*[text()='PLACEMENT RESOURCE']")
	WebElement placementResource;
	
	@FindBy(xpath = "//*[text()='PROVIDER AGENCY']")
	WebElement placementAgency;
	
	@FindBy(xpath = "//*[text()='PLACEMENT RES. ADDRESS']")
	WebElement placementAddress;
	
	@FindBy(xpath = "//*[text()='PLACEMENT RES. PHONE/EMAIL']")
	WebElement placementPhoneEmail;
	
	@FindBy(xpath = "//*[text()='OCCUPANCY']")
	WebElement placementOccupancy;
	
	@FindBy(xpath = "//*[text()='CAPACITY']")
	WebElement placementCapacity;
	
	@FindBy(xpath = "//*[text()='No available Placement Resources found.']")
	WebElement verifyPlacementResourceNF;
	
	public By noPlacementResource = By.xpath("//p[text()='No available Placement Resources found.']");
	
	/**
	 * Verify labels on Placement Search Result Page
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void verifyLabels() throws AcisException {
		logger.info("Verifying labels on Placement Search Results");
		waitForElement(placementResource);
		waitForElement(placementAgency);
		//waitForElement(placementAddress);
		//waitForElement(placementPhoneEmail);
		waitForElement(placementOccupancy);
		waitForElement(placementCapacity);
		logger.info("Verified labels on Placement Search Results");
	}
	
	/**
	 * Verify Placement Resource Not Found message on Placement Search Result Page
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void verifyPlacementResourceNF() throws AcisException {
		logger.info("Verifying Placement Resource Not Found");
		waitForElement(verifyPlacementResourceNF);
		logger.info("Verified Placement Resource Not Found");
	}
		
	/**
	 * Select first radio  button of search records
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectFirstRecord() throws AcisException {
		logger.info("Selecting first record");
		clickWebElement(firstRecordRadioButton);
		logger.info("Selected first record");
	}
	
	/**
	 * Select  radio  button of search records bases on placement search
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectRecord(String option) throws AcisException {
		logger.info("Selecting  record");
		clickWebElement(driver.findElement(By.xpath("//*[text()='"+option+"']/..//span[text()='Select']/preceding-sibling::span")));
		logger.info("Selected record");
	}
	/**
	 * Verify Placement Name Record
	 * @author priyanka
	 * @throws AcisException 
	 */
	public void verifyPlacementRecord(String option) throws AcisException {
		logger.info("Verifying Placement Name");
		logger.info("Expected Placement Name: "+option);
		String name=driver.findElement(By.xpath("//*[text()='"+option+"']")).getText();
		logger.info("Actual Placement Name: "+name);
		Assert.assertEquals(name, option);
		logger.info("Verified Placement Name");
	}
	/**
	 * Click Submit button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickSubmitButton() throws AcisException, InterruptedException {
		waitForPageLoadTill(5);
		logger.info("Clicking Submit button");
		clickWebElemntUsingJavascriptExecutor(submitButton);
		logger.info("Clicked Submit button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Successfully Clicked Submit button");
	}
	
	/**
	 * Click Previous button
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickPreviousButton() throws AcisException, InterruptedException {
		Thread.sleep(1000);
		logger.info("Clicking Previous button");
		clickWebElement(previousButton);
		logger.info("Clicked Previous button");
		waitForElement(placementVerify);
		
	}
	
	/*** Verify Radio Button Present or not
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void verifyRadioButton() throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		if(isElementPresent(noPlacementResource)) {
			logger.info("Verifying Placement Resource Radio Button Present or not");
			logger.info("Clicking Previous button");
			clickWebElement(previousButton);
			logger.info("Clicked Previous button");
			waitForElement(placementVerify);
			logger.info("Verified Placement Resource Radio Button Present or not");
			
			
			
		}else {
			logger.info("Verifying Placement Resource Radio Button Present or not");
			logger.info("Selecting first record");
			clickWebElement(firstRecordRadioButton);
			logger.info("Selected first record");
			logger.info("Clicking Submit button");
			clickWebElemntUsingJavascriptExecutor(submitButton);
			//clickWebElement(submitButton);
			logger.info("Clicked Submit button");
			waitForPageLoad();
			waitForPageLoadTill(5);
			waitForElement(placementTitle);
			logger.info("Successfully Clicked Submit button");
			logger.info("Verified Placement Resource Radio Button Present or not");
		}
		
	}
	
	}
