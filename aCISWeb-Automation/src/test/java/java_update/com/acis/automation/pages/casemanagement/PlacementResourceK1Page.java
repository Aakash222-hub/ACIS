package com.acis.automation.pages.casemanagement;

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

public class PlacementResourceK1Page extends PageBase {

	public PlacementResourceK1Page() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PlacementResourceK1Page.class);

	@FindBy(xpath = "//span[text()='Placement Resource']")
	WebElement placementResourceRadio;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//*[text()='Account Name']/../..//input[@type='text']")
	WebElement accountName;

	@FindBy(xpath = "//*[text()='Parent 1']/../..//input[@type='text']")
	WebElement parent1;

	@FindBy(xpath = "//*[text()='Parent 2']/../..//input[@type='text']")
	WebElement parent2;

	@FindBy(xpath = "//*[text()='Parent Account']/../..//input[@type='text']")
	WebElement parentAccount;

	@FindBy(xpath = "//*[text()='Account Number']/../..//input[@type='text']")
	WebElement accountNumber;

	@FindBy(xpath = "//*[text()='Placement Type']/../..//a")
	WebElement placementType;

	@FindBy(xpath = "//a[@title='Regular Foster']")
	WebElement regularFoster;
	
	@FindBy(xpath = "//a[@title='Treatment Foster']")
	WebElement treatmentFoster;
	
	@FindBy(xpath = "//a[@title='Kinship']")
	WebElement Kinship;
	
	@FindBy(xpath = "//a[@title='RTC']")
	WebElement rtc;
	
	@FindBy(xpath = "//a[@title='Hospital']")
	WebElement hospital;
	
	@FindBy(xpath = "//a[@title='Group Home']")
	WebElement groupHome;
	
	@FindBy(xpath = "//a[@title='Own Home']")
	WebElement ownHome;
	
	@FindBy(xpath = "//a[@title='Relative Foster']")
	WebElement relativeFoster;
	
	@FindBy(xpath = "//*[text()='Occupancy']/../..//input")
	WebElement occupancy;

	@FindBy(xpath = "//*[text()='Capacity']/../..//input")
	WebElement capacity;

	@FindBy(xpath = "//*[text()='Female Age Minimum']/../..//input")
	WebElement femaleAgeMinimum;

	@FindBy(xpath = "//*[text()='Male Age Minimum']/../..//input")
	WebElement maleAgeMinimum;

	@FindBy(xpath = "//*[text()='Female Age Maximum']/../..//input")
	WebElement femaleAgeMaximum;

	@FindBy(xpath = "//*[text()='Male Age Maximum']/../..//input")
	WebElement maleAgeMaximum;

	@FindBy(xpath = "//*[text()='Number of Beds']/../..//input")
	WebElement numberOfBeds;

	@FindBy(xpath = "//*[text()='Phone']/../..//input[@type='tel']")
	WebElement phone;

	@FindBy(xpath = "//*[text()='Email']/../..//input")
	WebElement email;

	@FindBy(xpath = "//*[text()='Provider Agency']/../..//input")
	WebElement providerAgency;

	@FindBy(xpath = "//*[text()='Number of Children in the Home']/../..//input")
	WebElement numberOfChildrenInTheHome;

	@FindBy(xpath = "//*[text()='Date of Certification']/../..//input")
	WebElement dateOfCertification;

	@FindBy(xpath = "//*[text()='Date of Recertification']/../..//input")
	WebElement dateOfRecertification;

	@FindBy(xpath = "//*[text()='Description']/../..//textarea")
	WebElement description;

	@FindBy(xpath = "//*[text()='Licensing Worker']/../..//input")
	WebElement licensingWorker;

	@FindBy(xpath = "//*[text()='Billing Street']/../..//textarea")
	WebElement billingStreet;

	@FindBy(xpath = "//*[text()='Billing City']/../..//input")
	WebElement billingCity;

	@FindBy(xpath = "//*[text()='Billing State/Province']/../..//input")
	WebElement billingStateProvince;

	@FindBy(xpath = "//*[text()='Billing Zip/Postal Code']/../..//input")
	WebElement billingZipPostalCode;

	@FindBy(xpath = "//*[text()='Billing Country']/../..//input")
	WebElement billingCountry;

	@FindBy(xpath = "//*[text()='Status']/../..//a")
	WebElement status;

	@FindBy(xpath = "//a[@title='Applicant']")
	WebElement applicant;
	
	@FindBy(xpath = "//a[@title='Approved']")
	WebElement approved;

	@FindBy(xpath = "//a[@title='In Progress']")
	WebElement inProgress;
	
	@FindBy(xpath = "//a[@title='Submitted']")
	WebElement submitted;

	@FindBy(xpath = "//a[@title='Licensed']")
	WebElement licensed;

	@FindBy(xpath = "//a[@title='On Hold']")
	WebElement onHold;

	@FindBy(xpath = "//a[@title='Closed']")
	WebElement closed;

	@FindBy(xpath = "//span[@title='Medically Complex']")
	WebElement medicallyComplex;
	
	@FindBy(xpath = "//span[@title='Teen Parent']")
	WebElement teenParent;
	
	@FindBy(xpath = "//span[@title='ESL']")
	WebElement esl;
	
	@FindBy(xpath = "//span[@title='Disabled']")
	WebElement disabled;
	
	@FindBy(xpath = "//span[@title='LGBTQ']")
	WebElement lgbtq;
	
	@FindBy(xpath = "//span[@title='SEN']")
	WebElement sen;
	
	@FindBy(xpath = "//*[text()='Special Needs Able to Foster']/..//button[@title='Move selection to Chosen']")
	WebElement specialNeedsAbleToAcceptSelect;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement save;
	
	@FindBy(xpath = "//*[text()='Account ID']/../..//*[contains(text(),'A-00')]")
	WebElement accountVerify;
	
	@FindBy(xpath = "//*[text()='Related']")
	WebElement relatedTab;
	
	@FindBy(xpath = "//*[text()='Site Locations']")
	WebElement siteLocations;
	
	@FindBy(xpath = "//a[@title='New']")
	WebElement newSiteLocations;
	
	@FindBy(xpath = "//h2[text()='New Business Location']")
	WebElement siteLocationsVerify;
	
	@FindBy(xpath = "//*[text()='State']/../..//a[@class='select']")
	WebElement stateSelect;
	
	@FindBy(xpath = "//*[text()='Location Name']/../..//input[@type='text']")
	WebElement locationName;
	
	@FindBy(xpath = "//*[text()='Street']/../..//input[@type='text']")
	WebElement street;
	
	@FindBy(xpath = "//*[text()='City']/../..//input[@type='text']")
	WebElement city;
	
	@FindBy(xpath = "//*[text()='Latitude']/../..//input[@type='text']")
	WebElement latitude;
	
	@FindBy(xpath = "//*[text()='Longitude']/../..//input[@type='text']")
	WebElement longitude;
	
	@FindBy(xpath = "//*[text()='Zip/Postal Code']/../..//input[@type='text']")
	WebElement zipCode;
	
	@FindBy(xpath = "//*[text()='Primary Address']/../../input")
	WebElement primaryCheckBox;
	
	//Virendra

		@FindBy(xpath = "//span[text()='Occupancy']/parent::div/following::div/descendant::slot/slot")
		WebElement occupancyValue;
		
		@FindBy(xpath = "//span[text()='Capacity']/parent::div/following::div/descendant::slot//slot")
		WebElement capacityValue;
	
	/**
	 * Clicked on Related Tab on a Provider Agency Account Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForElement(relatedTab);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");

	}
	
	/**
	 * Clicked on Primary CheckBox on a Provider Agency Account Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void checkPrimaryCheckBox() throws AcisException {
		logger.info("Clicking on Primary CheckBox");
		waitForElement(primaryCheckBox);
		clickWebElement(primaryCheckBox);
		logger.info("Clicked on Primary CheckBox");

	}
	
	/**
	 * Clicked on Site Locations Tab on Provider Agency Record Created By
	 * Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickSiteLocationsTab() throws AcisException {
		logger.info("Clicking on New Person Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(siteLocations);
		clickWebElemntUsingJavascriptExecutor(siteLocations);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(newSiteLocations);
		logger.info("Clicked on New Person Tab");

	}
	
	/**
	 * Clicked on New SiteLocations on Case Person Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickNewSiteLocations() throws AcisException {
		logger.info("Clicking on New Site Locations Button");
		clickWebElement(newSiteLocations);
		waitForElement(siteLocationsVerify);
		logger.info("Clicked on Site Locations Button");
	}
	
	/**
	 * Clicked on New SiteLocations on Case Person Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setState(String str) throws AcisException {
		logger.info("Selecting State");
		scrollingToElementofAPage(stateSelect);
		clickWebElement(stateSelect);
		waitForElement(stateSelect);
		waitForElementClickable(driver.findElement(By.xpath("//a[@title='"+str+"']")));
		clickWebElement(driver.findElement(By.xpath("//a[@title='"+str+"']")));
		waitForPageLoadTill(3);
		logger.info("Selected State");
	}
	
	/**
	 * Entering Text on New Provider Agency Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setTextOnSite(String txtBox, String strText) throws AcisException {
		logger.info("Entering Text on " + txtBox + " TextBox as:" + strText);
		switch (txtBox) {
		case "LocationName":
			waitForElement(locationName);
			enterText(locationName, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Street":
			waitForElement(street);
			enterText(street, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "City":
			waitForElement(city);
			enterText(city, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "ZipCode":
			waitForElement(zipCode);
			enterText(zipCode, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Latitude":
			waitForElement(latitude);
			enterText(latitude, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Longitude":
			waitForElement(longitude);
			enterText(longitude, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		default:
			logger.info(txtBox + " TextBox not found");
			break;
		}

	}

	/**
	 * Select Placement Resource Radio Button and Click Next Created by Dharmesh
	 * Krishna
	 * 
	 * @throws AcisException
	 */
	public void selectRadioButton() throws AcisException {
		logger.info("Selecting Provider Agency Radio Button");
		waitForElement(placementResourceRadio);
		clickWebElement(placementResourceRadio);
		clickWebElement(nextButton);
		logger.info("Selected Provider Agency Radio Button");
	}

	/**
	 * Entering Text on New Placement Resource Page Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setTextOnPlacement(String txtBox, String strText) throws AcisException {
		logger.info("Entering Text on " + txtBox + " TextBox as:" + strText);
		switch (txtBox) {
		case "AccountName":
			waitForElement(accountName);
			enterText(accountName, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Phone":
			waitForElement(phone);
			scrollingToElementofAPage(phone);
			enterText(phone, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "AccountNumber":
			waitForElement(accountNumber);
			enterText(accountNumber, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Capacity":
			scrollingToElementofAPage(capacity);
			waitForElement(capacity);
			enterText(capacity, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Occupancy":
			scrollingToElementofAPage(occupancy);
			waitForElement(occupancy);
			enterText(occupancy, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "MaleAgeMinimum":
			scrollingToElementofAPage(maleAgeMinimum);
			waitForElement(maleAgeMinimum);
			enterText(maleAgeMinimum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "MaleAgeMaximum":
			scrollingToElementofAPage(maleAgeMaximum);
			waitForElement(maleAgeMaximum);
			enterText(maleAgeMaximum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "FemaleAgeMinimum":
			scrollingToElementofAPage(femaleAgeMinimum);
			waitForElement(femaleAgeMinimum);
			enterText(femaleAgeMinimum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "FemaleAgeMaximum":
			scrollingToElementofAPage(femaleAgeMaximum);
			waitForElement(femaleAgeMaximum);
			enterText(femaleAgeMaximum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "NumberOfBeds":
			scrollingToElementofAPage(numberOfBeds);
			waitForElement(numberOfBeds);
			enterText(numberOfBeds, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Email":
			waitForElement(email);
			enterText(email, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "NumberOfChildrenInTheHome":
			scrollingToElementofAPage(numberOfChildrenInTheHome);
			waitForElement(numberOfChildrenInTheHome);
			enterText(numberOfChildrenInTheHome, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		default:
			logger.info(txtBox + " TextBox not found");
			break;
		}

	}

	/**
	 * Select Special Needs able to Foster Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void selectSpecialNeeds(String option) throws AcisException {
		logger.info("Selecting Special Needs able to Foster as :"+option);
		switch (option) {
		case "Medically Complex":
			scrollingToElementofAPage(medicallyComplex);
			waitForElementClickable(medicallyComplex);
			clickWebElement(medicallyComplex);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "Teen Parent":
			scrollingToElementofAPage(teenParent);
			waitForElementClickable(teenParent);
			clickWebElement(teenParent);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "ESL":
			scrollingToElementofAPage(esl);
			waitForElementClickable(esl);
			clickWebElement(esl);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "Disabled":
			scrollingToElementofAPage(disabled);
			waitForElementClickable(disabled);
			clickWebElement(disabled);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "LGBTQ":
			scrollingToElementofAPage(lgbtq);
			waitForElementClickable(lgbtq);
			clickWebElement(lgbtq);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "SEN":
			scrollingToElementofAPage(sen);
			waitForElementClickable(sen);
			clickWebElement(sen);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		default:
			break;
		}
		
	}

	
	/**
	 * Select Status Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void setStatus(String option) throws AcisException {
		logger.info("Selecting Placement Type");
		switch (option) {
		case "Applicant":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(applicant);
			clickWebElement(applicant);
			break;
		case "Submitted":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(submitted);
			clickWebElement(submitted);
			break;
		case "Licensed":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(licensed);
			clickWebElement(licensed);
			break;
		case "OnHold":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(onHold);
			clickWebElement(onHold);
			break;
		case "Closed":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(closed);
			clickWebElement(closed);
			break;

		default:
			break;
		}
		logger.info("Selected Placement Type as:" + option);
	}
	
	/**
	 * Select Placement Type Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void setPlacementType(String option) throws AcisException {
		logger.info("Selecting Placement Type");
		switch (option) {
		case "RelativeFoster":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(relativeFoster);
			clickWebElement(relativeFoster);
			break;
		case "RegularFoster":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(regularFoster);
			clickWebElement(regularFoster);
			break;
		case "TreatmentFoster":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(treatmentFoster);
			clickWebElement(treatmentFoster);
			break;
		case "Kinship":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(Kinship);
			clickWebElement(Kinship);
			break;
		case "RTC":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(rtc);
			clickWebElement(rtc);
			break;
		case "Hospital":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(hospital);
			clickWebElement(hospital);
			break;
		case "GroupHome":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(groupHome);
			clickWebElement(groupHome);
			break;
		case "OwnHome":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(ownHome);
			clickWebElement(ownHome);
			break;

		default:
			break;
		}
		logger.info("Selected Placement Type as:" + option);
	}
	
	
	/**
	 * Save Record Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void clickOnSave() throws AcisException {
		logger.info("Clicking on Save Button");
		clickWebElement(save);
		waitForElement(accountVerify);
		logger.info("Clicked on Save Button");
	}
	
	/**
	 * Save Site Record Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void clickOnSaveSite() throws AcisException {
		logger.info("Clicking on Save Button");
		clickWebElement(save);
		waitForElement(accountVerify);
		logger.info("Clicked on Save Button");
	}
	
	
	/**
	 * Check Status  for Kinship Placement Type
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void checkStatus(String option) throws AcisException {
		logger.info("Checking status Type");
		switch (option) {
		case "Approved":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			Assert.assertTrue(approved.isDisplayed(), "Error : No Approved Status for Kinship Placement Type");
			break;
		case "InProgress":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			Assert.assertTrue(inProgress.isDisplayed(), "Error : No InProgress Status for Kinship Placement Type");
			break;
		case "OnHold":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			Assert.assertTrue(onHold.isDisplayed(), "Error : No OnHold Status for Kinship Placement Type");
			break;
		case "Closed":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			Assert.assertTrue(closed.isDisplayed(), "Error : No Closed Status for Kinship Placement Type");
			break;

		default:
			break;
		}
		logger.info("Checked status as:" + option);
	}
	
	/**
	 * Save Record Created by Virendra
	 * 
	 * @throws AcisException
	 */
	public void GetCapacity() throws AcisException {
		logger.info("Trying to fecth Occupancy Value");
        String expectedCapacity = "51";
        String actualCapacity = capacityValue.getText();
        System.out.println(actualCapacity);

    if(expectedCapacity.equals(actualCapacity)){
        System.out.println("Pass : Occupancy value is updated successfully");
    }
        else {
            System.out.println("Fail");
        }
    logger.info("Occupancy Value is fetched");
	}
	/**
	 * Save Record Created by Virendra
	 * 
	 * @throws AcisException
	 */
	public void GetOccupancy() throws AcisException {
		logger.info("Trying to fecth Occupancy Value");
	        String expectedOccupancy = "51";
	        String actualOccupancy = occupancyValue.getText();
	        System.out.println(actualOccupancy);

	    if(expectedOccupancy.equals(actualOccupancy)){
	        System.out.println("Pass :Occupancy value is updated successfully ");
	    }
	        else {
	            System.out.println("Fail : Occupancy value is not updated");
	        }
	    logger.info("Occupancy Value is fetched");
	}
	/**
	 * Save Record Created by Virendra
	 * 
	 * @throws AcisException
	 */
	
	public void compareCapacityAndOccupancy() throws AcisException {
		logger.info("Trying to fecth Occupancy Value");
	        
	        String OccupancyValue = occupancyValue.getText();
	        int iOccupancyValue = Integer.parseInt(OccupancyValue.trim());
	        String CapacityValue = capacityValue.getText();
	        int icapacityValue = Integer.parseInt(CapacityValue.trim());
	        System.out.println(iOccupancyValue);

	    if(icapacityValue>iOccupancyValue){
	        System.out.println("Pass : Capacity value is greater than Occupancy");
	    }
	        else {
	            System.out.println("Fail: Capacity value is less than Occupancy");
	        }
	    logger.info("Occupancy and Capcity Value caparision is done");
	}
	
		

}
