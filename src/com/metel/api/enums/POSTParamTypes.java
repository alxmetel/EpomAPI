package com.metel.api.enums;

public enum POSTParamTypes {
	ZONE_NAME,
	ZONE_DESCRIPTION,
	SITE_ID,
	CREATE_DEFAULT_ZONE, //defines whether to create a default Zone within the Site or not; boolean value
	NAME, //Site Name
	URL, //Site URL
	DESCRIPTION, //Short Site description
	EMAIL, //contact Email
	ALLOW_PLACEMENT_BANNERS_LINKING_CHANGE, //defines whether user can link Banners and Placements of this Site himself; boolean value
	CATEGORY_ID, //IDs of categories for this Site
	REVENUE_SHARE, //value between 0 and 100 to represent Revenue Share percentage for a given Site
	IMPRESSIONS_BY_MONTH, //estimated value for Impressions served monthly(optional). Available values: LESS_THAN_100K, _100K_1_MILLION, _1_MILLION_50_MILLION, _50_MILLION_100_MILLION, _100_PLUS_MILLION, NOT_YET_LAUNCHED, DONT_KNOW
	VISITORS_BY_MONTH, //estimated value for the number of unique Site visitors monthly (optional). Available values: LESS_THAN_100K, _100K_1_MILLION, _1_MILLION_50_MILLION, _50_MILLION_100_MILLION, _100_PLUS_MILLION, NOT_YET_LAUNCHED, DONT_KNOW
	ACTIVE, //true/false
	COUNTRY, //ISO country code
	BID_FLOOR, //bid floor value (double)
	ID, //Site ID.
	MEDIA_SCANNER_ON, // enable/disable media scanner settings; boolean.
	MEDIA_SCANNER_START_DATE, //start date for media scanner in yyyy-MM-dd format.
	MEDIA_SCANNER_END_DATE, //end date for media scanner in yyyy-MM-dd format.
	MEDIA_SCANNER_RATE, //media scanner rate.
	FORENSIQ_ON, //enable/disable forensiq; boolean.
	COUNTRIES, //array of country codes.
	AD_EVENTS, //array of ad events to set. Available values: REQUEST, IMPRESSION, CLICK, ACTION.
	DATE_FROM, //start date for forensiq in yyyy-MM-dd format.
	DATE_TO, //end date for forensiq in yyyy-MM-dd format.
	TRAFFIC_QUALITY_FILTERING, //traffic quality filtering. Available values: ACCEPT_ALL, REJECT_HIGH_RISK, REJECT_SUSPICIOUS or REJECT_CUSTOM.
	TRAFFIC_SHARE, //traffic share as a double.
	TRAFFIC_QUALITY_MAX_RISK, //traffic share as integer.
	PAYMENT_MODEL, //one of the following JSON parameters: FIXED_CPM, FIXED_CPC
	COUNTRY_CODE, //ISO Country code
	PRICE, //Banner Pricing as a double.
	ACTION_ID, //Action ID or null.
	CPM_THRESHOLD, //default CPM threshold value for Site.
	SITE_COUNTRY_CPM_THRESHOLDS, //list of ISO Country codes for CPM threshold mapping.
	RULE, //INCLUDE or EXCLUDE.
	MOBILE_CARRIERS, //array of Mobile Carrier names.
	BROWSER, //Browser name.
	BROWSER_VERSION, //version of the Browser.
	RELATION, //available values: LOWER, GREATER, LOWER_EQUAL, GREATER_EQUAL, EQUAL.
	OPERATING_SYSTEM,
	VERSION, //a version value from the list /rest-api/site/{siteId}/targeting/os/{osName}/versions.do
	DEVICE_FORMAT,
	DEVICE_VENDOR,
	SCREEN_WIDTH, //Width of the screen.
	SCREEN_HEIGHT, //Height of the screen.
	REGION_NAME, //name of the region.
	CITY_NAME, //name of the city.
	LANGUAGE_CODE,
	COOKIE_NAME, //Cookie name.
	COOKIE_VALUE, //Cookie value.
	DOMAIN, //referrer domain name.
	CHANNEL, //Channel value.
	DAY_OF_WEEK, //available values: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
	EXPRESSION,
	IP_FROM, //starting IP for the range.
	IP_TO, //ending IP for the range.
	TIME_FROM, //String in 'hh:MM' format (24–hour).
	TIME_TO, //String in 'hh:MM' format (24–hour).
	TYPE, //Piggyback type. Available values: BEACON (default), URL.
	CODE_URL, //Piggyback URL or Code as a string
	
	
}
