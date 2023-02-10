package factory;

import model.Post;
import model.Theme;
import model.User;
import model.VipPost;
import model.VipUser;

public class VipFactory implements IFactory{

	public VipFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public VipUser createUser(String name) {
		// TODO Auto-generated method stub
		return new VipUser(name);
	}
	
	@Override
	public Post createPost(String title, String content, Theme theme, String picture, User user) {
		return new VipPost(title, content, theme, picture, user);
	}

}
