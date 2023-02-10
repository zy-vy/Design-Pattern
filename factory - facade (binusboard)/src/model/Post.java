package model;

public class Post {
	
	private String title;
	private String content;
	private Theme theme;
	private String picture;
	private User user;

	public Post(String title, String content, Theme theme, String picture, User user) {
		this.title = title;
		this.content = content;
		this.theme = theme;
		this.picture = picture;
		this.user = user;
	}

	public Post() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Theme getTheme() {
		return theme;
	}

	public String getPicture() {
		return picture;
	}

	public User getUser() {
		return user;
	}
	
	public void print() {
		System.out.println("Title 	: "+this.getTitle());
		System.out.println("Content : "+this.getContent());
		System.out.println("Theme	: "+this.getTheme().getName());
		System.out.println("Picture : "+this.getPicture());
		System.out.println("Post by : "+this.getUser().getName());
	}
}
