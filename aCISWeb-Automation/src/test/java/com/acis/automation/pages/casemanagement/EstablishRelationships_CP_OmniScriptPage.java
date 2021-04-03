package com.acis.automation.pages.casemanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import com.acis.automation.library.PageBase;
import com.acis.automation.pages.investigation.EstablishRelationships_IP_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class EstablishRelationships_CP_OmniScriptPage extends PageBase {

	public EstablishRelationships_CP_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(EstablishRelationships_IP_OmniScriptPage.class);

	//Dharmesh

		@FindBy(xpath = "(//button[text()='Create/Add'])[1]")
		WebElement createAddButton;

		@FindBy(xpath = "(//*[text()='Person']/../../..//input)[last()]")
		WebElement personTextbox;

		@FindBy(xpath = "(// label[text()='Relationship']/../../..//input[@required])[last()]")
		WebElement relationshipTextBox;
		
		@FindBy(xpath = "(//span[text()='Related To']/../../..//input)[last()]")
		WebElement relatedToTextBox;
		
		
		@FindBy(xpath = "(//label[text()='Start Date']/../../..//input)[last()]")
		WebElement startDatePicker;
		
		@FindBy(xpath = "(//label[text()='End Date']/../../..//input)[last()]")
		WebElement endDatePicker;

		@FindBy(xpath = "//span[text()='20']")
		WebElement startDate;

		@FindBy(xpath = "(//span[text()='25'])[last()]")
		WebElement endDate;

		@FindBy(xpath = "(//button[text()='Save'])[1]")
		WebElement save;
		
		@FindBy(xpath = "//button[text()='Submit']")
		WebElement submitButton;
		
		@FindBy(xpath = "(//button[text()='Create/Add'])[2]")
		WebElement createAddButtonPlacementRealtiosnhip;
		
		@FindBy(xpath = "(//*[text()='Placement Resource']/../../..//input)[last()]")
		WebElement placementResourceTextbox;

		@FindBy(xpath = "(// label[text()='Relationship']/../../..//input[@required])[last()]")
		WebElement placementRelationshipTextBox;
		
		@FindBy(xpath = "(//span[text()='Related To']/../../..//input)[last()]")
		WebElement placementrelatedToTextBox;
		
		
		@FindBy(xpath = "(//label[text()='Start Date']/../../..//input)[last()]")
		WebElement placementStartDatePicker;
		
		@FindBy(xpath = "(//label[text()='End Date']/../../..//input)[last()]")
		WebElement placementEndDatePicker;

		@FindBy(xpath = "//span[text()='20']")
		WebElement placementStartDate;

		@FindBy(xpath = "(//span[text()='25'])[last()]")
		WebElement placementEndDate;

		@FindBy(xpath = "Placement Resource Relationships")
		WebElement placementSaveButton;
		


		
		/**
		 * Click on Create/Add button
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 * @throws InterruptedException 
		 */
		public void clickCreateAddButton() throws AcisException, InterruptedException {
			logger.info("Clicking on Create/Add button");
			waitForPageLoad();
			waitForPageLoadTill(5);
			waitForElement(createAddButton);
			clickWebElement(createAddButton);
			logger.info("Clicked on Create/Add button");
			waitForPageLoadTill(5);
		}
		
		/**
		 * Set  Person and Related To TextBox on Establish Relationship Page
		 * @author mrunal.s.tilekar
		 * @throws AcisException
		 * @throws InterruptedException
		 */
		public void searchText(String str, String Option) throws AcisException {
			switch (Option) {
			case "Person":
				logger.info(" Case Person Setting as: " + str);
				clickWebElemntUsingJavascriptExecutor(personTextbox);
				waitForPageLoadTill(5);
				waitForElement(driver.findElement(By.xpath("(//span[text()='Person']/../../..//span[contains(text(),'" + str + "')])[last()]")));
				clickWebElement(driver.findElement(By.xpath("(//span[text()='Person']/../../..//span[contains(text(),'" + str + "')])[last()]")));
				logger.info(" Case Person Selected as: " + str);
				break;
			case "Related":
				logger.info(" Related to Setting as: " + str);
				clickWebElemntUsingJavascriptExecutor(relatedToTextBox);
				waitForPageLoadTill(5);
				waitForElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[contains(text(),'" + str + "')])[last()]")));
				clickWebElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[contains(text(),'" + str + "')])[last()]")));
				logger.info(" Related to Selected as: " + str);
				break;

			}
			waitForPageLoadTill(5);
		}
		
		/**
		 * Set Start Date and End Date on Establish Relationships Page
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void setDate(String option) throws AcisException
		{
			switch(option)
			{
			case "Start":
				logger.info("Setting Start Date");
				waitForElementClickable(startDatePicker);
				clickWebElement(startDatePicker);
				waitForElementClickable(startDate);
				clickWebElement(startDate);
				
				logger.info("Successfully set Start Date");
				break;
			case "End":
				logger.info("Setting End Date");
				waitForElementClickable(endDatePicker);
				clickWebElement(endDatePicker);
				waitForElementClickable(endDate);
				clickWebElement(endDate);
				logger.info("Successfully set End Date");
				break;
			default:
				logger.info(option + " Date not found");
				break;
			}
			
		}
		
		/**
		 * set Relationship on Establish RelationShips Page
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 * @throws InterruptedException 
		 */
		public void setRelationShip(String option) throws AcisException, InterruptedException {
			logger.info(" Relationship Setting as: " + option);
			enterText(relationshipTextBox, option);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("//span[text()='" + option + "']")));
			clickWebElement(driver.findElement(By.xpath("//span[text()='" + option + "']")));
			logger.info(" Relationship Selected as: " + option);
			
		}
		
		/**
		 * Click on save button
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 * @throws InterruptedException 
		 */
		public void clickSaveButton(String option) throws AcisException, InterruptedException {
			logger.info("Clicking on save button");
			clickWebElemntUsingJavascriptExecutor(save);
			logger.info("Clicked on save button");
			waitForPageLoadTill(5);
			
		}
		
		
		/***
		 * clicking submit button
		 * @author akash.a.gaurav
		 * @throws AcisException 
		 */
			
			public void clickSubmit() throws AcisException {

				Actions actions = new Actions(driver);
				waitForPageLoadTill(9);
				actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
				waitForPageLoadTill(9);
				clickWebElement(submitButton);
				waitForPageLoadTill(9);
			}
			
			/**
			 * Click on Create/Add button of Placement Resource Relationships
			 * @author mrunal.s.tilekar
			 * @throws AcisException 
			 * @throws InterruptedException 
			 */
			public void clickCreateAddButtonPlacementResourceRelationships() throws AcisException, InterruptedException {
				logger.info("Clicking on Create/Add button of Placement Resource Relationships");
				waitForPageLoad();
				waitForPageLoadTill(5);
				waitForElement(createAddButtonPlacementRealtiosnhip);
				clickWebElement(createAddButtonPlacementRealtiosnhip);
				logger.info("Clicked on Create/Add button of Placement Resource Relationships");
				waitForPageLoadTill(5);
			}
			
			/**
			 * Set  Person and Related To TextBox on Establish Relationship Page for Placement Resource Relationships
			 * @author mrunal.s.tilekar
			 * @throws AcisException
			 * @throws InterruptedException
			 */
			public void searchTextPlacementResourceRelationships(String str, String Option) throws AcisException {
				switch (Option) {
				case "Placement Resource":
					logger.info(" Placement Resource  Setting as: " + str);
					clickWebElemntUsingJavascriptExecutor(placementResourceTextbox);
					waitForPageLoadTill(5);
					waitForElement(driver.findElement(By.xpath("(//span[text()='Placement Resource']/../../..//span[contains(text(),'" + str + "')])[last()]")));
					clickWebElement(driver.findElement(By.xpath("(//span[text()='Placement Resource']/../../..//span[contains(text(),'" + str + "')])[last()]")));
					logger.info(" Case Person Selected as: " + str);
					break;
				case "Related":
					logger.info(" Related to Setting as: " + str);
					clickWebElemntUsingJavascriptExecutor(relatedToTextBox);
					waitForPageLoadTill(5);
					waitForElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[contains(text(),'" + str + "')])")));
					clickWebElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[contains(text(),'" + str + "')])")));
					logger.info(" Related to Selected as: " + str);
					break;

				}
				waitForPageLoadTill(5);
			}
			
			/**
			 * Set Start Date and End Date on Establish Relationships Page of Placement Resource Relationships
			 * @author Dharmesh Krishna
			 * @throws AcisException 
			 */
			public void setDatePlacementResourceRelationships(String option) throws AcisException
			{
				switch(option)
				{
				case "Start":
					logger.info("Setting Start Date");
					waitForElementClickable(placementStartDatePicker);
					clickWebElement(placementStartDatePicker);
					waitForElementClickable(placementStartDate);
					clickWebElement(placementStartDate);
					
					logger.info("Successfully set Start Date");
					break;
				case "End":
					logger.info("Setting End Date");
					waitForElementClickable(placementEndDatePicker);
					clickWebElement(placementEndDatePicker);
					waitForElementClickable(placementEndDate);
					clickWebElement(placementEndDate);
					logger.info("Successfully set End Date");
					break;
				default:
					logger.info(option + " Date not found");
					break;
				}
				
			}
			
			/**
			 * set Relationship on Establish RelationShips Page
			 * @author Dharmesh Krishna
			 * @throws AcisException 
			 * @throws InterruptedException 
			 */
			public void setRelationShipPlacementResourceRelationships(String option) throws AcisException, InterruptedException {
				logger.info(" Relationship Setting as: " + option);
				enterText(placementRelationshipTextBox, option);
				waitForPageLoadTill(5);
				waitForElement(driver.findElement(By.xpath("(//*[contains(text(),'"+option+"')])[2]")));
				clickWebElement(driver.findElement(By.xpath("(//*[contains(text(),'"+option+"')])[2]")));
				logger.info(" Relationship Selected as: " + option);
				
			}
			
			/**
			 * Click on save button of Placement Resource Relationships
			 * @author Dharmesh Krishna
			 * @throws AcisException 
			 * @throws InterruptedException 
			 */
			public void clickSaveButtonPlacementResourceRelationships() throws AcisException, InterruptedException {
				logger.info("Clicking on save button");
				clickWebElemntUsingJavascriptExecutor(placementSaveButton);
				logger.info("Clicked on save button");
				waitForPageLoadTill(5);
				
			}
			
			
		

}
