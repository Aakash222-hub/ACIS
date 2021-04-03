package com.acis.automation.pages.providermanagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;
public class ServiceContractPage extends PageBase {

	public ServiceContractPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Logger logger = LoggerFactory.getLogger(ServiceContractPage.class);

	@FindBy(xpath = "//*[text()='These required fields must be completed: Provider Agency Type']")
	WebElement errorMessage;

	@FindBy(xpath = "//*[text()='Provider Agency Type']//..//..//a]")
	WebElement providerAgencyType;

	@FindBy(xpath = "//*[text()='Provider Agency Type']//..//..//a[text()='Child Care']")
	WebElement providerAgencyTypeChildCare;

	@FindBy(xpath = "//a[text()='Related']")
	WebElement tabRelated;

	@FindBy(xpath = "(//div[text()='New'])[4]")
	WebElement btnNewServiceContract;

	@FindBy(xpath = "//*[text()='Contract Name']//..//..//input")
	WebElement textContractName;

	@FindBy(xpath = "//*[text()='Target Performance Measure 1']//..//..//input")
	WebElement tgtPerformanceMeasure1;

	@FindBy(xpath = "//*[text()='Target Performance Measure 2']//..//..//input")
	WebElement tgtPerformanceMeasure2;

	@FindBy(xpath = "//*[text()='Target Performance Measure 3']//..//..//input")
	WebElement tgtPerformanceMeasure3;

	@FindBy(xpath = "//*[text()='Actual Performance Measure 1']//..//..//input")
	WebElement actualPerformanceMeasure1;

	@FindBy(xpath = "//*[text()='Actual Performance Measure 2']//..//..//input")
	WebElement actualPerformanceMeasure2;

	@FindBy(xpath = "//*[text()='Actual Performance Measure 3']//..//..//input")
	WebElement actualPerformanceMeasure3;
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement btnSave;

	/*
	 * validate Error message by khushboo
	 * 
	 */
	public void checkErrorMessage() throws AcisException {
		logger.info("checking error message");
		waitForElement(errorMessage);
	}

	/*
	 * validate Error message by khushboo
	 * 
	 */
	public void providerAgencyType(String typeOption) throws AcisException {
		switch (typeOption) {
		case "Child Care":
			Actions act =new Actions(driver);
			act.sendKeys(Keys.END).build().perform();
			waitForPageLoad();
			scrollingToElementofAPage(providerAgencyType);
			clickWebElement(providerAgencyType);
			clickWebElement(providerAgencyTypeChildCare);
			waitForPageLoadTill(2);
			logger.info("Selected type as :" + typeOption);
			break;
		default:
			logger.info("no type available");
			break;
		}

	}

	public void clickOnTab() throws AcisException {
		logger.info("clicking on Related tab");
		clickWebElement(tabRelated);
		logger.info("clicked on Related tab");

	}

	/*
	 * click on serviceContract by khushboo
	 * 
	 * 
	 */
	public void clickonNewServiceContract() throws AcisException {
		logger.info("clicking on New butom of Service Contract ");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(btnNewServiceContract);
		clickWebElemntUsingJavascriptExecutor(btnNewServiceContract);
		waitForPageLoadTill(5);
		logger.info("clicked on New buutom of Service Contract ");
	}

	/*
	 * click on textarea of contract Name by khushboo
	 * 
	 * 
	 */
	public void textareaContractName(String txtarea) throws AcisException {
		clickWebElemntUsingJavascriptExecutor(textContractName);
		enterTextUsingJavascript(textContractName, txtarea);
	}

	/*
	 * Actual and Target Performance by khushboo
	 * 
	 * 
	 */
	public void selectPerformance(String measure) throws AcisException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(tgtPerformanceMeasure1);

		switch (measure) {
		case "Target Performance Measure 1":
			clickWebElement(tgtPerformanceMeasure1);
			enterText(tgtPerformanceMeasure1, "target 1");
			break;
		case "Target Performance Measure 2":
			clickWebElement(tgtPerformanceMeasure2);
			enterText(tgtPerformanceMeasure2, "target 2");
			break;
		case "Target Performance Measure 3":

			clickWebElement(tgtPerformanceMeasure3);
			enterText(tgtPerformanceMeasure3, "target 3");
			break;
		case "Actual Performance Measure 1":
			clickWebElement(actualPerformanceMeasure1);
			enterText(actualPerformanceMeasure1, "Actual 1");
			break;
		case "Actual Performance Measure 2":
			clickWebElement(actualPerformanceMeasure2);
			enterText(actualPerformanceMeasure2, "Actual 2");
			break;
		case "Actual Performance Measure 3":
			clickWebElement(actualPerformanceMeasure3);
			enterText(actualPerformanceMeasure3, "Actual 3");
			break;
		default:
			logger.info("No measure match");

		}
		
	}
	/*
	 * click on save button by khushboo
	 * 
	 */
	public void saveButton() throws AcisException {
		logger.info("click on save button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(btnSave);
		clickWebElement(btnSave);
		logger.info("clicked on save button");

	}

}
