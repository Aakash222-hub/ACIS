package com.acis.automation.utilities;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;

/**
 * This class has logic to read data from excel sheet and store it in Collection
 * map
 * 
 *
 */
public class TestDataHelper {

	final static Logger logger = LoggerFactory.getLogger(LoginTest.class);
	Map<String, Map<String, String>> mapInputSheetData = new HashMap<>();
	FileInputStream fis = null;
	XSSFWorkbook workbook = null;
	XSSFSheet sheet = null;
	XSSFRow row = null;
	private static final String ERROR_READEXCEL = "Error in reading excel  :";

	/**
	 * 
	 * @return Map containing test data excel files with Key as sheets and test data
	 *         as value in another map of attribute name and attribute value
	 * 
	 * @throws AcisException
	 *             throws when unable to read test data
	 * 
	 * @author (Original) Unknown
	 * 
	 * @throws AcisException
	 *             throws when unable to read test data
	 * 
	 * 
	 */
	public Map<String, Map<String, String>> getInputSheetIntoMap() throws AcisException {

		String strSheetName;
		Map<String, String> mapTestData;
		int totalRows;
		int k;
		String strAttributeName;
		String strAttributeValue;
		try {
			fis = new FileInputStream(Constants.TESTDATA_FILE_PATH);
			workbook = new XSSFWorkbook(fis);
			for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
				sheet = workbook.getSheetAt(i);
				strSheetName = workbook.getSheetAt(i).getSheetName();
				mapTestData = new HashMap<>();
				totalRows = sheet.getPhysicalNumberOfRows();
				for (int j = 1; j < totalRows; j++) {
					row = sheet.getRow(j);
					k = 0;
					while (k <= 0) {
						strAttributeName = row.getCell(k).getStringCellValue();
						strAttributeValue = row.getCell(k + 1).getStringCellValue();
						mapTestData.put(strAttributeName, strAttributeValue);
						k++;
					}
				}
				mapInputSheetData.put(strSheetName, mapTestData);
			}
			return mapInputSheetData;
		} catch (Exception e) {
			throw new AcisException(ERROR_READEXCEL);
		}

	}
	
	
	/**
	 * 
	 * @return Map containing created data excel files with Key as sheets and test data
	 *         as value in another map of attribute name and attribute value
	 * 
	 * @throws AcisException
	 *             throws when unable to read test data
	 * 
	 * @author mrunal.s.tilekar
	 * 
	 * @throws AcisException
	 *             throws when unable to read test data
	 * 
	 * 
	 */
	public Map<String, Map<String, String>> getInputSheetIntoMapCreatedData() throws AcisException {

		String strSheetName;
		Map<String, String> mapTestData;
		int totalRows;
		int k;
		String strAttributeName;
		String strAttributeValue;
		try {
			fis = new FileInputStream(Constants.TESTDATA_CREATEDDATAFILE_PATH);
			workbook = new XSSFWorkbook(fis);
			for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
				sheet = workbook.getSheetAt(i);
				strSheetName = workbook.getSheetAt(i).getSheetName();
				mapTestData = new HashMap<>();
				totalRows = sheet.getPhysicalNumberOfRows();
				for (int j = 1; j < totalRows; j++) {
					row = sheet.getRow(j);
					k = 0;
					while (k <= 0) {
						strAttributeName = row.getCell(k).getStringCellValue();
						strAttributeValue = row.getCell(k + 1).getStringCellValue();
						mapTestData.put(strAttributeName, strAttributeValue);
						k++;
					}
				}
				mapInputSheetData.put(strSheetName, mapTestData);
			}
			return mapInputSheetData;
		} catch (Exception e) {
			throw new AcisException(ERROR_READEXCEL);
		}

	}


	/**
	 * This method is used to generate random string and return it based given text
	 * 
	 * @param strSheetName
	 * @param strAttributeName
	 * @author (Original) Unknown
	 */

	public String generateRandomTestData(String data,int strLengths) {
		String alphabet = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		int n = alphabet.length();
		//int pagLoadWaitTime = Integer.parseInt(TestBase.appConfig.getProperty(Constants.RANDOM_STRING_COUNT));
		String result = new String();
		Random r = new Random();

		String strRandom = "";
		for (int i = 0; i < strLengths; i++) {
			strRandom = strRandom + alphabet.charAt(r.nextInt(n));
		}

		result = data + strRandom;

		return result;
	}

	/**
	 * This method is to generate random org email
	 * 
	 * @author Unknown
	 * 
	 * @throws AcisException
	 */

	public String generateRandomOrgEmail(String data, int strLengths) {
		String alphabet = new String("abcdefghijklmnopqrstuvwxyz");
		int n = alphabet.length();
	//	int pagLoadWaitTime = Integer.parseInt(TestBase.appConfig.getProperty(Constants.RANDOM_STRING_COUNT));
		
		String result = new String();
		Random r = new Random();
		String strRandom = "";
		
		for (int i = 0; i < strLengths; i++) {
			strRandom = strRandom + alphabet.charAt(r.nextInt(n));
		}
		
		result = data + strRandom.concat("@").concat(strRandom).concat(".com");
		
		return result;
	}

	/**
     * This method is used to generate random string and return it based given text
     * 
     * @param strSheetName
     * @param strAttributeName
     * @author (Original) Unknown
     */

 

    public String generateRandomNumber(String data,int strLengths) {
        String alphabet = new String("0123456789");
        int n = alphabet.length();
        //int pagLoadWaitTime = Integer.parseInt(TestBase.appConfig.getProperty(Constants.RANDOM_STRING_COUNT));
        String result = new String();
        Random r = new Random();

        String strRandom = "";
        for (int i = 0; i < strLengths; i++) {
            strRandom = strRandom + alphabet.charAt(r.nextInt(n));
        }

        result = data + strRandom;

        return result;
    }
}
