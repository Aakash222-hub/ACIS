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

public class CourtActionOutcomesPage extends PageBase {

	public CourtActionOutcomesPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CourtActionOutcomesPage.class);

	@FindBy(xpath = "(//*[text()='Related'])[4]")
	WebElement tabRelated;

	@FindBy(xpath = "//*[text()='Court Action Outcome ID']//..//input")
	WebElement textCourtActionID;

	@FindBy(xpath = "//*[text()='Type']")
	WebElement type;

	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Custody Granted']")
	WebElement typeCustodyGranted;

	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Shelter Granted']")
	WebElement typeShelterGranted;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Custody Denied']")
	WebElement custodyDenied;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Reunification Granted']")
	WebElement reunificationGranted;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Permanency Plan Change']")
	WebElement permanencyPlanChange;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Guardianship Granted']")
	WebElement guardianshipGranted;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Terminated of Parental Rights']")
	WebElement terminatedofParentalRights;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Adoption Finalized']")
	WebElement adoptionFinalized;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Adoption Contested']")
	WebElement adoptionContested;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Case Dismissed']")
	WebElement caseDismissed;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Appeal Granted']")
	WebElement appealGranted;
	
	@FindBy(xpath = "//*[text()='Type']//..//input//..//..//span[text()='Appeal Denied']")
	WebElement appealDenied;
	
	
//	@FindBy(xpath="//*[text()='Effective Date']//..//input")
//	WebElement effectiveDate;

	@FindBy(xpath = "//*[text()='23']")
	WebElement selectDate;

