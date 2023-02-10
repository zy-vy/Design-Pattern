package factory;

import model.Post;
import model.Theme;
import model.User;

public class StandardFactory implements IFactory {

	public StandardFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User createUser(String name) {
		// TODO Auto-generated method stub
		return new User(name);
	}
	
	@Override
	public Post createPost(String title, String content, Theme theme, String picture, User user) {
		return new Post(title, content, theme, picture, user);
	}

}
