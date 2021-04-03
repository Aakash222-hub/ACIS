package com.acis.automation.pages.providermanagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class FosterPlacementPage extends PageBase {

	public FosterPlacementPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Logger logger = LoggerFactory.getLogger(FosterPlacementPage.class);

	@FindBy(xpath = "//div[text()='New']")
	WebElement accountNewbtn;

	@FindBy(xpath = "(//span[text()='Placement Resource']//..//span)[1]")
	WebElement radiobtnPlacementResource;

	@FindBy(xpath = "(//span[text()='Provider Agency']//..//span)[1]")
	WebElement radiobtnProvideAgency;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement btnNext;

	@FindBy(xpath = "(//span[text()='Account Name'])//..//..//input")
	WebElement textAccountName;

	@FindBy(xpath = "//span[text()='Save']")
	WebElement btnSave;

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement btnEdit;

	@FindBy(xpath = "(//span[text()='Parent 1'])[2]//..//..//input")
	WebElement textparent1;

	@FindBy(xpath = "//span[contains(normalize-space(),'Carol Matt')]")
	WebElement firstParentname;

	@FindBy(xpath = "(//span[text()='Parent 2'])[2]//..//..//input")
	WebElement textparent2;

	@FindBy(xpath = "//span[contains(normalize-space(),'Tom Joseph')]")
	WebElement secondParentname;

	@FindBy(xpath = "(//span[text()='Number of Children in the Home'])[2]//..//..//input")
	WebElement noofchildren;

	@FindBy(xpath = "(//div[@data-value='2-5'])[1]")
	WebElement agedatavalue;

	@FindBy(xpath = "(//button[@title=\"Move selection to Chosen\"])[4]")
	WebElement arrowbutton;

	/**
	 * click on New button by khushboo
	 * 
	 * 
	 */
	public void clickOnNew() throws AcisException {
		logger.info("clicking on new button");
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(accountNewbtn);
		logger.info("clicked on new button");

	}

	/**
	 * click on radio button by khushboo
	 */
	public void clickOnRadioButton(String radiobutton) throws AcisException {
		logger.info("clicking on radio button  button");
		waitForPageLoad();
		switch (radiobutton) {
		case "Placement Resource":
			logger.info("clicking on Placement Resouces   button");
			clickWebElement(radiobtnPlacementResource);
			logger.info("clicking on Placement Resouces   button");
			break;
		case "Provider Agency":
			logger.info("clicking on Provider Agency   button");
			clickWebElement(radiobtnProvideAgency);
			logger.info("clicking on Provider Agency   button");
			break;
		default:
			logger.info("No any radio Button available");
			break;
		}
		logger.info("clicked on radio button button");
		clickWebElement(btnNext);
	}

	/**
	 * fill New Account Placement Resources By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void fillNewAccountInformationpage(String accountname) throws AcisException {
		logger.info("fill Account Name");
		driver.navigate().refresh();
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(textAccountName);
		enterTextUsingJavascript(textAccountName, accountname);
	}

	/*
	 * click on save button by khushboo
	 * 
	 */
	public void saveButton() throws AcisException {
		logger.info("click on save button");
		clickWebElement(btnSave);
		logger.info("clicked on save button");

	}

	/*
	 * click on edit button by khushboo
	 * 
	 */
	public void clickOnEditButton() throws AcisException {
		logger.info("click on Edit button");
		clickWebElemntUsingJavascriptExecutor(btnEdit);
		waitForPageLoad();
	}

	/*
	 * fill parent one and parent 2
	 * 
	 * 
	 */
	public void textareaParent() throws AcisException, InterruptedException {
		clickWebElement(textparent1);
		wait(10000);
		clickWebElement(firstParentname);
		wait(10000);
		clickWebElement(textparent2);
		wait(10000);
		clickWebElement(secondParentname);

	}

	/*
	 * number of children by khushboo
	 */
	public void numberOfChildren(String number) throws AcisException {
		logger.info("Number of children");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(noofchildren);
		scrollingToElementofAPage(noofchildren);
		clickWebElement(noofchildren);
		enterTextUsingJavascript(noofchildren, number);

	}

	/*
	 * select age by khushboo
	 * 
	 */
	public void selectAge() throws AcisException {
		clickWebElemntUsingJavascriptExecutor(agedatavalue);
		clickWebElemntUsingJavascriptExecutor(arrowbutton);

	}
}
