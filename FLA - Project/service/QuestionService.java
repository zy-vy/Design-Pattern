package service;

import java.util.List;

import factory.QuestionFactory;
import model.Form;
import model.Question;
import repository.FormRepo;
import repository.QuestionRepo;

public class QuestionService implements IQuestionService{
	
	QuestionFactory factory;
	QuestionRepo questionRepo;
	FormRepo formRepo;

	public QuestionService() {
		// TODO Auto-generated constructor stub
		factory = new QuestionFactory();
		questionRepo = QuestionRepo.getInstance();
		formRepo = FormRepo.getInstance();
	}

	@Override
	public Question addQuestion(String title, String answer) {
		// TODO Auto-generated method stub
		Question question = factory.createNewQuestion(title, answer);
		questionRepo.addQuestion(question);
		return question;
	}
	
	@Override
	public List<Question> getAllQuestions() {
		
		return questionRepo.getAll();
	}
	
	@Override
	public List<Form> getAllForms () {
		
		return formRepo.getAll();
	}
	
	@Override
	public Question getQuestionbyId (int id) {
		return questionRepo.getQuestionById(id);
	}
	
	@Override
	public void addForm(Form form) {
		formRepo.addForm(form);
	}
	
	

}
 