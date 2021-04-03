package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ChildRemovalEpisodePage  extends PageBase{

	public ChildRemovalEpisodePage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ChildRemovalEpisodePage.class);
	
	@FindBy(xpath = "//button[text()='New']")
	WebElement newButtonChildRemovalEpisodes;
	
	@FindBy(xpath = "//button[@title='Close Child Removal Episodes']")
	WebElement closeChildRemovalEpisodes;
	
	@FindBy(xpath = "(//*[text()='Case Action ID'])[1]")
	WebElement caseActionIDLabel;
	
	@FindBy(xpath = "(//*[text()='Edit'])[2]")
	WebElement editCasePersonButton;
	
	@FindBy(xpath = "(//a[text()='Details'])[2]")
	WebElement detailsTab;
	
	@FindBy(xpath = "(//span[text()='Child Removal Episodes']/../..//a)[2]")
	WebElement childRemovalEpisodesPersonRecord;
	
	@FindBy(xpath = "//*[text()='Child Name']")
	WebElement childNameLabel;
	
	@FindBy(xpath = "//*[text()='Foster Care Case Action']")
	WebElement fosterCareCaseActionLabel;
	
	@FindBy(xpath = "//span[text()='Date of Birth']")
	WebElement dateOfBirthLabel;
	
	@FindBy(xpath = "//*[text()='Child Removal Episode ID']")
	WebElement childRemovalEpisodeIDLabel;
	
	@FindBy(xpath = "//*[text()='Child ID']")
	WebElement childIDLabel;
	
	@FindBy(xpath = "//span[text()='Date of Entry']")
	WebElement dateOfEntryLabel;
	
	@FindBy(xpath = "//span[text()='Status']")
	WebElement statusLabel;
	
	@FindBy(xpath = "//span[text()='Length of Stay']")
	WebElement lenghtOfStayLabel;
	
	@FindBy(xpath = "//span[text()='Date of Exit']")
	WebElement dateOfExitLabel;
	
	@FindBy(xpath = "//span[text()='Removal Reason']")
	WebElement removalReasonLabel;
	
	@FindBy(xpath = "//span[text()='Exit Type']")
	WebElement exitTypeLabel;
	
	@FindBy(xpath = "//span[text()='Subcategory for Neglect']")
	WebElement subcategoryForNeglectLabel;
	
	@FindBy(xpath = "//span[text()='Allegation Report']")
	WebElement allegationReportLabel;
	
	@FindBy(xpath = "//span[text()='Subcategory for Abuse']")
	WebElement subcategoryForAbuseLabel;
	
	@FindBy(xpath = "//span[text()='Street 1']")
	WebElement street1Label;
	
	@FindBy(xpath = "//span[text()='Street 2']")
	WebElement street2Label;
	
	@FindBy(xpath = "//span[text()='City']")
	WebElement cityLabel;
	
	@FindBy(xpath = "//span[text()='Created By']")
	WebElement createdByLabel;
	
	@FindBy(xpath = "//span[text()='Last Modified By']")
	WebElement lastModifiedByLabel;
	
	@FindBy(xpath = "(//*[contains(text(),'CRE-')])[1]")
	WebElement firstChilRemovalEpisodeRecord;
	
	@FindBy(xpath = "//button[contains(@title,'Close CRE-')]")
	WebElement closeChildRemovalEpisodeRecodButton;
	
	public By newButtonChildRemovalEpisodesBy = By.xpath("//button[text()='New']");

	
	
	/**
	 * Check New button is not present for child Removal Episodes
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void checkNewButtonChildRemovalEpisodes() throws AcisException {
		logger.info("Checking New button is not present for child Removal Episodes");
	//	Assert.assertFalse((newButtonChildRemovalEpisodes.isDisplayed()), "Error :  New button is present for child Removal Episodes");
		Assert.assertFalse(isElementPresent(newButtonChildRemovalEpisodesBy), "Error :  New button is present for child Removal Episodes");
		
		logger.info("Checked New button is not present for child Removal Episodes");
	}
	
	/**
	 * Close Close Child Removal Episodes tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeChildRemovalEpisodeTab() throws AcisException {
		logger.info("Closing Close Child Removal Episodes tab");
		clickWebElemntUsingJavascriptExecutor(closeChildRemovalEpisodes);
		logger.info("Close Child Removal Episodes Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(caseActionIDLabel);
		logger.info("successfully Closed Child Removal Episodes tab");
		
	}
	
	/**
	 * Click on child name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickChildName(String childName) throws AcisException {
		
		logger.info("Clicking on child name : "+childName );
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//a[text()='" + childName + "']")));
		waitForPageLoadTill(8);
		logger.info("Clicked on child name : "+childName );
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(editCasePersonButton);
		logger.info("Successfully Clicked on child name : "+childName );

		
	}
	
	/**
	 * Clicking child Removal Episodes of Person record
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickChildRemovalEpisodesPersonRecord() throws AcisException
	{
		logger.info("Clicking on child Removal Episodes Tab of Person record");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(childRemovalEpisodesPersonRecord);
		clickWebElemntUsingJavascriptExecutor(childRemovalEpisodesPersonRecord);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(7);
		logger.info("Clicked on child Removal Episodes Tab of Person record");
	}
	
	
	/**
	 * Check fields on child removal episodes record
	 * @author mrunal.s.tilekar
	 */
	public void checkFieldsChildRemovalEpisode() {
		logger.info("Checking fields on child removal episodes record");
		Assert.assertTrue(childIDLabel.isDisplayed(), "Error: Child Id Label Not present");
		Assert.assertTrue(dateOfBirthLabel.isDisplayed(), "Error: Date of Birth Label Not present");
		Assert.assertTrue(fosterCareCaseActionLabel.isDisplayed(), "Error: Foster Care Case Action Label Not present");
		Assert.assertTrue(childRemovalEpisodeIDLabel.isDisplayed(), "Error: Child Removal Episode ID Label Not present");
		Assert.assertTrue(childIDLabel.isDisplayed(), "Error: Child ID Label Not present");
		Assert.assertTrue(dateOfEntryLabel.isDisplayed(), "Error: Date of Entry Label Not present");
		Assert.assertTrue(statusLabel.isDisplayed(), "Error: Status Label Not present");
		Assert.assertTrue(lenghtOfStayLabel.isDisplayed(), "Error: Length of Stay Label Not present");
		Assert.assertTrue(dateOfExitLabel.isDisplayed(), "Error:Date of Exit Label Not present");
		Assert.assertTrue(removalReasonLabel.isDisplayed(), "Error: Removal Reason Label Not present");
		Assert.assertTrue(exitTypeLabel.isDisplayed(), "Error: Exit Type Label Not present");
		Assert.assertTrue(subcategoryForNeglectLabel.isDisplayed(), "Error: Subcategory for Neglect Label Not present");
		Assert.assertTrue(allegationReportLabel.isDisplayed(), "Error: Allegation Report Label Not present");
		Assert.assertTrue(subcategoryForAbuseLabel.isDisplayed(), "Error: Subcategory for Abuse Label Not present");
		Assert.assertTrue(street1Label.isDisplayed(), "Error: street1 Label Not present");
		Assert.assertTrue(street2Label.isDisplayed(), "Error: Street2 Label Not present");
		Assert.assertTrue(cityLabel.isDisplayed(), "Error: City Label Not present");
		Assert.assertTrue(createdByLabel.isDisplayed(), "Error: Created By Label Not present");
		Assert.assertTrue(lastModifiedByLabel.isDisplayed(), "Error: Last Modified By Label Not present");
		logger.info("Checked fields on child removal episodes record");
		
	}
	
	/**
	 * click Details Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickDetailsTab() throws AcisException {
		logger.info("Clicking Details Tab");
		waitForPageLoad();
		clickWebElement(detailsTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(childNameLabel);
		logger.info("Clicked Details Tab");
	}
	
	/**
	 * Click on first child removal episode record
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void clickFirstChildRemovalRecord() throws AcisException {
		logger.info("Clicking on first child removal episode record");
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(firstChilRemovalEpisodeRecord);
		waitForPageLoadTill(3);
		logger.info("Clicked on first child removal episode record");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(detailsTab);
		logger.info("Successfully Clicked on first child removal episode record");
		
	}
	
	/**
	 * Close Child Removal Episode record window
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeChildRemovalEpisodeRecordWindow() throws AcisException {
		logger.info( "Closing Child Removal Episode record window");
		if(closeChildRemovalEpisodeRecodButton.isDisplayed()) {
			clickWebElement(closeChildRemovalEpisodeRecodButton);
			waitForPageLoadTill(5);
			
		}
		logger.info( "Closing Child Removal Episode record window");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(firstChilRemovalEpisodeRecord);
		logger.info("Successfully Closed Child Removal Episode record window");
		
	}
}
