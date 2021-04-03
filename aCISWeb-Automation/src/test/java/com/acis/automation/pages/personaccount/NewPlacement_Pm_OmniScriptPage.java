package com.acis.automation.pages.personaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewPlacement_Pm_OmniScriptPage extends PageBase {

	public NewPlacement_Pm_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewPlacement_Pm_OmniScriptPage.class);

	@FindBy(xpath = "//h1[text()='New Placement']")
	WebElement newPlacementTitle;

	@FindBy(xpath = "//*[text()='Yes']/preceding-sibling::span")
	WebElement yesICPCPlacement;

	@FindBy(xpath = "//*[text()='No']/preceding-sibling::span")
	WebElement noICPCPlacement;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//input")
	WebElement typeOfPlacementDropdown;
		
//	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='Relative Foster']")
//	WebElement typeOfPlacementDropdown;
	
	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//input[@tabindex='-1']")
	WebElement typeOfPlacementDropdownDisabled;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='Relative Foster']")
	WebElement typeOfPlacement_relativeFoster;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='Regular Foster']")
	WebElement typeOfPlacement_regularFoster;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='Treatment Foster']")
	WebElement typeOfPlacement_treatmentFoster;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='Kinship']")
	WebElement typeOfPlacement_kinship;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='RTC']")
	WebElement typeOfPlacement_rtc;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='Hospital']")
	WebElement typeOfPlacement_hospital;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='ILP']")
	WebElement typeOfPlacement_ilp;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='SILA']")
	WebElement typeOfPlacement_sila;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='Group Home']")
	WebElement typeOfPlacement_groupHome;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//*[text()='Own Home']")
	WebElement typeOfPlacement_ownHome;

	@FindBy(xpath = "//*[text()='Zip Code']/../../..//input")
	WebElement zipCodeTextbox;

	@FindBy(xpath = "//*[text()='Start Date']/../../..//input")
	WebElement startDateTextBox;

	@FindBy(xpath = "//*[text()='Next Month']")
	WebElement nextMonth;

	@FindBy(xpath = "//*[text()='Previous Month']")
	WebElement previousMonth;

	@FindBy(xpath = "//*[text()='15']")
	WebElement dateStartDate;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement addButton;

	@FindBy(xpath = "(//*[text()='Child']/../..//input)[1]")
	WebElement childTextBox;

//	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='Medically Complex']/preceding-sibling::span")
//	WebElement sn_MedicallyComplexCheckbox;
	
	@FindBy(xpath = "//*[@name='SpecialNeeds1' and @value='Medically Complex']/..//span[text()='Medically Complex']")
	WebElement sn_MedicallyComplexCheckbox;
	
	@FindBy(xpath = "//*[@name='SpecialNeeds1' and @value='Teen Parent']/..//span[text()='Teen Parent']")
	WebElement sn_TeenParentCheckbox;

	@FindBy(xpath = "//*[@name='SpecialNeeds1' and @value='Disabled']/..//span[text()='Disabled']")
	WebElement sn_DisabledCheckbox;

	@FindBy(xpath = "//*[@name='SpecialNeeds1' and @value='LGBTQ']/..//span[text()='LGBTQ']")
	WebElement sn_LGBTQCheckbox;

	@FindBy(xpath = "//*[@name='SpecialNeeds1' and @value='SEN']/..//span[text()='SEN']")
	WebElement sn_SENCheckbox;

	@FindBy(xpath = "//*[@name='SpecialNeeds1' and @value='ESL']/..//span[text()='ESL']")
	WebElement sn_ESLCheckbox;

	@FindBy(xpath = "//button[text()='Save for later']")
	WebElement saveForLaterButton;

	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchButton;

	@FindBy(xpath = "//h1[text()='Placement Search Results']")
	WebElement placementSearchResultTitle;
	
	@FindBy(xpath="//*[text()='Related']")
	WebElement related;
	
