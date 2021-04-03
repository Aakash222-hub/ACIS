package com.acis.automation.pages.investigation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class RecordReview_OmniScriptPage extends PageBase {

	public RecordReview_OmniScriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_OmniscriptPage.class);

	@FindBy(xpath = "(//td[@data-label='REVIEWED']/..//button)[1]")
	WebElement downArrowLink;

	@FindBy(xpath = "//span[contains(text(),'Show details')]")
	WebElement showDetail;

	@FindBy(id = "CaptureProfessionalOpinion")
	WebElement professional_OpinionText_Boxfield;

	@FindBy(xpath = "//div[contains(text(),'Cancel')]")
	WebElement cancelButton;

	@FindBy(xpath = "//div[contains(text(),'Save for later')]")
	WebElement saveForLaterButton;

	@FindBy(xpath = "//button[contains(text(),'Previous')]")
	WebElement previousButton;

	@FindBy(xpath = "//button//*[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//button[text()='Refresh']")
	WebElement refreshButton;
	

	// newlyadded

	@FindBy(xpath = "//button[@title='Previous Month']")
	WebElement previousMonthAccessTheHome;

	@FindBy(xpath = "(//button[@title='Previous Month'])[2]")
	WebElement previousMonthIncident;


	@FindBy(xpath = "(//input[@name='date'])[2]")
	WebElement incidentDatePicker;

	@FindBy(xpath = "//input[@name='date']")
	WebElement acessTheHomeDatepicker;
	
	@FindBy(xpath = "//span[text()=10]")
	WebElement safetyAssessmentDate;
	
	@FindBy(xpath = "//h1[text()='Findings']")
	WebElement verifyFindingLabel;
	
	//Record review added by Pallavi
	
	@FindBy(xpath = "//p[text()='Please ensure Record Review is completed before proceeding to next step.']")
	WebElement verifyRecordReview;
	
	@FindBy(xpath = "//button[text()='Save for later']")
	WebElement saveForLater;
	
	@FindBy(xpath = "//button[text()='OK']")
	WebElement okButton;
	
	@FindBy(xpath = "//span[text()='Your OmniScript is saved for later']")
	WebElement omniscriptSaveForLater;
	
	@FindBy(xpath = "//*[text()='Please enter initials to verify that the relevant records on the previous step have been reviewed prior to submitting Investigation findings.']")
	WebElement initialsError;
	
	@FindBy(xpath = "//*[text()='Enter initials to confirm that all relevant records have been reviewed as a part of this Investigation.']")
	WebElement initialsEnter;
	
	@FindBy(xpath = "//span[@title='TYPE']")
	WebElement type;
	
	@FindBy(xpath = "//lightning-base-formatted-text[contains(text(),'Intake')]")
	WebElement intakeCase;
	
	@FindBy(xpath = "//lightning-base-formatted-text[contains(text(),'Foster')]")
	WebElement fosterCareCase;
	
	@FindBy(xpath = "//lightning-base-formatted-text[contains(text(),'Investigation')]")
	WebElement investigationCase;
	
	
	@FindBy(xpath="//vlocity_ps-omniscript-text[@data-omni-key='InitialInputText']//input")
	WebElement inputRecordview;
	
	@FindBy(xpath="//*[@data-omni-key='InitialTextInputFinal']//input")
	WebElement enterInitials;
	
	
