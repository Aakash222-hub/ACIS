package com.acis.automation.testcases.learner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

/**
 * This class contains test scripts related to My Courses tab of Learner
 * 
 * @author shahenshaha.mulani
 *
 */

public class LCCalenderTest extends TestBase {

	public LCCalenderTest() throws AcisException {
		super();
	}

	final static Logger logger = LoggerFactory.getLogger(LCCalenderTest.class);

	/**
	 * This method will Verify Add Edit personal Event
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 30 October 2019
	 */

	@Test(description = "TC-364:Add/Edit Personal Event", groups = { "High", "iLMS_Regression", "Suraiya" })

	public void verifyAddEditPersonalEventAtLearnerCenter() throws AcisException {
		String eventDescription = "Automation Event_" + userLogin.generateRandomString();

		try {

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User1_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

			lcCalendar.clickOnCalenderTab().verifyAddPersonalEventButton().clickOnAddPersonalEventButton()
					.verifyAddEventDialogUI().clickSaveEvent().verifyMandatoryDescription()
					.enterDescriptionForEvent(eventDescription).enterFromDateForEvent(0).enterToDateForEvent(1).clickSaveEvent()
					.verifyDateValidation().enterToDateForEvent(0).clickSaveEvent()
					.verifyEventAddedOnCalendar(eventDescription).verifyEditIcon(eventDescription)
					.ClickEditPersonalEvent().verifyAddEventDialogUI()
					.enterDescriptionForEvent(eventDescription + "_Edited").clickSaveEvent()
					.verifyEventAddedOnCalendar(eventDescription + "_Edited");
		} catch (Exception e) {
			getStackTrace(e, "Failed to Verify Add Edit personal Event ");
		}

		finally {

			lcCalendar.deleteCreatedEvent(eventDescription + "_Edited");
			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}
	}
}
