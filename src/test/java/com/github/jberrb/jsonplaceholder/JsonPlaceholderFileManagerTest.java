package com.github.jberrb.jsonplaceholder;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class JsonPlaceholderFileManagerTest {
		
	JsonPlaceholderFileManager jsonFileManager = new JsonPlaceholderFileManager();
	JsonPlaceholderDataProvider dataProvider = new JsonPlaceholderDataProvider();
		
	// Tests
	
	@Test
	public void readPostJsonFile_Test() {
		Post expectedPost = dataProvider.getPost(1);	
		Post actualPost = jsonFileManager.readPostJsonFile(JsonPlaceholderDataProvider.POST1_FILEPATH);
		
		assertEquals(actualPost, expectedPost, "File not correctly read");
	}
	
	@Test
	public void readJsonFile_Test() {
		Post expectedPost = dataProvider.getPost(1);
		Post actualPost = jsonFileManager.readJsonFile(JsonPlaceholderDataProvider.POST1_FILEPATH, Post.class);
		
		assertEquals(actualPost, expectedPost, "File not correctly read");
	}
	
	@Test
	public void readPostsJsonFile_Test() {
		Post[] expectedPosts = new Post[10];
		for (int i=0; i<10; i++) {
			expectedPosts[i] = dataProvider.getPost(i+1);
		}
		Post[] actualPosts = jsonFileManager.readPostsJsonFile(JsonPlaceholderDataProvider.USER1_POSTS_FILEPATH);
		
		assertEquals(actualPosts, expectedPosts, "File not correctly read");
	}
	
	@Test
	public void readCommentJsonFile_Test() {
		Comment expectedComment = dataProvider.getComment(1);
		Comment actualComment = jsonFileManager.readJsonFile(JsonPlaceholderDataProvider.COMMENT1_FILEPATH, Comment.class);
		
		assertEquals(actualComment, expectedComment, "File not correctly read");
	}
	
	@Test
	public void readCommentsJsonFile_Test() {
		Comment[] expectedComments = new Comment[5];
		for (int i=0; i<5; i++) {
			expectedComments[i] = dataProvider.getComment(i+1);
		}
		Comment[] actualComments = jsonFileManager.readCommentsJsonFile(JsonPlaceholderDataProvider.POST1_COMMENTS_FILEPATH);
		
		assertEquals(actualComments, expectedComments, "File not correctly read");
	}
	
	@Test
	public void readCommentListJsonFile_Test() {
		List<Comment> expectedCommentList = new ArrayList<Comment>();
		for (int i=0; i<5; i++) {
			expectedCommentList.add(dataProvider.getComment(i+1));
		}
		List<Comment> actualCommentList = jsonFileManager.readCommentListJsonFile(JsonPlaceholderDataProvider.POST1_COMMENTS_FILEPATH);
		
		assertEquals(actualCommentList, expectedCommentList);
	}
}
