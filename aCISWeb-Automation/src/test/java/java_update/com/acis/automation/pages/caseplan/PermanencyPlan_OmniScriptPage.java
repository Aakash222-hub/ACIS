package com.acis.automation.pages.caseplan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PermanencyPlan_OmniScriptPage extends PageBase {

	public PermanencyPlan_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PermanencyPlan_OmniScriptPage.class);

	@FindBy(xpath = "(//*[text()='Permanency Goals For']/../../..//input)[last()]")
	WebElement permanencyGoalsFor;

	@FindBy(xpath = "(//*[text()='Secondary Goal']/../../..//input)[last()]")
	WebElement primary2;

	@FindBy(xpath = "(//span[text()='Primary Goal'])[2]//..//..//..//input")
	WebElement primaryGoal2;

	@FindBy(xpath = "(//*[text()='Secondary Goal']/../../..//li//*[text()='Reunification'])[last()]")
	WebElement reunification2;

	@FindBy(xpath = "(//*[text()='Secondary Goal']/../../..//li//*[text()='Guardianship'])[last()]")
	WebElement guardianship2;

	@FindBy(xpath = "(//*[text()='Secondary Goal']/../../..//li//*[text()='Adoption'])[last()]")
	WebElement adoption2;

	@FindBy(xpath = "(//*[text()='Secondary Goal']/../../..//li//*[text()='APPLA'])[last()]")
	WebElement appla2;

	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//input)[last()]")
	WebElement primary1;

	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//li//*[text()='Reunification'])[last()]")
	WebElement reunification;

	@FindBy(xpath = "(//*[text()='Primary Goal'])[2]/../../..//li//*[text()='Reunification'][last()]")
	WebElement reunificationforPrimaryGoal2;

	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//li//*[text()='Reunification'])[last()")
	WebElement reunificationforPrimaryGoal1;

	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//li//*[text()='Guardianship'])[last()]")
	WebElement guardianship;

	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//li//*[text()='Guardianship'])[last()]")
	WebElement guardianshipforPrimaryGoal1;

	
	
	@FindBy(xpath = "(//*[text()='Primary Goal'])[2]/../../..//li//*[text()='Guardianship'][last()]")
	WebElement guardianshipforPrimaryGoal2;
	
	
	
	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//li//*[text()='Emancipation'])[last()]")
	WebElement emancipation;

	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//li//*[text()='Adoption'])[last()]")
	WebElement adoption;

	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//li//*[text()='Adoption'])[last()")
	WebElement adoptionforPrimaryGoal1;

	@FindBy(xpath = "(//*[text()='Primary Goal'])[2]/../../..//li//*[text()='Adoption'][last()]")
	WebElement adoptionforPrimaryGoal2;

	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//li//*[text()='APPLA'])[last()]")
	WebElement appla;

	@FindBy(xpath = "(//*[text()='Primary Goal']/../../..//li//*[text()='APPLA'])[last()]")
	WebElement applaforPrimaryGoal1;

	@FindBy(xpath = "(//*[text()='Primary Goal'])[2]/../../..//li//*[text()='APPLA'][last()]")
	WebElement applaforPrimaryGoal2;

	@FindBy(xpath = "//*[text()='Permanency Narrative']/../..//textarea")
	WebElement permanencyNarrative;
	
	@FindBy(xpath = "(//label[text()='Permanency Narrative'])[2]//..//..//textarea")
	WebElement permanencyNarrative2;

	@FindBy(xpath = "//span[text()='Primary Goal']//..//..//..//input")
	WebElement primaryGoalforFirstEntry;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//h1[text()='Services to the Child(ren)']")
	WebElement serviceToChildrenTitle;
	
	@FindBy(xpath="//*[text()='Save for later']")
	WebElement saveForLater;
			
	@FindBy(xpath="//button[text()='OK']")
	WebElement ok;
			
	@FindBy(xpath="//span[text()='Your OmniScript is saved for later']")
	WebElement omniscriptSaveForLater;
	
	/**
	 * Owner : Dharmesh Krishna Description: Set Permanency Goals For on Permanency
	 * Plan Page
	 * 
	 * @throws AcisException
	 */
	public void setPermanencyGoalsFor(String strText) throws AcisException {
		waitForElementClickable(permanencyGoalsFor);
		clickWebElement(permanencyGoalsFor);
		waitForPageLoadTill(5);
		System.out.println(strText);
		waitForPageLoadTill(10);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'" + strText + "')])[last()]"))).click().perform();
		waitForPageLoadTill(5);
		logger.info("Selected Permanency Goals for as:" + strText);
	}

	/**
	 * Select primary 1 picklist on Permanency Plan Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void primaryFirst(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "reunification":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElement(primary1);
			waitForElement(reunification);
			clickWebElement(reunification);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "guardianship":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElement(primary1);
			waitForElement(guardianship);
			clickWebElement(guardianship);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;
			

		case "adoption":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElement(primary1);
			waitForElement(adoption);
			clickWebElement(adoption);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;
			
		case "Emancipation":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElement(primary1);
			waitForElement(emancipation);
			clickWebElement(emancipation);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "appla":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElement(primary1);
			waitForElement(appla);
			clickWebElement(appla);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		default:
			logger.info("No seleted Primary 1");
			break;
		}

	}

	/**
	 * Select primary 2 picklist on Permanency Plan Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void primarySecond(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "reunification":
			logger.info("Selecting Primary 2 as :" + subtypeOption);
			clickWebElement(primary2);
			waitForPageLoadTill(2);
			clickWebElement(reunification2);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 2 as :" + subtypeOption);
			break;

		case "guardianship":
			logger.info("Selecting Primary 2 as :" + subtypeOption);
			clickWebElement(primary2);
			waitForPageLoadTill(2);
			clickWebElement(guardianship2);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 2 as :" + subtypeOption);
			break;

		case "adoption":
			logger.info("Selecting Primary 2 as :" + subtypeOption);
			clickWebElement(primary2);
			waitForPageLoadTill(2);
			clickWebElement(adoption2);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 2 as :" + subtypeOption);
			break;

		case "appla":
			logger.info("Selecting Primary 2 as :" + subtypeOption);
			clickWebElement(primary2);
			waitForPageLoadTill(2);
			clickWebElement(appla2);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 2 as :" + subtypeOption);
			break;

		default:
			logger.info("No seleted Primary 2");
			break;
		}

	}

	/**
	 * Owner : Dharmesh Krishna Description: Set Permanency Narrative on Permanency
	 * Plan Page
	 * 
	 * @throws AcisException
	 */
	public void setPermanencyNarrative(String strText) throws AcisException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		enterText(permanencyNarrative, strText);
		waitForPageLoadTill(9);
		logger.info("Selected Permanency Narrative for as:" + strText);
	}

	/**
	 * Select primary 1 picklist on Permanency Plan Page
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void primaryGoalFirst(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "reunification":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElement(primaryGoalforFirstEntry);
			clickWebElemntUsingJavascriptExecutor(reunificationforPrimaryGoal1);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "guardanship":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,450)");
			clickWebElement(primaryGoalforFirstEntry);
			waitForPageLoadTill(9);
			clickWebElement(guardianshipforPrimaryGoal1);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "adoption":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			JavascriptExecutor jse3 = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse3.executeScript("window.scrollBy(0,450)");
			clickWebElement(primaryGoalforFirstEntry);
			clickWebElement(adoptionforPrimaryGoal1);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "Applpa":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse2.executeScript("window.scrollBy(0,450)");
			clickWebElement(primaryGoalforFirstEntry);
			clickWebElement(applaforPrimaryGoal1);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		default:
			logger.info("No seleted Primary 1");
			break;
		}

	}

	/**
	 * Select primary 2 picklist on Permanency Plan Page
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void primaryGoalSecond(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "reunification":
			logger.info("Selecting Primary 2 as :" + subtypeOption);
			clickWebElement(primaryGoal2);
			waitForPageLoadTill(9);
			Actions actions = new Actions(driver);
			waitForPageLoadTill(9);
			actions.moveToElement(reunificationforPrimaryGoal2).doubleClick().build().perform();
			
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "guardanship":
			logger.info("Selecting Primary 2 as :" + subtypeOption);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,450)");
			clickWebElement(primaryGoal2);
			waitForPageLoadTill(9);
			clickWebElement(guardianshipforPrimaryGoal2);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 2 as :" + subtypeOption);
			break;

		case "adoption":
			logger.info("Selecting Primary 2 as :" + subtypeOption);
			JavascriptExecutor jse3 = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse3.executeScript("window.scrollBy(0,450)");
			clickWebElement(primaryGoal2);
			clickWebElement(adoptionforPrimaryGoal2);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 2 as :" + subtypeOption);
			break;

		case "Applpa":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse2.executeScript("window.scrollBy(0,450)");
			clickWebElement(primaryGoal2);
			clickWebElement(applaforPrimaryGoal2);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 2 as :" + subtypeOption);
			break;

		default:
			logger.info("No seleted Primary 2");
			break;
		}

	}

	/**
	 *@author akash.a.gaurav
	 *Adding Narrative in second field
	 * 
	 * @throws AcisException
	 */
	public void setPermanencyNarrative2(String strText) throws AcisException {
		enterText(permanencyNarrative2, strText);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		logger.info("Selected Permanency Narrative for as:" + strText);
	}
	
	/**
	 * click next button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void clickNextButton() throws AcisException {
		logger.info("clicking next button on Permanency Plan");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		waitForElementClickable(nextButton);
//		scrollingToElementofAPage(nextButton);
//		clickWebElement(nextButton);
		waitForPageLoadTill(5);
		clickWebElement(permanencyNarrative);
		waitForPageLoadTill(5);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("clicked next button on Permanency Plan");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(serviceToChildrenTitle);
		logger.info("Services to the Child(ren)  Page loaded");
	}
	/*** Click Save For Later
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSaveForLater() throws AcisException {
		logger.info("Clicking on Save For Later");
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(saveForLater);
		//clickWebElement(saveForLater);
		waitForPageLoadTill(5);
		logger.info("Clicked on Save For Later");
	}
	
	/*** Click OK
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickOk() throws AcisException {
		logger.info("Clicking on OK Button");
		waitForPageLoad();
		clickWebElement(ok);
		waitForPageLoadTill(5);
		logger.info("Clicked on OK button");
	}
	
	/*** Click OmniScript is saved for later
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void omniscriptSaveForLater() throws AcisException {
		logger.info("Verify OmniScript is saved for later");
		waitForPageLoad();
		waitForElement(omniscriptSaveForLater);
		waitForPageLoadTill(5);
		logger.info("Verified OmniScript is saved for later");
	}
	
	/***Click On Next Button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void nextBtn() throws AcisException {
		logger.info("clicking next button on Permanency Plan");
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		logger.info("clicked next button on Permanency Plan");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(serviceToChildrenTitle);
		logger.info("Services to the Child(ren)  Page loaded");
	}
	
	
}
