package com.acis.automation.pages.caseplan;

import static org.testng.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class VisitationPlan_OmniScriptPage extends PageBase {

	public VisitationPlan_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(VisitationPlan_OmniScriptPage.class);

	@FindBy(xpath = "(//*[text()='Add Parental Visitation Plan?']/../../..//input)[last()]")
	WebElement addParentalVisitation;

	@FindBy(xpath = "(//*[text()='Add Parental Visitation Plan?']/../../..//li//*[text()='Yes'])[last()]")
	WebElement addParentalYes;

	@FindBy(xpath = "(//*[text()='Add Parental Visitation Plan?']/../../..//li//*[text()='No'])[last()]")
	WebElement addParentalNo;

	@FindBy(xpath = "(//*[text()='Add Parental Visitation Plan?']/../../..//li//*[text()='N/A'])[last()]")
	WebElement addParentalNA;

	@FindBy(xpath = "(//label[text()='Parent']//..//..//input)[1]")
	WebElement ParenTextArea;

	@FindBy(xpath = "(//label[text()='Child']//..//..//input)[1]")
	WebElement ChildTextArea;

	@FindBy(xpath = "(//label[text()='Narrative']//..//..//textarea)[1]")
	WebElement NarrativeTextArea;

	@FindBy(xpath = "(//*[text()='Add Sibling Visitation Plan?']/../../..//input)[last()]")
	WebElement addSiblingVisitation;

	@FindBy(xpath = "(//*[text()='Add Sibling Visitation Plan?']/../../..//li//*[text()='Yes'])[last()]")
	WebElement addSiblingYes;

	@FindBy(xpath = "(//*[text()='Add Sibling Visitation Plan?']/../../..//li//*[text()='No'])[last()]")
	WebElement addSiblingNo;

	@FindBy(xpath = "(//*[text()='Add Sibling Visitation Plan?']/../../..//li//*[text()='N/A'])[last()]")
	WebElement addSiblingNA;

	@FindBy(xpath = "(//label[text()='Child']//..//..//input)[2]")
	WebElement ChildTextAreaSibling;

	@FindBy(xpath = "(//label[text()='Sibling']//..//..//input)")
	WebElement siblingTextArea;

	@FindBy(xpath = "(//label[text()='Narrative']//..//..//textarea)[2]")
	WebElement narrativeSibling;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//h1[text()='Services to the Provider(s)']")
	WebElement serviceTotheProvider;

	@FindBy(xpath = "//span[text()='Case Plans']//..//..//..//h2")
	WebElement casePlanLink;

	@FindBy(xpath = "(//span[text()='Case Plans'])[last()]")
	WebElement casePlan3;

	@FindBy(xpath = "(//div[text()='New Case Plan'])[last()]")
	WebElement newCasePlanlink;

	@FindBy(xpath = "//span[contains(text(),'Name')]")
	WebElement nameText;

	@FindBy(xpath = "//label[@aria-label='Permanency Goals For']//..//..//input")
	WebElement permanencyGoalFor;
	
	@FindBy(xpath = "(//label[@aria-label='Permanency Goals For']//..//..//input)[2]")
	WebElement permanencyGoalFor2;

	@FindBy(xpath = "//span[@class='slds-listbox__option-text slds-listbox__option-text_entity'][contains(normalize-space(),'Name: ')]")
	WebElement nameFirstPermanencyGoal;
	
	@FindBy(xpath="//*[text()='Add']")
	WebElement addButton;
	
	@FindBy(xpath="//button[contains(normalize-space(),'Next')]")
	WebElement nextButtonPermanency;
	
	
	@FindBy(xpath="(//span[@class='slds-listbox__option-text slds-listbox__option-text_entity'][contains(normalize-space(),'Name: ')])[3]")
   WebElement nameFirstPermanencyGoal2;
	
	@FindBy(xpath="//button[@title='Close Case Plan']//lightning-primitive-icon")
	WebElement closeCasePlan;
	
	@FindBy(xpath="(//*[text()='Refresh']//..//..//button)[last()]")
	WebElement refresh;
	
	@FindBy(xpath="(//*[text()='Refresh']//..//..//button)[3]")
	WebElement refresh2;
	
	@FindBy(xpath="(//span[text()='Case Plan ID'])[1]")
	WebElement casePlanLabel;
	
	@FindBy(xpath="(//span[text()='Created Date'])[last()]")
	WebElement createDateLabel;
	
	
	@FindBy(xpath="(//span[text()='Permanency Goal'])[1]")
	WebElement permanenccyplanLabel;
	
	@FindBy(xpath="(//span[text()='Date of Next Review'])[1]")
	WebElement dateofNextLabel;
	
	@FindBy(xpath="(//span[text()='Parental Visits'])[1]")
	WebElement parentalLabel;
	
	
	@FindBy(xpath="(//span[text()='Sibling Visits'])[1]")
	WebElement siblingLabel;	
	
	@FindBy(xpath="//span[text()='Guardianship, Adoption']")
	WebElement permanencyGoallabelStatus;
	
	
	@FindBy(xpath="//*[contains(text(),'CP-')]/../../..//span[@data-aura-class='uiOutputDateTime']")
	WebElement outputDate;
	
	@FindBy(xpath="//tr[1]/td[5]/span/span[@class='slds-truncate uiOutputDate']")
	WebElement inputDate;
	
	
	@FindBy(xpath="(//*[text()='Refresh']/../../..//button[@title='Refresh'])[2]")
	WebElement refreshing;
	
	
	@FindBy(xpath="//span[text()='down icon']/../../..//button")
	WebElement editFirstChild;
	
	@FindBy(xpath="//button[text()='Save'][last()]")
	WebElement savefirst;
	
	@FindBy(xpath="(//span[text()='Medically Complex'][last()])[1]")
	WebElement medicallyComplex;
	
	
	@FindBy(xpath = "slds-p-right_small slds-m-bottom_xx-small slds-show_inline-block slds-size_12-of-12 slds-medium-size_4-of-12 slds-hide")
	WebElement zipCodeTextbox;
	
	@FindBy(xpath="//span[text()='Edit']/../..//a")
	WebElement editButotn;
	
	public By providerAgency = By.xpath("(//span[text()='Provider Agency'])[1]");
	
	
	@FindBy(xpath="//*[@class='slds-radio--faux']")
	WebElement checkBoxPlacementResource;
	
	
	@FindBy(xpath="//*[text()='Placement Address']//..//..//lightning-formatted-text")
	WebElement placmentResorce;
	
	public By ZipCode =By.xpath("//*[text()='Zip Code']/../../..//input");
	
	
	
	
	/**
	 *@author akash.a.gaurav
	 * 
	 * @throws AcisException
	 */
	public void addParentalVisitationPlan(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "Yes":
			logger.info("Selecting Parental plan  1 as :" + subtypeOption);
			clickWebElement(addParentalVisitation);
			clickWebElement(addParentalYes);
			waitForPageLoadTill(2);
			logger.info("Selected  Parental plan 1 as :" + subtypeOption);
			break;

		case "No":
			logger.info("Selecting Parental plan  1 as :" + subtypeOption);
			clickWebElement(addParentalVisitation);
			clickWebElement(addParentalNo);
			waitForPageLoadTill(2);
			logger.info("Selected  Parental plan 1 as :" + subtypeOption);
			break;

		case "Na":
			logger.info("Selecting  Parental plan 1 as :" + subtypeOption);
			clickWebElement(addParentalVisitation);
			clickWebElement(addParentalNA);
			waitForPageLoadTill(2);
			logger.info("Selected  Parental plan 1 as :" + subtypeOption);
			break;

		default:
			logger.info("No seleted  Parental plan  1");
			break;
		}

	}

	/**
	 * Entering text in parental and sibling visitations
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void enterText(String subtypeOption, String strValue) throws AcisException {

		switch (subtypeOption) {
		case "ChildParental":
			logger.info("Entering Text in child Parental visitaions :" + subtypeOption);
			waitForElement(ChildTextArea);
			enterText(ChildTextArea, strValue);
			logger.info("Entered text in child as :" + subtypeOption);
			break;

		case "ParenTextAreaParental":
			logger.info("Entering Text in Parent Parental visitaions :" + subtypeOption);
			waitForElement(ParenTextArea);
			enterText(ParenTextArea, strValue);
			logger.info("Entered text in parent as :" + subtypeOption);
			break;

		case "NarrativeParental":
			logger.info("Entering Text in  Narrative visitaions :" + subtypeOption);
			waitForElement(NarrativeTextArea);
			enterText(NarrativeTextArea, strValue);
			logger.info("Entered text in Narrative as :" + subtypeOption);
			break;

		case "ChildSibling":
			logger.info("Entering Text in  C visitaions :" + subtypeOption);
			waitForElement(ChildTextAreaSibling);
			enterText(ChildTextAreaSibling, strValue);
			logger.info("Entered text in Narrative as :" + subtypeOption);
			break;

		case "Sibling":
			logger.info("Entering Text in Parent Parental visitaions :" + subtypeOption);
			waitForElement(siblingTextArea);
			enterText(siblingTextArea, strValue);
			logger.info("Entered text in Sibling as :" + subtypeOption);
			break;

		case "NarrativeSibling":
			logger.info("Entering Text in Parent Parental visitaions :" + subtypeOption);
			waitForElement(narrativeSibling);
			enterText(narrativeSibling, strValue);
			logger.info("Entered text in Narrative sibling as :" + subtypeOption);
			break;
		default:
			logger.info("No seleted Text Area 1");
			break;
		}
	}

	/**
	 * @author akash.a.gaurav Adding Sibling Visitation Plan
	 * @throws AcisException
	 */
	public void addSiblingVisitations(String subtypeOption) throws AcisException {
		switch (subtypeOption) {
		case "Yes":
			logger.info("Selecting Sibling plan  1 as :" + subtypeOption);
			clickWebElement(addSiblingVisitation);
			clickWebElement(addSiblingYes);
			waitForPageLoadTill(2);
			logger.info("Selected  Sibling plan 1 as :" + subtypeOption);
			break;

		case "No":
			logger.info("Selecting Sibling plan  1 as :" + subtypeOption);
			clickWebElement(addSiblingVisitation);
			clickWebElement(addSiblingNo);
			waitForPageLoadTill(2);
			logger.info("Selected  Sibling plan 1 as :" + subtypeOption);
			break;

		case "Na":
			logger.info("Selecting  Sibling plan 1 as :" + subtypeOption);
			clickWebElement(addSiblingVisitation);
			clickWebElement(addSiblingNA);
			waitForPageLoadTill(2);
			logger.info("Selected  Sibling plan 1 as :" + subtypeOption);
			break;

		default:
			logger.info("No seleted  Sibling plan  1");
			break;
		}

	}

	/***
	 * Clicking on Next and navigate
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void clickNext() throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		logger.info("Clicking on next Button");
		clickWebElement(nextButton);
		logger.info("Clicked on next bUTTON");
		waitForElement(serviceTotheProvider);
		logger.info("User is on the service to the provider");

	}

	/***
	 * 
	 * This methods are used in TC 172 Clicking on case plan link
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void casePlan() throws AcisException, InterruptedException {
		Thread.sleep(2000);
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,450)");
		waitForPageLoadTill(9);
		waitForElementClickable(casePlan3);
		logger.info("Clicking on case plan ");
		actions.moveToElement(casePlan3).doubleClick().build().perform();
		logger.info("Clicked on case plan ");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(newCasePlanlink);
		waitForPageLoadTill(28);
	}

	/***
	 * @author akash.a.gaurav Adding permancey plan goal for first party
	 * @throws AcisException
	 */

	public void addPermanencyPlan(String subtypeOption ) throws AcisException {
		switch (subtypeOption) {
	case "First":
		logger.info("Adding Permanency Plan");
		waitForPageLoadTill(18);
		clickWebElement(permanencyGoalFor);
		waitForPageLoadTill(8);

		clickWebElement(nameFirstPermanencyGoal);

		logger.info("Added permanency goal");
		break;
		
	case "Second":
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)");
		logger.info("Adding Permanency Plan");
		waitForPageLoadTill(8);
		clickWebElement(permanencyGoalFor2);
		waitForPageLoadTill(8);

		clickWebElement(nameFirstPermanencyGoal2);

		logger.info("Added permanency goal");
		break;
	default:
		logger.info("No seleted  Sibling plan  1");
		break;
	}}
	
	
	/***
	 * Add button in permanency plan
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 * 
	 */
	
	public void addButton() throws AcisException {
		logger.info("Adding second permanency plan");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,-550)");
		
		waitForElement(addButton);
		clickWebElement(addButton);
		logger.info("Added second button");
	}
	
	/***
	 * Submitting permanency plan
	 * @throws AcisException 
	 */
	public void submitPermanency() throws AcisException {
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,950)");
		clickWebElement(nextButtonPermanency);
	
	
	}
	/***
	 * Closing the case plan
	 * @throws AcisException 
	 */
	
	public void closePlan() throws AcisException {
		
		waitForPageLoadTill(9);
		clickWebElement(closeCasePlan);
		logger.info("Close case plan");
		waitForPageLoadTill(9);
		try {
			clickWebElement(refresh);
		} catch (Exception e) {
			clickWebElement(refresh2);
		}
		logger.info("Page refreshed");
		waitForPageLoadTill(9);
		
		
	}
	
	/***
	 * Verification Label Case Plan
	 * @author akash.a.gaurav
	 */
	public void verificationCasePlan() {
		
		String caseId = testData.get(Constants.OOhservicesCasePage)
				.get("CaseNo");
		
		String createdate = testData.get(Constants.OOhservicesCasePage)
				.get("CreateDate");
		String permanancy = testData.get(Constants.OOhservicesCasePage)
				.get("Permanency");
		String dateofreview = testData.get(Constants.OOhservicesCasePage)
				.get("dateofReview");
		String parental = testData.get(Constants.OOhservicesCasePage)
				.get("parentalVisit");
		String sibling = testData.get(Constants.OOhservicesCasePage)
				.get("sibling");
		
		waitForPageLoadTill(9);
		verifyTextEquals(casePlanLabel, caseId);
		logger.info("Verify label  "+caseId);
		verifyTextEquals(createDateLabel, createdate);
		logger.info("Verify label  "+createdate);
		verifyTextEquals(permanenccyplanLabel, permanancy);
		logger.info("Verify label  "+permanancy);
		verifyTextEquals(dateofNextLabel, dateofreview);
		logger.info("Verify label  "+dateofreview);
		verifyTextEquals(parentalLabel, parental);
		logger.info("Verify label  "+parental);
		verifyTextEquals(siblingLabel, sibling);
		logger.info("Verify label  "+sibling);
	}
	
	/***
	 * Verifying Permanency Goallabel
	 * 
	 * @author akash.a.gaurav
	 * @throws InterruptedException 
	 * @throws AcisException 
	 */

	public void verifyInterview(String str1) throws InterruptedException, AcisException {
		Thread.sleep(1000);
		clickWebElement(refreshing);
		waitForPageLoadTill(9);

		List<WebElement> interactions = driver.findElements(By.xpath("//tbody//tr//td"));
		int interactionCount = interactions.size();

		for (int i = 0; i < interactionCount; i++) {
			System.out.println(interactions.get(i).getText());
			if (str1.equalsIgnoreCase(interactions.get(i).getText())
					) {
				logger.info("Reviewd Interview of Caregiver and Children");
				break;
			}

		}

	}
	
	/**
	 * verify due date between  opened date  
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * @author akash.a.gaurav
	 */


	public void verifyDuedate() throws AcisException, InterruptedException {
		// Custom date format
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);


		String duedate = inputDate.getText();
		String opened = outputDate.getText();
	
		String[] createdDateList=	opened.split(",");
		String createdDate=createdDateList[0];
		System.out.println(createdDate);
		Date d1 = null;
		 Date d2 = null;
		try {
			d1 = sdf.parse(duedate);
			d2=sdf.parse(createdDate);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    long diffInMillies = Math.abs(d1.getTime() - d2.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	 System.out.println(diff);
	   assertEquals(182, diff);

	}
	

	
	/***
	 * @author akash.a.gaurav
	 * S-0880 Update Placement Type verification placement
	 * @throws AcisException 
	 */
	
	public void edittingSelectingType() throws AcisException {
		logger.info("Editing first child");
		waitForPageLoadTill(9);
		waitForElement(editFirstChild);
		clickWebElemntUsingJavascriptExecutor(editFirstChild);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(editButotn);
		waitForPageLoadTill(5);
		logger.info("Selecting first type");
		waitForElement(medicallyComplex);
		clickWebElement(medicallyComplex);
		logger.info("Saving the type");
		waitForPageLoadTill(2);
		clickWebElement(savefirst);
		waitForPageLoadTill(9);
	}
	
	/***
	 * Verifying provider agency 
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	public void verifyProviderAgencyOwnHomeRunAway() throws AcisException {
		if (isElementPresent(providerAgency)) {
			logger.info("Provider Agency Found Test Case Is failed");
			
		}
		else {
			logger.info("Provider agency not found her OwnHome Ran away test case passed");
		}
	}
	
	/***
	 * @author akash.a.gaurav
	 * Selecting checkbox
	 * @throws AcisException 
	 */
	public void selectCheckBox() throws AcisException {
		waitForPageLoadTill(5);
		logger.info("Selecting checkbox");
		clickWebElemntUsingJavascriptExecutor(checkBoxPlacementResource);
		logger.info("Selected checkbox");
	}
	
	/***
	 * Verifying zip code  for 
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	public void verifyZipcode() throws AcisException {
		if (isElementPresent(ZipCode)) {
			logger.info("zip code Found Test Case Is failed");
			
		}
		else {
			logger.info("zip code not found her OwnHome Ran away test case passed");
		}
	}
	
/***
 * Verify placement resource address
 * @author akash.a.gaurav
 */
	
	public void  verifyPlacementResorce() {
		waitForPageLoadTill(8);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,900)");
		logger.info("Verifying placemet resource populated or not");
		verifyElementNotPresent(placmentResorce);
		logger.info("Verified placemet resource populated ");
		
		
	}

}
	
