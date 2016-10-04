package com.metel.api.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.metel.api.enums.GETParamTypes;
import com.metel.api.enums.POSTParamTypes;
import com.metel.api.enums.POSTParamValues;
import com.metel.api.enums.URLVariableTypes;
import com.metel.api.methods.Publisher;
import com.metel.api.methods.Publisher2;
import com.metel.api.methods.Zone;

public class Test2 {

	private static String network = "https://n29.epom.com";
	private static String username = "meteltest123";
	private static String password = "meteltest123";

	public static void main(String[] args) throws UnsupportedEncodingException, JSONException {

		Publisher2 publisher = new Publisher2(network, username, password);

		// publisher.updateSecuritySettingsForSite(new HashMap<POSTParamTypes,
		// Object>(ImmutableMap.<POSTParamTypes, Object>builder()
		// .put(POSTParamTypes.ID, "11")
		// .put(POSTParamTypes.MEDIA_SCANNER_ON, "true")
		// .put(POSTParamTypes.MEDIA_SCANNER_START_DATE, "2016-10-01")
		// .put(POSTParamTypes.MEDIA_SCANNER_END_DATE, "2016-10-02")
		// .put(POSTParamTypes.MEDIA_SCANNER_RATE, "24")
		// .put(POSTParamTypes.FORENSIQ_ON, "true")
		// .put(POSTParamTypes.COUNTRIES, "UA,US")
		// .put(POSTParamTypes.AD_EVENTS, POSTParamValues.REQUEST.toString() +
		// "," + POSTParamValues.IMPRESSION.toString())
		// .put(POSTParamTypes.DATE_FROM, "2016-10-01")
		// .put(POSTParamTypes.DATE_TO, "2016-10-02")
		// .put(POSTParamTypes.TRAFFIC_QUALITY_FILTERING,
		// POSTParamValues.REJECT_HIGH_RISK)
		// .put(POSTParamTypes.TRAFFIC_SHARE, "5.0")
		// .put(POSTParamTypes.TRAFFIC_QUALITY_MAX_RISK, "50")
		// .build()
		// ));

		// publisher.setSitePricing(new HashMap<URLVariableTypes,
		// Object>(ImmutableMap.of(
		// URLVariableTypes.SITE_ID, "11")),
		// new HashMap<POSTParamTypes, Object>(ImmutableMap.of(
		// POSTParamTypes.PAYMENT_MODEL, new JSONObject()
		// .put("paymentModel", "FIXED_PRICE")
		// .put("pricingType", "CPM")
		// .put("price", 1.0)
		// .put("countryPricing", new JSONObject()
		// .put("US", 2.0)
		// .put("UK", 2.0)
		// .put("UA", 2.0)))));

		// Method expects request body to be JSON encoded string describing
		// desired CPM thresholds model as follows:
		// {"cpmThreshold":1.0,"siteCountryCPMThresholds":[{"UK":1.5},{"US":2.0}]}

		// System.out.println(URLEncoder.encode((new JSONObject()
		// .put("cpmThreshold", 1.5)
		// .put("siteCountryCPMThresholds", new JSONArray()
		// .put(new JSONObject().put("UK",1.5))
		// .put(new JSONObject().put("US",2.5)))).toString(), "UTF-8"));

		publisher.setSiteCPMThresholds(
						new HashMap<URLVariableTypes, Object>(
								ImmutableMap.of(URLVariableTypes.SITE_ID, "11")),
						URLEncoder.encode((new JSONObject().put("cpmThreshold", 1.5).put("siteCountryCPMThresholds",
								new JSONArray().put(new JSONObject().put("UK", 1.5))
										.put(new JSONObject().put("US", 2.5)))).toString(),
								"UTF-8"));

		// publisher.deleteSiteCPMThreshold(new HashMap<URLVariableTypes,
		// Object>(ImmutableMap.of(
		// URLVariableTypes.SITE_ID, "11")));

		// publisher.getPiggyback(new HashMap<GETParamTypes,
		// Object>(ImmutableMap.of(
		// GETParamTypes.SITE_ID, "11")));

	}

}
