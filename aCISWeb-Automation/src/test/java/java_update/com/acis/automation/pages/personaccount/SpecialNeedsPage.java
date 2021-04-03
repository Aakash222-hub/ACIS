package com.acis.automation.pages.personaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class SpecialNeedsPage extends PageBase {

	public SpecialNeedsPage() throws AcisException {
		super();
	}

	// TODO Auto-generated constructor stub
	final static Logger logger = LoggerFactory.getLogger(SpecialNeedsPage.class);

	@FindBy(xpath = "//*[text()='Special Needs']//.//..//..//..//..//..//..//*[text()='New']")
	WebElement btnNewSpecialNeeds;

	@FindBy(xpath = "(//*[text()='Clinically diagnosed disability(ies)?'])[last()]//..//input")
	WebElement disabilities;

	@FindBy(xpath = "(//*[text()='Clinically diagnosed disability(ies)?'])[last()]//..//*[text()='Yes']")
	WebElement btnYes;

	@FindBy(xpath = "(//*[text()='Type'])[last()]//..//input")
	WebElement Type;

	@FindBy(xpath = "//*[text()='Type']//..//..//*[text()='Mental Retardation']")
	WebElement typeMentalRetardation;

	@FindBy(xpath = "(//*[text()='Save'])[last()]")
	WebElement btnSave;

	/*
	 * click on new button of Special needs
	 * 
	 * @khushboo
	 */
	public void clickNewButton() throws AcisException {
		logger.info("clicking on New Button");
		waitForPageLoad();
		clickWebElement(btnNewSpecialNeeds);
		waitForPageLoad();
		logger.info("clicked on New Button");
	}

	/*
	 * select clinically diagnosed disabilities
	 * 
	 * @khushboo
	 * 
	 */
	public void selectDisablities() throws AcisException {
		logger.info("clicking on disabilities ");
		clickWebElement(disabilities);
		clickWebElement(btnYes);
		logger.info("clicked on disabilities ");

	}

	/*
	 * click on type
	 * 
	 * @khushboo
	 */
	public void selectType() throws AcisException {
		logger.info("selecting  type ");
		clickWebElement(Type);
		clickWebElement(typeMentalRetardation);
		logger.info("selected  type ");

	}

	/*
	 * click on save button
	 * 
	 * @khushboo
	 * 
	 */
	public void clickOnSavebtn() throws AcisException {
		logger.info("clicking on save button");
		clickWebElement(btnSave);
		logger.info("clicked on save button");
	}
}
