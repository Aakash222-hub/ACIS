package com.acis.automation.pages.providermanagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.library.TestBase;

import com.acis.automation.utilities.AcisException;

public class AccountPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(AccountPage.class);

	public AccountPage() throws AcisException {
	}

	@FindBy(xpath = "//button[text()='Foster Parent Inquiry Form']")
	WebElement fosterParentInquiry;

	@FindBy(xpath = "//input[@id='mail']")
	WebElement mailText;

	@FindBy(xpath = "//div[@class='slds-icon-waffle']")
	WebElement acisLogo;

	@FindBy(xpath = "//div[@aria-label='Items']")
	WebElement prospectiveItem;

	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	WebElement searchType;

	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	WebElement inputTextAreaProspective;

	@FindBy(xpath = "(//a[contains(@title,'PN - ')])[1]")
	WebElement firstRecord;

	@FindBy(xpath = "(//a[contains(@title,'E-')])[1]")
	WebElement firstEventRecord;

	@FindBy(xpath = "//button[text()='Convert to Foster Parent Account']")
	WebElement fosterParentAccountLink;

	@FindBy(xpath = "//select[@class='select uiInput uiInputSelect uiInput--default uiInput--select']")
	WebElement placementType;

	@FindBy(xpath = "//div[@class='uiOutputRichText']//p//b")
	WebElement textStatus;

	@FindBy(xpath = "//button[normalize-space()='Finish']")
	WebElement finishButton;

	@FindBy(xpath = "(//span[normalize-space()='All'] )[1]")
	WebElement selectAll1;

	@FindBy(xpath = "(//span[normalize-space()='All'] )[2]")
	WebElement selectAll;

	@FindBy(xpath = "(//span[normalize-space()='Converted Applicants'] )[2]")
	WebElement selectConvertedApplicants1;

	@FindBy(xpath = "(//span[normalize-space()='Converted Applicants'] )[1]")
	WebElement selectConvertedApplicants;

	@FindBy(xpath = "(//span[normalize-space()='Unconverted Applicants'] )[2]")
	WebElement selectUnconvertedApplicants1;

	@FindBy(xpath = "(//span[normalize-space()='Unconverted Applicants'] )[1]")
	WebElement selectUnconvertedApplicants;

	@FindBy(xpath = "(//a[@title='Select List View'])[1]")
	WebElement listView;

	@FindBy(xpath = "(//a[@title='Select List View'])[2]")
	WebElement listView1;

	@FindBy(xpath = "//button[text()='Foster Parent Inquiry Form']")
	WebElement fosterParentEnquiryLink;

	@FindBy(xpath = "(//button[text()='Next']/../../..//footer//div)[2]")
	WebElement nextConvertTofoster;

	@FindBy(xpath = "(//span[text()='Account Name'])[1]")
	WebElement accountName;

	@FindBy(xpath = "//*[text()='Parent 1']")
	WebElement parentLabel;

	@FindBy(xpath = "(//span[text()='Number of Children in the Home'])[1]")
	WebElement noOfChildren;

	@FindBy(xpath = "(//span[text()='Ages of Children in the Home'])[1]")
	WebElement ageOfChildren;

	@FindBy(xpath = "(//span[text()='Male Age Minimum'])[1]")
	WebElement maleAge;

	@FindBy(xpath = "(//span[text()='Female Age Minimum'])[1]")
	WebElement femaleAge;

	@FindBy(xpath = "//*[text()='Parent 2']")
	WebElement parent2;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;

	@FindBy(xpath = "(//span[text()='Gender of Children in the Home'])[1]")
	WebElement genderofChildren;

	@FindBy(xpath = "(//span[text()='Male Age Maximum'])[1]")
	WebElement maleAgeMax;

	@FindBy(xpath = "(//span[text()='Female Age Maximum'])[1]u")
	WebElement femaleAgeMax;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userNameFosterParent;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordFosterParent;

	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	WebElement loginButtonFosterParent;

	@FindBy(xpath = "//*[text()='Home']")
	WebElement fosterParentHomePage;

	@FindBy(xpath = "//*[text()='Genders Equipped to Provide Care For']")
	WebElement genderEquipped;

