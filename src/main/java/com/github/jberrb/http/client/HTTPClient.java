package com.github.jberrb.http.client;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import ch.qos.logback.classic.Logger;

public class HTTPClient {
	
	private static final int INITIAL_ARRAY_LENGTH = 100;
	protected static final Logger LOGGER = (Logger) LoggerFactory.getLogger(HTTPClient.class);
	
	protected CloseableHttpClient httpclient;
	protected URL baseUrl;
	
	protected HTTPClient(String baseUrl) throws MalformedURLException {
		
		this.baseUrl = new URL(baseUrl);
		this.httpclient = HttpClients.createDefault();
	}
		
	public String getStringResponse(String path) {
		
		String responseBody = null;
		HttpGet httpget = new HttpGet(baseUrl + path);
		LOGGER.debug("Executing request " + httpget.getRequestLine());
		ResponseHandler<String> strResponseHanlder = new StringResponseHandler();
		try {
			responseBody = httpclient.execute(httpget, strResponseHanlder);
		} catch (ClientProtocolException e) {
			LOGGER.error("Protocol problem", e);
		} catch (IOException e) {
			LOGGER.error("IO Exception", e);
		}
		LOGGER.trace("Response \n {}", responseBody);
		
		return responseBody;
	}
	
	public <T> T getJsonObj(String path, Class<T> className) {
		Gson gson = new Gson();
		String objStr = getStringResponse(path);
		T object = gson.fromJson(objStr, className);
		
		return object;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T[] getJsonArray(String path, Class<T> className) {
		
		Gson gson = new Gson();
		String objStr = getStringResponse(path);
		
		T[] objArray = (T[]) Array.newInstance(className, INITIAL_ARRAY_LENGTH);
		objArray = (T[]) gson.fromJson(objStr, objArray.getClass());
		
		return objArray;
	}
	
//	public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
//  int status = response.getStatusLine().getStatusCode();
//  if (status >= 200 && status < 300) {
//      HttpEntity entity = response.getEntity();
//      return entity != null ? EntityUtils.toString(entity) : null;
//  } else {
//      throw new ClientProtocolException("Unexpected response status: " + status);
//  }
//}
}
