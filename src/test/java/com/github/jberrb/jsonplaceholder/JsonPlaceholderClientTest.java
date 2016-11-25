package com.github.jberrb.jsonplaceholder;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JsonPlaceholderClientTest {
	
	//Test Data
	
	private JsonPlaceholderClient client;
	private JsonPlaceholderFileManager fileManager;
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		client = new JsonPlaceholderClient();
		fileManager = new JsonPlaceholderFileManager();
	}
	
	@Test
	public void getPost_id1_Test() {
		final int postId = 1;
		Post expectedPost = fileManager.readPostJsonFile(JsonPlaceholderDataProvider.POST1_FILEPATH);
		Post actualPost = client.getPost(postId);

		assertEquals(actualPost, expectedPost, "Data mismatch!");
	}
	
	@Test
	public void getAllPosts_Test() {
		Post[] expectedPosts = fileManager.readPostsJsonFile(JsonPlaceholderDataProvider.ALLPOSTS_FILEPATH);
		Post[] actualPosts = client.getPosts();
		
		assertEquals(actualPosts, expectedPosts, "Data mismatch!");
	}
	
	@Test
	public void getComment_id1_Test() {
		final int commentId = 1;
		Comment expectedComment = fileManager.readCommentJsonFile(JsonPlaceholderDataProvider.COMMENT1_FILEPATH);
		Comment actualComment = client.getComment(commentId);
		
		assertEquals(actualComment, expectedComment, "Data mismatch!");
	}
	
	@Test
	public void getAllComments_Test() {
		Comment[] expectedComments = fileManager.readCommentsJsonFile(JsonPlaceholderDataProvider.ALLCOMMENTS_FILEPATH);
		Comment[] actualComments = client.getComments();
		
		assertEquals(actualComments, expectedComments, "Data mismatch!");
	}
	
	@Test
	public void getComments_Post1_Test() {
		final int postId = 1;
		Comment[] expectedComments = fileManager.readCommentsJsonFile(JsonPlaceholderDataProvider.POST1_COMMENTS_FILEPATH);
		Comment[] actualComments = client.getComments(postId);
		
		assertEquals(actualComments, expectedComments, "Data mismatch!");
	}
}
