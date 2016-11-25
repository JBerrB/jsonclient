package com.github.jberrb.jsonplaceholder;

import java.util.List;

import com.github.jberr.file.json.JsonFileManager;

public class JsonPlaceholderFileManager extends JsonFileManager {
	
	public Post readPostJsonFile(String fileName) {
		return super.readJsonFile(fileName, Post.class);
	}
	
	public Post[] readPostsJsonFile(String fileName) {
		return super.readJsonFileArray(fileName, Post.class);
	}
	
	public Comment readCommentJsonFile(String fileName) {
		return super.readJsonFile(fileName, Comment.class);
	}
	
	public Comment[] readCommentsJsonFile(String fileName) {
		return super.readJsonFileArray(fileName, Comment.class);
	}
	
	public List<Comment> readCommentListJsonFile(String fileName) {
		return super.readListJsonFile(fileName, Comment.class);
	}
}
