package factory;

import model.Post;
import model.Theme;
import model.User;

public interface IFactory {

	User createUser(String name);
	
	Post createPost(String title, String content, Theme theme, String picture, User user);
}
