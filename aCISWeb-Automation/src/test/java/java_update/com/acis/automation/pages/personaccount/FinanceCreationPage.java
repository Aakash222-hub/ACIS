package com.acis.automation.pages.personaccount;

import java.util.Iterator;
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

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class FinanceCreationPage extends PageBase {

	public FinanceCreationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(FinanceCreationPage.class);
	@FindBy(xpath = "//span[text()='Income']/../..//a")
	WebElement personIncomeTab;

	@FindBy(xpath = "(//span[text()='Income']/../..//a)[2]")
	WebElement personIncomeTabSecond;

	@FindBy(xpath = "//a[@title='New']")
	WebElement newPersonIncomeButton;

	@FindBy(xpath = "//th[@title='Income ID']")
	WebElement incomeIDLabel;

	@FindBy(xpath = "//th[@title='Source/Employer Name']")
	WebElement sourceEmployerLabel;

	@FindBy(xpath = "//th[@title='Amount']")
	WebElement amountLabel;

	@FindBy(xpath = "//th[@title='Frequency']")
	WebElement frequencyLabel;

	@FindBy(xpath = "//th[@title='Start Date']")
	WebElement startDateLabel;

	@FindBy(xpath = "//th[@title='End Date']")
	WebElement endDateLabel;

	@FindBy(xpath = "//span[text()='Income Type']/../..//a[text()='--None--']")
	WebElement incomeTypeDropdown;

	@FindBy(xpath = "//*[text()='Adoption Assistance']")
	WebElement Adoption;

	@FindBy(linkText = "Adoption Assistance")
	WebElement Adoptionlinktext;

	@FindBy(xpath = "//span[text()='Frequency']/../..//a[text()='--None--']")
	WebElement frequencyTypeDropdown;

	@FindBy(xpath = "//a[text()='Monthly']")
	WebElement Annually;

	@FindBy(linkText = "Annually") // *[text()='Child Support']
	WebElement annuallylinktext;

	@FindBy(xpath = "//span[text()='Source/Employer Name']/../..//input[@type='text']")
	WebElement sourceEmployerTextBox;

	@FindBy(xpath = "//span[text()='Other Frequency']/../..//input[@type='text']")
	WebElement otherFrequencyTextBox;

	@FindBy(xpath = "//*[text()='Amount']/../..//input[@type='text']") // *[text()='Child Support']
	WebElement AmountTextBox;

	@FindBy(xpath = "//span[text()='End Date']//..//..//a[@class='datePicker-openIcon display']")
	WebElement endDateDatePickerButton;

	@FindBy(xpath = "//span[text()='Start Date']//..//..//a[@class='datePicker-openIcon display']")
	WebElement startDatePickerButton;

	@FindBy(xpath = "//a[@title='Go to previous month']")
	WebElement calendarPreviousMonthButton;

	@FindBy(xpath = "//a[@title='Go to next month']")
	WebElement calendarNexthMonthButton;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//span[text()='Income']//..//..//a[@title='Income']")
	WebElement incomeTab;

	@FindBy(xpath = "//*[@class='slds-day weekday todayDate selectedDate DESKTOP uiDayInMonthCell--default']")
	WebElement currentDate;

	@FindBy(xpath = "//td[@data-datevalue='2020-10-04']")
	WebElement futureDate;

	@FindBy(xpath = "//td[@data-datevalue='2020-08-02']")
	WebElement paststartDate;

	@FindBy(xpath = "//td[@data-datevalue='2020-09-02']")
	WebElement pastEndDate;

	@FindBy(xpath = "//span[text()='Income ID']/../..//lightning-formatted-text")
	WebElement incomeIdCreated;

	@FindBy(xpath = "(//span[@title='Case Person ID'][text()='Case Person ID'])[2]")
	WebElement casePersonIdLabel;

	@FindBy(xpath = "//span[contains(text(),'Close INC-0000')]//..//lightning-primitive-icon")
	WebElement closeIncomeTab;

	@FindBy(xpath = "//span[text()='Show Actions']")
	WebElement deleteAllData;

	@FindBy(xpath = "//div[text()='Delete']")
	WebElement deleteRecord;

	@FindBy(xpath = "//span[text()='Delete']")
	WebElement deleteFile;
//New object

	@FindBy(xpath = "//label[text()='Start Date']//..//..//..//input")
	WebElement startDate;

	@FindBy(xpath = "//label[text()='End Date']//..//..//..//input")
	WebElement endDate;

	@FindBy(xpath = "//label[text()='Verification Date']//..//..//..//input")
	WebElement verificationDate;

	@FindBy(xpath = "//label[text()='Amount']//..//..//..//input")
	WebElement amountDate;

	@FindBy(xpath = "//span[text()='Type']//..//..//..//input")
	WebElement typeInput;

	@FindBy(xpath = "(//span[text()='Status']//..//..//..//input)[last()]")
	WebElement statusInput;

	@FindBy(xpath = "(//span[text()='Status']//..//..//..//input)[last()]/../../..//*[text()='In Progress'][last()]")
	WebElement inProgressStatus;

	@FindBy(xpath = "(//span[text()='Status']//..//..//..//input)[last()]/../../..//*[text()='Verified'][last()]")
	WebElement verifiedStatus;

	@FindBy(xpath = "(//span[text()='Status']//..//..//..//input)[last()]/../../..//*[text()='Submitted'][last()]")
	WebElement submittedStatus;

	@FindBy(xpath = "(//span[text()='Status']//..//..//..//input)[last()]/../../..//*[text()='Confirmed'][last()]")
	WebElement confirmStatus;

	@FindBy(xpath = "(//span[text()='Status']//..//..//..//input)[last()]/../../..//*[text()='Expired'][last()]")
	WebElement expiredStatus;

	@FindBy(xpath = "//span[text()='Frequency']//..//..//..//input")
	WebElement frequencyDropdown;

	@FindBy(xpath = "//label[text()='Amount']/..//..//.//input")
	WebElement amountInput;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]")
	WebElement type;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Adoption Assistance'][last()]")
	WebElement adoptionAssistance;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Bank Accounts'][last()]")
	WebElement bankAccount;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Cash'][last()]")
	WebElement cash;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Child Care'][last()]")
	WebElement childCare;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Child Support'][last()]")
	WebElement childSupport;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Disability'][last()]")
	WebElement disablityType;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Educational\\Student'][last()]")
	WebElement educationalStudent;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Employment'][last()]")
	WebElement employment;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Food Stamps'][last()]")
	WebElement foodStamps;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Gross Earned Income'][last()]")
	WebElement grossearnedIncome;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Interest/Dividend'][last()]")
	WebElement intrest;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Medical Assistance'][last()]")
	WebElement medicalAssistance;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Mortgage'][last()]")
	WebElement mortgage;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Other'][last()]")
	WebElement other;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Rent'][last()]")
	WebElement rent;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Retirement Benefits'][last()]")
	WebElement retiralBenifits;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Social Security'][last()]")
	WebElement socialSecurity;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Student Loans'][last()]")
	WebElement studentLoan;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Trust Fund'][last()]")
	WebElement trustFound;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Unemployment Benefits'][last()]")
	WebElement unemployment;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Utilities'][last()]")
	WebElement utilities;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Vehicle'][last()]")
	WebElement vehicle;

	@FindBy(xpath = "(//span[text()='Type']//..//..//..//input)[last()]/../../..//*[text()='Veterans'][last()]")
	WebElement veteran;

	// Frequency
	@FindBy(xpath = "(//span[text()='Frequency']//..//..//..//input)[last()]")
	WebElement frequency;

	@FindBy(xpath = "(//span[text()='Frequency']//..//..//..//input)[last()]/../../..//*[text()='Hourly'][last()]")
	WebElement hourlyFrequency;

	@FindBy(xpath = "(//span[text()='Frequency']//..//..//..//input)[last()]/../../..//*[text()='Daily'][last()]")
	WebElement dailyFrequency;

	@FindBy(xpath = "(//span[text()='Frequency']//..//..//..//input)[last()]/../../..//*[text()='Weekly'][last()]")
	WebElement weeklyFrequency;

	@FindBy(xpath = "(//span[text()='Frequency']//..//..//..//input)[last()]/../../..//*[text()='Bi-Weekly'][last()]")
	WebElement biweekelyFrequency;

	@FindBy(xpath = "(//span[text()='Frequency']//..//..//..//input)[last()]/../../..//*[text()='Monthly'][last()]")
	WebElement monthlyFrquency;

	@FindBy(xpath = "(//span[text()='Frequency']//..//..//..//input)[last()]/../../..//*[text()='Yearly'][last()]")
	WebElement yearlyFrequency;

	@FindBy(xpath = "//*[text()='Submit'][last()]")
	WebElement submitButton;

	@FindBy(xpath = "//label[text()='Source']//../..//input")
	WebElement sourElement;

	@FindBy(xpath = "(//span[text()='Finances']//..//..//a)[1]")
	WebElement financeTabafterComplete;

	@FindBy(xpath = "(//button[@name='refreshButton']//..//..//lightning-button-icon[@class='forceRefreshButton'])[3]")
	WebElement refresh;

	@FindBy(xpath = "(//span[text()='Financial Statements'])[last()-1]")
	WebElement financeTab;

	/***
	 * Verifying field in Information Page
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void verifyFieldInInformation() throws AcisException, InterruptedException {

		logger.info("Verifying the list of status inside the dropdown");
		clickWebElement(statusInput);
		waitForPageLoadTill(9);
		logger.info("Clicked on status input");
		verifyElementNotPresent(inProgressStatus);
		logger.info("Verified inProgress Status");
		verifyElementNotPresent(verifiedStatus);
		logger.info("Verified verified status");
		verifyElementNotPresent(confirmStatus);
		logger.info("Verified confirm status");
		verifyElementNotPresent(expiredStatus);
		logger.info("Verified expired status");
	}

	/***
	 * Select status in create Finance
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * 
	 */

	public void status(String statusOption) throws AcisException {

		waitForPageLoadTill(9);
		logger.info("Selecting status");
		switch (statusOption) {
		case "InProgress":
			logger.info("Selecting InProgress status from the dropdown");
			waitForPageLoadTill(9);
			waitForElement(inProgressStatus);
			clickWebElement(inProgressStatus);
			logger.info("Selected in Progress status");
			break;

		case "Verfied":
			logger.info("Selecting Verified In Status from the status dropdown");

			waitForPageLoadTill(9);
			waitForElement(verifiedStatus);
			clickWebElement(verifiedStatus);
			logger.info("Selected verified Status");
			break;

		case "Submitted":
			logger.info("Selecting submitted status from the status dropdown");
			waitForPageLoadTill(9);
			waitForElement(submittedStatus);
			clickWebElement(submittedStatus);
			logger.info("Selected submitted status");
			break;

		case "confirmed":
			logger.info("Selecting confirmed status from the status dropdown");
			waitForPageLoadTill(9);
			waitForElement(confirmStatus);
			clickWebElement(confirmStatus);
			logger.info("Selecting confirm status");
			break;

		default:
			break;
		}

	}

	/***
	 * Entering Amount value
	 * 
	 * @throws AcisException
	 * 
	 */

	public void amount(String str) throws AcisException {
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		waitForElement(amountInput);
		clickWebElement(amountInput);
		logger.info("Entering amount");
		waitForPageLoadTill(9);
		actions.sendKeys(Keys.CONTROL).sendKeys(str).perform();
		logger.info("Entered amount " + str);

	}

	/***
	 * verifying the type
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void verifyType() throws AcisException {
		waitForElement(type);
		logger.info("Verifying type");
		clickWebElement(type);
		verifyElementNotPresent(adoptionAssistance);
		logger.info("Verifying type " + adoptionAssistance);
		verifyElementNotPresent(bankAccount);
		logger.info("Verifying type bankAccount");
		verifyElementNotPresent(cash);
		logger.info("Verifying type cash");
		verifyElementNotPresent(childCare);
		logger.info("Verifying child care type");
		verifyElementNotPresent(childSupport);
		logger.info("Verifying child support");
		verifyElementNotPresent(disablityType);
		logger.info("Verifying the type of dusablityType");
		verifyElementNotPresent(educationalStudent);
		logger.info("Verifying the type of educationStudent");
		verifyElementNotPresent(employment);
		logger.info("Verifying the type of employment");
		verifyElementNotPresent(foodStamps);
		logger.info("Verifying the type food stamps");
		verifyElementNotPresent(grossearnedIncome);
		logger.info("Verify the type gross earn Income");
		verifyElementNotPresent(intrest);
		logger.info("Verifying the intrest type");
		verifyElementNotPresent(medicalAssistance);
		logger.info("Verifying the medical Assistance");
		verifyElementNotPresent(mortgage);
		logger.info("Verifying the type morgage");
		verifyElementNotPresent(other);
		logger.info("Verifying other type");
		verifyElementNotPresent(rent);
		logger.info("Verifying the rent type");
		verifyElementNotPresent(retiralBenifits);
		logger.info("Verifying retiral benifits");
		verifyElementNotPresent(socialSecurity);
		logger.info("verifying social security type");
		verifyElementNotPresent(studentLoan);
		logger.info("Verifying student loan");
		verifyElementNotPresent(trustFound);
		logger.info("Verifying trust found");
		verifyElementNotPresent(unemployment);
		logger.info("Verifying the unemployment type");
		verifyElementNotPresent(utilities);
		logger.info("Verifying utilities type");
		verifyElementNotPresent(vehicle);
		logger.info("Verifying vehicle type");
		verifyElementNotPresent(veteran);
		logger.info("Verifying the veteran type");

	}

	/***
	 * 
	 * Selecting type
	 * 
	 * @throws AcisException
	 */

	public void selectingType(String option) throws AcisException {
		switch (option) {
		case "Adoption":
			waitForElement(adoptionAssistance);
			clickWebElement(adoptionAssistance);
			logger.info("Selected adoption assistance");
			break;
		case "Bank":
			waitForElement(bankAccount);
			clickWebElement(bankAccount);
			logger.info("Slected bank");
			break;
		case "Cash":
			waitForElement(cash);
			clickWebElement(cash);
			logger.info("Selected cash");
			break;
		case "ChildCare":
			waitForElement(childCare);
			clickWebElement(childCare);
			logger.info("Selected child care option");
			break;

		default:
			break;
		}

	}

	/***
	 * Entering start end verification date
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * 
	 */

	public void enterDate(String option, String str) throws AcisException {
		Actions actions = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,950)");
		waitForPageLoadTill(9);
		switch (option) {
		case "start":
			clickWebElement(startDate);
			waitForPageLoadTill(5);
			actions.sendKeys(Keys.CONTROL).sendKeys(str).perform();
			waitForPageLoadTill(9);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).perform();
			System.out.println(str);
			logger.info("Entered Start Date");
			break;
		case "end":
			clickWebElement(endDate);
			waitForPageLoadTill(9);
			actions.sendKeys(Keys.CONTROL).sendKeys(str).perform();
			waitForPageLoadTill(9);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).perform();
			logger.info("Entered end date");
			break;
		case "verification":
			clickWebElement(verificationDate);
			waitForPageLoadTill(9);
			actions.sendKeys(Keys.CONTROL).sendKeys(str).perform();
			waitForPageLoadTill(9);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).perform();
			logger.info("Entered verification Date");
			break;

		default:
			break;
		}
	}

	/***
	 * Verifying Income created according to its position
	 */

	public void verifyIncomeAccordingtoEndDate(String startDate, String endDate, String statusType) {

		waitForPageLoad();
		waitForPageLoadTill(8);
		List<WebElement> financeId = driver.findElements(By.xpath("//tbody//tr//td"));
		int totalIncomeId = financeId.size();

		for (int i = 0; i < totalIncomeId; i++) {

			System.out.println(financeId.get(i).getText());
			if (financeId.get(i).getText().equalsIgnoreCase(startDate)
					& financeId.get(i).getText().equalsIgnoreCase(endDate)
					& financeId.get(i).getText().equalsIgnoreCase(statusType)) {
				logger.info("Verified the finance income");
				break;
			}

		}

	}

	/***
	 * Delete all data This method will delete all data which is been stored
	 * 
	 * @author akash.a.gaurav
	 */

	public void deleteAllData() throws AcisException {

		List<WebElement> arrowsofRecords = driver.findElements(By.xpath("//span[text()='Show Actions']"));

		int sizeofRecords;
		sizeofRecords = arrowsofRecords.size();
		while (sizeofRecords != 0) {
			clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//*[text()='Show Actions'])/../../..//a")));
			waitForPageLoadTill(2);
			clickWebElemntUsingJavascriptExecutor(deleteRecord);
			waitForPageLoadTill(8);
			clickWebElement(deleteFile);
			waitForPageLoadTill(15);
			sizeofRecords--;
		}

		logger.info("Deleted All Data ");

	}

	/***
	 * @author akash.a.gaurav Verify Frequency
	 */

	/***
	 * verifying the frequency
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void verifyFrequency() throws AcisException {
		waitForElement(type);
		logger.info("Verifying frequency");
		clickWebElement(frequency);
		verifyElementNotPresent(hourlyFrequency);
		logger.info("Verifying type " + hourlyFrequency);
		verifyElementNotPresent(hourlyFrequency);
		logger.info("Verifying type hourlyFrequency");
		verifyElementNotPresent(dailyFrequency);
		logger.info("Verifying type dailyFrequency");
		verifyElementNotPresent(weeklyFrequency);
		logger.info("Verifying type weeklyFrequency");
		verifyElementNotPresent(biweekelyFrequency);
		logger.info("Verifying type dailyFrequency");
		verifyElementNotPresent(monthlyFrquency);
		logger.info("Verifying type monthlyFrquency");
		verifyElementNotPresent(yearlyFrequency);
		logger.info("Verifying type yearlyFrequency");

	}

	/***
	 * Select status in enter Frequency
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * 
	 */

	public void selectFrequency(String statusOption) throws AcisException {

		waitForPageLoadTill(9);
		logger.info("Selecting frequency");
		switch (statusOption) {
		case "Hourly":
			logger.info("Selecting Hourly frequency from the dropdown");
			waitForPageLoadTill(9);
			waitForElement(hourlyFrequency);
			clickWebElement(hourlyFrequency);
			logger.info("Selected Hourly status");
			break;

		case "Daily":
			logger.info("Selecting dailyFrequency In frequency from the status dropdown");

			waitForPageLoadTill(9);
			waitForElement(dailyFrequency);
			clickWebElement(dailyFrequency);
			logger.info("Selected dailyFrequency Status");
			break;

		case "weekely":
			logger.info("Selecting weekely dropdown");
			waitForPageLoadTill(9);
			waitForElement(submittedStatus);
			clickWebElement(submittedStatus);
			logger.info("Selected submitted status");
			break;

		case "bi-weekely":
			logger.info("Selecting bi-weekely dropdown");
			waitForPageLoadTill(9);
			waitForElement(biweekelyFrequency);
			clickWebElement(biweekelyFrequency);
			logger.info("Selected biweekelyFrequency status");
			break;

		case "Monthly":
			logger.info("Selecting monthly dropdown");
			waitForPageLoadTill(9);
			waitForElement(monthlyFrquency);
			clickWebElement(monthlyFrquency);
			logger.info("Selected monthlyFrquency status");
			break;

		case "yearly":
			logger.info("Selecting yearly dropdown");
			waitForPageLoadTill(9);
			waitForElement(yearlyFrequency);
			clickWebElement(yearlyFrequency);
			logger.info("Selected yearlyFrequency status");
			break;

		default:
			break;
		}

	}

	/***
	 * @author akash.a.gaurav Submitting button
	 * @throws AcisException
	 */

	public void submitFinance() throws AcisException {
		logger.info("Submitting the created finane");
		waitForPageLoadTill(9);
		waitForElement(submitButton);
		clickWebElement(submitButton);
		logger.info("Submitted the finace page");
		waitForPageLoadTill(15);
		logger.info("Clicking on finance tab");
		waitForElement(financeTab);

		clickWebElemntUsingJavascriptExecutor(financeTab);
		waitForPageLoadTill(10);
		logger.info("On the report page");
		//clickWebElemntUsingJavascriptExecutor(refresh);
		logger.info("Click on refresh");

	}

	/***
	 * Verifying source and type label
	 * 
	 * @author akash.a.gaurav
	 */

	public void verifyingSource() {
		String source = sourElement.getText().trim();
		System.out.println(source);
		if (source.equalsIgnoreCase("Cash")) {
			logger.info("Verification and source label verified");
		}

	}

}