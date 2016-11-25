package com.github.jberrb.jsonplaceholder;

public class JsonPlaceholderDataProvider {
	
	final static String JSONPLACEHOLDER_FILEPATH = "src/test/resources/jsonplaceholder";

	final static String POST1_FILEPATH = JSONPLACEHOLDER_FILEPATH + "/Post1.json";
	final static String POST1_BODY = "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto";
	final static String USER1_POSTS_FILEPATH = JSONPLACEHOLDER_FILEPATH + "/User1Posts.json";
	final static String ALLPOSTS_FILEPATH = JSONPLACEHOLDER_FILEPATH + "/AllPosts.json";
	
	final static String COMMENT1_FILEPATH = JSONPLACEHOLDER_FILEPATH + "/Comment1.json";
	final static String POST1_COMMENTS_FILEPATH = JSONPLACEHOLDER_FILEPATH + "/Post1Comments.json";
	final static String ALLCOMMENTS_FILEPATH = JSONPLACEHOLDER_FILEPATH + "/AllComments.json";
	
	public Post getPost(int postId) {
		Post post = null;
		switch(postId) {
			case 1: post = new Post(1,1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit", POST1_BODY);
					break;
			case 2: post = new Post(1,2,"qui est esse","est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla");
					break;
			case 3: post = new Post(1,3,"ea molestias quasi exercitationem repellat qui ipsa sit aut","et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut");
					break;
			case 4: post = new Post(1,4,"eum et est occaecati","ullam et saepe reiciendis voluptatem adipisci\nsit amet autem assumenda provident rerum culpa\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\nquis sunt voluptatem rerum illo velit");
					break;
			case 5: post = new Post(1,5,"nesciunt quas odio","repudiandae veniam quaerat sunt sed\nalias aut fugiat sit autem sed est\nvoluptatem omnis possimus esse voluptatibus quis\nest aut tenetur dolor neque");
					break;
			case 6: post = new Post(1,6,"dolorem eum magni eos aperiam quia","ut aspernatur corporis harum nihil quis provident sequi\nmollitia nobis aliquid molestiae\nperspiciatis et ea nemo ab reprehenderit accusantium quas\nvoluptate dolores velit et doloremque molestiae");
					break;
			case 7: post = new Post(1,7,"magnam facilis autem","dolore placeat quibusdam ea quo vitae\nmagni quis enim qui quis quo nemo aut saepe\nquidem repellat excepturi ut quia\nsunt ut sequi eos ea sed quas");
					break;
			case 8: post = new Post(1,8,"dolorem dolore est ipsam","dignissimos aperiam dolorem qui eum\nfacilis quibusdam animi sint suscipit qui sint possimus cum\nquaerat magni maiores excepturi\nipsam ut commodi dolor voluptatum modi aut vitae");
					break;
			case 9: post = new Post(1,9,"nesciunt iure omnis dolorem tempora et accusantium","consectetur animi nesciunt iure dolore\nenim quia ad\nveniam autem ut quam aut nobis\net est aut quod aut provident voluptas autem voluptas");
					break;
			case 10: post = new Post(1,10,"optio molestias id quia eum","quo et expedita modi cum officia vel magni\ndoloribus qui repudiandae\nvero nisi sit\nquos veniam quod sed accusamus veritatis error");
					break;
		}
		
		return post;
	}
	
	public Comment getComment(int commentId) {
		Comment comment = null;
		switch(commentId) {
			case 1: comment = new Comment(1,1,"id labore ex et quam laborum","Eliseo@gardner.biz",
				"laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");
					break;
			case 2: comment = new Comment(1,2,"quo vero reiciendis velit similique earum","Jayne_Kuhic@sydney.com",
					"est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et");
					break;
			case 3: comment = new Comment(1,3,"odio adipisci rerum aut animi","Nikita@garfield.biz",
					"quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione");
					break;
			case 4: comment = new Comment(1,4,"alias odio sit","Lew@alysha.tv",
					"non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati");
					break;
			case 5: comment = new Comment(1,5,"vero eaque aliquid doloribus et culpa","Hayden@althea.biz",
					"harum non quasi et ratione\ntempore iure ex voluptates in ratione\nharum architecto fugit inventore cupiditate\nvoluptates magni quo et");
					break;
		}
		
		return comment;
	}

}