//	@FindBy(xpath = "//td[2]//span[text()='26']")
//	WebElement nextcourtActionSelectDate;		

	@FindBy(xpath = "//button[text()='Save']")
	WebElement newCourtActionSavebtn;

	@FindBy(xpath = "//*[(@name='date')][1]")
	WebElement courtActionDateTime;

	@FindBy(xpath = "//label[text()='Next Court Action Date/Time']/../..//input")
	WebElement nextCourtActionDateTime;

	@FindBy(xpath = "//*[text()='Child Removal Episodes']'")
	WebElement ChildRemovalEpisodes;

	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;

	@FindBy(xpath = "//*[@data-omni-key='ActionType']")
	WebElement courtActionType;

	@FindBy(xpath = "//*[@data-omni-key='ActionType']//*[text()='Disposition']")
	WebElement disposition;

	@FindBy(xpath = "//*[@data-omni-key='ActionType']//*[text()='Adjudication']")
	WebElement adjudication;

	@FindBy(xpath = "//*[@data-omni-key='ActionType']//*[text()='Permanency Goal']")
	WebElement permanencyGoal;

	@FindBy(xpath = "//*[@data-omni-key='ActionType']//*[text()='Court Order']")
	WebElement courtOrder;

	@FindBy(xpath = "//*[@data-omni-key='ActionType']//*[text()='Emergency Protection Order']")
	WebElement emergencyProtectionOrder;

	@FindBy(xpath = "//span[text()='Court Case Number']/../../..//input")
	WebElement courtCaseNumber;

	@FindBy(xpath = "//*[@data-omni-key='NextCourtAction']")
	WebElement nextcourtActionType;

	@FindBy(xpath = "//*[@data-omni-key='NextCourtAction']//*[text()='Disposition']")
	WebElement nextcourtActionTypedisposition;

	@FindBy(xpath = "//*[@data-omni-key='NextCourtAction']//*[text()='Adjudication']")
	WebElement nextCourtActionadjudication;

	@FindBy(xpath = "//*[@data-omni-key='NextCourtAction']//*[text()='Permanency Goal']")
	WebElement nextCourtActionpermanencyGoal;

	@FindBy(xpath = "//*[@data-omni-key='NextCourtAction']//*[text()='Court Order']")
	WebElement nextCourtActioncourtOrder;

	@FindBy(xpath = "//*[@data-omni-key='NextCourtAction']//*[text()='Emergency Protection Order']")
	WebElement nextCourtActionemergencyProtectionOrder;

	@FindBy(xpath = "//span[text()='Court Case Number']/../../..//input")
	WebElement nextCourtActioncourtCaseNumber;

	@FindBy(xpath = "//label[contains(text(),'Court Action Participant')]/../..//input")
	WebElement courtActionParticipant;

	@FindBy(xpath = "//div[@title='New Court Action']")
	WebElement newCourtAction;

	@FindBy(xpath = "//*[text()='Court Action']/../following-sibling::div//a/span")
	WebElement courtActionId;
	
	@FindBy(xpath = "//*[@data-refid='recordId'][2]")
	WebElement courtActionId2;
	
	@FindBy(xpath="//lightning-button/button[@name='Delete']")
	WebElement delete;

	@FindBy(xpath="//span[text()='Delete']")
	WebElement labeldelete;
	
	@FindBy(xpath = "//a[@id='relatedListsTab__item' and @aria-controls='tab-7']")
	WebElement courtActionRelatedTab;

	@FindBy(xpath = "//*[text()='Court Action Outcomes']")
	WebElement courtActionOutcomeID;
	
	
	@FindBy(xpath="//a[contains(text(),'CAO-')]")
	WebElement courtActionOutcomespageID;

	@FindBy(xpath = "//a[@role='button']//div[text()='New']")
	WebElement courtActionNewButton;

	@FindBy(xpath = "//label[text()='Court Action Outcome ID']/../..//input")
	WebElement courtActionOutcomeIDtextbox;

	@FindBy(xpath = "//*[text()='Effective Date']//../..//input")
	WebElement effectiveDate;

	@FindBy(xpath = "(//div[text()='New'])[2]")
	WebElement NewCourtActionOutcomes;

	@FindBy(xpath = "(//span[contains(text(),'CAO-')]/../..//button)[2]")
	WebElement closeTab;
	
	@FindBy(xpath="(//span[contains(text(),'CA-')]/../..//button)[2]")
	WebElement closecourtorderTab;
	
	@FindBy(xpath="//a//*[text()='Court Action Outcomes']")
	WebElement courtActionOutomes;
	
	@FindBy(xpath="//*[contains(text(),'Effective Date')]/../../..//input")
	WebElement effectiveDateTextbox;

	@FindBy(xpath="//button[@title='Previous Month']")
	WebElement previousMonth;
	
	@FindBy(xpath="//button[@title='Close Court Action Outcomes']")
	WebElement closeCourtActionOutcomesWindow;

	@FindBy(xpath="//span[text()='Court Action']/../following-sibling::div//a")
	WebElement coutActionId; 
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement courtActionOutcomeSavebtn;
	
	@FindBy(xpath ="//button[@title='Cancel']")
    WebElement cancel;
	
	@FindBy(xpath = "//*[text()='Only one Court Action Outcome can be created per Court Action record']")
	WebElement courtActionRecorderrorMessage;
	
	@FindBy(xpath = "//*[text()='At least one of the case children associated to this Court Action record has an active removal episode. Please select a new Court Action Outcome Type that is not “Shelter Granted” or “Custody Granted” to proceed.']")
	WebElement courtActionOutcomeerrorMessage;
	
	
	@FindBy(xpath = "//Span[text()='Court Action Outcome ID']")
	WebElement autoCourtActionOutcomeID;
	
	@FindBy(xpath = "//*[@data-refid='recordId'and starts-with(@title,'CP')][1]")
	WebElement casePersonId;
	
	@FindBy(xpath = "//span[text()='Date of Entry']//../..//lightning-formatted-text[@data-output-element-id=\"output-field\"]")
	WebElement dateOfEntry;
	
	@FindBy(xpath = "//a[contains(text(),\"CP-\")]")
	WebElement	casePersonID;
	
	@FindBy(xpath = "//SPAN[@lst-listviewmanagerheader_listviewmanagerheader=''][text()='Child Removal Episodes']")
	WebElement childRemovalEpisode;
	
	@FindBy(xpath = "(//table/tbody/tr/th/span/a)[1]")
	WebElement childRemovalEpisodeId;
	
	@FindBy(xpath = "(//SPAN[@lightning-input_input=''])[text()='Active']")
	WebElement active;
	
	@FindBy(xpath = "//SPAN[@lst-listviewmanagerheader_listviewmanagerheader=''][text()='Placements']")
	WebElement placements;
	
	@FindBy(xpath = "//*[text()='New Placement']")
	WebElement newPlacement;
	
	@FindBy(xpath = "//LABEL[text()='Child']//..//..//input")
	WebElement child;
	
	@FindBy(xpath = "//span[text()='Medically Complex']")
	WebElement medicallyComplex;
	
