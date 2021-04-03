package com.acis.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

/**
 * This class is for defining objects of Home page and defining methods on those
 * objects.
 * 
 *
 */
public class HomePage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(HomePage.class);

	public HomePage() throws AcisException {
	}

	@FindBy(xpath = "//*[@id='ImgLogoPath']")
	WebElement ImageHomePageLogo;

	@FindBy(xpath = "//*[@title='ACIS']")
	WebElement TextAppName;

	@FindBy(xpath = "//*[text()='Help']")
	WebElement LinkHelp;

	@FindBy(xpath = "//*[@id='lblActiveCourses']/a")
	WebElement LinkActiveCourses;

	@FindBy(xpath = "//input[@name='radNumberOfRecords2']")
	WebElement TextBoxDisplay;

	@FindBy(xpath = "(//*[text()='Organizations'])[1]")
	WebElement LinkHomePageOrganization;

	@FindBy(xpath = "(//*[text()='Organizations'])[2]")
	WebElement LinkOrganization;

	@FindBy(xpath = "//*[@id='contnetframe']")
	WebElement FrameContent;

	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	WebElement linkLogout;

	@FindBy(xpath = "//*[text()='Dashboard']")
	WebElement linkDashboard;

	@FindBy(xpath = "//*[@class='rmToggle']/..")
	WebElement iconSwitchUser;

	@FindBy(xpath = "//*[text()='Master Super Admin']")
	WebElement linkMasterSuperAdmin;

	@FindBy(xpath = "(//*[@id='SwitchRoleMenuPanel']//following::span[1])[1]")
	WebElement textSwitchUser;

	@FindBy(xpath = "//*[text()='Training Manager']")
	WebElement linkTrainingManager;
	
	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Allegation Reports']")
	WebElement downArrowAllegation;

	public static By linkTrainingManagerLocator = By.xpath("//*[text()='Training Manager']");
	
	public By downArrowAllegationCheck = By.xpath("//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Allegation Reports']");
	
	public By homeMenuCheck = By.xpath("//a[@title='Home']");
	
	
	@FindBy(xpath = "//*[text()='Primary Org Admin']")
	WebElement linkPrimaryOrgAdmin;

	public static By dashBoardLocator = By.xpath("//*[text()='Dashboard']");
	public static By menuHome = By.xpath("//*[text()='Home']");
	public static By linkLogoutLocator = By.xpath("//*[contains(text(),'Logout')]");
	public String strRoleName = "//*[text()='ABC']";
	public static By homeVerify = By.xpath("//*[@title='ACIS']");
	
	/**
	 * This method is used to verify Home page
	 * 
	 * @throws AcisException
	 */
	public void verfiyHomePage() throws AcisException {

		try {
			Thread.sleep(10000);
			waitForPageLoad();
			if(isElementPresent(homeVerify))
			{
				Thread.sleep(10000);
				waitForPageLoad();
				String name = TextAppName.getText().trim();
				Assert.assertEquals(name, "ACIS", "Failed to verify Home Page ");
				
			}
			else
			{
				Thread.sleep(10000);
				waitForPageLoad();
				refreshPage();
				Thread.sleep(10000);
				waitForPageLoad();
				String name = TextAppName.getText().trim();
				Assert.assertEquals(name, "ACIS", "Failed to verify Home Page ");
			}

			testLoggerPass("verified home page successfully");
			logger.info("verified home page successfully");
			
			if(isElementPresent(homeMenuCheck))
			{
				logger.info("Home Tab alreday open");
				logger.info("Clicking on DownArrow");
				waitForElementClickable(downArrow);
				clickWebElement(downArrow);
				logger.info("Clicked on DownArrow");
				waitForPageLoadTill(10);
				logger.info("Clicking on Allegation from DownArrow");
				
				if(isElementPresent(downArrowAllegationCheck))
				{
					clickWebElemntUsingJavascriptExecutor(downArrowAllegation);
				}
				else
				{
					waitForPageLoad();
					waitForElement(downArrow);
					clickWebElement(downArrow);
					waitForElementClickable(downArrowAllegation);
					clickWebElemntUsingJavascriptExecutor(downArrowAllegation);
				}
				waitForPageLoadTill(5);
				
				logger.info("Clicked on Allegation from DownArrow");				
				
	
			}

		} catch (Exception e) {

			testLoggerFail("Failed to verify home page");
			getStackTrace(e, "Failed to verify home page");

		}
	}


	/**
	 * This method is used to click on Logout link
	 * 
	 * @throws AcisException
	 */
	public void clickLogout() throws AcisException {
		closeWindowsExceptParent();
		waitForPageLoad();
		switchToDefaultContent();
		waitForElement(linkLogout);
		clickWebElement(linkLogout);
		logger.info("Clicked on Logout");

		testLoggerInfo("Clicked on Logout");

	}

	/**
	 * This method is used to verify user successfully logged into Application
	 * 
	 * @throws AcisException
	 */
	public void verifyLogin() throws AcisException {

		waitForPageLoad();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed to wait till page get loaded");
		}
		switchToDefaultContent();
		Assert.assertTrue(verifyLoggedInUser(), "Failed to Login");
	}

	/**
	 * This method is used to verify user successfully logged into Application
	 * 
	 * @return
	 * @throws AcisException
	 * @author (Original) Unknown
	 */

	public boolean verifyLoggedInUser() throws AcisException {
		waitForPageLoad();
		if (isElementPresent(dashBoardLocator)) {
			logger.info("Homepage is verified successfully");

			testLoggerPass("Homepage is verified successfully");

			return true;
		} else if (isElementPresent(menuHome)) {
			logger.info("Homepage is verified successfully");

			testLoggerPass("Homepage is verified successfully");

			return true;
		} else
			return false;
	}

	/**
	 * This method is used to hover on Switch User icon
	 * 
	 * @throws AcisException
	 */

	public HomePage hoverOnSwitchUserIcon() throws AcisException {
		waitForPageLoad();
		switchToDefaultContent();
		waitForElement(iconSwitchUser);
		hoverOverElement(iconSwitchUser);
		logger.info("Mouse hovered on Switch user icon");

		testLoggerInfo("Mouse hovered on Switch user icon");

		return this;
	}




}
