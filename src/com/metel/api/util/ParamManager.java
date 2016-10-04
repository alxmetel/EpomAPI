package com.metel.api.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.metel.api.enums.GETParamTypes;
import com.metel.api.enums.POSTParamTypes;
import com.metel.api.enums.URLVariableTypes;

public class ParamManager {

	public String POSTParameters = "";
	public String GETParameters = "";
	public String URLVariables = "";

	public String getPOSTParams(HashMap<POSTParamTypes, Object> mapPostParams) {

		try {
			for (Map.Entry<POSTParamTypes, Object> entry : mapPostParams.entrySet()) {
				switch (entry.getKey()) {
				case ZONE_NAME:
					POSTParameters += URLEncoder.encode("name", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;

				case ZONE_DESCRIPTION:
					POSTParameters += URLEncoder.encode("description", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case SITE_ID:
					POSTParameters += URLEncoder.encode("siteId", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;

				case CREATE_DEFAULT_ZONE:
					POSTParameters += URLEncoder.encode("createDefaultZone", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case NAME:
					POSTParameters += URLEncoder.encode("name", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case URL:
					POSTParameters += URLEncoder.encode("url", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case DESCRIPTION:
					POSTParameters += URLEncoder.encode("description", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case EMAIL:
					POSTParameters += URLEncoder.encode("email", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case ALLOW_PLACEMENT_BANNERS_LINKING_CHANGE:
					POSTParameters += URLEncoder.encode("allowPlacementBannersLinkingChange", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case CATEGORY_ID:
					POSTParameters += URLEncoder.encode("categoryId", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case REVENUE_SHARE:
					POSTParameters += URLEncoder.encode("revenueShare", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case IMPRESSIONS_BY_MONTH:
					POSTParameters += URLEncoder.encode("impressionsByMonth", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case VISITORS_BY_MONTH:
					POSTParameters += URLEncoder.encode("visitorsByMonth", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case ACTIVE:
					POSTParameters += URLEncoder.encode("active", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case COUNTRY:
					POSTParameters += URLEncoder.encode("country", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case ID:
					POSTParameters += URLEncoder.encode("id", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case MEDIA_SCANNER_ON:
					POSTParameters += URLEncoder.encode("mediaScannerOn", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case MEDIA_SCANNER_START_DATE:
					POSTParameters += URLEncoder.encode("mediaScannerStartDate", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case MEDIA_SCANNER_END_DATE:
					POSTParameters += URLEncoder.encode("mediaScannerEndDate", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case MEDIA_SCANNER_RATE:
					POSTParameters += URLEncoder.encode("mediaScannerRate", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case FORENSIQ_ON:
					POSTParameters += URLEncoder.encode("forensiqOn", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case COUNTRIES:
					POSTParameters += URLEncoder.encode("countries", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case AD_EVENTS:
					POSTParameters += URLEncoder.encode("adEvents", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case DATE_FROM:
					POSTParameters += URLEncoder.encode("dateFrom", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case DATE_TO:
					POSTParameters += URLEncoder.encode("dateTo", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case TRAFFIC_QUALITY_FILTERING:
					POSTParameters += URLEncoder.encode("trafficQualityFiltering", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case TRAFFIC_SHARE:
					POSTParameters += URLEncoder.encode("trafficShare", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
							
				case TRAFFIC_QUALITY_MAX_RISK:
					POSTParameters += URLEncoder.encode("trafficQualityMaxRisk", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case PAYMENT_MODEL:
					POSTParameters += URLEncoder.encode("paymentModel", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case COUNTRY_CODE:
					POSTParameters += URLEncoder.encode("countryCode", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case PRICE:
					POSTParameters += URLEncoder.encode("price", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case ACTION_ID:
					POSTParameters += URLEncoder.encode("actionId", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case CPM_THRESHOLD:
					POSTParameters += URLEncoder.encode("cpmThreshold", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case SITE_COUNTRY_CPM_THRESHOLDS:
					POSTParameters += URLEncoder.encode("siteCountryCPMThresholds", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case RULE:
					POSTParameters += URLEncoder.encode("rule", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case MOBILE_CARRIERS:
					POSTParameters += URLEncoder.encode("mobileCarriers", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case BROWSER:
					POSTParameters += URLEncoder.encode("browser", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case BROWSER_VERSION:
					POSTParameters += URLEncoder.encode("browserVersion", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case RELATION:
					POSTParameters += URLEncoder.encode("relation", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case OPERATING_SYSTEM:
					POSTParameters += URLEncoder.encode("operatingSystem", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case VERSION:
					POSTParameters += URLEncoder.encode("version", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case DEVICE_FORMAT:
					POSTParameters += URLEncoder.encode("deviceFormat", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case DEVICE_VENDOR:
					POSTParameters += URLEncoder.encode("deviceVendor", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case SCREEN_WIDTH:
					POSTParameters += URLEncoder.encode("screenWidth", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;	
					
				case SCREEN_HEIGHT:
					POSTParameters += URLEncoder.encode("screenHeight", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;	
					
				case REGION_NAME:
					POSTParameters += URLEncoder.encode("regionName", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case CITY_NAME:
					POSTParameters += URLEncoder.encode("cityName", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case LANGUAGE_CODE:
					POSTParameters += URLEncoder.encode("languageCode", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case COOKIE_NAME:
					POSTParameters += URLEncoder.encode("cookieName", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case COOKIE_VALUE:
					POSTParameters += URLEncoder.encode("cookieValue", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case DOMAIN:
					POSTParameters += URLEncoder.encode("domain", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case CHANNEL:
					POSTParameters += URLEncoder.encode("channel", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case DAY_OF_WEEK:
					POSTParameters += URLEncoder.encode("dayOfWeek", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case EXPRESSION:
					POSTParameters += URLEncoder.encode("expression", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case IP_FROM:
					POSTParameters += URLEncoder.encode("ipFrom", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case IP_TO:
					POSTParameters += URLEncoder.encode("ipTo", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case TIME_FROM:
					POSTParameters += URLEncoder.encode("timeFrom", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case TIME_TO:
					POSTParameters += URLEncoder.encode("timeTo", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case TYPE:
					POSTParameters += URLEncoder.encode("type", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				case CODE_URL:
					POSTParameters += URLEncoder.encode("codeUrl", "UTF-8") + "="
							+ URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
					break;
					
				}
				
				POSTParameters += "&";
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return POSTParameters;
	}

	public String getGETParams(HashMap<GETParamTypes, Object> mapGetParams) {
		String separator = "?";

		for (Map.Entry<GETParamTypes, Object> entry : mapGetParams.entrySet()) {
			GETParameters += separator;
			switch (entry.getKey()) {
			case RULE_IDS:
				GETParameters += "ruleIds" + "=" + String.valueOf(entry.getValue());
				break;

			case INCLUDE:
				GETParameters += "include" + "=" + String.valueOf(entry.getValue());
				break;

			case OPERATOR:
				GETParameters += "operator" + "=" + String.valueOf(entry.getValue());
				break;
				
			case RULE_GROUP_ID:
				GETParameters += "ruleGroupId" + "=" + String.valueOf(entry.getValue());
				break;
				
			case ZONE_ID:
				GETParameters += "zoneId" + "=" + String.valueOf(entry.getValue());
				break;
				
			case PUBLISHING_CATEGORIES:
				GETParameters += "publishingCategories" + "=" + String.valueOf(entry.getValue());
				break;
				
			case ID:
				GETParameters += "id" + "=" + String.valueOf(entry.getValue());
				break;
				
			case SITE_ID:
				GETParameters += "siteId" + "=" + String.valueOf(entry.getValue());
				break;
				
			case TARGET_ID:
				GETParameters += "targetId" + "=" + String.valueOf(entry.getValue());
				break;
				
			case OS_NAME:
				GETParameters += "osName" + "=" + String.valueOf(entry.getValue());
				break;
				
			case COUNTRY_CODE:
				GETParameters += "countryCode" + "=" + String.valueOf(entry.getValue());
				break;
				
			case REGION_NAME:
				GETParameters += "regionName" + "=" + String.valueOf(entry.getValue());
				break;
				
			}
			GETParameters += "&";
			separator = "";
		}
		return GETParameters;
	}

	public String getUrlVariables(HashMap<URLVariableTypes, Object> mapUrlVars) {
		for (Map.Entry<URLVariableTypes, Object> entry : mapUrlVars.entrySet()) {
			switch (entry.getKey()) {
			case ZONE_ID:
				URLVariables = String.valueOf(entry.getValue());
				break;
				
			case SITE_ID:
				URLVariables = String.valueOf(entry.getValue());
				break;
				
			case COUNTRY_CODE:
				URLVariables = String.valueOf(entry.getValue());
				break;
				
			case TARGET_ID:
				URLVariables = String.valueOf(entry.getValue());
				break;
				
			case OS_NAME:
				URLVariables = String.valueOf(entry.getValue());
				break;
			}
		}
		return URLVariables;

	}
}
