package com.acis.automation.pages.caseplan;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class DecisionPage extends PageBase {

	public DecisionPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(DecisionPage.class);
	
	@FindBy(xpath="//*[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//*[text()='Next']")
	WebElement nextBtn;
	
	
	@FindBy(xpath="//button[@title='Close Safety Assessment']")
	WebElement closeSa;
	
	
	@FindBy(xpath="(//*[text()='Insights'])[last()-1]")
	WebElement insightTab;
	
	
	@FindBy(xpath="//div[text()='Case Person Duplicate Records']")
	WebElement errorDuplicate;
	
	@FindBy(xpath="//span[text()='It looks as if duplicates exist for this ']")
	WebElement errorDuplicateafterFirstPerson;
	
	
	@FindBy(xpath="(//tbody//button)[last()]")
	WebElement firstPerson;
	
	
	/***
	 * Clicking on Submit 
	 * @author Pallavi
	 * @throws AcisException 
	 */
	public void clickSubmit() throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		logger.info("Clicking on submit Button");
		clickWebElemntUsingJavascriptExecutor(submitButton);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on submit button");
	
		
	}
	
	/***
	 * Clicking on next button
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void clickNext() throws AcisException {
		waitForPageLoadTill(9);
		clickWebElement(nextBtn);
		logger.info("Clicked on next button");
	}
	
	/***
	 * @author akash.a.gaurav
	 * Closing the safety assesment
	 * @throws AcisException 
	 */
	
	public void closingSafetyAssesment() throws AcisException {
		waitForPageLoadTill(11);
		logger.info("Closing safety Assesment flow");
		clickWebElemntUsingJavascriptExecutor(closeSa);
		logger.debug("Closed Sa flow");
	}
	
	/***
	 * @author akash.a.gaurav
	 * Verifying error of duplicate
	 * @throws Exception 
	 * @throws AcisException 
	 */
	
	public void verifyErrorOfDuplicate(String str) throws Exception, AcisException {
		waitForPageLoad();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(6);
		jse.executeScript("window.scrollBy(0,-900)");
		waitForElementClickable(insightTab);
		clickWebElement(insightTab);
		driver.navigate().refresh();
		waitForPageLoadTill(6);
		verifyTextEquals(errorDuplicate, str);
		logger.info("Verified Error of duplicate in insight page");
	}
	
	
	/***
	 * @author akash.a.gaurav
	 * Verifying person after clicking second person
	 * @throws AcisException 
	 
	 */
	public void errorVerifyAfterSecodPerson(String str) throws AcisException {
		waitForElement(firstPerson);
		waitForPageLoadTill(5);
		logger.info("Clicking on first person link");
		clickWebElemntUsingJavascriptExecutor(firstPerson);
		logger.info("verifying person error of duplication");
		waitForPageLoadTill(5);
		verifyTextEquals(errorDuplicateafterFirstPerson, str);
		logger.info("Verfied error present");
		
		
	}
}
