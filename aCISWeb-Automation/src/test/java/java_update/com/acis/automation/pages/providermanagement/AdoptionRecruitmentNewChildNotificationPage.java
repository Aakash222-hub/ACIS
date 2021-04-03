package com.acis.automation.pages.providermanagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
import com.acis.automation.pages.casemanagement.CaseActionPage;
import com.acis.automation.utilities.AcisException;

public class AdoptionRecruitmentNewChildNotificationPage extends PageBase {

	public AdoptionRecruitmentNewChildNotificationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(AdoptionRecruitmentNewChildNotificationPage.class);
	// case details C-0003110,First Name :ThirdChildVktest, LastName :
	// ThirdChildVktestLast

	@FindBy(xpath = "//span[text()='App Launcher']")
	WebElement AppLauncher;
	@FindBy(xpath = "//input[@type ='search' and @placeholder='Search apps and items...']")
	WebElement ClickOnAppLauncherSearchBox;

	@FindBy(xpath = "(//span/p/b[text()='Case'])[2]")
	WebElement ClickOnCaseActions;
	@FindBy(xpath = "//span[text()='Show Navigation Menu']")
	WebElement ClickOnDownArrayForHome;

	// *[@data-key='chevrondown'])[1]

	@FindBy(xpath = "(//span[text()='Home'])[2]")
	WebElement ClickOnHome;
	@FindBy(xpath = "//a[@title='Adoption Recruitment' and @class='test-drillin' and text()='Adoption Recruitment']")
	WebElement ClickOnAdoptionRecruitment;
	@FindBy(xpath = "//a[@data-label= 'Details' and text()='Details' and @role='tab']")
	WebElement ClickOnDetailsTab;

	@FindBy(xpath = "(//span[text()='Account Name']/..//following-sibling::div/span")
	WebElement getPersonORAccountvalueUnderDetailsTab;
	@FindBy(xpath = "//slot/lightning-formatted-name[text()='test demo mother' and @data-output-element-id='output-field']")
	WebElement gePersonNamevalueafterRedirectionAdopcnRecrment;

	@FindBy(xpath = "(//a[text()='C-00003110'])[2]")
	WebElement getCaseActionvalueForAdoptionRecruitment;
	@FindBy(xpath = "((//span[text()='12/08/2008'])[2]")
	WebElement getDOBValueForAdoptionRecruitment;
	@FindBy(xpath = "((//span[text()='12'])[2]")
	WebElement getAgeValueForAdoptionRecruitment;
	@FindBy(xpath = "((//span[text(//span[text()='12'])[2]()='11/12/2020'])[2]")
	WebElement getDateOfentryValueForAdoptionRecruitment;

	@FindBy(xpath = "//div[@title='New Case Plan' and text()='New Case Plan']")
	WebElement ClickOnNewCasePlanButton;
	@FindBy(xpath = "//button[@type='button' and text()='Submit']")
	WebElement ClickOnSubmitButton;

	@FindBy(xpath = "(//div/span[@class='view-all-label' and text()='View All'])[3]")
	WebElement ClickOnViewAllLink;

	/*
	 * @FindBy(
	 * xpath="((//span[@class='slds-assistive-text' and text()='Show more actions'])[2]"
	 * ) WebElement ClickOnDownArrowLink;
	 */
	@FindBy(xpath = "(//*[@title='ThirdChildVktest ThirdChildVktestLast']//ancestor::th//following-sibling::td//*[@role='button']")
	WebElement ClickOnDownArrowForEntrydate;

	@FindBy(xpath = "(//a/div[@role='button' and @title='Edit'][2]")
	WebElement ClickOnEditAfetrclikingonDownArrow;

	@FindBy(xpath = "(//input[@name='ACIS_Date_of_Entry__c' and @type='text']//span[text()='Select a date']")
	WebElement ClickOnDateofEntry;
	@FindBy(xpath = "(//*[text()='21']")
	WebElement selectOnDateofEntry;

	@FindBy(xpath = "//button[@title='Save' and @type='button' and text()='Save']")
	WebElement clickOnSaveButton;

	@FindBy(xpath = "//div/input[@role='combobox' and @placeholder= 'Search...' and @type='text']")
	WebElement clickOnGlobalSearchBox;

	@FindBy(xpath = "//div/mark[@class='data-match' and text()='C-00003110']")
	WebElement enterExistingCaseActionID;

	@FindBy(xpath = "//span[@title='Case Persons' and text()='Case Persons']")
	WebElement NewPerson;
	@FindBy(xpath = "//*[text()='Account Name']/../../..//lightning-formatted-name")
	WebElement PersonFirstName;
	@FindBy(xpath = "//*[text()='First Name']//..//..//input")
	WebElement PersonFirstName1;

