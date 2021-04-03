package com.acis.automation.pages.personaccount;

import java.util.List;

import org.openqa.selenium.By;
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

public class AddressesPage extends PageBase {
	final static Logger logger = LoggerFactory.getLogger(AddressesPage.class);
	public AddressesPage() throws AcisException {
				// TODO Auto-generated constructor stub
	}
	
	
	//public static String addressIDCreated ;
	//public static String addressID_1 ;
	//public static String addressID_2 ;
	public static String primaryStreet1;
	public static String primaryStreet2;
	public static String primaryCity;
	Actions act = new Actions(driver);
	

	@FindBy(xpath = "//a[@title='New']")
	WebElement newAddresses;
	
	@FindBy(xpath = "//a[text()='Mailing']")
	WebElement addressType;
	
	@FindBy(xpath = "//label/span[text()='Primary Address']/../..//input")
	WebElement primaryAddress;

	@FindBy(xpath = "//span[text()='Street 1']/../..//input[@type='text']")
	WebElement street1;
	
	@FindBy(xpath = "//span[text()='Street 2']/../..//input[@type='text']")
	WebElement street2;
	
	@FindBy(xpath = "//span[text()='City']/../..//input")
	WebElement city;
	
	@FindBy(xpath = "//span[text()='State/Territory']/../..//a")
	WebElement statelist;
	
	@FindBy(xpath = "//span[text()='Zip/Postal Code']/../..//input")
	WebElement zipCode;
	
	@FindBy(xpath = "//span[text()='Country']/../..//a[text()='United States of America']")
	WebElement country;
	
	@FindBy(xpath = "//span[text()='Start Date']/../..//input[@type='text']")
	WebElement startDatePicker;
	
	@FindBy(xpath = "//span[text()='End Date']/../..//input[@type='text']")
	WebElement endDatePicker;
	
	@FindBy(xpath = "//label/span[text()='Latitude']/../..//input")
	WebElement latitude;
	
	@FindBy(xpath = "//label/span[text()='Longitude']/../..//input")
	WebElement longitude;
	
	@FindBy(xpath ="//span[text()='10']")
	WebElement startDate;
	
	@FindBy(xpath ="//span[text()='24']")
	WebElement endDate;
	
	@FindBy(xpath ="//span[text()='9']")
	WebElement endDateBeforeStartDate;
	
	@FindBy(xpath ="//button[@title='Save']")
	WebElement save;
	
	@FindBy(xpath ="//span[contains(text(),'Close ADR')]")
	WebElement closeAddressWindow;
	
	@FindBy(xpath ="//h1[@title='Addresses']")
	WebElement addressTabTitle;
	
	@FindBy(xpath ="//span[contains(text(),'Close Addresses')]")
	WebElement closeAddressTab;
	
	@FindBy(xpath ="//span//lightning-formatted-text[contains(text(),'ADR')]")
	WebElement addressID;
	
	@FindBy(xpath ="(//a[text()='Details'])[2]")
	WebElement addressDetailsTab;
	
	//@FindBy(xpath ="//input[@checked='checked']")
	//WebElement primaryAddressChecked;
	public By primaryAddressChecked = By.xpath("//input[@checked='checked']");

	@FindBy(xpath ="(//button[text()='Edit'])[2]")
	WebElement addressEditButton;
	
	@FindBy(xpath ="//button[@title='Cancel']")
	WebElement addressEditCancelButton;
	
	@FindBy(xpath ="//*[contains(text(),'Edit ADR')]")
	WebElement addressEditButtonTitle;
	
	@FindBy(xpath ="//span[@title='Address ID']")
	WebElement AddressIDTitleTable;
	
	@FindBy(xpath ="//span[contains(text(),'Sorted by Address ID')]")
	WebElement sortedByAddressID;
	
	@FindBy(xpath ="(//tbody//tr//th//a)[1]")
	WebElement firstRowAddressRecord;
	
	@FindBy(xpath ="//span[@title='Address ID']/../..//span[contains(text(),'Descending')]")
	WebElement addresIdDescendingOrder;
	
	@FindBy(xpath ="//span[@title='Address ID']/../..//span[contains(text(),'Ascending')]")
	WebElement addressIdAscendingOrder;
	
	@FindBy(xpath ="(//button[text()='Delete'])[2]")
	WebElement deleteAddress;
	
	@FindBy(xpath ="//button[@title='Delete']")
	WebElement deleteAlertBoxbutton;
	
	@FindBy(xpath = "//a[text()='Health']")
	WebElement health;
	
	public By addresIdDescendingOrderBy = By.xpath("//span[@title='Address ID']/../..//span[contains(text(),'Descending')]");
	
