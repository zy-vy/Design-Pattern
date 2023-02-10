package model;

import java.util.Random;

public class User {
	
	private String id;
	private String name;
	private String type;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name) {
		setId();
		this.name = name;
		this.type = "Standard";
	}

	public String getId() {
		return id;
	}

	public void setId() {
		this.id = "user";
		Random rand = new Random();
		for (int i = 0; i < 3; i++) {
			this.id += rand.nextInt(9);
		}
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
