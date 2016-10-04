package com.metel.api.methods;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import com.metel.api.enums.GETParamTypes;
import com.metel.api.enums.POSTParamTypes;
import com.metel.api.enums.URLVariableTypes;
import com.metel.api.util.Base64;
import com.metel.api.util.ParamManager;

public class Zone {

	String network;
	String username;
	String password;

	public Zone(String network, String username, String password) {
		this.network = network;
		this.username = username;
		this.password = password;
	}

	ParamManager paramManager = new ParamManager();

	public void createZone(HashMap<POSTParamTypes, Object> params) {

		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/zones/update.do";

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

	public void deleteZone(HashMap<URLVariableTypes, Object> urlVars) {

		String zoneId = (String) urlVars.get(URLVariableTypes.ZONE_ID);

		String url = "/rest-api/zones/" + zoneId + "/delete.do";

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

	public void getPlacementsOfZone(HashMap<URLVariableTypes, Object> urlVars) {

		String zoneId = (String) urlVars.get(URLVariableTypes.ZONE_ID);

		String url = "/rest-api/zones/" + zoneId + "/placements.do";

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

	public void enableZoneRules(HashMap<URLVariableTypes, Object> urlVars) {

		String zoneId = (String) urlVars.get(URLVariableTypes.ZONE_ID);

		String url = "/rest-api/rules/zone/" + zoneId + "/enable.do";

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

	public void disableZoneRules(HashMap<URLVariableTypes, Object> urlVars) {

		String zoneId = (String) urlVars.get(URLVariableTypes.ZONE_ID);

		String url = "/rest-api/rules/zone/" + zoneId + "/disable.do";

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

	public void addZoneRuleGroup(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String zoneId = (String) urlVars.get(URLVariableTypes.ZONE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/rules/zone/" + zoneId + "/add.do" + urlParameters;

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

	public void deleteZoneRuleGroup(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String zoneId = (String) urlVars.get(URLVariableTypes.ZONE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/rules/zone/" + zoneId + "/remove.do" + urlParameters;

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

	public void getAllZoneRuleGroups(HashMap<URLVariableTypes, Object> urlVars, HashMap<GETParamTypes, Object> params) {

		String zoneId = (String) urlVars.get(URLVariableTypes.ZONE_ID);
		String urlParameters = paramManager.getGETParams(params);

		String url = "/rest-api/rules/zone/" + zoneId + "/get.do" + urlParameters;

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