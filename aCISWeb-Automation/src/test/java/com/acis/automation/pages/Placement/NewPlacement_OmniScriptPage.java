package com.acis.automation.pages.Placement;

import java.text.ParseException;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewPlacement_OmniScriptPage extends PageBase {

	public NewPlacement_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewPlacement_OmniScriptPage.class);
	
	int Duration, period;
	
	@FindBy(xpath = "//h1[text()='New Placement']")
	WebElement newPlacementTitle;

	@FindBy(xpath = "//*[text()='Yes']/preceding-sibling::span")
	WebElement yesICPCPlacement;

	@FindBy(xpath = "//*[text()='No']/preceding-sibling::span")
	WebElement noICPCPlacement;

	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//input")
	WebElement typeOfPlacementDropdown;
	
	@FindBy(xpath = "//*[text()='Type of Placement']/../../..//input[@tabindex='-1']")
	WebElement typeOfPlacementDropdownDisabled;

	@FindBy(xpath = "//*[text()='Relative Foster']")
	WebElement typeOfPlacement_relativeFoster;

	@FindBy(xpath = "//*[text()='Regular Foster']")
	WebElement typeOfPlacement_regularFoster;

	@FindBy(xpath = "//*[text()='Treatment Foster']")
	WebElement typeOfPlacement_treatmentFoster;

	@FindBy(xpath = "//*[text()='Kinship']")
	WebElement typeOfPlacement_kinship;

	@FindBy(xpath = "//*[text()='RTC']")
	WebElement typeOfPlacement_rtc;

	@FindBy(xpath = "//*[text()='Hospital']")
	WebElement typeOfPlacement_hospital;

	@FindBy(xpath = "//*[text()='ILP']")
	WebElement typeOfPlacement_ilp;

	@FindBy(xpath = "//*[text()='SILA']")
	WebElement typeOfPlacement_sila;

	@FindBy(xpath = "//*[text()='Group Home']")
	WebElement typeOfPlacement_groupHome;

	@FindBy(xpath = "//*[text()='Own Home']")
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

	@FindBy(xpath = "(//*[text()='Child']/../../..//input)[1]")
	WebElement childTextBox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='Medically Complex']/preceding-sibling::span")
	WebElement sn_MedicallyComplexCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='Teen Parent']/preceding-sibling::span")
	WebElement sn_TeenParentCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='Disabled']/preceding-sibling::span")
	WebElement sn_DisabledCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='LGBTQ']/preceding-sibling::span")
	WebElement sn_LGBTQCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='SEN']/preceding-sibling::span")
	WebElement sn_SENCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='ESL']/preceding-sibling::span")
	WebElement sn_ESLCheckbox;

	@FindBy(xpath = "//button[text()='Save for later']")
	WebElement saveForLaterButton;

	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchButton;

	@FindBy(xpath = "//h1[text()='Placement Search Results']")
	WebElement placementSearchResultTitle;

	//Pallavi
	@FindBy(xpath = "//*[text()='22']")
	WebElement newPlacementStartDate;
		
	@FindBy(xpath = "//span[contains(text(),'/21/')]")
	WebElement checkEndDate;
		
	//@FindBy(xpath = "(//a[contains(text(),'P-0')])[1]")
	//WebElement placementId;
	
	@FindBy(xpath = "(//table/tbody/tr/th/span/a)[1]")
	WebElement placementsId;
		
	@FindBy(xpath = "(//button[text()='Edit'])[2]")
	WebElement editButton;
		
	@FindBy(xpath = "(//*[text()='Start Date']/..//input)[1]")
	WebElement editStartDateTextBox;
		
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;
		
	@FindBy(xpath = "//h2[text()='We hit a snag.']")
	WebElement startDateBlankError;
		
	@FindBy(xpath ="//button[text()='Cancel']")
	WebElement cancelButton;
		
	@FindBy(xpath ="//p[text()='The Start Date you entered conflicts with a Start Date on record.']")
	WebElement startDateConflict;
		
	@FindBy(xpath ="//button[text()='Previous']")
	WebElement previousButton;
		
	@FindBy(xpath ="(//legend[text()='End Date']/..//input)[1]")
	WebElement endDateInputTextBox;
		
	@FindBy(xpath ="//*[text()='23']")
	WebElement manualPlacementEndDate;
		
	@FindBy(xpath ="//span[text()='Duration']")
	WebElement duration;
		
	@FindBy(xpath ="(//span[text()='End Date']/../..//div)[2]")
	WebElement placementEndDate;
	
	@FindBy(xpath ="//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='End Date']/..//following-sibling::div//lightning-formatted-text")
	WebElement placementEndDateValue;

	@FindBy(xpath ="//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='Start Date']/..//following-sibling::div//lightning-formatted-text")
	WebElement placementStartDateValue;
	
	@FindBy(xpath ="//lightning-formatted-text[contains(text(),'/22/')]")
	WebElement durationStartDate;
		
	@FindBy(xpath ="//lightning-formatted-text[contains(text(),'/23/')]")
	WebElement durationEndDate;
	
	@FindBy(xpath ="//span[text()='Duration']//..//..//lightning-formatted-text")
	WebElement durationYearMonthDays;
	
	@FindBy(xpath ="(//lightning-formatted-text[contains(text(),' Years')])")
	WebElement totalDuration;
	
	@FindBy(xpath ="//*[contains(@title,'P-000')]")
	WebElement placementssId;
	
	@FindBy(xpath ="//span[text()='required']")
	WebElement required;
	
	@FindBy(xpath ="//span[text()='Placement Address']/../..//lightning-formatted-text")
	WebElement placementAddress;
	
	@FindBy(xpath="//div/lightning-helptext/div/button/lightning-primitive-icon")
	WebElement ageAtTimeOfPlacementIcon;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement ok;
			
	@FindBy(xpath="//span[text()='Your OmniScript is saved for later']")
	WebElement omniscriptSaveForLater;
	
	@FindBy(xpath="//span[text()='down icon']")
	WebElement downIcon;
	
	@FindBy(xpath="//span[text()='Edit']")
	WebElement downIconEdit;
	
	public By endDatePresent = By.xpath("//span[text()='End Date']/../../..//lightning-formatted-text[contains(text(),', ')]");

	
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
		waitForElement(typeOfPlacementDropdown);
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
		scrollingToElementofAPage(sn_MedicallyComplexCheckbox);
		switch (option) {
		case "Medically Complex":
			logger.info("Selecting Speical need : " + option);
			clickWebElemntUsingJavascriptExecutor(sn_MedicallyComplexCheckbox);
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
		waitForElement(searchButton);
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
	public void clickSaveForLaterButton() throws AcisException {
		logger.info("Clicking Save for later button");
		clickWebElemntUsingJavascriptExecutor(saveForLaterButton);
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
		clickWebElement(childTextBox);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("(//*[contains(text(),'" + childName + "')])[2]")));
		clickWebElement(driver.findElement(By.xpath("(//*[contains(text(),'" + childName + "')])[2]")));
		waitForPageLoadTill(5);
		logger.info("Entered child name : " + childName);
	}
	
	/*** Start date Required
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void selectStartDateRequired() throws AcisException {
		logger.info(" Selecting start date");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(startDateTextBox);
		waitForPageLoadTill(3);
		clickWebElement(startDateTextBox);
		clickWebElement(zipCodeTextbox);
		waitForPageLoad();
		waitForElement(required);
		logger.info(" Selecting start date");
  }
	
	/*** second Placement start date
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 * 
	 */
	public void placementSecondStartdate() throws AcisException {
		logger.info("selecting on second placement start date");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(startDateTextBox);
		waitForPageLoadTill(3);
		clickWebElement(startDateTextBox);
		//dateStartDate.clear();
		clickWebElement(newPlacementStartDate);
		logger.info("selected on second placement start date");
		
	}
	
	/*** Open Placement
	 * @author pallavi.sanjay.yemle 
	 * @throws AcisException 
	 * 
	 */
	public void endDatePopulated() throws AcisException {
		logger.info("Verifying label on placement of end date is populated or not");
		waitForElement(checkEndDate);
		//clickWebElement(checkEndDate);
		waitForPageLoad();
		logger.info("Verified label on placement of end date is populated");
		
	}
	
	/***
	 * Editing Placement and removing start date
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void editStartDateBlank() throws AcisException {
		logger.info("Clicking on placement Id");
		waitForElement(placementssId);
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(placementsId);
		waitForPageLoadTill(5);
		logger.info("Clicked on placement Id");
		logger.info("Clicking on Edit button");
		waitForElement(editButton);
		clickWebElemntUsingJavascriptExecutor(editButton);
		waitForPageLoadTill(5);
		logger.info("Clicked on Edit button");
		waitForElement(editStartDateTextBox);
		clickWebElemntUsingJavascriptExecutor(editStartDateTextBox);
		waitForPageLoad();
		logger.info("Clicked on start date text box");
		editStartDateTextBox.clear();
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(saveButton);
		waitForPageLoadTill(5);
		waitForElement(startDateBlankError);
		logger.info(" Selected placement start date is Blank");
		clickWebElement(cancelButton);
		logger.info("Clicked on cancel button");
	}
	
	/***adding placement for child with start date that same as the previous placement for that child
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void sameStartDateConflict() throws AcisException {
	
		logger.info("Placement search result");
		waitForElement(placementSearchResultTitle);
		waitForElement(startDateConflict);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(previousButton);
		//clickWebElement(previousButton);
		waitForPageLoadTill(5);
		logger.info(" Selected start date is same as previous Blank");
		
	}

	/*** editing a placement where the end date did not auto-populate
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	
	public void editEndDateManually() throws AcisException {
		logger.info("Clicking on placement Id");
		waitForElement(placementssId);
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(placementsId);
		waitForPageLoadTill(5);
		logger.info("Clicked on placement Id");
		logger.info(" clicking on Placement edit button");
		clickWebElemntUsingJavascriptExecutor(editButton);
		waitForPageLoadTill(3);
		logger.info(" clicked on Placement edit button");
		logger.info(" clicking on Placement end date textbox");
		clickWebElemntUsingJavascriptExecutor(endDateInputTextBox);
		logger.info(" clicked on Placement end date textbox");
		clickWebElemntUsingJavascriptExecutor(manualPlacementEndDate);
		//clickWebElement(placementEndDate);
		waitForPageLoad();
		clickWebElement(saveButton);
		waitForPageLoad();
	}
	
	/*** editing a placement where the end date did not auto-populate and get end date
	 * @author priyanka
	 * @throws AcisException 
	 */
	
	public String editEndDateManuallyAndGetEndDate() throws AcisException {
		logger.info(" clicking on Placement edit button");
		clickWebElemntUsingJavascriptExecutor(editButton);
		waitForPageLoadTill(3);
		logger.info(" clicked on Placement edit button");
		logger.info(" clicking on Placement end date textbox");
		clickWebElemntUsingJavascriptExecutor(endDateInputTextBox);
		logger.info(" clicked on Placement end date textbox");
		clickWebElemntUsingJavascriptExecutor(manualPlacementEndDate);
		//clickWebElement(placementEndDate);
		waitForPageLoad();
		logger.info(" clicking on Save");
		clickWebElement(saveButton);
		logger.info(" clicked on Save");
		waitForPageLoad();
		String placementEndDate=placementEndDateValue.getText();
		logger.info("Placement End Date :"+placementEndDate);
		return(placementEndDate);
	}
	
	public String getPlacementStartDate() throws AcisException {
		logger.info("Clicking on placement Id");
		waitForElement(placementssId);
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(placementsId);
		waitForPageLoadTill(5);
		logger.info("Clicked on placement Id");
		String placementStartDate=placementStartDateValue.getText();
		//clickWebElement(placementEndDate);
		waitForPageLoad();
		return(placementStartDate);
	}
	/*** verify "Duration" is the field label instead of "Length of Stay"
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void verifyDurationLabel() throws AcisException {
		logger.info("Clicking on placement Id");
		waitForElement(placementssId);
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(placementsId);
		waitForPageLoadTill(5);
		logger.info("Clicked on placement Id");
		logger.info("Verifying label on placement duration");
		waitForElement(duration);
		logger.info("Verified label on placement duration");
	}
	
	/***
	 * Duration calculation If placement has ended
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 * @throws ParseException 
	 */

	
	  public void verifyDuration() throws AcisException, ParseException {
		  waitForPageLoad();
		  waitForPageLoadTill(5);
		 if(isElementPresent(endDatePresent)){
		//	 String startdate = durationStartDate.getText();
		//	  System.out.println(startdate);
		//	  String enddate = durationEndDate.getText();
		//	  System.out.println(enddate);
			  logger.info("Wait for duration");
			  waitForElement(durationYearMonthDays);
			  String td=totalDuration.getText();
			  System.out.println(td);
			  waitForElement(totalDuration);
			  logger.info("Duration is: " + td);
			  
		  }else {
		//	  String Sd=durationStartDate.getText();
		//	  System.out.println(Sd);
		//	  LocalDate localToday = LocalDate.now(); 
		//	  System.out.println(localToday);
			  
			  logger.info("Wait for duration");
			  waitForElement(durationYearMonthDays);
			  String td=totalDuration.getText();
			  System.out.println(td);
			  waitForElement(totalDuration);
			  logger.info("Duration is: " + td);
		  }
		
	  }
	  
	  /***clicking Placement Id
	   * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	   */
	  public void clickPlacementId() throws AcisException {
		  logger.info("Clicking on placement Id");
		  waitForElement(placementssId);
		  waitForPageLoadTill(5);
		  waitForPageLoad();
		  clickWebElement(placementsId);
		  waitForPageLoadTill(5);
		  logger.info("Clicked on placement Id");
	  }
	  
	  /*** Click Age at Time of placement
		 * @author pallavi.sanjay.yemle
		 * @throws AcisException 
		 */
		public void clickIconAgeAtTimeOfPlacement() throws AcisException {
			logger.info("Clicking Age icon");
			waitForPageLoadTill(3);
			scrollingToElementofAPage(ageAtTimeOfPlacementIcon);
			clickWebElemntUsingJavascriptExecutor(ageAtTimeOfPlacementIcon);
			logger.info("Clicked Age icon");
		}
		
	  /***Verify Placement Address
	   * @author pallavi.sanjay.yemle
	   */
	  public void placementAddress() {
		  logger.info("Verify Placement Address Country field in address is hidden.");
		  scrollingToElementofAPage(placementAddress);
		  waitForElement(placementAddress);
		  logger.info("Verified Placement Address Country field in address is hidden.");
	  }
	  
	  /*** Click OmniScript is saved for later
		 * @author pallavi.sanjay.yemle
		 * @throws AcisException 
		 */
		public void omniscriptSaveForLater() throws AcisException {
			logger.info("Verify OmniScript is saved for later");
			waitForPageLoad();
			waitForElement(omniscriptSaveForLater);
			waitForPageLoadTill(5);
			logger.info("Verified OmniScript is saved for later");
		}
		
		/*** Click OK
		 * @author pallavi.sanjay.yemle
		 * @throws AcisException 
		 */
		public void clickOk() throws AcisException {
			logger.info("Clicking on OK Button");
			waitForPageLoad();
			clickWebElement(ok);
			waitForPageLoadTill(5);
			logger.info("Clicked on OK button");
		}
		
		/*** Click down icon edit
		 * @author pallavi.sanjay.yemle
		 */
		public void clickDownIconEdit() throws AcisException {
			logger.info("Clicking on down icon edit Button");
			waitForPageLoad();
			waitForElement(downIcon);
			clickWebElemntUsingJavascriptExecutor(downIcon);
			clickWebElemntUsingJavascriptExecutor(downIconEdit);
			waitForPageLoadTill(5);
			logger.info("Clicked on down icon edit button");
		}
		
		/*** Click Save Button
		 * @author pallavi.sanjay.yemle
		 * @throws AcisException 
		 */
		public void saveButton() throws AcisException {
			logger.info("Clicking on Save Button");
			waitForPageLoad();
			waitForElement(saveButton);
			clickWebElemntUsingJavascriptExecutor(saveButton);
			logger.info("Clicked on Save Button");
		}
}
