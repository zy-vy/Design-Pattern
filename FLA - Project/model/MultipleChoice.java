package model;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoice implements Section {
	
	String title;
	
	List<Question> questions ;

	public MultipleChoice() {
		// TODO Auto-generated constructor stub
		this.questions = new ArrayList<>();
	}

	
	public MultipleChoice(String title, List<Question> questions) {
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
	public Section setQuestion(List<Question> questions) {
		// TODO Auto-generated method stub
		this.questions= questions;
		return this;
	}

	@Override
	public void printTitle() {
		// TODO Auto-generated method stub
		System.out.println("Multiple Choice : "+ title);
	}
	
	@Override 
	public Section setTitle (String title ) {
		this.title = title;
		
		return this;
	}

}
