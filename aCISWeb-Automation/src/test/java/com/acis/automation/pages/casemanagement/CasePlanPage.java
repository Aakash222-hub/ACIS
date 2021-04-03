package com.acis.automation.pages.casemanagement;

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

public class CasePlanPage extends PageBase {

	public CasePlanPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(CasePlanPage.class);

	@FindBy(xpath = "//*[text()='New Case Plan']")
	WebElement newCasePlanButton;
	
	@FindBy(xpath = "//*[text()='Active Case Plan']")
	WebElement activeCasePlan;
	
	@FindBy(xpath = "//*[contains(text(),'Services To the Child(ren)')]")
	WebElement serviceToChildren;
	
	@FindBy(xpath = "//*[text()='Child Name']")
	WebElement childNameLabel;
	
	@FindBy(xpath = "//*[text()='Placement']")
	WebElement placement;
	
	@FindBy(xpath = "//*[contains(text(),'Planning to move child in next 6 months')]")
	WebElement planningToMovechildInNext6Months;
	
	@FindBy(xpath = "//*[text()='Transition Plan']")
	WebElement transitionPlan;
	
	@FindBy(xpath = "//*[text()='Health']")
	WebElement health;
	
	@FindBy(xpath = "//*[text()='Education']")
	WebElement education;
	
	@FindBy(xpath = "//*[text()='Mental Health']")
	WebElement mentalHealth;
	
	@FindBy(xpath = "//*[text()='Other']")
	WebElement other;
	
	@FindBy(xpath = "//*[text()='Ready By 21']")
	WebElement readyBy21;
	
	@FindBy(xpath = "//button[@title='Close Case Plans']")
	WebElement closeCasePlansTab;
	
	@FindBy(xpath = "//h1[contains(.,'Permanency Plan')]")
	WebElement permanencyPlanTitle;
	
	@FindBy(xpath = "//button[@title='Close Case Plan']")
	WebElement closeCasePlanTab;
	
	
	/**
	 * Click New Case Plan button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickNewCasePlan() throws AcisException {
		logger.info("Clicking New Case Plan button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(newCasePlanButton);
		waitForElement(permanencyPlanTitle);
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(permanencyPlanTitle);
		logger.info("Clicked on New Person Button");
		
	}
	
	/**
	 * Click on Active Case Plan
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickActiveCasePlan() throws AcisException {
		logger.info("Clicking on Active Case Plan");
		waitForPageLoadTill(5);
		clickWebElement(activeCasePlan);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Active Case Plan");
	}
	
	/**
	 * Check fields under Service To Children
	 * @author mrunal.s.tilekar
	 */
	public void checkFieldsServiceToChildren(String childFullName , String childName) {
		logger.info("Checking fields under Service To Children");
		waitForPageLoadTill(5);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(serviceToChildren);
		Assert.assertTrue(serviceToChildren.isDisplayed(), "Error : Service To Children Label Not present");
		Assert.assertTrue(childNameLabel.isDisplayed(), "Error : Child Name Label Not present");
		try {
			Assert.assertTrue((driver.findElement(By.xpath("//span[text()='"+ childName +"']"))).isDisplayed(), "Error : Child Name Value Not present");
			
		}
		catch(Exception e)
		{
			Assert.assertTrue((driver.findElement(By.xpath("//span[text()='"+ childFullName +"']"))).isDisplayed(), "Error : Child Name Value Not present");
			
		}
		Assert.assertTrue(placement.isDisplayed(), "Error : Placement Label Not present");
		Assert.assertTrue(planningToMovechildInNext6Months.isDisplayed(), "Error : Planning to move child in next 6 months Label Not present");
		Assert.assertTrue(transitionPlan.isDisplayed(), "Error : Transition Plan Label Not present");
		Assert.assertTrue(health.isDisplayed(), "Error : Health Not present");
		Assert.assertTrue(education.isDisplayed(), "Error : Education Label Not present");
		Assert.assertTrue(mentalHealth.isDisplayed(), "Error : Mental Health Label Not present");
		Assert.assertTrue(other.isDisplayed(), "Error : Other Label Not present");
		Assert.assertTrue(readyBy21.isDisplayed(), "Error : Ready By 21 Label Not present");
		logger.info("Checked fields under Service To Children");
	}
	
	
	/**
	 * Close New Case plan after submitting case plan
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeNewCasePlanWindow() throws AcisException {
		logger.info("Closing New Case plan after submitting case plan");
		waitForPageLoad();
		waitForPageLoadTill(5);
		if (closeCasePlanTab.isDisplayed()) {
			clickWebElement(closeCasePlanTab);
			waitForPageLoadTill(5);
		}
		logger.info("Closed New Case plan after submitting case plan");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(newCasePlanButton);
		logger.info("succesfully Closed New Case plan after submitting case plan");
		
	}
	
	/**
	 * Close Case plan Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeCasePlanTab() throws AcisException {
		logger.info("Closing Case plan Tab");
		waitForPageLoad();
		waitForPageLoadTill(5);
		if (closeCasePlansTab.isDisplayed()) {
			clickWebElement(closeCasePlansTab);
			waitForPageLoadTill(5);
		}
		logger.info("Closed Case plan Tab");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("succesfully Closed Case plan Tab");
		
	}
	
	
	
	
}
