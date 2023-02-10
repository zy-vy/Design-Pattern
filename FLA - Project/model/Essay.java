package model;

import java.util.List;

public class Essay implements Section {

	String title;
	
	List<Question> questions ;
	
	public Essay() {
		// TODO Auto-generated constructor stub
	}
	
	public Essay(String title, List<Question> questions) {
		this.title = title;
		this.questions = questions;
	}

	@Override
	public void displayQuestion() {
		// TODO Auto-generated method stub
		int count = 1;
		for (Question question : questions) {
			System.out.println(count +". "+question);
			count+=1;
		}
		System.out.println();
	}


	@Override
	public void printTitle() {
		// TODO Auto-generated method stub
		System.out.println("Essay : "+ title);
	}

	@Override
	public Section setQuestion(List<Question> question) {
		// TODO Auto-generated method stub
		this.questions=question;
		return this;
	}

	@Override
	public Section setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
		
		return this;
	}

}
