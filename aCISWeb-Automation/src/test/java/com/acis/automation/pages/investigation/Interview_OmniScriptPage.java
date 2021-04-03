package com.acis.automation.pages.investigation;

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

public class Interview_OmniScriptPage extends PageBase{

	public Interview_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(Interview_OmniScriptPage.class);
	
	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement iframe;
	
	@FindBy(xpath = "//h1[contains(text(),'Interview')]")
	WebElement interviewTitle;
	
	@FindBy(xpath = "//a[contains(text(),'Create Interview')]")
	WebElement createInterviewLink;
	
	@FindBy(xpath = "//input[@id='DateTime2']")
	WebElement interviewDateTime;
	
	@FindBy(xpath = "//span[text()='15']")
	WebElement date;
	
	@FindBy(xpath = "//select[@id='Location2']")
	WebElement location;
	
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Foster Home']")
	WebElement locationFosterHome;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Biological Home']")
	WebElement locationBiologicalHome;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='DCS Office']")
	WebElement locationDcsOffice;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Service Provider']")
	WebElement locationServiceProvider;
	
	@FindBy(xpath = "//select[@id='Method2']")
	WebElement method;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Teleconference']")
	WebElement methodPhone;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Video Conference']")
	WebElement methodFaceToFace;
	
	@FindBy(xpath = "//textarea[@id='Narrative2']")
	WebElement narrative;
	
	@FindBy(xpath = "//textarea[@id='ProfessionalOpinion2']")
	WebElement professionalOpinion;
	
	@FindBy(xpath = "//select[@id='SubtypeMerge']")
	WebElement subtype;
	
	@FindBy(xpath = "//select[@id='SubtypeMerge']//*[text()='Child']")
	WebElement subtypeChild;
	
	@FindBy(xpath = "//select[@id='ContactSubtype2']//option[text()='Foster Parent']")
	WebElement subtypeFosterParent;
	
	@FindBy(xpath = "//select[@id='ContactSubtype2']//option[text()='Biological Parent']")
	WebElement subtypeBiologicalParent;
	
	@FindBy(xpath = "//select[@id='ContactSubtype2']//option[text()='Relative']")
	WebElement subtypeRelative;
	
	@FindBy(xpath = "//select[@id='ContactSubtype2']//option[text()='Prospective Provider']")
	WebElement subtypeProspectiveProvider;
	
	@FindBy(xpath = "//select[@id='ContactType2']")
	WebElement type;

	@FindBy(xpath = "//select[@id='ContactType2']//option[text()='Visit']")
	WebElement typeVisit;
	
	@FindBy(xpath = "//div[@id='Interviews_nextBtn']")
	WebElement saveButtonInterview;
	
	@FindBy(xpath = "//input[@id='Scheduled2']/following-sibling::span")
	WebElement scheduledCheckBox;
	
	@FindBy(xpath = "//input[@id='Unannounced2']/following-sibling::span")
	WebElement unannouncedCheckBox;
	
	@FindBy(xpath = "//input[@id='Attempted2']/following-sibling::span")
	WebElement attemptedCheckBox;
	
	@FindBy(xpath = "//label[@for='Participants']")
	WebElement participants;
	
	@FindBy(xpath = "(//*[@id='Participants']//input[@type='checkbox']//following-sibling::span)[1]")
	WebElement firstParticipantsCheckbox;
	
	@FindBy(xpath = "//div[contains(text(),'Cancel')]")
	WebElement cancelButton;
	
	@FindBy(xpath = "//button[contains(text(),'Save for later')]")
	WebElement saveForLaterButton;
	
	@FindBy(xpath = "//button[text()='Previous']")
	WebElement previousButton;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//button[@title='Close Interview']")
	WebElement closeInterviewTabButton;

	@FindBy(xpath = "//h1[text()='Collateral Contact(s)']")
	WebElement verifyContactLabel;
	
	@FindBy(xpath = "//*[contains(text(),'The interview details are saved. Close this tab to return to the investigation workflow')]")
	WebElement interviewClosedMessgae;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement okButton;
	
	@FindBy(xpath = "//*[contains(text(),'Your OmniScript is saved for later')]")
	WebElement saveLaterMessgae;
	
	@FindBy(xpath = "//*[contains(text(),'Copy the link')]")
	WebElement copyLinkText;
	
	@FindBy(xpath = "//*[contains(text(),'Email me the link')]")
	WebElement emailMeLinkText;
	
	@FindBy(xpath = "//*[contains(text(),'To resume, please click or bookmark the')]")
	WebElement toResumeMessage;
	
	@FindBy(xpath = "(//p[contains(text(),'Please ensure interviews with')])[2]")
	WebElement warningCheck;
	
	//Khushboo
	@FindBy(xpath="//p[text()='Error : Please fix all the fields with errors.']")
	WebElement errorMessage;
	
	@FindBy(xpath="//button[@id='alert-ok-button']")
	WebElement alertOKButton;
	
	
	/**
	 * Owner : Mrunal
	 * Description: Switch iFrame
	 * @throws AcisException 
	 */
	public void iframeSwitch() throws AcisException {
		logger.info("Switching to iframe");			
		switchToFrameByWebElement(iframe);
		logger.info("Switching to iframe");	
	}

	/**
	 * Check Participant checkbox by name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickParticipantCheckbox(String participantName) throws AcisException {
		
		scrollingToElementofAPage(participants);
		clickWebElement(driver.findElement(By.xpath("//td[contains(text(),'"+participantName+"')]//preceding-sibling::td//span")));
		logger.info("Checked Participant"+participantName+" checkbox");
	}
	
	/**
	 * Owner : Mrunal
	 * Description: Enter Date
	 * @throws AcisException 
	 */
	public void provideDate() throws AcisException {
		waitForElementClickable(interviewDateTime);
		clickWebElemntUsingJavascriptExecutor(interviewDateTime);
		clickWebElement(date);
		logger.info("Enter Date");	
	}
	
	
	/**
	 * Select type
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void prvoideType(String typeOption) throws AcisException {
		waitForPageLoad();
		
		switch (typeOption) {
		case "Visit":
			clickWebElement(type);
			clickWebElement(typeVisit);
			waitForPageLoadTill(2);
			logger.info("Selected type Visit");
			break;
			
		default:
			logger.info("Error : No Matching Selected Type Value");
			break;
		}
		
	}
	
	/**
	 * Select location
	 * @throws AcisException 
	 */
	public void prvoideLocation(String locationOption) throws AcisException {
		
		switch (locationOption) {
		case "Foster Home":
			clickWebElement(location);
			clickWebElement(locationFosterHome);
			waitForPageLoadTill(2);
			logger.info("Selected location Foster Home");	
			break;
			
		case "Biological Home":
			clickWebElement(location);
			clickWebElement(locationBiologicalHome);
			waitForPageLoadTill(2);
			logger.info("Selected location Biological Home");	
			break;
			
		case "DCS Office":
			clickWebElement(location);
			clickWebElement(locationDcsOffice);
			waitForPageLoadTill(2);
			logger.info("Selected location DCS office");	
			break;
			
		case "Service Provider":
			clickWebElement(location);
			clickWebElement(locationServiceProvider);
			waitForPageLoadTill(2);
			logger.info("Selected location Service Provider");	
			break;

		default:
			logger.info("No matching location value");	
			break;
		}
		
		
	}
	
	/**
	 * Select subtype
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void prvoideSubType(String subtypeOption) throws AcisException {
		
		switch (subtypeOption) {
		case "Child":
			clickWebElement(subtype);
			clickWebElement(subtypeChild);
			waitForPageLoadTill(2);
			logger.info("Selected subtype child");
			break;
			
		case "Foster Parent":
			clickWebElement(subtype);
			clickWebElement(subtypeFosterParent);
			waitForPageLoadTill(2);
			logger.info("Selected subtype Foster Parent");
			break;
			
		case "Biological Parent":
			clickWebElement(subtype);
			clickWebElement(subtypeBiologicalParent);
			waitForPageLoadTill(2);
			logger.info("Selected subtype Biological Parent");
			break;
			
		case "Relative":
			clickWebElement(subtype);
			clickWebElement(subtypeRelative);
			waitForPageLoadTill(2);
			logger.info("Selected subtype Relative");
			break;
			
		case "Prospective Provider":
			clickWebElement(subtype);
			clickWebElement(subtypeProspectiveProvider);
			waitForPageLoadTill(2);
			logger.info("Selected subtype Prospective Provider");
			break;

		default:
			logger.info("No seleted subtype");
			break;
		}
	
	}
	
	/**
	 * Select method
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
	 * Click on  Interview link
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickCreateInterviewLink() throws AcisException {
		
		clickWebElemntUsingJavascriptExecutor(createInterviewLink);
		waitForPageLoad();
		waitForPageLoadTill(9);
		waitForElement(iframe);
		logger.info("Clicked on  Interview link");
	}
	
	/**
	 * Click on Save button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSavebutton() throws AcisException {
		 Actions act = new Actions(driver);
         
         act.sendKeys(Keys.END).build().perform();
		clickWebElement(saveButtonInterview);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("clicked on Save button");
	}
	
	/**
	 * Close Caregiver Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeCaregiverTab() throws AcisException {
		switchToDefaultContent();
		clickWebElemntUsingJavascriptExecutor(closeInterviewTabButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Closed Caregiver Tab");
	}
	
	
	/**
	 * click on Next button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickNextButton() throws AcisException {
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(verifyContactLabel);
		logger.info("clicked on Next button");

	}
	

	/**
	 * Select first participant checkbox
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void checkFirstParticipantChechbox() throws AcisException {
		
		scrollingToElementofAPage(participants);
		clickWebElement(firstParticipantsCheckbox);
		logger.info("Selected first participant checkbox");
	}
	
	/**
	 * all textbox
	 * @author mrunal.s.tilekar
	 * @param textFieldName
	 * @param strValue
	 * @throws AcisException
	 */
	
	
	public void enterTextFieldValueOnInterview(String textFieldName, String strValue) throws AcisException {
		switch(textFieldName)
		{
		   case "narrative":
			   waitForElement(narrative);
				enterText(narrative, strValue);
				logger.info("narrative entered");
		      break;
		      
		   case "profesionalopinion":
			   waitForElement(professionalOpinion);
				enterText(professionalOpinion, strValue);
				logger.info("profesionalopinion entered");
		      break;
		   
		   default : 
			   logger.info("Text Field Value: " + textFieldName+"did not find");
		}
	
	}
	
	/**
	 * Verify Message :The interview details are saved. Close this tab to return to the investigation workflow
	 * @author mrunal.s.tilekar
	 */
	public void verifyInterviewClosedTabMessage() {
		
		logger.info("Verifing Message :The interview details are saved. Close this tab to return to the investigation workflow");
		Assert.assertTrue(interviewClosedMessgae.isDisplayed(), "Error : No interview tab closed message displayed");
		logger.info("Verified Message :The interview details are saved. Close this tab to return to the investigation workflow");	
		
	}

	/**
	 * Click on Save for later button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSaveForLaterbutton() throws AcisException {
		
		clickWebElement(saveForLaterButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(okButton);
		logger.info("clicked on Save For Later button");
	}
	
	
	/**
	 * Verify Save for later messages
	 * @author mrunal.s.tilekar
	 */
	public void verifySaveForLaterMessage() {
		logger.info(" Verifying Save for later messages");	
		Assert.assertTrue(saveLaterMessgae.isDisplayed(), "Error: No Save For later messgae");
		Assert.assertTrue(toResumeMessage.isDisplayed(), "Error: No To resume later messgae");
		Assert.assertTrue(copyLinkText.isDisplayed(), "Error: No copy link present ");
		Assert.assertTrue(emailMeLinkText.isDisplayed(), "Error: No Email me link present");
		logger.info("Verified Save for later messages");	
	}
	
	/**
	 * Click on Ok button after Save for later button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickOkbutton() throws AcisException {
		
		clickWebElement(okButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(saveLaterMessgae);
		logger.info("clicked on Save For Later button");
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

	
}
