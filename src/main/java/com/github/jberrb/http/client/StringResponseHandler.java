package com.github.jberrb.http.client;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

public class StringResponseHandler implements ResponseHandler<String> {

//	public String handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
      int status = response.getStatusLine().getStatusCode();
      if (status >= 200 && status < 300) {
          HttpEntity entity = response.getEntity();
          return entity != null ? EntityUtils.toString(entity) : null;
      } else {
          throw new ClientProtocolException("Unexpected response status: " + status);
      }
  }

}
