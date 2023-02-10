package binusboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import factory.GoldFactory;
import factory.IFactory;
import factory.StandardFactory;
import factory.VipFactory;
import model.Theme;
import model.User;
import provider.IThemeProvider;
import provider.ThemeProvider;
import service.IPostService;
import service.IUserService;
import service.PostService;
import service.UserService;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	IUserService userService = new UserService();
	IPostService postService = new PostService();
	
	public Main() {
		// TODO Auto-generated constructor stub
		IFactory factory = new StandardFactory();
		User standar = factory.createUser("standar1");
		List<User> listUser = new ArrayList<>();
		listUser.add(standar);
		standar = factory.createUser("standar2");
		listUser.add(standar);
		factory = new GoldFactory();
		User gold = factory.createUser("gold1");
		listUser.add(gold);
		gold = factory.createUser("gold2");
		listUser.add(gold);
		factory = new VipFactory();
		User vip = factory.createUser("Vip1");
		listUser.add(vip);
		
		
		for (User user : listUser) {
			System.out.println(user.getId());
			System.out.println(user.getName());
		}
		
		IThemeProvider themeProvider = new ThemeProvider();
		Theme theme = themeProvider.getTheme("VIP");
		if (theme!= null) {
			System.out.println(theme.getName());
		}else {
			System.out.println("theme not available");
		}
		
		int input =0;
		while(input != 2) {
			loginMenu();	
			input = sc.nextInt();
			sc.nextLine();
			if (input ==1) {
				User user = loginUser();
								
				do {
					showMenu();
					input = sc.nextInt();
					sc.nextLine();
					if (input ==1) {
						menuAdd(user);
					}
					else if (input ==2) {
						menuView();
					}
				} while (input !=3);
			}
		}
		
		
		
	}
	
	private void loginMenu() {
		System.out.println("1. Login");
		System.out.println("2. Exit");
		System.out.println(">>");
	}
	
	private void showMenu() {
		System.out.println("1. Add Post");
		System.out.println("2. View All Post");
		System.out.println("3. Logout");
		System.out.println(">>");
	}
	
	private User loginUser() {
		int input =1;
		do {
			System.out.println("please select user type");
			System.out.println("1. Standard");
			System.out.println("2. Gold");
			System.out.println("3. VIP");
			System.out.println(">>");
		} while (input<1||input>3);
		
		input = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please input user name:");
		System.out.println(">>");
		
		String name= sc.nextLine();
		
		String[] type = {"Standard","Gold","VIP"};		
		
		User user = userService.createUser(name, type[input-1]);
		return user;
	}
	
	private void menuAdd(User user) {
		int input=1;
		String title,content,picture;
		System.out.println("============================");
		System.out.println("Create new post");
		System.out.println("Current user type: "+user.getType()+", max content length: "+postService.getMaxLength(user));
		System.out.print("Title: ");
		title= sc.nextLine();
		System.out.print("Content: ");
		content = sc.nextLine();
		do {
			System.out.println("Select Theme:");
			System.out.println("1. Serenity");
			System.out.println("2. Party");
			System.out.println("3. Heroes");
			System.out.println("4. Gold");
			System.out.println("5. VIP");
			System.out.println(">>");
			input = sc.nextInt();
			sc.nextLine();
		} while (input<1||input>5);
		System.out.print("Picture: ");
		picture= sc.nextLine();
		
		String[] theme = {"Serenity","Party","Heroes","Gold","VIP"};

		String result = postService.createPost(title, content, theme[input-1], picture, user);
		try {
			System.out.println(result);			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to create Post");
		}
	}
	
	private void menuView() {
		postService.printAllPost();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
