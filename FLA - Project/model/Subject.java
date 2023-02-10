package model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	String name;
	
	List<Question> litQuestions;

	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(String name) {
		super();
		this.name = name;
		this.litQuestions = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Question> getLitQuestions() {
		return litQuestions;
	}

	public void setLitQuestions(List<Question> litQuestions) {
		this.litQuestions = litQuestions;
	}
	
	

}
