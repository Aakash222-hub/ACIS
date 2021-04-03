package com.acis.automation.pages.tdm;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ReviewEditSendPage  extends PageBase{

	public ReviewEditSendPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

final static Logger logger = LoggerFactory.getLogger(ReviewEditSendPage.class);
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;
	
	
	/**
	 * click submit button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSubmitButton() throws AcisException {
		logger.info("Clicking on submit button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(submitButton);
		scrollingToElementofAPage(submitButton);
		clickWebElement(submitButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on submit button");
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("Successfully clicked on submit button");
		
	}
	
	/**
	 * close window
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeWindow() throws AcisException {
		logger.info("Closing Windows");
		closeWindowsExceptParent();
		logger.info("Closed Windows");
		
	}
	
	
	
}