//	@FindBy(xpath = "//SPAN[@vlocity_ps-typeahead_typeahead_slds=''][contains(text()'Name:')]")
//	WebElement childName;
	
	@FindBy(xpath = "//SPAN[@vlocity_ps-typeahead_typeahead_slds=''][text()='Name:']")
	WebElement childName;
	
	@FindBy(xpath = "//SPAN[@vlocity_ps-radiogroup_radiogroup_slds=''][text()='No']")
	WebElement radiobuttonNo;
	
	@FindBy(xpath = "(//SPAN[@c-acisnewplacements_acisnewplacements=''])[1]")
	WebElement placementResource;
	
	@FindBy(xpath = "(//*[text()='Submit'])")
	WebElement submitbtn;
	
	@FindBy(xpath = "//*[contains(text(),'CRE')]")
	WebElement placementEpisode;

	@FindBy(xpath="//button[text()='Save for later']")
	WebElement saveForLater;
			
	@FindBy(xpath="//button[text()='OK']")
	WebElement ok;
			
	@FindBy(xpath="//span[text()='Your OmniScript is saved for later']")
	WebElement omniscriptSaveForLater;
	
	
	Actions action = new Actions(driver);
	
	/**
	 * Click Related Tab of Case Action page
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking Related Tab of Case Action page");
		waitForPageLoad();
		clickWebElement(tabRelated);
		waitForPageLoadTill(5);
		logger.info("Clicked Related Tab of Case Action page");

	}

	/**
	 * enter text of Court Action outcomes by Khushboo
	 */
	public void enterCourtActionID(String text) throws AcisException {
		logger.info("Enter court ACtion ID");
		clickWebElement(textCourtActionID);
		//enterText(textCourtActionID, text);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(text).perform();
	}

	/**
	 * populating New Legal Action page details
	 * 
	 * @author Varun.krish
	 * @throws AcisException
	 */

	public void newlegalAction(String casenumber) throws AcisException {
		logger.info("Click on the New Court Action Button");
		waitForPageLoad();
		waitForElement(newCourtAction);
		clickWebElement(newCourtAction);
		waitForPageLoadTill(5);
		logger.info("court case number");
		waitForElement(courtCaseNumber);
		clickWebElement(courtCaseNumber);
		enterText(courtCaseNumber, casenumber);
		waitForPageLoad();
		waitForElement(courtActionDateTime);
		waitForPageLoadTill(3);
		clickWebElement(courtActionDateTime);
		clickWebElement(selectDate);
	}

	/**
	 * populating New Legal Action page details
	 * 
	 * @author Varun.krish
	 * @throws AcisException
	 */

	public void nextActionDateandtype() throws AcisException {

		logger.info("Select next Court action Date Time");
//		waitForPageLoad();
		waitForElement(nextCourtActionDateTime);
//		waitForPageLoadTill(3);
		clickWebElement(nextCourtActionDateTime);
		clickWebElement(selectDate);

	}

	/**
	 * Selecting the Court action type
	 * 
	 * @author Varun.krish
	 * @throws AcisException
	 */

	public void CourtActionSelectType(String typeOption) throws AcisException {
		switch (typeOption) {
		case "Disposition":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(courtActionType);
			clickWebElement(disposition);
			waitForPageLoadTill(2);
			logger.info("Selected Subtype as :" + typeOption);
			break;

		case "Adjudication":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(courtActionType);
			clickWebElement(adjudication);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		case "PermanencyGoal":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(courtActionType);
			clickWebElement(permanencyGoal);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		case "CourtOrder":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(courtActionType);
			clickWebElement(courtOrder);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		case "EmergencyProtectionOrder":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(courtActionType);
			clickWebElement(emergencyProtectionOrder);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		default:
			logger.info("No Subtype  ");
			break;
		}
	}

	/**
	 * Selecting the Next Court action type
	 * 
	 * @author Varun.krish
	 * @throws AcisException
	 */

	public void nextCourtActionSelectType(String typeOption) throws AcisException {
		switch (typeOption) {
		case "Disposition":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(nextcourtActionType);
			clickWebElement(nextcourtActionTypedisposition);
			waitForPageLoadTill(2);
			logger.info("Selected Subtype as :" + typeOption);
			break;

		case "Adjudication":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(nextcourtActionType);
			clickWebElement(nextCourtActionadjudication);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		case "PermanencyGoal":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(nextcourtActionType);
			clickWebElement(nextCourtActionpermanencyGoal);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		case "CourtOrder":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(nextcourtActionType);
			clickWebElement(nextCourtActioncourtOrder);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		case "EmergencyProtectionOrder":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(nextcourtActionType);
			clickWebElement(nextCourtActionemergencyProtectionOrder);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		default:
			logger.info("No Subtype  ");
			break;
		}
	}

	/**
	 * Set effective date
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void setDateandTime() throws AcisException {
		logger.info("Selecting Effective Date and Time ");
		verifyElementNotPresent(effectiveDate);
		clickWebElement(effectiveDate);
		waitForPageLoadTill(10);
		clickWebElement(selectDate);
		waitForPageLoadTill(2);

	}

	/**
	 * Set effective date
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void setlectType(String typeOption) throws AcisException {
		switch (typeOption) {
		case "Custody Granted":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(typeCustodyGranted);
			waitForPageLoadTill(2);
			logger.info("Selected Subtype as :" + typeOption);
			break;

		case "Shelter Denied":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(typeShelterGranted);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
			
		case "Custody Denied":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(custodyDenied);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
			
			
		case "ReunificationGranted":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(reunificationGranted);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
			
		case "PermanencyPlanChange":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(permanencyPlanChange);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		case "GuardianshipGranted":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(guardianshipGranted);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
			
		case "TerminatedofParentalRights":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(terminatedofParentalRights);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
			
		case "AdoptionFinalized":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(adoptionFinalized);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;	
			
		case "AdoptionContested":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(adoptionContested);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		case "CaseDismissed":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(caseDismissed);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
		case "AppealGranted":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(appealGranted);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;	
		case "AppealDenied":
			logger.info("Selecting Subtype :" + typeOption);
			clickWebElement(type);
			clickWebElement(appealDenied);
			waitForPageLoadTill(2);
			logger.info("Selected subtype :" + typeOption);
			break;
			
			
		default:
			logger.info("No Subtype  ");
			break;
		}
	}

	/**
	 * Adding the court Action Participant
	 * 
	 * @author Varun.krish
	 * @throws AcisException
	 */

	public void addCourtActionParticipant(String childname) throws AcisException {

		waitForPageLoadTill(5);
		scrollingToElementofAPage(courtActionParticipant);
		waitForElement(courtActionParticipant);
		clickWebElement(courtActionParticipant);
		waitForPageLoadTill(10);
		System.out.println(childname);
//		waitForPageLoadTill(10);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'" + childname + "')])"))).click().perform();
	}
	/**
	 * save button
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void Savebutton() throws AcisException {

		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
//		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(newCourtActionSavebtn);
		waitForPageLoadTill(5);
		waitForElement(newCourtActionSavebtn);
		clickWebElement(newCourtActionSavebtn);
		waitForPageLoad();
		waitForPageLoadTill(10);

	}
	
	
	public void courtActionOutcomeSavebtn()throws AcisException{
		
		waitForPageLoadTill(5);
		waitForElement(courtActionOutcomeSavebtn);
		clickWebElement(courtActionOutcomeSavebtn);
		waitForPageLoadTill(5);
		refreshPage();
		
	}
	
	public void clickonCancel() throws AcisException{
		
		waitForElement(cancel);
		clickWebElement(cancel);
	}
	
	public void VerifyAutoPopulatedID()throws AcisException{
		waitForPageLoadTill(5);
		waitForElement(autoCourtActionOutcomeID);
		verifyElementNotPresent(autoCourtActionOutcomeID);
	}

	public void verifyErrormessage()throws AcisException{
		
		   action.sendKeys(Keys.ESCAPE);
		waitForPageLoadTill(5);
		verifyElementNotPresent(courtActionRecorderrorMessage);
		verifyTextEquals(courtActionRecorderrorMessage, "Only one Court Action Outcome can be created per Court Action record");
		action.sendKeys(Keys.ESCAPE);
		waitForPageLoadTill(5);
		   
	}

	public void courtActionoutcomespage(String  outcomeId)throws AcisException{
		
		logger.info("Click on Court Action ID ");
		waitForElement(courtActionId);
		clickWebElement(courtActionId);
		logger.info("Click on Court Action Related Tab ");
		waitForElement(courtActionRelatedTab);
		clickWebElement(courtActionRelatedTab);
		logger.info("Click on Action outcome ID");
		waitForPageLoadTill(5);
		waitForElement(courtActionOutcomeID);
		clickWebElement(courtActionOutcomeID);
		logger.info("Click on Action outcome ID  new button .......");
		waitForPageLoadTill(2);
		waitForElement(courtActionOutcomespageID);
		clickWebElement(courtActionOutcomespageID);
		waitForPageLoadTill(2);
		refreshPage();
		logger.info("Click on Delete button");
		waitForPageLoadTill(2);
		waitForElement(delete);
		clickWebElement(delete);
		logger.info("Click on Delete button");
		waitForElement(labeldelete);
		clickWebElement(labeldelete);
		logger.info("Click on Delete button");
		logger.info("Click on Action outcome ID  new button");
		waitForElement(courtActionNewButton);
		clickWebElement(courtActionNewButton);
		waitForElement(courtActionOutcomeIDtextbox);
		clickWebElement(courtActionOutcomeIDtextbox);
		enterText(courtActionOutcomeIDtextbox, outcomeId);

	} 
	public void setcourtActionOutcomeID(String outcomeId) throws AcisException
	{logger.info("Enter on Action outcome ID ");
	waitForElement(courtActionOutcomeIDtextbox);
	clickWebElement(courtActionOutcomeIDtextbox);
	enterText(courtActionOutcomeIDtextbox, outcomeId);
	logger.info("Entered on Action outcome ID ");
	}
	
	public void verifyCourtactionTypemessage()throws AcisException
	{
		action.sendKeys(Keys.ESCAPE);
		verifyElementNotPresent(courtActionOutcomeerrorMessage);
		verifyTextEquals(courtActionOutcomeerrorMessage, "At least one of the case children associated to this Court Action record has an active removal episode. Please select a new Court Action Outcome Type that is not “Shelter Granted” or “Custody Granted” to proceed.");
		 action.sendKeys(Keys.ESCAPE);
		
	}
	
	
	
	/**
	 * Click on court actions of Case Action page
	 * 
	 * @author
	 * @throws AcisException
	 */
	public void openChildRemoval() throws AcisException {
		logger.info("open child removal action of Case Action page");
		waitForPageLoad();
		waitForElement(ChildRemovalEpisodes);
	}

	/**
	 * click new button
	 * 
	 * @author
	 * @throws AcisException
	 */
	public void clickNewButton() throws AcisException {
		logger.info("clicking new button");
		clickWebElemntUsingJavascriptExecutor(newButton);
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(textCourtActionID);
		logger.info("clicked new button");

	}
	
	public void verifyCourtActionTypelistbox() throws AcisException{
		
		logger.info("Type list box is verified");
		
//		String str[]= {"Disposition"
//				,"Adjudication",
//				"Permanency Goal",
//				"Court Order",
//				"Emergency Protection Order"};
//		
//		List<WebElement> courtaction = driver.findElements(By.xpath("//*[text()='Next Court Action Type']/../../..//li//span/span"));
//		
//		System.out.println("size="+courtaction.size());
//		
//		for(int i=0;i<courtaction.size();i++) {
//			
//		String listvalue=courtaction.get(i).getText();
//		
//		System.out.println(listvalue);
//		
//		 Assert.assertEquals(str[i], listvalue);
		
//		}

       clickWebElement(courtActionType);
       clickWebElement(disposition);	
       verifyElementNotPresent(disposition);
       waitForPageLoadTill(2);
       clickWebElement(courtActionType);
       clickWebElement(adjudication);	
       verifyElementNotPresent(adjudication);
       waitForPageLoadTill(2);
       clickWebElement(courtActionType);
       clickWebElement(permanencyGoal);	
       verifyElementNotPresent(permanencyGoal);
       waitForPageLoadTill(2);
       clickWebElement(courtActionType);
       clickWebElement(permanencyGoal);	
       verifyElementNotPresent(permanencyGoal);
       waitForPageLoadTill(2);
       clickWebElement(courtActionType);
       clickWebElement(courtOrder);	
       verifyElementNotPresent(courtOrder);
       waitForPageLoadTill(2);
       clickWebElement(courtActionType);
       clickWebElement(emergencyProtectionOrder);	
       verifyElementNotPresent(emergencyProtectionOrder);
	}
	
	
