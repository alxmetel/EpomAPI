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

public class Publisher2 {
	
	String network;
	String username;
	String password;

	public Publisher2(String network, String username, String password) {
		this.network = network;
		this.username = username;
		this.password = password;
	}
	
	ParamManager paramManager = new ParamManager();
	
	
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
	
	public void setSiteCPMThresholds(HashMap<URLVariableTypes, Object> urlVars, String json) {

		String siteId = (String) urlVars.get(URLVariableTypes.SITE_ID);
//		String urlParameters = paramManager.getPOSTParams(params);

		String url = "/rest-api/sites/" + siteId + "/cpm-thresholds.do";

		HttpURLConnection con = null;

		try {

			URL fullURL = new URL(network + url);
			con = (HttpURLConnection) fullURL.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.base64Encode(username + ":" + password));

			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(json);
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
