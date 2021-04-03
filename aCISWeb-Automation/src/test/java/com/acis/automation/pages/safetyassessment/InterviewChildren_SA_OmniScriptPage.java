package com.acis.automation.pages.safetyassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class InterviewChildren_SA_OmniScriptPage extends PageBase{

	public InterviewChildren_SA_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(InterviewChildren_SA_OmniScriptPage.class);
	

	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement iframe;
	
	@FindBy(xpath = "//h1[contains(text(),'Interview Child(ren)')]")
	WebElement interviewChildrenTitle;
	
	@FindBy(xpath = "//a[contains(text(),'Create Child(ren) Interview')]")
	WebElement createChildrenInterviewLink;
	
	@FindBy(xpath = "//input[@id='DateTime3']")
	WebElement interviewChildrenDateTime;
	
	@FindBy(xpath = "//span[text()='15']")
	WebElement date;
	
	@FindBy(xpath = "//button[@title='Next Month']")
	WebElement nextMonth;
	
	@FindBy(xpath = "//div[contains(text(),'These required fields must be completed: Date/Time, Type, Subtype, Narrative, and Professional Opinion')]")
	WebElement requiredFieldErrorMessage;
	
	@FindBy(xpath = "//select[@id='Location']")
	WebElement location;
	
	@FindBy(xpath = "//select[@id='Location']//option[text()='Foster Home']")
	WebElement locationFosterHome;
	
	@FindBy(xpath = "//select[@id='Location']//option[text()='Biological Home']")
	WebElement locationBiologicalHome;
	
	@FindBy(xpath = "//select[@id='Location']//option[text()='DCS Office']")
	WebElement locationDcsOffice;
	
	@FindBy(xpath = "//select[@id='Location']//option[text()='Service Provider']")
	WebElement locationServiceProvider;
	
	@FindBy(xpath = "//select[@id='Method']")
	WebElement method;
	
	@FindBy(xpath = "//select[@id='Method']//option[text()='Phone']")
	WebElement methodPhone;
	
	@FindBy(xpath = "//select[@id='Method']//option[text()='Face-to-Face']")
	WebElement methodFaceToFace;
	
	@FindBy(xpath = "//textarea[@id='Narrative']")
	WebElement narrative;
	
	@FindBy(xpath = "//textarea[@id='ProfessionalOpinion']")
	WebElement professionalOpinion;
	
	@FindBy(xpath = "//select[@id='VisitSubType']")
	WebElement subtype;
	
	@FindBy(xpath = "//select[@id='VisitSubType']//option[text()='Child']")
	WebElement subtypeChild;
	
	@FindBy(xpath = "//select[@id='VisitSubType']//option[text()='Foster Parent']")
	WebElement subtypeFosterParent;
	
	@FindBy(xpath = "//select[@id='VisitSubType']//option[text()='Biological Parent']")
	WebElement subtypeBiologicalParent;
	
	@FindBy(xpath = "//select[@id='VisitSubType']//option[text()='Relative']")
	WebElement subtypeRelative;
	
	@FindBy(xpath = "//select[@id='VisitSubType']//option[text()='Prospective Provider']")
	WebElement subtypeProspectiveProvider;
	
	@FindBy(xpath = "//select[@id='ContactType2']")
	WebElement type;
	
	@FindBy(xpath = "//select[@id='ContactType2']//option[text()='Collateral']")
	WebElement typeCollateral;

	@FindBy(xpath = "//select[@id='ContactType2']//option[text()='Visit']")
	WebElement typeVisit;
	
	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveButtonInterviewChildren;
	
	@FindBy(xpath = "//input[@id='Scheduled']/following-sibling::span")
	WebElement scheduledCheckBox;
	
	@FindBy(xpath = "//input[@id='Unannounced']/following-sibling::span")
	WebElement unannouncedCheckBox;
	
	@FindBy(xpath = "//input[@id='Attempted']/following-sibling::span")
	WebElement attemptedCheckBox;
	
	@FindBy(xpath = "//label[@for='Participants']")
	WebElement participants;
	
	@FindBy(xpath = "(//*[@id='Participants']//input[@type='checkbox']//following-sibling::span)[1]")
	WebElement firstParticipantsCheckbox;
	
	@FindBy(xpath = "//input[@id='CollateralPerson']")
	WebElement collateralName;
	
	@FindBy(xpath = "//input[@id='CollateralPhoneEmail']")
	WebElement collateralPhoneEmail;
	
	@FindBy(xpath = "//div[contains(text(),'Cancel')]")
	WebElement cancelButton;
	
	@FindBy(xpath = "//button[contains(text(),'Save for later')]")
	WebElement saveForLaterButton;
	
	@FindBy(xpath = "//div[@id='ChildInterviews_prevBtn']")
	WebElement previousButton;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//span[text()='Close Child Interview']/../..//button")
	WebElement closeChildInterviewTabButton;
	
	@FindBy(xpath="//h1[text()='Interview Caregiver(s)']")
	WebElement interviewCaregiverTitle;
	
	@FindBy(xpath="//button[contains(text(),'Today')]")
	WebElement todayDate;
	
	

	/**
	 * Check Participant checkbox by name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickParticipantCheckbox(String participantName) throws AcisException {
		
		scrollingToElementofAPage(participants);
		clickWebElement(driver.findElement(By.xpath("//td[text()='"+participantName+"']//preceding-sibling::td//span")));
		logger.info("Checked Participant"+participantName+" checkbox");
	}

	/**
	 * Owner : Mrunal
	 * Description: Enter Date
	 * @throws AcisException 
	 */
	public void provideDate() throws AcisException {
		clickWebElement(interviewChildrenDateTime);
		clickWebElement(date);
		logger.info("Enter Date");	
	}
	
	/**
	 * Ownwer: Mrunal
	 * Verify Error:These required fields must be completed: Date/Time, Type, Subtype, Narrative, and Professional Opinion
	 */
	public void verifyRequiredFieldError() {
		
		waitForElement(requiredFieldErrorMessage);
		logger.info("Verify Error:These required fields must be completed: Date/Time, Type, Subtype, Narrative, and Professional Opinion");	
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

		case "Collateral":
			clickWebElement(type);
			clickWebElement(typeCollateral);
			waitForPageLoadTill(2);
			logger.info("Selected type collateral");
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
	 * Click on children Interview link
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickCreateChildrenInterviewLink() throws AcisException {
		
		clickWebElemntUsingJavascriptExecutor(createChildrenInterviewLink);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Children Interview link");
	}
	
	/**
	 * Click on Save button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSavebutton() throws AcisException {
		
		clickWebElement(saveButtonInterviewChildren);
		waitForPageLoadTill(5);
		logger.info("clicked on Save button");
	}
	
	/**
	 * Close Caregiver Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeCaregiverTab() throws AcisException {
		
		clickWebElement(closeChildInterviewTabButton);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Closed Caregiver Tab");
	}
	
	
	/**
	 * click on Next button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickNextButton() throws AcisException {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForElementClickable(nextButton);
		clickWebElement(nextButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("clicked on Next button");
		waitForElement(interviewCaregiverTitle);
		logger.info("User is in the interview Caregiver Page");

	}
	

	/**
	 * all textbox
	 * @author mrunal.s.tilekar
	 * @param textFieldName
	 * @param strValue
	 * @throws AcisException
	 */
	
	
	public void enterTextUsingJavascriptFieldValueOnInterviewChildren(String textFieldName, String strValue) throws AcisException {
		switch(textFieldName)
		{
		   case "collateralname":
			   waitForElement(collateralName); 
				enterTextUsingJavascript(collateralName, strValue);
				logger.info("collateralname entered"); 
		      break;
		   
		   case "collateralPhoneEmail":
			   waitForElement(collateralPhoneEmail);
				enterTextUsingJavascript(collateralPhoneEmail, strValue);
				logger.info("collateralPhoneEmail entered");
		      break;
		      
		   case "narrative":
			   waitForElement(narrative);
			   
			   Actions actions = new Actions(driver);
               clickWebElement(narrative);
               actions.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
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
	 * Owner : Mrunal
	 * Description: Enter  Date
	 * @throws AcisException 
	 */
	public void provideDifferentDate(String dateType) throws AcisException {
		logger.info("Entering Date");	
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(interviewChildrenDateTime);
		switch (dateType) {
		case "Today":
			logger.info("Entering today's date");
			clickWebElement(interviewChildrenDateTime);
			waitForElementClickable(todayDate);
			scrollingToElementofAPage(todayDate);
			clickWebElemntUsingJavascriptExecutor(todayDate);
			logger.info("Entered today's Date");	
			
			break;
			
		case "Next Month":
			logger.info("Entering Next Month date");
			clickWebElement(interviewChildrenDateTime);
			waitForElementClickable(nextMonth);
			clickWebElement(nextMonth);
			waitForElement(date);
			clickWebElement(date);
			logger.info("Entered Next Month Date");	
			
			break;

		default:
			logger.info("No matching option");	
			break;
		}
		
	}
}
