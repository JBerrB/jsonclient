package com.github.jberrb.jsonplaceholder;

import java.net.MalformedURLException;

import com.github.jberrb.http.client.HTTPClient;

public class JsonPlaceholderClient extends HTTPClient {
	
	private static final String URL = "http://jsonplaceholder.typicode.com";
	
	public JsonPlaceholderClient() throws MalformedURLException {
		super(URL);
	}
		
	public Post getPost(int id) {				
		return super.getJsonObj("/posts/" + id, Post.class);
	}
	
	public Post[] getPosts() {
		return super.getJsonArray("/posts/", Post.class);
	}

	public Comment getComment(int id) {
		return super.getJsonObj("/comments/" + id, Comment.class);
	}
	
	public Comment[] getComments(int postId) {
		return super.getJsonArray("/posts/" + postId + "/comments", Comment.class);
	}

	public Comment[] getComments() {
		return super.getJsonArray("/comments", Comment.class);
	}
}
