package com.metel.api.methods;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;

import com.metel.api.enums.GETParamTypes;
import com.metel.api.enums.POSTParamTypes;
import com.metel.api.enums.URLVariableTypes;
import com.metel.api.util.Base64;
import com.metel.api.util.ParamManager;

public class Publisher {

	String network;
	String username;
	String password;

	public Publisher(String network, String username, String password) {
		this.network = network;
		this.username = username;
		this.password = password;
	}
	
	ParamManager paramManager = new ParamManager();

	public void createSite(HashMap<POSTParamTypes, Object> params) {

		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/sites/update.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void deleteSite(HashMap<URLVariableTypes, Object> urlVars) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);

		String url = "/rest-api/sites/" + siteId + "/delete.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void getSites(HashMap<GETParamTypes, Object> params) {
		
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/sites.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void getSitesZonesPlacements(HashMap<GETParamTypes, Object> params) {
		
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/sites-tree.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getSiteZones(HashMap<URLVariableTypes, Object> urlVars) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);

		String url = "/rest-api/sites/" + siteId + "/zones.do";

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getPublishingCategories() {

		String url = "/rest-api/categories/publishing.do";

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getSiteBidFloorInformation(HashMap<URLVariableTypes, Object> urlVars) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);

		String url = "/rest-api/bid-floor/site/" + siteId + ".do";

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void createSiteBidFloor(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/bid-floor/site/" + siteId + "/update.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void deleteSiteBidFloor(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/bid-floor/site/" + siteId + "/delete.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}
	
	public void getSecuritySettingsForSite(HashMap<GETParamTypes, Object> params) {
		
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/security-settings/site.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void updateSecuritySettingsForSite(HashMap<POSTParamTypes, Object> params) {

		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/security-settings/site/save.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	
	public void disableSecuritySettingsForSite(HashMap<POSTParamTypes, Object> params) {

		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/security-settings/site/disable.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getSitePricing(HashMap<URLVariableTypes, Object> urlVars) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);

		String url = "/rest-api/sites/" + siteId + "/pricing.do";

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setSitePricing(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/sites/" + siteId + "/pricing.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void updateCountryPricingForSite(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String countryCode = (String) urlVars.get(URLVariableTypes.COUNTRY_CODE);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/sites/" + siteId + "/pricing/" + countryCode + ".do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void removeCountryPricingForSite(HashMap<URLVariableTypes, Object> urlVars) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String countryCode = (String) urlVars.get(URLVariableTypes.COUNTRY_CODE);

		String url = "/rest-api/sites/" + siteId + "/pricing/" + countryCode + ".do";

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("DELETE");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	
	public void getSiteCPMThresholdSummary(HashMap<URLVariableTypes, Object> urlVars) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);

		String url = "/rest-api/sites/" + siteId + "/cpm-thresholds.do";

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void setSiteCPMThresholds(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/sites/" + siteId + "/cpm-thresholds.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void deleteSiteCPMThreshold(HashMap<URLVariableTypes, Object> urlVars) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);

		String url = "/rest-api/sites/" + siteId + "/cpm–thresholds/delete.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}
	
	public void enableSiteRules(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/rules/site/" + siteId + "/enable.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void disableSiteRules(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/rules/site/" + siteId + "/disable.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void addNewSiteRuleGroup(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/rules/site/" + siteId + "/add.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void removeNewSiteRuleGroup(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/rules/site/" + siteId + "/remove.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void returnSiteRuleGroups(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/rules/site/" + siteId + "/get.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void enableTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targetings.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}



	public void getSiteTargetings(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String sideId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + sideId + "/targetings.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getSiteTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String sideId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String targetingId = (String) urlVars.get(URLVariableTypes.TARGET_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + sideId + "/targeting/" + targetingId + ".do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void getSiteTargetingTypes(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String sideId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + sideId + "/targeting/types.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setMobileCarrierTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/mobilecarrier/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getMobileCarriersForMobileCarrierTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/mobilecarriers/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void setBrowserTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/browser/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getBrowsersForBrowserTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/browsers/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getFirefoxBrowserVersionsForBrowserTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/browsers/firefox/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void getChromeBrowserVersionsForBrowserTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/browsers/chrome/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void getSafariBrowserVersionsForBrowserTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/browsers/safari/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void getIEBrowserVersionsForBrowserTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/browsers/ie/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setOSTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/os/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getOperatingSystemsForOSTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/os/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getOSVersionsForOSTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String osName = (String) urlVars.get(URLVariableTypes.OS_NAME);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/os/" + osName + "/versions.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setDeviceTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/deviceformat/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getDeviceFormatsForDeviceFormatTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/device/format/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getDeviceVendorTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/devicevendor/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void getDeviceVendorsForDeviceVendorTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/device/vendor/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setScreenResolutionTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/resolution/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getResolutionsForScreenResolutionTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/resolution/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void setLocationTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/location/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void setCountryTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/country/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getRegionsForCountryTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/country/region/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getCitiesForCountryRegion(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/country/region/city/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setLanguageTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/language/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void getLanguagesForLanguageTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/language/values.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void setCookieTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/cookie/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void setDomainTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/domain/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setChannelTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/channel/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setWiFiTrafficTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/wifi/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setDayOfWeekTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/dayofweek/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setCustomParameterTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/custom/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setIPTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/iprange/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void setTimeRangeTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/timerange/create.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void removeTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String targetId = (String) urlVars.get(URLVariableTypes.TARGET_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/site/" + siteId + "/targeting/" + targetId + "/delete.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("DELETE");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void disableTargeting(HashMap<URLVariableTypes, Object> urlVars, HashMap<POSTParamTypes, Object> params) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api//site/" + siteId + "/targeting/disable.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void enablePiggyback(HashMap<POSTParamTypes, Object> params) {

		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/piggyback/site/enable.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}


	public void disablePiggyback(HashMap<POSTParamTypes, Object> params) {

		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/piggyback/site/disable.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void savePiggyback(HashMap<POSTParamTypes, Object> params) {

		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/piggyback/site/disable.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

	public void getPiggyback(HashMap<GETParamTypes, Object> params) {
		
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/piggyback/get.do" + urlParameters;

		HttpURLConnection con = null;

		try {
			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String output;
			System.out.print(Thread.currentThread().getStackTrace()[1].getMethodName());
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}

}