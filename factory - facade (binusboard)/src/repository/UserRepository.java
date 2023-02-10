package repository;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserRepository {
	
	private List<User> listUser;
	
	private static UserRepository instance; 

	private UserRepository() {
		this.listUser = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	public synchronized static UserRepository getInstance() {
		if (instance == null) {
			instance = new UserRepository();
		}
		return instance;
	}

	public List<User> getListUser() {
		return listUser;
	}

	public void add(User user) {
		this.listUser.add(user);
	}
	
	

}
