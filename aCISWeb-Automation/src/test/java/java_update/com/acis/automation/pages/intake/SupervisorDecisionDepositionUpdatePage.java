package com.acis.automation.pages.intake;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.groovy.ast.stmt.DoWhileStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class SupervisorDecisionDepositionUpdatePage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(SupervisorDecisionDepositionUpdatePage.class);

	public SupervisorDecisionDepositionUpdatePage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h1[text()='PostForAllegationWithoutCaseAction']")
	WebElement noDispositionSelectedErrorText;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//span[text()='Screening Recommendation']/../../..//div[text()='required']")
	WebElement screeningRecommendationRequired;

	@FindBy(xpath = "//span[@class='slds-m-right_x-small' and text()='Screening Decision']")
	WebElement screeningDecissionLabel;

	@FindBy(xpath = "//span[text()='Accept & Assign']/..//span[@class='slds-radio_faux']")
	WebElement acceptAssignCheckBox;

	@FindBy(xpath = "//*[text()='Supervisor Screening Decision']/../../..//lightning-formatted-text")
	WebElement supervisorScreeningDecissionLabel;

	@FindBy(xpath = "//span[text()='Worker Screening Recommendation']/../../..//lightning-formatted-text")
	WebElement supervisorWorkingRecommendationLabel;

	@FindBy(xpath = "//button[contains(text(),'Intake Record')]")
	WebElement intakeRecordButton;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "(//button[text()='Next']//..//..//vlocity_ps-button)[2]")
	WebElement nextButtonSearchPage;
	@FindBy(xpath = "(//button[text()='Next'])[2]")
	WebElement nextButton2;

	@FindBy(xpath = "//span[text()='Disposition']/../..//lightning-formatted-text")
	WebElement dispositionLabel;

	@FindBy(xpath = "//span[text()='Supervisor Screening Decision']/../..//lightning-formatted-text")
	WebElement supervisorScreeningLabel;

	@FindBy(xpath = "//label[text()='Worker Comments']/../../..//textarea")
	WebElement workerComments;

	@FindBy(xpath = "(//span[text()='Screen In for Investigation'])[1]")
	WebElement investigationSupervisor2;

	@FindBy(xpath = "//span[text()='Disposition']/../../..//*[text()='Screen In for Investigation'][last()]")
	WebElement investigationSupervisor;

	@FindBy(xpath = "//span[text()='Disposition']/../../..//input")
	WebElement dispositionTab;

	@FindBy(xpath = "//label[text()='Location of Incident']/../../..//input")
	WebElement locationofIncidentRporterdetail;

	@FindBy(xpath = "//a[text()='Related']")
	WebElement relatedButton;

	@FindBy(xpath = "//label[text()='Text to display']//..//input")
	WebElement inputNarrativeTextarea;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement narrativeClose;

	@FindBy(xpath = "//label[text()='URL']//..//..//input")
	WebElement dynamicElement;

	public By inputNarrativearea = By.xpath("//label[text()='Text to display']//..//input");

	@FindBy(xpath = "//label[text()='Narrative']")
	WebElement narrative2;

	@FindBy(xpath = "//span[text()='Narrative']//..//..//p")
	WebElement naarrativeAreaLabel;

	@FindBy(xpath = "//*[@id='mytextarea_ifr']")
	WebElement narrativeFrame;

	@FindBy(xpath = "(//body[@data-id='mytextarea']//..//p)[2]")
	WebElement narrativeTextArea;

	@FindBy(xpath = "//span[text()='Save for later']")
	WebElement saveforLaterLink;

	@FindBy(xpath = "//button[text()='OK']")
	WebElement OkButton;

	@FindBy(xpath = "//span[text()='Your OmniScript is saved for later']")
	WebElement saveforLaterLabel;

	@FindBy(xpath = "//a[text()='link']")
	WebElement linkLink;

	@FindBy(xpath = "//span[text()='Narrative']//..//..//a")
	WebElement narrativeReporter;

	@FindBy(xpath = "//tr//td//span[@title='Narrative ID']")
	WebElement narrativecaseId;

	@FindBy(xpath = "(//span[text()='Narrative']//..//..//p)[last()]")
	WebElement narrativeAllegationarea;

	@FindBy(xpath = "//*[text()='Go Back']")
	WebElement goBackButton;
	
	
	
	@FindBy(xpath="//span[text()='Additional Fields']")
	WebElement additionalFields;
	
	
	
	@FindBy(xpath="//span[text()='Fields']")
	WebElement Fields;
	
	

	/***
	 * @author akash.a.gaurav This method verify the error if no disposition is
	 *         selected and also label of Screeing decission
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void verifyNoDispositionError(String error, String label) throws AcisException, InterruptedException {

		try {
			Thread.sleep(2000);
			logger.info("Verifying  error if No Disposition is selected");
			Thread.sleep(1000);
			scrollingToElementofAPage(submitButton);
			waitForElementNew(submitButton, 2);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1100)");
			clickWebElement(submitButton);
			waitForPageLoadTill(6);
			waitForElementNew(noDispositionSelectedErrorText, 3);
			verifyTextEquals(noDispositionSelectedErrorText, error);
			waitForPageLoadTill(9);
			clickWebElemntUsingJavascriptExecutor(goBackButton);
			logger.info("Clicked on Go Back");
			waitForPageLoadTill(9);
			logger.info("Verified Error if No Disposition is Selected");
		} catch (Exception e) {
			logger.info("No error found");
		}

	}

	/***
	 * @author akash.a.gaurav This method is selecting Accept&Assign and verifying
	 *         in the take summary
	 * @throws AcisException
	 */
	public void selectingAcceptingAssign(String screeningDecissionStatus, String workerDecission) throws AcisException {

		try {
			logger.info("Selecting acceptng and assign ");
			waitForElement(acceptAssignCheckBox);
			clickWebElemntUsingJavascriptExecutor(acceptAssignCheckBox);
			logger.info("Selected Accept assign frome Screening Decision");

			scrollingToElementofAPage(submitButton);
			clickWebElement(submitButton);
			waitForPageLoadTill(10);
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1200)");
			waitForPageLoadTill(9);
			logger.info("Clicking on additional Xpand button");
			clickWebElement(additionalFields);
			logger.info("Clicked on additional ");
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,1200)");
			verifyTextEquals(supervisorScreeningDecissionLabel, screeningDecissionStatus);
			verifyTextEquals(supervisorWorkingRecommendationLabel, workerDecission);
			logger.info(
					"Verified Supervisor Screening Decission Label and Worker Decission label and selected Accept&Assign");
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/***
	 * @author akash.a.gaurav This method is selecting Intake and coming to
	 *         Screendecisson page
	 * @throws AcisException
	 */
	public void intakeNavigationToScreenDecission() throws AcisException {

		try {
			Thread.sleep(9000);
			logger.info("Navigating to Screen Decission");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-1700)");
			waitForElementNew(intakeRecordButton, 3);
			clickWebElement(intakeRecordButton);
			waitForPageLoadTill(19);
			jse.executeScript("window.scrollBy(0,1100)");
			waitForElementClickable(nextButton);
			jse.executeScript("window.scrollBy(0,1100)");
			waitForPageLoadTill(9);
			clickWebElement(nextButton);
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,1100)");
			waitForPageLoadTill(9);
			clickWebElement(nextButton);
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,1100)");
			waitForPageLoadTill(9);
			clickWebElement(nextButton);
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,1100)");
			waitForPageLoadTill(9);
			clickWebElement(nextButton);
			logger.info("Navigated to screen decission");
			waitForPageLoadTill(9);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/***
	 * Verifying the status of Supervisor Overide with disposition selected as
	 * Screen In For Investigation
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	public void verifyingSuperVisorOverride(String disposition, String supervisorReommendation,
			String workerScreening) throws AcisException {
		try {
			Thread.sleep(1000);
			logger.info(
					"Verifying the status of Supervisor Overide with disposition selected as Screen In For Investigation");
			waitForPageLoadTill(9);
			clickWebElement(Fields);

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,100)");
			
			waitForElementNew(dispositionLabel, 10);
			scrollingToElementofAPage(dispositionLabel);
			verifyTextEquals(dispositionLabel, disposition);
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,1200)");
			clickWebElement(additionalFields);
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,1200)");
		
			verifyTextEquals(supervisorScreeningLabel, supervisorReommendation);
			verifyTextEquals(supervisorWorkingRecommendationLabel, workerScreening);
			logger.info("Verified the status disposition and supervisor screening decission");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Select : Disposition Created By akash
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectDisposition() throws AcisException, InterruptedException {

		try {
			logger.info("Selecting disposition");
			scrollingToElementofAPage(workerComments);
			waitForPageLoadTill(6);
			clickWebElement(dispositionTab);
			waitForPageLoadTill(5);

			waitForElement(investigationSupervisor);
			try {
				clickWebElement(investigationSupervisor);
			} catch (Exception e) {
				clickWebElement(investigationSupervisor2);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.info("Selected disposition " + investigationSupervisor);
	}

	/**
	 * Clicking narrative in reporters detail page
	 * 
	 * @throws AcisException
	 * @throws IOException
	 * @throws UnsupportedFlavorException
	 */

	public void narrativeReporterDetailPage(String strNarrative)
			throws AcisException, UnsupportedFlavorException, IOException {

		try {
			Thread.sleep(2000);
			waitForPageLoadTill(9);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,540)");
			clickWebElement(locationofIncidentRporterdetail);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			act.sendKeys(Keys.CONTROL).sendKeys(strNarrative).keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0063')).keyUp(Keys.CONTROL).perform();
			// String
			// narrative=act.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0063')).keyUp(Keys.CONTROL).perform();
			// act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			// act.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).keyUp(Keys.CONTROL).perform();
			// act.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u006B')).keyUp(Keys.CONTROL).perform();

			// switchToFrameByWebElement(narrativeFrame);

			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			Transferable contents = clipboard.getContents(null);
			String x = (String) contents.getTransferData(DataFlavor.stringFlavor);
			System.out.println(x);
			Assert.assertEquals(x.trim(), strNarrative);

			logger.info("Verfied narrative text");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/***
	 * Narrative text Box in PersonInvolve page
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * 
	 */
	public void searchPageNext() throws AcisException {
		try {

			logger.info("Clicking on Next button");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
			waitForElementClickable(nextButton);
			scrollingToElementofAPage(nextButton);
			clickWebElement(nextButton);
			waitForPageLoad();
			waitForPageLoadTill(8);
			logger.info("Clicked on Next button");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/***
	 * Save for later functionality
	 * 
	 * @throws AcisException
	 * @throws IOException
	 * @throws UnsupportedFlavorException
	 */

	public void saveForLater(String strNarrative) throws AcisException, UnsupportedFlavorException, IOException {

		logger.info("Verifying Save  for later after Narrative text");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		clickWebElemntUsingJavascriptExecutor(saveforLaterLink);
		logger.info("Clicked on Save for later button");
		logger.info("Clicked on ok button");
		clickWebElement(OkButton);
		waitForPageLoadTill(17);
		clickWebElemntUsingJavascriptExecutor(linkLink);
		waitForPageLoadTill(19);
		switchToWindowBytitle("c:intakeCreateIntakeLWCEnglish | Salesforce");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");

		clickWebElement(locationofIncidentRporterdetail);
		enterTextUsingJavascript(locationofIncidentRporterdetail, strNarrative);
		waitForPageLoadTill(9);
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		actions.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0063')).keyUp(Keys.CONTROL).perform();

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable contents = clipboard.getContents(null);
		String x = (String) contents.getTransferData(DataFlavor.stringFlavor);
		System.out.println(x);
		Assert.assertEquals(x.trim(), strNarrative);

		logger.info("Verfied Narrative text after Save for later");
		waitForPageLoadTill(9);
	}

	/**
	 * Switching window
	 * 
	 * @throws AcisException
	 */

	public void switchWindow() throws AcisException {

		switchToWindowBytitle("c:intakeCreateIntakeLWCEnglish | Salesforce");
	

	}

	/***
	 * Click on narrative link
	 * 
	 * @throws AcisException
	 */

	public void narrativeLink() throws AcisException {
		Actions actions = new Actions(driver);
		try {
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,1000)");
			waitForPageLoadTill(9);
			
			actions.moveToElement(narrativecaseId).doubleClick().build().perform();
			waitForPageLoadTill(9);
			//clickWebElemntUsingJavascriptExecutor(narrativecaseId);
			logger.info("Clicked on Narrative link");
			waitForPageLoadTill(9);
			verifyElementNotPresent(narrativeAllegationarea);
			logger.info("Narrative verified");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/***
	 * Scroll
	 */
	public void scrollTill(String option) {
		switch (option) {
		case "scrolltwo":
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,470)");
			waitForPageLoadTill(9);
			break;

		case "scrollone":
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse1.executeScript("window.scrollBy(0,-200)");
			break;

		case "scrollUp":
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse2.executeScript("window.scrollBy(0,-2200)");
			break;

		default:
			break;
		}

	}
}
