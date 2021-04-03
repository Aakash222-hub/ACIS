package com.acis.automation.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class HomePage_SFDCPage extends PageBase {
	
	final static Logger logger = LoggerFactory.getLogger(HomePage_SFDCPage.class);
	
	public HomePage_SFDCPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[@title='Select List View']")
	WebElement listView;
	
	@FindBy(xpath = "//span[normalize-space(.)='All Allegations']")
	WebElement allAllegation;

	@FindBy(xpath = "(//span[normalize-space(.)='All Accounts'])[1]")
	WebElement allAccounts;
	
	@FindBy(xpath = "//span[normalize-space(.)='My Investigations'] ")
	WebElement myInvestigation;
	
	@FindBy(xpath = "//span[normalize-space(.)='All'] ")
	WebElement allCaseHeads;
	
	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Allegation Reports']")
	WebElement downArrowAllegation;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Event Member']")
	WebElement downArrowEventMember;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Home']")
	WebElement downArrowHome;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Accounts']")
	WebElement downArrowAccount;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Case Actions']")
	WebElement downArrowCaseAction;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Case Heads']")
	WebElement downArrowCaseHeads;
	
	@FindBy(xpath = "(//table/tbody/tr/th/span/a)[1]")
	WebElement firstRecord;
	
	@FindBy(xpath = "//input[@title='Search Allegation Reports and more']")
	WebElement globalSearchAllegation;

	@FindBy(xpath = "//mark[contains(text(),'I-')]")
	WebElement allegationRecord;
	
	@FindBy(xpath = "//mark[contains(text(),'C-')]")
	WebElement fosterCaseRecord;
	
	@FindBy(xpath = "//div[@aria-label='Workspace tabs for ACIS']//*[contains(text(),'Close')]")
	WebElement closeButton;
	
	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;
	
	//Mrunal
	@FindBy(xpath = "//input[@role='textbox']")
	WebElement globalSearchDropdown;
	//Mrunal
	@FindBy(xpath = "//span[text()='All']")
	WebElement globalSearchDropdownAll;
	

	@FindBy(xpath="//label[text()='Username']")
	WebElement usernameLabel;
	
	@FindBy(xpath = "//span[@class='uiImage']")
	WebElement usericon;
	
	@FindBy(xpath="//a[@class='profile-link-label logout uiOutputURL']")
	WebElement logout;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search this list')]")
	WebElement searchBox;
	
	public By closeButtonBy = By.xpath("//div[@aria-label='Workspace tabs for ACIS']//*[contains(text(),'Close')]");
	
	public By downArrowAllegationCheck = By.xpath("//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Allegation Reports']");
	
	public By listViewVerify = By.xpath("//a[@title='Select List View']");
	
	
	@FindBy(xpath="//p[contains(text(),'Account ID')]/..//p//lightning-formatted-text")
	WebElement accountid;
	
	@FindBy(xpath = "//input[contains(@title,'Search')]")
	WebElement globalSearchtextbox;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Events']")
	WebElement downArrowEvents;
	
	@FindBy(xpath = "//span[@class=' virtualAutocompleteOptionText' and normalize-space(.)='All']")
	WebElement allEvents;
	
	@FindBy(xpath = "//div[text()='New Recruitment']")
	WebElement newRecruitment;
	
	@FindBy(xpath = "//div[text()='New Orientation Event']")
	WebElement newOrientationEvent;
	
	/**
	 * Click on DownArrow and Click on Home
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickDownArrowHome() throws AcisException {
		logger.info("Clicking on DownArrow");
		waitForElementClickable(downArrow);
		clickWebElement(downArrow);
		logger.info("Clicked on DownArrow");
		waitForPageLoadTill(5);
		logger.info("Clicking on Home from DownArrow");
		waitForElementClickable(downArrowHome);
		clickWebElemntUsingJavascriptExecutor(downArrowHome);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on Home from DownArrow");

	}
	
	/**
	 * Close all existing tab
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void closeTabs() throws AcisException {
			waitForElement(downArrow);
			while(isElementPresent(closeButtonBy))
			{
				clickWebElemntUsingJavascriptExecutor(closeButton);
				waitForPageLoadTill(2);
			}
			waitForPageLoadTill(2);
			refreshPage();
			waitForPageLoadTill(8);
			waitForPageLoad();
			logger.info("Closed all exisiting tab");
		

	}
	
	/**
	 * Click on DownArrow and Click on Account
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickDownArrowAccount() throws AcisException {
		logger.info("Clicking on DownArrow");
		waitForElementClickable(downArrow);
		clickWebElement(downArrow);
		logger.info("Clicked on DownArrow");
		waitForPageLoadTill(5);
		logger.info("Clicking on Account from DownArrow");
		waitForElementClickable(downArrow);
		clickWebElement(downArrowAccount);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Account from DownArrow");

	}
	
	/**
	 * Click on DownArrow and Click on Case Actions
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickDownArrowCaseActions() throws AcisException {
		logger.info("Clicking on DownArrow");
		waitForElementClickable(downArrow);
		clickWebElement(downArrow);
		logger.info("Clicked on DownArrow");
		waitForPageLoadTill(5);
		logger.info("Clicking on Case Actions from DownArrow");
		waitForElementClickable(downArrowCaseAction);
		clickWebElement(downArrowCaseAction);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Case Actions from DownArrow");

	}
	
	/**
	 * Select : My Investigation from Select List View
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void selectMyInvestigation() throws AcisException {
		logger.info("Clicking on Select List View");
		waitForElementClickable(listView);
		clickWebElement(listView);
		logger.info("Clicked on Select List View");
		waitForPageLoadTill(5);
		logger.info("Selecting My Investigation from Select List View");
		waitForElementClickable(myInvestigation);
		clickWebElement(myInvestigation);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected My Investigation from Select List View");
	}
	
	/**
	 * Click new button from homepage
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickNewButton() throws AcisException, InterruptedException {
		logger.info("Clicking on New Button from Homepage");
		clickWebElement(newButton);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on New Button from Homepage");

	}
	
	/**
	 * Select : All Allegation from Select List View
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void selectAllAccount() throws AcisException, InterruptedException {
		logger.info("Clicking on Select List View");
		waitForElementClickable(listView);
		clickWebElement(listView);
		logger.info("Clicked on Select List View");
		waitForPageLoadTill(5);
		logger.info("Selecting All Allegation from Select List View");
		waitForElementClickable(allAccounts);
		clickWebElement(allAccounts);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Selected All Allegation from Select List View");
	}
	
	/**
	 * Click on DownArrow and Click on Allegation
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickDownArrowAllegation() throws AcisException, InterruptedException {
		logger.info("Clicking on DownArrow");
		waitForElementClickable(downArrow);
		clickWebElement(downArrow);
		logger.info("Clicked on DownArrow");
		waitForPageLoadTill(10);
		logger.info("Clicking on Allegation from DownArrow");
		
		if(isElementPresent(downArrowAllegationCheck))
		{
			clickWebElement(downArrowAllegation);
		}
		else
		{
			waitForPageLoad();
			waitForElement(downArrow);
			clickWebElement(downArrow);
			waitForElementClickable(downArrowAllegation);
			clickWebElement(downArrowAllegation);
		}
		waitForPageLoadTill(5);
		logger.info("Clicked on Allegation from DownArrow");

	}
	
	/**
	 * Select : All Allegation from Select List View
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void selectAllAllegation() throws AcisException, InterruptedException {
		logger.info("Clicking on ListView");
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElementClickable(listView);
		clickWebElement(listView);
		logger.info("Clicked on ListView");
		waitForPageLoadTill(5);
		logger.info("Selecting All Allegation from Select List View");
		waitForElementClickable(allAllegation);
		clickWebElement(allAllegation);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected All Allegation from Select List View");
	}
	
	/**
	 * Click on First Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickFirstRecord() throws AcisException {
		logger.info("Clicking on first Record from List View");
		waitForElementClickable(firstRecord);
		clickWebElement(firstRecord);
		waitForPageLoadTill(5);
		logger.info("Clicked on first Record from List View");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(10);

	}
	
	/**
	 * Global Search Enter and click on the record
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void searchGlobal(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on Global Search");
		waitForElement(downArrow);
		waitForElementClickable(globalSearchDropdown);
		clickWebElement(globalSearchDropdown);
		logger.info("Clicked on Global Search");	
		logger.info("selecting All on Global Search Dropdown");
		clickWebElement(globalSearchDropdownAll);
		logger.info("selected All on Global Search Dropdown");
		waitForPageLoadTill(10);
		logger.info("Entering Text on Global Search");
		globalSearchAllegation.sendKeys(strText);
		waitForPageLoadTill(5);
		waitForElement(allegationRecord);
		clickWebElement(allegationRecord);
		logger.info("Clicked on Allegation Record on Global Search");
		waitForPageLoadTill(6);
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Global Search for Allegation Record");

	}
	
	/**
	 * Global Search Enter and click on the record
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void searchGlobalFosterCase(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on Global Search");
		waitForElement(downArrow);
		waitForElementClickable(globalSearchDropdown);
		clickWebElement(globalSearchDropdown);
		logger.info("Clicked on Global Search");	
		logger.info("selecting All on Global Search Dropdown");
		clickWebElement(globalSearchDropdownAll);
		logger.info("selected All on Global Search Dropdown");
		waitForPageLoadTill(10);
		logger.info("Entering Text on Global Search");
		globalSearchAllegation.sendKeys(strText);
		waitForPageLoadTill(5);
		waitForElement(fosterCaseRecord);
		clickWebElement(fosterCaseRecord);
		logger.info("Clicked on Allegation Record on Global Search");
		waitForPageLoadTill(6);
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Global Search for Allegation Record");

	}
	
	
	/**
	 * Global Search Enter 
	 * Date : 31-8-2020
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void searchGlobalEnter(String strText) throws AcisException {
		logger.info("Clicking on Global Search");
		waitForElement(downArrow);
		clickWebElement(globalSearchDropdown);
		logger.info("Clicked on Global Search");	
		logger.info("selecting All on Global Search Dropdown");
		clickWebElement(globalSearchDropdownAll);
		logger.info("Entering Text on Global Search");
		globalSearchAllegation.clear();
		globalSearchAllegation.sendKeys(strText);
		globalSearchAllegation.sendKeys(Keys.ENTER);
		logger.info("Global Search for Allegation Record");

	}
	
	/**
	 * LogoutUser from ACIS application 
	 * @author Amit
	 * @throws AcisException 
	 */
	public void logoutUser() throws AcisException{
		waitForElementClickable(usericon);
		clickWebElemntUsingJavascriptExecutor(usericon);
		waitForElement(logout);
		clickWebElemntUsingJavascriptExecutor(logout);
		waitForElement(usernameLabel);
		waitForPageLoadTill(5);
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("User logged out successfully");
		
	}

	/**
	 * Verify AutoNumbered Account ID field on Person Account
	 * @author Amit
	 * @throws AcisException 
	 */
	public void verifyAccountID() {
		logger.info("Verifying Account ID autonumbered");
		String accountidvalue= accountid.getText().trim();
		System.out.println(accountidvalue);
		if(accountidvalue.contains("A-")) {
			logger.info("Account ID autonumbered verified");
		}
		
	}
	
	/**
	 * Click on DownArrow and Click on Case Head
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickDownArrowCaseHead() throws AcisException, InterruptedException {
		logger.info("Clicking on DownArrow");
		waitForElementClickable(downArrow);
		clickWebElement(downArrow);
		logger.info("Clicked on DownArrow");
		waitForPageLoadTill(5);
		logger.info("Clicking on Case Heads from DownArrow");
		waitForElementClickable(downArrowCaseHeads);
		clickWebElement(downArrowCaseHeads);
		waitForPageLoadTill(5);
		logger.info("Clicked on Case Heads from DownArrow");

	}
	
	/**
	 * Select : All from Select List View for Case Heads
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void selectAllCaseHeads() throws AcisException, InterruptedException {
		logger.info("Clicking on ListView");
		waitForPageLoad();
		waitForElementClickable(listView);
		clickWebElement(listView);
		logger.info("Clicked on ListView");
		waitForPageLoadTill(5);
		logger.info("Selecting All Case Heads from Select List View");
		waitForElementClickable(allCaseHeads);
		clickWebElement(allCaseHeads);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected All Case Heads from Select List View");
	}
	
	/**
	 * Search the record on internal search box and click on record
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void searchRecordAndClick(String recordName) throws AcisException {
		logger.info("Searching the record on internal search box : " + recordName);
		waitForPageLoad();
		waitForPageLoadTill(5);
		enterText(searchBox, recordName);
		waitForPageLoadTill(5);
		searchBox.sendKeys(Keys.ENTER);
		waitForPageLoadTill(5);
		logger.info("Searched the record on internal search box : " + recordName);
		logger.info(" clicking  on record" + recordName);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//*[text()='"+recordName+"']")));
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info(" clicked  on record" + recordName);
		
	}
	
	/**
	 * Global Search Enter and click on the Account record
	 * Created By Mrunal
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void searchGlobalAccountRecord(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on Global Search");
		waitForElement(downArrow);
		waitForElementClickable(globalSearchDropdown);
		clickWebElement(globalSearchDropdown);
		logger.info("Clicked on Global Search");	
		logger.info("selecting All on Global Search Dropdown");
		clickWebElement(globalSearchDropdownAll);
		logger.info("selected All on Global Search Dropdown");
		waitForPageLoadTill(10);
		testLoggerInfo("Entering Text on Global Search " + strText);
		logger.info("Entering Text on Global Search " + strText);
		globalSearchtextbox.sendKeys(strText);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("//span[@title='"+ strText+"']")));
		clickWebElement(driver.findElement(By.xpath("//span[@title='"+ strText+"']")));
		logger.info("Clicked on Account Record on Global Search");
		waitForPageLoadTill(6);
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Global Searched for Account Record");
	}
	/**
	 * Click on DownArrow and Click on Event Member
	 * Created By Priyanka
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickDownArrowEventMember() throws AcisException, InterruptedException {
		logger.info("Clicking on DownArrow");
		waitForElementClickable(downArrow);
		clickWebElement(downArrow);
		logger.info("Clicked on DownArrow");
		waitForPageLoadTill(5);
		logger.info("Clicking on Event Member from DownArrow");
		waitForElementClickable(downArrowEventMember);
		clickWebElement(downArrowEventMember);
		waitForPageLoadTill(5);
		logger.info("Clicked on Event Member from DownArrow");

	}
	
	/**
	 * Click on DownArrow and Click on Events
	 * Created By Pallavi
	 * @throws AcisException 
	 */
	public void clickDownArrowEvent() throws AcisException {
		logger.info("Clicking on DownArrow");
		waitForPageLoadTill(10);
		waitForElementClickable(downArrow);
		clickWebElement(downArrow);
		logger.info("Clicked on DownArrow");
		waitForPageLoadTill(5);
		logger.info("Clicking on Events from DownArrow");
		waitForElementClickable(downArrowEvents);
		clickWebElemntUsingJavascriptExecutor(downArrowEvents);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on Event from DownArrow");

	}
	
	/**
	 * Select : All Events from Select List View
	 * Created By Pallavi
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void selectAllEvent() throws AcisException, InterruptedException {
		logger.info("Clicking on ListView");
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElementClickable(listView);
		clickWebElement(listView);
		logger.info("Clicked on ListView");
		waitForPageLoadTill(5);
		logger.info("Selecting All Events from Select List View");
		waitForElementClickable(allEvents);
		clickWebElement(allEvents);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected All Events from Select List View");
	}
	
	
	
	/**
	 * Click new Recruitment button from Event page
	 * Created By Pallavi
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickNewRecruitment() throws AcisException, InterruptedException {
		logger.info("Clicking on New Recruitment Button from Eventpage");
		waitForPageLoadTill(10);
		waitForElement(newRecruitment);
		clickWebElement(newRecruitment);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on New Recruitment Button from Eventpage");

	}
	
	/**
	 * Click new Orientation button from Event page
	 * Created By Pallavi
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickNewOrientationEvent() throws AcisException, InterruptedException {
		logger.info("Clicking on New Recruitment Button from Eventpage");
		waitForPageLoadTill(10);
		waitForElement(newOrientationEvent);
		clickWebElement(newOrientationEvent);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on New Recruitment Button from Eventpage");

	}
}
