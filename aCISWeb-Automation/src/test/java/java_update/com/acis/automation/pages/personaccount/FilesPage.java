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

public class FilesPage  extends PageBase{

	public FilesPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(FilesPage.class);
	
	
	@FindBy(xpath = "(//DIV[@title='Add Files'][text()='Add Files'][text()='Add Files'])[2]")
	WebElement addFilesButton;
	
	@FindBy(xpath = "//*[text()='Select Files']")
	WebElement selectFilesTitle;
	
	@FindBy(xpath = "//button//span[text()='Upload Files']")
	WebElement uploadFilesButton;
	
	@FindBy(xpath = "//button//span[text()='Done']")
	WebElement doneButton;
	
	@FindBy(xpath = "//span[contains(text(),'Sorted by Last Modified')]")
	WebElement sortedByLastModified;
	
	@FindBy(xpath = "(//tbody//tr//th//a//span)[3]")
	WebElement firstRecordFileName;
	
	@FindBy(xpath = "//span[@title='Last Modified']")
	WebElement lastModifiedTitleTable;
	
	@FindBy(xpath = "(//a//span[text()='Show Actions'])[1]")
	WebElement firstArrowButton;
	
	@FindBy(xpath = "//a[@title='Delete']")
	WebElement arrowDeleteButton;
	
	@FindBy(xpath = "//button[@title='Delete']")
	WebElement deleteButton;
	
	public By lastModifiedDescendingOrder = By.xpath("//span[text()='Last Modified']/../..//span[contains(text(),'Descending')]");
	
	public By lastModifiedAscendingOrder = By.xpath("//span[text()='Last Modified']/../..//span[contains(text(),'Ascending')]");

	
	
	
	
	/**
	 * Click on Add Files button and click on upload file button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		
		driver.navigate().refresh();
		waitForPageLoad();
		waitForElement(addFilesButton);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(addFilesButton);
		waitForPageLoadTill(5);
		waitForElement(selectFilesTitle);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		
		//uploadFileUsingRobot("C:\\Users\\mrunal.s.tilekar\\Desktop\\demo doc.txt");
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
	//	waitForElement(doneButton);
	//	clickWebElement(doneButton);
		logger.info("file uploaded successfully");
	}
	
	/**
	 * Verfiy recently file uploaded 
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyFileUploaded(String fileName) throws AcisException {
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		sortLastModifiedColumn("Descedning");
		Assert.assertTrue((driver.findElement(By.xpath("(//span[@title='"+fileName+"'])[1]")).getText().trim()).equalsIgnoreCase(fileName), "Error:"+fileName+" File is Not uploaded");
		logger.info("Verified file name uploaded successfully");
	}
	
	
	/**
	 * Sort table by last modified
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void sortLastModifiedColumn( String order) throws AcisException {
		
		switch (order) {
		case "Ascending":
			while (isElementPresent(lastModifiedAscendingOrder)==false) {
				clickWebElemntUsingJavascriptExecutor(lastModifiedTitleTable);
				waitForPageLoadTill(5);	
			}
			Assert.assertTrue(sortedByLastModified.isDisplayed(), "Error: Not able to sort by last modified");
			logger.info("last modified column sorted by Ascending order");
			
			break;
			
		case "Descedning":
			
			while (isElementPresent(lastModifiedDescendingOrder)==false) {
				clickWebElemntUsingJavascriptExecutor(lastModifiedTitleTable);
				waitForPageLoadTill(5);
			}
			Assert.assertTrue(sortedByLastModified.isDisplayed(), "Error: Not able to sort by last modified");
			logger.info("last modified column sorted by Descedning order");
			break;

		default:
			logger.info("No matching order text");
			break;
		}	
	}
	
	/**
	 * Delete file
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void deleteFiles(String filename) throws AcisException {
		logger.info("deleting files");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//*[text()='"+filename+"']/ancestor::th/following-sibling::*//a[@role='button'])[1]")));
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(arrowDeleteButton);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(deleteButton);
		waitForPageLoadTill(5);
		logger.info("deleted files");
	}
	
}
