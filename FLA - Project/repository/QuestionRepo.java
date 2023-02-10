package repository;

import java.util.ArrayList;
import java.util.List;

import model.Question;

public class QuestionRepo {
	
	List<Question> questions;
	
	static QuestionRepo instance; 

	private QuestionRepo() {
		// TODO Auto-generated constructor stub
		this.questions = new ArrayList<>();
	}
	
	public static QuestionRepo getInstance () {
		
		if (instance == null) {
			instance = new QuestionRepo();
		}
		return instance;
	}
	
	public void addQuestion(Question question) {
		this.questions.add(question);
	}
	
	public Question getQuestion (String title) {
		for (Question question : questions) {
			if(question.getTitle().equalsIgnoreCase(title)) {
				return question;
			}
		}
		return null;
	}
	
	public Question getQuestionById (int  id) {
		for (Question question : questions) {
			if(question.getId() == id) {
				return question;
			}
		}
		return null;
	}

	public List<Question> getAll () {
		return this.questions;
	}
	

}
