package factory;

import model.GoldPost;
import model.GoldUser;
import model.Post;
import model.Theme;
import model.User;

public class GoldFactory implements IFactory{

	public GoldFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GoldUser createUser(String name) {
		// TODO Auto-generated method stub
		return new GoldUser(name);
	}
	
	@Override
	public Post createPost(String title, String content, Theme theme, String picture, User user) {
		return new GoldPost(title, content, theme, picture, user);
	}

}
