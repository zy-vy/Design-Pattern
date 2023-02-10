import java.util.List;
import java.util.Scanner;

import factory.QuestionFactory;
import model.Form;
import model.Question;
import repository.FormRepo;
import repository.QuestionRepo;
import service.IQuestionService;
import service.QuestionService;

public class Menu {

	Scanner sc = new Scanner(System.in);
	QuestionFactory questionFactory;
	IQuestionService service;
	
	public Menu() {
		// TODO Auto-generated constructor stub
		questionFactory = new QuestionFactory();
		service = new QuestionService();
		
		boolean isRunning = true;
		
		while (isRunning) {
			isRunning = mainMenu();
		}
	}
	
	public boolean mainMenu() {
		int input =0;
		System.out.println("========================");
		System.out.println("Welcome to Form Builder");
		System.out.println("nim : 2301954141-Jifi");
		System.out.println("========================");
		System.out.println("1. add new question");
		System.out.println("2. display all question");
		System.out.println("3. display form");
		System.out.println("4. create new form");
		System.out.println("input number [1-4]");
		System.out.println("(input other number to exit)");
		System.out.print(">> ");
		input = sc.nextInt();
		sc.nextLine();
		
		switch (input) {
		case 1:
			addQuestion();
			break;
		case 2: 
			displayQuestion();
			break;
		case 3:
			displayForm();
			
			break;			
		case 4: 
			createForm();
			break;
		default:
			return false;
		}
		breakPoint();
		return true;
	}
	
	private void addQuestion() {
		String question="",answer="";
		System.out.println("Add new Question ");
		System.out.println("=====================");
		System.out.println("please input your question and answer(optional)");
		System.out.println("question : ");
		System.out.print(">>");
		question = sc.nextLine();
		System.out.println("answer (optional) :");
		System.out.print(">>");
		answer = sc.nextLine();
		
		Question q= service.addQuestion(question, answer);
		System.out.println("success create question "+q.toString());
	}
	
	private void displayQuestion() {
		List<Question> listQuestions = service.getAllQuestions();
		System.out.println("******************************");
		System.out.println("all question");
		System.out.println("******************************");
		if (listQuestions.isEmpty()) System.out.println("no question has been created...");
		int count =1;
		for (Question question : listQuestions) {
			System.out.println("question "+count++);
			question.print();
		}
		System.out.println("");
	}
	
	private void createForm() {
		new MenuFormBuilder();
	}
	
	private void displayForm() {
		List<Form> listForm= service.getAllForms();
		System.out.println("==============================");
		System.out.println("all form");
		System.out.println("==============================");
		if (listForm.isEmpty()) System.out.println("no form has been created...");
		int count =1;
		for (Form form : listForm) {
			System.out.println("form "+count++);
			form.displayForm();
			System.out.println();
		}
		System.out.println("");
	}
	
	private void breakPoint() {
		System.out.println("press enter to continue...");
		sc.nextLine();
	}

}
