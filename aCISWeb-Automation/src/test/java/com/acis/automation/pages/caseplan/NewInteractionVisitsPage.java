package com.acis.automation.pages.caseplan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewInteractionVisitsPage extends PageBase {

	public NewInteractionVisitsPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewInteractionVisitsPage.class);
	
	@FindBy(xpath="//*[text()='Date']")
	WebElement dateField;
	 @FindBy(xpath="//*[text()='16']")
	 WebElement selectDate;
	 
	@FindBy(xpath="//*[text()='Time']")
	WebElement timeField;

	@FindBy(xpath = "(//*[text()='Subtype']//..//input")
	WebElement Subtype;

	@FindBy(xpath = "(//*[text()='Subtype']//..//input/../../..//*[text()='Biological Parent'])")
	WebElement listBiologicalParent;

	@FindBy(xpath = "(//*[text()='Subtype']//..//input/../../..//*[text()='Foster Parent'])")
	WebElement listFosterParent;

	@FindBy(xpath = "(//*[text()='Subtype']//..//input/../../..//*[text()='Child'])")
	WebElement listChild;

	@FindBy(xpath = "(//*[text()='Subtype']//..//input/../../..//*[text()='Relative'])")
	WebElement listRelative;

	@FindBy(xpath = "(//*[text()='Subtype']//..//input/../../..//*[text()='Sibling Visit'])")
	WebElement listSiblingVisit;

	@FindBy(xpath = "(//*[text()='Method']//..//input")
	WebElement Method;

	@FindBy(xpath = "(//*[text()='Method']//..//input/../../..//*[text()='Teleconference'])")
	WebElement teleconference;

	@FindBy(xpath = "(//*[text()='Method']//..//input/../../..//*[text()='Video Conference'])")
	WebElement videoconference;

	@FindBy(xpath = "(//*[text()='Method']//..//input/../../..//*[text()='Face-to-Face'])")
	WebElement facetoface;

	@FindBy(xpath = "//label[text()='Narrative']//..//textarea")
	WebElement txtNarrative;

	@FindBy(xpath = "//label[text()='Professional Opinion']/..//textarea")
	WebElement txtProfessionalOpinion;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement visitSaveButton;

	@FindBy(xpath = "//button[@title='Save & New']")
	WebElement visitSaveandNewButton;

	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement buttonCancel;
	
	
	/**
	 *Set date and time
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void setDateandTime() throws AcisException {
			logger.info("Selecting date and time " );
			clickWebElement(dateField);
			waitForPageLoadTill(10);
			clickWebElement(selectDate);
			waitForPageLoadTill(2);
			clickWebElement(timeField);
			waitForPageLoadTill(10);
			clickWebElement(selectDate);


		}
	/**
	 * Select Subtype type on Page
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void selectSubtype(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "Biological Parent":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listBiologicalParent);
			waitForPageLoadTill(2);
			logger.info("Selected Subtype as :" + subtypeOption);
			break;

		case "Foster Parent":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listFosterParent);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + subtypeOption);
			break;

		case "Child":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listChild);
			waitForPageLoadTill(2);
			logger.info("Selected sutype:" + subtypeOption);
			break;

		case "Relative":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listRelative);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + subtypeOption);
			break;

		case "Sibling Visit":
			logger.info("Selecting Subtype :" + subtypeOption);
			clickWebElement(Subtype);
			clickWebElement(listSiblingVisit);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + subtypeOption);
			break;

		default:
			logger.info("No Subtype  ");
			break;
		}

	}

	/**
	 * Select method type on Page
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void selectmethod(String methodOption) throws AcisException {

		switch (methodOption) {
		case " Tele Conference":
			logger.info("Selecting Method :" + methodOption);
			clickWebElement(Method);
			clickWebElement(teleconference);
			waitForPageLoadTill(2);
			logger.info("Selected Method :" + methodOption);
			break;

		case "Video Conference":
			logger.info("Selecting Method :" + methodOption);
			clickWebElement(Method);
			clickWebElement(videoconference);
			waitForPageLoadTill(2);
			logger.info("Selected Method :" + methodOption);
			break;

		case "Face-to-face":
			logger.info("Selecting Method :" + methodOption);
			clickWebElement(Method);
			clickWebElement(facetoface);
			waitForPageLoadTill(2);
			logger.info("Selected Method:" + methodOption);
			break;
		default:
			logger.info("No Method  ");
			break;
		}

	}

	/**
	 * Textarea of Narrative page button
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 * 
	 */
	public void txtNarrative(String opinion) throws AcisException {

		logger.info("Filling textarea ");
		clickWebElement(txtNarrative);
		logger.info("filled textarea ");

	}

	/**
	 * Textarea of Professional Openion page button
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 * 
	 */
	public void txtProfessionalOpinion(String opinion) throws AcisException {

		logger.info("Filling textarea ");
		clickWebElement(txtProfessionalOpinion);
		logger.info("filled textarea ");

	}

	/**
	 * Click on buttons
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */

	public void clickOnButton(String option) throws AcisException {

		switch (option) {
		case "Save":
			logger.info("Clicking on :" + option);
			clickWebElement(visitSaveButton);
			waitForPageLoadTill(2);
			logger.info("Clicked on  :" + option);
			break;

		case "SaveandNew":
			logger.info("Clicking on :" + option);
			clickWebElement(visitSaveandNewButton);
			waitForPageLoadTill(2);
			logger.info("Clicked on :" + option);
			break;

		case "Cancel":
			logger.info("Clicking on :" + option);
			clickWebElement(buttonCancel);
			waitForPageLoadTill(2);
			logger.info("Clicked on  :" + option);
			break;
		default:
			logger.info("No Button is avaiable");
			break;
		}

	}
}
