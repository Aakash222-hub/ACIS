package com.acis.automation.pages.providermanagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class FosterInquirySecondPage extends PageBase {

	public FosterInquirySecondPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(FosterInquirySecondPage.class);

	@FindBy(xpath = "//span[text()='Street 1']/../../..//input")
	WebElement street1Input;

	@FindBy(xpath = "//span[text()='Street 1']/../../..//input")
	WebElement street2Input;

	@FindBy(xpath = "//span[text()='City']/../../..//input")
	WebElement cityInput;

	@FindBy(xpath = "(//select[@aria-required='true'])[1]")
	WebElement stateDropdownList;
	
	@FindBy(xpath = "(//select[@aria-required='true'])[2]")
	WebElement countryDropdwonList;

	@FindBy(xpath = "//span[text()='Zip/Postal Code']/../../..//input")
	WebElement zipcodeInput;

	@FindBy(xpath = "//span[text()='If so, what is their name ?']/../../..//input")
	WebElement ifsoInput;

	@FindBy(xpath = "(//select[@aria-required='true'])[3]")
	WebElement alreadyTalkRecruiter;

	@FindBy(xpath = "//div[text()='Personal Connection/Contact']/../..//span[@class='slds-checkbox--faux']")
	WebElement checkBoxPersonalConnection;

	@FindBy(xpath = "//*[text()='RTC']")
	WebElement typeOfPlacement_rtc;

	@FindBy(xpath = "//*[text()='Hospital']")
	WebElement typeOfPlacement_hospital;

	@FindBy(xpath = "//*[text()='ILP']")
	WebElement typeOfPlacement_ilp;

	@FindBy(xpath = "//*[text()='SILA']")
	WebElement typeOfPlacement_sila;

	@FindBy(xpath = "//*[text()='Group Home']")
	WebElement typeOfPlacement_groupHome;

	@FindBy(xpath = "//*[text()='Own Home']")
	WebElement typeOfPlacement_ownHome;

	@FindBy(xpath = "//*[text()='Zip Code']/../../..//input")
	WebElement zipCodeTextbox;

	@FindBy(xpath = "//*[text()='Start Date']/../../..//input")
	WebElement startDateTextBox;

	@FindBy(xpath = "//*[text()='Next Month']")
	WebElement nextMonth;

	@FindBy(xpath = "//*[text()='Previous Month']")
	WebElement previousMonth;

	@FindBy(xpath = "//*[text()='15']")
	WebElement dateStartDate;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement addButton;

	@FindBy(xpath = "(//*[text()='Child']/../..//input)[1]")
	WebElement childTextBox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='Medically Complex']/preceding-sibling::span")
	WebElement sn_MedicallyComplexCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='Teen Parent']/preceding-sibling::span")
	WebElement sn_TeenParentCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='Disabled']/preceding-sibling::span")
	WebElement sn_DisabledCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='LGBTQ']/preceding-sibling::span")
	WebElement sn_LGBTQCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='SEN']/preceding-sibling::span")
	WebElement sn_SENCheckbox;

	@FindBy(xpath = "//input[@name='SpecialNeeds']/..//*[text()='ESL']/preceding-sibling::span")
	WebElement sn_ESLCheckbox;

	@FindBy(xpath = "//button[text()='Save for later']")
	WebElement saveForLaterButton;

	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchButton;

	@FindBy(xpath = "//h1[text()='Placement Search Results']")
	WebElement placementSearchResultTitle;
	
	@FindBy(xpath="//button[@title='Next']")
	WebElement nextButton;
	
	@FindBy(xpath="//*[text()='County']")
	WebElement countryLabel;
	
	@FindBy(xpath="(//label[text()='Register'])[1]")
	WebElement registerLink;
	
	@FindBy(xpath="(//div[@class='slds-col slds-size_2-of-3']//lightning-formatted-date-time)[1]")
	WebElement eventDate;

	@FindBy(xpath="(//div[@class='slds-col slds-size_2-of-3']//lightning-formatted-date-time)[2]")
	WebElement eventTime;
	

	//Virendra
	@FindBy(xpath="//label[text()='Register']")
	WebElement RegistertButton;
	@FindBy(xpath="//button[text()='Next' and @type='button' and @title='Next']")
	WebElement NextButtonAfetrRegister;
	@FindBy(xpath="//button[text()='Finish' and @type='button' and @title='Finish']")
	WebElement FinishButton;
	
	@FindBy(xpath="//span[text()='App Launcher']")
	WebElement AppLauncher;
	@FindBy(xpath="//input[@type ='search' and @placeholder='Search apps and items...']")
	WebElement SearchProsFosterParent;
	
	@FindBy(xpath="//p[text()='pective Foster Parents']")
	WebElement ClickOnProsFosterParent;
	//(//a[contains(text(), 'PN - 0130') and @target='_blank' and @rel='noreferrer'])[1]
	@FindBy(xpath="(//table/tbody/tr/th/span/a)[1]")
	WebElement ClickOnNewlycreatedProsFostrPrnt;
	
	@FindBy(xpath="//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Prospective Foster Parents']")
	WebElement ClickOnProspectiveFosterParents;
	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;
	/**
	 * Select dropdowns in city and country
	 * 
	 * @author akash.a.gaurav
	 * s
	 * @throws AcisException
	 * @throws InterruptedException 
	 * 
	 */

	public void provideState(String state) throws AcisException, InterruptedException {
		
		
				logger.info("Entering the value of state"); 
				 Thread.sleep(2000);
				 clickWebElemntUsingJavascriptExecutor(stateDropdownList);
			    Actions actions = new Actions(driver);
			 
			    actions.doubleClick(stateDropdownList).perform();
			 Thread.sleep(3000);
			    Select stateList = new Select(stateDropdownList); 
			    List<WebElement> elementCount =stateList.getOptions();
			    System.out.println(elementCount);
				  int iSize = elementCount.size();
				  
				  for (int i = 0; i < iSize; i++) 
				  {
					  String birthyearValue = elementCount.get(i).getText().trim(); 
		System.out.println(birthyearValue);
					  if(birthyearValue.equalsIgnoreCase(state)) 
					  {
						  stateList.selectByVisibleText(state); 
						  logger.info(" matching state Value");
						  break; 
					  } 
					  else 
					  {
						  System.out.println("No matching state Value");
						  logger.info("No matching state Value"); 
					  }
					  
				  }
				 
		    

	}
