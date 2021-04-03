package com.acis.automation.pages;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ILMSAPI extends PageBase {

	public ILMSAPI() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	/*final static Logger logger = LoggerFactory.getLogger(ILMSAPI.class);

	public String accessTokenForUser;
	public String createUserUrl;
	public String createTMOrgUrl;

	@FindBy(id = "lblEcomModKeyValue")
	WebElement textkey;

	public void createUserForSetUP(int numberOfUsers, String strOrgID) {

		Response token = createAccessToken();
		accessTokenForUser = token.jsonPath().get("Token.access_token");
		logger.info("Token code value for User :- " + accessTokenForUser);

		// Create Org

		for (int i = 0; i < numberOfUsers; i++) {
			String postBody = createPostReqBodyForCreateUser(i + 1);

			Response response = createUser(postBody, accessTokenForUser, strOrgID);

			String userID = response.getBody().asString();

			logger.info("User : " + (i + 1) + "  is created with User ID as " + userID);

			testData.get(Constants.USERS_SHEET).put("User" + (i + 1) + "_ID", userID);

			testData.get(Constants.USERS_SHEET).put("User" + (i + 1) + "_Email",
					organizations.getOrganizationName() + "_User" + (i + 1) + "@iel.com");

			testData.get(Constants.USERS_SHEET).put("User" + (i + 1) + "_EmployeeID",
					organizations.getOrganizationName() + "_UserEmployeeID" + (i + 1));
		}

	}

	@SuppressWarnings("unchecked")
	private String createPostReqBodyForCreateUser(int indexOfUser) {

		JSONObject requestParams = new JSONObject();

		JSONArray userProfileDataArray = new JSONArray();
		JSONObject userEmail = new JSONObject();
		JSONObject userFirstName = new JSONObject();

		JSONObject userEmployeeID = new JSONObject();

		JSONObject userLastName = new JSONObject();

		JSONObject userRegion = new JSONObject();

		JSONObject userDepartment = new JSONObject();

		JSONObject userDivision = new JSONObject();

		JSONObject userPassword = new JSONObject();

		userFirstName.put("Key", "F001");

		userFirstName.put("Value",
				testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "_FirstName" + indexOfUser);

		testData.get(Constants.USERS_SHEET).put("User" + indexOfUser + "_FirstName",
				testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "_FirstName" + indexOfUser);

		userEmployeeID.put("Key", "F004");

		userEmployeeID.put("Value",
				testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "_UserEmployeeID" + indexOfUser);

		userLastName.put("Key", "F003");
		userLastName.put("Value", testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "_LastName" + indexOfUser);

		testData.get(Constants.USERS_SHEET).put("User" + indexOfUser + "_LastName",
				testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "_LastName" + indexOfUser);

		userEmail.put("Key", "F015");
		userEmail.put("Value",
				testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "_User" + indexOfUser + "@iel.com");

		userRegion.put("Key", "F019");
		userRegion.put("Value", testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "Region" + indexOfUser);

		testData.get(Constants.USERS_SHEET).put("User" + indexOfUser + "_Region",
				testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "Region" + indexOfUser);

		userDivision.put("Key", "F020");
		userDivision.put("Value", testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "Division" + indexOfUser);

		testData.get(Constants.USERS_SHEET).put("User" + indexOfUser + "_Division",
				testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "Division" + indexOfUser);

		userDepartment.put("Key", "F021");
		userDepartment.put("Value",
				testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "Department" + indexOfUser);

		testData.get(Constants.USERS_SHEET).put("User" + indexOfUser + "_Department",
				testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + "Department" + indexOfUser);

		userPassword.put("Key", "F016");
		userPassword.put("Value", "Password@123");

		userProfileDataArray.add(userFirstName);
		userProfileDataArray.add(userLastName);

		userProfileDataArray.add(userEmail);

		userProfileDataArray.add(userRegion);

		userProfileDataArray.add(userDivision);

		userProfileDataArray.add(userDepartment);

		userProfileDataArray.add(userPassword);

		userProfileDataArray.add(userEmployeeID);

		requestParams.put("userProfileData", userProfileDataArray);
		requestParams.put("sendRegistrationMail", "false");

		requestParams.put("changePasswordAtNextLogin", "false");

		return requestParams.toJSONString();

	}

	public Response createUser(String body, String token, String orgID) {

		return given().contentType(ContentType.JSON).header("AccessToken", token).header("Accept", "application/json")
				.body(body).when().log().all(true).post(String.format(Constants.CRETEUSER_URL, orgID));

	}

	public String createBase64AuthorizationKey(String strUserEmail, String strUserPassword) {

		String authorizationKey = null;
		String user = null;
		user = strUserEmail + ":" + strUserPassword;

		byte[] encoded = Base64.encodeBase64(user.getBytes());
		authorizationKey = "Basic " + new String(encoded);
		logger.info("Authorization Key " + authorizationKey);
		return authorizationKey;
	}

	public void inActivateUser() {

		String accessTokenUrl = configProperties.accesstoken_uri();
		String accessTokenValue;
		Response token = given().header("Accept", "application/json")
				.header("ClientSecretKey", configProperties.clientSecretKey_accessToken())
				.header("ClientID", configProperties.clientID_accessToken()).when().log().all(true).get(accessTokenUrl);

		accessTokenValue = token.jsonPath().get("Token.access_token");
		String userID = testData.get(Constants.USERS_SHEET).get("User5_ID");

		given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessTokenValue).delete(String.format(Constants.INACTIVATE_USER_URL,
						testData.get(Constants.ORGNIZATION_SHEET).get("orgID"), userID))
				.then().extract().response();

		logger.info("User5 is inactivated");

	}

	public void deleteUser(String strUserID) {

		String accessTokenUrl = configProperties.accesstoken_uri();
		String accessTokenValue;
		Response token = given().header("Accept", "application/json")
				.header("ClientSecretKey", configProperties.clientSecretKey_accessToken())
				.header("ClientID", configProperties.clientID_accessToken()).when().log().all(true).get(accessTokenUrl);

		accessTokenValue = token.jsonPath().get("Token.access_token");

		given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessTokenValue).delete(String.format(Constants.DELETE_USER_URL,
						testData.get(Constants.ORGNIZATION_SHEET).get("orgID"), strUserID))
				.then().extract().response();

		logger.info("User6 is Deleted");

	}

	public void createDuplicateUserForSetUP(String strOrgID) {

		Response token = createAccessToken();
		accessTokenForUser = token.jsonPath().get("Token.access_token");
		logger.info("Token code value for User :- " + accessTokenForUser);

		// Create Org

		String postBody = createPostReqBodyForDuplicateCreateUser("MobileAPPDuplicateUser",

				testData.get(Constants.USERS_SHEET).get("DuplicateUser_Email"));

		Response response = createUser(postBody, accessTokenForUser, strOrgID);

		String userID = response.getBody().asString();
		testData.get(Constants.USERS_SHEET).put("MobileAPPDuplicateUser_ID", userID);

	}

	@SuppressWarnings("unchecked")
	private String createPostReqBodyForDuplicateCreateUser(String userName, String UserEmail) {

		JSONObject requestParams = new JSONObject();

		JSONArray userProfileDataArray = new JSONArray();
		JSONObject userEmail = new JSONObject();
		JSONObject userFirstName = new JSONObject();

		JSONObject userLastName = new JSONObject();

		JSONObject userRegion = new JSONObject();

		JSONObject userDepartment = new JSONObject();

		JSONObject userDivision = new JSONObject();

		JSONObject userPassword = new JSONObject();
		JSONObject userEmployeeID = new JSONObject();

		userFirstName.put("Key", "F001");

		userFirstName.put("Value", userName);

		userEmployeeID.put("Key", "F004");

		userEmployeeID.put("Value", organizations.getOrganizationName() + "_UserEmployeeID");

		userLastName.put("Key", "F003");
		userLastName.put("Value", "Automation");

		userEmail.put("Key", "F015");
		userEmail.put("Value", UserEmail);

		userRegion.put("Key", "F019");
		userRegion.put("Value", organizations.getOrganizationName() + " Default Region");

		userDivision.put("Key", "F020");
		userDivision.put("Value", organizations.getOrganizationName() + " Default Division");

		userDepartment.put("Key", "F021");
		userDepartment.put("Value", organizations.getOrganizationName() + " Default Department");

		userPassword.put("Key", "F016");
		userPassword.put("Value", "Password@123");

		userProfileDataArray.add(userFirstName);
		userProfileDataArray.add(userLastName);

		userProfileDataArray.add(userEmail);

		userProfileDataArray.add(userEmployeeID);

		userProfileDataArray.add(userRegion);

		userProfileDataArray.add(userDivision);

		userProfileDataArray.add(userDepartment);

		userProfileDataArray.add(userPassword);

		requestParams.put("userProfileData", userProfileDataArray);
		requestParams.put("sendRegistrationMail", "false");
		requestParams.put("changePasswordAtNextLogin", "false");

		return requestParams.toJSONString();

	}

	public Response enrollUserInCourse(String strUserID, String strCourseID) {

		return given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessToken).body("{\"userid\":\"" + strUserID + "\"}")
				.config(RestAssured.config().logConfig(new LogConfig(captor, true))).log().everything(true)

				.request("post",
						String.format(Constants.ENROLL_UNENROLL_UESR_INTO_FROM_COURSE,
								testData.get(Constants.ORGNIZATION_SHEET).get("orgID"), strCourseID))
				.then().extract().response();
	}

	public void unEnrollUserFromCourse(String strUserID, String strCourseID) {
		Response response = given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessToken).body("{\"userid\":\" " + strUserID + "\"}")
				.request("delete",
						String.format(Constants.ENROLL_UNENROLL_UESR_INTO_FROM_COURSE,
								testData.get(Constants.ORGNIZATION_SHEET).get("orgID"), strCourseID))
				.then().extract().response();
		if (response.getStatusCode() == 204 || response.getStatusCode() == 200) {
			logger.info("User UnEnrolled using  unEnrollUserFromCourse API for Courses :" + response.asString());

			return;
		} else {

			logger.info("Error in unEnrollUserFromCourse API for Courses :" + response.asString());
		}
	}

	public Response putChangeTranscriptAPIForCourseResult(String strUserID, String strKeyToUpdate,
			String strValueToUpdate, String strCourseID) {
		return given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessToken)
				.body(createPUTBodyForTranscriptAPI(strKeyToUpdate, strValueToUpdate))
				.config(RestAssured.config().logConfig(new LogConfig(captor, true))).log().everything(true)

				.request("put",
						(String.format(Constants.CHANGE_TRANSCRIPT_URL_COURSES,
								testData.get(Constants.ORGNIZATION_SHEET).get("orgID"), strUserID, strCourseID)))
				.then().extract().response().prettyPeek();
	}
	
	public Response putChangeTranscriptAPIForCurriculum(String strUserID, String strKeyToUpdate,
			String strValueToUpdate, String strCurriculumID) {
		return given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessToken)
				.body(createPUTBodyForTranscriptAPI(strKeyToUpdate, strValueToUpdate))
				.config(RestAssured.config().logConfig(new LogConfig(captor, true))).log().everything(true)

				.request("put",
						(String.format(Constants.CHANGE_TRANSCRIPT_URL_CURRICULUM,
								testData.get(Constants.ORGNIZATION_SHEET).get("orgID"), strUserID, strCurriculumID)))
				.then().extract().response();
	}

	@SuppressWarnings("unchecked")
	private String createPUTBodyForTranscriptAPI(String strKey, String strValue) {

		JSONObject requestParams = new JSONObject();

		requestParams.put(strKey, strValue);

		return requestParams.toString();
	}

	public void createUserFieldsForSetUP(int numberOfUsers, String strOrgID) {
		String postBody = null;
		Response response = null;
		Response token = createAccessToken();
		accessTokenForUser = token.jsonPath().get("Token.access_token");
		logger.info("Token code value for User :- " + accessTokenForUser);

		for (int i = 0; i < numberOfUsers; i++) {
			postBody = createPostReqBodyForCreateField(i + 1, "Region");

			response = given().contentType(ContentType.JSON).header("AccessToken", accessTokenForUser)
					.header("Accept", "application/json").body(postBody).when().log().all(true)
					.post(String.format(Constants.CRETEREGION_URL, strOrgID));

			String regionID = response.getBody().asString();

			logger.info("Region : " + (i + 1) + "  is created with Region ID as " + regionID);

			postBody = createPostReqBodyForCreateField(i + 1, "Division");

			response = given().contentType(ContentType.JSON).header("AccessToken", accessTokenForUser)
					.header("Accept", "application/json").body(postBody).when().log().all(true)
					.post(String.format(Constants.CRETEDIVISION_URL, strOrgID, regionID));

			String divisionsID = response.getBody().asString();

			logger.info("Division : " + (i + 1) + "  is created with Divisions ID as " + divisionsID);

			postBody = createPostReqBodyForCreateField(i + 1, "Department");

			response = given().contentType(ContentType.JSON).header("AccessToken", accessTokenForUser)
					.header("Accept", "application/json").body(postBody).when().log().all(true)
					.post(String.format(Constants.CRETEDEPARTMENT_URL, strOrgID, regionID, divisionsID));

			String departmentsID = response.getBody().asString();

			logger.info("Department : " + (i + 1) + "  is created with Departments ID as " + departmentsID);

		}

	}

	@SuppressWarnings({ "unchecked", "unused" })
	private String createPostReqBodyForCreateField(int indexOfUser, String strField) {

		JSONObject regionName = new JSONObject();

		regionName.put("name", testData.get(Constants.ORGNIZATION_SHEET).get("orgName") + strField + indexOfUser);

		return regionName.toJSONString();
	}

	// TM Org API Methods

	*//**
	 * To call post request using Rest assured for create TM org
	 * 
	 * @author shahenshaha.mulani
	 * @throws AcisException
	 * @since 08 August 2019
	 *//*
	public Response createOrgForTM(String body) throws AcisException {
		String keyForTM = getKeyValue();
		return given().contentType(ContentType.JSON).header("Key", keyForTM).header("Accept", "application/json")
				.body(body).config(RestAssured.config().logConfig(new LogConfig(captor, true))).log().everything(true)
				.post(Constants.TM_ORG_API);
	}

	*//**
	 * This method is to create Training Manager Org From API
	 * 
	 * @author shahenshaha.mulani
	 * @throws AcisException
	 * @since 08 August 2019
	 *//*
	public Response createTrainingManagerOrgFromAPI(String orgname, String emailID, String courseID)
			throws AcisException {

		// Create Org
		String postBody = createPostReqBodyForTMOrg(orgname, emailID, courseID);

		Response response = createOrgForTM(postBody);

		return response;
	}

	*//**
	 * This method creates data/ body for Create org post API request for TM
	 * 
	 * @return
	 * @author shahenshaha.mulani
	 * @since 8 August 2019
	 *//*
	@SuppressWarnings("unchecked")
	private String createPostReqBodyForTMOrg(String orgname, String emailID, String courseID) {

		JSONObject requestParams = new JSONObject();
		JSONObject organizationParams = new JSONObject();
		JSONObject userParams = new JSONObject();
		JSONArray superAdminCourseRecordsItems = new JSONArray();
		JSONObject superAdminCourseRecordsParams = new JSONObject();

		requestParams.put("OrderID", "ORD1");

		organizationParams.put("Name", orgname);
		requestParams.put("Organization", organizationParams);

		userParams.put("F001", "TMFirstName");
		userParams.put("F003", "TMLastName");
		userParams.put("F015", emailID);
		userParams.put("F023", "(GMT-05.00) Eastern Time (US & Canada)");
		userParams.put("F006", "english");
		requestParams.put("User", userParams);

		superAdminCourseRecordsParams.put("NumberOfSeats", "4");
		superAdminCourseRecordsParams.put("SuperAdminCourseID", courseID);

		superAdminCourseRecordsItems.add(superAdminCourseRecordsParams);
		requestParams.put("SuperAdminCourseRecords", superAdminCourseRecordsItems);
		return requestParams.toString();
	}

	*//**
	 * This method is used to verify status code of any API response
	 * 
	 * @param response
	 * @param data
	 * @throws IlmsAPIException
	 *//*
	public void verifyResponseStatusCode(Response response, int expectedStatusCode) throws AcisException {

		appendResponseInReport(response, "actual response");

		testLoggerInfo("Actual Response Code: " + String.valueOf(response.getStatusCode()));
		testLoggerInfo("Expected Response Code: " + expectedStatusCode);
		Assert.assertEquals(response.getStatusCode(), expectedStatusCode,
				"Actual Status Code is not matching with Expected Status Code");
		testLoggerPass("Actual Status Code : " + response.getStatusCode()
				+ "  is matching with Expected Status Code  : " + expectedStatusCode);
		logger.info("Actual Status Code : " + response.getStatusCode() + "  is matching with Expected Status Code  : "
				+ expectedStatusCode);

	}

	*//**
	 *
	 * This method is used to create key
	 * 
	 * @author shahenshaha.mulani
	 * 
	 * @throws IlmsAPIException
	 *//*
	public String getKeyValue() throws AcisException {
		String strKey = "";
		home.navigateToApp(Constants.KEY_GENERATION_URL);
		home.waitForElement(textkey);
		strKey = textkey.getText().trim().split(">>>>")[1];
		logger.info("Key value captured is :- " + strKey);
		home.navigateBack();
		return strKey;
	}

	public void addUserInGroupExplicitInclusionList(String strGroupName, String strUserID) {

		String strGroupID = null;

		strGroupID = getGroupID(strGroupName);

		Response resp = given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessToken).body("{\"userid\":\" " + strUserID + "\"}").when()
				.post(String.format(Constants.ADD_USER_IN_GROUPS_EXPLICIT_INCLUSION_LIST,
						testData.get(Constants.ORGNIZATION_SHEET).get("orgID"), strGroupID))
				.then().extract().response();

		if (String.valueOf(resp.getStatusCode()).equals("200") || String.valueOf(resp.getStatusCode()).equals("201")) {

			logger.info("User is added into group" + strGroupName);
		}

	}

	public String getGroupID(String strGroupName) {
		String groupID = null;
		Response resp = given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessToken).when()
				.get(String.format(Constants.GET_ALL_GROUPS, testData.get(Constants.ORGNIZATION_SHEET).get("orgID")))
				.then().extract().response();

		if (String.valueOf(resp.getStatusCode()).equals("200")
				|| String.valueOf(response.getStatusCode()).equals("201")) {

			logger.info(resp.asString(), "actual response");

			List<Map<String, String>> goupsList = resp.jsonPath().getList("$");

			for (int i = 0; i < goupsList.size(); i++) {

				if (goupsList.get(i).get("Name").equals(strGroupName)) {

					groupID = String.valueOf(goupsList.get(i).get("ID"));
				}
			}
		}
		return groupID;

	}

	public Response enrollUserInCurriculum(String strUserID, String strCurriID) {
		Response response = given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessToken).body("{\"userid\":\" " + strUserID + "\"}")
				.request("post",
						String.format(Constants.ENROLL_UNENROLL_UESR_INTO_FROM_CURRICULUM,
								testData.get(Constants.ORGNIZATION_SHEET).get("orgID"), strCurriID))
				.then().extract().response();

		if (response.getStatusCode() == 204 || response.getStatusCode() == 200) {

			logger.info("User Enrolled using  enrollUserInCurriculum API for Courses :" + response.asString());

			return response;
		} else {

			logger.info("Error in enrollUserInCurriculum API for Courses :" + response.asString());
		}
		return response;
	}

	public void unEnrollUserFromCurriculum(String strUserID, String strCurriID) {
		Response response = given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessToken).body("{\"userid\":\" " + strUserID + "\"}")
				.request("delete",
						String.format(Constants.ENROLL_UNENROLL_UESR_INTO_FROM_CURRICULUM,
								testData.get(Constants.ORGNIZATION_SHEET).get("orgID"), strCurriID))
				.then().extract().response();

		if (response.getStatusCode() == 204 || response.getStatusCode() == 200) {

			logger.info("User UnEnrolled using  unEnrollUserFromCurriculum API for Courses :" + response.asString());

			return;
		} else {

			logger.info("Error in unEnrollUserFromCurriculum API for Courses :" + response.asString());
		}
	}

	*//**
	 * This method is used to verify message of any API response
	 * 
	 * @param response
	 * @param data
	 * @throws IlmsAPIException
	 *//*

	public void verifyResponseMessage(Response response, String expectedMessage) {

		String actualMessage = response.getBody().asString();

		Assert.assertEquals(actualMessage, expectedMessage, "Actual and expected message is not matching");
		testLoggerPass("Actual response message :  " + actualMessage
				+ "   is matching with Expected response message  :  " + expectedMessage);
		logger.info("Actual response message :  " + actualMessage + "   is matching with Expected response message  :  "
				+ expectedMessage);

	}

	*//**
	 * This method is used to verify message of any API response
	 * 
	 * @param response
	 * @param data
	 * @throws IlmsAPIException
	 *//*

	public void verifyResponseMessage(Response response) {

		String actualMessage = response.getBody().asString();

		Assert.assertFalse(actualMessage.equals(null), "Not displayed any message in Response ");
		testLoggerPass("Message  :   " + actualMessage + "    is displayed in Response");
		logger.info("Message  :   " + actualMessage + "    is displayed in Response");

	}

	public Response createUserUsingAPI(int indexOfUser, String strOrgID) {
		Response token = createAccessToken();
		accessTokenForUser = token.jsonPath().get("Token.access_token");
		logger.info("Token code value for User :- " + accessTokenForUser);

		// Create Org

		String postBody = createPostReqBodyForCreateUser(indexOfUser);

		Response response = createUser(postBody, accessTokenForUser, strOrgID);
		return response;
	}

	public void createUserFieldsFortestCase(int indexOfUser, String strOrgID) {
		String postBody = null;
		Response response = null;
		Response token = createAccessToken();
		accessTokenForUser = token.jsonPath().get("Token.access_token");
		logger.info("Token code value for User :- " + accessTokenForUser);

		postBody = createPostReqBodyForCreateField(indexOfUser, "Region");

		response = given().contentType(ContentType.JSON).header("AccessToken", accessTokenForUser)
				.header("Accept", "application/json").body(postBody)
				.post(String.format(Constants.CRETEREGION_URL, strOrgID));

		String regionID = response.getBody().asString();

		testLoggerInfo("Region :  is created with Region ID as " + regionID);
		logger.info("Region :  is created with Region ID as " + regionID);

		postBody = createPostReqBodyForCreateField(indexOfUser, "Division");

		response = given().contentType(ContentType.JSON).header("AccessToken", accessTokenForUser)
				.header("Accept", "application/json").body(postBody)
				.post(String.format(Constants.CRETEDIVISION_URL, strOrgID, regionID));

		String divisionsID = response.getBody().asString();

		testLoggerInfo("Division :  is created with Divisions ID as " + divisionsID);
		logger.info("Division :  is created with Divisions ID as " + divisionsID);

		postBody = createPostReqBodyForCreateField(indexOfUser, "Department");

		response = given().contentType(ContentType.JSON).header("AccessToken", accessTokenForUser)
				.header("Accept", "application/json").body(postBody)
				.post(String.format(Constants.CRETEDEPARTMENT_URL, strOrgID, regionID, divisionsID));

		String departmentsID = response.getBody().asString();

		testLoggerInfo("Department  is created with Departments ID as " + departmentsID);
		logger.info("Department  is created with Departments ID as " + departmentsID);

	}

	public void verifyResponseMessageWithContains(Response response, String expectedMessage) {
		String actualMessage = response.getBody().asString();

		Assert.assertTrue(actualMessage.contains(expectedMessage),
				"Failed to verify Actual message contains expected text");
		testLoggerPass(
				"Verified Actual message   : " + actualMessage + "contains expected text   : " + expectedMessage);
		logger.info("Verified Actual message   : " + actualMessage + "contains expected text   : " + expectedMessage);

	}

	*//**
	 * This method is used to create Access token for API
	 * 
	 * @throws AcisException when error in creating Access token for API
	 * 
	 * @author Suraiya.Mulani
	 *//*
	public static Response createAccessTokenForZoltar() {

		accessTokenUrl = configProperties.accesstoken_uri();

		return given().header("Accept", "application/json")
				.header("ClientSecretKey", configProperties.clientSecretKey_accessToken_Zoltar())
				.header("ClientID", configProperties.clientID_accessToken_Zoltar())
				.get(accessTokenUrl);

	}

	public Response getOrgLevelCurrentISVValue(String orgID) throws IOException {

		String accessTokenForZoltar = createAccessTokenForZoltar().jsonPath().get("Token.access_token");

		return given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessTokenForZoltar)
				.config(RestAssured.config().logConfig(new LogConfig(captor, true))).log().everything(true)
				.request("get", String.format(Constants.ISVAPI_ORGLEVEL_CURRENT,
						testData.get(Constants.ORGNIZATION_SHEET).get("orgID")))
				.then().extract().response();

	}

	public Response getOrgLevelHistoryISVValue(String orgID) throws IOException {
		String accessTokenForZoltar = createAccessTokenForZoltar().jsonPath().get("Token.access_token");

		return given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessTokenForZoltar)
				.config(RestAssured.config().logConfig(new LogConfig(captor, true))).log().everything(true)
				.request("get", String.format(Constants.ISVAPI_ORGLEVEL_HISTORY,
						testData.get(Constants.ORGNIZATION_SHEET).get("orgID")))
				.then().extract().response();
	}

	public Response getOrgLevelCurrentCyqScore(String orgID) throws IOException {
		String accessTokenForZoltar = createAccessTokenForZoltar().jsonPath().get("Token.access_token");

		return given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessTokenForZoltar)
				.config(RestAssured.config().logConfig(new LogConfig(captor, true))).log().everything(true)
				.request("get", String.format(Constants.CYQAPI_ORGLEVEL_CURRENT,
						testData.get(Constants.ORGNIZATION_SHEET).get("orgID")))
				.then().extract().response();

	}

	public Response getOrgLevelHistoryCyqScore(String orgID) throws IOException {

		String accessTokenForZoltar = createAccessTokenForZoltar().jsonPath().get("Token.access_token");

		return given().log().all(true).contentType(ContentType.JSON).header("Accept", "application/json")
				.header("AccessToken", accessTokenForZoltar)
				.config(RestAssured.config().logConfig(new LogConfig(captor, true))).log().everything(true)
				.request("get", String.format(Constants.CYQAPI_ORGLEVEL_HISTORY,
						testData.get(Constants.ORGNIZATION_SHEET).get("orgID")))
				.then().extract().response();

	}*/
}
