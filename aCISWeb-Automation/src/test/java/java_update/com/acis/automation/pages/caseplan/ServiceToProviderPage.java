package com.acis.automation.pages.caseplan;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ServiceToProviderPage extends PageBase {

	public ServiceToProviderPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ServiceToProviderPage.class);
	
	@FindBy(xpath = "(//*[text()='Add Parental Visitation Plan?']/../../..//input)[last()]")
	WebElement addParentalVisitation;

	@FindBy(xpath = "(//*[text()='Add Parental Visitation Plan?']/../../..//li//*[text()='Yes'])[last()]")
	WebElement addParentalYes;
	
	@FindBy(xpath = "(//*[text()='Add Parental Visitation Plan?']/../../..//li//*[text()='No'])[last()]")
	WebElement addParentalNo;


	@FindBy(xpath = "(//*[text()='Add Parental Visitation Plan?']/../../..//li//*[text()='N/A'])[last()]")
	WebElement addParentalNA;

	@FindBy(xpath="(//label[text()='Provider']//..//..//input)[1]")
	WebElement providertextArea;
	
	@FindBy(xpath="(//label[text()='Child']//..//..//input)[1]")
	WebElement ChildTextArea;
	
	@FindBy(xpath="	")
	WebElement NarrativeTextArea;

	@FindBy(xpath = "(//*[text()='Add Sibling Visitation Plan?']/../../..//input)[last()]")
	WebElement addSiblingVisitation;
	
	@FindBy(xpath="(//*[text()='Add Sibling Visitation Plan?']/../../..//li//*[text()='Yes'])[last()]")
	WebElement addSiblingYes;
	
	@FindBy(xpath="(//*[text()='Add Sibling Visitation Plan?']/../../..//li//*[text()='No'])[last()]")
	WebElement addSiblingNo;
	
	@FindBy(xpath="(//*[text()='Add Sibling Visitation Plan?']/../../..//li//*[text()='N/A'])[last()]")
	WebElement addSiblingNA;
	
	@FindBy(xpath="//*[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//*[text()='Active Case Plan']")
	WebElement activeCasePlan;
	
	@FindBy(xpath="(//span[text()='Case Plans'])[2]")
	WebElement caseplanTab;
	
	@FindBy(xpath="(//*[contains(text(),'CP-')]/../../..//button[@class='slds-button slds-button_icon slds-button_icon-x-small slds-button_icon-container'])[5]")
	WebElement closeCase1;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;
	

	/**
	 *Entering text in parental and sibling visitations
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void enterText(String subtypeOption, String strValue) throws AcisException {

		switch (subtypeOption) {
		case "ChildParental":
			logger.info("Entering Text in child Service to Provider :"+subtypeOption);
			waitForElement(ChildTextArea);
			enterText(ChildTextArea, strValue);
			logger.info("Entered in child Service to Provider :"+subtypeOption);
			break;

		case "ProvidertextArea":
			logger.info("Entering Text in Parent in child Service to Provider :"+subtypeOption);
			waitForElement(providertextArea);
			enterText(providertextArea, strValue);
			logger.info("Entered text in in provider text area Service to Provider:"+subtypeOption);
			break;

		case "NarrativeParental":
			logger.info("Entering Text in  Narrative visitaions :"+subtypeOption);
			waitForElement(NarrativeTextArea);
			enterText(NarrativeTextArea, strValue);
			logger.info("Entered text in Narrative as :"+subtypeOption);
			break;
			
		default:
			logger.info("No seleted Text Area 1");
			break;
			}}

		/***
		 * Clicking on Next and navigate 
		 * @author akash.a.gaurav
		 * @throws AcisException 
		 */
		public void clickSubmit() throws AcisException {
			waitForPageLoad();
			waitForPageLoadTill(9);
			Actions actions = new Actions(driver);
			waitForPageLoadTill(9);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			logger.info("Clicking on submit Button");
			clickWebElemntUsingJavascriptExecutor(submitButton);
			waitForPageLoad();
			waitForPageLoadTill(5);
			logger.info("Clicked on submit button");
		
			
		}
		
		/***
		 * Closing Button
		 * @author akash.a.gaurav
		 * @throws AcisException 
		 */
		
		public void closeButton() throws AcisException {
			
			waitForPageLoadTill(9);
			logger.info("Closing the open tabs");
			clickWebElemntUsingJavascriptExecutor(caseplanTab);
			waitForPageLoadTill(9);
			clickWebElemntUsingJavascriptExecutor(caseplanTab);
			logger.info("Closed case opened");
		}
		
		/***
		 * Clicking on Next and navigate 
		 * @author Pallavi
		 * @throws AcisException 
		 */
		public void clickNext() throws AcisException {
			waitForPageLoad();
			waitForPageLoadTill(9);
			Actions actions = new Actions(driver);
			waitForPageLoadTill(9);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			logger.info("Clicking on Next Button");
			clickWebElemntUsingJavascriptExecutor(nextButton);
			waitForPageLoad();
			waitForPageLoadTill(5);
			logger.info("Clicked on Next button");
		
			
		}
		
		
	}

	

