package com.acis.automation.pages.safetyassessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class InterviewCaregivers_SA_OmniScriptPage extends PageBase {

	public InterviewCaregivers_SA_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(InterviewChildren_SA_OmniScriptPage.class);
	
	
	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement iframe;
	
	@FindBy(xpath = "//span[contains(text(),'Add')]")
	WebElement addButton;
	
	@FindBy(xpath = "//h1[contains(text(),'Interview Caregiver(s)')]")
	WebElement interviewCaregiverTitle;
	
	@FindBy(xpath = "//a[contains(text(),'Create Caregiver(s) Interview')]")
	WebElement createCaregiversInterviewLink;

	@FindBy(xpath = "//input[@id='DateTime4']")
	WebElement interviewCaregiverDateTime;
	
	@FindBy(xpath = "//span[text()='15']")
	WebElement date;
	
	@FindBy(xpath = "//input[@id='Scheduled2']/following-sibling::span")
	WebElement scheduledCheckBox;
	
	@FindBy(xpath = "//input[@id='Unannounced2']/following-sibling::span")
	WebElement unannounchedCheckBox;

	@FindBy(xpath = "//input[@id='Attempted2']/following-sibling::span")
	WebElement attemptedCheckBox;
	
	@FindBy(xpath = "//select[@id='ContactType3']")
	WebElement type;
	
	@FindBy(xpath = "//select[@id='ContactType3']//option[text()='Collateral']")
	WebElement typeCollateral;
	
	@FindBy(xpath = "//select[@id='ContactType3']//option[text()='Visit']")
	WebElement typeVisit;
	
	@FindBy(xpath = "//select[@id='Location2']")
	WebElement location;
	
	@FindBy(xpath = "//select[@id='VisitSubType']")
	WebElement subtype;
	
	@FindBy(xpath = "//select[@id='Method2']")
	WebElement method;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Phone']")
	WebElement methodPhone;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Face-to-Face']")
	WebElement methodFaceToFace;
	
	@FindBy(xpath = "//textarea[@id='Narrative2']")
	WebElement narrative;
	
	@FindBy(xpath = "//textarea[@id='ProfessionalOpinion2']")
	WebElement professionalOpinion;
	
	@FindBy(xpath = "//label[@for='Participants2']")
	WebElement participantsTitle;
	
	@FindBy(xpath = "(//*[@id='Participants2']//input[@type='checkbox']//following-sibling::span)[1]")
	WebElement firstParticipantCheckBox;
	
//	@FindBy(xpath = "//td[text()='demofirst last']/../..//input//following-sibling::span")
//	WebElement participantNameCheckbox;
	
	@FindBy(xpath = "//input[@id='CollateralPerson2']")
	WebElement collateralName;
	
	@FindBy(xpath = "//input[@id='CollateralPhoneEmail2']")
	WebElement collateralPhoneEmail;
	
	@FindBy(xpath = "//div[contains(text(),'Cancel')]")
	WebElement cancelButton;
	
	@FindBy(xpath = "//button[contains(text(),'Save for later')]")
	WebElement saveForLaterButton;
	
	@FindBy(xpath = "//button[text()='Previous']")
	WebElement previousButton;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//div[@id='CaregiverInterview_nextBtn']")
	WebElement saveButton;
	
	@FindBy(xpath = "//span[text()='Close Caregiver Interview']/../..//button")
	WebElement closeCaregiverInterviewTabButton;
	
	@FindBy(xpath="//h1[text()='Assess the Home']")
	WebElement accesstheHomePAgelabel;
	
	

	/**
	 * Check Participant checkbox by name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickParticipantCheckbox(String participantName) throws AcisException {
		
		scrollingToElementofAPage(participantsTitle);
		clickWebElement(driver.findElement(By.xpath("//td[text()='"+ participantName+ "']//preceding-sibling::td//span")));
		logger.info("Checked Participant"+participantName+" checkbox");
	}
	
	/**
	 * Owner : Mrunal
	 * Description: Enter Date
	 * @throws AcisException 
	 */
	public void provideDate() throws AcisException {
		clickWebElement(interviewCaregiverDateTime);
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
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void prvoideLocation(String locationOption) throws AcisException {
		clickWebElement(location);
		
		Select locationList = new Select(location);
		List<WebElement> elementCount = locationList.getOptions();
        int iSize = elementCount.size();

        for (int i = 0; i < iSize; i++) {
            String sValuesubtype = elementCount.get(i).getText();
            System.out.println("Available options: " + sValuesubtype);
            if (sValuesubtype.equalsIgnoreCase(locationOption)) {
            	locationList.selectByVisibleText(locationOption);
                logger.info("Selected location" + locationOption);
                break;
            }
            else {
            	System.out.println("No matching Subtype Value");
            	logger.info("No matching Subtype Value");
            }
        }
		
		
		logger.info("Selected location");
	}
	
	/**
	 * Select subtype
	 * @throws AcisException 
	 */
	public void prvoideSubType(String subtypeOption) throws AcisException {
		clickWebElement(subtype);
		//Select subtypeList = new Select(driver.findElement(By.id("ContactSubtype3")));
		Select subtypeList = new Select(subtype);
		List<WebElement> elementCount = subtypeList.getOptions();
        int iSize = elementCount.size();

        for (int i = 0; i < iSize; i++) {
            String sValuesubtype = elementCount.get(i).getText();
            System.out.println("Available options: " + sValuesubtype);
            if (sValuesubtype.equalsIgnoreCase(subtypeOption)) {
                subtypeList.selectByVisibleText(subtypeOption);
                logger.info("Selected subtype" + subtypeOption);
                break;
            }
            else {
            	System.out.println("No matching Subtype Value");
            	logger.info("No matching Subtype Value");
            }
        }
		logger.info("Selected subtype");
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
	 * Click on Caregiver Interview link
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickCreateChildrenInterviewLink() throws AcisException {
		
		clickWebElemntUsingJavascriptExecutor(createCaregiversInterviewLink);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Caregiver Interview link");
	}
	
	/**
	 * Click on Save button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSavebutton() throws AcisException {
		
		clickWebElement(saveButton);
		waitForPageLoadTill(5);
		logger.info("clicked on Save button");
	}
	
	/**
	 * Close Caregiver Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeCaregiverTab() throws AcisException {
		
		clickWebElement(closeCaregiverInterviewTabButton);
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
		waitForElement(accesstheHomePAgelabel);
		logger.info("User is in the acess the home page");

	}
	
	/**
	 * all textbox
	 * @author mrunal.s.tilekar
	 * @param textFieldName
	 * @param strValue
	 * @throws AcisException
	 */
	
	
	public void enterTextFieldValueOnInterviewChildren(String textFieldName, String strValue) throws AcisException {
		switch(textFieldName)
		{
		   case "collateralname":
			   waitForElement(collateralName);
				enterText(collateralName, strValue);
				logger.info("collateralname entered");
		      break; 
		   
		   case "collateralPhoneEmail":
			   waitForElement(collateralPhoneEmail);
				enterText(collateralPhoneEmail, strValue);
				logger.info("collateralPhoneEmail entered");
		      break;
		      
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
	
	
}