/***
 * @author akash.a.gaurav
 * Clicking on Record view Show view details
 * @throws AcisException 
 */
  public void showViewRecord() throws AcisException {
	  
	  waitForPageLoad();
	  waitForPageLoadTill(4);
	  waitForElement(downArrowLink);
	  clickWebElemntUsingJavascriptExecutor(downArrowLink);
	  logger.info("Click on record page down arrow ");
	  waitForElementNew(showDetail, 5);
	  clickWebElemntUsingJavascriptExecutor(showDetail);
	  logger.info("Click on show view detail page");
	  waitForPageLoadTill(9);
	  waitForPageLoad();
  }
  
  /***
   * Click on Next page
 * @throws AcisException 
 * @author akash.a.gaurav
   */
  public void nextPage() throws AcisException {
	  waitForPageLoadTill(7);
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	  clickWebElement(inputRecordview);
	  act.sendKeys(Keys.TAB).perform();
	  act.sendKeys(Keys.TAB).perform();
	  act.sendKeys(Keys.TAB).perform();
	  act.sendKeys(Keys.ENTER).perform();
	  waitForPageLoadTill(5);
	  waitForPageLoad();
	 // waitForElement(verifyFindingLabel);
	  logger.info("Click on Next Button");
  }
  
  /**
	 * click on Next button
	 * 
	 * @author Dharmesh Krishna
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(5);
		//waitForElement(verifyRecordLabel);
		logger.info("Clicked on Next button");

	}
  
  /***
   * Click on Refresh Button
 * @throws AcisException 
 * @author Dharmesh Krishna
   */
  public void clickRefresh() throws AcisException {
	  logger.info("Clicking on Refresh Button");
	  waitForElementClickable(refreshButton);
		clickWebElement(refreshButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Refresh Button");
  }
  
  /*** Verify Error on Record Review
   * @author pallavi.sanjay.yemle
   */
  
  public void verifyErrorRecordReview() {
	  logger.info("Verifying Error messages on Record Review Page");
	  waitForElement(verifyRecordReview);
	  waitForPageLoadTill(3);
	  logger.info("Verified Error messages on Record Review Page");
  }
  
  /*** All Intake case Record
   * @author pallavi.sanjay.yemle
   */
  public void allIntakeCase() {
	  logger.info("Verifying All Intake cases present or not");
	  waitForPageLoadTill(3);
	  waitForElement(type);
	  waitForElement(intakeCase);
	  logger.info("Verified All Intake cases present or not");
  }
  
  /***All Foster care Cases
   * @author pallavi.sanjay.yemle
   */
  public void fosterCareCase() {
	  logger.info("Verifying All Foster cases present or not");
	  waitForPageLoad();
	  waitForElement(type);
	  waitForElement(fosterCareCase);
	  logger.info("Verified All Foster cases present or not");
  }
  
  /*** All investigation Case
   *@author pallavi.sanjay.yemle 
   */
  public void investigationCase() {
	  logger.info("Verifying All Investigation cases present or not");
	  waitForPageLoad();
	  waitForElement(type);
	  waitForElement(investigationCase);
	  logger.info("Verified All Investigation cases present or not");
  }
  
  
  /*** Click on Save for Later Button
   * @author pallavi.sanjay.yemle
   * @throws AcisException 
   */
  
  public void clickSaveForLater() throws AcisException {
	  logger.info("Clicking on Save for Later Button");
	  scrollingToElementofAPage(saveForLater);
	  clickWebElemntUsingJavascriptExecutor(saveForLater);
	  waitForPageLoadTill(5);
	  waitForPageLoad();
	  logger.info("Clicked on Save For Later Button");
	  logger.info("Clicking on Ok");
	  waitForElement(okButton);
	  clickWebElement(okButton);
	  waitForPageLoadTill(5);
	  waitForPageLoad();
	  logger.info("Clicked on OK Button");
  }
  
  
  /*** Verify exit Workflow
   * @author pallavi.sanjay.yemle
   */
  
  public void exitWorkflow() {
	  logger.info("Verifying Exit Workflow messages on Record Review Page");
	  waitForElement(omniscriptSaveForLater);
	  waitForPageLoadTill(3);
	  logger.info("Verified Exit Workflow messages on Record Review Page");
  }
  
  /***
   * @author Dharmesh
   * Verifying Initials Message
   * @throws AcisException 
   */
  public void verifyInitials() {
	  logger.info("Verifying Initials Message");
	  waitForElement(initialsError);
	  waitForElement(initialsEnter);
	  waitForPageLoadTill(3);
	  logger.info("Verified Initials Message");
  }
  
  /***
   * @author Dharmesh
   * Verifying Initials Message
   * @throws AcisException 
   */
  public void verifyCaseHeader(String caseHead) {
	  logger.info("Verifying Case Head");
	  waitForElement(driver.findElement(By.xpath("//*[@data-omni-key='Insights']//*[text()='"+caseHead+"']")));
	  waitForPageLoadTill(3);
	  logger.info("Verified Case Head");
  }
  
  /***
   * @author akash.a.gaurav
   * Clicking on Record view Show view details
   * @throws AcisException 
   */
    public void enterTextRecordReview(String str) throws AcisException {
  	  
  	  waitForPageLoad();
  	  waitForPageLoadTill(4);
	  	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,940)");
     logger.info("entering input text area");
  	  
  	  Actions act = new Actions(driver);
  	 // enterTextUsingJavascript(inputRecordview, str);
//    act.sendKeys(Keys.CONTROL).sendKeys(str).perform();
      enterText(inputRecordview, str);
      act.sendKeys(Keys.ENTER).perform();
  	  logger.info("entered input area");

  	  waitForPageLoadTill(9);
  	  waitForPageLoad();
    }
    
   
  
}