	public By addressIdAscendingOrderBy = By.xpath("//span[@title='Address ID']/../..//span[contains(text(),'Ascending')]");

	public By endDateError = By.xpath("//*[contains(text(),'End Date cannot be before Start Date')]");

	public By zipCodeError = By.xpath("//*[contains(text(),'A zipcode must be in ##### or #####-#### format')]");
	
	/**
	 * Clicking on New button
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickNewBtn() throws AcisException {
//		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(newAddresses);
		logger.info("Clicked on New Addresses Button");
		waitForPageLoadTill(5);

	}
	
	/**
	 * select : AddressType on Address Page
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectAddressType(String type) throws AcisException {
		waitForElement(addressType);
		selectDropdownByVisibleTextUsingJavascriptExecutor(addressType, type);
		logger.info("Address Type selected: " + type);
		waitForPageLoadTill(5);
	}
	
	/**
	 * Check Primary Address CheckBox
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void checkPrimaryAddress() throws AcisException {
		clickWebElement(primaryAddress);
		logger.info("Checked PrimaryAddress checkbox");

	}
	
	/**
	 * Enter Text Box : Street1 Name, Street2 Name, City Name, Zip Code, Latitude, Longitude
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void enterTextFieldValue(String textFieldName, String strValue) throws AcisException {
		waitForPageLoad();
		switch(textFieldName)
		{
		   case "street1Name":
			   scrollingToElementofAPage(street1);
			   clickWebElement(street1);
			   act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
			   primaryStreet1 = strValue;
				logger.info("Entered Street1 as: " + strValue);
		      break;
		   
		   case "street2Name":
			   scrollingToElementofAPage(street2);
			   clickWebElement(street2);
			   act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
			   primaryStreet2  = strValue;
				logger.info("Entered Street2 as: " + strValue);
		   break;
		   
		   case "cityName":
			   scrollingToElementofAPage(city);
			   clickWebElement(city);
			   act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
			   primaryCity= strValue;
				logger.info("Entered City as: " + strValue);
		   break;
		   
		   case "zipCode":
			   scrollingToElementofAPage(zipCode);
			   clickWebElement(zipCode);
			   act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
				logger.info("Entered Zip/Postal Code as: " + strValue);
			   break;
			   
		   case "latitude":
			   scrollingToElementofAPage(latitude);
			   clickWebElement(latitude);
			   act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
				logger.info("Entered Latitude as: " + strValue);
			   break;
			   
		   case "longitude":
			   scrollingToElementofAPage(longitude);
			   clickWebElement(longitude);
			   act.sendKeys(Keys.CONTROL).sendKeys(strValue).perform();
				logger.info("Entered Longitude as: " + strValue);
			   break;
		  
		   default : 
			   logger.info("Text Field Value: " + textFieldName+"did not find");
		}
		waitForPageLoadTill(5);
	}
	
	/**
	 * Select : Country
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectCountry(String countryName) throws AcisException {
		scrollingToElementofAPage(country);
//		selectDropdownByVisibleText(country, countryName);
		clickWebElemntUsingJavascriptExecutor(country);
		clickWebElement(driver.findElement(By.xpath("//a[text()='"+ countryName +"']")));
		logger.info("Country selected: " + countryName);
		waitForPageLoadTill(5);
	}
	
	/**
	 * Select : State
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectState(String stateName) throws AcisException {
		selectDropdownByVisibleTextUsingJavascriptExecutor(statelist, stateName);
		logger.info("State selected: " + stateName);

	}
	
	/**
	 * Enter StartDate
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectStartDate() throws AcisException {
		waitForPageLoad();
		scrollingToElementofAPage(startDatePicker);
		clickWebElement(startDatePicker);
		waitForElement(startDate);
		clickWebElement(startDate);
		logger.info("Start Date Selected");

	}
	
	/**
	 * Enter EndDate
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectEndDate() throws AcisException {
		waitForPageLoad();
		clickWebElement(endDatePicker);
		waitForElement(endDate);
		clickWebElement(endDate);
		logger.info("End Date Selected");

	}
	
	/**
	 * Click on Save Button
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickSaveBtn() throws AcisException {
		clickWebElement(save);
		logger.info("Clicked on Save Button");
		waitForPageLoadTill(8);

	}
	
	/**
	 * Owner : Mrunal
	 * Description : Verify Error :End Date cannot be before Start Date
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyEndDateError() throws AcisException, InterruptedException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		scrollingToElementofAPage(startDatePicker);
		clickWebElemntUsingJavascriptExecutor(startDatePicker);
		waitForElement(startDate);
		clickWebElement(startDate);
		
		clickWebElement(endDatePicker);
		waitForElement(endDate);
		clickWebElement(endDateBeforeStartDate);
		clickWebElement(save);
		logger.info("click on Save button");
		waitForElement(endDatePicker);
		scrollingToElementofAPage(endDatePicker);
		waitAndVerifyElement(endDateError);
		
		startDatePicker.clear();
		endDatePicker.clear();
	//	clickWebElement(save);
		logger.info("Verify Error :End Date cannot be before Start Date");
	}
	
	/**
	 * Owner : Mrunal
	 * Description : Verify Error :A zipcode must be in ##### or #####-#### format
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyZipCodeFormatError(String wrongZipCode) throws AcisException, InterruptedException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		scrollingToElementofAPage(zipCode);
		clickWebElement(zipCode);
		act.sendKeys(Keys.CONTROL).sendKeys(wrongZipCode).perform();
		clickWebElement(save);
		waitAndVerifyElement(zipCodeError);
		zipCode.clear();
		logger.info("Verify Error : A zipcode must be in ##### or #####-#### format");
		waitForPageLoadTill(5);
	}
	
	
	/**
	 * Owner : Mrunal
	 * Description : Close new Address window and return Address ID
	 * @return 
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public String closeNewAddressWindow() throws AcisException, InterruptedException {
		waitForPageLoad();
		waitForPageLoadTill(10);
		String addressIDCreated = addressID.getText().trim();
		System.out.println("Address Id  : " + addressIDCreated);
		clickWebElemntUsingJavascriptExecutor(closeAddressWindow);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(addressTabTitle);
		logger.info("Closed new Address window and returned Address ID");
		return addressIDCreated;
		
	}
	
	/**
	 * Owner : Mrunal
	 * Description :  close new address window
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void closeAddressTab() throws AcisException, InterruptedException {

		clickWebElemntUsingJavascriptExecutor(closeAddressTab);
		logger.info("Close address Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForElement(health);
		logger.info("successfully Closed Phone& email  Tab");
	}
	
	
	/**
	 * Owner: Mrunal
	 * Description : Click on address ID and check Primary is checked or not
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickAddressIDAndCheckPrimaryAddress(String address) throws AcisException, InterruptedException {
		
		driver.navigate().refresh();
		waitForElement(addressTabTitle);
		driver.findElement(By.xpath("//a[@title='"+ address +"'] ")).click();
		waitForPageLoadTill(5);
		waitForElement(addressEditButton);
		clickWebElement(addressEditButton);
		
		waitForPageLoadTill(5);
		waitForElement(addressEditButtonTitle);
		
		if(isElementPresent(primaryAddressChecked)) {
			System.out.println("Address ID : " + address + " Primary Address is Checked");
			logger.info("Address ID : " + address + " Primary Address is Checked");
		}
		else
		{
			System.out.println("Address ID : " + address+"Primary Address is NOT checked");
			logger.info("Address ID : " + address + " Primary Address is NOT Checked");
		}
		
		clickWebElement(addressEditCancelButton);
		waitForPageLoadTill(5);
	}
	
	
	/**
	 * Owner: Mrunal
	 * Description : Check previous working address Id got unchecked for Primary address and new address got checked for primary
	 * @throws AcisException 
	 * @throws Exception 
	 */
	public void clickAddressIDAndCheckPrimaryAddress(String previousAddressID, String newAddressID) throws AcisException, Exception {
		
		System.out.println("Address Id 1 : " + previousAddressID);
		System.out.println("Address Id 2 : "+ newAddressID);
		int count=0;
		driver.navigate().refresh();
		waitForElement(addressTabTitle);
		sortAddressIDColumn("Descedning");
		
		while(firstRowAddressRecord.getText().trim().equalsIgnoreCase(newAddressID)==false)
		{
			sortAddressIDColumn("Descedning");
		}
		
		String tickMark=driver.findElement(By.xpath("//a[@title='"+previousAddressID+"']/../../..//img")).getAttribute("alt");
	//	clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//a[@title='"+ previousAddressID +"'] ")));
	//	waitForPageLoadTill(5);
	//	waitForElement(addressEditButton);
	//	clickWebElement(addressEditButton);
		
		waitForPageLoadTill(5);
//		waitForElement(addressEditButtonTitle);
		
		if(tickMark.equalsIgnoreCase("false")) {
			count++;
			System.out.println("Previous Address ID : " + previousAddressID +" Primary Address is NOT checked");
			logger.info("Previous Address ID : " + previousAddressID + " Primary Address is NOT Checked");
			
	//		clickWebElement(addressEditCancelButton);
	//		waitForPageLoadTill(5);
			
	//		closeNewAddressWindow();
			
	//		driver.navigate().refresh();
	//		waitForElement(addressTabTitle);
	//		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//a[@title='"+ newAddressID +"'] ")));
	//		waitForPageLoadTill(5);
	//		waitForElement(addressEditButton);
	//		clickWebElement(addressEditButton);
	//		waitForPageLoadTill(5);
	//		waitForElement(addressEditButtonTitle);

			 tickMark=driver.findElement(By.xpath("//a[@title='"+newAddressID+"']/../../..//img")).getAttribute("alt");

			
			if(tickMark.equalsIgnoreCase("true")) {
				count--;
				System.out.println("New Address ID : " + newAddressID + " Primary Address is Checked");
				logger.info("New Address ID : " + newAddressID + " Primary Address is Checked");
			}
			else
			{
				count++;
				System.out.println("Address ID : " + newAddressID+"Primary Address is NOT checked");
				logger.info("Address ID : " + newAddressID + " Primary Address is NOT Checked");
			}
			
		//	clickWebElement(addressEditCancelButton);
			waitForPageLoadTill(5);
			Assert.assertTrue((count==0), "Error : More than one Primary addresses are checked");
			
		}
		else
		{
			
			System.out.println("Error : Address ID : " + previousAddressID + " Primary Address is Checked");
			logger.info("Error : Address ID : " + previousAddressID + " Primary Address is Checked");
			throw new Exception("Error : Address ID : " + previousAddressID + " Primary Address is Checked");
		}
			
			
		}
	
	
	/**
	 * Sort table by Address ID
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void sortAddressIDColumn( String order) throws AcisException {
		
		switch (order) {
		case "Ascending":
			while (isElementPresent(addressIdAscendingOrderBy)==false) {
				clickWebElemntUsingJavascriptExecutor(AddressIDTitleTable);
				waitForPageLoadTill(3);	
			}
			Assert.assertTrue(sortedByAddressID.isDisplayed(), "Error: Not able to sort by Address ID");
			logger.info("Address ID column sorted by Ascending order");
			
			break;
			
		case "Descedning":
			
			while (isElementPresent(addresIdDescendingOrderBy)==false) {
				clickWebElemntUsingJavascriptExecutor(AddressIDTitleTable);
				waitForPageLoadTill(3);
			}
			Assert.assertTrue(sortedByAddressID.isDisplayed(), "Error: Not able to sort by Address ID");
			logger.info("Address ID column sorted by Descedning order");
			break;

		default:
			logger.info("No matching order text");
			break;
		}	
	}
	
	
	/**
	 * Delete address
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void deleteAddress() throws AcisException {
		System.out.println("In delete");
		List<WebElement> arrowsofRecords=driver.findElements(By.xpath("//th//span//a"));
		
		int sizeofRecords;
		sizeofRecords = arrowsofRecords.size();
		
		System.out.println(sizeofRecords);
		while(sizeofRecords!=0) {
			clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//th//span//a)[1]")));
			waitForPageLoadTill(8);
			clickWebElemntUsingJavascriptExecutor(deleteAddress);
			waitForPageLoadTill(8);
			clickWebElement(deleteAlertBoxbutton);
			waitForPageLoadTill(15);
			sizeofRecords--;
			System.out.println(sizeofRecords);
		}
	}
	
	
	/**
	 * Check Address value Primary is checked by giving street1 value
	 * @author mrunal.s.tilekar
	 * @throws Exception 
	 */
	public void verifyRecordWithPrimaryCheck(String street1Value) throws Exception {
		waitForPageLoad();
		waitForPageLoadTill(5);
		String tickMark;
		logger.info("Checking Address " +  street1Value + "Is checked as Primary");
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='"+street1Value+"']"))).isDisplayed(),
							"Error: No matching Email record field present");
		 tickMark=driver.findElement(By.xpath("//*[text()='"+street1Value+"']/../../../..//img")).getAttribute("alt");

		if(tickMark.equalsIgnoreCase("true")) {
			System.out.println("Address" +  street1Value + "Is checked as Primary");
			logger.info("Address" +  street1Value + "Is checked as Primary");
		}
		else
		{
			System.out.println("Address" +  street1Value + "Is NOT checked as Primary");
			logger.info("Address " +  street1Value + "Is NOT checked as Primary");
			throw new Exception("Error :Address" +  street1Value + "Is NOT checked as Primary");
			
		}
	
		
	}
}
