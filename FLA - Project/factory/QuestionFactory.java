package factory;


import model.Question;
import repository.QuestionRepo;

public class QuestionFactory {

	public QuestionFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Question createNewQuestion(String title, String answer) {
		int id= QuestionRepo.getInstance().getAll().size() +1;
		
		Question question = new Question(id,title,answer);

		return question;
	}

}
