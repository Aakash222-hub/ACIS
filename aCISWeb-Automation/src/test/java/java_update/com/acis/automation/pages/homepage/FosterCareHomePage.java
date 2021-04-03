package com.acis.automation.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.casemanagement.CaseActionPage;
import com.acis.automation.utilities.AcisException;

public class FosterCareHomePage extends PageBase {

	public FosterCareHomePage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CaseActionPage.class);

	@FindBy(xpath = "//*[text()='Permanency Tool']")
	WebElement permanecyTool;
	
	/**
	 * check Permanency Tool label
	 * @author mrunal.s.tilekar
	 */
	public void checkPermanencyLabel() {
		logger.info("checking Permanency Tool label");
		waitForPageLoad();
		waitForPageLoadTill(5);
		Assert.assertTrue(permanecyTool.isDisplayed(), "Error : No Permanency Tool label");
		logger.info("checking Permanency Tool label");
	}

	/**
	 * Check reunification label for child
	 * @author mrunal.s.tilekar
	 */
	public void checkReunification(String childName) {
		logger.info("Checking reunification label for child");
		waitForPageLoad();
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='"+childName+"']//ancestor::td/following-sibling::td//*[text()='Reunification']"))).isDisplayed(), 
				"Error : No Reunification text present for child name : " + childName);
		logger.info("Checked reunification label for child");
	}
}
