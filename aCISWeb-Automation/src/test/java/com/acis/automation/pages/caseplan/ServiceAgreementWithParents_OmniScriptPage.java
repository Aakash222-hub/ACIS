package com.acis.automation.pages.caseplan;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.helpers.Loader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ServiceAgreementWithParents_OmniScriptPage	 extends PageBase {

	public ServiceAgreementWithParents_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Log logger = LogFactory.getLog(ServiceAgreementWithParents_OmniScriptPage.class);

	@FindBy(xpath = "(//*[text()='Parent']/../../..//input)[last()]")
	WebElement parent;

	@FindBy(xpath = "//*[text()='Parent Narrative']/../..//textarea")
	WebElement parentNarrative;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//h1[text()='Visitation Plan(s)']")
	WebElement visitationPlanTitle;
	
	/**
	 * Owner : Dharmesh Krishna
	 * Description: Set Parent For on Service Agreement With Parents Page
	 * @throws AcisException 
	 */
	public void setParent(String strText) throws AcisException {
		logger.info("Selecting Parent as:"+strText);
		waitForElementClickable(parent);
		enterText(parent, strText);
		waitForElementClickable(driver.findElement(By.xpath("//span[contains(text(),'"+strText+"']")));
		clickWebElement(driver.findElement(By.xpath("//span[contains(text(),'"+strText+"']")));
		logger.info("Selected Parent as:"+strText);	
	}
	
	/**
	 * Owner : Dharmesh Krishna
	 * Description: Set Parent Narrative on Service Agreement With Parents Page
	 * @throws AcisException 
	 */
	public void setParentNarrative(String strText) throws AcisException {
		logger.info("Selecting Parent Narrative for as:"+strText);
		enterText(parentNarrative, strText);
		logger.info("Selected Parent Narrative for as:"+strText);	
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
		waitForElement(visitationPlanTitle);
		logger.info("Visitation Plan(s)  Page loaded");
	}
}