//For foster parent page
	@FindBy(xpath = "//span[text()='Account ID']")
	WebElement accountFosterParent;

	@FindBy(xpath = "//span[text()='Parent 1']")
	WebElement nameparent1FosterParent;

	@FindBy(xpath = "//span[text()='Parent 2']")
	WebElement nameparent2FosterParent;

	@FindBy(xpath = "//span[text()='Photo Parent 1']")
	WebElement photoParent1FosterParent;

	@FindBy(xpath = "//span[text()='Photo Parent 2']")
	WebElement photoParent2FosterParent;

	@FindBy(xpath = "//span[text()='Status']")
	WebElement statusFosterParent;

	@FindBy(xpath = "//span[text()='Capacity']")
	WebElement capacityFosterParent;

	@FindBy(xpath = "(//span[text()='Occupancy'])[2]")
	WebElement occupancyFosterParent;

	@FindBy(xpath = "(//span[text()='Date of Certification'])[1]")
	WebElement dateOfCertificationFosterParent;

	@FindBy(xpath = "(//span[text()='Date of Recertification'])[1]")
	WebElement dateOfRecertificationFosterParent;

	@FindBy(xpath = "//span[text()='Photo Parent 1']")
	WebElement photoParent1Foster;
	@FindBy(xpath = "//span[text()='Photo Parent 2']")
	WebElement photoParent2Foster;

	@FindBy(xpath = "(//span[text()='Placement Type'])[2]")
	WebElement placementTypeFoster;

	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement globalSearchDropdown;

	@FindBy(xpath = "//input[@title='Search Allegation Reports and more']")
	WebElement globalSearchAllegation;

	@FindBy(xpath = "//input[contains(@title,'Search')]")
	WebElement searchTextArea;
           
	@FindBy(xpath = "(//button[@name='Edit'])[last()]")
	WebElement editButtonP1;

	@FindBy(xpath = "(//button[@title='Edit Confirm Orientation Attendance'])[2]")
	WebElement editButtonP2;

	@FindBy(xpath = "(//input[@name='ACIS_Confirm_Orientation_Attendance_P1__c'])[last()]")
	WebElement confirmOrientationAttendanceParent1;

	@FindBy(xpath = "(//input[@name='ACIS_Confirm_Orientation_Attendance_P2__c'])[last()]")
	WebElement confirmOrientationAttendanceParent2;

	@FindBy(xpath = "(//p[text()='Placement Type']/..//p[2]//lightning-formatted-text)")
	WebElement placementTypeField;

	@FindBy(xpath = "(//p[text()='Status']/..//p[2]//lightning-formatted-text)")
	WebElement statusField;

	@FindBy(xpath = "(//*[text()='Event Member'])[1]")
	WebElement eventMemberLink;

	@FindBy(xpath = "(//*[text()='Event Member'])[2]")
	WebElement eventMemberLink1;

	@FindBy(xpath = "(//*[text()='Related'])")
	WebElement relatedTab;

	
	@FindBy(xpath="//*[text()='View All']")
	WebElement viewAll;
	
	
	@FindBy(xpath="(//a[@data-aura-class='forceOutputLookup'])[last()-1]")
	WebElement firstPerson;
	
	
	@FindBy(xpath="//*[text()='Edit Confirm Parent 1 Attendance']/..")
	WebElement editFirstPerson;
	
	@FindBy(xpath="//*[text()='Confirm Parent 1 Attendance']/..")
	WebElement confirmParent1;
	
	
	@FindBy(xpath="//button[@name='SaveEdit']")
	WebElement saveEdit;
	
	@FindBy(xpath = "(//span[text()='Parent 1 First Name'])/..//following-sibling::div//lightning-formatted-text")
	WebElement parent1FirstName;

	@FindBy(xpath = "(//span[text()='Parent 1 Last Name'])/..//following-sibling::div//lightning-formatted-text")
	WebElement parent1LastName;

	@FindBy(xpath = "(//span[text()='Parent 2 First Name'])/..//following-sibling::div//lightning-formatted-text")
	WebElement parent2FirstName;

	@FindBy(xpath = "(//span[text()='Parent 2 First Name'])/..//following-sibling::div//lightning-formatted-text")
	WebElement parent2LastName;

	@FindBy(xpath = "(//span[text()='Event Member'])/..//following-sibling::div//lightning-formatted-text")
	WebElement eventMember;

	@FindBy(xpath = "(//span[text()='Prospective Foster Parent ID'])/..//following-sibling::div//a")
	WebElement prospectiveFosterParentID;

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Events']")
	WebElement downArrowEvents;

	@FindBy(xpath = "(//input[@name='ACIS_EventMember__c-search-input'])")
	WebElement searchEventMember;

	@FindBy(xpath = "(//input[@name='ACIS_Prospect__c-search-input'])")
	WebElement searchParentId;

	@FindBy(xpath = "(//input[@name='Account-search-input'])")
	WebElement searchAccount;

	// Event Member details
	@FindBy(xpath = "//table//tr//th/span/span[1]")
	WebElement p1FirstName;

	@FindBy(xpath = "//table//tr//td[3]/span/span[1]")
	WebElement p1LastName;

	@FindBy(xpath = "//table//tr//td[5]/span/span[1]")
	WebElement p2FirstName;

	@FindBy(xpath = "//table//tr//td[6]/span/span[1]")
	WebElement p2LastName;

	@FindBy(xpath = "//table//tr//td[4]/span/span[1]")
	WebElement comfirmOrientationP1;

	@FindBy(xpath = "//table//tr//td[7]/span/span[1]")
	WebElement comfirmOrientationP2;

	public void clickEventMemberLink() throws AcisException {
		logger.info("Clicking on event member Link");
		try {
			waitForElement(eventMemberLink);
			clickWebElemntUsingJavascriptExecutor(eventMemberLink);
		} catch (Exception e) {
			waitForElement(eventMemberLink1);
			clickWebElemntUsingJavascriptExecutor(eventMemberLink1);

		}
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on event member Link");

	}

	public void clickEventMemberRecord(String eventName) throws AcisException {
		List<WebElement> DateOrder=driver.findElements(By.xpath("//span[text()='Event Member']/../..//span[contains(text(),'Sorted Descending')]"));//span[contains(text(),'Sorted Descending')]
		logger.info("Date Order: "+DateOrder.size());
		if(DateOrder.size()==1)
		{
			clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//span[contains(text(),'Event Member')])[last()]")));
			logger.info("Clicked on Event Member in Ascending Order ");
		}
		logger.info("Clicking on event member Record ");
		String memberRecord = "//a[contains(text(),'@name')]".replace("@name", eventName);
		// String memberRecord = "//a[contains(text(),'AEEC')]";
		logger.info("value:" + memberRecord);
		scrollingToElementofAPage(driver.findElement(By.xpath(memberRecord)));
		waitForPageLoadTill(5);
		// waitForElement(driver.findElement(By.xpath(memberRecord)));
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath(memberRecord)));
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on event member Record");

	}
