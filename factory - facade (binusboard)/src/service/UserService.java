package service;

import java.util.List;

import factory.GoldFactory;
import factory.IFactory;
import factory.StandardFactory;
import factory.VipFactory;
import model.User;
import repository.UserRepository;

public class UserService implements IUserService{

	private IFactory factory;
	private UserRepository userRepository;
	
	public UserService() {
		// TODO Auto-generated constructor stub
		userRepository = UserRepository.getInstance();
	}

	@Override
	public User createUser(String name,String type) {
		// TODO Auto-generated method stub
		factory = getFactoryType(type);
		User user = factory.createUser(name);
		userRepository.add(user);
		return user;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private IFactory getFactoryType(String type) {
		switch (type) {
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

}
