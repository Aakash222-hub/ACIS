package com.acis.automation.pages.personaccount;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class RelatedPersonTabPage extends PageBase{

	public RelatedPersonTabPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(RelatedPersonTabPage.class);
	
	@FindBy(xpath = "//span[text()='Phone & Email']/../..//a")
	WebElement phoneAndEmailTab;
	
	@FindBy(xpath = "//span[text()='Addresses']/../..//a")
	WebElement addressesTab;

	@FindBy(xpath = "//span[text()='Personal Identifiers']/../..//a")
	WebElement personalIdentifersTab;
	
	@FindBy(xpath = "//span[@title='Finances']")
	WebElement financeTab;
	//Mrunal
	@FindBy(xpath = "//span[text()='Files']/../..//a")
	WebElement filesTab;
	
	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;
	
	@FindBy(xpath="(//div[text()='New Finance'])[2]")
	WebElement newFinance;
	
	
	/**
	 *Owner : Mrunal
	 * Description :  Click on Phone and Email tab
	 * @throws AcisException 
	 */
	public void clickPhoneAndEmailTab() throws AcisException {
		waitForPageLoad();
		logger.info("Clicking on phone email tab");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,700)");
         waitForElementClickable(phoneAndEmailTab);
         scrollingToElementofAPage(phoneAndEmailTab);
		clickWebElemntUsingJavascriptExecutor(phoneAndEmailTab);
		waitForPageLoadTill(2);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForElement(newButton);
		logger.info("Clicked on Phone and Email tab");
	}
	
	/**
	 * Owner : Mrunal
	 * Description : Click on Address Tab
	 * @throws AcisException 
	 */
	public void clickAddressTab() throws AcisException {
		logger.info("Clicking Address Tab");
		Actions actions = new Actions(driver);
		// Scroll Down using Actions class
	     actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	     // Scroll Up using Actions class
	     waitForPageLoadTill(5);
	     actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	     waitForElementClickable(addressesTab);
		scrollingToElementofAPage(addressesTab);
		clickWebElemntUsingJavascriptExecutor(addressesTab);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("Clicked Address Tab");
	}
	
	/**
	 * Owner : Mrunal
	 * Description : Click on Person Identifier Tab
	 * @throws AcisException 
	 */
	public void clickPersonIdentifierTab() throws AcisException {
		logger.info("Clicking on Person Identifier Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		waitForElementClickable(personalIdentifersTab);
		scrollingToElementofAPage(personalIdentifersTab);
		clickWebElemntUsingJavascriptExecutor(personalIdentifersTab);
		waitForPageLoadTill(2);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Person Identifier Tab");
	}
	
	/**
	 * Owner : Mrunal
	 * Description : Click on Income Tab
	 * @throws AcisException 
	 */
	public void clickFinanceTab() throws AcisException {
		logger.info("Clicking on Finance Tab");
		
		Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        waitForPageLoadTill(9);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,1250)");
		 waitForPageLoadTill(9);
         waitForElementClickable(financeTab);
         logger.info("clicking finance tab");
		clickWebElemntUsingJavascriptExecutor(financeTab);
		logger.info("clicked finance tab");
		waitForPageLoadTill(15);
		clickWebElement(newFinance);
		waitForPageLoadTill(25);
		logger.info("Clicked on New Finance ");
	}
	
	/**
	 * Owner : Mrunal
	 * Description : Click on Files Tab
	 * @throws AcisException 
	 */
	public void clickFilesTab() throws AcisException {
		logger.info("Clicking files Tab");
		Actions actions = new Actions(driver);
		// Scroll Down using Actions class
	     actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	     // Scroll Up using Actions class
	     waitForPageLoadTill(10);
	     actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	     waitForPageLoadTill(10);
	     waitForElementClickable(filesTab);
		scrollingToElementofAPage(filesTab);
		clickWebElemntUsingJavascriptExecutor(filesTab);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		logger.info("Clicked files Tab");
	}
	
}
