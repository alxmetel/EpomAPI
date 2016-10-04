package com.metel.api.util;

import java.util.HashMap;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;

import org.json.JSONException;
import org.json.JSONObject;

import com.metel.api.enums.GETParamTypes;
import com.metel.api.enums.POSTParamTypes;
import com.metel.api.enums.POSTParamValues;
import com.metel.api.enums.URLVariableTypes;
import com.metel.api.methods.Publisher;
import com.metel.api.methods.Zone;

public class Test {
	
	private static String network = "https://n29.epom.com";
	private static String username = "meteltest123";
	private static String password = "meteltest123";
	
    public static void main(String[] args) throws JSONException{

    	Publisher publisher = new Publisher(network, username, password);
    	Zone zone = new Zone(network, username, password);

    	//Вызов метода через ImmutableMap.of в данном случае недопустим, т.к. параметров более 5
//    	publisher.createSite(new HashMap<POSTParamTypes, Object>(ImmutableMap.<POSTParamTypes, Object>builder()
//    			.put(POSTParamTypes.NAME, "MetelTestSite") 
//    	    	.put(POSTParamTypes.URL, "http://epom.com")
//    	    	.put(POSTParamTypes.DESCRIPTION, "Site for testing")
//    	    	.put(POSTParamTypes.EMAIL, "meteltestsite@gmail.com")
//    	    	.put(POSTParamTypes.ALLOW_PLACEMENT_BANNERS_LINKING_CHANGE, "true")
//    	    	.put(POSTParamTypes.CATEGORY_ID, "1")
//    	    	.put(POSTParamTypes.REVENUE_SHARE, "50")
//    	    	.put(POSTParamTypes.IMPRESSIONS_BY_MONTH, POSTParamValues._100_PLUS_MILLION)
//    	    	.put(POSTParamTypes.VISITORS_BY_MONTH, POSTParamValues._100K_1_MILLION)
//    	    	.put(POSTParamTypes.ACTIVE, "true")
//    	    	.build()
//    	    	));
    	
//    	publisher.deleteSite(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "28")));
    	
//    	publisher.getSites(new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    			GETParamTypes.PUBLISHING_CATEGORIES, "1,2")));
        
//    	publisher.getSitesZonesPlacements(new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    	    	GETParamTypes.PUBLISHING_CATEGORIES, "1,2")));
    	    	
//    	publisher.getSiteZones(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")));
    	
//    	publisher.getPublishingCategories();
    	
//    	publisher.getSiteBidFloorInformation(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "16")));

//    	publisher.createSiteBidFloor(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    			POSTParamTypes.COUNTRY, "MD",
//    			POSTParamTypes.BID_FLOOR, 10.5)));
    	    	
//    	publisher.deleteSiteBidFloor(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.COUNTRY, "MD")));
    	
//    	publisher.getSecuritySettingsForSite(new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    	    	GETParamTypes.ID, "11")));
    	
//!!!    	publisher.updateSecuritySettingsForSite(new HashMap<POSTParamTypes, Object>(ImmutableMap.<POSTParamTypes, Object>builder()
//    			.put(POSTParamTypes.ID, "11") 
//    	    	.put(POSTParamTypes.MEDIA_SCANNER_ON, "true")
//    	    	.put(POSTParamTypes.MEDIA_SCANNER_START_DATE, "2016-10-01")
//    	    	.put(POSTParamTypes.MEDIA_SCANNER_END_DATE, "2016-10-02")
//    	    	.put(POSTParamTypes.MEDIA_SCANNER_RATE, "24")
//    	    	.put(POSTParamTypes.FORENSIQ_ON, "true")
//    	    	.put(POSTParamTypes.COUNTRIES, "UA,US")
//    	    	.put(POSTParamTypes.AD_EVENTS, POSTParamValues.REQUEST.toString() + "," + POSTParamValues.IMPRESSION.toString()) 
//    	    	.put(POSTParamTypes.DATE_FROM, "2016-10-01")
//    	    	.put(POSTParamTypes.DATE_TO, "2016-10-02")
//    	    	.put(POSTParamTypes.TRAFFIC_QUALITY_FILTERING, POSTParamValues.REJECT_HIGH_RISK)
//    	    	.put(POSTParamTypes.TRAFFIC_SHARE, "5.0")
//    	    	.put(POSTParamTypes.TRAFFIC_QUALITY_MAX_RISK, "50")
//    	    	.build()
//    	    	));

//    	publisher.disableSecuritySettingsForSite(new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    			POSTParamTypes.ID, "11")));
    	
//    	publisher.getSitePricing(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")));
    	
    	
//    	publisher.setSitePricing(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.PAYMENT_MODEL, "{\"paymentModel\":\"FIXED_PRICE\",\"pricingType\":\"CPM\",\"price\":1.0,\"countryPricing\":[{\"US\":2.0},{\"UK\":2.0},{\"UA\":2.0}]}")));

//!!!    	publisher.setSitePricing(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.PAYMENT_MODEL, new JSONObject()
//    	    	   	.put("paymentModel", "FIXED_PRICE")
//	    	    	.put("pricingType", "CPM")
//	    	    	.put("price", 1.0)
//	    	    	.put("countryPricing", new JSONObject()
//	    	    			.put("US", 2.0)
//		    	    	   	.put("UK", 2.0)
//			    	    	.put("UA", 2.0)))));
   	
//    	publisher.updateCountryPricingForSite(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11",
//    	    	URLVariableTypes.COUNTRY_CODE, "UA")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.COUNTRY_CODE, "UA",
//    	    	POSTParamTypes.PRICE, 10.5,
//    	    	POSTParamTypes.ACTION_ID, 17)));

//    	publisher.removeCountryPricingForSite(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11",
//    			URLVariableTypes.COUNTRY_CODE, "UA")));
   	    	
//    	publisher.getSiteCPMThresholdSummary(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")));
    	
//!!!    	publisher.setSiteCPMThresholds(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.CPM_THRESHOLD, "0.5",
//    	    	POSTParamTypes.SITE_COUNTRY_CPM_THRESHOLDS, "US")));
    	
//!!!    	publisher.deleteSiteCPMThreshold(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")));
    	
//    	publisher.enableSiteRules(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.disableSiteRules(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));
    	    	
//    	publisher.addNewSiteRuleGroup(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.RULE_IDS, "1,2",
//	    		GETParamTypes.INCLUDE, "true",
//	    		GETParamTypes.OPERATOR, "AND")));
    	
//    	publisher.removeNewSiteRuleGroup(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11",
//	    		GETParamTypes.RULE_GROUP_ID, "16")));
   	
//    	publisher.returnSiteRuleGroups(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));
    	    	
//    	publisher.enableTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    	    	GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.getSiteTargetings(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.getSiteTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11",
//    			URLVariableTypes.TARGET_ID, "14")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11",
//	    		GETParamTypes.TARGET_ID, "14")));
    	
//    	publisher.getSiteTargetingTypes(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.setMobileCarrierTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE,
//    	    	POSTParamTypes.MOBILE_CARRIERS, "3AT,3Mob")));
    	
//    	publisher.getMobileCarriersForMobileCarrierTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.setBrowserTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE,
//    	    	POSTParamTypes.BROWSER, "CHROME",
//    	    	POSTParamTypes.BROWSER_VERSION, "53",
//    	    	POSTParamTypes.RELATION, POSTParamValues.LOWER,
//    	    	POSTParamTypes.SITE_ID, "11")));
    	
//    	publisher.getBrowsersForBrowserTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    		GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.getFirefoxBrowserVersionsForBrowserTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    		GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.getChromeBrowserVersionsForBrowserTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    		GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.getSafariBrowserVersionsForBrowserTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    			GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.getIEBrowserVersionsForBrowserTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    			GETParamTypes.SITE_ID, "11")));
   	
//    	publisher.setOSTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.OPERATING_SYSTEM, "WINDOWS",
//    	    	POSTParamTypes.VERSION, "10.0",
//    	    	POSTParamTypes.RELATION, POSTParamValues.LOWER,
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));
    	
//    	publisher.getOperatingSystemsForOSTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.getOSVersionsForOSTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11",
//    			URLVariableTypes.OS_NAME, "WINDOWS")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11",
//	    		GETParamTypes.OS_NAME, "WINDOWS")));
    	
//    	publisher.setDeviceTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.DEVICE_FORMAT, "DESKTOP",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));
    	
//    	publisher.getDeviceFormatsForDeviceFormatTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));

//    	publisher.getDeviceVendorTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.DEVICE_VENDOR, "SAMSUNG",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));
   	    	
//    	publisher.getDeviceVendorsForDeviceVendorTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));
       	
//    	publisher.setScreenResolutionTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.RELATION, POSTParamValues.GREATER,
//    	    	POSTParamTypes.SCREEN_WIDTH, "1280",
//    	    	POSTParamTypes.SCREEN_HEIGHT, "900",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));

//    	publisher.getResolutionsForScreenResolutionTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));

//    	publisher.setLocationTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.COUNTRY_CODE, "US",
//    	    	POSTParamTypes.REGION_NAME, "Alabama",
//    	    	POSTParamTypes.CITY_NAME, "Abbeville",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));

//    	publisher.setCountryTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.COUNTRY_CODE, "US",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));
    	
//    	publisher.getRegionsForCountryTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11",
//	    		GETParamTypes.COUNTRY_CODE, "US")));

