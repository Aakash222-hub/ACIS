package com.acis.automation.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.testcases.LoginTest;

public class AcisException extends Throwable {

	/**
	 * This class is used to create customized exception
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static Logger logger = LoggerFactory.getLogger(LoginTest.class);

	public AcisException(String strMessage) {
		super(strMessage);
		logger.info("In Custom exception class");
	}

}