//	@FindBy(xpath = "//*[text()='']")
//	WebElement personContact;
	
	@FindBy(xpath = "//a[@id='customTab4__item']")
    WebElement placement;
	
	@FindBy(xpath = "//a//span[@title='Placements']")
	WebElement newPlacement;
	
	
	@FindBy(xpath = "//span[text()='Case Action ID']/../../..//input")
	WebElement caseActionIdLookup;
	
	@FindBy(xpath = "//*[@role='option']//span[contains(text(),'C-')]")
	WebElement caseActionId;
	
	;
	
	/**
	 * Select ICPC Placement : yes or no
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * 
	 */
	public void selectICPCPlacement(String option) throws AcisException {

		switch (option) {
		case "Yes":
			logger.info("Selecting ICPC Placement as : Yes");
			waitForElement(yesICPCPlacement);
			clickWebElement(yesICPCPlacement);
			logger.info("Selected ICPC Placement as : Yes");
			break;

		case "No":
			logger.info("Selecting ICPC Placement as : No");
			waitForElement(noICPCPlacement);
			clickWebElement(noICPCPlacement);
			logger.info("Selected ICPC Placement as : No");
			break;

		default:
			logger.info("No matching option");
			break;
		}

	}

	/**
	 * Verify Select type of placement Disabled
	 * 
	 * @author dharmesh.krishna
	 * @throws AcisException
	 */
	public void verifyPlacementTypeDisabled() throws AcisException {
		logger.info("Verify Placement Type Disabled ");
		scrollingToElementofAPage(typeOfPlacementDropdownDisabled);
		waitForElement(typeOfPlacementDropdownDisabled);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.HOME).build().perform();
		logger.info("Verified Placement Type Disabled ");
	}

	/**
	 * Select type of placement
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void selectTypeOfPlacement(String option) throws AcisException {
		scrollingToElementofAPage(typeOfPlacementDropdown);
		switch (option) {
		case "Relative Foster":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_relativeFoster);
			logger.info("Selected type of placement as :" + option);

			break;

		case "Regular Foster":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_regularFoster);
			logger.info("Selected type of placement as :" + option);

			break;

		case "Treatment Foster":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_treatmentFoster);
			logger.info("Selected type of placement as :" + option);

			break;

		case "Kinship":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_kinship);
			logger.info("Selected type of placement as :" + option);

			break;

		case "RTC":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_rtc);
			logger.info("Selected type of placement as :" + option);

			break;

		case "Hospital":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_hospital);
			logger.info("Selected type of placement as :" + option);

			break;

		case "ILP":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_ilp);
			logger.info("Selected type of placement as :" + option);

			break;

		case "SILA":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_sila);
			logger.info("Selected type of placement as :" + option);

			break;

		case "Group Home":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_groupHome);
			logger.info("Selected type of placement as :" + option);

			break;

		case "Own Home":
			logger.info("Selecting type of placement as : " + option);
			clickWebElement(typeOfPlacementDropdown);
			clickWebElement(typeOfPlacement_ownHome);
			logger.info("Selected type of placement as :" + option);

			break;

		default:
			logger.info("No matching option for type of placement");
			break;
		}
	}
	
	/**
	 * Enter zipcode
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clearZipCode() throws AcisException {
		logger.info("Clearing zipcode ");
		zipCodeTextbox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		logger.info("Cleared zipcode ");
	}


	/**
	 * Enter zipcode
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void enterZipCode(String zipcodeValue) throws AcisException {
		logger.info("Entering zipcode " + zipcodeValue);
		enterText(zipCodeTextbox, zipcodeValue);
		logger.info("Entered zipcode " + zipcodeValue);
	}

	/**
	 * Select start date
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void selectStartDate() throws AcisException {
		logger.info(" Selecting start date");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(startDateTextBox);
		waitForPageLoadTill(3);
		clickWebElement(startDateTextBox);
		clickWebElement(dateStartDate);
		logger.info(" Selected start date");

	}

	/**
	 * Select special needs
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void selectSpecialNeeds(String option) throws AcisException {
//		scrollingToElementofAPage(sn_MedicallyComplexCheckbox);
		switch (option) {
		case "Medically Complex":
			logger.info("Selecting Speical need : " + option);
			waitForElement(sn_MedicallyComplexCheckbox);
			clickWebElement(sn_MedicallyComplexCheckbox);
			logger.info("Selected Speical need : " + option);

			break;

		case "Teen Parent":
			logger.info("Selecting Speical need : " + option);
			clickWebElemntUsingJavascriptExecutor(sn_TeenParentCheckbox);
			logger.info("Selected Speical need : " + option);

			break;

		case "Disabled":
			logger.info("Selecting Speical need : " + option);
			clickWebElemntUsingJavascriptExecutor(sn_DisabledCheckbox);
			logger.info("Selected Speical need : " + option);

			break;

		case "LGBTQ":
			logger.info("Selecting Speical need : " + option);
			clickWebElemntUsingJavascriptExecutor(sn_LGBTQCheckbox);
			logger.info("Selected Speical need : " + option);

			break;

		case "SEN":
			logger.info("Selecting Speical need : " + option);
			clickWebElemntUsingJavascriptExecutor(sn_SENCheckbox);
			logger.info("Selected Speical need : " + option);

			break;

		case "ESL":
			logger.info("Selecting Speical need : " + option);
			clickWebElemntUsingJavascriptExecutor(sn_ESLCheckbox);
			logger.info("Selected Speical need : " + option);

			break;
		default:
			logger.info("No matching option for special needs");
			break;
		}

	}

	/**
	 * Click Search button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickSearchButton() throws AcisException {
		logger.info("Clicking search button");
		clickWebElement(searchButton);
		logger.info("Clicked search button");
		waitForElement(placementSearchResultTitle);
		logger.info("Successfully Placement Search Result page laoded");

	}

	/**
	 * Click Save for later button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickSaveForLaterhButton() throws AcisException {
		logger.info("Clicking Save for later button");
		clickWebElement(saveForLaterButton);
		logger.info("Clicked Save for later button");
	}

	/**
	 * enter value in Child textbox
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void enterTextChildTextbox(String childName) throws AcisException {
		logger.info("Entering child name : " + childName);
		//waitForElement(childTextBox);
		enterText(childTextBox, childName);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("(//*[contains(text(),'" + childName + "')])[2]")));
		clickWebElement(driver.findElement(By.xpath("(//*[contains(text(),'" + childName + "')])[2]")));
		waitForPageLoadTill(5);
		logger.info("Entered child name : " + childName);
	}
	
	/**
	 * Verify the placement Resource record
	 * 
	 * @author varun.krish
	 * @throws AcisException
	 */
	
	public void verifyPlacementResoucre() throws AcisException {
		
		waitForElement(driver.findElement(By.xpath("(//*[text()='Demo'])")));
		verifyElementNotPresent(driver.findElement(By.xpath("(//*[text()='Demo'])")));
		
	}
	
	/**
	 * Selected Placement Resource from person contact
	 * 
	 * @author varun.krish
	 * @throws AcisException
	 */
	
	
public void verifyPlacementResoucrefrompersoncontact(String name) throws AcisException {
		
	logger.info("Selecting person contact:"+name);	
//		waitForElement(personContact);
//		clickWebElement(personContact);
	    System.out.println("Childname:" +name);
		waitForElement(driver.findElement(By.xpath("(//*[text()='" + name + "'])")));
		clickWebElement(driver.findElement(By.xpath("(//*[text()='" + name + "'])")));
		waitForPageLoadTill(5);
		logger.info("Click on Placement tab");
		refreshPage();
		waitForPageLoadTill(5);
		waitForElement(placement);
		clickWebElement(placement);
		logger.info("click on the New Placement");
		waitForElement(newPlacement);
		clickWebElement(newPlacement);
		refreshPage();
		
	}

/**
 * Select Case Action Id from look up
 * 
 * @author varun.krish
 * @throws AcisException
 */

public void enterCaseActionId() throws AcisException {
	logger.info("Selecting the CaseActionID from Lookup");
	waitForElement(caseActionIdLookup);
	clickWebElement(caseActionIdLookup);
	waitForElement(caseActionId);
	clickWebElement(caseActionId);
	
} 


	
}
