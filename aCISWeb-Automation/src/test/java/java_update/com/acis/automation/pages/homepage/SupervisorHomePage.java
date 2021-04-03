package com.acis.automation.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.supercsv.cellprocessor.constraint.IsElementOf;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
//import com.acis.automation.pages.utilities.GenericFunctions;
import com.acis.automation.utilities.AcisException;

public class SupervisorHomePage extends PageBase {
	
final static Logger logger = LoggerFactory.getLogger(SupervisorHomePage.class);
	
	public SupervisorHomePage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//iframe[@title='dashboard']")
	WebElement frameElement;
	//Akash
	@FindBy(xpath="//*[@id='main']/div/div[1]/div/div/div/div[1]/div[2]/div[2]/div[2]/div/div/button")
	WebElement expandButton;
	
	//Mrunal
	@FindBy(xpath="//a[contains(text(),'Intakes to Review')]")
	WebElement viewAllIntakeReview;
	
	@FindBy(xpath="//iframe[@title='dashboard']")
	WebElement dashboardIframe;
	
	@FindBy(xpath="//iframe[@title='Report Viewer']")
	WebElement reportViewerIframe;
	
	@FindBy(xpath="//*[text()='My Intakes to Review']")
	WebElement myintakeReview;
	
	@FindBy(xpath="//a[contains(text(),'Case Actions to Review')]")
	WebElement viewAllCaseActionsReview;
	
	@FindBy(xpath="//a[contains(text(),'Assessments to Review')]")
	WebElement viewAllAssessmentsReview;
	
	@FindBy(xpath="(//span[text()='Intake ID']/..//span[text()='Ascending'])[1]")
	WebElement intakeID_Ascending;
	
	@FindBy(xpath="(//span[text()='Intake ID']/..//span[text()='Descending'])[1]")
	WebElement intakeID_Descending;
	
	@FindBy(xpath="//*[not(@aria-hidden)]/table//*[text()='Intake ID']")
	WebElement intakeIDLabel;
	
	@FindBy(xpath="//*[not(@aria-hidden)]/table//*[text()='Case Action ID']")
	WebElement caseActionIDLabel;
	
	@FindBy(xpath="(//*[text()='Case Action ID']/..//span[text()='Ascending'])[1]")
	WebElement caseActionID_Ascending;
	
	@FindBy(xpath="(//*[text()='Case Action ID']/..//span[text()='Descending'])[1]")
	WebElement caseActionID_Descending;
	
	@FindBy(xpath="//*[not(@aria-hidden)]/table//*[text()='Assessment ID']")
	WebElement assessmentIDLabel;
	
	@FindBy(xpath="(//*[text()='Assessment ID']/..//span[text()='Ascending'])[1]")
	WebElement assessmentIDLabel_Ascending;
	
	@FindBy(xpath="(//*[text()='Assessment ID']/..//span[text()='Descending'])[1]")
	WebElement assessmentIDLabel_Descending;
	
	@FindBy(xpath="//a[contains(text(),'Caseload')]")
	WebElement viewAllWorkerCaseload;
	
	@FindBy(xpath="//button[text()='Refresh']")
	WebElement refreshDashboard;
	
	@FindBy(xpath="(//*[text()='ACIS Intake']//ancestor::th//following-sibling::td//descendant::*)[last()]")
	WebElement intake_Count;
	
	@FindBy(xpath="(//*[text()='ACIS Investigator']//ancestor::th//following-sibling::td//descendant::*)[last()]")
	WebElement investigator_Count;
	

	
	
	public By intakeID_AscendingBy = By.xpath(("(//span[text()='Intake ID']/..//span[text()='Ascending'])[1]"));
	public By intakeID_DescendingBy = By.xpath(("(//span[text()='Intake ID']/..//span[text()='Descending'])[1]"));
	public By caseActionID_AscendingBy = By.xpath(("(//*[text()='Case Action ID']/..//span[text()='Ascending'])[1]"));
	public By caseActionID_DescendingBy = By.xpath(("(//*[text()='Case Action ID']/..//span[text()='Descending'])[1]"));
	public By assessmentIDLabel_AscendingBy = By.xpath(("(//*[text()='Assessment ID']/..//span[text()='Ascending'])[1]"));
	public By assessmentIDLabel_DescendingBy = By.xpath(("(//*[text()='Assessment ID']/..//span[text()='Descending'])[1]"));
	
	public By intakeIdLabel = By.xpath(("//span[contains(text(),'Intake ID')]"));
	