	@FindBy(xpath = "//button[@title='Edit Account Name']")
	WebElement EditAccountName;

	@FindBy(xpath = "//a[text()='Details']")
	WebElement DetailsTab;

	public void searchGlobalFosterCase(String strText1) throws AcisException, InterruptedException {
		logger.info("Clicking on Global Search");
		waitForElement(clickOnGlobalSearchBox);
		waitForElementClickable(clickOnGlobalSearchBox);
		clickWebElement(clickOnGlobalSearchBox);
		logger.info("Clicked on Global Search");
		logger.info("Entering Existing Case Action Id");
		clickOnGlobalSearchBox.clear();
		clickOnGlobalSearchBox.sendKeys(strText1);
		driver.findElement(By.xpath("//div/mark[@class='data-match' and text()='" + strText1 + "']")).click();

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void clickOnNewCasePlanButton() throws AcisException {

		waitForPageLoad();
		waitForElement(ClickOnNewCasePlanButton);
		waitForPageLoadTill(9);
		clickWebElement(ClickOnNewCasePlanButton);

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void clickOnSubmitButton() throws AcisException {

		waitForPageLoad();
		waitForElement(ClickOnNewCasePlanButton);
		waitForPageLoadTill(9);
		clickWebElement(ClickOnNewCasePlanButton);

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void clickOnEditAfetrclikingonDownArrow(String Str) throws AcisException {

		waitForPageLoad();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,650)");
		NewPerson.click();
		// clickWebElement(NewPerson);
		waitForElement(driver.findElement(
				By.xpath("//*[@title='" + Str + "']//ancestor::th//following-sibling::td//*[@role='button']")));
		waitForPageLoadTill(9);
		WebElement edtbutton = driver.findElement(
				By.xpath("//*[@title='" + Str + "']//ancestor::th//following-sibling::td//*[@role='button']"));
		edtbutton.click();
		waitForElement(ClickOnEditAfetrclikingonDownArrow);
		waitForPageLoadTill(9);
		clickWebElement(ClickOnEditAfetrclikingonDownArrow);

	}

	public void clickOnNewPerson() throws AcisException {
		System.out.println("Clicking on on New person link");
		waitForPageLoad();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,350)");
		// NewPerson.click();
		waitForPageLoadTill(15);
		clickWebElement(NewPerson);

		System.out.println("Clicked on on New person link");
		waitForPageLoadTill(9);

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void setEntryDate(String setEntryDate) throws AcisException, InterruptedException {

		logger.info("Selecting Date of Entry");
		waitForElement(ClickOnDateofEntry);
		clickWebElement(ClickOnDateofEntry);
		waitForPageLoadTill(5);
		enterText(selectOnDateofEntry, setEntryDate);
		// clickWebElement(selectOnDateofEntry);
		logger.info(" Date of Entry succesfully selected");

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickOnSaveButtonEntryDate() throws AcisException {

		waitForPageLoad();
		waitForElement(clickOnSaveButton);
		waitForPageLoadTill(9);
		clickWebElement(clickOnSaveButton);
	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickOntAppLauncher() throws AcisException {

		waitForPageLoad();
		waitForPageLoadTill(10);
		waitForElement(AppLauncher);
		waitForPageLoadTill(9);
		clickWebElement(AppLauncher);

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void ClickOnAppLauncherSearchBox() throws AcisException {

		waitForPageLoad();
		waitForElement(ClickOnAppLauncherSearchBox);
		waitForPageLoadTill(9);
		clickWebElement(ClickOnAppLauncherSearchBox);

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void searchCaseActionfromAppLauncher(String str1) throws AcisException {

		enterText(ClickOnAppLauncherSearchBox, str1);

		waitForPageLoadTill(9);
		clickWebElement(ClickOnCaseActions);

		logger.info("Provided Action Action Name:" + str1);
	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void searchAndOpenHomeformDropdown() throws AcisException {

		waitForPageLoadTill(9);
		clickWebElement(ClickOnDownArrayForHome);
		waitForPageLoadTill(9);
		clickWebElement(ClickOnHome);

		logger.info("Clicked on Home");
	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void ClickOnAdoptionRecruitment() throws AcisException {

		logger.info("Clicking on Adoption Recruitment");
		waitForPageLoadTill(9);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,940)");
		clickWebElement(ClickOnAdoptionRecruitment);
		waitForPageLoadTill(9);
		logger.info("Clicked on Adoption Recruitment");

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void getCaseActionvalueForAdoptionRecruitment(String expectedlCaseValue) throws AcisException {

		waitForPageLoad();
		List<WebElement> DateOrder = driver.findElements(By.xpath(
				"//div[@class='windowViewMode-maximized active lafPageHost']//span[contains(text(),'Sorted Ascending')]"));
		// span[contains(text(),'Sorted Descending')]
		logger.info("Case Order: " + DateOrder.size());
		if (DateOrder.size() == 1) {
			clickWebElemntUsingJavascriptExecutor(driver.findElement(
					By.xpath("(//div[@class='undefined forceListViewManagerGrid']//th[@title='Case ID']//span)[2]")));
			logger.info("Clicked on case Id in Descending Order ");
			waitForPageLoadTill(9);
		}
		waitForPageLoadTill(5);
		String actualCaseValue = driver.findElement(By.xpath("(//a[text()='" + expectedlCaseValue + "'])[last()]"))
				.getText().trim();
		logger.info("Case Id " + actualCaseValue);
		Assert.assertEquals(actualCaseValue, expectedlCaseValue);
		logger.info("Verified Case Value");
	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void getPersonNamevalueForAdoptionRecruitment(String expectedlCaseValue) throws AcisException {
		logger.info("Verifying Person Name");
		waitForPageLoad();
		waitForElement(driver.findElement(By.xpath("(//a[contains(text(),'" + expectedlCaseValue + "')])[last()]")));
		waitForPageLoadTill(9);
		// clickWebElement(getCaseActionvalueForAdoptionRecruitment);
		String actualCaseValue = driver
				.findElement(By.xpath("(//a[contains(text(),'" + expectedlCaseValue + "')])[last()]")).getText().trim();
		System.out.println(actualCaseValue);
		Assert.assertNotNull(actualCaseValue, "Verified Person Name");
		logger.info("Verified Person Name");

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void getDateOfEntryvalueForAdoptionRecruitment(String expectedlCaseValue) throws AcisException {

		waitForPageLoad();
		waitForElement(driver.findElement(By.xpath("//span[text()='" + expectedlCaseValue + "']")));
		waitForPageLoadTill(9);
		// clickWebElement(getCaseActionvalueForAdoptionRecruitment);
		String actualCaseValue = driver.findElement(By.xpath("//span[text()='" + expectedlCaseValue + "']")).getText()
				.trim();
		Assert.assertEquals(actualCaseValue, expectedlCaseValue);

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void getDOBvalueForAdoptionRecruitment(String expectedlCaseValue) throws AcisException {

		waitForPageLoad();
		waitForElement(driver.findElement(By.xpath("//span[text()='" + expectedlCaseValue + "'][2]")));
		waitForPageLoadTill(9);
		// clickWebElement(getCaseActionvalueForAdoptionRecruitment);
		String actualCaseValue = driver.findElement(By.xpath("//span[text()='" + expectedlCaseValue + "']")).getText()
				.trim();
		Assert.assertEquals(actualCaseValue, expectedlCaseValue);

	}

	/***
	 * clickONPersonNameAdoptionRecruitment
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickONPersonNameAdoptionRecruitment(String PersonName) throws AcisException {
		logger.info("Clicking on Person Name");
		waitForPageLoad();
		waitForElement(driver.findElement(By.xpath("(//a[contains(text(),'" + PersonName + "')])[last()]")));
		waitForPageLoadTill(9);
		// clickWebElement(getCaseActionvalueForAdoptionRecruitment);
		WebElement actualCaseValue = driver
				.findElement(By.xpath("(//a[contains(text(),'" + PersonName + "')])[last()]"));
		actualCaseValue.click();
		logger.info("Clicked on Person Name");

	}

	/***
	 * clickOnDetailsTab
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */
	public void clickOnDetailsTab() throws AcisException {

		waitForPageLoad();
		waitForElement(DetailsTab);
		waitForPageLoadTill(19);
		clickWebElement(DetailsTab);

		logger.info("Clicked on Details Tab");

	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void getPersonORAccountvalueUnderDetailsTab(String expectedlCaseValue) throws AcisException {

		waitForPageLoad();
	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,150)");
		String actualCaseValue2 = PersonFirstName.getText();
		String FNActualValue = PersonFirstName.getText();

		System.out.println(FNActualValue);
		Boolean value = FNActualValue.contains(actualCaseValue2);
		Assert.assertTrue(value, "Verified Person Account");
		logger.info("Verified Person Account");
	
	}

	/***
	 * Selecting next button
	 * 
	 * @author virendra.kumar
	 * @throws AcisException
	 */

	public void geCurrentURLvalueafterRedirectionAdopcnRecrment() throws AcisException {

		waitForPageLoad();
		waitForPageLoadTill(9);
		String expectedlCaseValue = "lightning.force.com/lightning/r/Account/";
		String actualCaseValue = driver.getCurrentUrl().trim();
		System.out.println(actualCaseValue);

		Assert.assertTrue(actualCaseValue.contains(expectedlCaseValue));
		logger.info("Verified URL");
		// verifyTextEquals(AppLauncher, actualCaseValue);

	}
}
