package com.acis.automation.pages.casemanagement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PermanencyHomePage extends PageBase {

	public PermanencyHomePage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(PermanencyHomePage.class);
	
	@FindBy(xpath = "//span[@title='Status']")
	WebElement status;
	
	@FindBy(xpath = "//*[text()='20']")
	WebElement selectDate;
	
	@FindBy(xpath = "//label[text()='Date']/..//input[@name='vlocity_ps__EndDateTime__c']")
	WebElement dateOfExit;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButtonCRE;
	
	@FindBy(xpath="//h2[text()=' Is child currently placed with home that has intent to adopt?']")
	 WebElement adoptionTransaction;
	 
	@FindBy(xpath="//h2[text()=' Is child currently placed with home that has intent to adopt?']/../..//footer/button[text()='Yes']")
	WebElement adoptionyes;

	@FindBy(xpath="//h2[text()=' Is child currently placed with home that has intent to adopt?']/../..//footer/button[text()='No']")
	WebElement adoptionNo;

	@FindBy(xpath="//button[text()='OK']")
	WebElement btnOK;
	
	/**
	 * verify Labels on HomePage
	 * @author Dharmesh Krishna
	*/
	public void verifyLabelsHome() throws AcisException, InterruptedException, IOException {
		String labels[]= {"Status","Child's Name","Date of Birth","Age","Case ID","Date of Entry","Length of Stay","Permanency Goal","Transaction","Go","Insights"};
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(status);
		for (int i = 1; i < 12; i++) {
			logger.info("Verified Label" + labels[i-1]);
			Assert.assertTrue(verifyTextEquals(driver.findElement(By.xpath("((//table/thead/tr//th)["+i+"]//span)[1]/span")), labels[i-1]), "Error"+labels[i-1]+" Label not found");
//			verifyTextEquals(driver.findElement(By.xpath("((//table/thead/tr//th)["+i+"]//span)[1]/span")), labels[i-1]);
			logger.info("Verified Label" + labels[i-1]);
		}
		
	}

	/**
	 * Check reunification label for child
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickGo(String childName) throws AcisException {
		logger.info("Clicking on Go Button");
		waitForPageLoad();
		waitForElement(driver.findElement(By.xpath("//*[contains(text(),'"+childName+"')]//ancestor::td/following-sibling::td//button[@title='Go']")));
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//*[contains(text(),'"+childName+"')]//ancestor::td/following-sibling::td//button[@title='Go']")));
		logger.info("Clicked on Go Button");
	}
	
	/**
	 * Check Status label for child
	 * @author dharmesh
	 */
	public void checkStatus(String childName,String status) {
		logger.info("Checking "+status+" Status label for child");
		waitForPageLoad();
		waitForPageLoadTill(5);
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='"+childName+"']//ancestor::td/following-sibling::td//*[text()='"+status+"']"))).isDisplayed(), 
				"Error : No "+status+" Status text present for child name : " + childName);
		logger.info("Checked "+status+" Status label for child");
	}
	
	/**
	 * Check Transaction label for child
	 * @author Pallavi
	 */
	public void checkTransaction(String childName,String transaction) {
		logger.info("Checking "+transaction+" Transaction label for child");
		waitForPageLoad();
		waitForPageLoadTill(5);
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='"+childName+"']//ancestor::td/following-sibling::td//*[text()='"+transaction+"']"))).isDisplayed(), 
				"Error : No "+transaction+" Transaction text present for child name : " + childName);
		logger.info("Checked "+transaction+" Transaction label for child");
	}
	
	/**
	 * Date of Exit
	 * @author dharmesh
	 */
	public void dateOfExitCRE() throws AcisException {
		logger.info("Entering Date of Exit");
		waitForElement(dateOfExit);
		clickWebElement(dateOfExit);
		waitForPageLoadTill(10);
		clickWebElement(selectDate);
		waitForPageLoadTill(2);
		logger.info("Entered Date of Exit");
	}
	
	/**
	 * save button
	 * 
	 * @author Khushboo Kumari
	 * @throws AcisException
	 */
	public void Savebutton() throws AcisException {

		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
//		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(saveButtonCRE);
		waitForPageLoadTill(5);
		waitForElement(saveButtonCRE);
		clickWebElement(saveButtonCRE);
		waitForPageLoad();
		waitForPageLoadTill(10);

	}
	
	/**
	 * Click on Upload Files button and click on upload file button
	 * @author Khushboo
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void selectIntentToAdopt(String option) throws AcisException {
		logger.info("click on Ident to adopt");
		waitForElement(adoptionTransaction);
		switch(option) {
		case "No":
			logger.info("selecting No");
			clickWebElement(adoptionNo);
			logger.info("selected No");
			break;
		case"Yes":
			logger.info("selecting yes");
			clickWebElement(adoptionyes);
			logger.info("selected Yes");
			break;
			default:
				logger.info("not applicable");
			
			
		}
	}
	/*Click on ok button
	 * 
	 * @khushboo
	 * 
	 */
	public void clickonOK() throws AcisException {
		logger.info("clicking on OK button");
		clickWebElement(btnOK);
		logger.info("clicked on OK button");
		
	}
}
