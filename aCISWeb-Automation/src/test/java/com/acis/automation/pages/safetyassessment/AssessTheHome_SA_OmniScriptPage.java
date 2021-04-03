package com.acis.automation.pages.safetyassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class AssessTheHome_SA_OmniScriptPage extends PageBase {

	public AssessTheHome_SA_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_OmniscriptPage.class);

	@FindBy(id = "SafetyDateTime")
	WebElement date_field;

	@FindBy(id = "CaptureNarrative")
	WebElement narrative_TextBox_Field;

	@FindBy(id = "CaptureProfessionalOpinion")
	WebElement professional_OpinionText_Boxfield;

	@FindBy(xpath = "//div[contains(text(),'Cancel')]")
	WebElement cancelButton;

	@FindBy(xpath = "//div[contains(text(),'Save for later')]")
	WebElement saveForLaterButton;

	@FindBy(xpath = "//button[contains(text(),'Previous')]")
	WebElement previousButton;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement nextButton;

	@FindBy(xpath = "//label[text()='Narrative']/../../..//textarea")
	WebElement narrativeTextBox;

	@FindBy(xpath = "//label[text()='Professional Opinion']/../../..//textarea")
	WebElement professionalTextBox;

	// newlyadded

	@FindBy(xpath = "//button[@title='Previous Month']")
	WebElement previousMonthAccessTheHome;

	@FindBy(xpath = "(//button[@title='Previous Month'])[2]")
	WebElement previousMonthIncident;

	@FindBy(xpath = "(//input[@name='date'])[2]")
	WebElement incidentDatePicker;

	@FindBy(xpath = "//input[@name='date']")
	WebElement acessTheHomeDatepicker;

	@FindBy(xpath = "//span[text()=10]")
	WebElement safetyAssessmentDate;
	
	@FindBy(xpath="//h1[text()='Safety/Risk Scale']")
	WebElement  safetyRiskScaleHomepagelabel;


	/***
	 * This method used to fill the date in the acess the home page
	 * 
	 * @param field
	 * @throws AcisException
	 * @throws InterruptedException
	 * @author akash.a.gaurav
	 */

	public void setDate() throws AcisException, InterruptedException {

		try {
			waitForElementNew(acessTheHomeDatepicker, 9);
			waitForElement(acessTheHomeDatepicker);
			clickWebElement(acessTheHomeDatepicker);
			waitForElement(previousMonthAccessTheHome);
			clickWebElement(previousMonthAccessTheHome);
			clickWebElement(safetyAssessmentDate);
			waitForPageLoadTill(5);
			logger.info("Access the Home Date succesfully selected");
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/***
	 * Acess the home page Narrative and Profession Opinion text box area
	 * 
	 * @author akash.a.gaurav
	 * 
	 */
	public void narrativeProfessionalTextBox(String narrative, String professional) throws AcisException {
		try {
			waitForPageLoadTill(9);

			try {
				enterTextUsingJavascript(narrativeTextBox, narrative);
				logger.info("Entered text in Narrative Text Box");
				waitForPageLoadTill(9);
				enterTextUsingJavascript(professionalTextBox, professional);
				logger.info("Entered Text in Preofessional Text box");

			} catch (Exception e1) {

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/***
	 * Click on Next Button of Access The Home
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void nextAccessTheHome() throws AcisException {

		waitForPageLoadTill(9);
		waitForElementNew(nextButton, 6);
		try {
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			waitForElementClickable(nextButton);
			clickWebElement(nextButton);
			waitForPageLoadTill(5);
			waitForPageLoad();
			logger.info("Click on next button of Access the home page");
			waitForElement(safetyRiskScaleHomepagelabel);
			logger.info("User on safetyRisk Page" );

			
		} catch (AcisException e) {
			clickWebElemntUsingJavascriptExecutor(nextButton);
			logger.info("Click on next button of Access the home page");
		}
	}
}
