package com.acis.automation.pages.tdm;

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

public class InteractionDetailPage extends PageBase {

	public InteractionDetailPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(InteractionDetailPage.class);

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;
	
			@FindBy(xpath ="(//a[contains(text(),'C-00')])[2]")
			WebElement interactionId;
			
			@FindBy(xpath ="(//button[@title='Edit Date/Time']")
			WebElement editDateTime;
			
			@FindBy(xpath = "(//*[text()='Related'])")
			WebElement relatedTab;
	
			@FindBy(xpath = "(//*[text()='Related'])[2]")
			WebElement relatedTab1;
			
			@FindBy(xpath = "//*[text()='6:00 AM']")
			WebElement time;
			
			@FindBy(xpath = "//button[@title='Next Month']")
			WebElement nextMonth;
			
			@FindBy(xpath = "//*[text()='27']")
			WebElement date;
			
			@FindBy(xpath = "(//input[@name='ACIS_Date_Time__c'])[1]")
			WebElement dateTime;
	
			@FindBy(xpath = "(//button[text()='Edit'])[2]")
			WebElement editButton;
			
			@FindBy(xpath = "//span[text()='Case ID']/../..//a/span")
			WebElement caseIdLink;
			
	 /**
		 * click interaction id button
		 * @author priyanka wani
		 * @throws AcisException 
		 */
		
		 public void clickInteractionId() throws AcisException {
			  logger.info("Clicking on Interaction Id");
			  waitForPageLoad();
			  waitForElement(interactionId);
			  waitForPageLoadTill(10);
			  //waitForPageLoad();
			  clickWebElement(interactionId);
			  waitForPageLoadTill(5);
			  logger.info("Clicked on Interaction Id");
		  }
		 
		 /**
			 * click Edit button on Interaction Page
			 * @author priyanka wani
			 * @throws AcisException 
			 */
		 
		 
		 public void clickEditDateTimeButton() throws AcisException {

				logger.info("clicking on edit button on Date/Time");
				//waitForPageLoad();
				  waitForElement(editButton);
				clickWebElement(editButton);
				waitForPageLoadTill(5);
				// waitForElement(editCasePersonTitle);
				logger.info("clicked on edit button on Date/Time");
			}
		 
	
		
		public void clickSavebutton() throws AcisException {
			
			clickWebElement(saveButton);
			waitForPageLoadTill(10);
			logger.info("clicked on Save button");
		}
		
		public void clickcaseIdOnInteractionPage() throws AcisException {

			logger.info("clicking on Case Id on Interaction Page");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.HOME).build().perform();
			scrollingToElementofAPage(caseIdLink);
			clickWebElemntUsingJavascriptExecutor(caseIdLink);
			waitForPageLoadTill(5);
			waitForPageLoad();
			act.sendKeys(Keys.HOME).build().perform();
			logger.info("clicked on Case Id on Interaction Page");
		}
		public void clickSecondRelatedTab() throws AcisException {
			logger.info("Clicking on Related Tab");
			waitForElement(relatedTab1);
			clickWebElemntUsingJavascriptExecutor(relatedTab1);
			waitForPageLoad();
			waitForPageLoadTill(5);
			logger.info("Clicked on Related Tab");

		}
		public void clickRelatedTab() throws AcisException {
			waitForPageLoadTill(5);
			logger.info("Clicking Related Tab ");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.HOME).build().perform();
			//scrollingToElementofAPage(relatedTab);
			clickWebElemntUsingJavascriptExecutor(relatedTab);
			//driver.navigate().refresh();
			waitForPageLoadTill(5);
			waitForPageLoad();
		
			logger.info("Clicked Related Tab");
			waitForPageLoadTill(5);
		}
		
		/**
		 * Select  next month date time
		 * @author priyanka
		 * @throws AcisException 
		 */
		public void selectDateTime() throws AcisException {
			logger.info("Selecting Date Time");
			waitForElement(dateTime);
			clickWebElement(dateTime);
			waitForElement(date);
			//clickWebElement(nextMonth);
			
			clickWebElement(date);
			waitForPageLoadTill(5);
			logger.info("Date succesfully selected");
		}

}
