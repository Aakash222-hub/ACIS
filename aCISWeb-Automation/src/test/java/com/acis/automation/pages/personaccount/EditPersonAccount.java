package com.acis.automation.pages.personaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class EditPersonAccount extends PageBase{

	public EditPersonAccount() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(EditPersonAccount.class);

	/*All object on edit page account*/
	@FindBy(xpath = "//div[@title='Edit']")
	WebElement EditButton;
	
	@FindBy(xpath = "//*[text()='Edit Person Account']")
	WebElement EditPersonAccountLabel;
	
	@FindBy(xpath = "//span[text()='First Name']/../..//input")
	WebElement FirstNameTextBox;
	
	@FindBy(xpath = "//span[text()='Last Name']/../..//input")
	WebElement LastNameTextBox;
	
	@FindBy(xpath = "//span[text()='Middle Name']/../..//input")
	WebElement MiddleNameTextBox;
	
	@FindBy(xpath = "//span[text()='Date of Birth']/../..//input")
	WebElement DateOfBirthTextbox;
	
	@FindBy(xpath = "//span[text()='Date of Death']/../..//input")
	WebElement DateofDeathTextBox;
	
	@FindBy(xpath = "//span[text()='20']")
	WebElement DateBirthDate;
	
	@FindBy(xpath = "//span[text()='10']")
	WebElement DateDeathDate;
	
	@FindBy(xpath = "//span[text()='Go to next month']/../..//a")
	WebElement NextMonth;
	
//	@FindBy(xpath = "//li[contains(text(),\"Date of death can't be earlier than Date of birth\")]")
//	WebElement BirthdateError;
	
	public By BirthdateError = By.xpath("//li[contains(text(),\"Date of death can't be earlier than Date of birth\")]");
	
//	@FindBy(xpath = "//li[contains(text(),\"Date of death can't be future date\")]")
//	WebElement DeathError;
	
	public By DeathError = By.xpath("//li[contains(text(),\\\"Date of death can't be future date\\\")]");
	
	//@FindBy(xpath = "//*[contains(text(),'First Name should not include numbers or Special characters')]")
	//WebElement FirstNameError;
	
	public By FirstNameError = By.xpath("//*[contains(text(),'First Name should not include numbers or Special characters')]");
	
	//@FindBy(xpath = "//*[contains(text(),'These required fields must be completed: Last Name')]")
	//WebElement LastNameRequiredError;
	
	public By LastNameRequiredError = By.xpath("//*[contains(text(),'These required fields must be completed: Last Name')]");
	
	//@FindBy(xpath = "//*[contains(text(),'Last Name should not include numbers or Special characters')]")
	//WebElement LastNameError;
	
	public By LastNameError = By.xpath("//*[contains(text(),'Last Name should not include numbers or Special characters')]");
	
	//@FindBy(xpath = "//*[contains(text(),'Middle Name should not include numbers or Special characters')]")
	//WebElement MiddleNameError;
	
	public By MiddleNameError = By.xpath("//*[contains(text(),'Middle Name should not include numbers or Special characters')]");
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement SaveButton;
	
	@FindBy(xpath = "//span[@title='Asian']")
	WebElement Race_Asian;
	
	@FindBy(xpath = "//span[@title='Unable to Determine']")
	WebElement Race_UnableToDtermine;
	
	@FindBy(xpath = "//span[@title='White']")
	WebElement Race_White;
	
	@FindBy(xpath = "(//button[@title='Move selection to Chosen'])[2]")
	WebElement MoveToChosen;
	
	@FindBy(xpath = "(//button[@title='Move selection to Available'])[2]")
	WebElement MoveToAvailable;
	
	public By Race_MultipleSelectionError = By.xpath("//*[contains(text(),'Multiple selections are unavailable when unable to determine is selected')]");
	
	
	
	
	/**
	 * Owner : Mrunal
	 * Description: Save without entering required field last name
	 * @throws AcisException 
	 */
	public void saveWithoutLastName() throws AcisException {
		clickWebElement(SaveButton);
		waitAndVerifyElement(LastNameRequiredError);
		logger.info("Save without entering required field last name");	
	}
	
	/**
	 * Enter symbol, number in First name , Last name, Middle name and verify error
	 * @throws AcisException 
	 */
	
	public void enterSymbolNumberInAllNames() throws AcisException {
		enterText(FirstNameTextBox, "Demo@123");
		enterText(MiddleNameTextBox, "Demo2343#");
		enterText(LastNameTextBox, "Demo$23");
		
		clickWebElement(SaveButton);
		logger.info("Save with entering symbol, number in First name , Last name, Middle name");
		waitAndVerifyElement(FirstNameError);
		waitAndVerifyElement(MiddleNameError);
		waitAndVerifyElement(LastNameError);
		
		FirstNameTextBox.clear();
		MiddleNameTextBox.clear();
		LastNameTextBox.clear();
		
	}
	
	/**
	 * Enter First name , Last name, Middle name 
	 * @throws AcisException 
	 */
	
	public void enterAllNames(String firstname, String middlename, String lastname) throws AcisException {
		enterText(FirstNameTextBox, firstname);
		enterText(MiddleNameTextBox, middlename);
		enterText(LastNameTextBox, lastname);
		
		clickWebElement(SaveButton);
		logger.info("Clicked on Save by Entering First name , Last name, Middle name ");
		
	}
	
	
	/**
	 * Verify error : Date of death can't be earlier than Date of birth
	 * @throws AcisException 
	 */
	public void verifyDateofDeathEarlierError() throws AcisException {
		clickWebElement(DateOfBirthTextbox);
		clickWebElement(DateBirthDate);
		clickWebElement(DateofDeathTextBox);
		clickWebElement(DateDeathDate);
		
		clickWebElement(SaveButton);
		
		waitAndVerifyElement(BirthdateError);
		logger.info("Verify error : Date of death can't be earlier than Date of birth");
		
		enterText(DateOfBirthTextbox, " ");
		enterText(DateofDeathTextBox, " ");
		clickWebElement(SaveButton);
	}
	
	/**
	 * Verify error : Date of death can't be future date
	 * @throws AcisException 
	 */
	public void verifyFutureDeathError() throws AcisException
	{
		clickWebElement(DateofDeathTextBox);
		clickWebElement(NextMonth);
		clickWebElement(DateDeathDate);
		
		clickWebElement(SaveButton);
		
		waitAndVerifyElement(DeathError);
		logger.info("Verify error : Date of death can't be future date");
		
		enterText(DateofDeathTextBox, " ");
		clickWebElement(SaveButton);
		
	}
	
	/**
	 * Verify error : Multiple selections are unavailable when unable to determine is selected
	 * @throws AcisException 
	 */
	public void verifMultipleSelectionError() throws AcisException {
		
		clickWebElement(Race_Asian);
		clickWebElemntUsingJavascriptExecutor(MoveToChosen);
		clickWebElement(Race_UnableToDtermine);
		clickWebElemntUsingJavascriptExecutor(MoveToChosen);
		clickWebElement(Race_White);
		clickWebElemntUsingJavascriptExecutor(MoveToChosen);
		
		clickWebElement(SaveButton);
		
		waitAndVerifyElement(Race_MultipleSelectionError);
		logger.info("Verify error : Multiple selections are unavailable when unable to determine is selected");
		
		clickWebElement(Race_White);
		clickWebElemntUsingJavascriptExecutor(MoveToAvailable);
		clickWebElement(Race_Asian);
		clickWebElemntUsingJavascriptExecutor(MoveToAvailable);
		clickWebElement(SaveButton);
		
	}


}
