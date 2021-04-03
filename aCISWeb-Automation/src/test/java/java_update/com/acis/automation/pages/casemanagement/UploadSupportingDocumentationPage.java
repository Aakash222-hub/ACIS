package com.acis.automation.pages.casemanagement;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class UploadSupportingDocumentationPage extends PageBase {

	public UploadSupportingDocumentationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(UploadSupportingDocumentationPage.class);

	@FindBy(xpath = "//h1[contains(text(),'Upload Supporting Documentation')]")
	WebElement uploadSupportingDocumentationTitle;
	
	@FindBy(xpath = "//span[contains(text(),'Upload Files')]")
	WebElement uploadFilesButton;

	
	@FindBy(xpath = "//*[text()='File Name']/../../..//input")
	WebElement fileNameTextBox;

	
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//h1[text()='Case Closure Decision']")
	WebElement caseClosureDecisionTitle;
	
	
	/**
	 * Click on Next Button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickNextBtn() throws AcisException, InterruptedException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Next button");
		waitForElement(caseClosureDecisionTitle);
		logger.info("Case Closure Decision  Page loaded");

	}

	
	/**
	 * Delete the particular file
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void deleteFileUploaded(String fileName) throws AcisException {
		logger.info("Deleting the file : " + fileName);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//*[contains(text(),'"+fileName+"')]/..//span[text()='Delete']/..")));
		waitForPageLoadTill(5);
		logger.info("Deleted the file : " + fileName);
	}
	
	/**
	 * Upload file
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 */
	public void uploadSupportFile(String filepath) throws InterruptedException, AWTException, AcisException{
		logger.info("Upload file : " + filepath);
		waitForPageLoadTill(5);
		waitForElement(uploadFilesButton);
		clickWebElement(uploadFilesButton);
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
		logger.info("file uploaded successfully");
	}
}
