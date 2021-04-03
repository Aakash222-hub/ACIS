package com.acis.automation.utilities;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

/**
 * This interface & abstract methods is to get & load Properties.
 * 
 */

@Sources({ "file:src\\test\\resources\\Properties\\${env}.properties" })

public interface AcisConfigProperties extends Config {


	String msaUrl();

	String adminDefaulturl();

	String adminCustomturl();

	String utilityToupdateLP();

	String PPlabel();

	String base_url();

	String base_path();

	String accesstoken_uri();

	String clientSecretKey_accessToken();

	String clientID_accessToken();
	
	String samlUrl();
	
	String potter_host_url();
	
	String LoginAfterResetURL();
	
	String accesstoken_potter_uri();

	String farmInstanceCode();

	
	String clientSecretKey_accessToken_Zoltar();

	String clientID_accessToken_Zoltar();
	
	String acisurl();

	
	String fosterinquiryurl();
	
	String emailurl();
	
	String fosterParenturl();
	
	String providerPortalurl();
}
