package repository;

import java.util.ArrayList;
import java.util.List;

import model.Post;

public class PostRepository {
	
	private List<Post> listPost;
	
	private static PostRepository instance;

	private PostRepository() {
		// TODO Auto-generated constructor stub
		listPost = new ArrayList<>();
	}
	
	public static PostRepository getInstance () {
		if (instance == null) {
			instance = new PostRepository();
		}
		return instance;
	}

	public List<Post> getListPost() {
		return listPost;
	}

	public void addPost(Post post) {
		this.listPost.add(post);
	}
	
	

	
}
