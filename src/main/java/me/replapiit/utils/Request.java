// Copied from one of AmazingMech2418's projects called JMail repurposed for this project
package me.replapiit.utils;

// Import required libraries for HTTP requests
import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.io.DataOutputStream;

public class Request {
	
	// Little hack to prevent instantiation of class
	private Request() {}

	/**
	* This method enables GET requests via HTTP
	* 
	* @param   _url   The URL to retrieve from
	* @return         The response from the server
	**/
	public static String GET(String _url) throws Exception {
		
		URL url = new URL(_url);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		InputStream result = connection.getInputStream();
		Scanner s = new Scanner(result);
		s.useDelimiter("\\A");
		
		String res = "";
		
		while (s.hasNext()) {
			res += s.next();
		}

		s.close();
		result.close();
		return res;
	}

	/**
	* This method enables DELETE requests via HTTP
	* 
	* @param   _url   The URL to send request to 
	* @return         The response from the server
	**/
	public static String DELETE(String _url) throws Exception {

		URL url = new URL(_url);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");

		InputStream result = connection.getInputStream();
		Scanner s = new Scanner(result);
		s.useDelimiter("\\A");

		String res = "";
		while (s.hasNext()) {
			res += s.next();
		}

		s.close();
		result.close();
		return res;
	}

    /**
	* This method enables POST requests via HTTP
	* 
	* @param   _url   The URL to send request to 
	* @return         The response from the server
	**/
	public static String POST(String _url, String params) throws Exception {
		
		byte[] postData = params.getBytes(StandardCharsets.UTF_8);
		int postDataLength = postData.length;

		URL url = new URL(_url);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		connection.setRequestMethod("POST");

        // Set headers
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("Accept", "application/json");
		connection.setRequestProperty("Connection", "keep-alive");
		connection.setRequestProperty("X-Requested-With", "The ReplAPI.it Project (Java)");
		connection.setRequestProperty("Referrer", "https://replit.com/");
		connection.setRequestProperty("Origin", "https://replit.com");
		connection.setRequestProperty("charset", "utf-8");
		connection.setRequestProperty("Content-Length", Integer.toString(postDataLength));

        
		
		connection.setUseCaches(false);

		try {
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.write(postData);
		} catch (Error e) {
			System.out.println("POST failed");
			// Do nothing
		}

		InputStream result = connection.getInputStream();
		Scanner s = new Scanner(result);
		s.useDelimiter("\\A");

		String res = "";
		while (s.hasNext()) {
			res += s.next();
		}

		s.close();
		result.close();

		return res;
	}
}