/***
 * @author akash.a.gaurav
 * Selecting state dropdown
 */
	
	
	
	
	public void providCountry(String country) throws AcisException {
		
		
		logger.info("Entering the value of country"); 
	    clickWebElement(countryDropdwonList);
	 
	    Select listCountry = new Select(countryDropdwonList); 
	    List<WebElement> elementCount =listCountry.getOptions(); 
		  int iSize = elementCount.size();
		  
		  for (int i = 0; i < iSize; i++) 
		  {
			  String countryList = elementCount.get(i).getText().trim(); 
			  System.out.println(countryList);

			  if(countryList.equalsIgnoreCase(countryList)) 
			  {
				  listCountry.selectByVisibleText(countryList); 
				  logger.info(" matching country Value");
				  break; 
			  } 
			  else 
			  {
				  System.out.println("No matching state Value");
				  logger.info("No matching country Value"); 
			  }
			  
		  }
		 
    

}
	/**
	 * Verify Select type of placement Disabled
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	
	
	public void alreadyTalk(String status) throws AcisException {
		
		
		logger.info("Entering the value of already talk"); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
	    clickWebElement(alreadyTalkRecruiter);
	 
	    Select statusAlreadytalk = new Select(alreadyTalkRecruiter); 
	    List<WebElement> elementCount =statusAlreadytalk.getOptions(); 
		  int iSize = elementCount.size();
		  
		  for (int i = 0; i < iSize; i++) 
		  {
			  String alreadyTalkStatus = elementCount.get(i).getText().trim(); 
           System.out.println(alreadyTalkStatus);
			  if(alreadyTalkStatus.equalsIgnoreCase(status)) 
			  {
				  statusAlreadytalk.selectByVisibleText(status); 
				  logger.info(" matching status Value");
				  break; 
			  } 
			  else 
			  {
				  System.out.println("No matching status Value");
				  logger.info("No matching country Value"); 
			  }
			  
		  }}
		 
    

	/**
	 * Select type of placement
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void enterText(String option, String str1) throws AcisException {
	waitForPageLoadTill(11);
		switch (option) {
		case "street1":
			logger.info("Selecting type of input as : " + option);
			clickWebElement(street1Input);
		enterTextUsingJavascript(street1Input, str1);
			logger.info("Selected type of input as :" + option);

			break;

		case "street2":
			logger.info("Selecting type of input as : " + option);
			clickWebElement(street2Input);
			enterTextUsingJavascript(street2Input, str1);
			logger.info("Selected type of input as :" + option);

			break;

		case "city":
			logger.info("Selecting type of input as : " + option);
			clickWebElement(cityInput);
		enterText(cityInput, str1);
			logger.info("Selected type of placement as :" + option);

			break;
			
		case "zip":
			logger.info("Selecting type of input as : " + option);
			waitForPageLoadTill(3);
			clickWebElement(countryLabel);
			waitForPageLoadTill(5);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			waitForPageLoadTill(5);
			scrollingToElementofAPage(zipcodeInput);
			Actions actions = new Actions(driver);
	         //actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	         waitForPageLoadTill(9);
			enterTextUsingJavascript(zipcodeInput, str1);
			logger.info("Selected type of placement as :" + option);

			break;
			
		case "ifSo":
			logger.info("Selecting type of input as : " + option);
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			waitForPageLoadTill(9);
			jse1.executeScript("window.scrollBy(0,200)");
			
			clickWebElement(ifsoInput);
		enterText(ifsoInput, str1);
			logger.info("Selected type of placement as :" + option);

			break;

		
		default:
			logger.info("No matching input ");
			break;
		}
	}
	

/***
 * Selecting checkBoxes 
 * @author akash.a.gaurav
 * @throws AcisException 
 */
	
	public void selectCheckBox() throws AcisException {
		logger.info("Selecting checkboxes");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		waitForElement(checkBoxPersonalConnection);
		clickWebElemntUsingJavascriptExecutor(checkBoxPersonalConnection);
		logger.info("Selected checkbox  ");
	}
	/***
	 * Get Event Date and Time
	 * @author priyanka
	 * @throws AcisException 
	 */
	
	public String getDateTimeOfEventText()
	{String date=eventDate.getText()+", "+eventTime.getText();
	logger.info("Selected DateTime:  "+date);
	logger.info("Selected Date:  "+date.subSequence(0, 10));
		return (eventDate.getText()+", ");
		
	}
	
	/***
	 * Selecting next button
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	
	public void selectNext() throws AcisException {
	waitForPageLoad();
	waitForElement(nextButton);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	waitForPageLoadTill(9);
	jse.executeScript("window.scrollBy(0,940)");
	waitForPageLoadTill(9);
	clickWebElement(nextButton);
	

	}
	/***
	 * Register and click on next
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 * 
	 */
	
	public void clickRegisterNext() throws AcisException {
		waitForPageLoadTill(9);
		clickWebElement(registerLink);
		logger.info("Clicked on registered link");
		waitForPageLoadTill(9);
		clickWebElement(nextButton);
		waitForPageLoadTill(9);
		logger.info("Clicked on next button");
		
	}
	public String clickRegisterNext1() throws AcisException {
		waitForPageLoadTill(9);
		clickWebElement(registerLink);
		logger.info("Clicked on registered link");
		waitForPageLoadTill(9);
		String date=eventDate.getText();//+", "+eventTime.getText();
		logger.info("Selected DateTime:  "+date);
//		logger.info("Selected Date:  "+date.subSequence(0, 10));
			
		clickWebElement(nextButton);
		waitForPageLoadTill(9);
		
		logger.info("Clicked on next button");
		return (date);
		
	}
	public void selectNextbutton() throws AcisException {
		logger.info("Clicking on next button");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		clickWebElement(nextButton);
		
		logger.info("Clicked on next button");
		}
	public void ProspectiveFosterParents() throws AcisException {
		logger.info("Clicking on DownArrow");
		waitForElementClickable(downArrow);
		clickWebElement(downArrow);
		logger.info("Clicked on DownArrow");
		waitForPageLoadTill(5);
		logger.info("Clicking on Home from DownArrow");
		waitForElementClickable(ClickOnProspectiveFosterParents);
		clickWebElemntUsingJavascriptExecutor(ClickOnProspectiveFosterParents);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on Home from DownArrow");

	}
	/***
	 * Selecting next button
	 * @author virendra.kumar
	 * @throws AcisException 
	 */

	public String clickOnFirstProsFosterParent() throws AcisException {
		
		waitForPageLoad();
		logger.info("Clicking on Newly created Prospective Foster Parents record");
		waitForElement(ClickOnNewlycreatedProsFostrPrnt);
		waitForPageLoadTill(9);
		clickWebElement(ClickOnNewlycreatedProsFostrPrnt);
		waitForPageLoadTill(9);
		String id=ClickOnNewlycreatedProsFostrPrnt.getText();
		logger.info("Clicked on on Newly created Prospective Foster Parents record");
		return id;


	}

	/***
	 * Fetching Prospective Foster Parents
	 * @author virendra.kumar
	 * @throws AcisException 
	 */

	public String getFirstProsFosterParent() throws AcisException {
		
		String ProsFosterParentID;
		logger.info("Clicking on New Foster CareCase Tab");
		waitForPageLoad();
		logger.info("Clicking on Newly created Prospective Foster Parents record");
		waitForElement(ClickOnNewlycreatedProsFostrPrnt);
		waitForPageLoadTill(9);
		ProsFosterParentID =ClickOnNewlycreatedProsFostrPrnt.getText();
		waitForPageLoadTill(9);
		System.out.println("Created Foster Care Case ID " + ProsFosterParentID);
		testLoggerInfo("Created Foster Care Case ID " + ProsFosterParentID);
		logger.info("Clicked on Related Tab");
		return ProsFosterParentID;
		
		
		
		


	}

}



	
	
