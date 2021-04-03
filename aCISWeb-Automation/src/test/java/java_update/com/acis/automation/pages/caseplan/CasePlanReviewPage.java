package com.acis.automation.pages.caseplan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CasePlanReviewPage extends PageBase {

	public CasePlanReviewPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CasePlanReviewPage.class);
	
	@FindBy(xpath = "(//a[contains(text(),'CP-')])[1]")
	WebElement caseIdLink;

	@FindBy(xpath = "//button[contains(normalize-space(),'New Case Plan')]")
	WebElement newCasePlan;

	@FindBy(xpath = "(//div[@class='slds-media__body']//p)[2]")
	WebElement error;

	@FindBy(xpath = "//a[text()='Case Plan Review']")
	WebElement casePlanReview;

	@FindBy(xpath = "(//span[text()='Permanency Plan']//..//..//..//..//button)[1]")
	WebElement editButtonPermannecyPlan;

	@FindBy(xpath = "//button[@title='Save']//span[contains(@class,'label bBody')][contains(normalize-space(),'Save')]")
	WebElement saveButtonAgency;

	@FindBy(xpath = "(//*[text()='Type of Service']/../../..//li//*[text()='Substance Abuse Treatment'])[last()]")
	WebElement substanceAbuseTreatment;

	@FindBy(xpath = "(//span[text()='Case Plans'])[1]")
	WebElement casePlan3;

	@FindBy(xpath = "//*[text()='Please complete the Case Plan Review by entering Agency & Parent Progress on all sections.']")
	WebElement caseIncompleteerro;

	@FindBy(xpath = "(//span[text()='Permanency Plan'])[3]//..//..//a")
	WebElement permanencyPlan1;

	@FindBy(xpath = "(//*[@title='Meets'])[last()]")
	WebElement meetPermanencyplan;
	
	@FindBy(xpath = "(//*[@title='Does Not Meet'])[last()]")
	WebElement doesNotMeetPermanencyplan;
	

	@FindBy(xpath = "(//a[@title='--None--'])[last()]")
	WebElement blank;

	@FindBy(xpath = "(//span[text()='Permanency Plan'])[4]//..//..//a")
	WebElement permanencyPlan2;

	@FindBy(xpath = "(//span[text()='Permanency Plan'])[3]/../..//*[text()='Meets'][last()]")
	WebElement meetPermanencyplan2;

	@FindBy(xpath = "(//span[text()='Placement'])[3]//..//..//a")
	WebElement placement1;

	@FindBy(xpath = "(//span[text()='Placement'])[4]//..//..//a")
	WebElement placement2;

	@FindBy(xpath = "(//span[text()='Placement'])[3]/../..//*[text()='Meets'][last()]")
	WebElement meetplacement1;

	@FindBy(xpath = "(//span[text()='Placement'])[4]/../..//*[text()='Meets'][last()]")
	WebElement meetplacement2;

	@FindBy(xpath = "(//span[text()='Education'])[3]//..//..//a")
	WebElement Education;

	@FindBy(xpath = "(//span[text()='Education'])[4]//..//..//a")
	WebElement Education1;

	@FindBy(xpath = "(//span[text()='Mental Health'])[3]//..//..//a")
	WebElement mentalHealth;

	@FindBy(xpath = "(//span[text()='Mental Health'])[4]//..//..//a")
	WebElement mentalHealth1;

	@FindBy(xpath = "(//span[text()='Other'])[3]//..//..//a")
	WebElement other;

	@FindBy(xpath = "(//span[text()='Other'])[4]//..//..//a")
	WebElement other1;

	@FindBy(xpath = "(//span[text()='Ready by 21'])[3]//..//..//a")
	WebElement readBy21first;

	@FindBy(xpath = "(//span[text()='Ready by 21'])[4]//..//..//a")
	WebElement readBy21second;

	@FindBy(xpath = "(//span[text()='Service Agreement with Parent(s)'])[3]//..//..//a")
	WebElement serviceAgreement;

	@FindBy(xpath = "(//span[text()='Service Agreement with Parent(s)'])[4]//..//..//a")
	WebElement serviceAgreement1;

	@FindBy(xpath = "(//span[text()='Parental Visitation Plan'])[3]//..//..//a")
	WebElement parentalVisitation;

	@FindBy(xpath = "(//span[text()='Parental Visitation Plan'])[4]//..//..//a")
	WebElement parentalVisitation1;

	@FindBy(xpath = "(//span[text()='Sibling Visitation Plan'])[3]//..//..//a")
	WebElement sibingVisitation;

	@FindBy(xpath = "(//span[text()='Sibling Visitation Plan'])[4]//..//..//a")
	WebElement sibingVisitation1;

	@FindBy(xpath = "(//span[text()='Services to Provider(s)'])[3]//..//..//a")
	WebElement serviceProvider;

	@FindBy(xpath = "(//span[text()='Services to Provider(s)'])[4]//..//..//a")
	WebElement serviceProvider1;

	@FindBy(xpath = "(//span[text()='Health'])[3]//..//..//a")
	WebElement Health;

	@FindBy(xpath = "(//span[text()='Health'])[4]//..//..//a")
	WebElement Health1;
	
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement saveeditAgency;
	
	
	@FindBy(xpath="(//button[text()='New Case Plan'][last()])[2]")
	WebElement newCasePlanLink;

	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	
	@FindBy(xpath="(//span[@class='slds-radio_faux'])[2]")
	WebElement noCheckBox;
	
	
	
	@FindBy(xpath="(//span[@class='slds-radio_faux'])[1]")
	WebElement yesCheckBox;
	
	@FindBy(xpath="//span[contains(normalize-space(),'Name:')]")
	WebElement name;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Are there any ch')]")
	WebElement permanencyPlanQuestion;
	
	
	@FindBy(xpath = "(//label[text()='Child']//..//..//input)[1]")
	WebElement ChildTextAreaParental;
	
	
	@FindBy(xpath = "(//label[text()='Child']//..//..//input)[2]")
	WebElement ChildTextAreaSibling;
	
	
	@FindBy(xpath = "(//label[text()='Parent']//..//..//input)[1]")
	WebElement ParenTextArea;
	
	

	@FindBy(xpath = "(//label[text()='Sibling']//..//..//input)")
	WebElement siblingTextArea;

	@FindBy(xpath = "//div/div[2]/div[1]/div/div[2]/button/lightning-primitive-icon")
	WebElement agencyProgressEdit;
	
	@FindBy(xpath = "(//span[text()='Extracurricular Activities']/../..//a)[1]")
	WebElement ExtracuricularActivitiesAP;
	
	@FindBy(xpath = "(//span[text()='Extracurricular Activities']/../..//a)[2]")
	WebElement ExtracuricularActivitiesPP;

	@FindBy(xpath = "//span[text()='Case Plan ID']/../..//*[contains(text(),'CP-')]")
	WebElement casePlanId;
	
	@FindBy(xpath = "//a[contains(text(),'CP-')]")
	WebElement CPId;
	
	/***
	 * Clicking on case plan review
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */

	public void clickOnCasePlanReview() throws AcisException {
		logger.info("Clicking on case plan review");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(casePlanReview);
		clickWebElement(casePlanReview);
		waitForPageLoadTill(9);
		clickWebElement(casePlanReview);
		logger.info("Clicked on case plan review");
	}
	

	/***
	 * answer "No" to the question "Are there any changes to this section of the
	 * Case Plan?" for any section/step
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void doesNotMeetFllingFamilyAgencyform(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "PermanencyPlan":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(permanencyPlan1);
			waitForPageLoadTill(6);
			clickWebElement(doesNotMeetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "PermanencyPlan1":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(permanencyPlan2);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "Placement":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(placement1);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "Placement1":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(placement2);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

			

		case "Health":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(Health);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;		
		
			
			
		case "Health1":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(Health1);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;		
			
		  case "Education": 
			  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(Education); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); 
		  break;
		  
		  case "Education1": 
			 logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(Education1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); 
		  break; 
		  
		  
		  case "MentalHealth": 
				logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(mentalHealth); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
			  subtypeOption); 
			  break; 
			  
			  
		  case "MentalHealth1": 
				logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(mentalHealth1); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
			  subtypeOption); 
			  break; 
		  
		  
		  case "Other":
		  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(other); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); 
		  logger.info("Selected Primary 1 as :" +
		  subtypeOption); break;
		  
		  
		  case "other1": 
		logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(other1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  case "read": 
			 logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(readBy21first); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); 
		  break;
		  
		  
		  case "read1": 
			 logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(readBy21second); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); 
		  logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  case "serviceAgreement": 
			  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceAgreement); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); break;
		  
		  
		  case "serviceAgreement1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceAgreement1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  
		  
		  
		  case "parentalVisitation": 
		logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(parentalVisitation); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); break;
		  
		  
		  case "parentalVisitation1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(parentalVisitation1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  case "sibling": 
				logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(sibingVisitation); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
			  break;
		  
			  

		  case "sibling1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(sibingVisitation1); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
			  break;
		  
		  case "serviceProvider": 
			  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceProvider); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  case "serviceProvider1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceProvider1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
		  waitForPageLoadTill(2); 
		  
		  logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		 
			case "blank":
				logger.info("Selecting Primary 1 as :" + subtypeOption);
				clickWebElemntUsingJavascriptExecutor(doesNotMeetPermanencyplan);
				waitForPageLoadTill(6);
				clickWebElement(blank);
				waitForPageLoadTill(2);
				logger.info("Selected Primary 1 as :" + subtypeOption);
				break;
	  

		default:
			logger.info("No seleted Primary 1");
			break;
		}

	}


	/***
	 * answer "No" to the question "Are there any changes to this section of the
	 * Case Plan?" for any section/step
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void fillingFamilyAgencyform(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "PermanencyPlan":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(permanencyPlan1);
			waitForPageLoadTill(6);
			clickWebElement(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "PermanencyPlan1":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(permanencyPlan2);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "Placement":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(placement1);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "Placement1":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(placement2);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

			

		case "Health":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(Health);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;		
		
			
			
		case "Health1":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(Health1);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;		
			
		  case "Education": 
			  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(Education); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); 
		  break;
		  
		  case "Education1": 
			 logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(Education1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); 
		  break; 
		  
		  
		  case "MentalHealth": 
				logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(mentalHealth); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
			  subtypeOption); 
			  break; 
			  
			  
		  case "MentalHealth1": 
				logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(mentalHealth1); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
			  subtypeOption); 
			  break; 
		  
		  
		  case "Other":
		  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(other); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); 
		  logger.info("Selected Primary 1 as :" +
		  subtypeOption); break;
		  
		  
		  case "other1": 
		logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(other1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  case "read": 
			 logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(readBy21first); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); 
		  break;
		  
		  
		  case "read1": 
			 logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(readBy21second); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); 
		  logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  case "serviceAgreement": 
			  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceAgreement); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); break;
		  
		  
		  case "serviceAgreement1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceAgreement1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  
		  
		  
		  case "parentalVisitation": 
		logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(parentalVisitation); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); break;
		  
		  
		  case "parentalVisitation1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(parentalVisitation1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  case "sibling": 
				logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(sibingVisitation); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
			  break;
		  
			  

		  case "sibling1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(sibingVisitation1); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
			  break;
		  
		  case "serviceProvider": 
			  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceProvider); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  case "serviceProvider1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceProvider1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); 
		  
		  logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		 
			case "blank":
				logger.info("Selecting Primary 1 as :" + subtypeOption);
				clickWebElemntUsingJavascriptExecutor(permanencyPlan1);
				waitForPageLoadTill(6);
				clickWebElement(blank);
				waitForPageLoadTill(2);
				logger.info("Selected Primary 1 as :" + subtypeOption);
				break;
	  

		default:
			logger.info("No seleted Primary 1");
			break;
		}

	}

	/***
	 * Clicking in click review plan and editing
	 * 
	 * @throws AcisException
	 */

	public void editingAgenyPlan() throws AcisException {
		logger.info("Clicking case plan and editing review");
		waitForPageLoad();
		waitForPageLoadTill(9);
		clickWebElement(casePlanReview);
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,140)");
		waitForPageLoadTill(9);
		try {
			clickWebElement(editButtonPermannecyPlan);
		} catch (Exception e) {

			clickWebElemntUsingJavascriptExecutor(editButtonPermannecyPlan);
			waitForPageLoadTill(9);
		}

		logger.info("Clicking case plan and editing review");
	}
	
