package service;

import java.util.List;

import model.Post;
import model.Theme;
import model.User;

public interface IPostService {
	
	String createPost(String title, String content, String theme, String picture, User user);
	
	List<Theme> getAllTheme();
	
	List<Theme> getAvailableTheme(User u);
	
	Integer getMaxLength(User u);
	
	void printAllPost();
	
	List<Post> getPostByUser(User user);
	
	List<Post> findPostByTitle(String title);
	
	Post findPost(Post post);
	
}