public void verifyNextCourtActionTypelistbox() throws AcisException{
		
		logger.info("Next Court Action Type list box is verified");
		
       clickWebElement(nextcourtActionType);
       clickWebElement(nextcourtActionTypedisposition);	
       verifyElementNotPresent(nextcourtActionTypedisposition);
       waitForPageLoadTill(2);
       clickWebElement(nextcourtActionType);
       clickWebElement(nextCourtActionadjudication);	
       verifyElementNotPresent(nextCourtActionadjudication);
       waitForPageLoadTill(2);
       clickWebElement(nextcourtActionType);
       clickWebElement(nextCourtActionpermanencyGoal);	
       verifyElementNotPresent(nextCourtActionpermanencyGoal);
       waitForPageLoadTill(2);
       clickWebElement(nextcourtActionType);
       clickWebElement(nextCourtActioncourtOrder);	
       verifyElementNotPresent(nextCourtActioncourtOrder);
       waitForPageLoadTill(2);
       clickWebElement(nextcourtActionType);
       clickWebElement(nextCourtActionemergencyProtectionOrder);	
       verifyElementNotPresent(nextCourtActioncourtOrder);
	}

	
	
		
		
		public void verifyCourtActionlistbox() throws AcisException{
			
			   waitForPageLoadTill(2);
			   clickWebElement(type);
		       clickWebElement(typeCustodyGranted);	
		       verifyElementNotPresent(typeCustodyGranted);
//		       waitForPageLoadTill(2);
//		       clickWebElement(type);
//		       clickWebElement(typeShelterGranted);	
//		       verifyElementNotPresent(typeShelterGranted);
		       waitForPageLoadTill(5);
		       clickWebElement(type);
		       clickWebElement(custodyDenied);	
		       verifyElementNotPresent(custodyDenied);
		       waitForPageLoadTill(5);
		       clickWebElement(type);
		       clickWebElement(reunificationGranted);	
		       verifyElementNotPresent(reunificationGranted);
		       waitForPageLoadTill(5);
		       clickWebElement(type);
		       clickWebElement(permanencyPlanChange);	
		       verifyElementNotPresent(permanencyPlanChange);
		       waitForPageLoadTill(5);
		       clickWebElement(type);
		       clickWebElement(guardianshipGranted);	
		       verifyElementNotPresent(guardianshipGranted);
//		       waitForPageLoadTill(5);
//		       clickWebElement(type);
//		       clickWebElement(adoptionFinalized);	
//		       verifyElementNotPresent(adoptionFinalized);
//		       waitForPageLoadTill(5);
//		       clickWebElement(type);
//		       clickWebElement(adoptionContested);	
//		       verifyElementNotPresent(adoptionContested);
//		       waitForPageLoadTill(5);
//		       clickWebElement(type);
//		       clickWebElement(caseDismissed);	
//		       verifyElementNotPresent(caseDismissed);
//		       waitForPageLoadTill(5);
//		       clickWebElement(type);
//		       clickWebElement(appealGranted);	
//		       verifyElementNotPresent(appealGranted);
//		       waitForPageLoadTill(5);
//		       clickWebElement(type);
//		       clickWebElement(appealDenied);	
//		       verifyElementNotPresent(appealDenied);
		       
		       
		
	}

	/**
	 * Click on court outcome id
	 * 
	 * @author Varun.krish
	 * @throws AcisException
	 */
	public void clickCourtActionId(String outcomeId) throws AcisException {

		logger.info("Click on Court Action ID ");
		waitForElement(courtActionId);
		clickWebElement(courtActionId);
		logger.info("Click on Court Action Related Tab ");
		waitForElement(courtActionRelatedTab);
		clickWebElement(courtActionRelatedTab);
		logger.info("Click on Action outcome ID");
		waitForElement(courtActionOutcomeID);
		clickWebElement(courtActionOutcomeID);
		logger.info("Click on Action outcome ID  new button");
		waitForElement(courtActionNewButton);
		clickWebElement(courtActionNewButton);
		logger.info("Click on Action Outcome TextBox");
		waitForElement(courtActionOutcomeIDtextbox);
		clickWebElement(courtActionOutcomeIDtextbox);
		enterText(courtActionOutcomeIDtextbox, outcomeId);
		verifyElementNotPresent(courtActionOutcomeIDtextbox);

	}

	/**
	 * Click on New court actions of Case Action page
	 * 
	 * @author
	 * @throws AcisException
	 */
	public void clickOnNewbtn() throws AcisException {
		clickWebElement(NewCourtActionOutcomes);
	}

	/**
	 * close court outcomes
	 * 
	 * 
	 * 
	 */
	public void closeCourtOutComesTab() throws AcisException {
		logger.info("closing Tab");
		clickWebElement(closeTab);
		logger.info("closed tab");
	}

	/**
	 * close court order
	 * 
	 * 
	 * 
	 */
	public void closeCourtOrder() throws AcisException {
		logger.info("closing Tab");
		clickWebElement(closecourtorderTab);
		logger.info("closed tab");

	}
	
	/**
	 * Click on Court Action Outcomes
	 * @author Varun.krish
	 * @throws AcisException 
	 */
	public void clickCourtActionOutcomes() throws AcisException{
		
		logger.info("Click on Court Action Outcomes ");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(courtActionOutomes);
		clickWebElemntUsingJavascriptExecutor(courtActionOutomes);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Court Action Outcomes ");
		waitForElement(courtActionNewButton);
		logger.info("Successfully Clicked on Court Action Outcomes Tab");
		clickWebElement(courtActionNewButton);
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("Click on New Action Outcome TextBox");
		waitForElement(courtActionOutcomeIDtextbox);
		clickWebElement(courtActionOutcomeIDtextbox);
		
	}
	
	public void verifythedateofEntry()throws AcisException{
		
		logger.info("selecting person case ID");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(casePersonID);
		clickWebElement(casePersonID);
		waitForPageLoadTill(5);
		verifyElementNotPresent(dateOfEntry);
		
	}
	
	/**
	 * give date
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideDate() throws AcisException {
		logger.info("clicking on date");
		scrollingToElementofAPage(effectiveDateTextbox);
		clickWebElement(effectiveDateTextbox);
		waitForPageLoadTill(2);
		clickWebElemntUsingJavascriptExecutor(previousMonth);
		waitForPageLoadTill(2);
		clickWebElement(selectDate);	
		logger.info("clicked on date");
		
	}
	
	/**
	 * Close Court Action Outcome window
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeCourtActionOutcomeWindow() throws AcisException {
		logger.info("Closing Court Action Outcome window");
		waitForPageLoad();
		waitForPageLoadTill(5);
		if (closeCourtActionOutcomesWindow.isDisplayed()) {
			clickWebElement(closeCourtActionOutcomesWindow);
			waitForPageLoadTill(5);
		}
		logger.info("Closed Court Action Outcome window");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("succesfully Closed Court Action Outcome window");
		
	}
	
	
	public void childEpisode() throws AcisException{
		logger.info("click on Child Removal Episode");
		action.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		scrollingToElementofAPage(childRemovalEpisode);
		waitForElement(childRemovalEpisode);
		clickWebElement(childRemovalEpisode);
		waitForPageLoadTill(5);
		logger.info("click on Child Removal Episode ID");
		waitForElement(childRemovalEpisodeId);
		clickWebElement(childRemovalEpisodeId);
		waitForPageLoadTill(5);
		logger.info("Verifying the Child Removal Episode status Active");
		refreshPage();
		waitForElement(active);
		verifyElementNotPresent(active);
		
		}
	public void createPlacementEpisode(String str) throws AcisException{
		logger.info("Click on the Placements");
		waitForPageLoadTill(5);
		waitForElement(placements);
		clickWebElement(placements);
		waitForPageLoadTill(5);
		logger.info("Click on the New Placement");
		refreshPage();
		waitForPageLoadTill(10);
		waitForElement(newPlacement);
		clickWebElement(newPlacement);
		logger.info("select child Name");
		waitForPageLoadTill(10);
		refreshPage();
		waitForElement(child);
		clickWebElement(child);
		waitForPageLoadTill(5);
		enterText(child, str);
		waitForPageLoadTill(10);
	}
	
	
	public void verifyPlacementChildEpisode() throws AcisException{
		
		logger.info("slecting the placement Resource");
		waitForElement(placementResource);
		clickWebElement(placementResource);
		waitForPageLoadTill(5);
		logger.info("click on submit button");
		waitForElement(submitbtn);
		clickWebElement(submitbtn);
		waitForPageLoadTill(10);
		waitForElement(placementEpisode);
		verifyElementNotPresent(placementEpisode);
	}

	/*** Click Save For Later
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSaveForLater() throws AcisException {
		logger.info("Clicking on Save For Later");
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(saveForLater);
		//clickWebElement(saveForLater);
		waitForPageLoadTill(5);
		logger.info("Clicked on Save For Later");
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
	
	public void ClickOnCourtActionId() throws AcisException {
		logger.info("Clicking on Court Action Id");
		waitForPageLoad();
		waitForElement(courtActionId);
		clickWebElemntUsingJavascriptExecutor(courtActionId);
		waitForPageLoadTill(10);
		logger.info("Clicked on Court Action Id");
	}
}