	public By allegedVictimLabel = By.xpath("//span[contains(text(),'Alleged Victim')]");
	
	public By ageTextLabel = By.xpath("//span[contains(text(),'Age')]");
	
	public By dateOpenedLabel =By.xpath("//span[text()='Date Opened']");
	
	public By intakeWorkerLabel =By.xpath("//span[text()='Intake Worker']");
	
	Actions actions = new Actions(driver);
	
	
	/***
	 * Verifying My Intake Review Coloumn name label contains :Intake ID, Alleged Victim, Age, Date Opened, Intake Worker
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void verifyingMyIntakeReviewColoumnlabel() throws AcisException {	
		 
	try {
		waitForPageLoadTill(9);
		waitForPageLoad();
		switchToFrameByWebElement(frameElement);
		

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", expandButton);
		
		//genericFunctions.select_Window("My Intakes to Review");
		isElementPresent(intakeIdLabel);
		logger.info("Verifying intake label in the My Intake Review Coloumns");
		isElementPresent(allegedVictimLabel);
		logger.info("Verifying allegedVictimLabel in the My Intake Review Coloumns");
		isElementPresent(ageTextLabel);
		logger.info("Verifying ageTextLabel in the My Intake Review Coloumns");
		isElementPresent(dateOpenedLabel);
		logger.info("Verifying dateOpenedLabel in the My Intake Review Coloumns");
		isElementPresent(intakeWorkerLabel);
		logger.info("Verifying intakeWorkerLabel in the My Intake Review Coloumns");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	/**
	 * click view all Intake ID
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickViewAllIntakeID() throws AcisException {
		
		logger.info("Clicking  view all Intake ID");
		waitForPageLoad();
		waitForPageLoadTill(10);
		waitForElement(dashboardIframe);
		switchToFrameByWebElement(dashboardIframe);
		waitForPageLoadTill(5);
		waitForElement(refreshDashboard);
		clickWebElement(refreshDashboard);
		waitForPageLoadTill(10);
		clickWebElement(myintakeReview);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        waitForPageLoadTill(9);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        scrollingToElementofAPage(viewAllIntakeReview);
		clickWebElemntUsingJavascriptExecutor(viewAllIntakeReview);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(7);
		waitForElement(reportViewerIframe);
		switchToFrameByWebElement(reportViewerIframe);
		waitForElement(intakeIDLabel);
		logger.info("Clicked on view all Intake ID");
	}
	
	/**
	 * click view all Case Actions
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickViewAllCaseActions() throws AcisException {
		logger.info("Clicking  view all Case Actions");
		waitForPageLoad();
		waitForPageLoadTill(10);
		waitForElement(dashboardIframe);
		switchToFrameByWebElement(dashboardIframe);
		waitForPageLoadTill(5);
		waitForElement(refreshDashboard);
		clickWebElement(refreshDashboard);
		waitForPageLoadTill(10);
		clickWebElement(myintakeReview);
		 actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
         waitForPageLoadTill(9);
         actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
         waitForElementClickable(viewAllCaseActionsReview);
         scrollingToElementofAPage(viewAllCaseActionsReview);
		clickWebElemntUsingJavascriptExecutor(viewAllCaseActionsReview);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		switchToFrameByWebElement(reportViewerIframe);
		waitForElement(caseActionIDLabel);
		logger.info("Clicked on view all Case Actions");
	}
	
	/**
	 * click view all Assessments
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickViewAllAssessments() throws AcisException {
		waitForPageLoad();
		logger.info("Clicking  view all Assessments");
		waitForPageLoadTill(10);
		waitForElement(dashboardIframe);
		switchToFrameByWebElement(dashboardIframe);
		waitForPageLoadTill(5);
		waitForElement(refreshDashboard);
		clickWebElement(refreshDashboard);
		waitForPageLoadTill(10);
		clickWebElement(myintakeReview);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        waitForPageLoadTill(9);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        waitForElementClickable(viewAllAssessmentsReview);
        scrollingToElementofAPage(viewAllAssessmentsReview);
		clickWebElemntUsingJavascriptExecutor(viewAllAssessmentsReview);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		switchToFrameByWebElement(reportViewerIframe);
		waitForElement(assessmentIDLabel);
		logger.info("Clicked on view all Assessments");
	}
	
	/**
	 * click view all Worker's Caseload
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickViewAllCaseload() throws AcisException {
		waitForPageLoad();
		logger.info("Clicking  view all Worker's Caseload");
		waitForPageLoadTill(5);
		waitForElement(dashboardIframe);
		switchToFrameByWebElement(dashboardIframe);
		waitForPageLoadTill(5);
		waitForElement(refreshDashboard);
		clickWebElement(refreshDashboard);
		waitForPageLoadTill(10);
		waitForElement(myintakeReview);
		clickWebElement(myintakeReview);
         actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
         waitForPageLoadTill(9);
         actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
         waitForElement(viewAllWorkerCaseload);
         scrollingToElementofAPage(viewAllWorkerCaseload);
		clickWebElemntUsingJavascriptExecutor(viewAllWorkerCaseload);
		switchToDefaultContent();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		switchToFrameByWebElement(reportViewerIframe);
		waitForElement(intake_Count);
		logger.info("Clicked on view all Worker's Caseload");
	}
	
	
	/**
	 * Sort Intake ID
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void sortIntakeIDColumn( String order) throws AcisException {
		
		switch (order) {
		case "Ascending":
			while (isElementPresent(intakeID_AscendingBy)==false) {
				clickWebElemntUsingJavascriptExecutor(intakeIDLabel);
				waitForPageLoadTill(3);	
			}
			logger.info("Intake ID column sorted by Ascending order");
			break;
			
		case "Descedning":
			
			while (isElementPresent(intakeID_DescendingBy)==false) {
				clickWebElemntUsingJavascriptExecutor(intakeIDLabel);
				waitForPageLoadTill(3);
			}
			logger.info("Address ID column sorted by Descedning order");
			break;

		default:
			logger.info("No matching order text");
			break;
		}	
	}
	
	/**
	 * Sort CaseAction ID
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void sortCaseActionsIDColumn( String order) throws AcisException {
		
		switch (order) {
		case "Ascending":
			while (isElementPresent(caseActionID_AscendingBy)==false) {
				clickWebElemntUsingJavascriptExecutor(caseActionIDLabel);
				waitForPageLoadTill(3);	
			}
			logger.info("CaseAction ID column sorted by Ascending order");
			break;
			
		case "Descedning":
			
			while (isElementPresent(caseActionID_DescendingBy)==false) {
				clickWebElemntUsingJavascriptExecutor(caseActionIDLabel);
				waitForPageLoadTill(3);
			}
			logger.info("CaseAction ID column sorted by Descedning order");
			break;

		default:
			logger.info("No matching order text");
			break;
		}	
	}
	
	/**
	 * Sort Assessments ID
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void sortAssessmentsColumn( String order) throws AcisException {
		
		switch (order) {
		case "Ascending":
			while (isElementPresent(assessmentIDLabel_AscendingBy)==false) {
				clickWebElemntUsingJavascriptExecutor(assessmentIDLabel);
				waitForPageLoadTill(3);	
			}
			logger.info("Assessments ID column sorted by Ascending order");
			break;
			
		case "Descedning":
			
			while (isElementPresent(assessmentIDLabel_DescendingBy)==false) {
				clickWebElemntUsingJavascriptExecutor(assessmentIDLabel);
				waitForPageLoadTill(3);
			}
			logger.info("Assessments ID column sorted by Descedning order");
			break;

		default:
			logger.info("No matching order text");
			break;
		}	
	}
	
	
	/**
	 * Check id present
	 * @author mrunal.s.tilekar
	 */
	public void checkIDPresent(String id) {
		logger.info("checking id present : " + id);
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='"+ id +"']"))).isDisplayed(), "Error: No id present -"+ id);
		logger.info("checked id present : " + id);
	}
	
	
	/**
	 * Get the caseload count
	 * @author mrunal.s.tilekar
	 * @return 
	 */
	public Integer getCount(String type) {
		
		logger.info("Getting the count of caseload");
		
		switch (type) {
		case "Intake":
			logger.info("Getting the Intake count of caseload");
			logger.info("Intake count :" + intake_Count.getText().trim());
			return Integer.valueOf((intake_Count.getText().trim()));
			
		case "Investigator":
			logger.info("Getting the Investigator count of caseload");
			logger.info("Investigator count :" + investigator_Count.getText().trim());
			return Integer.valueOf(investigator_Count.getText().trim());
			
		default:
			break;
		}
		return null;
	}
	
	
	/**
	 * compare two caseload counts
	 * @author mrunal.s.tilekar
	 */
	public void compareCount(int previousCount , int newCount) {
		logger.info("Comparing caseload counts");
		Assert.assertTrue((previousCount<newCount), "Error : Previous Count is greater than newCount");
		logger.info("Compared caseload counts");
	}
	
	

}
