package com.acis.automation.pages.providermanagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.sikuli.guide.SxRectangle;
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

	@FindBy(xpath = "((//span[text()='Account Name'])//..//..//input)[last()]")
	WebElement textAccountName;

	@FindBy(xpath = "(//button[text()='Save'])[last()]")
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

	@FindBy(xpath = "(//label[text()='Number of Children in the Home'])//..//input")
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
		waitForPageLoad();

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
		waitForPageLoad();
	}

	/**
	 * fill New Account Placement Resources By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void fillNewAccountInformationpage(String accountname) throws AcisException {
		logger.info("fill Account Name");
		//driver.navigate().refresh();
		waitForPageLoad();
		clickWebElement(textAccountName);
		waitForPageLoadTill(10);
		enterTextUsingJavascript(textAccountName, accountname);
	}

	/*
	 * click on save button by khushboo
	 * 
	 */
	public void saveButton() throws AcisException {
		logger.info("click on save button");
		waitForPageLoadTill(10);
		clickWebElement(btnSave);
		logger.info("clicked on save button");

	}

	/*
	 * click on edit button by khushboo
	 * 
	 */
	public void clickOnEditButton() throws AcisException {
		logger.info("clicking on Edit button");
	//	waitForPageLoad();
		waitForElement(btnEdit);
		clickWebElemntUsingJavascriptExecutor(btnEdit);
		waitForPageLoad();
	}

	/*
	 * validate parent one and parent 2
	 * 
	 * 
	 */
	public void textareaParent() throws AcisException, InterruptedException {
		waitForElement(textparent1);
		wait(10000);
		waitForElement(firstParentname);
		wait(10000);
		waitForElement(textparent2);
		wait(10000);
		waitForElement(secondParentname);

	}

	/*
	 * number of children by khushboo
	 */
	public void numberOfChildren(String number) throws AcisException {
		logger.info("Number of children");
		waitForPageLoadTill(10);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
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
