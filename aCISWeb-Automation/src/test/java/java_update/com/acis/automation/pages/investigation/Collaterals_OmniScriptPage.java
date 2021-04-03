package com.acis.automation.pages.investigation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.safetyassessment.InterviewChildren_SA_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class Collaterals_OmniScriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(Collaterals_OmniScriptPage.class);

	public Collaterals_OmniScriptPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	// Dharmesh
	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement iframe;

	@FindBy(xpath = "//a[contains(text(),'Create Collateral')]")
	WebElement createCollateral;

	@FindBy(xpath = "//select[@id='ContactType2']//option[@value='Collateral']")
	WebElement collateralType;

	@FindBy(xpath = "//select[@id='SubtypeMerge']//*[text()='Mental Health'][last()]")
	WebElement mentalHealthSubType;

	@FindBy(xpath = "//input[@id='DateTime2']")
	WebElement datePicker;

	@FindBy(xpath = "//span[text()='10']")
	WebElement date;

	@FindBy(xpath = "//input[@id='Scheduled2']")
	WebElement scheduled;

	@FindBy(xpath = "//input[@id='Attempted2']")
	WebElement attempted;

	@FindBy(xpath = "//input[@id='Unannounced2']")
	WebElement unannounced;

	@FindBy(xpath = "//select[@id='ContactType2']")
	WebElement contactType;

	@FindBy(xpath = "//select[@id='Method2']")
	WebElement method;

	@FindBy(xpath = "//select[@id='Location2']")
	WebElement location;

	@FindBy(xpath = "//select[@id='SubtypeMerge']")
	WebElement contactSubtype;

	@FindBy(xpath = "//input[@id='CollateralPerson2']")
	WebElement collateralPerson;

	@FindBy(xpath = "//input[@id='CollateralPhoneEmail2']")
	WebElement collaterealPhoneEmail;

	@FindBy(xpath = "//textarea[@id='Narrative2']")
	WebElement narrative;

	@FindBy(xpath = "//textarea[@id='ProfessionalOpinion2']")
	WebElement professionalOpinion;

	@FindBy(xpath = "//p[text()='Save']")
	WebElement save;

	@FindBy(xpath = "//button//*[text()='Next']")
	WebElement next;

	@FindBy(xpath = "//button[@title='Close Collateral Contact']")
	WebElement closeCollateral;

	@FindBy(xpath = "//*[contains(text(),'details are saved. Close ')]")
	WebElement closeInterviewMessage;
	
	@FindBy(xpath = "//h1[text()='Record Review']")
	WebElement verifyRecordLabel;

	@FindBy(xpath = "//*[contains(text(),'The collateral details are saved. Close this tab to return to the investigation workflow')]")
	WebElement collateralClosedMessage;

	@FindBy(xpath = "(//p[contains(text(),'Please ensure collateral contacts')])[2]")
	WebElement warningCheck;
	
	//Khushboo
	@FindBy(xpath="//p[text()='Error : Please fix all the fields with errors.']")
	WebElement errorMessage;
	
	@FindBy(xpath="//button[@id='alert-ok-button']")
	WebElement alertOKButton;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Foster Home']")
	WebElement locationFosterHome;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Biological Home']")
	WebElement locationBiologicalHome;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='DCS Office']")
	WebElement locationDcsOffice;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Service Provider']")
	WebElement locationServiceProvider;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Phone']")
	WebElement methodPhone;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Face-to-Face']")
	WebElement methodFaceToFace;
	
	@FindBy(xpath = "//select[@id='SubtypeMerge']//option[text()='Medical']")
	WebElement medicalSubType;

	
	@FindBy(xpath = "//select[@id='ContactSubtype2']//option[text()='Education']")
	WebElement educationSubType;
	
	@FindBy(xpath = "//select[@id='ContactSubtype2']//option[text()='Service Provider']")
	WebElement serviceProviderSubType;



	/**
	 * Owner : Dharmesh Description: Switch iFrame
	 * 
	 * @throws AcisException
	 */
	public void iframeSwitch() throws AcisException {
		logger.info("Switching to iframe");
		switchToFrameByWebElement(iframe);
		logger.info("Switching to iframe");
	}

	/**
	 * Clicking on Create Collateral link on Investigation flow Collaterals Page
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void clickCreateCollateral() throws AcisException {
		logger.info("Clicking on Create Collateral link");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(createCollateral);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Create Collateral link");
	}

	/**
	 * Set Date of Collaterals Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void setDate() throws AcisException {
		logger.info("Setting Date on Collaterals Page");
		waitForElementClickable(datePicker);
		clickWebElemntUsingJavascriptExecutor(datePicker);
		waitForElementClickable(date);
		clickWebElemntUsingJavascriptExecutor(date);
		logger.info("Successfully set Date on Collaterals Page");

	}

	/**
	 * Set Checkbox on Collaterals Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void setCheckbox(String Option) throws AcisException {
		logger.info("Clicking on " + Option);
		switch (Option) {
		case "Scheduled":
			waitForElementClickable(scheduled);
			clickWebElemntUsingJavascriptExecutor(scheduled);
			logger.info("Clicked on " + Option);
			break;
		case "Attempted":
			waitForElementClickable(attempted);
			clickWebElemntUsingJavascriptExecutor(attempted);
			logger.info("Clicked on " + Option);
			break;
		case "Unannounced":
			waitForElementClickable(unannounced);
			clickWebElemntUsingJavascriptExecutor(unannounced);
			logger.info("Clicked on " + Option);
			break;
		default:
			logger.info(Option + " Checkbox not found");
			break;
		}
	}

	/**
	 * Set PickList on Collaterals Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void setPickList(String Option, String str) throws AcisException {
		logger.info(str + " PickList value as " + Option);
		switch (str) {
		case "Type":
			selectDropdownByVisibleTextUsingJavascriptExecutor(contactType, Option);
			logger.info(str + " PickList value selected as " + Option);
			break;
		case "Subtype":
			selectDropdownByVisibleTextUsingJavascriptExecutor(contactSubtype, Option);
			logger.info(str + " PickList value selected as " + Option);
			break;
		case "Location":
			selectDropdownByVisibleTextUsingJavascriptExecutor(location, Option);
			logger.info(str + " PickList value selected as " + Option);
			break;
		case "Method":
			selectDropdownByVisibleTextUsingJavascriptExecutor(method, Option);
			logger.info(str + " PickList value selected as " + Option);
			break;
		default:
			logger.info(str + " Checkbox not found");
			break;
		}
	}

	/**
	 * Set Type PickList on Collaterals Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void typePicklist(String str) throws AcisException {
		logger.info("Type PickList value as " + str);
		switch (str) {
		case "Collateral":
			clickWebElement(contactType);
			clickWebElement(collateralType);
			waitForPageLoadTill(2);
			logger.info(str + " PickList value selected as " + str);
			break;
		default:
			logger.info(str + " PickList not found");
			break;
		}
	}

	/**
	 * Set SubType PickList on Collaterals Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void subTypePicklist(String str) throws AcisException {
		logger.info("Type PickList value as " + str);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,150)");
		switch (str) {
		case "Medical":
			clickWebElement(contactSubtype);
			clickWebElement(medicalSubType);
			waitForPageLoadTill(2);
			logger.info(str+" PickList value selected as "+str);
			break;
		case "MentalHealth":
			clickWebElement(contactSubtype);
			clickWebElement(mentalHealthSubType);
			waitForPageLoadTill(2);
			logger.info(str+" PickList value selected as "+str);
			break;
		case "Education":
			clickWebElement(contactSubtype);
			clickWebElement(educationSubType);
			waitForPageLoadTill(2);
			logger.info(str+" PickList value selected as "+str);
			break;
		case "Service Provider":
			clickWebElement(contactSubtype);
			clickWebElement(serviceProviderSubType);
			waitForPageLoadTill(2);
			logger.info(str+" PickList value selected as "+str);
			break;
	default:
			logger.info(str + " PickList not found");
			break;
		}
	}

	/**
	 * Enter Text Box : Collateral Name, Collateral Phone/Email, Narrative,
	 * Professional Opinion Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void enterTextFieldValue(String textFieldName, String strValue) throws AcisException {
		switch (textFieldName) {
		case "CollateralPerson":
			enterText(collateralPerson, strValue);
			waitForPageLoadTill(5);
			logger.info(collateralPerson + " entered as: " + strValue);
			break;

		case "CollateralPhoneEmail":
			enterText(collaterealPhoneEmail, strValue);
			waitForPageLoadTill(5);
			logger.info(collaterealPhoneEmail + " entered as: " + strValue);
			break;

		case "Narrative":
			enterText(narrative, strValue);
			logger.info(narrative + " entered as: " + strValue);
			break;

		case "ProffesionalOpinion":
			enterText(professionalOpinion, strValue);
			logger.info(professionalOpinion + " entered as: " + strValue);
			break;

		default:
			logger.info("Text Field Value: " + textFieldName + "did not find");
		}
		waitForPageLoadTill(5);
	}

	/**
	 * Click on save button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickSaveButton() throws AcisException, InterruptedException {
		logger.info("Clicking on save button");
		Actions act = new Actions(driver);
         
         act.sendKeys(Keys.END).build().perform();
		clickWebElemntUsingJavascriptExecutor(save);
		logger.info("Clicked on save button");
		waitForPageLoadTill(5);
		waitForPageLoad();

	}

	/**
	 * click on Next button
	 * 
	 * @author Dharmesh Krishna
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(next);
		clickWebElement(next);
		waitForPageLoad();
		waitForPageLoadTill(5);
		//waitForElement(verifyRecordLabel);
		logger.info("Clicked on Next button");

	}

	/**
	 * close on collateral tab
	 * @author khushboo
	 */
	public void closeCollateraltab() throws AcisException {
		logger.info("Closing collateral Tab");
		waitForElement(closeInterviewMessage);
		switchToDefaultContent();
		clickWebElemntUsingJavascriptExecutor(closeCollateral);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Closed collateral Tab");
	}

	/**
	 * close on collateral tab
	 * @author khushboo
	 */
	public void closeCollateraltabCheck() throws AcisException {
		logger.info("Closing collateral Tab");
		switchToDefaultContent();
		clickWebElemntUsingJavascriptExecutor(closeCollateral);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Closed collateral Tab");
	}
	
	/***
	 * Verify error message when all mandatory fields are not field
	 * 
	 * @throws AcisException
	 * @author Khushboo
	 */
	public void verifyError() throws AcisException {
		logger.info("Verifying on Error message");
		waitForElement(errorMessage);
		logger.info("Verified on Error message");
		clickWebElement(alertOKButton);
	}

	/***
	 * Verify warning message not present 
	 * 
	 * @throws AcisException
	 * @author Dharmesh
	 */
	public void verifyWarningNotPresent() throws AcisException {
		logger.info("Verifying on warning message Not Present");
		verifyElementNotPresent(warningCheck);
		logger.info("Verified on warning message Not Present");
	}

	/**
	 * Verify location subtype location
	 * 
	 * @throws AcisException
	 */
	public void verifyLocation(String locationOption) throws AcisException {

		switch (locationOption) {
		case "Foster Home":
			clickWebElement(location);
			waitForElement(locationFosterHome);
			waitForPageLoadTill(2);
			logger.info("Verified location Foster Home");
			break;

		case "Biological Home":
			clickWebElement(location);
			waitForElement(locationBiologicalHome);
			waitForPageLoadTill(2);
			logger.info("Selected location Biological Home");
			break;

		case "DCS Office":
			clickWebElement(location);
			waitForElement(locationDcsOffice);
			waitForPageLoadTill(2);
			logger.info("Selected location DCS office");
			break;

		case "Service Provider":
			clickWebElement(location);
			waitForElement(locationServiceProvider);
			waitForPageLoadTill(2);
			logger.info("Selected location Service Provider");
			break;

		default:
			logger.info("No matching location value");
			break;
		}

	}

	/**
	 * Select method
	 * 
	 * @throws AcisException
	 */
	public void prvoideMethod(String methodOption) throws AcisException {

		switch (methodOption) {
		case "Phone":
			clickWebElement(method);
			clickWebElement(methodPhone);
			waitForPageLoadTill(2);
			logger.info("Selected methhod Phone");
			break;

		case "FaceToFace":
			clickWebElement(method);
			clickWebElement(methodFaceToFace);
			waitForPageLoadTill(2);
			logger.info("Selected methhod FaceToFace");
			break;

		default:
			logger.info("No matching method option");
			break;
		}

	}

	/**
	 * Verify Message :The collateral details are saved. Close this tab to return to the investigation workflow
	 * @author mrunal.s.tilekar
	 */
	public void verifyCollateralClosedTabMessage() {
		
		logger.info("Verifing Message :The collateral details are saved. Close this tab to return to the investigation workflow");
		waitForPageLoadTill(5);
		Assert.assertTrue(collateralClosedMessage.isDisplayed(), "Error : No interview tab closed message displayed");
		logger.info("Verified Message :The collateral details are saved. Close this tab to return to the investigation workflow");	
		
	}
}
