package com.acis.automation.pages.servicemanagement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class PermanencyPlanPage extends PageBase {

	public PermanencyPlanPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_OmniscriptPage.class);

	@FindBy(id = "PermanencyGoalsFor")
	WebElement permanencyNametext;

	@FindBys(@FindBy(id = "OOHPrimary1"))
	private List<WebElement> getallPrimary1lists;

	@FindBys(@FindBy(id = "OOHPrimary2"))
	private List<WebElement> getallPrimary2List;
	
	@FindBy(xpath="//*[@id='OOHPrimary2']")
	WebElement  primarlyList2dropdown;

	@FindBy(xpath="//*[@id='OOHPrimary1']")
	WebElement  primarlyList1dropdown;
	
	@FindBy(id = "PermanencyNarrative")
	WebElement permanencyNarrativetextbox;
	
	@FindBy(xpath= "//div[@id='PermanencyPlan_nextBtn']/p[contains(text(),'Next')]")
	WebElement nextBtn;

	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement frameElement;

	public By errorSelection = By
			.xpath("//div[contains(text(),'Please select a different permanency goal for Primary 2')]");
	
	public By servicesToTheChildren= By.xpath("//*[@id='ServicestotheChildren']/section/div/div/div/h1");
	
	/***
	 * Verifying Primarly list1 and list2 should not contains duplicate input
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 */
	
	public void verifyDuplicancyErrorPrimarlyList() throws AcisException, AWTException, InterruptedException {
		
		switchToFrameByWebElement(frameElement);
		enterText(permanencyNametext, "Riya");
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		selectDropdownByVisibleText(primarlyList1dropdown, "Reunification");
		selectDropdownByVisibleText(primarlyList2dropdown, "Reunification");
		waitAndVerifyElement(errorSelection);
		logger.info("Verifying the error message when selecting same value in both the list");
		
		
	}
	
	
	

	/**
	 * This method is used to get all the options in the list and simultaneously
	 * fetching desired option
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void permanencyPlaneForm() throws AcisException {
		try {
			switchToFrameByWebElement(frameElement);
			enterText(permanencyNametext, "Riya");
			Thread.sleep(2000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			
			Select primarlyList1 = new Select(driver.findElement(By.id("getallPrimary1lists")));
			Select primarlyList2 = new Select(driver.findElement(By.id("getallPrimary2lists")));
			List<WebElement> elementCount = primarlyList1.getOptions();
			int iSize = elementCount.size();

			for (int i = 0; i < iSize; i++) {
				String sValuePrimarlylist1 = elementCount.get(i).getText();
				System.out.println(sValuePrimarlylist1);
				if (sValuePrimarlylist1.equalsIgnoreCase("Reunification")) {
					primarlyList1.selectByVisibleText("Reunification");
					break;
				}
			}

			List<WebElement> list2 = primarlyList2.getOptions();
			int iCount = list2.size();
			for (int j = 0; j < iCount; j++) {
				String sValuePrimarlylist2 = list2.get(j).getText();
				System.out.println(sValuePrimarlylist2);
				if (sValuePrimarlylist2.equalsIgnoreCase("Adoption")) {

					primarlyList2.selectByVisibleText("Adoption");
				}

			}
			
			enterText(permanencyNarrativetextbox, "Riya Permanency");
			logger.info("Filling up the Permanency form page");
			waitForElement(nextBtn);
			nextBtn.click();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Verifying User lands on Service_to_the_children_page
	 * @throws AcisException 
	 */
	
	
	public void verifyingUserlandsOnServiceToTheChildrenPage() throws AcisException {
		
		try {
			waitForElement(frameElement);
			switchToFrameByWebElement(frameElement);
			waitAndVerifyElement(servicesToTheChildren);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