/***
 * Saving and creating new case plan
 * @throws AcisException 
 */
	
	
	public void savingClickingNewCasePlan() throws AcisException {
		logger.info("Clicking on save button");
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(saveeditAgency);
		waitForPageLoadTill(12);
		logger.info("Clicked on saved Button");
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(5);
		jse.executeScript("window.scrollBy(0,-900)");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(newCasePlanLink);
		waitForPageLoad();
		waitForPageLoadTill(15);
		
	}
	
	/***
	 * Clicking on edit Agency and Parent Progress case plan review
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */

	public void clickOnEditAgencyParentProgress() throws AcisException {
		logger.info("Clicking on edit Agency and Parent Progress case plan review");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(agencyProgressEdit);
		clickWebElemntUsingJavascriptExecutor(agencyProgressEdit);
	//	clickWebElement(agencyProgressEdit);
		waitForPageLoadTill(9);
		logger.info("Clicked on edit Agency and Parent Progress case plan review");
	}
	
	/*** Click on New Case Plan
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 * 
	 */
	public void clickNewCasePlan() throws AcisException {
		logger.info("Clicking on New Case Plan button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(newCasePlan);
		clickWebElemntUsingJavascriptExecutor(newCasePlan);
		//clickWebElement(newCasePlan);
		waitForPageLoadTill(10);
		logger.info("Clicked on New Case Plan button");
	}
	
	/***Clicking Extracuriclar Activities
	 * @author pallavi.sanjay.yemle
	 * @param subtypeOption
	 * @throws AcisException
	 */
	public void fillingExtracuricularActivities(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "ExtracuricularActivitiesAP":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(ExtracuricularActivitiesAP);
			waitForPageLoadTill(6);
			clickWebElement(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "ExtracuricularActivitiesPP":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(ExtracuricularActivitiesPP);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		default:
			logger.info("No seleted Primary Progress");
			break;

		}

	}
	
	/**
	 * fetching New case plan id  Created By Pallavi
	 * 
	 * @throws AcisException
	 */
	public String newCasePlanID() throws AcisException {
		String CasePlanID;
		logger.info("fetching New case plan id");
		scrollingToElementofAPage(casePlanId);
		CasePlanID = casePlanId.getText();
		System.out.println("Created new Case Plan ID " + CasePlanID);
		testLoggerInfo("Created new Case Plan ID " + CasePlanID);
		logger.info("fetched New case plan id");
		return CasePlanID;
	}

	/***Verify Case Plan ID On Case Plan - Supervisor Queue
	 * @author Pallavi
	 * @throws AcisException 
	 */
	public void checkCasePlanId(String caseID) throws AcisException {
		logger.info("Verify New case plan id present on Case Plan - Supervisor Queue");
		waitForPageLoadTill(6);
		waitForElement(driver.findElement(By.xpath("//span[text()='Case Plan ID']/../../../../../..//a[contains(text(),'"+caseID+"')]")));
		logger.info("Verified New case plan id present on Case Plan - Supervisor Queue");
	}
	
	/* Click on Case PLan ID
	 * Created By Pallavi
	 */
	public void clickCasePlanId() throws AcisException {
		logger.info("Clicking on case Plan ID");
		waitForPageLoadTill(6);
		waitForElement(CPId);
		clickWebElemntUsingJavascriptExecutor(CPId);
		waitForPageLoadTill(10);
		logger.info("Clicked on case Plan ID");
	}
	
}
