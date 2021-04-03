package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CaseClosureDecisionPage  extends PageBase{

	public CaseClosureDecisionPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(CaseClosureDecisionPage.class);

	
	@FindBy(xpath = "//h1[text()='Case Closure Decision']")
	WebElement caseClosureDecisionTitle;
	

	@FindBy(xpath = "//*[text()='Worker Comments']/../../..//textarea")
	WebElement workerCommentsTextbox;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;

	
	/**
	 * Click on Submit Button
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickSubmitbtn() throws AcisException {
		logger.info("Clicking on Submit button");
		scrollingToElementofAPage(submitButton);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		try {
			clickWebElement(submitButton);
		} catch (Exception e) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,940)");
		clickWebElemntUsingJavascriptExecutor(submitButton);
		}
		waitForPageLoadTill(5);
		logger.info("Case close Flow has been submitted");
	}
	
	/**
	 * Enter Text Box : WorkerComments
	 * @author mrunal.s.tilekar
	 * 
	 * @throws AcisException
	 */
	public void enterTextFieldValue( String strValue) throws AcisException {
		logger.info("Entering Worker Comment as: " + strValue);
		waitForPageLoad();
		enterText(workerCommentsTextbox, strValue);
		waitForPageLoadTill(5);
		logger.info("Worker Comment entered as: " + strValue);
		waitForPageLoadTill(5);
	}
}
