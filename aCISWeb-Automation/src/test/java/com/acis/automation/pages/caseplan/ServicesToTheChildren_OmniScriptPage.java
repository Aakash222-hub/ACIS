package com.acis.automation.pages.caseplan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ServicesToTheChildren_OmniScriptPage extends PageBase {

	public ServicesToTheChildren_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ServicesToTheChildren_OmniScriptPage.class);

	@FindBy(xpath = "(//*[text()='Child']/../../..//input)[last()]")
	WebElement child;

	@FindBy(xpath = "(//*[text()='Is there a plan to move the child in the next 6 months?']/../../..//input)[last()]")
	WebElement placementPicklist;

	@FindBy(xpath = "(//*[text()='Is there a plan to move the child in the next 6 months?']/../../..//li//*[text()='Yes'])[last()]")
	WebElement yes;

	@FindBy(xpath = "(//*[text()='Is there a plan to move the child in the next 6 months?']/../../..//li//*[text()='No'])[last()]")
	WebElement no;

	@FindBy(xpath = "(// *[text()='Transition Plan']/../..//textarea)[last()]")
	WebElement transitionPlan;
	
	@FindBy(xpath = "(// *[text()='Health Narrative']/../..//textarea)[last()]")
	WebElement healthNarrative;
	
	@FindBy(xpath = "(// *[text()='Education Narrative']/../..//textarea)[last()]")
	WebElement educationNarrative;
	
	@FindBy(xpath = "(// *[text()='Mental Narrative']/../..//textarea)[last()]")
	WebElement mentalNarrative;
	
	@FindBy(xpath = "(// *[text()='Other Narrative']/../..//textarea)[last()]")
	WebElement otherNarrative;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//h1[text()='Service Agreement with Parent(s)']")
	WebElement serviceAgreementWithParentTitle;

	/**
	 * Owner : Dharmesh Krishna Description: Set Child on Services to the Children
	 * 
	 * @throws AcisException
	 */
	public void setPermanencyGoalsFor(String strText) throws AcisException {
		waitForElementClickable(child);
		enterText(child, strText);
		waitForElementClickable(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "']")));
		clickWebElement(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "']")));
		logger.info("Selected Child as:" + strText);
	}

	/**
	 * Select: Is there a plan to move the child in the next 6 months? picklist on
	 * Permanency Plan Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void placement(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "Yes":
			logger.info("Selecting Is there a plan to move the child in the next 6 months? as :" + subtypeOption);
			clickWebElement(placementPicklist);
			clickWebElement(yes);
			waitForPageLoadTill(2);
			logger.info("Selected Is there a plan to move the child in the next 6 months? as :" + subtypeOption);
			break;

		case "No":
			logger.info("Selecting Is there a plan to move the child in the next 6 months? as :" + subtypeOption);
			clickWebElement(placementPicklist);
			clickWebElement(no);
			waitForPageLoadTill(2);
			logger.info("Selected Is there a plan to move the child in the next 6 months? as :" + subtypeOption);
			break;

		default:
			logger.info("Is there a plan to move the child in the next 6 months? not found");
			break;
		}

	}

	/**
	 * Owner : Dharmesh Krishna Description: Set Text on Permanency Plan Page
	 * 
	 * @throws AcisException
	 */
	public void setText(String strText) throws AcisException {
		switch (strText) {
		case "transitionPlan":
			enterText(transitionPlan, strText);
			logger.info("Selected Permanency Narrative for as:" + strText);
			break;
		case "healthNarrative":
			enterText(healthNarrative, strText);
			logger.info("Selected Permanency Narrative for as:" + strText);
			break;
		case "educationNarrative":
			enterText(educationNarrative, strText);
			logger.info("Selected Permanency Narrative for as:" + strText);
			break;
		case "mentalNarrative":
			enterText(mentalNarrative, strText);
			logger.info("Selected Permanency Narrative for as:" + strText);
			break;
		case "otherNarrative":
			enterText(otherNarrative, strText);
			logger.info("Selected Permanency Narrative for as:" + strText);
			break;

		}

	}
	
	
	/**
	 * Select Child dropdown Value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectChildDropdown(String childName) throws AcisException {
		logger.info("Selecting Child dropdown Value");
		waitForPageLoadTill(5);
		clickWebElement(child);
		waitForElement(driver.findElement(By.xpath("(//span[contains(.,'"+ childName +"')])[2]")));
		clickWebElement(driver.findElement(By.xpath("(//span[contains(.,'"+ childName +"')])[2]")));
		logger.info("Selected Child dropdown Value");
		
	}
	
	/**
	 * click next button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void clickNextButton() throws AcisException {
		logger.info("clicking next button ");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("clicked next button ");
		waitForElement(serviceAgreementWithParentTitle);
		logger.info("Service Agreement with Parent(s)  Page loaded");
	}
}
