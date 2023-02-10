import java.util.List;
import java.util.Scanner;

import builder.FormBuilder;
import model.Form;
import model.Question;
import service.IQuestionService;
import service.QuestionService;

public class MenuFormBuilder {
	
	Scanner sc = new Scanner(System.in);	
	IQuestionService service;	
	FormBuilder formBuilder;	

	public MenuFormBuilder() {
		// TODO Auto-generated constructor stub
		formBuilder = new FormBuilder();
		service= new QuestionService();
		menuForm();
	}
	
	private void menuForm() {
		String formTitle;
		System.out.println("==================================");
		System.out.println("welcome to form builder");
		System.out.println("here you can build form with section");
		System.out.println("first input your section and then input the question");
		System.out.println("-----------------------");
		System.out.print("input form title: ");
		formTitle = sc.nextLine();
		addForm();
		Form form = formBuilder.buildForm(formTitle);
		service.addForm(form);
	}
	
	private void addForm() {
		int input =0;
		while (input != 2) {
			System.out.println("1. add section ");
			System.out.println("2. finish and save form");
			input = sc.nextInt();
			sc.nextLine();
			
			switch (input) {
			case 1:
				addSection();
				break;
			
			default:
				break;
			}
		}
		return;
	}
	
	private Question addQuestion () {
		
		int input = 0;
		System.out.println("1. select from question repository");
		System.out.println("2. new question");
		System.out.println("3. finish adding question to this section");
		System.out.print(">>");
		input =sc.nextInt();
		sc.nextLine();
		
		Question q = new Question();
		switch (input) {
		case 1:
			q = selectQuestion();
			break;
		case 2:
			q = newQuestion();
			break;
		case 3: 
			q= null;
		default:
			break;
		}
		
		return q;
		
		
	}
	
	private void addSection() {
		String title,type;
		int input=0;
		System.out.println("add section");
		System.out.println("section title : ");
		title = sc.nextLine();
		
		while (!(input == 1 || input == 2)) {
			System.out.println("section type \n1. multiple\n2. essay :");
			input = sc.nextInt();
			sc.nextLine();
		}
		
		if (input ==1 ) type ="multiple";
		else type = "essay";
		
		Question q = new Question();
		while(q != null) {
			q = addQuestion();
			formBuilder.addQuestion(q);
			System.out.println("success add question");
			breakPoint();

		}

		
		formBuilder.buildSection(type, title);
		System.out.println("success add section");
		breakPoint();
		
	}
	
	private Question selectQuestion() {
		
		List<Question> listQuestions = service.getAllQuestions();
		
		for (Question question : listQuestions) {
			System.out.println(question.getId()+ ". "+question.getTitle());
		}
		int input;

		Question q=null;
		while (q==null) {
			System.out.println("select question id you want to add to form");
			System.out.print(">>");
			input = sc.nextInt();
			sc.nextLine();
			q = service.getQuestionbyId(input);
		}
		
		
		
		return q;
	}
	
	private Question newQuestion() {
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
		breakPoint();
		return q;
	}
	
	private void breakPoint() {
		System.out.println("press enter to continue...");
		sc.nextLine();
	}

}
