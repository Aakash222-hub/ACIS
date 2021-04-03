package com.acis.automation.pages.personaccount;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class InsightsPage  extends PageBase{

	public InsightsPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(InsightsPage.class);
	
	
	
	@FindBy(xpath = "//*[text()='Person Relationships']")
	WebElement personRelationshipsLabel;
	
	@FindBy(xpath = "//iframe[@title='Vlocity Layout']")
	WebElement iframeRelationship;
	
	@FindBy(xpath = "//*[text()='New Relationship']")
	WebElement newRelationshipButton;
	
	
	@FindBy(xpath = "//h1[text()='Person Relationship']")
	WebElement personRelationshipsTitle;
	
	
	/**
	 * Verify Relationship on Person Management Insight
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void verifyRelationship(String person,String relationship,String relatedTo) throws AcisException {
		switchToFrameByWebElement(iframeRelationship);
		waitForElement(personRelationshipsLabel);
		waitForPageLoadTill(20);
		logger.info("Verifying the Relationship on Person Account");
		waitForElement(driver.findElement(By.xpath("//tbody//td[text()='"+person+"']")));
		waitForElement(driver.findElement(By.xpath("//tbody//td[text()='"+relationship+"']")));
		waitForElement(driver.findElement(By.xpath("//tbody//td[text()='"+relatedTo+"']")));
		logger.info("Verifyied the Relationship on Person Account");
	}
	
	/**
	 * Click New Relationship button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickNewRelationship() throws AcisException {
		logger.info("clicking new relationship button");
		waitForPageLoad();
		waitForPageLoadTill(10);
		waitForElement(iframeRelationship);
		switchToFrameByWebElement(iframeRelationship);
		waitForElement(newRelationshipButton);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(newRelationshipButton);
		switchToDefaultContent();
		waitForElement(personRelationshipsTitle);
		logger.info("clicked new relationship button");
	}
	
}
