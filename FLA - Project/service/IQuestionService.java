package service;

import java.util.List;

import model.Form;
import model.Question;

public interface IQuestionService {

	Question addQuestion(String title, String answer);

	List<Question> getAllQuestions();

	List<Form> getAllForms();

	Question getQuestionbyId(int id);

	void addForm(Form form);
	
	
}
