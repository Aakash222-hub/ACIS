package com.acis.automation.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ProviderAgencyAccountPage extends PageBase {

	public ProviderAgencyAccountPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ProviderAgencyAccountPage.class);

	@FindBy(xpath = "//h2[text()='New Account']/..//span[text()='Provider Agency']")
	WebElement providerAgencyRadio;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//*[text()='Account Name']/../..//input[@type='text']")
	WebElement accountName;
	
	@FindBy(xpath = "//*[text()='Location Name']/../..//input[@type='text']")
	WebElement locationName;
	
	@FindBy(xpath = "//*[text()='Street 1']/../..//input[@type='text']")
	WebElement street;
	
	@FindBy(xpath = "//*[text()='City']/../..//input[@type='text']")
	WebElement city;
	
	@FindBy(xpath = "//*[text()='Latitude']/../..//input[@type='text']")
	WebElement latitude;
	
	@FindBy(xpath = "//*[text()='Longitude']/../..//input[@type='text']")
	WebElement longitude;
	
	@FindBy(xpath = "//*[text()='Zip/Postal Code']/../..//input[@type='text']")
	WebElement zipCode;

	@FindBy(xpath = "//*[text()='Phone']/../..//input[@type='tel']")
	WebElement phone;

	@FindBy(xpath = "//*[text()='Fax']/../..//input[@type='tel']")
	WebElement fax;

	@FindBy(xpath = "//*[text()='Parent Account']/../..//input[@type='text']")
	WebElement parentAccount;

	@FindBy(xpath = "//*[text()='Website']/../..//input[@type='url']")
	WebElement website;

	@FindBy(xpath = "//*[text()='Provider Agency Type']/../..//a")
	WebElement providerAgencyType;

	@FindBy(xpath = "//a[@title='Child Care']")
	WebElement childCare;

	@FindBy(xpath = "//a[@title='Substance Abuse Treatment']")
	WebElement substanceAbuseTreatment;

	@FindBy(xpath = "//a[@title='Transportation']")
	WebElement transportation;

	@FindBy(xpath = "//a[@title='Tutoring']")
	WebElement tutoring;

	@FindBy(xpath = "//a[@title='Licensed Child Placement Agency']")
	WebElement licensedChildPlacementAgency;

	@FindBy(xpath = "//*[text()='Provider']/../..//input")
	WebElement provider;

	@FindBy(xpath = "//*[text()='Email']/../..//input")
	WebElement email;

	@FindBy(xpath = "//*[text()='Description']/../..//textarea")
	WebElement description;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement saveButton;
	
	@FindBy(xpath = "//*[text()='Account ID']/../..//*[contains(text(),'A-00')]")
	WebElement accountVerify;
	
	@FindBy(xpath = "//h1//*[text()='Business Location']")
	WebElement siteAccountVerify;

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
	
	@FindBy(xpath = "//*[text()='Primary Address']/../../input")
	WebElement primaryCheckBox;
	
	@FindBy(xpath = "//lightning-formatted-text[contains(.,'A-')]")
	WebElement accountID;
	
	@FindBy(xpath = "//*[@title='Details']//a")
	WebElement details;
	
	@FindBy(xpath = "//span[text()='Account']/../..//a")
	WebElement siteAccount;
	
	/**
	 * Get AccountID from an Provider Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public String getAccountID() throws AcisException {
		logger.info("Getting Account ID from Provider Account Record Page");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(details);
		waitForElement(accountID);
		logger.info("Getting Account ID");
		System.out.println("Account ID : " +accountID.getText().trim());
		testLoggerInfo("Created Account ID " + accountID.getText().trim());
		logger.info("Returning Account ID from Provider Account Record Page");
		return(accountID.getText().trim());
		
	}
	
	
	/**
	 * Click on Account Name on Site Location Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickSiteAccount() throws AcisException {
		logger.info("Clicking on Account Name on Site Location");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(siteAccount);
		logger.info("Clicked on Account Name on Site location");
	}
	
	/**
	 * Verify AccountID from an Placement Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyAccountID(String accountID) throws AcisException {
		logger.info("Verifying Account ID from Provider Account Record Page");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(details);
		waitForElementClickable(driver.findElement(By.xpath("//lightning-formatted-text[contains(.,'"+accountID+"')]")));
		logger.info("Verified Account ID from Provider Account Record Page");
		
	}

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
	 * Select Provider Agency Radio Button and Click Next Created by Dharmesh
	 * Krishna
	 * 
	 * @throws AcisException
	 */
	public void selectRadioButton() throws AcisException {
		logger.info("Selecting Provider Agency Radio Button");
		waitForElement(providerAgencyRadio);
		clickWebElement(providerAgencyRadio);
		clickWebElement(nextButton);
		logger.info("Selected Provider Agency Radio Button");
	}

	/**
	 * Entering Text on New Provider Agency Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setTextOnProvider(String txtBox, String strText) throws AcisException {
		logger.info("Entering Text on " + txtBox + " TextBox as:" + strText);
		switch (txtBox) {
		case "AccountName":
			waitForElement(accountName);
			enterText(accountName, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Phone":
			waitForElement(phone);
			enterText(phone, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Fax":
			waitForElement(fax);
			enterText(fax, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Website":
			waitForElement(website);
			enterText(website, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Email":
			waitForElement(email);
			enterText(email, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Description":
			waitForElement(description);
			enterText(description, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		default:
			logger.info(txtBox + " TextBox not found");
			break;
		}

	}

	/**
	 * Set Provider Agency Type Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void setProviderAgencyType(String option) throws AcisException {
		logger.info("Selecting Provider Agency Radio Button");
		scrollingToElementofAPage(providerAgencyType);
		waitForElementClickable(providerAgencyType);
		clickWebElement(providerAgencyType);
		switch (option) {
		case "ChildCare":
			waitForElement(childCare);
			clickWebElement(childCare);
			logger.info("Selected Provider Agency Type as:" + option);
			break;
		case "SubstanceAbuseTreatment":
			waitForElement(substanceAbuseTreatment);
			clickWebElement(substanceAbuseTreatment);
			logger.info("Selected Provider Agency Type as:" + option);
			break;

		case "Transportation":
			waitForElement(transportation);
			clickWebElement(transportation);
			logger.info("Selected Provider Agency Type as:" + option);
			break;

		case "Tutoring":
			waitForElement(childCare);
			clickWebElement(childCare);
			logger.info("Selected Provider Agency Type as:" + option);
			break;

		case "LicensedChildPlacementAgency":
			waitForElement(licensedChildPlacementAgency);
			clickWebElement(licensedChildPlacementAgency);
			logger.info("Selected Provider Agency Type as:" + option);
			break;

		default:
			logger.info(option + " Provider Agency Type Not found");
			break;
		}

	}

	/**
	 * Set Parent Account and Provider Account on Provider Agency Account Created by
	 * Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void setDynamicText(String option, String strText) throws AcisException {
		logger.info("Set " + option + " TextBox as:" + strText);
		switch (option) {
		case "ParentAccount":
			scrollingToElementofAPage(parentAccount);
			waitForElementClickable(parentAccount);
			enterText(parentAccount, strText);
			waitForPageLoadTill(5);
			waitForElementClickable(driver.findElement(By.xpath("(//*[contains(@title,'"+strText+"')])[1]")));
			clickWebElement(driver.findElement(By.xpath("(//*[contains(@title,'"+strText+"')])[1]")));
			waitForPageLoadTill(5);
			logger.info("Entered " + option + " TextBox as:" + strText);
			break;
		case "ProviderAccount":
			scrollingToElementofAPage(provider);
			waitForElementClickable(provider);
			enterText(provider, strText);
			waitForPageLoadTill(5);
			waitForElementClickable(driver.findElement(By.xpath("(//*[contains(@title,'"+strText+"')])[1]")));
			clickWebElement(driver.findElement(By.xpath("(//*[contains(@title,'"+strText+"')])[1]")));
			waitForPageLoadTill(5);
			logger.info("Entered " + option + " TextBox as:" + strText);
			break;
		default:
			break;
		}

	}


	/**
	 * Save Record Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void clickOnSave() throws AcisException {
		logger.info("Clicking on Save Button");
		clickWebElement(saveButton);
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
		clickWebElement(saveButton);
		waitForElement(siteAccountVerify);
		logger.info("Clicked on Save Button");
	}
}
