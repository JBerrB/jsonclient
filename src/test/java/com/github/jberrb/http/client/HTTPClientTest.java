package com.github.jberrb.http.client;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.github.jberrb.http.client.HTTPClient;

public class HTTPClientTest {
	
	private final static String POST1_RESPONSE_STR = "{\n  \"userId\": 1,\n  \"id\": 1,\n  \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n}";

	@Test
	public void getStringResponse_posts1_Test() throws MalformedURLException {
		HTTPClient client = new HTTPClient("http://jsonplaceholder.typicode.com");
		final String expectedResponseStr = POST1_RESPONSE_STR;
		String actualResponseStr = client.getStringResponse("/posts/1");
		
		assertEquals(actualResponseStr, expectedResponseStr, "Data mismatch!");
	}
}
