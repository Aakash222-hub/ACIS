package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ServiceProvidedkPage extends PageBase {
	final static Logger logger = LoggerFactory.getLogger(ServiceProvidedkPage.class);
	
	public ServiceProvidedkPage() throws AcisException {
	}	
	
	@FindBy(xpath = "//label[text()='Service Recipient']//..//..//..//input")
	WebElement ClickServiceRecipient;
	@FindBy(xpath = "(//label[text()='Service Recipient']/../../..//lightning-base-combobox-item//*[text()='Mark Waugh'])[last()]")
	WebElement SelectMarkWaugh;
	@FindBy(xpath = "(//label[text()='Service Recipient']/../../..//lightning-base-combobox-item//*[text()='Steve waugh'])[last()]")
	WebElement SelectSteveWaugh;
	@FindBy(xpath = "(//label[text()='Service Recipient']/../../..//lightning-base-combobox-item//*[text()= 'PR_05'])[last()]")
	WebElement SelectPR_05;
		
	@FindBy(xpath ="//label[text()='Service Type']//..//..//..//input")
	WebElement ClickServiceType;
	@FindBy(xpath ="(//label[text()='Service Type']/../../..//lightning-base-combobox-item//*[text()='Child Care'])[last()]")
	WebElement SelctChildCare;
	@FindBy(xpath ="(//label[text()='Service Type']/../../..//lightning-base-combobox-item//*[text()='Substance Abuse Treatment'])[last()]")
	WebElement SelctSubstanceAbuseTreatment;
	@FindBy(xpath ="(//label[text()='Service Type']/../../..//lightning-base-combobox-item//*[text()='Transportation'])[last()]")
	WebElement SelctTransportation;
	@FindBy(xpath ="(//label[text()='Service Type']/../../..//lightning-base-combobox-item//*[text()='Tutoring'])[last()]")
	WebElement SelctTutoring;
	
	
	@FindBy(xpath ="//*[@name='ACIS_Amount__c']")
	WebElement ACISAmount;
	//@FindBy(xpath ="(//*[contains(text(),'Enrollment Date')]/..//input)[last()]")
	@FindBy(xpath ="//label[text()='Discharge Date']//..//..//..//input")
	WebElement EnrollmentDate;
	@FindBy(xpath ="(//*[text()='10/19/2020']")
	WebElement slectEnrollmentDate;
	@FindBy(xpath ="//label[text()='Referral Date']//..//..//..//input")
	WebElement ReferralDate;
	@FindBy(xpath ="//*[text()='10/19/2020']")
	WebElement selectReferralDate;
	@FindBy(xpath ="//label[text()='Discharge Date']//..//..//..//input")
        WebElement DischargeDate;
	@FindBy(xpath ="//*[text()='10/19/2020']")
        WebElement slectDischargeDate;
	@FindBy(xpath ="//label[text()='Provider Agency']//..//..//input[@placeholder='Search Accounts...']")
	WebElement ClickProviderAgency;
	@FindBy(xpath ="//input[@placeholder='Provider agency one']")
	WebElement SelectProviderAgency;
	
	
	@FindBy(xpath ="//label[text()='Frequency']/..//div/lightning-base-combobox")
	WebElement ClickONFrequency;
	@FindBy(xpath ="//label[text()='Frequency']/..//div//*[text()='Monthly']")
    WebElement SelectFrequencyMontly;
	@FindBy(xpath ="//label[text()='Frequency']/..//div//*[text()='Daily']")
    WebElement SelectFrequencyDaily;
    @FindBy(xpath ="//label[text()='Frequency']/..//div//*[text()='Weekly']")
    WebElement SelectFrequencyWeekly;
    @FindBy(xpath ="//label[text()='Frequency']/..//div//*[text()='Other']")
    WebElement SelectFrequencyOther;
	@FindBy(xpath ="//input[@name='ACIS_Other_Frequency__c']")
    WebElement OtherFrequency;
	@FindBy(xpath ="//button[@title='Cancel' and @type='button']")
	WebElement CancelButton;
	@FindBy(xpath ="//button[@title='Save & New' and @type='button']")
	WebElement SaveAndsendButton;
	@FindBy(xpath ="//button[@title='Save' and @type='button']")
	WebElement SaveButton;
	@FindBy(xpath ="//button[@title='Undo' and @type='button']")
	WebElement RefreshButton;
	@FindBy(xpath ="//*[@name='ACIS_Status__c']")
	WebElement ActiveCheckBox;
	
	

	
	/**
	 * Clicking on cancel Button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickCancelButton() throws AcisException {
		
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		logger.info("Clicking on Cancel Button");
		clickWebElement(CancelButton);
		logger.info("Clicked on CancelButton button");
		
		
	}
	/**
	 * Clicking on save Button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("Clicking on Save Button");
		clickWebElement(SaveButton);
		logger.info("Clicked on SaveButton button");
		
		
	}
	/**
	 * Selecting Active Check box
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	
	public void selectActiveCheckBox() throws AcisException {
		logger.info("Clicking on Active CheckBox");
		clickWebElement(ActiveCheckBox);
		logger.info("Clicked on Active CheckBox");
		
		
	}
	/**
	 * Clicking on Refresh Button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void selectRefreshButton() throws AcisException {
		logger.info("Clicking on Refresh Button");
		clickWebElement(RefreshButton);
		logger.info("Clicked on Refresh Button");
		
		
	}
	/**
	 * Setting the Amount
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void setAmount(String amt) throws AcisException {
		
		enterText(ACISAmount, amt);
		
		logger.info("Amount provided is:"+amt);	
	}
	
	/**
	 * Setting the Other frequency
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
public void setOtherFrequency(String str1) throws AcisException {
		
		enterText(OtherFrequency, str1);
		
		logger.info("OtherFrequency provided is:"+str1);	
	}
/**
 * Selecting the Enrollment date
 * 
 * @author virendra.kumar
 * @throws AcisException
 * @throws InterruptedException
 */
	public void setDate(String field, String selectDate) throws AcisException, InterruptedException{
		
		switch(field)
		{
			case "Enrollment Date" :
				logger.info("Selecting Enrollment Date");
				waitForElement(EnrollmentDate);
				clickWebElement(EnrollmentDate);
				waitForPageLoadTill(5);
				clickWebElement(slectEnrollmentDate);
				logger.info("EnrollmentDate Date succesfully selected");
				break;
				
			case "Discharge Date" :
				logger.info("Selecting DischargeDate Date");
				waitForElement(ReferralDate);
				clickWebElement(ReferralDate);
				waitForPageLoadTill(5);
				clickWebElement(selectReferralDate);
				logger.info("Incident Date succesfully selected");
				break;
				
			case "Referral Date" :
				logger.info("Selecting ReferralDate Date");
				waitForElement(DischargeDate);
				clickWebElement(DischargeDate);
				waitForPageLoadTill(5);
				clickWebElement(slectDischargeDate);
				logger.info("Referral Date Date succesfully selected");
				break;
			default : 
				   logger.info("Date: " + field +" not found");
				   break;
		}
	}

	
	/**
	 * Selecting the Service Tyoe
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
public void selectServiceType(String field) throws AcisException, InterruptedException{
		
		switch(field)
		{
		
				
			case "Child Care" :
				logger.info("Selecting Child Care");
				clickWebElement(ClickServiceType);
				waitForPageLoadTill(2);
				clickWebElement(SelctChildCare);
				waitForPageLoadTill(5);
				logger.info("Child Care succesfully selected");
				break;
				
			case "Substance Abuse Treatment" :
				logger.info("Substance Abuse Treatment");
				clickWebElement(ClickServiceType);
				waitForPageLoadTill(5);
				clickWebElement(SelctSubstanceAbuseTreatment);
				logger.info("Substance Abuse Treatment");
				break;
			case "Transportation" :
				logger.info("Selecting Transportation");
				clickWebElement(ClickServiceType);
				waitForPageLoadTill(5);
				clickWebElement(SelctTransportation);
				logger.info("Transportation succesfully selected");
				break;
				
			case "Tutoring" :
				logger.info("Selecting Tutoring");
				clickWebElement(ClickServiceType);
				waitForPageLoadTill(5);
				clickWebElement(SelctTutoring);
				logger.info("None succesfully selected");
				break;
			default : 
				   logger.info("Service Type: " + field +" not found");
				   break;
		}
}
/**
 * Selecting the Frequency
 * 
 * @author virendra.kumar
 * @throws AcisException
 * @throws InterruptedException
 */
		public void selectFrequency(String field) throws AcisException, InterruptedException{
			
			switch(field)
			{		
				case "Monthly" :
					logger.info("Selecting Monthly Frequency");
					waitForElement(ClickONFrequency);
					clickWebElement(ClickONFrequency);
					waitForPageLoadTill(5);
					clickWebElement(SelectFrequencyMontly);
					
					logger.info("Monthly succesfully selected");
					break;
					
				case "Daily" :
					logger.info("Selecting Daily Frequency");
					waitForElement(ClickONFrequency);
					clickWebElement(ClickONFrequency);
					waitForPageLoadTill(5);
					clickWebElement(SelectFrequencyDaily);
					logger.info("Daily succesfully selected");
					break;
				case "Weekly" :
					logger.info("Selecting Weekly Frequency");
					waitForElement(ClickONFrequency);
					clickWebElement(ClickONFrequency);
					waitForPageLoadTill(5);
					clickWebElement(SelectFrequencyWeekly);
					logger.info("Daily succesfully selected");
					logger.info("Weekly Frequency succesfully selected");
					break;
					
				case "Other" :
					logger.info("Selecting Other");
					waitForElement(ClickONFrequency);
					clickWebElement(ClickONFrequency);
					waitForPageLoadTill(5);
					clickWebElement(SelectFrequencyOther);
					logger.info("Other succesfully selected");
					break;
				default : 
					   logger.info("Frequency: " + field +" not found");
					   break;
			}
	}

		/**
		 * Selecting the Service Type
		 * 
		 * @author virendra.kumar
		 * @throws AcisException
		 * @throws InterruptedException
		 */
		
         public void selectServiceRecipient(String field) throws AcisException, InterruptedException{
			
			switch(field)
			{
				case "Steve waugh" :
					logger.info("Selecting Steve waugh");
					waitForElement(ClickServiceRecipient);
					clickWebElement(ClickServiceRecipient);
					waitForPageLoadTill(5);
					clickWebElement(SelectSteveWaugh);
					logger.info("Steve succesfully selected");
					break;
					
				case "Mark Waugh" :
					logger.info("Selecting Monthly Frequency");
					waitForElement(ClickServiceRecipient);
					clickWebElement(ClickServiceRecipient);
					waitForPageLoadTill(5);
					clickWebElement(SelectMarkWaugh);
					logger.info("Monthly succesfully selected");
					break;
					
				case "PR_05" :
					logger.info("Selecting Daily Frequency");
					waitForElement(ClickServiceRecipient);
					clickWebElement(ClickServiceRecipient);
					waitForPageLoadTill(5);
					clickWebElement(SelectPR_05);
					logger.info("Daily succesfully selected");
					break;
				case "Paul Walson" :
					logger.info("Selecting Weekly Frequency");
					waitForElement(driver.findElement(By.xpath("//label[text()='Service Type']/..//div//*[@data-value=+'field']")));
					clickWebElement(driver.findElement(By.xpath("//label[text()='Service Type']/..//div//*[@data-value=+'field']")));
					waitForPageLoadTill(5);
					logger.info("Weekly Frequency succesfully selected");
					break;
					
				case "Other" :
					logger.info("Selecting Other");
					waitForElement(driver.findElement(By.xpath("//label[text()='Service Type']/..//div//*[@data-value=+'field']")));
					clickWebElement(driver.findElement(By.xpath("//label[text()='Service Type']/..//div//*[@data-value=+'field']")));
					waitForPageLoadTill(5);
					logger.info("Other succesfully selected");
					break;
				default : 
					   logger.info("Frequency: " + field +" not found");
					   break;
			}
	}
         
         /**
          * Selecting the Provider Agency
          * 
          * @author virendra.kumar
          * @throws AcisException
          * @throws InterruptedException
          */
         public void selectProviderAgency(String field) throws AcisException, InterruptedException{
	
	switch(field)
	{
		case "Provider Agency One" :
			logger.info("Selecting Provider Agency One");
			clickWebElement(ClickProviderAgency);
			waitForPageLoadTill(5);
			clickWebElement(SelectProviderAgency);
			waitForPageLoadTill(5);
			logger.info("Provider Agency One succesfully selected");
			break;
			
		default : 
			   logger.info("Provider Agency: " + field +" not found");
			   break;
	}
}


}

