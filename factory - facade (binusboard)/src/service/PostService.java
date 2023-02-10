package service;

import java.util.List;

import binusboard.AppsConfig;
import factory.GoldFactory;
import factory.IFactory;
import factory.StandardFactory;
import factory.VipFactory;
import model.Post;
import model.Theme;
import model.User;
import provider.IThemeProvider;
import provider.ThemeProvider;
import repository.PostRepository;

public class PostService implements IPostService{
	
	private IFactory factory;
	private IThemeProvider themeProvider;
	private PostRepository postRepository;
	private AppsConfig config;

	public PostService() {
		// TODO Auto-generated constructor stub
		this.themeProvider = new ThemeProvider();
	}

	@Override
	public String createPost(String title, String content, String themeName, String picture, User user) {
		// TODO Auto-generated method stub
		factory = getFactoryType(user);
		
		config = new AppsConfig();
	
		int maxLength = config.getContentLength(user);
		
		if (content.length()>maxLength) {
			return "Content length exceeding "+ String.valueOf(maxLength)+" characters";
		}
		if (title.length()>100) {
			return "Title length exceeding 100 character";
		}
		
		Theme theme = themeProvider.getTheme(themeName, user);
		if (theme == null) {
			return "Theme not available for current user type!!!";
		}
		
		Post post = factory.createPost(title, content, theme, picture, user);
		
		postRepository = PostRepository.getInstance();
		
		postRepository.addPost(post);
		
		return "Success creating post with title : "+ post.getTitle();
		
	}

	@Override
	public List<Theme> getAllTheme() {
		// TODO Auto-generated method stub
		return themeProvider.getListTheme();
	}
	
	

	@Override
	public void printAllPost() {
		// TODO Auto-generated method stub
		postRepository = PostRepository.getInstance();
		List<Post> listPost = postRepository.getListPost();
		System.out.println("============ List Post ==============");
		listPost.forEach((post)->{
			post.print();
			System.out.println("--------------------------------------");
		});
		System.out.println();
	}
	

	@Override
	public List<Post> getPostByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> findPostByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	private IFactory getFactoryType(User user) {
		switch (user.getType()) {
		case "Standard":
			return new StandardFactory();
		case "Gold":
			return new GoldFactory();
		case "VIP" :
			return new VipFactory();
		default:
			return null;
		}
	}

	@Override
	public List<Theme> getAvailableTheme(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getMaxLength(User u) {
		// TODO Auto-generated method stub
		config = new AppsConfig();
		return config.getContentLength(u);
	}
	
}