//    	publisher.getCitiesForCountryRegion(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//				URLVariableTypes.SITE_ID, "11")),
//				new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//				GETParamTypes.SITE_ID, "11",
//				GETParamTypes.COUNTRY_CODE, "US",
//				GETParamTypes.REGION_NAME, "Alabama")));
    	
//    	publisher.setLanguageTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.LANGUAGE_CODE, "ru",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));
   	
//    	publisher.getLanguagesForLanguageTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11")));
    	
//    	publisher.setCookieTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.COOKIE_NAME, "name",
//    	    	POSTParamTypes.COOKIE_VALUE, "value",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));
    	
//    	publisher.setDomainTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.DOMAIN, "metel.com",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));	
    	
//    	publisher.setChannelTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.CHANNEL, "metel.com",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));	
    	
//    	publisher.setWiFiTrafficTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));
    	
//    	publisher.setDayOfWeekTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE,
//    	    	POSTParamTypes.DAY_OF_WEEK, POSTParamValues.MONDAY)));	
    	
//    	publisher.setCustomParameterTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE,
//    	    	POSTParamTypes.EXPRESSION, "($p1==1 || $p1=='a') && ($p2>=12 && $p2<=22)")));
    	
//    	publisher.setIPTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.IP_FROM, "194.222.012.001",
//    	    	POSTParamTypes.IP_TO, "194.223.07.01",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));
    	
//    	publisher.setTimeRangeTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11",
//    	    	POSTParamTypes.TIME_FROM, "19:00",
//    	    	POSTParamTypes.TIME_TO, "20:00",
//    	    	POSTParamTypes.RULE, POSTParamValues.INCLUDE)));
    		
//    	publisher.removeTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.SITE_ID, "11",
//    			URLVariableTypes.TARGET_ID, "32")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//	    		GETParamTypes.SITE_ID, "11",
//	    		GETParamTypes.TARGET_ID, "32")));
    	
//    	publisher.disableTargeting(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    	    	URLVariableTypes.SITE_ID, "11")),
//    	    	new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    	    	POSTParamTypes.SITE_ID, "11")));
    	
//    	publisher.enablePiggyback(new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    			POSTParamTypes.ID, "11")));
    	
//    	publisher.disablePiggyback(new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    			POSTParamTypes.ID, "11")));
    	
//    	publisher.savePiggyback(new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    			POSTParamTypes.SITE_ID, "11",
//    			POSTParamTypes.TYPE, "URL",
//    			POSTParamTypes.CODE_URL, "http://n29.epom.com/at?subId=MjIzIzEzMzIjNDkyIzQ2OTF8MzM0NnxVQXwzfDF8fHx8OTFiY2JmNDAtM2VhOS0xMWU2LThhM2QtZWNmNGJiZDM5ZTVj")));
    	
//!!!    	publisher.getPiggyback(new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    	    	GETParamTypes.SITE_ID, "11")));
    	
//    	--------------------------------------
    	
    	
//    	zone.createZone(new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
//    			POSTParamTypes.ZONE_NAME, "ZoneTest7",
//    			POSTParamTypes.SITE_ID, 11,
//    			POSTParamTypes.ZONE_DESCRIPTION, "Bla-bla-bla")));

//    	zone.deleteZone(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.ZONE_ID, "16")));
    	
//    	zone.getPlacementsOfZone(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//				URLVariableTypes.ZONE_ID, "16")));
    	
//    	zone.enableZoneRules(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//				URLVariableTypes.ZONE_ID, "16")));
    	
//    	zone.disableZoneRules(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.ZONE_ID, "16")));
    	
//    	zone.addZoneRuleGroup(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.ZONE_ID, "16")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    			GETParamTypes.RULE_IDS, "1,2",
//    			GETParamTypes.INCLUDE, "true",
//    			GETParamTypes.OPERATOR, "AND")));
    	
//    	zone.deleteZoneRuleGroup(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			UrlVariableTypes.ZONE_ID, "16")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    			GETParamTypes.RULE_GROUP_ID, "7")));
    	
//    	zone.getAllZoneRuleGroups(new HashMap<URLVariableTypes, Object>(ImmutableMap.of(
//    			URLVariableTypes.ZONE_ID, "16")),
//    			new HashMap<GETParamTypes, Object>(ImmutableMap.of(
//    			GETParamTypes.ZONE_ID, "16")));
    }
}