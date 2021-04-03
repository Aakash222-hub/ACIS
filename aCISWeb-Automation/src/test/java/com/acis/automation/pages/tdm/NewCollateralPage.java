package com.acis.automation.pages.tdm;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewCollateralPage extends PageBase {

	public NewCollateralPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewCollateralPage.class);

	@FindBy(xpath = "//*[text()='Date']/../..//input")
	WebElement startDateTextBox;

	@FindBy(xpath = "//*[text()='Next Month']")
	WebElement nextMonth;

	@FindBy(xpath = "(//*[text()='Collateral'])[last()]")
	WebElement newTnteractionType;
	
	@FindBy(xpath = "//*[text()='Previous Month']")
	WebElement previousMonth;

	@FindBy(xpath = "//span[text()='15']")
	WebElement dateStartDate;
	
	@FindBy(xpath = "//*[text()='Collateral Name']/../..//input")
	WebElement collateralName;
	
	@FindBy(xpath = "//*[text()='Subtype']/../..//input")
	WebElement subType;
	
	@FindBy(xpath = "//*[text()='Narrative']/../..//textarea")
	WebElement narrative;
	
	@FindBy(xpath = "//*[text()='Professional Opinion']/../..//textarea")
	WebElement professionalOpinion;
	
	@FindBy(xpath = "//span[@title='Medical']")
	WebElement medical;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement save;
	
	
	@FindBy(xpath = "//h1//*[text()='Interactions']")
	WebElement interactionsVerify;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;
	
	/**
	 * Select Date on New Collateral
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void selectDate() throws AcisException {
		logger.info(" Selecting start date");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(startDateTextBox);
		waitForPageLoadTill(3);
		clickWebElement(startDateTextBox);
		waitForElement(dateStartDate);
		clickWebElement(dateStartDate);
		logger.info(" Selected start date");

	}
	
	/**
	 * Select Subtype Picklist on New Collateral 
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void setSubtype(String option) throws AcisException {
		logger.info("Selecting Text:"+option);
		switch (option) {
		case "medical":
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			scrollingToElementofAPage(subType);
			clickWebElemntUsingJavascriptExecutor(subType);
			waitForElement(medical);
			clickWebElement(medical);
			logger.info("Selected Text:"+option);
			break;
		default:
			break;
		}

	}
	
	/**
	 * Set Text on New Collateral
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void setText(String option,String strText) throws AcisException {
		logger.info("Entering Text:"+option);
		switch (option) {
		case "CollateralName":
			enterText(collateralName, strText);
			logger.info("Entered Text:"+option);
			break;
		case "Narrative":
			enterText(narrative, strText);
			logger.info("Entered Text:"+option);
			break;
		case "ProfessionalOpinion":
			enterText(professionalOpinion, strText);
			logger.info("Entered Text:"+option);
			break;
		default:
			break;
		}

	}
	public void selectRadioButton() throws AcisException {
		logger.info("Selecting New Interactions Radio Button");
		waitForElement(newTnteractionType);
		clickWebElement(newTnteractionType);
		clickWebElement(nextButton);
		logger.info("Selected New Interactions Radio Button");
	}
	/**
	 * Click on Save
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void clickSave() throws AcisException {
		logger.info("Clicking on Save");
		waitForElement(save);
		clickWebElement(save);
		logger.info("Clicked on Save");
		waitForElement(interactionsVerify);

	}
}
