package com.acis.automation.pages.investigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class InvestigationReviewsPage extends PageBase {

	public InvestigationReviewsPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(InvestigationReviewsPage.class);
	
	@FindBy(xpath = "//button[@name='Edit']")
	WebElement editButton;
	
	@FindBy(xpath = "//label/span[text()='Reviewed']/../..//span/input")
	WebElement checkReviewed;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement saveButton;
	
	
	/**
	 * Check Reviewed on InvestigationReviewed Page
	 * @author khushboo
	 */
	public void checkReviewedCheckBox() throws AcisException {
		switchToWindow();
		waitForElement(editButton);
		clickWebElement(editButton);
		waitForElement(saveButton);
		scrollingToElementofAPage(checkReviewed);
		clickWebElemntUsingJavascriptExecutor(checkReviewed);
		clickWebElement(saveButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		closeWindowsExceptParent();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Closed collateral Tab");
	
		
	}
	
	
}