//priyanka
	public void clickEventIdRecord(String strText) throws AcisException {
		logger.info("Clicking on Select List View");

		try {

			clickWebElement(listView);
		} catch (Exception e1) {
			clickWebElement(listView1);
		}
		logger.info("Clicked on Select List View");
		waitForPageLoadTill(5);
		logger.info("Selecting My Investigation from Select List View");
		try {

			clickWebElement(selectAll);
		} catch (Exception e) {
			waitForElementClickable(selectAll1);
			clickWebElement(selectAll1);
		}
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected My Investigation from Select List View");
		waitForPageLoadTill(5);
		waitForPageLoadTill(5);
		List<WebElement> DateOrder=driver.findElements(By.xpath("//span[contains(text(),'Sorted Ascending')]"));//span[contains(text(),'Sorted Descending')]
		logger.info("Date Order: "+DateOrder.size());
		if(DateOrder.size()==1)
		{
			clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//th[@title='Date/Time']//span)[2]")));
			logger.info("Clicked on date in Descending Order ");
		}
		logger.info("Clicking on event member Record ");
		//String memberRecord ="//span[contains(text(),'" + strText + "')]/../..//following-sibling::td[last()-1]//a".replace("name", pin);
		//logger.info("Value "+memberRecord);
		waitForPageLoadTill(5);
		Actions action = new Actions(driver);
		
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//span[contains(text(),'" + strText + "')]/../..//following-sibling::td[last()-1]//a")));
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Event ID Record");

	}

	public void clickDownArrowEvents() throws AcisException {
		logger.info("Clicking on DownArrow");
		waitForElementClickable(downArrow);
		clickWebElement(downArrow);
		logger.info("Clicked on DownArrow");
		waitForPageLoadTill(5);
		logger.info("Clicking on Events from DownArrow");
		waitForElementClickable(downArrowEvents);
		clickWebElemntUsingJavascriptExecutor(downArrowEvents);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on Events from DownArrow");

	}

	/**
	 * clicking on foster parent inquiry form
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void clickingFosterInquiry(String str) throws AcisException, InterruptedException {

		waitForPageLoadTill(9);
		clickWebElement(acisLogo);
		logger.info("Clicked on on the dot icon");
		waitForPageLoadTill(9);
		waitForElement(searchType);
		enterText(searchType, str);
		logger.info("Enteredt test prospective");
		waitForPageLoadTill(9);
		clickWebElement(prospectiveItem);
		logger.info("Clicked on Prospective link");
		waitForPageLoadTill(9);

	}

	/**
	 * @author akash.a.gaurav
	 * @param state
	 * @throws AcisException        Selecting placment resource
	 * @throws InterruptedException
	 */

	public void placement(String str) throws AcisException, InterruptedException {

		logger.info("Entering the value of state");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);

		actions.doubleClick(placementType).perform();
		Thread.sleep(3000);
		Select stateList = new Select(placementType);
		List<WebElement> elementCount = stateList.getOptions();
		System.out.println(elementCount);
		int iSize = elementCount.size();

		for (int i = 0; i < iSize; i++) {
			String placementValue = elementCount.get(i).getText().trim();
			System.out.println(placementValue);
			if (placementValue.equalsIgnoreCase(str)) {
				stateList.selectByVisibleText(str);
				logger.info(" matching state Value");
				break;
			} else {
				System.out.println("No matching state Value");
				logger.info("No matching state Value");
			}

		}
		waitForPageLoadTill(9);
		clickWebElement(nextConvertTofoster);
		logger.info("Clicked on convert to foster");

	}

	/***
	 * Verifying status converted to person record
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void verifyStatusConverttoPerson(String str) throws AcisException {
		waitForPageLoadTill(9);
		//verifyTextEquals(textStatus, str);
		logger.info("Verified status converted to person record");
		//clickWebElement(finishButton);
		logger.info("Clicked on finish button");

	}

	/**
	 * Select : All
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectAll() throws AcisException {
		logger.info("Clicking on Select List View");

		try {

			clickWebElement(listView);
		} catch (Exception e1) {
			clickWebElement(listView1);
		}
		logger.info("Clicked on Select List View");
		waitForPageLoadTill(5);
		logger.info("Selecting My Investigation from Select List View");
		try {

			clickWebElement(selectAll);
		} catch (Exception e) {
			waitForElementClickable(selectAll1);
			clickWebElement(selectAll1);
		}
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected My Investigation from Select List View");
		waitForPageLoadTill(5);
		clickWebElement(firstRecord);
		logger.info("Clicked on first Record");
	}

	public void selectAllParentId() throws AcisException {
		logger.info("Clicking on Select List View");

		try {

			clickWebElement(listView);
		} catch (Exception e1) {
			clickWebElement(listView1);
		}
		logger.info("Clicked on Select List View");
		waitForPageLoadTill(5);
		logger.info("Selecting All from Select List View");
		try {

			clickWebElement(selectAll);
		} catch (Exception e) {
			waitForElementClickable(selectAll1);
			clickWebElement(selectAll1);
		}
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected All from Select List View");
	}

	/**
	 * Select : Converted Applicants
	 * 
	 * @author priyanka
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectConvertedApplicants() throws AcisException {
		logger.info("Clicking on Select List View");

		try {

			clickWebElement(listView);
		} catch (Exception e1) {
			clickWebElement(listView1);
		}
		logger.info("Clicked on Select List View");
		waitForPageLoadTill(5);
		logger.info("Selecting My Investigation from Select List View");
		try {

			clickWebElement(selectConvertedApplicants);
		} catch (Exception e) {
			waitForElementClickable(selectConvertedApplicants1);
			clickWebElement(selectConvertedApplicants1);
		}
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected Converted Applicants from Select List View");
		waitForPageLoadTill(5);

	}

	/**
	 * Select : Unconverted Applicants
	 * 
	 * @author priyanka
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectUnconvertedApplicants() throws AcisException {
		logger.info("Clicking on Select List View");

		try {

			clickWebElement(listView);
		} catch (Exception e1) {
			clickWebElement(listView1);
		}
		logger.info("Clicked on Select List View");
		waitForPageLoadTill(5);
		logger.info("Selecting Unconverted Applicants from Select List View");
		try {
			waitForElementClickable(selectUnconvertedApplicants);

			clickWebElement(selectUnconvertedApplicants);
		} catch (Exception e) {
			waitForElementClickable(selectUnconvertedApplicants1);
			clickWebElement(selectUnconvertedApplicants1);
		}
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected Unconverted Applicants from Select List View");
		waitForPageLoadTill(5);

	}

	public void eventRecordLink() throws AcisException {
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(firstEventRecord);
		logger.info("Clicked on Event Record Link");
		waitForPageLoadTill(9);
	}

	/***
	 * Clicking on fosterParentAccountLink
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void fosterParentAccountLink() throws AcisException {
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(fosterParentAccountLink);
		logger.info("Clicked on foster parent Account Link");
		waitForPageLoadTill(9);
	}

	/***
	 * Switching Inquiry page
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void swiitchInquiryPage() throws AcisException {

		customUrL("FosterInquiry");
		waitForPageLoad();
		waitForPageLoadTill(19);
		logger.info("Switched to Inquiry Page");
		switchToWindowBytitle("Home");
		waitForPageLoadTill(19);
		logger.info("Clicking on foster parent enquiry link");
		clickWebElemntUsingJavascriptExecutor(fosterParentEnquiryLink);
		logger.info("Clicked on foster parent enquiry link");
		waitForPageLoadTill(19);

	}

	/***
	 * Login to foster parent application
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void loginToForestApplication(String str1, String str2) throws AcisException {
		waitForPageLoadTill(9);
		customUrL("fosterParenturl");
		waitForPageLoad();
		waitForPageLoadTill(9);

		switchToWindowBytitle("Login");
		waitForPageLoadTill(9);
		logger.info("Entering text in foster parent Username");
		clickWebElement(userNameFosterParent);
		enterText(userNameFosterParent, str1);
		logger.info("Entering text in foster parent Password");
		waitForPageLoadTill(3);
		clickWebElement(passwordFosterParent);
		waitForPageLoadTill(3);
		Actions actions = new Actions(driver);
		// actions.keyDown(passwordFosterParent,Keys.SHIFT).sendKeys(str2).keyUp(Keys.SHIFT).perform();

		enterText(passwordFosterParent, str2);
		waitForPageLoadTill(3);
		logger.info("Entered text in foster parent passwrpd");
		clickWebElemntUsingJavascriptExecutor(loginButtonFosterParent);
		logger.info("Clicked on login button");
		waitForPageLoadTill(11);
		verifyElementNotPresent(fosterParentHomePage);
		logger.info("user is on foster parent home page");

	}

	/***
	 * Verifying the fields in the foster parent page
	 * 
	 * @author akash.a.gaurav
	 */

	public void fosterParentfields() {

		waitForPageLoadTill(5);
		logger.info("Verifying account name");
		verifyElementNotPresent(accountName);
		logger.info("Verifiedn account name");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		logger.info("Verifying parent");
		verifyElementNotPresent(parentLabel);
		logger.info("Verfied parent label");
		verifyElementNotPresent(noOfChildren);
		logger.info("Verified no of children field");
		verifyElementNotPresent(ageOfChildren);
		logger.info("verifed age of children field");
		verifyElementNotPresent(maleAge);
		logger.info("verified male age ");
		verifyElementNotPresent(femaleAge);
		logger.info("Verifed femal age");
		verifyElementNotPresent(parent2);
		logger.info("Verified parent 2 field");
		verifyElementNotPresent(genderofChildren);
		logger.info("verified gender of children");
		verifyElementNotPresent(genderEquipped);
		logger.info("Verifed gender equipped");
		verifyElementNotPresent(maleAgeMax);
		logger.info("Verified male age max field");
		verifyElementNotPresent(femaleAgeMax);
		logger.info("Verified female age max verified");
	}

	/***
	 * Verifying following fields display on the Foster Parent Account Page
	 * 
	 * @author akash.a.gaurav
	 * 
	 */

	public void verifyingFieldFosterParent() {
		waitForPageLoad();
		waitForPageLoadTill(9);
		logger.info("Verifying the fields in the account page");
		verifyElementNotPresent(accountFosterParent);
		logger.info("verified account foster parent field");
		verifyElementNotPresent(photoParent1Foster);
		logger.info("Verified photo paeent1 foster");
		verifyElementNotPresent(nameparent1FosterParent);
		logger.info("Verified name parent1 Foster Parent");
		verifyElementNotPresent(nameparent2FosterParent);
		logger.info("Verfied name parent2 FosterParent");
		verifyElementNotPresent(statusFosterParent);
		logger.info("Verified status Foster Parent");
		verifyElementNotPresent(occupancyFosterParent);
		logger.info("Verified occupancy foster parent");
		verifyElementNotPresent(capacityFosterParent);
		logger.info("verified capacity Foster Parent");
		verifyElementNotPresent(placementTypeFoster);
		logger.info("Verified placment type foster");
		verifyElementNotPresent(dateOfCertificationFosterParent);
		logger.info("Verified date of certification foster parent");
		verifyElementNotPresent(dateOfRecertificationFosterParent);
		logger.info("Verified date of re certification foster parent");

	}

	/***
	 * Verifying Event Member details
	 * 
	 * @author priyanka
	 * 
	 */

	public void verifyingEventMemberDetails() {
		waitForPageLoad();
		waitForPageLoadTill(9);
		verifyElementNotPresent(parent1FirstName);
		logger.info("Verified the Parent 1 First Name");
		verifyElementNotPresent(parent1LastName);
		logger.info("verified Parent 1 Last Name");
		verifyElementNotPresent(parent2FirstName);
		logger.info("Verified Parent 2 First Name");
		verifyElementNotPresent(parent2LastName);
		logger.info("Verified Parent 2 Last Name");
		verifyElementNotPresent(prospectiveFosterParentID);
		logger.info("Verified prospective Foster Parent ID");
		verifyElementNotPresent(eventMember);
		logger.info("Verified Event Member");
	}

	public void verifyingEventMemberDetailsInUncoveredApplicants() {
		waitForPageLoad();
		waitForPageLoadTill(9);
		verifyElementNotPresent(p1FirstName);
		logger.info("Verified the Parent 1 First Name");
		verifyElementNotPresent(p1LastName);
		logger.info("verified Parent 1 Last Name");
		verifyElementNotPresent(comfirmOrientationP1);
		logger.info("Verified comfirm Orientation Parent 1 ");
		verifyElementNotPresent(p2FirstName);
		logger.info("Verified Parent 2 First Name");
		verifyElementNotPresent(p2LastName);
		logger.info("Verified Parent 2 Last Name");
		verifyElementNotPresent(comfirmOrientationP2);
		logger.info("Verified comfirm Orientation Parent 2 ");
		verifyElementNotPresent(firstEventRecord);
		logger.info("Verified Event ID");
		verifyElementNotPresent(firstRecord);
		logger.info("Verified prospective Foster Parent ID");
	}

	public String getprospectiveFosterParentID() {
		return (firstRecord.getText());
	}

	public void verifyingEventMemberDetailsInCoveredApplicants() {
		waitForPageLoad();
		waitForPageLoadTill(9);
		verifyElementNotPresent(p1FirstName);
		logger.info("Verified the Parent 1 First Name");
		verifyElementNotPresent(p1LastName);
		logger.info("verified Parent 1 Last Name");
		verifyElementNotPresent(comfirmOrientationP1);
		logger.info("Verified comfirm Orientation Parent 1 ");
		verifyElementNotPresent(p2FirstName);
		logger.info("Verified Parent 2 First Name");
		verifyElementNotPresent(p2LastName);
		logger.info("Verified Parent 2 Last Name");
		verifyElementNotPresent(comfirmOrientationP2);
		logger.info("Verified comfirm Orientation Parent 2 ");
		verifyElementNotPresent(firstEventRecord);
		logger.info("Verified Event ID");
		verifyElementNotPresent(firstRecord);
		logger.info("Verified prospective Foster Parent ID");
	}

	/**
	 * click Edit button on Event Member Page
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */

	public void clickEditButtonforP1() throws AcisException {

		logger.info("clicking on edit button P1");
		// waitForPageLoad();
		waitForElement(editButtonP1);
		clickWebElement(editButtonP1);
		waitForPageLoadTill(5);
		// waitForElement(editCasePersonTitle);
		logger.info("clicked on edit button on P1");
	}

	public void clickEditButtonforP2() throws AcisException {

		logger.info("clicking on edit button P2");
		// waitForPageLoad();
		waitForElement(editButtonP2);
		clickWebElement(editButtonP2);
		waitForPageLoadTill(5);
		// waitForElement(editCasePersonTitle);
		logger.info("clicked on edit button on P2");
	}

	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForElement(relatedTab);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");

	}

	/**
	 * click on checkbox button on Confirm Orientation Attendance Parent2
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */
	public void ClickconfirmOrientationAttendanceParent2() throws AcisException {

		logger.info("clickingon checkbox confirm Orientation Attendance Parent2 ");
		// waitForPageLoad();
		scrollingToElementofAPage(confirmOrientationAttendanceParent2);
		clickWebElemntUsingJavascriptExecutor(confirmOrientationAttendanceParent2);
		waitForPageLoadTill(5);
		logger.info("clicked on checkbox confirm Orientation Attendance Parent2");
	}

	public void ClickconfirmOrientationAttendanceParent1() throws AcisException {

		logger.info("clicking on checkbox  confirm OrientationAttendanceParent1 ");
		// waitForPageLoad();
		scrollingToElementofAPage(confirmOrientationAttendanceParent1);
		clickWebElemntUsingJavascriptExecutor(confirmOrientationAttendanceParent1);
		waitForPageLoadTill(5);
		logger.info("clicked on checkbox  confirm OrientationAttendanceParent1");
	}

	/**
	 * click on search Event Member
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */
	public void searchEventMember(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on Event Member Search");
		waitForPageLoadTill(9);

		waitForElement(searchEventMember);
		clickWebElement(searchEventMember);
		enterText(searchEventMember, strText);
		logger.info("Entered text search text area");
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
		waitForPageLoadTill(9);
	}

	/**
	 * click on search prospective Foster parent Id
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */
	public void searchprospectiveFosterParentID(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on prospective Foster Parent ID Search");
		waitForPageLoadTill(9);
		waitForElement(searchParentId);
		clickWebElement(searchParentId);
		enterText(searchParentId, strText);
		logger.info("Entered text search text area");
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//a[contains(@title,'PN ')])[1]")));
		logger.info("Clicked on first Record");
		waitForPageLoadTill(9);
	}

	/**
	 * click on search for Foaster Account
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */
	public void searchAccount(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on prospective Foster Parent ID Search");
		waitForPageLoadTill(9);
		waitForElement(searchAccount);
		clickWebElement(searchAccount);
		enterText(searchAccount, strText);
		logger.info("Entered text search text area");
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
		waitForPageLoadTill(12);
		String memberRecord = "(//a[contains(@title,'@name')])[1]".replace("@name", strText);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath(memberRecord)));
		// clickWebElement(driver.findElement(By.xpath(memberRecord)));
		logger.info("Clicked on first Record");
		waitForPageLoadTill(9);

	}

	/*
	 * save button
	 * 
	 */
	public void clickOnSaveButton() throws AcisException {
		logger.info("clicking on Save button");
		clickWebElement(save);
		logger.info("clicked on Save button");
		waitForPageLoadTill(12);
	}

	// priyanka
	public void verifyPlacementTypeField() throws AcisException {
		logger.info("Verifying Placement Type As Regular Foaster ");
		Assert.assertEquals(placementTypeField.getText(), "Regular Foster");
		logger.info("Verified Placement Type As Regular Foaster");
		waitForPageLoadTill(5);
	}

	// priyanka
	public void verifyStatusField() throws AcisException {
		logger.info("Verifying Status As Applicant ");
		Assert.assertEquals(statusField.getText(), "Applicant");
		logger.info("Verified Status As Applicant");
		waitForPageLoadTill(5);
	}

	/***
	 * @author akash.a.gaurav
	 * @param strText
	 * @throws AcisException
	 * @throws InterruptedException searchig person account
	 */
	public void searchPersonAccount(String strText, String strtext1) throws AcisException, InterruptedException {
		logger.info("Clicking on Global Search");
		waitForPageLoadTill(9);

		waitForElement(searchTextArea);
		clickWebElement(searchTextArea);
		enterText(searchTextArea, strText);
		logger.info("Entered text search text area");
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).perform();
		waitForPageLoadTill(9);
					
		List<WebElement> total_Name = driver
				.findElements(By.xpath("//table//tbody//tr//th//a[@data-aura-class='forceOutputLookup']"));
		int noOfElement = total_Name.size();
		for (int i = 0; i < noOfElement; i++) {

			System.out.println(total_Name.get(i).getText());
			if (strtext1.equalsIgnoreCase(total_Name.get(i).getText().trim())) {
				System.out.println(total_Name.get(i).getText());
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", total_Name.get(i));
				logger.info("Record found and clicked");
				break;

			}

		}
	}
	
	/****
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void relatedList() throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(9);
		clickWebElement(relatedTab);
		waitForPageLoadTill(9);
		logger.info("Clicked on related tab");
	
	}
	/***
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void viewAllClickingOnFirstElement() throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(9);
		logger.info("Clicking on view All");
		clickWebElemntUsingJavascriptExecutor(viewAll);
		
	}
	
	/***
	 *@author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void convertingFosterParent() throws AcisException {
		
		waitForPageLoadTill(9);
		logger.info("Clicking on first element");
		clickWebElement(firstPerson);
		logger.info("Clicked on first person");
		clickWebElemntUsingJavascriptExecutor(firstPerson);
		logger.info("Clicked on first Person");
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(2);
		jse.executeScript("window.scrollBy(0,900)");
		clickWebElement(editFirstPerson);
		waitForPageLoadTill(5);
		clickWebElement(confirmParent1);
		waitForPageLoadTill(5);
		logger.info("Clicked on confirm Parent1");
		
		clickWebElemntUsingJavascriptExecutor(saveEdit);
		
		logger.info("Clicked on saveEdit");
		waitForPageLoadTill(5);
	}
}
