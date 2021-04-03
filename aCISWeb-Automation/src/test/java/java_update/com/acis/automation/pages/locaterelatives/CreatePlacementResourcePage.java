package com.acis.automation.pages.locaterelatives;

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

public class CreatePlacementResourcePage extends PageBase {

	public CreatePlacementResourcePage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CreatePlacementResourcePage.class);

	@FindBy(xpath = "//input[@data-value='No']")
	WebElement createPlacement;

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement yes;

	@FindBy(xpath = "//span[text()='No']")
	WebElement no;
	
	@FindBy(xpath = "//*[text()='Parent 1']/../../..//input")
	WebElement parent1;

	@FindBy(xpath = "//*[text()='Parent 2']/../../..//input")
	WebElement parent2;

	@FindBy(xpath = "//span[text()='Would you like to use the primary address for parent 1 as address for placement resource account?']")
	WebElement sameAddressCheckBox;
	
	@FindBy(xpath = "//button/*[text()='Submit']")
	WebElement submitButton;
	
	/**
	 * Select Parent
	 * 
	 * @throws AcisException
	 */
	public void selectParent(String strText,String parent) throws AcisException {
		Actions action = new Actions(driver);
		switch (parent) {
		case "Parent 1":
			clickWebElement(parent1);
			waitForPageLoadTill(5);
			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "')]"))).click().perform();
			logger.info("Selected CheckBox: " + strText);
			break;
		case "Parent 2":
			clickWebElement(parent2);
			waitForPageLoadTill(5);
			action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'" + strText + "')]"))).click().perform();
			logger.info("Selected CheckBox: " + strText);
			break;
		default:
			logger.info(strText + " CheckBox not found");
			break;
		}

	}

	/***
	 * @author Select Are you ready to create a placement resource account
	 * @throws AcisException
	 */
	public void selectPlacementCreate(String str) throws AcisException {
		clickWebElement(createPlacement);
		switch (str) {
		case "Yes":
			clickWebElement(yes);
			logger.info("Selected : " + str);
			break;
		case "No":
			clickWebElement(no);
			logger.info("Selected : " + str);
			break;
		default:
			logger.info(str + " not found");
			break;
		}
	}

	/**
	 * click next button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void selectAddressSame() throws AcisException {
		logger.info("Clicking on Next button");
		clickWebElement(sameAddressCheckBox);
		logger.info("Select Meeting Location  Page loaded");
	}
	
	/**
	 * click Submit button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void clickSubmitButton() throws AcisException {
		logger.info("Clicking on Submit button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(submitButton);
		scrollingToElementofAPage(submitButton);
		clickWebElement(submitButton);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on Submit button");
	}
}
