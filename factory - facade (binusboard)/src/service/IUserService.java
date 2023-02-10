package service;

import java.util.List;

import model.User;

public interface IUserService {
	
	User createUser(String name,String type);
	
	User getUser(String id);
	
	List<User> getAllUser ();

}
